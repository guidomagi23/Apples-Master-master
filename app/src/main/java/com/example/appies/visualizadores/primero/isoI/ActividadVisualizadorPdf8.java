package com.example.appies.visualizadores.primero.isoI;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appies.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ActividadVisualizadorPdf8 extends AppCompatActivity {

    FloatingActionButton buttonDesc;
    DownloadManager downloadManager;
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_visualizador_pdf);

        pdfView = (PDFView)findViewById(R.id.pdfView);
       //pdfView.fromAsset("ingenieriaI_principal_unidad4/Diagrama_de_clases-Relaciones.pdf").load();
        new RetrievePDFStream().execute("https://prueba610760088.files.wordpress.com/2019/10/diagrama_de_clases-relaciones.pdf");
       //new RetrievePDFBytes().execute("http://cursoslared.com/recursoslibre/TutorialAndroidPrincipiantes.pdf");

        buttonDesc = (FloatingActionButton) findViewById(R.id.btDescargar);
        buttonDesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://prueba610760088.files.wordpress.com/2019/10/diagrama_de_clases-relaciones.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager.enqueue(request);
            }
        });
    }


   /*class RetrievePDFBytes extends AsyncTask<String,Void, byte[]>{


        @Override
        protected byte[] doInBackground(String... strings) {
            InputStream inputStream = null;
            try{
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200){
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }
            }
            catch (IOException e){
                return null;
            }
            try {
                return IOUtils.toByteArray(inputStream);
            }catch(IOException e){
                e.printStackTrace();
            }
            return null;
        }

        protected void onPostExecute(byte[] bytes){
            pdfView.fromBytes(bytes).load();
        }
    }*/

    class RetrievePDFStream extends AsyncTask<String,Void, InputStream> {
 

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try{
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200){
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }
            }
            catch (IOException e){
                return null;
            }
            return inputStream;
        }

        protected void onPostExecute(InputStream inputStream){
            pdfView.fromStream(inputStream).load();
        }
    }
}
