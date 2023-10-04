/*8)	Imprima a seguinte tabela usando fors encadeados:
1
2 4
3 6 9
4 8 12 13 
n n*2 n*3 .... n*n
*/

public class Q8 {
    public static void main(String [] args){
        int num = 5;

        for(int linha = 1; linha <= num; linha++){
            for(int col = 1; col <= linha; col++){
                System.out.println(linha*col + " ");
            }
            System.out.println();
        }
    }
}
