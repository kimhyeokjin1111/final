package com.example.finalapp.api;

import com.example.finalapp.service.OpenAiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpenAiApi {
    private final OpenAiService openAiService;

//    @PostMapping("/v1/gpt/question")
//    public Map question(@RequestBody Map<String, String> body){
//        return openAiService.question(body);
//    }
}
