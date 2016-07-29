package br.appio.minhastarefas;

import android.test.ApplicationTestCase;

import com.activeandroid.app.Application;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.appio.minhastarefas.domain.Task;
import br.appio.minhastarefas.repository.Repository;
import br.appio.minhastarefas.repository.RepositoryImpl;
import br.appio.minhastarefas.repository.task.TaskRepositoryImpl;
import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;
/**
 * Created by Appio on 28/07/2016.
 */
public class RepositoryTest extends TestCase {
    private static Repository repository;

    public RepositoryTest() {

    }



    @Override
    protected void setUp() throws Exception {
        super.setUp();
        repository = new TaskRepositoryImpl(Task.class);
    }

    @Test
    public void it_should_add_one_task(){
        Task task = new Task();
        task.setTitle("task 1");
        task.setDescription("description 1");
        long actualResult =  repository.update(task);
        assertTrue(actualResult > 0);
    }
}
