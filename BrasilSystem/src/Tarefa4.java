/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio
 */
public class Tarefa4 {
    //Criando um método que recebe uma String como parâmetro
    public void t4(String data){
        //Separando os valores da data em um vetor usando o Split, usando o / como argumento
        String vet[]=data.split("/");
        
        //Criando outro vetor para separar os números do ano que são compostos por 4 números
        String vetor[]=vet[2].split("");
        
        
        //criando 3 variáveis do tipo inteira para receber o somátorio
        int a,b,c=0;
        
        //Transformando os valores que estão em String para int com o parseInt
        a=Integer.parseInt(vet[0]);
        b=Integer.parseInt(vet[1]);
        
        // Para a variável C irei usar um for para fazer o soma
        
        //variável para receber a soma de cada elemento do vetor 
        int d;
        //for usado para transformar os valores do Segundo vetor de Strings em inteiros e somalos e guardalos em c
        for(int i=0;i<vetor.length;i++){
            d=Integer.parseInt(vetor[i]);
            c=c+d;
            
        }
        //mostrando na tela o resultado
        
        System.out.print(vet[0]+" + "+vet[1]+" + "+vetor[0]+" + "+vetor[1]+" + "+vetor[2]+" + "+vetor[3]+"=");
        System.out.print(a+b+c);
        System.out.println("");
    }
}
