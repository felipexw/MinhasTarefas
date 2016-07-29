package br.appio.minhastarefas;


import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;

/**
 * Created by Appio on 28/07/2016.
 */
public class MinhasTarefasApp extends com.activeandroid.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Configuration dbConfiguration = new Configuration.Builder(this).setDatabaseName("xxx.db").create();
        ActiveAndroid.initialize(dbConfiguration);
    }
}
