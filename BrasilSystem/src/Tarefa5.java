/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio
 */
public class Tarefa5 {
    //Criando um método que recebe um inteiro como parâmetro
    public void t5(int number){
        //utilizando um Switch para fazer a filtração do DDD
         switch(number){
             case 61:
                 System.out.println("DDD "+number+" Brasília");
                 break;
             case 71:
                 System.out.println("DDD "+number+" Salvador");
                 break;
             case 11:
                 System.out.println("DDD "+number+" São Paulo");
                 break;
             case 21:
                 System.out.println("DDD "+number+" Rio de Janeiro");
                 break;
             case 32:
                 System.out.println("DDD "+number+" Juiz de Fora");
                 break;
             case 19:
                 System.out.println("DDD "+number+" Campinas");
                 break;
             default:
                 System.out.println("DDD não encontrado");
                 break;
                 
         }
    }
}
