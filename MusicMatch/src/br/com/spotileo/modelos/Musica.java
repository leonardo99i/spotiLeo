package br.com.spotileo.modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibeMusica() {
        System.out.println("-----------------------------------");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Album: " + getAlbum());
        System.out.println("Genero: " + getGenero());
        System.out.println("Curtidas: " + getTotalCurtidas());
        System.out.println("Reproduções: " + getTotalReproducao());
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("-----------------------------------");
    }
}
