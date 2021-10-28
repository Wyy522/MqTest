package java;

import java.util.concurrent.ArrayBlockingQueue;

public class Broker {
    //队列存储消息的最大数量
    private  final  static  int MAX_SIZE = 3;
    //保存消息数据的容器
    private static ArrayBlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(MAX_SIZE);
    //生产消息
    public static  void  produce(String msg){
        System.out.println("[消息中间件]=============================================");
        if(messageQueue.offer(msg)){
            System.out.println("[消息中间件]收到消息：" + msg + ",暂存消息：" + messageQueue.size() + "条。");
        }else{
            System.out.println("[消息中间件]消息已满！");
        }
        System.out.println("[消息中间件]=============================================");
    }
    //消费消息
    public static  String  consume(){
        System.out.println("[消息中间件]=============================================");
        String msg = messageQueue.poll();
        if(msg != null){
            System.out.println("[消息中间件]消费消息：" + msg + ",暂存消息：" + messageQueue.size() + "条。");
        }else{
            System.out.println("[消息中间件]消息已空！");
        }
        System.out.println("[消息中间件]=============================================");
        return msg;
    }
}