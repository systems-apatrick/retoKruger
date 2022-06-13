package reto.kruger.vacunacion.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reto.kruger.vacunacion.model.User;

@RestController
public class UsersController {
    @RequestMapping(value = "user/{id_user}")
    public User getUsuario (){
        User user = new User();
        user.setName_user("patricio");
        user.setEmail("aa@gmil.com");
        user.setPass_user("Liosdsa");
        return user;
    }
}
