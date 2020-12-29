package com.nestlings.entities.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResult {
    Boolean isPaymentSuccesful = false;
    String resultMessage = "";
}
