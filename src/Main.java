//
//Scrivere una funzione che accetti in input un numeratore e un denominatore
//        Controlli che il numeratore e il denominatore non siano null
//        Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.


public class Main {
    public static void main(String[] args) {
        // Blocco di codice 1
        Integer numeratore1 = 2;
        Integer denominatore1 = null;

        controlloDivisione(numeratore1, denominatore1);

        // Blocco di codice 2
        Integer numeratore2 = 5;
        Integer denominatore2 = 0;

        controlloDivisione(numeratore2, denominatore2);
    }

    /**
     * @param numeratore
     * @param denominatore
     * @return
     */

    public static void controlloDivisione(Integer numeratore, Integer denominatore) {
        try {

            // Effettua la divisione se il denominatore è diverso da zero
            double risultato = numeratore.doubleValue() / denominatore.doubleValue();
            System.out.println(risultato);

        } catch (ArithmeticException e) {
            System.out.println("Errore: Impossibile dividere per zero.");
        } catch (NullPointerException e) {
            System.out.println("Errore: found null pointer " + e);
        }
    }
}


