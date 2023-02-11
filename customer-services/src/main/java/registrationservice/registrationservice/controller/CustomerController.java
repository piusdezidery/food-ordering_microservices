package customerservice.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import customerservice.customerservice.entity.customer;
import customerservice.customerservice.repositoy.customerRepository;
import customerservice.customerservice.service.customerService;


@RestController
@RequestMapping("/customers")
public class customerController {

    @Autowired
    private customerService customerService;
    @Autowired
    private customerRepository customerRepository;

    @PostMapping("/add")
    public customer addUser(@RequestBody customer customer){
        return customerService.addUser(customer);
    }

}
