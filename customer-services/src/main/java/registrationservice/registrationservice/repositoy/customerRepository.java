package customerservice.customerservice.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import customerservice.customerservice.entity.Registration;

public interface customerRepository extends JpaRepository<customer, Long> {
}
