package java8.util;

public final class StringJoiner {
    /* renamed from: a */
    private final String f48776a;
    /* renamed from: b */
    private final String f48777b;
    /* renamed from: c */
    private final String f48778c;
    /* renamed from: d */
    private StringBuilder f48779d;
    /* renamed from: e */
    private String f48780e;

    public StringJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Objects.m59113a((Object) charSequence2, "The prefix must not be null");
        Objects.m59113a((Object) charSequence, "The delimiter must not be null");
        Objects.m59113a((Object) charSequence3, "The suffix must not be null");
        this.f48776a = charSequence2.toString();
        this.f48777b = charSequence.toString();
        this.f48778c = charSequence3.toString();
        charSequence = new StringBuilder();
        charSequence.append(this.f48776a);
        charSequence.append(this.f48778c);
        this.f48780e = charSequence.toString();
    }

    public String toString() {
        if (this.f48779d == null) {
            return this.f48780e;
        }
        if (this.f48778c.equals("")) {
            return this.f48779d.toString();
        }
        int length = this.f48779d.length();
        StringBuilder stringBuilder = this.f48779d;
        stringBuilder.append(this.f48778c);
        String stringBuilder2 = stringBuilder.toString();
        this.f48779d.setLength(length);
        return stringBuilder2;
    }

    /* renamed from: a */
    public StringJoiner m59197a(CharSequence charSequence) {
        m59196a().append(charSequence);
        return this;
    }

    /* renamed from: a */
    public StringJoiner m59198a(StringJoiner stringJoiner) {
        Objects.m59115b(stringJoiner);
        if (stringJoiner.f48779d != null) {
            m59196a().append(stringJoiner.f48779d, stringJoiner.f48776a.length(), stringJoiner.f48779d.length());
        }
        return this;
    }

    /* renamed from: a */
    private StringBuilder m59196a() {
        if (this.f48779d != null) {
            this.f48779d.append(this.f48777b);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f48776a);
            this.f48779d = stringBuilder;
        }
        return this.f48779d;
    }
}
