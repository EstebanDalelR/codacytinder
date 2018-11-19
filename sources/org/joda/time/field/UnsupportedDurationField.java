package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.C19306c;
import org.joda.time.DurationFieldType;

public final class UnsupportedDurationField extends C19306c implements Serializable {
    /* renamed from: a */
    private static HashMap<DurationFieldType, UnsupportedDurationField> f60827a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    /* renamed from: b */
    private final DurationFieldType f60828b;

    /* renamed from: a */
    public int m70259a(C19306c c19306c) {
        return 0;
    }

    /* renamed from: b */
    public boolean mo14522b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo14560c() {
        return true;
    }

    /* renamed from: d */
    public long mo14561d() {
        return 0;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m70259a((C19306c) obj);
    }

    /* renamed from: a */
    public static synchronized UnsupportedDurationField m70257a(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        synchronized (UnsupportedDurationField.class) {
            if (f60827a == null) {
                f60827a = new HashMap(7);
                unsupportedDurationField = null;
            } else {
                unsupportedDurationField = (UnsupportedDurationField) f60827a.get(durationFieldType);
            }
            if (unsupportedDurationField == null) {
                unsupportedDurationField = new UnsupportedDurationField(durationFieldType);
                f60827a.put(durationFieldType, unsupportedDurationField);
            }
        }
        return unsupportedDurationField;
    }

    private UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.f60828b = durationFieldType;
    }

    /* renamed from: a */
    public final DurationFieldType mo14521a() {
        return this.f60828b;
    }

    /* renamed from: e */
    public String m70268e() {
        return this.f60828b.m68931m();
    }

    /* renamed from: a */
    public long mo14558a(long j, int i) {
        throw m70258f();
    }

    /* renamed from: a */
    public long mo14559a(long j, long j2) {
        throw m70258f();
    }

    /* renamed from: c */
    public int mo14523c(long j, long j2) {
        throw m70258f();
    }

    /* renamed from: d */
    public long mo14562d(long j, long j2) {
        throw m70258f();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        if (unsupportedDurationField.m70268e() != null) {
            return unsupportedDurationField.m70268e().equals(m70268e());
        }
        if (m70268e() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return m70268e().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UnsupportedDurationField[");
        stringBuilder.append(m70268e());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    private Object readResolve() {
        return m70257a(this.f60828b);
    }

    /* renamed from: f */
    private UnsupportedOperationException m70258f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f60828b);
        stringBuilder.append(" field is unsupported");
        return new UnsupportedOperationException(stringBuilder.toString());
    }
}
