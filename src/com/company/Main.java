package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Attention!! START:");

        for (int i = 1; i < 6; i++) {
            Runner runner = new Runner (i, "forwards");
            runner.start();
            try {
                runner.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 4; i >= 1 ; i--) {
            Runner runner = new Runner(i, "backwards");
            runner.start();
            try {
                runner.join();

            } catch (InterruptedException e) {


            }
        }
    }
}
