package com.apress.todo.todoinmemory_1.demo.repos;

import com.apress.todo.todoinmemory_1.demo.dmain.Todo;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class ToDoRepository implements CommonRepository<String, Todo> {
    private Map<String, Todo> toDos = new HashMap<>();

    @Override
    public Todo save(Todo domain) {
        Todo result = toDos.get(domain.getId());
        if (result != null) {
            result.setModified(LocalDateTime.now());
            result.setDesc(domain.getDesc());
            result.setCompleted(domain.isCompleted());
            domain = result;
        }
        toDos.put(domain.getId(), domain);
        return toDos.get(domain.getId());
    }

    @Override
    public Iterable<Todo> save(@NotNull Collection<Todo> domains) {
        domains.forEach(this::save);
        return findAll();
    }

    @Override
    public void delete(Todo domain) {
        toDos.remove(domain.getId());
    }

    @Override
    public Todo findById(String s) {
        return toDos.get(s);
    }

    @Override
    public Iterable<Todo> findAll() {
        return toDos.entrySet().stream().sorted(entryComparator)
                .map(Map.Entry::getValue).collect(Collectors.toList());
    }

    private Comparator<Map.Entry<String, Todo>> entryComparator = (Map.Entry<String, Todo> o1, Map.Entry<String, Todo> o2) -> {
        return o1.getValue().getCreated().compareTo(o2.getValue().
                getCreated());
    };
}
