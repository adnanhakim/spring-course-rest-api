package com.adnanhakim.courseapi.service;

import com.adnanhakim.courseapi.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications - on any kind of deployment platform."),
            new Topic("java", "Core Java", "Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible."),
            new Topic("javascript", "JavaScript", "JavaScript, often abbreviated as JS, is a programming language that conforms to the ECMAScript specification. JavaScript is high-level, often just-in-time compiled, and multi-paradigm.")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Optional<Topic> getTopicById(String id) {
        return topics.stream()
                .filter(topic -> topic.getId().equals(id))
                .findFirst();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopicById(String id, Topic newTopic) {
        for(Topic topic: topics) {
            if(topic.getId().equals(id)) {
                topics.set(topics.indexOf(topic), newTopic);
                return;
            }
        }
    }

    public void deleteTopicById(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}
