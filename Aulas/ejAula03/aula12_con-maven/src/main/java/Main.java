import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       // Heroi heroi = new Heroi(1, "Roy",10000);

        ObjectMapper objectMapper = new ObjectMapper();
        Heroi heroi = objectMapper.readValue(new File("src/main/resources/heroi.json"), Heroi.class);
        System.out.println(heroi.getNome());
    }
}
