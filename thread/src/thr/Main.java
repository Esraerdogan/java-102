package thr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic orderMatic = new OrderMatic();
        List<Thread> islemler = new ArrayList<>();

        ExecutorService pool = Executors.newFixedThreadPool(50);

        for (int i = 0; i < 100; i++){
            pool.execute(orderMatic);
        }

        System.out.println(orderMatic.getOrderNo());

    }
}
