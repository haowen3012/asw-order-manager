package asw.ordermanager.orderservice.api.event;
<<<<<<< Updated upstream
import java.util.*;
import asw.common.api.event.DomainEvent;
import asw.ordermanager.orderservice.api.rest.OrderItemElement;
import lombok.*;

=======

import asw.ordermanager.common.api.event.DomainEvent;
import lombok.*;

import java.util.List;

>>>>>>> Stashed changes
@Data
@NoArgsConstructor @AllArgsConstructor
public class OrderCreatedEvent implements DomainEvent {

    private String customer;
    private String address;
    private List<OrderItemElement> orderItems;
    private double total;

}
