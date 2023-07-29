package br.com.spotileo.modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }
    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibePodcast(){
        System.out.println("-----------------------------------");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Apresentador: " + getApresentador());
        System.out.println("Nome do Episodio: " + getDescricao());
        System.out.println("Curtidas: " + getTotalCurtidas());
        System.out.println("Total de Reproduções: " + getTotalReproducao());
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("-----------------------------------");
    }
    

    
}
