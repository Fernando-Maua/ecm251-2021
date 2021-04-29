package br.maua.estudo_exececao;

public class testExcecaoString {
    public static void main(String[] args){
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException exception){
            System.out.println("Uma excecao aconteceu:" + exception.getMessage());
            frase = "";
            novaFrase = "";
        }
        System.out.println("Frase antiga:" + frase);
        System.out.println("Frase atual:" + novaFrase);
    }
}
