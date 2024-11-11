package com.directi.training.dip.exercise;

public class DatabaseDataDestination implements DataDestination {
    private MyDatabase _database = new MyDatabase();

    @Override
    public void write(String data) {
        _database.write(data);
    }
}