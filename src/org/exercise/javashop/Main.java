package org.exercise.javashop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nome del prodotto: ");
        String nome = scanner.nextLine();
        System.out.println();
        System.out.print("Inserisci la descrizione del prodotto del prodotto: ");
        String descrizione = scanner.nextLine();
        System.out.println();
        System.out.print("Inserisci il prezzo del prodotto: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println();
        System.out.print("Inserisci l'iva: ");
        int vat = Integer.parseInt(scanner.nextLine());

        System.out.println("Dettagli del prodotto ********************* ");

        product product = new product(nome, descrizione, price, vat);

        System.out.println("Codice Prodotto: \t" + product);
        System.out.printf("Prezzo senza iva:\t %.2f € \n", product.getBasePrice());
        System.out.printf("Prezzo con iva:\t %.2f € \n", product.getFullPrice());
        System.out.println("Codice-nome del prodotto: \t" + product.getFullName());

//        SETTER
        product.setCodice(19923);
        product.setNome("Nuovo Nome");
        product.setDescrizione("lorem ipsum");
        product.setPrezzo(150.0);
        product.setIva(10);

        System.out.println("SETTER-***********************");
        // Stampiamo le nuove informazioni del prodotto
        System.out.println("Nuovo nome del prodotto: \t" + product.getFullName());
        System.out.printf("Nuovo prezzo senza iva:\t %.2f € \n", product.getBasePrice());
        System.out.printf("Nuovo prezzo con iva:\t %.2f € \n", product.getFullPrice());
        scanner.close();
    }
}
