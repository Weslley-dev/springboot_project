package br.com.springboot.springboot.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // permite criacao de construtor que nao tenha argumentos

public class User { // com o lombok não preciso digitar tds os getters e setters
    // basta usar o @Getter @Setter e para criar o construtor 
    // para conseguirmos passar para o contrutor é utilizar o AllargsConstructor

    private long id;
    private String name;
    private String username;
  

    
}
