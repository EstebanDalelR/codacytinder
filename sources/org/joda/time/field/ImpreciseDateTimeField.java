package org.joda.time.field;

import org.joda.time.C19306c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;

public abstract class ImpreciseDateTimeField extends C19482a {
    /* renamed from: a */
    private final C19306c f61411a;
    /* renamed from: b */
    final long f61412b;

    private final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;
        /* renamed from: a */
        final /* synthetic */ ImpreciseDateTimeField f61410a;

        /* renamed from: c */
        public boolean mo14560c() {
            return false;
        }

        LinkedDurationField(ImpreciseDateTimeField impreciseDateTimeField, DurationFieldType durationFieldType) {
            this.f61410a = impreciseDateTimeField;
            super(durationFieldType);
        }

        /* renamed from: d */
        public long mo14561d() {
            return this.f61410a.f61412b;
        }

        /* renamed from: a */
        public long mo14558a(long j, int i) {
            return this.f61410a.mo14528a(j, i);
        }

        /* renamed from: a */
        public long mo14559a(long j, long j2) {
            return this.f61410a.mo14529a(j, j2);
        }

        /* renamed from: c */
        public int mo14523c(long j, long j2) {
            return this.f61410a.mo14535b(j, j2);
        }

        /* renamed from: d */
        public long mo14562d(long j, long j2) {
            return this.f61410a.mo14545c(j, j2);
        }
    }

    /* renamed from: a */
    public abstract long mo14528a(long j, int i);

    /* renamed from: a */
    public abstract long mo14529a(long j, long j2);

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j) {
        super(dateTimeFieldType);
        this.f61412b = j;
        this.f61411a = new LinkedDurationField(this, dateTimeFieldType.mo14454y());
    }

    /* renamed from: b */
    public int mo14535b(long j, long j2) {
        return C19314d.m69087a(mo14545c(j, j2));
    }

    /* renamed from: c */
    public long mo14545c(long j, long j2) {
        if (j < j2) {
            return -mo14545c(j2, j);
        }
        long j3 = (j - j2) / this.f61412b;
        long j4;
        if (mo14529a(j2, j3) < j) {
            while (true) {
                j4 = j3 + 1;
                if (mo14529a(j2, j4) > j) {
                    break;
                }
                j3 = j4;
            }
            j3 = j4 - 1;
        } else if (mo14529a(j2, j3) > j) {
            while (true) {
                j4 = j3 - 1;
                if (mo14529a(j2, j4) <= j) {
                    break;
                }
                j3 = j4;
            }
            j3 = j4;
        }
        return j3;
    }

    /* renamed from: d */
    public final C19306c mo14548d() {
        return this.f61411a;
    }
}
