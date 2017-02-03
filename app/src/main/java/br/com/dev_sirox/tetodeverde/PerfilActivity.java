package br.com.dev_sirox.tetodeverde;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import br.com.dev_sirox.tetodeverde.R;

/**
 * Created by sirox90 on 03/02/2017.
 */

public class PerfilActivity extends AppCompatActivity {

    private Context context;
    private String[] fiilliste;
    private ArrayAdapter<String> adapter;
    private ListView listView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        fiilliste = getResources().getStringArray(R.array.perfis);
        //Log.i("Prod", String.valueOf(fiilliste.length));

        listView = (ListView) findViewById(R.id.lsProduto);
        toolbar = (Toolbar)  findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        // Display icon in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fiilliste);
        /*for (produto:fiilliste) {
        }
       // produtos.addAll(new Produto());
       // produtoAdapter = new ProdutoAdapter(context,produtos);*/
        listView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
