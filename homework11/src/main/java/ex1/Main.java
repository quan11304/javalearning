package ex1;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitle("Convert Java Object to String Json");
        post.setId(100L);
        post.setDescription("Use Jackson JSON API");
        post.setContent("HTML content");
        post.setLastUpdatedAt(new Date());
        post.setPostedAt(new Date());

        Gson gson = new Gson();
        String json = gson.toJson(post);
        System.out.println(json);

        File jsonFile = new File("myname.json");
        try {
            if (jsonFile.createNewFile()) {
                FileWriter writer = new FileWriter(jsonFile);
                writer.write(json);
                writer.close();
                System.out.println("File written successfully");
            }
            else {
                System.out.println("An error occurred. The file might have already existed.");
            }
        } catch (IOException e) {
            System.out.printf("An error occurred. (%s)",e.getMessage());
        }
    }
}
