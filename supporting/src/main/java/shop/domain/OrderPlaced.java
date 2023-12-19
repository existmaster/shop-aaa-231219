package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productId;
    private Integer qty;
    private Integer price;
    private Date orderDate;
    private String address;
}
