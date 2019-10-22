public class Demo {
    public static void main(String[] args) {
        new Demo().foo();
 
    }
 
    public void foo() {
        TestPaper testPaper = new TestPaper();
        Thread teacher1 = new Thread(testPaper, "teacher_1");
        Thread teacher3 = new Thread(testPaper, "teacher_2");
        Thread teacher2 = new Thread(testPaper, "teacher_3");
        teacher1.start();
        teacher2.start();
        teacher3.start();
 
    }
 
    public class TestPaper implements Runnable {
        final Object lock = new Object();
        int amount = 80;
 
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (amount <= 0) {
                        break;
                    }
                    amount--;
                    System.out.println(Thread.currentThread() + "发出一份试卷 剩余份数" + amount);
                    Thread.yield();
                }
            }
        }
    }
}