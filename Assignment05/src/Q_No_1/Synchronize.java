package Q_No_1;

public class Synchronize {
    public static void main(String[] args) {
        Table obj = new Table();
        Process1 p1 = new Process1(obj);
        Process2 p2 = new Process2(obj);
        System.out.println("Print Multiple of 5 & 10: ");
        p1.start();
        p2.start();

    }
}

class Table{
    synchronized void printTable(int n){//synchronized method in java
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(300);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class Process1 extends Thread{
    Table t;
    Process1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}

class Process2 extends Thread{
    Table t;
    Process2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(10);
    }
}


