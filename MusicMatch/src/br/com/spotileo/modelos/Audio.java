package br.com.spotileo.modelos;

public class Audio {
    private String titulo;
    private int totalReproducao;
    private int totalCurtidas;
    private int classificacao;


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalReproducao++;
    }

    public void classifica(){
        if(totalCurtidas >= 25 ){
            classificacao = 10;
        }else{
            classificacao = 5;
        }
    }
}
