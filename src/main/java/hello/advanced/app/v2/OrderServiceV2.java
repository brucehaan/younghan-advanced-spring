package hello.advanced.app.v2;

import hello.advanced.app.v1.OrderRepositoryV1;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceV2 {
    private final OrderRepositoryV2 orderRepository;

    public OrderServiceV2(OrderRepositoryV2 orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
