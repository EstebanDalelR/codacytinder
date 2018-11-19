package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.C19306c;
import org.joda.time.DurationFieldType;

public final class MillisDurationField extends C19306c implements Serializable {
    /* renamed from: a */
    public static final C19306c f60823a = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    /* renamed from: b */
    public boolean mo14522b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo14560c() {
        return true;
    }

    /* renamed from: d */
    public final long mo14561d() {
        return 1;
    }

    public String toString() {
        return "DurationField[millis]";
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m70212a((C19306c) obj);
    }

    private MillisDurationField() {
    }

    /* renamed from: a */
    public DurationFieldType mo14521a() {
        return DurationFieldType.m68918a();
    }

    /* renamed from: a */
    public long mo14558a(long j, int i) {
        return C19314d.m69089a(j, (long) i);
    }

    /* renamed from: a */
    public long mo14559a(long j, long j2) {
        return C19314d.m69089a(j, j2);
    }

    /* renamed from: c */
    public int mo14523c(long j, long j2) {
        return C19314d.m69087a(C19314d.m69093b(j, j2));
    }

    /* renamed from: d */
    public long mo14562d(long j, long j2) {
        return C19314d.m69093b(j, j2);
    }

    /* renamed from: a */
    public int m70212a(C19306c c19306c) {
        long d = c19306c.mo14561d();
        long d2 = mo14561d();
        if (d2 == d) {
            return null;
        }
        return d2 < d ? -1 : 1;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof MillisDurationField)) {
            return false;
        }
        if (mo14561d() == ((MillisDurationField) obj).mo14561d()) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (int) mo14561d();
    }

    private Object readResolve() {
        return f60823a;
    }
}
