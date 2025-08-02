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

    @Test
    void doChatLoveAppRag() {
        String chatId = UUID.randomUUID().toString();
        String s = loveApp.doChatLoveAppCloudRag("我已经结婚了，但是婚后关系不太亲密，怎么办？", chatId);
        System.out.println(s);
    }
}