package com.nestlings.entities.payment;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PaymentChargeResult {
    private Integer userId;
    private Date createdDate;
    private String chargeId;
    private String status;
    private Long amount;
    private String description;
    private String balanceTransaction;
    private Boolean captured;
    private Long created;
    private String currency;

    private String outcomeSellerMessage;
    private String outcometype;

    private Boolean paid;
    private String receiptEmail;
    private String receiptNumber;
    private String refundsUrl;

    private String source;
}
