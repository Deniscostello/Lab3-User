package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private EmailService emailService;

    @Autowired
    public UserService(EmailService emailservice){
        this.emailService=emailservice;
    }
}
