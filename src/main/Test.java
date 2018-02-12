package main;

/**
 * Created by Administrator on 2017/8/1.
 */
public class Test {
    public static void main(String[] args) {
       String a="已选择:0123456";
        String x="已选择:刮水下垂,喇叭按钮坏,喇叭不响（倒）,";
        String c="已选择:风扇皮带坏,空压泵打气慢,";
        System.out.println(a.substring(4, a.length())); ;
        System.out.println(x.substring(4,x.length()));
        System.out.println(c.length());
    }
}
