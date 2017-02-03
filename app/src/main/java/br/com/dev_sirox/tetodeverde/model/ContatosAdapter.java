package br.com.dev_sirox.tetodeverde.model;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import br.com.dev_sirox.tetodeverde.ChatActivity;
import br.com.dev_sirox.tetodeverde.R;

/**
 * Created by emilio on 17/12/2016.
 */
public class ContatosAdapter extends BaseAdapter {

    Context context;
    List<Contato> contatos;

    public ContatosAdapter(Context context, List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public int getCount() { //retorna o numero de elementos da coleção
        return contatos.size();
    }

    @Override
    public Object getItem(int position) { //retorna o elemento na pos. position
        return contatos.get(position);
    }

    @Override
    public long getItemId(int position) { //retorna o id do elemento na pos. position
        return position;
    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {
        //retorna o conteúdo da view (layout) na posição especificada
        Contato contato = contatos.get(position);

        View item = LayoutInflater.from(context).inflate(R.layout.item_contato, null);

        //Configurar os elementos do layout referente ao item
        //Chamamos o método findViewById a partir do objeto View especificado,
        //porque estamos configurando os componentes do seu conteúdo

        TextView txtEmpresa = (TextView) item.findViewById(R.id.txtEmpresa);
        TextView txtEndereco = (TextView) item.findViewById(R.id.txtEndereco);
        //TextView txtWhatsApp = (TextView) item.findViewById(R.id.txtWhatsApp);
        //TextView txtRedesSociais = (TextView) item.findViewById(R.id.txtRedesSociais);
        Button btnChat = (Button) item.findViewById(R.id.btnChat);
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(convertView.getContext(),ChatActivity.class);
                convertView.getContext().startActivity(intent);
            }
        });

        //Criamos um objeto representando os resources da aplicação, para buscar
        //dados contidos na pasta "res".
        Resources resources = context.getResources();

        txtEmpresa.setText(contato.getEmpresa());
        txtEndereco.setText(contato.getEndereco());
        //txtWhatsApp.setText(contato.getWhatsApp());
        //txtRedesSociais.setText(contato.getRedes_sociais());

        return item;
    }
}
