package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private Emailservice emailService;

    @Autowired
    public UserService(Emailservice emailservice){
        this.emailService=emailservice;
    }

    public void registerUser(String username, String email){
        emailService.sendEmail(email, "Welcome");
        //System.out.println(email);
    }
}
