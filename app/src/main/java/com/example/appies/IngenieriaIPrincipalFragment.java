package com.example.appies;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf10;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf2;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf3;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf4;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf5;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf6;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf7;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf8;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf9;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link IngenieriaIPrincipalFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link IngenieriaIPrincipalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IngenieriaIPrincipalFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button btVerPdf;
    View vista, vista2;
    Button buttonDesc;
    DownloadManager downloadManager;

    private OnFragmentInteractionListener mListener;

    public IngenieriaIPrincipalFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment IngenieriaIPrincipalFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static IngenieriaIPrincipalFragment newInstance(String param1, String param2) {
        IngenieriaIPrincipalFragment fragment = new IngenieriaIPrincipalFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_ingenieriai_principal, container, false);
        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf2);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf2.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf3);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf3.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf4);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf4.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf5);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf5.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf6);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf6.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf7);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf7.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf8);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf8.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf9);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf9.class);
                getActivity().startActivity(prueba);
            }
        });


       /* buttonDesc = (Button) vista.findViewById(R.id.btDescargar);
        buttonDesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager = (DownloadManager) getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://prueba610760088.files.wordpress.com/2019/10/p.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager.enqueue(request);
            }
        });*/

        return vista;



    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

   /* @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


   /* public void accionarBotonPdf(View view){
        Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf.class);
        getActivity().startActivity(prueba);
        PDFView pdfView = null;
        super.onCreate();
        setContentView(R.layout.activity_actividad_visualizador_pdf);
        pdfView = (PDFView) pdfView.findViewById(R.id.pdfView);
        pdfView.fromAsset("ingenieriaI_principal_unidad1/p.pdf").load();
    }*/
   // public void accionarBotonPdf2(View view) {
        //setContentView(R.layout.activity_actividad_visualizador_pdf);
        //pdfView = (PDFView) findViewById(R.id.pdfView);
       // pdfView.fromAsset("p.pdf").load();
   // }



/*
    public void accionarBotonPdf2(View view){
        Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf2.class);
        getActivity().startActivity(prueba);
    }

    public void accionarBotonPdf3(View view){
        Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf3.class);
        getActivity().startActivity(prueba);
    }

    public void accionarBotonPdf4(View view){
        Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf4.class);
        getActivity().startActivity(prueba);
    }

    public void accionarBotonPdf5(View view){
        Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf5.class);
        getActivity().startActivity(prueba);
    }

    public void accionarBotonPdf6(View view){
        Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf6.class);
        getActivity().startActivity(prueba);
    }
*/
}
