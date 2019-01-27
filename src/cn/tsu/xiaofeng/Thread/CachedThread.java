package cn.tsu.xiaofeng.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(2);
        for (int i=0;i<=10;i++) {
            try {
                //Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
           // System.out.println(i);
            executorService.execute(new LiftOff(i));
        }
        executorService.shutdown();



    }
}
