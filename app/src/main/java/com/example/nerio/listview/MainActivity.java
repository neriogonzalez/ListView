package com.example.nerio.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TextView01;
    private ListView ListView01;
    private String Nombre[] = {"Nerio", "Desiree","Diego","Nerio2", "Desiree2","Diego2","Nerio3", "Desiree3","Diego3"};
    private String Edad[] = {"1","2","3","4","5","6","7","8","9"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView01 = findViewById(R.id.textView01);
        ListView01 = findViewById(R.id.ListView01);
        ArrayAdapter<String> Adaptador = new ArrayAdapter<>(this,R.layout.list_item_01,Nombre);
        ListView01.setAdapter(Adaptador);
        ListView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView01.setText("La edad de "+ ListView01.getItemAtPosition(i) + " es: " + Edad[i] + " años.");
            }
        });
    }
}
