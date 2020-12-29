package com.nestlings.entities.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentRequest {
    private String stripeToken;
    private String stripeTokenType;
    private String stripeEmail;
    private Float price;
    private Integer collegeId;
}
