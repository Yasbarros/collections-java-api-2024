package OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    
    private List<Tarefa> tarefaList;
    
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List <Tarefa> tarefasParaRemover = new ArrayList<>();
        
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Estudar");
        listaTarefa.adicionarTarefa("Cozinhar");
        listaTarefa.adicionarTarefa("Lavar");

        System.out.println("O total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("lavar");

        System.out.println("O total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("Todas as tarefas: " + listaTarefa.tarefaList);
    }

}