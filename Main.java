/******************************************************************************
Implementação do algoritmo de ordenação de vetores Insertion Sort em um vetor de
tamanho setado pelo usuário com números aleatório gerados entre 0 e 99.

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
	    //usuário insere tamanho do vetor que será gerado para ordenação
	    Scanner ler = new Scanner(System.in); 
	    int tamVetor = ler.nextInt();
	    
	    int vetorOrdena[] = new int[tamVetor];
	    
	    int i, j, temp; //variaveis de índice e temporaria
	    
	    Random gerador = new Random(); //gerador de num aleatório
	    
	    //gerando vetor
	    //varivel i utilizado como ind
	    for(i = tamVetor; i>0 ;i-- ){
	        vetorOrdena[tamVetor-i] = gerador.nextInt(99) ; //vetor povoado de trás para frente
	    }
	    
	    //imprimo o vetor inicial
	    System.out.println("\nVetor aleatório:");
	    for (i=0;i<tamVetor ;i++ ){
	        System.out.println(vetorOrdena[i]);
	    }
	    
	    
	    //algoritmo de ordenação Insertion Sort
	    for(i=1;i<tamVetor ;i++ ){
	        if(vetorOrdena[i-1] > vetorOrdena[i]){
	            j = i; 
	            while(vetorOrdena[j-1]>vetorOrdena[j]){
	                temp = vetorOrdena[j-1];
	                vetorOrdena[j-1] = vetorOrdena[j];
	                vetorOrdena[j]=temp;
	                    if(j==1)
	                        break;
	                j--;
	            }
	        }
	    }
	    
	    //imprimo o resultado
	    System.out.println("\nVetor ordenado:");
	    for (i=0;i<tamVetor ;i++ ){
	        System.out.println(vetorOrdena[i]);
	    } 
	}
}
