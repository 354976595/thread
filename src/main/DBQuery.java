package main;

/**
 * Created by Administrator on 2017/7/11.
 */
public class DBQuery implements  IDBQuery {
    @Override
    public String request() {
        System.out.println(this.getClass());
        return "request";
    }
}
