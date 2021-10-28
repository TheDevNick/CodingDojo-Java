package com.codingdojo.Idea.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.Idea.models.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {

}
