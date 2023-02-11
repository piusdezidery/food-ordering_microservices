package Feedbackservice.Feedbackservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Feedbackservice.Feedbackservice.entity.FeedbackOrder;

import java.util.List;

public interface FeedbackOrderRepository extends JpaRepository<FeedbackOrder, Long> {
}
