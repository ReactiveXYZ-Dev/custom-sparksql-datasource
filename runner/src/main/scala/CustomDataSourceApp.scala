package xyz.reactive.spark.sql.runner
  
import org.apache.spark.SparkConf
import org.apache.spark.sql.{SaveMode, SparkSession}

object CustomDataSourceApp extends App {

  val conf = new SparkConf().setAppName("spark-custom-datasource")
  val spark = SparkSession.builder().config(conf).master("local").getOrCreate()

  val dataDir = "file:///Users/Jackie/Projects/Scala-Projects/custom-sparksql-datasource/test-data/"

  val dataSourceFormat = "xyz.reactive.spark.sql.dummydatasource"
  val df = spark.read.format(dataSourceFormat).load(dataDir)

  // Step 1 (Schema verification)
  df.printSchema()
  // Step 2 (Read data)
  df.show()
  // Step 3 (Write data)
  df.write
    .options(Map("format" -> "customFormat"))
    .mode(SaveMode.Overwrite)
    .format(dataSourceFormat)
    .save("out/")
  // Step 4 (Column Pruning)
  df.createOrReplaceTempView("salaries")
  spark.sql("SELECT surname, salary FROM salaries").show()
  // Step 5 (Filter Pushdown)
  spark.sql("SELECT name, surname FROM salaries WHERE salary > 40000").show()

}