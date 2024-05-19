package org.exercise.javabank;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        int numeroConto = random.nextInt(1000) + 1;
        Conto conto = new Conto(numeroConto, nome);

        System.out.println("Conto creato con successo:");
        System.out.println(conto.getInformazioniConto());

        boolean esci = false;

        while (!esci) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Versare una somma");
            System.out.println("2. Prelevare una somma");
            System.out.println("3. Uscire");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci l'importo da versare: ");
                    double importoVersamento = scanner.nextDouble();
                    conto.versa(importoVersamento);
                    System.out.println("Operazione completata. Saldo attuale: " + conto.getSaldoFormattato());
                    break;
                case 2:
                    System.out.print("Inserisci l'importo da prelevare: ");
                    double importoPrelievo = scanner.nextDouble();
                    if (conto.preleva(importoPrelievo)) {
                        System.out.println("Operazione completata. Saldo attuale: " + conto.getSaldoFormattato());
                    } else {
                        System.out.println("Operazione fallita. Saldo attuale: " + conto.getSaldoFormattato());
                    }
                    break;
                case 3:
                    esci = true;
                    System.out.println("Uscita in corso...");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
    }
}
