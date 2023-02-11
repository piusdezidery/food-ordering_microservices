package registrationservice.registrationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrationservice.registrationservice.entity.Registration;
import registrationservice.registrationservice.repositoy.RegistrationRepository;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    public Registration addUser(Registration registration) {
        return registrationRepository.save(registration);
    }
}
