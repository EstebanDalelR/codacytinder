package com.crashlytics.android.answers;

public class CustomEvent extends AnswersEvent<CustomEvent> {
    private final String eventName;

    public CustomEvent(String str) {
        if (str == null) {
            throw new NullPointerException("eventName must not be null");
        }
        this.eventName = this.validator.limitStringLength(str);
    }

    String getCustomType() {
        return this.eventName;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{eventName:\"");
        stringBuilder.append(this.eventName);
        stringBuilder.append('\"');
        stringBuilder.append(", customAttributes:");
        stringBuilder.append(this.customAttributes);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
