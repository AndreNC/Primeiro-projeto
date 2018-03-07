
package br.com.conversao;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ConvertendoRomanos {
    public static void main(String[] args) {
        
        String opcao; 
        
        
        Scanner escolher = new Scanner(System.in);
        
        System.out.println("Escolha entre opção 'a' converter de arábicos para romanos ou opção 'b' de romanos para arábicos: ");
       
        opcao = escolher.nextLine();
        
        
        if("a".equals(opcao) ){
             
        Scanner teclado = new Scanner(System.in);
        int numero, k;
        int vaNum[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String vaRom[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        while(true){
            System.out.println("Insira um número arábico para conveter em romano: ");
            numero = teclado.nextInt();
            if(numero==0)
                break;
            System.out.printf("%-4d", numero);
            k=0;
            while(numero>0){
                if(numero>=vaNum[k]){
                    System.out.println(vaRom [k]);
                    numero=numero - vaNum[k];
                }
                else
                    k++;
            }
            
            break;
        }
        }else if ("b".equals(opcao)){
             
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um número romano para converter em arabico: ");
        String romano = ler.nextLine();
        
        char Rom[] = {' ','I', 'V','X','L','C','D','M'};
        int valor[] = {0,1,5,10,50,100,500,1000};
        int ant = 0;
        int soma = 0;
        char letra = ' ';
        for (int i = 0; i < romano.length(); i++) {
            letra = romano.charAt(i);
            for (int j = 0; j < Rom.length; j++) {
                if(letra == Rom[j]){
                    soma = soma + valor [j];
                    if(ant < valor[j]){
                        soma = soma - ant*2;
                        ant = valor[j];
                    }
                }
            }
            
        }
        System.out.println(soma);
        }else{
            System.out.println("Opção inválida!");
        }      
    }   
}
