package com.gianneves.desafiotodolist.repository;

import com.gianneves.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
