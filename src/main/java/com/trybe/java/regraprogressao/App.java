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
    String value = scanner.nextLine();
    int quantity = Integer.parseInt(value);
    String[] examesNames = new String[quantity];
    String[] examesWeight = new String[quantity];
    String[] examesGrade = new String[quantity];

    for (int i = 0; i < quantity; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      String name = scanner.nextLine();
      examesNames[i] = name;
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      String weight = scanner.nextLine();
      examesWeight[i] = weight;
      System.out.println("Digite a nota obtida para " + name + ":");
      examesGrade[i] = scanner.nextLine();
    }
    scanner.close();
    calculateGrade(examesGrade, examesWeight);
  }

  /**
   * Metodo calculateGrade.
   */
  public static void calculateGrade(String[] notas, String[] pesos) {
    float subSum = 0;
    int weightSum = 100;
    for (int i = 0; i < notas.length; i++) {
      int nota = Integer.parseInt(notas[i]);
      int peso = Integer.parseInt(pesos[i]);
      int result = nota * peso;
      subSum += result;
    }
    float finalGrade = subSum / weightSum;
    if (finalGrade >= 85) {
      System.out.println("Parabéns! Você alcançou " + finalGrade + "%! E temos o prazer de "
          +
          "informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação alcançada neste "
          +
          "período, " + finalGrade + "%, você não atingiu a pontuação mínima necessária "
          +
          "para sua aprovação.");
    }
  }
}