package aula10;

public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    public int getMatr(){
        return this.matr;
    }
    public void setMatr(int matr){
        this.matr = matr;
    }

    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    //Métodos
    public void cancelarMatr(){
        System.out.println("Sua matrícula foi cancelada.");
    }
}
