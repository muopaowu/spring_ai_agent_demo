package com.example.demo.rag;


import jakarta.annotation.Resource;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoveAppVectorStoreConfig {
    @Resource
    private LoveAppDocumentLoader loveAppDocumentLoader;
    @Bean
    public VectorStore loveAppVectorStore(EmbeddingModel dashscopeEmbeddingModel){
        SimpleVectorStore simpleVectorStore = SimpleVectorStore.builder(dashscopeEmbeddingModel).build();
        simpleVectorStore.doAdd(loveAppDocumentLoader.loadMarkdownDocuments());
        return simpleVectorStore;
    }
}
