public class Musica {
    private String titulo;
    private String artista;
    private double duracao;

    public Musica(){
    }

    public Musica(String titulo, String artista, double duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }


    public String getTitulo(){
        return titulo;
    }
    public void setTutulo(String titulo){
        this.titulo = titulo;
    }


    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }

    public double getDuracao(){
        return duracao;
    }
    public void setDuracao(double duracao){
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        return "Título: " +  titulo + "\nArtista: " + artista + "\nDuração: " + duracao + "\n-----";
    }

}
