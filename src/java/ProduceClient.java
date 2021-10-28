package java;

    public class ProduceClient {
        public static void main(String[] args) throws Exception {
            MqClient mqClient = new MqClient();
            mqClient.produce("Linux is very much!");
        }
    }

