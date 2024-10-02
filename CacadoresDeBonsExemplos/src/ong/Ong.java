package ong;

import java.util.ArrayList;
import java.util.List;

import eventos.Evento;
import recursos.RecursoFinanceiro;
import recursos.RecursoMaterial;
import recursos.RecursoPerecivel;

public class Ong {
    private String nome;
    private String endereco;
    private String contato;
    private String areaAtuacao;
    private List<Evento> eventos;
    private List<RecursoFinanceiro> recursosFinanceiros;
    private List<RecursoMaterial> recursosMateriais;
    private List<RecursoPerecivel> recursosPereciveis;
    
    public Ong(String nome, String endereco, String contato, String areaAtuacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.areaAtuacao = areaAtuacao;
        this.eventos = new ArrayList<>();  
        this.recursosFinanceiros = new ArrayList<>();
        this.recursosMateriais = new ArrayList<>();
        this.recursosPereciveis = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void removerEvento(Evento evento) {
        eventos.remove(evento);
    }

    public void adicionarRecursoFinanceiro(RecursoFinanceiro recurso) {
        recursosFinanceiros.add(recurso);
    }

    public void removerRecursoFinanceiro(RecursoFinanceiro recurso) {
        recursosFinanceiros.remove(recurso);
    }

    public void adicionarRecursoMaterial(RecursoMaterial recurso) {
        recursosMateriais.add(recurso);
    }

    public void removerRecursoMaterial(RecursoMaterial recurso) {
        recursosMateriais.remove(recurso);
    }

    public void adicionarRecursoPerecivel(RecursoPerecivel recurso) {
        recursosPereciveis.add(recurso);
    }

    public void removerRecursoPerecivel(RecursoPerecivel recurso) {
        recursosPereciveis.remove(recurso);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    public List<RecursoFinanceiro> listarRecursosFinanceiros() {
        return recursosFinanceiros;
    }

    public List<RecursoMaterial> listarRecursosMateriais() {
        return recursosMateriais;
    }

    public List<RecursoPerecivel> listarRecursosPereciveis() {
        return recursosPereciveis;
    }

    public void imprimirDetalhes() {
        System.out.println("Nome da ONG: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Contato: " + contato);
        System.out.println("Área de Atuação: " + areaAtuacao);
        System.out.println("Eventos:");
        for (Evento evento : eventos) {
            evento.imprimirDetalhes();
        }
        System.out.println("Recursos Financeiros:");
        for (RecursoFinanceiro recurso : recursosFinanceiros) {
            recurso.exibirDetalhes();
        }
        System.out.println("Recursos Materiais:");
        for (RecursoMaterial recurso : recursosMateriais) {
            recurso.exibirDetalhes();
        }
        System.out.println("Recursos Perecíveis:");
        for (RecursoPerecivel recurso : recursosPereciveis) {
            recurso.exibirDetalhes();
        }
    }
    
    public void imprimirDetalhesCadastro() {
        System.out.println("Nome da ONG: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Contato: " + contato);
        System.out.println("Área de Atuação: " + areaAtuacao);
       
    }
}