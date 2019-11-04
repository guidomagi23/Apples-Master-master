package com.example.appies;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonDesc;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        /*buttonDesc = (Button)findViewById(R.id.btDescargar);
         buttonDesc.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               downloadManager = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
               Uri uri = Uri.parse("https://prueba610760088.files.wordpress.com/2019/10/p.pdf");
              DownloadManager.Request request = new DownloadManager.Request(uri);
               request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
               Long reference = downloadManager.enqueue(request);
           }
        });*/
    }

    public void accionarBotonPrimero(View view){
        Intent primero = new Intent(this, ActividadSeleccionarMateriaPrimero.class);
        startActivity(primero);
    }

    public void accionarBotonSegundo(View view){
        Intent segundo = new Intent(this, ActividadSeleccionarMateriaSegundo.class);
        startActivity(segundo);
    }

    public void accionarBotonEnviar(View view){
        String[] TO = {"contacto@seogalicia.es"}; //aquí pon tu correo
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        // Esto podrás modificarlo si quieres, el asunto y el cuerpo del mensaje
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Asunto");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Escribe aquí tu mensaje");

        try {
            startActivity(Intent.createChooser(emailIntent, "Enviar email..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "No tienes clientes de email instalados.", Toast.LENGTH_SHORT).show();
        }
    }

    public void accionarBotonAcercaDe(View view){
        Intent acerca = new Intent(this, AcercaDe.class);
        startActivity(acerca);
    }
/*
    public void accionarBotonEnlace(View view){
        Intent enlace = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-OWd0tJAK10"));
        startActivity(enlace);
    }*/

}
