package com.example.WebAppExternal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.FileSystem;

public class CreateFile {

    public static void main(String[] args) {
//        File f = new File("/Users/a373874/Downloads/Anil/text.txt");
//        File f = new File("/Users/kp");
//        f.mkdirs();
        try {
            File f = new File("/Users/a373874/Downloads/Anil/text.txt");
            if (!f.exists())
                f.getParentFile().mkdirs();

            BufferedWriter writer =new BufferedWriter(new FileWriter(f));
            writer.write("Hello, BufferedWriter!");
            writer.newLine(); // Platform-independent new line
            writer.write("This is a new line.");

            // Ensure that the buffered content is flushed to the underlying writer
            writer.flush();
        }catch (Exception e){
            e.printStackTrace();

        }


    }
}
