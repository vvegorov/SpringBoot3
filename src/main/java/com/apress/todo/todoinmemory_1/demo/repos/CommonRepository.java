package com.apress.todo.todoinmemory_1.demo.repos;

import java.util.Collection;

public interface CommonRepository<ID,T>
{
    public T save (T domain);
    public Iterable<T> save(Collection<T> domains);
    public void delete(T domain);
    public T findById(ID id);
    public Iterable<T> findAll();
}
