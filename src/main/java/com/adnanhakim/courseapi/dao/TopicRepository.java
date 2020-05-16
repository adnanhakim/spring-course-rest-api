package com.adnanhakim.courseapi.dao;

import com.adnanhakim.courseapi.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {


}
