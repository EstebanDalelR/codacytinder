package com.tinder.etl.event;

class ez implements EtlField<Number> {
    public String description() {
        return "the amount offered to the user (in the local currency), e.g. 4.99. Note: If the price is not discounted, the value shall be equal to the basePrice. For example, if the user is not being offered a discount, this field should be equal to the basePrice.";
    }

    public String name() {
        return "discountedPrice";
    }

    ez() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
