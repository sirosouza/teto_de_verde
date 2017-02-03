package br.com.dev_sirox.tetodeverde;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.dev_sirox.tetodeverde.model.Contato;
import br.com.dev_sirox.tetodeverde.model.ContatosAdapter;
import br.com.dev_sirox.tetodeverde.model.ProdutoAdapter;

/**
 * Created by sirox90 on 03/02/2017.
 */

public class ContatoAcitvity extends AppCompatActivity {

    private Context context;
    private String[] fiilliste;
    private ListView listView;
    private ContatosAdapter produtoAdapter;
    List<Contato> contatos;
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        context = getBaseContext();

        fiilliste = getResources().getStringArray(R.array.perfis);
        //Log.i("Prod", String.valueOf(fiilliste.length));

        listView = (ListView) findViewById(R.id.lsProduto);
        toolbar = (Toolbar)  findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        // Display icon in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        contatos = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fiilliste);

        contatos.add(new Contato(0,"empresaX","Rua Olavo","5555-5555","http://facebook.com.br/page"));
        contatos.add(new Contato(0,"empresaY","Rua Olavo","5555-5555","http://facebook.com.br/page"));
        contatos.add(new Contato(0,"empresaZ","Rua Olavo","5555-5555","http://facebook.com.br/page"));
        contatos.add(new Contato(0,"empresaA","Rua Olavo","5555-5555","http://facebook.com.br/page"));
        /*for (produto:fiilliste) {
        }
       // produtos.addAll(new Produto());
       // produtoAdapter = new ProdutoAdapter(context,produtos);*/
        produtoAdapter = new ContatosAdapter(context,contatos);
        listView.setAdapter(produtoAdapter);
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
