package main.list.operacoesBasicas;

public class Tarefa{
    private String descricao;
    public Tarefa(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    @Override
    public String toString(){
        return "As tarefas atuais são: " + descricao;
    }
}