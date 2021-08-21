package com.apress.todo.todoinmemory_1.demo.dmain;


import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
public class Todo implements Serializable {

    @NotNull
    String id;
    @NotNull
    @NotBlank
    String desc;
    boolean completed;
    LocalDateTime created;
    LocalDateTime modified;
}