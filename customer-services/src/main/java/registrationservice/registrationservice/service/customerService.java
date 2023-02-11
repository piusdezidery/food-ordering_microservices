package registrationservice.registrationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrationservice.registrationservice.entity.Registration;
import registrationservice.registrationservice.repositoy.customerRepository;

@Service
public class customerService {
    @Autowired
    private customerRepository registrationRepository;

    public Registration addUser(Registration registration) {
        return registrationRepository.save(registration);
    }
}
