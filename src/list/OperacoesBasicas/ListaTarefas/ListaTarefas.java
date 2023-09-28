package list.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> TarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listaTarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                TarefasParaRemover.add(t);
            }
        }
        listaTarefas.removeAll(TarefasParaRemover);

//      listaTarefas.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));

    }

    public int obterNumeroTotalTarefas() {
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
    }
}
