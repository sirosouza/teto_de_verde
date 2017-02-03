package br.com.dev_sirox.tetodeverde;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.dev_sirox.tetodeverde.controller.ProfissionalController;
import br.com.dev_sirox.tetodeverde.model.Profissional;

import static br.com.dev_sirox.tetodeverde.model.Profissional.perfil;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Context context;
    private Button btnAdministrador;
    private Button btnCorporativo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = getBaseContext();

        setContentView(R.layout.activity_main);

        /*if (perfil==null){
            perfil = Profissional.ADMINISTRADOR;
        }

        if (perfil.equals(Profissional.ADMINISTRADOR)) {
            setContentView(R.layout.activity_main);
        }
        if (perfil.equals(Profissional.CORP_COND)) {
            setContentView(R.layout.activity_main2);
        }
        */

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

//        btnAdministrador.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                perfil = Profissional.ADMINISTRADOR;
//                switchProfile();
//            }
//        });
//        btnCorporativo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                perfil = Profissional.CORP_COND;
//                //switchProfile();
//            }
//        });
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        ProfissionalController profissionalController = new ProfissionalController();
        profissionalController.login(context);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void switchProfile() {
        switch (Profissional.perfil) {
            case Profissional.ADMINISTRADOR: {
                NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                navigationView.setNavigationItemSelectedListener(this);
            }
            break;
            case Profissional.CORP_COND: {
                NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                navigationView.setNavigationItemSelectedListener(this);
                break;
            }
        /*
        LayoutInflater lf;
        View headerView;
        lf = this.getLayoutInflater();
        headerView = (View)lf.inflate(R.layout.nav_header_main, null, false);
        navigationView.addHeaderView(headerView);*/

        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.nav_update: {
                break;
            }
            case R.id.nav_product: {
                Intent intent = new Intent(this, ProdutoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_profile: {
                Intent intent = new Intent(this, PerfilActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.nav_contact: {
                Intent intent = new Intent(this, ContatoAcitvity.class);
                startActivity(intent);
                break;
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
