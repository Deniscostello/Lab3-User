package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUser(@RequestBody User user){
        System.out.println("User name: "+ user.getUsername());
        System.out.println("User email: "+ user.getUserEmail());
        return user;
    }
}
