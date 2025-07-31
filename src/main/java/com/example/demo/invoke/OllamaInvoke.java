package com.example.demo.invoke;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class OllamaInvoke implements CommandLineRunner {
    @Resource
    private ChatModel ollamaChatModel;

    @Override
    public void run(String... args) throws Exception {
        String text = ollamaChatModel.call(new Prompt("你好，我叫王益凡"))
                .getResult()
                .getOutput()
                .getText();
        System.out.println(text);
    }
}
