
package com.directi.training.dip.exercise;

import java.io.IOException;
import java.net.URL;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();

        // Encodage depuis un fichier vers un autre fichier
        DataSource fileSource = new FileDataSource("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        DataDestination fileDestination = new FileDataDestination("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        encodingModule.encode(fileSource, fileDestination);

        // Encodage depuis un reseau vers la data base
        DataSource networkSource = new NetworkDataSource(new URL("http", "myfirstappwith.appspot.com", "/index.html"));
        DataDestination dbDestination = new DatabaseDataDestination();
        encodingModule.encode(networkSource, dbDestination);
    }
}
