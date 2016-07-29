package br.appio.minhastarefas.repository.task;

import br.appio.minhastarefas.domain.Task;
import br.appio.minhastarefas.repository.RepositoryImpl;

/**
 * Created by Appio on 28/07/2016.
 */
public class TaskRepositoryImpl extends RepositoryImpl<Task> implements TaskRepository{
    public TaskRepositoryImpl(Class clazz) {
        super(Task.class);
    }
}
