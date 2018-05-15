package interviewprograms;

public class DeadlockProgram {
    String str1 = "Java";
    String str2 = "UNIX";

    Thread trd1 = new Thread("My Thread 1"){
        public void run(){
            while(true){
                synchronized(str1){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(str2){
                        System.out.println(str1 + str2);
                        break;
                    }
                }
            }
        }
    };

    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(str2){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(str1){
                        System.out.println(str2 + str1);
                        break;
                    }
                }
            }
        }
    };

    public static void main(String a[]){
        DeadlockProgram mdl = new DeadlockProgram();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}
