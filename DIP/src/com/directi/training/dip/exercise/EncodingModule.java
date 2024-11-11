
package com.directi.training.dip.exercise;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    public void encode(DataSource source, DataDestination destination) throws IOException {
        String data = source.read();
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
        destination.write(encodedData);
    }
}
