package org.apache.spark.streaming;
// no position
/**
 * StreamingContext object contains a number of utility functions related to the
 * StreamingContext class.
 */
public  class StreamingContext$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingContext$ MODULE$ = null;
  public   StreamingContext$ () { throw new RuntimeException(); }
  public  int DEFAULT_CLEANER_TTL () { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.dstream.PairDStreamFunctions<K, V> toPairDStreamFunctions (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> stream, scala.reflect.ClassTag<K> kt, scala.reflect.ClassTag<V> vt, scala.math.Ordering<K> ord) { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the StreamingContext
   * will be created by called the provided <code>creatingFunc</code>.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param creatingFunc   Function to create a new StreamingContext
   * @param hadoopConf     Optional Hadoop configuration if necessary for reading from the
   *                       file system
   * @param createOnError  Optional, whether to create a new StreamingContext if there is an
   *                       error in reading checkpoint data. By default, an exception will be
   *                       thrown on error.
   */
  public  org.apache.spark.streaming.StreamingContext getOrCreate (java.lang.String checkpointPath, scala.Function0<org.apache.spark.streaming.StreamingContext> creatingFunc, org.apache.hadoop.conf.Configuration hadoopConf, boolean createOnError) { throw new RuntimeException(); }
  /**
   * Find the JAR from which a given class was loaded, to make it easy for users to pass
   * their JARs to StreamingContext.
   */
  public  scala.Option<java.lang.String> jarOfClass (java.lang.Class<?> cls) { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext createNewSparkContext (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext createNewSparkContext (java.lang.String master, java.lang.String appName, java.lang.String sparkHome, scala.collection.Seq<java.lang.String> jars, scala.collection.Map<java.lang.String, java.lang.String> environment) { throw new RuntimeException(); }
  public <T extends java.lang.Object> java.lang.String rddToFileName (java.lang.String prefix, java.lang.String suffix, org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
}
