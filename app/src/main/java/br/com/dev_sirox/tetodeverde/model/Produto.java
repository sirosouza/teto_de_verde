package br.com.dev_sirox.tetodeverde.model;

import android.widget.ImageView;

/**
 * Created by sirox90 on 03/02/2017.
 */
public class Produto {
    private String nome;
    private int logo;

    public Produto(String nome, int logo){
        this.nome = nome;
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
