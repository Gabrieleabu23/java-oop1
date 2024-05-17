package org.exercise.javashop;

import java.util.Random;

public class product {

    Random rand = new Random();

    private int codice = randomCode();
    private String nome;
    private String descrizione;
    private double prezzo = 0.0;
    private int iva = 0;

    private int error = 0;

    private int randomCode() {
        return rand.nextInt(120);
    }

    //CONSTRUCTOR PER IMPOSTARE I DATI TRAMITE NEW NEL MAIN
    public product(String nome, String descrizione, double prezzo, int iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = CheckPrice(prezzo);
        this.iva = iva;
    }

    private double CheckPrice(double prezzo) {
        if (prezzo < 0) {
            System.out.println("Il prezzo non può essere negativo. Impostato a 0.");
            error++;
        }
        return prezzo;
    }


    public double getBasePrice() {
        return error > 0 ? 0 : prezzo;
    }

    public double getFullPrice() {
        return error > 0 ? 0 : (prezzo * (1 + (double) iva / 100));
    }

    public String getFullName() {
        return String.format("%06d-%s", codice, nome);
    }

    // OVERRIDE PER FAR APPARIRE IL CODICE COME STRINGA ALL'INIZIO
    @Override
    public String toString() {
        return String.format("%06d", codice);
    }

//    GETTER E SETTER


    public int setCodice(int codice) {
        String codiceStringa = String.valueOf(codice);

        if  (codiceStringa.length() <=6){
            this.codice = codice;
            return this.codice;
        }
        return codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

}