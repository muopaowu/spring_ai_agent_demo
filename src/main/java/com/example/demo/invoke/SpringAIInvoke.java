package com.example.demo.invoke;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class SpringAIInvoke implements CommandLineRunner {
    @Resource
    private ChatModel dashscopeChatModel;
    @Override
    public void run(String... args) throws Exception {
        ChatResponse call = dashscopeChatModel.call(new Prompt("你好，我叫王益凡"));
        System.out.println(call.getResult().getOutput().getText());
    }
}
