import java.util.Arrays;

public class Main {
    //Scrivere una funzione che accetti un array in input e provi a dividere un numero
    //dell'array per 0 e gestisca sia l'eccezione della divisione che quella di indice
    //non presente nell'array, leggendone il messaggio.
    //Eseguire sempre un blocco di codice scrivendo un messaggio in console
    public static void main(String[] args) {
        int [] arrayInput = {6,8,2,6,90};
        int div = 2;

        try{
            System.out.println(Arrays.toString(divide(arrayInput, div)));
        }catch(ArithmeticException e){
            System.out.println("Cannot divide a nunber by zero!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fix the loop, array out of bound!");
        }
    }
    public static int[] divide(int[] array, int num){
        int[] resultDiv = new int[array.length];
        for(int i = 0; i<= array.length ; i++){
            resultDiv [i] = array[i]/num;
        }
        return resultDiv;
    }
}