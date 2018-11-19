package com.tinder.etl.event;

class vb implements EtlField<String> {
    public String description() {
        return "type fo reason for Variant.Reset. It'd be Fresh Install, or Shared Device.";
    }

    public String name() {
        return "resetReason";
    }

    vb() {
    }

    public Class<String> type() {
        return String.class;
    }
}
