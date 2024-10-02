package eventos;

import java.util.ArrayList;
import java.util.List;

import recursos.RecursoMaterial;

public class PontosDeColeta {
    private String nome;
    private String endereco;
    private List<RecursoMaterial> recursos;

    public PontosDeColeta(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.recursos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<RecursoMaterial> getRecursos() {
        return recursos;
    }

    public void adicionarRecurso(RecursoMaterial recurso) {
        recursos.add(recurso);
    }

    public void removerRecurso(RecursoMaterial recurso) {
        recursos.remove(recurso);
    }
}
