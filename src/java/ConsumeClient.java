package java;

public class ConsumeClient {
    public static void main(String[] args) throws Exception {
            MqClient mqClient = new MqClient();
            String message = mqClient.consume();
            System.out.println("消费消息：" + message);
    }
}
