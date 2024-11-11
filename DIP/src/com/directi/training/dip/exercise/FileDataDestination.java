package com.directi.training.dip.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataDestination implements DataDestination {
    private String _filePath;

    public FileDataDestination(String filePath) {
        _filePath = filePath;
    }

    @Override
    public void write(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(_filePath))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
