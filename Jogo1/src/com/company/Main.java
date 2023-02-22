package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       boolean continuarPartida = true;

       Scanner scanner = new Scanner(System.in);
        Cenario mapa = new Cenario();
       String entrada;

       while( continuarPartida ) {
           System.out.println("entre com as posições x e y no formato x,y");
           entrada = scanner.nextLine();
           String[] numeros = entrada.split(",");
           int x = Integer.parseInt(numeros[0]);
           int y = Integer.parseInt(numeros[1]);
           System.out.println(("x = " + x + ", e y = " + y));
           if (entrada.equals("FIM")) break;
           continuarPartida = mapa.disparo(x,y);
           mapa.desenhaCenario();
       }

    }
}
