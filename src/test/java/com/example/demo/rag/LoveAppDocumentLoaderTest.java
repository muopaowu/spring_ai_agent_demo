package com.example.demo.rag;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class LoveAppDocumentLoaderTest {
@Resource
private LoveAppDocumentLoader loveAppDocumentLoader;
    @Test
    void loadMarkdownDocuments() {
        loveAppDocumentLoader.loadMarkdownDocuments();
    }
}