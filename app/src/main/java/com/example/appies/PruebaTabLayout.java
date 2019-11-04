package com.example.appies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class PruebaTabLayout extends AppCompatActivity {

    //private ImageView imageView;
    private TabLayout tabLayout;
   // private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_tab_layout);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        viewPager=(ViewPager)findViewById(R.id.view_pager);
        tabLayout=(TabLayout)findViewById(R.id.tabs);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new IngenieriaIPrincipalFragment(),"Principal");
        viewPagerAdapter.addFragment(new IngenieriaIExtrasFragment(),"Extras");
        viewPager.setAdapter(viewPagerAdapter);
        //setUpView();
        setUpViewPagerAdapter();
    }

    private void setUpView(){

        //Aca van todas las cosas del
    }

    private void setUpViewPagerAdapter(){



        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        Log.d("TAG1", "Posicion: " + tabLayout.getSelectedTabPosition() + " Titulo: " + viewPagerAdapter.getPageTitle(tabLayout.getSelectedTabPosition()));
                        break;
                    case 1:
                        Log.d("TAG1", "Posicion: " + tabLayout.getSelectedTabPosition() + " Titulo: " + viewPagerAdapter.getPageTitle(tabLayout.getSelectedTabPosition()));
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
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
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Material para ingeniería de software I");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "...");

        try {
            startActivity(Intent.createChooser(emailIntent, "Enviar email..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(PruebaTabLayout.this, "No tienes clientes de email instalados.", Toast.LENGTH_SHORT).show();
        }
    }
}
