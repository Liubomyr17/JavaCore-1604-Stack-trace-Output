package com.company;

/*

1604 stack trace output
1. Create a task (public static class SpecialThread, which implements the Runnable interface).
2. SpecialThread should output its stack trace to the console.
Hint: main thread is already outputting its stack trace to the console.

Requirements:
1. Add the public static class SpecialThread to the Solution class.
2. The SpecialThread class should not be inherited from any additional class.
3. The SpecialThread class must implement the Runnable interface.
4. The run method of the SpecialThread class should output its stack trace.

 */



public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }

        }
    }
}


