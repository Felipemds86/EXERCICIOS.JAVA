package Exercicios;

import java.util.Scanner;

///// OS EXERCICIOS FORAM FEITOS PARA FUNCIONAREM INDIVIDUALMENTE. 
/// PRECISA COLOCAR A CLASSE MAIN, MAS DEIXEI EM METODOS SEPARADOS PRA FICAR MAIS BONITINHO. =) 

public class ExercicioFor {

    //Primeiro exercicio
    public static void um() {
        int numero1 = 1;
        int numeroFinal = 100;

        System.out.print("Os números pares entre " + numero1 + " e " + numeroFinal + " são:");
        for (int numero = numero1; numero <= numeroFinal; numero++) {
            if (numero % 2 == 0) {
                System.out.print(" " + numero);
            }
        }
    }

    //Segundo exercicio
    public static void dois() {
        int entrada;

        Scanner s = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = s.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(resultado);   
            multiplicador++;
        }
        s.close();
        
    }
        
    //Terceiro Exercicio
    public static void tres() {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite quantas pessoas sao: ");
        int qts = s.nextInt();
        int v[] = new int[qts];
        int soma =0, i;

        for (i = 0; i < qts; i++) {
            System.out.println("Digite a" + i + "idade");
            v[i] = s.nextInt();

            soma = soma + v[i];
        }

        System.out.println("A quantidade de notas foi:" + v.length);
        System.out.println("A media das notas foi:" + (soma/qts));
        s.close();

    }

    //Quarto Exercicio
    public static void quatro() {
        Scanner s = new Scanner(System.in);
        int par = 0, i, num, impar = 0;

        for (i=1; i <=10; i++) {
            System.out.println("Digite o " + i + "º número");
            num = s.nextInt();

            if (num % 2 == 0) {
                par++;
            }

            else {
                impar++;
            }
        }

        System.out.println("Foram digitados " + par + " números pares \n");
        System.out.println("E " + impar + " números ímpares");

        s.close();
    }

    //Quinto Exercicio
    public static void cinco() {
        Scanner s = new Scanner(System.in);

        int i, num;

        System.out.println("Escreva um numero positivo e inteiro: ");
        num = s.nextInt();

        for (i = 1; i <= num; i--) {
            System.out.println("x: " + num + "i: " + i + ", i*num =" + num*i );
        }
        s.close();
    }
}
