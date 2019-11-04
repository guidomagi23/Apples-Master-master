package com.example.appies;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf10;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf11;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf12;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf13;
import com.example.appies.visualizadores.primero.isoI.ActividadVisualizadorPdf14;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link IngenieriaIExtrasFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link IngenieriaIExtrasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IngenieriaIExtrasFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button btVerPdf, btLink;
    View vista;

    private OnFragmentInteractionListener mListener;

    public IngenieriaIExtrasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment IngenieriaIExtrasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static IngenieriaIExtrasFragment newInstance(String param1, String param2) {
        IngenieriaIExtrasFragment fragment = new IngenieriaIExtrasFragment();
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


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        vista = inflater.inflate(R.layout.fragment_ingenieriai_extras, container, false);

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf10);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf10.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf11);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf11.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf12);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf12.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf13);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf13.class);
                getActivity().startActivity(prueba);
            }
        });

        btVerPdf= (Button) vista.findViewById(R.id.btBotonVerPdf14);
        btVerPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(getActivity(), ActividadVisualizadorPdf14.class);
                getActivity().startActivity(prueba);
            }
        });


        //links

        btLink= (Button) vista.findViewById(R.id.btLink1);
        btLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-OWd0tJAK10"));
                getActivity().startActivity(prueba);
            }
        });

        btLink= (Button) vista.findViewById(R.id.btLink2);
        btLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7WRYH2ei5Rw"));
                getActivity().startActivity(prueba);
            }
        });

        btLink= (Button) vista.findViewById(R.id.btLink3);
        btLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prueba = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Rk3cPADj__M"));
                getActivity().startActivity(prueba);
            }
        });

        return vista;
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
}
