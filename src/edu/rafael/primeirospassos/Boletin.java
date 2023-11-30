package edu.rafael.primeirospassos;
public class Boletin {
  public static void main(String[] args) {
    int mediaFinal = 8;
    if (mediaFinal < 6) {
      System.out.println("Aluno Reprovado");
    }else if(mediaFinal == 6){
      System.out.println("Prova Minerva");
    }else{
      System.out.println("Aluno Aprovado");
    }
  }
}
