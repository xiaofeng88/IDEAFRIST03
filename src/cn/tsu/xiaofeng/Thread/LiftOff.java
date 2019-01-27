package cn.tsu.xiaofeng.Thread;
public class LiftOff implements Runnable{
    private  Integer count = 5;
    private static Integer sta =0;
    private  Integer id ;

    public String states(){//飞机发射的方法
        return "id" + id + "号" + (count > 0 ? count + "秒后" : "") + "发射！";

    }

    public LiftOff(Integer id) {
        this.id =id;
    }

    @Override
    public void run() {
    while (count-- >0){
        System.out.println(Thread.currentThread().getName());
           System.out.println(states());
    }
    }
}
