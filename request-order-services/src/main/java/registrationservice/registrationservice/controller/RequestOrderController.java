package registrationservice.registrationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import registrationservice.registrationservice.entity.RequestOrder;
import registrationservice.registrationservice.service.RequestOrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class RequestOrderController {
    @Autowired
    private RequestOrderService requestOrderService;

    @PostMapping("/add")
    public RequestOrder addRequestOrder(@RequestBody RequestOrder requestOrder){
        return requestOrderService.addRequestOrder(requestOrder);
    }

    @GetMapping("/find/{id}")
    public RequestOrder getRequestedOrder(@PathVariable("id") Long id){
        return requestOrderService.getRequestedOrder(id);
    }
}
