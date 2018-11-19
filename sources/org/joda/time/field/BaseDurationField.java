package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.C19306c;
import org.joda.time.DurationFieldType;

public abstract class BaseDurationField extends C19306c implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    /* renamed from: a */
    private final DurationFieldType f60819a;

    /* renamed from: b */
    public final boolean mo14522b() {
        return true;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m70173a((C19306c) obj);
    }

    protected BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.f60819a = durationFieldType;
    }

    /* renamed from: a */
    public final DurationFieldType mo14521a() {
        return this.f60819a;
    }

    /* renamed from: e */
    public final String m70177e() {
        return this.f60819a.m68931m();
    }

    /* renamed from: c */
    public int mo14523c(long j, long j2) {
        return C19314d.m69087a(mo14562d(j, j2));
    }

    /* renamed from: a */
    public int m70173a(C19306c c19306c) {
        long d = c19306c.mo14561d();
        long d2 = mo14561d();
        if (d2 == d) {
            return null;
        }
        return d2 < d ? -1 : 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DurationField[");
        stringBuilder.append(m70177e());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
