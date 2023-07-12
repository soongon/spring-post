package kr.re.kitri.springpost.repository;

import kr.re.kitri.springpost.model.Post;
import kr.re.kitri.springpost.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    public List<Todo> selectAllTodos() {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(1, "운동하기", false));
        todos.add(new Todo(2, "청소하기", false));
        todos.add(new Todo(3, "음악듣기", true));

        return todos;
    }

    public Todo selectTodoByTodoId(long id) {
        return new Todo(id, "테스트", false);
    }

    public Todo insertTodo(Todo post) {
        System.out.println("insert ok.. " + post);
        return post;
    }
}
