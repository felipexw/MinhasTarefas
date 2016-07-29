package br.appio.minhastarefas.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import lombok.Data;

/**
 * Created by Appio on 28/07/2016.
 */
@Data
@Table(name="tasks")
public class Task extends Model{
    @Column(name = "title")
    private String title;
    @Column(name="description")
    private String description;
    private State state;

    enum State{
        OPEN,
        COMPLETED,
        PENDING;
    }
}
