package br.com.developers.allefsousa.objectbox.Model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;


@Entity // anotação para dizer que a classe é uma entidade no banco de dados
public class Estabelecimento {

    @Id // anotation que define qual atributo sera o id da tabela
    private Long id;
    private String razaoSocial;
    private String nomeFantasia;
    private String cidade;
    private String estado;
    private String segmento;

    public Estabelecimento() {
    }

    public Estabelecimento(Long id, String razaoSocial, String nomeFantasia, String cidade, String estado, String segmento) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cidade = cidade;
        this.estado = estado;
        this.segmento = segmento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }
}
