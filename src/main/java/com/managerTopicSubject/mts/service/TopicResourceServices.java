package com.managerTopicSubject.mts.service;

import com.managerTopicSubject.mts.dto.topic.TopicCreateRequestDTO;
import com.managerTopicSubject.mts.dto.topic.TopicSearchRequestDTO;
import com.managerTopicSubject.mts.dto.topic.TopicUpdateRequestDTO;
import com.managerTopicSubject.mts.model.Topic;

import java.util.List;

public interface TopicResourceServices {

    Topic create(TopicCreateRequestDTO dto);

    Topic update(TopicUpdateRequestDTO dto);

    TopicUpdateRequestDTO find(Long id);

    Boolean delete(Long id);

    List<TopicSearchRequestDTO> search();


}