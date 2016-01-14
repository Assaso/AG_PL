package com.example.jgallardo.ag_pl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jgallardo.ag_pl.Tools.resource_Loader;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button catch_Pkmn;
    Button list;
    Button badges;
    TextView user_display;
    String user;
    String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File file = new File("\\text\\user.txt");
        path = file.getPath().toString();
        if(file.exists()) {
            user = resource_Loader.read_text_file(path);
        }else{

        }


        catch_Pkmn = (Button)findViewById(R.id.catch_Pkmn);
        list = (Button)findViewById(R.id.view_List);
        badges = (Button)findViewById(R.id.badges);
        user_display = (TextView)findViewById(R.id.title);

        user_display.setText("Welecome " + user + "!");


        catch_Pkmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), catch_Pkmn.class);
                startActivity(intent);
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), list.class);
                startActivity(intent);
            }
        });

        badges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), badges.class);
                startActivity(intent);
            }
        });
    }
}
