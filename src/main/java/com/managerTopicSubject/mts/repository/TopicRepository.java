package com.managerTopicSubject.mts.repository;

import com.managerTopicSubject.mts.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    List<Topic> findByTeacherId(Long id);
    List<Topic> findByFacultyId(Long id);
}
