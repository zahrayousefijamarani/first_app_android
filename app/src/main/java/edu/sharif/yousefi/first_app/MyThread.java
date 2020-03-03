package edu.sharif.yousefi.first_app;


import android.util.Log;

class MyThread  extends Thread{
    static void ThreadSubClass(){
        Log.i("Tag", "MYThread ]]>>"+
                " pid: " + android.os.Process.myPid()+
                " tid: "+ android.os.Process.myTid()+
                "id: "+ Thread.currentThread().getId());
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
