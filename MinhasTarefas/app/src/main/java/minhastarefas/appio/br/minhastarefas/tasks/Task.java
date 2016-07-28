package minhastarefas.appio.br.minhastarefas.tasks;

/**
 * Created by Appio on 26/07/2016.
 */



public class Task {
    enum State{
        ACTIVE,
        PENDING,
        COMPLETED;
    }
    private String title;
    private String description;
    private State state;

}
