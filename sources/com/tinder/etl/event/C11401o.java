package com.tinder.etl.event;

/* renamed from: com.tinder.etl.event.o */
class C11401o implements EtlField<String> {
    public String description() {
        return "the sharing method: https://confluence.gotinder.com/display/PRODUCT/Project+Share+V1#ProjectShareV1-FireworksEvents";
    }

    public String name() {
        return "activityType";
    }

    C11401o() {
    }

    public Class<String> type() {
        return String.class;
    }
}
