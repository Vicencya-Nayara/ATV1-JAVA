/* Imprima os fatoriais de 1 a 10.
O fatorial de um número n é n * (n-1) * (n-2) * ... * 1. Lembre-se de utilizar os parênteses.
O fatorial de 0 é 1
O fatorial de 1 é (0!) * 1 = 1
O fatorial de 2 é (1!) * 2 = 2
O fatorial de 3 é (2!) * 3 = 6
O fatorial de 4 é (3!) * 4 = 24
 */

public class Q6 {
    public static void main(String [] args){
        int num;
        int fatorial = 1;

        for(num=1; num<=10; num++){
            fatorial = fatorial * num;
            System.out.println("O fatorial de "+ num +" é (" +(num-1) +"!) * "+num+" = " +fatorial);
        }
    }
    
}
