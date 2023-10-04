/* Faça um programa que recebe o salário de um colaborador 
e o reajuste segundo o seguinte critério, baseado no salário atual;
a. Salários até R$ 280,00 (incluindo): aumento de 20%;
b. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
c. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
d. Salários de R$ 1500,00 em diante: aumento de 5%

Após o aumento ser realizado; informe na tela;
a. O salário antes do reajuste;
b. O percentual de aumento aplicado;
c. O valor do aumento;
d. O novo salário, após o aumento.  
 */

public class Q9 {
    public static void main(String [] args){
        double valorSalario = 1500;
        double porcentagem = 0;
        double aumento;
        double novoSalario;
        
        if(valorSalario <= 280){
            porcentagem = 20;
        }else if(valorSalario > 280 && valorSalario <= 700){
            porcentagem = 15;
        }else if(valorSalario > 700 && valorSalario <= 1500){
            porcentagem = 10;
        }else if(valorSalario > 1500){
            porcentagem = 5;
        }
        
        aumento = valorSalario + ((valorSalario * porcentagem)/100);
        novoSalario = valorSalario + aumento;


        System.out.println("Salário antes do reajuste: " + valorSalario);
        System.out.println("Percentual: "+porcentagem);
        System.out.println("Aumento: R$"+aumento);
        System.out.println("Novo salário: R$"+novoSalario);
    }
}
