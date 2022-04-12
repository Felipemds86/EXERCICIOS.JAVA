package Exercicios;

import java.util.Scanner;

///// OS EXERCICIOS FORAM FEITOS PARA FUNCIONAREM INDIVIDUALMENTE. 
/// PRECISA COLOCAR A CLASSE MAIN, MAS DEIXEI EM METODOS SEPARADOS PRA FICAR MAIS BONITINHO. =) 

public class ExercicioDoWhile {

    //Primeiro exercicio
    public static void um() {
        Scanner s = new Scanner(System.in);

        int num;
        System.out.println("Digite os numeros: ");

        do {
            num = s.nextInt();
        } while (num > 1);

        s.close();

    }

    //Segundo exercicio
    public static void dois() {
        Scanner s = new Scanner(System.in);
            int num, count = 0;
            System.out.println("Digite os numeros: ");

            do {
                num = s.nextInt();
                count += num;
            } while (num != 0);
        
        s.close();

    }