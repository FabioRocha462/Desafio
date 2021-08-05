/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio
 */
public class Tarefa2 {
    /*Criando um método para receber uma String como parâmetro*/
    public void t2(String nome){
        /*Criando um Vetor do tipo String para receber os caracteres da variável nome e os separando usando o método Split()*/
        String vet[]=nome.split("");
        
        /*Criando uma variável do tipo inteira para receber o tamanho da String nome usando o método length()*/
        int a=nome.length();
          
          /*Usando um for para mostrar de forma invertida o vetor vet*/
          for(int i=a-1;i>=0;i--){
              //mostrando o vetor vet de forma invertida
              System.out.print(vet[i]);
          }
          System.out.println("");
    }
}
