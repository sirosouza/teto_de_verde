package br.com.dev_sirox.tetodeverde.model;

/**
 * Created by sirox90 on 03/02/2017.
 */

public class Profissional {
    private int codProf;
    private String nome;
    private String login;
    private String profile;
    private Long dataCad;

    public static final String ADMINISTRADOR = "ADMINISTRADOR";
    public static final String CORP_COND = "CORP_COND";
    public static final String COMUNIDADE = "COMUNIDADE";
    public static final String IMIGRANTE = "IMIGRANTE";
    public static final String PUBLICO = "PUBLICO";
    public static String perfil;

    public Profissional(int codProf, String nome, String login, String perfil, Long dataCad) {
        this.codProf = codProf;
        this.nome = nome;
        this.login = login;
        this.profile = perfil;
        this.dataCad = dataCad;
    }

    public static void Login() {

    }

    public int getCodProf() {
        return codProf;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getProfile() {
        return profile;
    }

    public Long getDataCad() {
        return dataCad;
    }
}
