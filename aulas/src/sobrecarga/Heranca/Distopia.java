package sobrecarga.Heranca;

public class Distopia extends Livro {

    public Distopia(String titulo, String autor, boolean serie) {
        super(titulo);
        this.autor = autor;
        this.serie = serie;
    }
    public void exibirD(){
        System.out.println("O titulo é: "+this.titulo);
        System.out.println("O autor é: "+this.autor);
        System.out.println("Faz parte de uma série? "+this.serie);
                
    }
    
}
