package kr.re.kitri.springpost.service;

import kr.re.kitri.springpost.model.Post;
import kr.re.kitri.springpost.model.Todo;
import kr.re.kitri.springpost.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.selectAllTodos();
    }

    public Todo getTodoByTodoId(long id) {
        return todoRepository.selectTodoByTodoId(id);
    }

    public Todo setPost(Todo todo) {
        todoRepository.insertTodo(todo);
        return todo;
    }
}
