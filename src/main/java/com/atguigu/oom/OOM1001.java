package com.atguigu.oom;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/**
 * @author Wuyq
 * @create 2023/3/23 20:20
 */

public class OOM1001 {

    static List<Object> list = new ArrayList<>();

    public static void main(String[] args) {

        byte[] bytes = new byte[1024 * 1024 * 10];
        int count = 1;
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(count++ + "::" + LocalDateTime.now());
            list.add(bytes);
        }


    }

}
