package sobrecarga.Heranca;

public class Romance extends Livro {

    String trope;
        public String getTrope() {
            return trope;
        }


        public void setTrope(String trope) {
            this.trope = trope;
        }

    public Romance(String titulo, String autor, boolean serie, String trope) {
        super(titulo);
        this.autor = autor;
        this.serie = serie;
        this.trope = trope;
    }
    public void exibirR(){
        System.out.println("O titulo é: "+this.titulo);
        System.out.println("O autor é: "+this.autor);
        System.out.println("Faz parte de uma série? "+this.serie);
        System.out.println("Qual a trope? "+this.trope);
    }


   

    
        
    

    
}
