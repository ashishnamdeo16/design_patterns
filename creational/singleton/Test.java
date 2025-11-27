package creational.singleton;

class Task extends Thread{
    public int num;

    public Task(int num){
        this.num = num;
    }

    @Override
    public void run() {
        SingleTonExample val = SingleTonExample.getObj();
        System.out.println("Thread " + num + " Hash Code :" + val.hashCode());
    }
}

public class Test {
    public static void main(String[] args) {

        for(int i=1;i<=1000;i++){
            Task t = new Task(i);
            t.start();
        }
    }
}
