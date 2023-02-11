package FeedbackOrderservice.FeedbackOrderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import FeedbackOrderservice.FeedbackOrderservice.entity.FeedbackOrder;
import FeedbackOrderservice.FeedbackOrderservice.service.FeedbackOrderService;

import java.util.List;

@RestController
@FeedbackMapping("/orders")
public class FeedbackOrderController {
    @Autowired
    private FeedbackOrderService FeedbackOrderService;

    @PostMapping("/add")
    public FeedbackOrder addFeedbackOrder(@FeedbackBody FeedbackOrder FeedbackOrder){
        return FeedbackOrderService.addFeedbackOrder(FeedbackOrder);
    }

    @GetMapping("/find/{id}")
    public FeedbackOrder getFeedbackedOrder(@PathVariable("id") Long id){
        return FeedbackOrderService.getFeedbackedOrder(id);
    }
}
