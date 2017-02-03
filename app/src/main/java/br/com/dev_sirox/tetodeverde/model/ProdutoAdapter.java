package br.com.dev_sirox.tetodeverde.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.dev_sirox.tetodeverde.R;

/**
 * Created by sirox90 on 03/02/2017.
 */

public class ProdutoAdapter extends BaseAdapter {
    Context context;
    List<Produto> produtos;

    public ProdutoAdapter(Context context, List<Produto> produtos){
        this.context = context;
        this.produtos = this.produtos;
    }

    @Override
    public int getCount() { //retorna o numero de elementos da coleção
        return produtos.size();
    }

    @Override
    public Object getItem(int position) { //retorna o elemento na pos. position
        return produtos.get(position);
    }

    @Override
    public long getItemId(int position) { //retorna o id do elemento na pos. position
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //retorna o conteúdo da view (layout) na posição especificada
        Produto produto = produtos.get(position);

        View item = LayoutInflater.from(context).inflate(R.layout.item_produto, null);

        //Configurar os elementos do layout referente ao item
        //Chamamos o método findViewById a partir do objeto View especificado,
        //porque estamos configurando os componentes do seu conteúdo

        ImageView iv_logo = (ImageView) item.findViewById(R.id.imgLogo);
        TextView tv_descricao = (TextView) item.findViewById(R.id.txtProduto);

        //Criamos um objeto representando os resources da aplicação, para buscar
        //dados contidos na pasta "res".
        Resources resources = context.getResources();

        TypedArray logos = resources.obtainTypedArray(R.array.produtos);
        iv_logo.setImageDrawable(logos.getDrawable(produto.getLogo()));

        tv_descricao.setText(produto.getNome());

        return item;
    }
}
