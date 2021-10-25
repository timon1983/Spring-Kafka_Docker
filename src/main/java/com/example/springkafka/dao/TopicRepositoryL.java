package com.example.springkafka.dao;

import com.example.springkafka.model.TopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepositoryL extends JpaRepository<TopicEntity, Integer> {

}
