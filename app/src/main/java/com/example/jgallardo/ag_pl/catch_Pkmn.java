package com.example.jgallardo.ag_pl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class catch_Pkmn extends AppCompatActivity {

    private String quality_Array[];

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.catch_pkmn);

        quality_Array = new String[6];
        quality_Array[0]="Common";
        quality_Array[1]="Reverse";
        quality_Array[2]="Holo";
        quality_Array[3]="Reverse holo";
        quality_Array[4]="Promo";
        quality_Array[5]="EX";
        quality_Array[6]="Full art";

        Spinner quality_List = (Spinner)findViewById(R.id.quality_list);
        ArrayAdapter quality_Adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, quality_Array);
        quality_List.setAdapter(quality_Adapter);
    }
}
