package kr.re.kitri.springpost.controller;

import kr.re.kitri.springpost.model.Post;
import kr.re.kitri.springpost.model.Todo;
import kr.re.kitri.springpost.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> viewAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo viewTodoByTodoId(@PathVariable long id) {
        return todoService.getTodoByTodoId(id);
    }

    @PostMapping("/todos")
    public Todo writePost(@RequestBody Todo todo) {
        return todoService.setPost(todo);
    }
}
