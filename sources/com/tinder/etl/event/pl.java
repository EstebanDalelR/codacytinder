package com.tinder.etl.event;

class pl implements EtlField<Number> {
    public String description() {
        return "Tinder Gold:</br>0 - Non-T+ Gold paywall with the Likes You Logo, 1 - Non-T+ Gold Paywall with the blurred image of the most recent promoted rec, 2 - T+ Gold Paywall with the Likes You Logo, 3 - T+ Gold Paywall with blurred image";
    }

    public String name() {
        return "paywallVersion";
    }

    pl() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
