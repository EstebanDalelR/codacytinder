package com.tinder.etl.event;

class bf implements EtlField<String> {
    public String description() {
        return "Value when action show is dismissible or nonDismissible. Value when action hide is remindMeLater, viewFAQ, verify, appClose, or back.";
    }

    public String name() {
        return "value";
    }

    bf() {
    }

    public Class<String> type() {
        return String.class;
    }
}
