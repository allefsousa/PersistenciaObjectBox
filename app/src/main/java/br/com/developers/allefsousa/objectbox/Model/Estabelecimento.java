package br.com.developers.allefsousa.objectbox.Model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity // anotação para dizer que a classe é uma entidade no banco de dados
public class Estabelecimento {

    @Id(assignable = true) // anotation que define qual atributo sera o id da tabela e auto incremento
    private Long id;
    private String razaoSocial;
    private String nomeFantasia;

    public Estabelecimento(String razaoSocial, String nomeFantasia) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    public Estabelecimento(Long id, String razaoSocial, String nomeFantasia) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
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
}
