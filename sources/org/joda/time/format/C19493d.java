package org.joda.time.format;

/* renamed from: org.joda.time.format.d */
class C19493d implements C19324i {
    /* renamed from: a */
    private final DateTimeParser f60857a;

    /* renamed from: a */
    static C19324i m70317a(DateTimeParser dateTimeParser) {
        if (dateTimeParser instanceof C19495j) {
            return (C19324i) dateTimeParser;
        }
        if (dateTimeParser == null) {
            return null;
        }
        return new C19493d(dateTimeParser);
    }

    private C19493d(DateTimeParser dateTimeParser) {
        this.f60857a = dateTimeParser;
    }

    /* renamed from: a */
    DateTimeParser m70318a() {
        return this.f60857a;
    }

    public int estimateParsedLength() {
        return this.f60857a.estimateParsedLength();
    }

    public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
        return this.f60857a.parseInto(c19319c, charSequence.toString(), i);
    }
}
