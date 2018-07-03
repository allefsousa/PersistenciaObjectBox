package br.com.developers.allefsousa.objectbox.Model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created by allef on 03/07/2018.
 */
@Entity // anotação para dizer que a classe é uma entidade no banco de dados
public class Estabelecimento {

    @Id // anotation que define qual atributo sera o id da tabela
    private Long id;


}
