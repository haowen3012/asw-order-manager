package asw.ordermanager.orderservice.api.event;

import lombok.*;

@Data
@NoArgsConstructor @AllArgsConstructor
public class OrderItemElement {

    private String product;
    private int quantity;

}
