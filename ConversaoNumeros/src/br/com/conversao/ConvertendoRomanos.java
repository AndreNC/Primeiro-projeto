
package br.com.conversao;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ConvertendoRomanos {
    public static void main(String[] args) {
        int unidade, dezena, centena, milhar, numero, temp =0;
        String [] unidadex = {"I","II","III","IV","V","VI","VII","VII","IX"}; //Array de tamnaho 9 . 0,1,2,3,4,5,6,7,8
        String [] dezenax = {"X","XX","XXX","XL","L","LX","LXX","LXXX","'XC"};
        String [] centenax = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String [] milharx =  {"M", "MM", "MMM"};      
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Convertendo números arabicos em romanos de 1 até 3999");
        System.out.println("=======================================================");
        System.out.println("Insira um número para converter");
        numero = entrada.nextInt();
        
        unidade = numero % 10;
        numero /= 10;
        
        dezena = numero % 10;
        numero/= 10;
        
        centena = numero % 10;
        numero/= 10;
        
        milhar = numero % 10;
        numero/= 10;
        System.out.println();
        System.out.println("Resultados em romanos: ");
        
        for (int i = 0; i < milharx.length; i++) {
            if(milhar == 3){
                System.out.println(milharx[2]);
                break;
            }else if (milhar == i && milhar != 0){
                temp = i - 1;
                System.out.println(milharx[temp]);
            }
        }
        
        for (int i = 0; i < centenax.length; i++) {
            if(centena == 9){
                System.out.println(centenax[8]);
                break;
            }else if (centena == i && centena != 0){
                temp = i - 1;
                System.out.println(centenax[temp]);
            }
        }
        
        for (int i = 0; i < dezenax.length; i++) {
            if(dezena == 9){
                System.out.println(dezenax[8]);
                break;
            }else if (dezena == i && dezena != 0){
                temp = i - 1;
                System.out.println(dezenax[temp]);
            }
        }
        
        for (int i = 0; i < unidadex.length; i++) {
            if(unidade == 9){
                System.out.println(unidadex[8]);
                break;
            }else if (unidade == i && unidade != 0){
                temp = i - 1;
                System.out.println(unidadex[temp]);
            }
        }
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um número romano: ");
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
        
    }   
}
