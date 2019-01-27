package cn.tsu.xiaofeng.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BaiduThread {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("111:"+index);
                }
            });
        }
    }
}
