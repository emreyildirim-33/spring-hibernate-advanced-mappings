package com.workintech.s18d4;

public record AccountResponse(Long id,String accountName,
                              double moneyAmount,CustomerResponse customerResponse) {
}
