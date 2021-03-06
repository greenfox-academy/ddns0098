package com.greenfoxacademy.todos;

import com.greenfoxacademy.todos.model.Todo;
import com.greenfoxacademy.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner{

	private TodoRepository todoRepository;

	@Autowired
	public TodosApplication(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TodosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
