package registrationservice.registrationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrationservice.registrationservice.entity.RequestOrder;
import registrationservice.registrationservice.repository.RequestOrderRepository;

import java.util.List;

@Service
public class RequestOrderService {
    @Autowired
    private RequestOrderRepository requestOrderRepository;

    public RequestOrder getRequestedOrder(Long id) {
        return requestOrderRepository.findById(id).get();
    }

    public RequestOrder addRequestOrder(RequestOrder requestOrder) {
        return requestOrderRepository.save(requestOrder);
    }
}


