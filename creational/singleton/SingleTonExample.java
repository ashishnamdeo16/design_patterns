package creational.singleton;

public class SingleTonExample {

    //Eager Way of implementing SingleTon
    //private static SingleTonExample Obj = new SingleTonExample(); and return it in getObj
      private static SingleTonExample Obj;

    private SingleTonExample(){

    }

    public static SingleTonExample getObj() {
        if(Obj == null){
            //For Viewing the issue with Multi-Threading
            //try { Thread.sleep(700); } catch (Exception e) {}
            synchronized(SingleTonExample.class){
                if(Obj == null){
                    Obj = new SingleTonExample();
                }
            }
        }
        return Obj;
    }

}
