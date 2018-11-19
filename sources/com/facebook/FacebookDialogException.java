package com.facebook;

public class FacebookDialogException extends FacebookException {
    static final long serialVersionUID = 1;
    /* renamed from: a */
    private int f9720a;
    /* renamed from: b */
    private String f9721b;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.f9720a = i;
        this.f9721b = str2;
    }

    /* renamed from: a */
    public int m12163a() {
        return this.f9720a;
    }

    /* renamed from: b */
    public String m12164b() {
        return this.f9721b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{FacebookDialogException: ");
        stringBuilder.append("errorCode: ");
        stringBuilder.append(m12163a());
        stringBuilder.append(", message: ");
        stringBuilder.append(getMessage());
        stringBuilder.append(", url: ");
        stringBuilder.append(m12164b());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
