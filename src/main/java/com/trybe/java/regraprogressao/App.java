package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    String value = scanner.next();
    int quantity = Integer.parseInt(value);
    String[] examesNames = new String[quantity];
    String[] examesWeight = new String[quantity];

    for (int i = 0; i < quantity; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      examesNames[i] = scanner.next();
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      examesWeight[i] = scanner.next();
    }

    scanner.close();
  }
}