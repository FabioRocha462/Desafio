
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio
 */
public class Main {
    public static void main(String[]args){
        //criando o Scanner para ler o que é digitado pelo usuário
        Scanner input=new Scanner(System.in);
        //Variáveis que serão necessárias nos métodos
        String nome="";
        int number=0;
        //variável de controle do menu
        int escolha=1;
        //Criando um while para utilização do menu
        while(escolha!=0){
           
            //opções do menu, onde casa caso tem uma Tarefa que foi pedida
            System.out.println("RESPOSTAS DO DESAFIO");
            System.out.println("1-Tarefa 1");
            System.out.println("2-Tarefa 2");
            System.out.println("3-Tarefa 3");
            System.out.println("4-Tarefa 4");
            System.out.println("5-Tarefa 5");
            System.out.println("6-Tarefa 6");
            System.out.println("0-Sair!");
            
            //entrando com o valor de escolha
           
            escolha=input.nextInt();
            
            
            switch (escolha){
                case 1:
                    //inserindo dados
                    System.out.println("Digite um nome");
                    nome=input.next();
                    //instanciando Tarefa1
                    Tarefa1 taf1=new Tarefa1();
                    taf1.t1(nome);
                    break;
                    
                case 2:
                    //inserindo Dados
                    System.out.println("Digite seu nome");
                    nome=input.next();
                    //Instanciando Tarefa2
                    Tarefa2 taf2=new Tarefa2();
                    taf2.t2(nome);
                    break;
                    
                    
                case 3:
                    //entrando com os dados
                    System.out.println("Digite um nome");
                    nome=input.next();
                    //instanciando Tarefa3
                    Tarefa3 taf3=new Tarefa3();
                    taf3.t3(nome);
                    
                    break;
                    
                    
                case 4:
                    //entrando com os dados
                    System.out.println("Digite sua Data de Nascimento");
                    nome=input.next();
                    //instanciando Tarefa4
                    Tarefa4 taf4=new Tarefa4();
                    taf4.t4(nome);
                    break;
                    
                    
                case 5:
                    //entrando com os dados
                    System.out.println("Digite o DDD");
                    //fazendo um Try/catch caso o usuário não digite um inteiro
                    try{
                        number=input.nextInt();
                    }catch(Exception e){
                        System.out.println("Digite um número inteiro");
                        number=input.nextInt();
                    }
                    //instanciando Tarefa5
                    Tarefa5 tarf5=new Tarefa5();
                    tarf5.t5(number);
                    
                    break;
                    
                    
                case 6:
                    //entrando com os dados
                    System.out.println("Digite um número inteiro e positivo");
                    
                        number=input.nextInt();
                   
                    if(number<1){
                        while(number<1){
                           //entrando com os dados
                    System.out.println("Digite um número inteiro e positivo");
                     //fazendo um Try/catch caso o usuário não digite um inteiro
                    
                        number=input.nextInt();
                    
                        }
                    }
                    System.out.println("--------");
                    //instanciando Tarefa6
                    Tarefa6 tarf6=new Tarefa6();
                    tarf6.t6(number);
                    break;
                case 0:
                    System.out.println("SAIR!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
            
        }
    }

   

