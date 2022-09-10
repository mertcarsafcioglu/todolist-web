package com.mertcarsafcioglu.todolist.repository;

import com.mertcarsafcioglu.todolist.model.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
