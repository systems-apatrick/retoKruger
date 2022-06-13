package reto.kruger.vacunacion.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reto.kruger.vacunacion.service.Users;

@RestController
public class UsersController {
    @RequestMapping(value = "user/{id_user}")
    public Users getUsuario (){
        Users user = new Users();
        user.setName_user("patricio");
        user.setEmail("aa@gmil.com");
        user.setPass_user("Liosdsa");
        return user;
    }
}
