package aula01;

public class TesteCarro {
    public static void main(String[] args) {
        
        Carro mustang = new Carro();
        mustang.modelo = "Mustang";
        mustang.marca = "Ford";
        mustang.cor = "Azul";
       
        System.out.println("O modelo do carro é: "+mustang.modelo);
        System.out.println("A marca do carro é: "+mustang.marca);
        System.out.println("A cor do carro é: "+mustang.cor);

        mustang.acelerar();
        mustang.frear();

    }
}
