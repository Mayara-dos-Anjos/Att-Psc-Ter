package sobrecarga.Heranca;

public class Fantasia extends Livro {

    String tipoDeFantasia;
        public String getTipoDeFantasia() {
        return tipoDeFantasia;
    }


        public void setTipoDeFantasia(String tipoDeFantasia) {
        this.tipoDeFantasia = tipoDeFantasia;
    }

    public Fantasia(String titulo, String autor, String tipoDeFantasia) {
        super(titulo);
        this.autor = autor;
        this.tipoDeFantasia = tipoDeFantasia;
        this.serie = false;
    }
    public void exibirF(){
        System.out.println("O titulo é: "+this.titulo);
        System.out.println("O autor é: "+this.autor);
        System.out.println("Faz parte de uma série? "+this.serie);
        System.out.println("O tipo de fantasia é: "+this.tipoDeFantasia);        

    }


 
    
}
