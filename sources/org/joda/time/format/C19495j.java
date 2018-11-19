package org.joda.time.format;

/* renamed from: org.joda.time.format.j */
class C19495j implements DateTimeParser, C19324i {
    /* renamed from: a */
    private final C19324i f60859a;

    /* renamed from: a */
    static DateTimeParser m70320a(C19324i c19324i) {
        if (c19324i instanceof C19493d) {
            return ((C19493d) c19324i).m70318a();
        }
        if (c19324i instanceof DateTimeParser) {
            return (DateTimeParser) c19324i;
        }
        if (c19324i == null) {
            return null;
        }
        return new C19495j(c19324i);
    }

    private C19495j(C19324i c19324i) {
        this.f60859a = c19324i;
    }

    public int estimateParsedLength() {
        return this.f60859a.estimateParsedLength();
    }

    public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
        return this.f60859a.parseInto(c19319c, charSequence, i);
    }

    public int parseInto(C19319c c19319c, String str, int i) {
        return this.f60859a.parseInto(c19319c, str, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19495j)) {
            return null;
        }
        return this.f60859a.equals(((C19495j) obj).f60859a);
    }
}
