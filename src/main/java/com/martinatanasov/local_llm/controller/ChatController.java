package com.martinatanasov.local_llm.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ChatController {

    private final ChatClient chatClient;

    @Value("${spring.ai.ollama.chat.model}")
    private String CHAT_MODEL_NAME;

    @GetMapping("/chat")
    public Flux<String> chat(@RequestParam("question") String question) {
        log.info("\t\nStart new chat in: {}\t\n with question: {}", System.currentTimeMillis(), question);
        return chatClient.prompt()
                .user(question)
                .stream()
                .content();
    }

    @GetMapping("")
    public String chatInfo(){
        log.info("New chat info requested in: {}", System.currentTimeMillis());
        return "Chat model name: " + CHAT_MODEL_NAME;
    }

    @GetMapping("/joke")
    public Flux<String> joke(){
        log.info("A new joke is requested in: {}", System.currentTimeMillis());
        return chatClient.prompt()
                .user("Tell me a random joke")
                .stream()
                .content();
    }

}
