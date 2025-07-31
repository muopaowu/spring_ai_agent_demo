package com.example.demo.app;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoveAppTest {
    @Resource
    private LoveApp loveApp;

    @Test
    void doChat() {
        loveApp.doChat("我叫王益凡，你叫什么名字", "wyf");
        loveApp.doChat("我怎么才能开始一段恋情", "wyf");
        loveApp.doChat("你叫什么？", "wyf");
    }

    @Test
    void doChatReport() {
        String chatId = UUID.randomUUID().toString();
        LoveApp.LoveReport loveReport = loveApp.doChatReport("你好,我叫王益凡，我想让我的另一半，更加爱我也应该怎么做", chatId);
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        // write code here
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maxValue){
                maxValue=array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            int tValue = array[i];
            for (int j = i + 1; j < array.length; j++) {
                tValue = tValue + array[j];
                if (maxValue < tValue) {
                    maxValue = tValue;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-2, -3,  -1};
        int i = FindGreatestSumOfSubArray(array);
        System.out.println("i = " + i);
    }

    @Test
    void mytest() {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = FindGreatestSumOfSubArray(array);
        System.out.println("i = " + i);
    }
}