package models;

public class Musica{
    private static Long contador = 1L;

    private long idMusica;
    private String nome;
    private String artista;

    public Musica(String nome) {
        this.idMusica = contador++;
        this.nome = nome.toUpperCase();
    }

    public Musica(String nome, String artista) {
        this.idMusica = contador++;
        this.nome = nome.toUpperCase();
        this.artista = artista.toUpperCase();
    }


    public long getIdMusica() {
        return idMusica;
    }
    public void setIdMusica(long idMusica) {
        this.idMusica = idMusica;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista.toUpperCase();
    }
    
}
