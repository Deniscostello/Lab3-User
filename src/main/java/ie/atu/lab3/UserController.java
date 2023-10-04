package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService us;

    @Autowired
    public void ConstuctorInjectedService(UserService us){
        this.us= us;
    }




    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){
        us.registerUser(name, email);
         return "With IoC";

    }
}
