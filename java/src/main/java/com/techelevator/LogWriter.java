package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class LogWriter {


    private File file;

    public LogWriter(String path){
        this.file = new File(path);
    }

    public void writeToFile(String lineOfText){
        PrintWriter writer = null;

        if(this.file.exists()){
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                writer = new PrintWriter(fileOutputStream);
                writer.println(lineOfText);

            }catch (FileNotFoundException e){
                e.printStackTrace();

            }
        }else {
            try {
                writer = new PrintWriter(this.file);
                writer.println(lineOfText);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        writer.flush();
        writer.close();

    }


}
