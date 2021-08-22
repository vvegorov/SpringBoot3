package com.apress.todo.todoinmemory_1.demo.dmain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Todo implements Serializable {

    @NotNull
    String id;
    @NotNull
    @NotBlank
    String desc;
    boolean completed;
    LocalDateTime created;
    LocalDateTime modified;

    public Todo(){
        LocalDateTime date = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created = date;
        this.modified = date;
    }
    public Todo(String description){
        this();
        this.desc = description;
    }
}