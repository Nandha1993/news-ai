package com.poc.ai.news_ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsAIController {

    @Autowired(required=true)
    ChatClient chatClient;

    @GetMapping("/prompt")
    public ChatClient.ChatClientRequestSpec prompt(@RequestParam String message) {
        return chatClient.prompt(message);
    }
}
