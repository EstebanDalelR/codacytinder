package com.google.i18n.phonenumbers;

public class NumberParseException extends Exception {
    /* renamed from: a */
    private ErrorType f20708a;
    /* renamed from: b */
    private String f20709b;

    public enum ErrorType {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public NumberParseException(ErrorType errorType, String str) {
        super(str);
        this.f20709b = str;
        this.f20708a = errorType;
    }

    /* renamed from: a */
    public ErrorType m24455a() {
        return this.f20708a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error type: ");
        stringBuilder.append(this.f20708a);
        stringBuilder.append(". ");
        stringBuilder.append(this.f20709b);
        return stringBuilder.toString();
    }
}
