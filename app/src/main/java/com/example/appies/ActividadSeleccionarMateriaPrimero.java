package com.example.appies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class ActividadSeleccionarMateriaPrimero extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_seleccionar_materia_primero);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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


    public void accionarBotonEnviar(View view){
        String[] TO = {"noties@gmail.com"}; //aquí pon tu correo
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        // Esto podrás modificarlo si quieres, el asunto y el cuerpo del mensaje
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Material para Noties");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "...");

        try {
            startActivity(Intent.createChooser(emailIntent, "Enviar email..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(ActividadSeleccionarMateriaPrimero.this, "No tienes clientes de email instalados.", Toast.LENGTH_SHORT).show();
        }
    }

}
