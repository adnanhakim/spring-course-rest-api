package com.adnanhakim.courseapi.service;

import com.adnanhakim.courseapi.dao.TopicRepository;
import com.adnanhakim.courseapi.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopicById(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopicById(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopicById(String id) {
        topicRepository.deleteById(id);
    }
}
