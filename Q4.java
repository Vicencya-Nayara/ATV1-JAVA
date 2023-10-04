//Elabore um código que ao informar um número, imprima se este número é primo.

public class Q4 {
    public static void main(String [] args){
        int valor = 150;
        int divisor = 0;
        for(int i=1; i<=valor; i++){
            if(valor%i==0){
                divisor++;
            }
        }
        if(divisor==2){
            System.out.println("É primo");
        }else{
            System.out.println("Não é primo");
        }
    }
}
