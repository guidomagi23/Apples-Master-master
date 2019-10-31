package com.example.appies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class ActividadSeleccionarMateriaPrimero extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_seleccionar_materia_primero);
    }


    public void accionarBotonLogica(View view){
        Intent logica = new Intent(this,PruebaTabLayout.class);
        startActivity(logica);



       /*setContentView(R.layout.activity_actividad_visualizador_pdf);
        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("p.pdf").load();
        */



        //PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        //pdfView.fromAsset("p.pdf").load();
    }

    public void accionarBotonIngenieria(View view) {
        Intent ing = new Intent(this, PruebaTabLayout.class);
        startActivity(ing);
    }


}
