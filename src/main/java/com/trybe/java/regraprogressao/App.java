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
    int qtdActivities = Integer.parseInt(scanner.nextLine());

    String[] names = new String[qtdActivities];
    int[] weights = new int[qtdActivities];
    int[] values = new int[qtdActivities];
    int totalValues = 0;
    int totalWeights = 0;

    for (int i = 0; i < qtdActivities; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      names[i] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      weights[i] = Integer.parseInt(scanner.nextLine());
      totalWeights += weights[i];

      System.out.println("Digite a nota obtida para " + names[i] + ":");
      values[i] = Integer.parseInt(scanner.nextLine());
      totalValues += values[i] * weights[i];
    }
    if (totalValues != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
    double percentage = (double) totalValues / totalWeights;

    if (percentage >= 85.0) {
      System.out.println("Parabéns! Você alcançou " + percentage
              + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação"
              + "alcançada neste período, " + percentage
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
    scanner.close();
  }
}