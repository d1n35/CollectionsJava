package main.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
          tarefasParaRemover.add(t);
        }
      }
      tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de tarefas na lista é " + listaTarefa.obterTotalTarefas());
        listaTarefa.adicionarTarefa("jogar");
        System.out.println("O número total de tarefas na lista é " + listaTarefa.obterTotalTarefas());
        listaTarefa.adicionarTarefa("jogar");
        System.out.println("O número total de tarefas na lista é " + listaTarefa.obterTotalTarefas());
        listaTarefa.adicionarTarefa("estudar");
        System.out.println("O número total de tarefas na lista é " + listaTarefa.obterTotalTarefas());
        listaTarefa.removerTarefa("jogar");
        listaTarefa.obterDescTarefas();
        System.out.println("O número total de tarefas na lista é " + listaTarefa.obterTotalTarefas());

    }   
}
