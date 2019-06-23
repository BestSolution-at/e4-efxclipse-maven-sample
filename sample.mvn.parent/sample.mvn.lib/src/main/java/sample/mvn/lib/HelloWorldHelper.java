package sample.mvn.lib;

import org.apache.spark.util.ManualClock;
import org.osgeo.proj4j.ProjCoordinate;

public class HelloWorldHelper {
    public static void helloWorld() {
        org.apache.spark.util.Clock clock = new ManualClock();

//        SparkSession spark = SparkSession.builder().appName("theApp").master("local").getOrCreate();
//        JavaSparkContext sc = new JavaSparkContext(spark.sparkContext());
//        List<Integer> collection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        JavaRDD<Integer> rdd = sc.parallelize(collection, 2);
//        System.out.println("Number of partitions : " + rdd.getNumPartitions());

        org.osgeo.proj4j.ProjCoordinate coord = new ProjCoordinate();
        coord.setValue(19, 20);
        System.err.println("Hello World from Helper!!   " + " " + coord + " " + clock.getTimeMillis());
    }
}
