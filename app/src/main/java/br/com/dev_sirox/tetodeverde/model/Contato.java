package br.com.dev_sirox.tetodeverde.model;

import java.util.Date;

/**
 * Created by emilio on 17/12/2016.
 */
public class Contato {
    private int codigo;
    private String empresa;
    private String endereco;
    private String whatsApp;
    private String redes_sociais;

    public Contato(int codigo, String empresa, String endereco, String whatsApp, String redes_sociais) {
        this.codigo = codigo;
        this.empresa = empresa;
        this.endereco = endereco;
        this.whatsApp = whatsApp;
        this.redes_sociais = redes_sociais;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(String whatsApp) {
        this.whatsApp = whatsApp;
    }

    public String getRedes_sociais() {
        return redes_sociais;
    }

    public void setRedes_sociais(String redes_sociais) {
        this.redes_sociais = redes_sociais;
    }
}
