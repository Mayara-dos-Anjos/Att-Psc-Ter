package sobrecarga.Heranca;

public class Livro {
    String titulo;
    String autor;
    boolean serie;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isSerie() {
        return serie;
    }
    public void setSerie(boolean serie) {
        this.serie = serie;
    }
    
   

     public Livro (String titulo){
        this.titulo = titulo;
        this.autor = "<NAME>";
        this.serie = false;
    }

}
