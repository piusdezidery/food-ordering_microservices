package registrationservice.registrationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import registrationservice.registrationservice.entity.Registration;
import registrationservice.registrationservice.repositoy.RegistrationRepository;
import registrationservice.registrationservice.service.RegistrationService;


@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;
    @Autowired
    private RegistrationRepository registrationRepository;

    @PostMapping("/add")
    public Registration addUser(@RequestBody Registration registration){
        return registrationService.addUser(registration);
    }

}
