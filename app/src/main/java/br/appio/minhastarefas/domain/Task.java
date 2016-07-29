package br.appio.minhastarefas.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * Created by Appio on 28/07/2016.
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor(suppressConstructorProperties = true)
@Table(name="tasks")
public class Task extends Model implements Serializable{
    @Column(name = "title")
    @Setter @Getter
    private String title;
    @Column(name="description")
    @Setter @Getter
    private String description;
    private State state;

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public enum State{
        OPEN,
        COMPLETED,
        PENDING;
    }


}
