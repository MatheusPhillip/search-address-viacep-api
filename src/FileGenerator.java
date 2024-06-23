import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public void generateJsonFile(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter writer = new FileWriter("postal-code-" + address.cep() + ".json");
        writer.write(gson.toJson(address));
        writer.close();
    }
}
