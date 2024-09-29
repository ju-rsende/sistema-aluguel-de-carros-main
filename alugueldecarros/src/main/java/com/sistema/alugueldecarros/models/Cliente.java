package com.sistema.alugueldecarros.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String profissao;

    @ElementCollection
    @CollectionTable(name = "empregadores", joinColumns = @JoinColumn(name = "cliente_id"))
    @Column(name = "entidade_empregadora")
    private List<String> entidadesEmpregadoras;

    @ElementCollection
    @CollectionTable(name = "rendimentos", joinColumns = @JoinColumn(name = "cliente_id"))
    @Column(name = "rendimento")
    private List<Double> rendimentos;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<String> getEntidadesEmpregadoras() {
        return entidadesEmpregadoras;
    }

    public void setEntidadesEmpregadoras(List<String> entidadesEmpregadoras) {
        this.entidadesEmpregadoras = entidadesEmpregadoras;
    }

    public List<Double> getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(List<Double> rendimentos) {
        this.rendimentos = rendimentos;
    }
}
