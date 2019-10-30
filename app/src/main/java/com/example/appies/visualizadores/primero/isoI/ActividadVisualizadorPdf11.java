package com.example.appies.visualizadores.primero.isoI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appies.R;
import com.github.barteksc.pdfviewer.PDFView;

public class ActividadVisualizadorPdf11 extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_visualizador_pdf);

        pdfView = (PDFView)findViewById(R.id.pdfView);
       pdfView.fromAsset("ingenieriaI_extras_resumenes/ing1_otro.pdf").load();
      //  new RetrievePDFStream().execute("http://prueba610760088.files.wordpress.com/2019/10/p.pdf");
       //new RetrievePDFBytes().execute("http://cursoslared.com/recursoslibre/TutorialAndroidPrincipiantes.pdf");
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

   /* class RetrievePDFStream extends AsyncTask<String,Void, InputStream> {
 

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
    }*/
}
