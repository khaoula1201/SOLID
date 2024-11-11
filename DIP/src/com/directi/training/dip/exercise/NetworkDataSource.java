package com.directi.training.dip.exercise;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.URL;

public class NetworkDataSource implements DataSource {
    private URL _url;

    public NetworkDataSource(URL url) {
        _url = url;
    }
    @Override
    public String read() throws IOException {
        InputStream in = _url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder data = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            data.append((char) c);
        }
        reader.close();
        return data.toString();
    }
}
