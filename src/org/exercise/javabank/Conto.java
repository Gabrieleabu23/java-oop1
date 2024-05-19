package org.exercise.javabank;

public class Conto {
    private final int numeroConto;
    private String nomeProprietario;
    private double saldo;

    public Conto(int numeroConto, String nomeProprietario) {
        this.numeroConto = numeroConto;
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0.0;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void versa(double importo) {
        if (importo > 0) {
            saldo += importo;
        } else {
            System.out.println("Importo non valido per il versamento.");
        }
    }

    public boolean preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            return true;
        } else {
            System.out.println("Importo non valido o saldo insufficiente per il prelievo.");
            return false;
        }
    }

    public String getInformazioniConto() {
        return "Numero conto: " + numeroConto + "\nNome proprietario: " + nomeProprietario + "\nSaldo: " + String.format("%.2f", saldo) + "€";
    }

    public String getSaldoFormattato() {
        return String.format("%.2f", saldo) + "€";
    }
}
