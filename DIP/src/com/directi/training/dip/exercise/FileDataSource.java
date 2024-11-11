package com.directi.training.dip.exercise;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataSource implements DataSource {
    private String _filePath;

    public FileDataSource(String filePath) {
        _filePath = filePath;
    }
    @Override
    public String read() throws IOException {
         BufferedReader reader = new BufferedReader(new FileReader(_filePath));
        StringBuilder data = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            data.append(line).append("\n");
        }
        reader.close();
        return data.toString();
    }
        
    }


