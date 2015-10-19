package kafkademon;

public interface KafkaProperties {
	final static String zkConnect            = "10.77.96.122:2181";
	final static String groupId              = "group1";
	final static String topic                = "topic1";
	final static String kafkaServerURL       = "10.77.96.122";
	final static int kafkaServerPort         = 9092;
	final static int kafkaProducerBufferSize = 64*1024;
	final static int connectionTimeOut       = 20000;
	final static int reconnectionInterval    = 10000;
	final static String topic2               = "topic2";
	final static String topic3               = "topic3";
	final static String clientId             = "SimpleConsumerDemoClient";
}