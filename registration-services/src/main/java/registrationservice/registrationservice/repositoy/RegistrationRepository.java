package registrationservice.registrationservice.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import registrationservice.registrationservice.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
