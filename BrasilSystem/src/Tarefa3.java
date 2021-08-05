/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio
 */
public class Tarefa3 {
    //Criando um método que recebe uma String como parâmetro
    public void t3(String nome){
        
        //Criando uma variável do tipo inteira para receber o tamanho da String nome
        int a=nome.length();
        //caso o nome tenha apenas um caractere
        if(a==1){
            System.out.println(nome);
        }
        //dividindo a por 2
        a=a/2;
        //Passando nome para um vetor de String vet
        String vet[]=nome.split("");
        //Verificando se a metade é um número par ou ímpar, se caso impar mostrar um caractere a mais
        if(a%2!=0){
            a++;
            //Usando um for para para mostrar o vetor vet
            for(int i=0;i<=a;i++){
                System.out.print(vet[i]);
            }
        }else{
           //Fazendo um for para mostrar a metade da String 
            for(int i=0;i<=a;i++){
                System.out.print(vet[i]);
            }
        }
        
        
        System.out.println("");
        
        
        
        
    }
    
}
