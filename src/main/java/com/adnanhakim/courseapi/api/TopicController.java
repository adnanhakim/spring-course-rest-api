package com.adnanhakim.courseapi.api;

import com.adnanhakim.courseapi.model.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @GetMapping(path = "{topics}")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications - on any kind of deployment platform."),
                new Topic("java", "Core Java", "Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible."),
                new Topic("javascript", "JavaScript", "JavaScript, often abbreviated as JS, is a programming language that conforms to the ECMAScript specification. JavaScript is high-level, often just-in-time compiled, and multi-paradigm.")
        );
    }
}
