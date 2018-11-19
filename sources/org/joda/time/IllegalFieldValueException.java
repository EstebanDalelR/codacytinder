package org.joda.time;

import com.tinder.api.ManagerWebServices;

public class IllegalFieldValueException extends IllegalArgumentException {
    private static final long serialVersionUID = 6305711765985447737L;
    /* renamed from: a */
    private final DateTimeFieldType f60083a;
    /* renamed from: b */
    private final DurationFieldType f60084b = null;
    /* renamed from: c */
    private final String f60085c;
    /* renamed from: d */
    private final Number f60086d;
    /* renamed from: e */
    private final String f60087e;
    /* renamed from: f */
    private final Number f60088f;
    /* renamed from: g */
    private final Number f60089g;
    /* renamed from: h */
    private String f60090h;

    /* renamed from: a */
    private static String m68932a(String str, Number number, Number number2, Number number3, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Value ");
        stringBuilder.append(number);
        stringBuilder.append(" for ");
        stringBuilder.append(str);
        stringBuilder.append(' ');
        if (number2 == null) {
            if (number3 == null) {
                stringBuilder.append("is not supported");
            } else {
                stringBuilder.append("must not be larger than ");
                stringBuilder.append(number3);
            }
        } else if (number3 == null) {
            stringBuilder.append("must not be smaller than ");
            stringBuilder.append(number2);
        } else {
            stringBuilder.append("must be in the range [");
            stringBuilder.append(number2);
            stringBuilder.append(',');
            stringBuilder.append(number3);
            stringBuilder.append(']');
        }
        if (str2 != null) {
            stringBuilder.append(": ");
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m68933a(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Value ");
        if (str2 == null) {
            stringBuffer.append(ManagerWebServices.NULL_STRING_VALUE);
        } else {
            stringBuffer.append('\"');
            stringBuffer.append(str2);
            stringBuffer.append('\"');
        }
        stringBuffer.append(" for ");
        stringBuffer.append(str);
        stringBuffer.append(' ');
        stringBuffer.append("is not supported");
        return stringBuffer.toString();
    }

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, Number number, Number number2, Number number3) {
        super(m68932a(dateTimeFieldType.m68899x(), number, number2, number3, null));
        this.f60083a = dateTimeFieldType;
        this.f60085c = dateTimeFieldType.m68899x();
        this.f60086d = number;
        this.f60087e = null;
        this.f60088f = number2;
        this.f60089g = number3;
        this.f60090h = super.getMessage();
    }

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, Number number, String str) {
        super(m68932a(dateTimeFieldType.m68899x(), number, null, null, str));
        this.f60083a = dateTimeFieldType;
        this.f60085c = dateTimeFieldType.m68899x();
        this.f60086d = number;
        this.f60087e = null;
        this.f60088f = null;
        this.f60089g = null;
        this.f60090h = super.getMessage();
    }

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, String str) {
        super(m68933a(dateTimeFieldType.m68899x(), str));
        this.f60083a = dateTimeFieldType;
        this.f60085c = dateTimeFieldType.m68899x();
        this.f60087e = str;
        this.f60086d = null;
        this.f60088f = null;
        this.f60089g = null;
        this.f60090h = super.getMessage();
    }

    public String getMessage() {
        return this.f60090h;
    }

    /* renamed from: a */
    public void m68934a(String str) {
        if (this.f60090h == null) {
            this.f60090h = str;
        } else if (str != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(this.f60090h);
            this.f60090h = stringBuilder.toString();
        }
    }
}
