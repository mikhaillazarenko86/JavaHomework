package org.example;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {

        Path path = Path.of("file.txt");
        try {
            Files.createFile(path);
        }catch(IOException e){
        }

        String str = "text";
        String result = "";
        for (int i = 0; i < 100; i++){
            result += str;
        }
        try {
            Files.writeString(path, result);
        }
        catch (IOException e){

        }
            {
        }



    }
}