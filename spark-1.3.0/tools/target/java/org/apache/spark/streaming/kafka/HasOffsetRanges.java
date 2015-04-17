package org.apache.spark.streaming.kafka;
/**
 * :: Experimental ::
 * Represents any object that has a collection of {@link OffsetRange}s. This can be used access the
 * offset ranges in RDDs generated by the direct Kafka DStream (see
 * {@link KafkaUtils.createDirectStream()}).
 * <pre><code>
 *   KafkaUtils.createDirectStream(...).foreachRDD { rdd =&gt;
 *      val offsetRanges = rdd.asInstanceOf[HasOffsetRanges].offsetRanges
 *      ...
 *   }
 * </code></pre>
 */
public  interface HasOffsetRanges {
  public  org.apache.spark.streaming.kafka.OffsetRange[] offsetRanges () ;
}
