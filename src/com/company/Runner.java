package com.company;

public class Runner extends Thread {
    private int id;
    private String diraction;

    public Runner(int id, String diraction) {
        this.id = id;
        this.diraction = diraction;
    }

    public synchronized void run() {
        try {
            if (id < 5 && diraction.equals("forwards")) {
                System.out.println("Runner "+id+" takes a wand");
                System.out.println("Runner "+id+" runs to runner "+(id+1));
                sleep(1000);
            }
            if (id == 5) {
                System.out.println("Runner "+id+" takes a wand");
                System.out.println("Runner "+id+" runs to runner");
                sleep(1000);
                System.out.println("Runner "+id+" runs to runner "+(id-1));
            }
            if (id > 1 && diraction.equals("backwards")) {
                System.out.println("Runner "+id+" takes a wand");
                System.out.println("Runner "+id+" runs to runner "+(id-1));
                sleep(1000);
            }
            if (id == 1 && diraction.equals("backwards")) {
                System.out.println("Runner "+id+" takes a wand");
            }
        } catch (Exception e) {}
    }
}
