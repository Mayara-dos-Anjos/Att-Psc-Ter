package sobrecarga.Heranca;

public class Fantasia extends Livro {

    String tipoDeFantasia;

    public Fantasia(String titulo, String autor, String tipoDeFantasia) {
        super(titulo);
        this.autor = autor;
        this.tipoDeFantasia = tipoDeFantasia;
        this.serie = false;
    }
    
}
