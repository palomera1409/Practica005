package com.example.palomera.practica005;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /// declaracion de las variables
    private TextView texto;
    private Spinner mySpiner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// inicializacion de los componentes

    texto= (TextView)findViewById(R.id.txt);
    mySpiner=(Spinner)findViewById(R.id.myspinner);
    //adaptador del spinner
    String opciones[]={"NEGRITAS","CURSIVAS"};
        ArrayAdapter <String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        mySpiner.setAdapter( adapter);
        //evento para el spinner

     mySpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

             String opcion= mySpiner.getSelectedItem().toString();
             if (opcion.equals("NEGRITAS"))
             {
              texto.setTypeface(null, Typeface.BOLD);


             }
             else   if (opcion.equals("CURSIVAS"))
             {

                 texto.setTypeface(null,Typeface.ITALIC);
             }

         }

         @Override
         public void onNothingSelected(AdapterView<?> adapterView) {

         }
     });

    }
}
