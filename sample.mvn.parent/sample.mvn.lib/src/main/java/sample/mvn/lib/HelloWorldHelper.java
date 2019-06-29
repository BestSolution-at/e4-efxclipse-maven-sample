package sample.mvn.lib;

public class HelloWorldHelper {


    public static void helloWorld() {
//        org.apache.spark.util.Clock clock = new ManualClock();
////        SparkConf conf = new SparkConf().setMaster("local").setAppName("wordCount");
////        JavaSparkContext sc = new JavaSparkContext(conf);
//        SparkSession spark = SparkSession.builder()
//                .config("spark.ui.enabled", false)
//                .appName("theApp")
//                .master("local")
//                .getOrCreate();
//        JavaSparkContext sc = new JavaSparkContext(spark.sparkContext());
//        List<Integer> collection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        JavaRDD<Integer> rdd = sc.parallelize(collection, 2);
//        System.out.println("Number of partitions : " + rdd.getNumPartitions());
        System.out.println("Number of partitions : ");
    }
}
