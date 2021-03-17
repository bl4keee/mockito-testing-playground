package com.bartekcodes.data.api;

import java.util.List;

public interface TodoService {

    public List<String> retrieveTodos(String user);

    public List<String> configureSomething(String user);
}
