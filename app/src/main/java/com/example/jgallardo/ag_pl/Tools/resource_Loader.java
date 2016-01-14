package com.example.jgallardo.ag_pl.Tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class resource_Loader {

    public static String read_text_file(final String path){

        String content = "";

        InputStream bytes_in = ClassLoader.class.getResourceAsStream(path);
        BufferedReader text_reader = new BufferedReader(new InputStreamReader(bytes_in));

        String line;

        try{
            while((line = text_reader.readLine()) != null){
                content += line;
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(bytes_in != null){
                    bytes_in.close();
                }
                if(text_reader != null){
                    text_reader.close();
                }
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }

        return content;
    }
}
