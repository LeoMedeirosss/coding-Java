package eventos;

import java.util.ArrayList;
import java.util.List;

import recursos.Recurso;

public class Evento {
    private String nome;
    private String data;
    private String local;
    private String descricao;
    private String responsavel;
    private List<Recurso> recursosNecessarios;
    private List<String> voluntariosInscritos;
    private int vagasDisponiveis;
  
    public Evento(String nome, String data, String local, String descricao, String responsavel, int vagasDisponiveis) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.recursosNecessarios = new ArrayList<>();
        this.voluntariosInscritos = new ArrayList<>();
        this.vagasDisponiveis = vagasDisponiveis;
    }
  
    public void adicionarRecursoNecessario(Recurso recurso) {
        recursosNecessarios.add(recurso);
    }
  
    public void removerRecursoNecessario(Recurso recurso) {
        recursosNecessarios.remove(recurso);
    }

public void inscreverVoluntario(String voluntario) {
        voluntariosInscritos.add(voluntario);
        vagasDisponiveis--;
    }
  
    public void cancelarInscricaoVoluntario(String voluntario) {
        voluntariosInscritos.remove(voluntario);
        vagasDisponiveis++;
    }
  
    public void verificarDisponibilidadeVagas() {
        System.out.println("Vagas Disponíveis: " + vagasDisponiveis);
    }
  
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + data);
        System.out.println("Local: " + local);
        System.out.println("Descrição: " + descricao);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Recursos Necessários:");
        for (Recurso recurso : recursosNecessarios) {
            recurso.exibirDetalhes();
        }
        System.out.println("Voluntários Inscritos: " + voluntariosInscritos);
        System.out.println("Vagas Disponíveis: " + vagasDisponiveis);
    }
}
