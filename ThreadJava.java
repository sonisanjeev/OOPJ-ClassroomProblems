class ThreadJava extends Thread {

    public void run() {
        System.out.println(
                "Running thread name is: " +
                        Thread.currentThread().getName());

        System.out.println(
                "Running thread priority is: " +
                        Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {

        ThreadJava m1 = new ThreadJava();
        ThreadJava m2 = new ThreadJava();

        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);

        m1.start();
        m2.start();
    }
}