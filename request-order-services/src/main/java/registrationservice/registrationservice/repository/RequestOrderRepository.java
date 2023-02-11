package registrationservice.registrationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import registrationservice.registrationservice.entity.RequestOrder;

import java.util.List;

public interface RequestOrderRepository extends JpaRepository<RequestOrder, Long> {
}
