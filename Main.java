import java.util.ArrayList;
import java.util.List;


class Aluno{
  private String nome;
  private List < Disciplina > disciplinas;

  public String getNome(){
    return nome;
  }

  public Aluno (String nome){
    this.nome = nome;
    this.disciplinas = new ArrayList <> ();
  }

  public void adicionarDisciplina (Disciplina disciplina){
    disciplinas.add (disciplina);
  }

  public void imprimir(){
    System.out.println("Aluno: " + nome);
    System.out.println("Disciplinas:");
    for (Disciplina disciplina : disciplinas) {
      System.out.println("- " + disciplina.getNome());
    }
    System.out.println();
  }
}


class Curso{
  private String nome;
  private List < Disciplina > disciplinas;

  public String getNome(){
    return nome;
  }

  public Curso (String nome){
    this.nome = nome;
    this.disciplinas = new ArrayList <> ();
  }

  public void adicionarDisciplina (Disciplina disciplina){
    disciplinas.add (disciplina);
  }

  public void imprimir() {
    System.out.println("Curso: " + nome);
    System.out.println("Disciplinas:");
    for (Disciplina disciplina : disciplinas) {
      System.out.println("- " + disciplina.getNome());
    }
    System.out.println();
  }
}


class Professor{
  private String nome;
  private List < Disciplina > disciplinas;

  public String getNome(){
    return nome;
  }

  public Professor (String nome){
    this.nome = nome;
    this.disciplinas = new ArrayList <> ();
  }

  public void adicionarDisciplina (Disciplina disciplina){
    disciplinas.add (disciplina);
  }

  public void imprimir(){
    System.out.println("Professor: " + nome);
    System.out.println("Disciplinas:");
    for (Disciplina disciplina : disciplinas) {
      System.out.println("- " + disciplina.getNome());
    }
    System.out.println();
  }
}


class Disciplina{
  private String nome;
  private List < Aluno > alunos;
  private List < Curso > cursos;
  private Professor professor;

  public String getNome(){
    return nome;
  }

  public Disciplina (String nome, Professor professor){
    this.nome = nome;
    this.professor = professor;
    this.alunos = new ArrayList <> ();
    this.cursos = new ArrayList <> ();
  }

  public void adicionarAluno (Aluno aluno){
    alunos.add (aluno);
  }

  public void adicionarCurso (Curso curso){
    cursos.add (curso);
  }

  public void imprimir(){
    System.out.println("Disciplina: " + nome);
    System.out.println("Professor: " + professor.getNome());
    System.out.println("Alunos:");
    for (Aluno aluno : alunos) {
      System.out.println("- " + aluno.getNome());
    }
    System.out.println("Cursos:");
    for (Curso curso : cursos) {
      System.out.println("- " + curso.getNome());
    }
    System.out.println();
  }
}


public class Main{
  public static void main (String[]args){

    Aluno aluno01 = new Aluno ("Lucas");
    Curso curso01 = new Curso ("Ciencia da Computacao");
    Professor professor01 = new Professor ("Hially");
    Disciplina disciplina01 = new Disciplina ("Programacao Orientada a objetos", professor01);


      aluno01.adicionarDisciplina (disciplina01);
      curso01.adicionarDisciplina (disciplina01);
      professor01.adicionarDisciplina (disciplina01);
      disciplina01.adicionarAluno (aluno01);
      disciplina01.adicionarCurso (curso01);


      aluno01.imprimir ();
      curso01.imprimir ();
      professor01.imprimir ();
      disciplina01.imprimir ();
  }
}
