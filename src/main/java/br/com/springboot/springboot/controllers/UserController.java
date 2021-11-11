package br.com.springboot.springboot.controllers;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.springboot.springboot.model.User;


@RestController // tornar a classe um rest
@RequestMapping("/users") // tda vez que eu entrar no localhost users vai cair nesse mapping.
  // hhtp://localhost:8080/users
public class UserController {
    // GET
    // POST
    // PUT
    // DELETE
    // PATCH

    private List<User> users = new ArrayList<>(); // criando uma lista de usuários

    @GetMapping ("/{id}") // anotation avisando que vai ser uma requisição do tipo GET
    public User users(@PathVariable Long id){ // para preender o id
        System.out.println("O id é: " + id);
        
        Optional<User> userFind = users.stream().filter(user -> user.getId() == id).findFirst(); // 
        if(userFind.isPresent()) {
            return userFind.get();
        } else{
            return null;
        }
        /* User user = new User();
        user.setId(1L);
        user.setName("weslley");
        user.setUsername("joker");
        return user;  */
    }
    @PostMapping("/")
    public User user(@RequestBody User user){ //para saber que o User é do body
        users.add(user);
        return user;
    }

    @GetMapping("/list")
    public List<User> list(){
        return users;
    }

}
