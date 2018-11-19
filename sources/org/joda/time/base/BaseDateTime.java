package org.joda.time.base;

import com.google.android.exoplayer2.Format;
import java.io.Serializable;
import org.joda.time.C19304a;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.C19311c;
import org.joda.time.convert.InstantConverter;

public abstract class BaseDateTime extends C4305a implements Serializable, ReadableDateTime {
    private static final long serialVersionUID = -6728882245981L;
    /* renamed from: a */
    private volatile long f14730a;
    /* renamed from: b */
    private volatile C19304a f14731b;

    /* renamed from: a */
    protected long m18433a(long j, C19304a c19304a) {
        return j;
    }

    public BaseDateTime() {
        this(DateTimeUtils.a(), ISOChronology.O());
    }

    public BaseDateTime(long j) {
        this(j, ISOChronology.O());
    }

    public BaseDateTime(long j, DateTimeZone dateTimeZone) {
        this(j, ISOChronology.b(dateTimeZone));
    }

    public BaseDateTime(long j, C19304a c19304a) {
        this.f14731b = m18434b(c19304a);
        this.f14730a = m18433a(j, this.f14731b);
        m18432a();
    }

    public BaseDateTime(Object obj, C19304a c19304a) {
        InstantConverter a = C19311c.a().a(obj);
        this.f14731b = m18434b(a.getChronology(obj, c19304a));
        this.f14730a = m18433a(a.getInstantMillis(obj, c19304a), this.f14731b);
        m18432a();
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, i3, i4, i5, i6, i7, ISOChronology.O());
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, C19304a c19304a) {
        this.f14731b = m18434b(c19304a);
        this.f14730a = m18433a(this.f14731b.a(i, i2, i3, i4, i5, i6, i7), this.f14731b);
        m18432a();
    }

    /* renamed from: a */
    private void m18432a() {
        if (this.f14730a == Long.MIN_VALUE || this.f14730a == Format.OFFSET_SAMPLE_RELATIVE) {
            this.f14731b = this.f14731b.b();
        }
    }

    /* renamed from: b */
    protected C19304a m18434b(C19304a c19304a) {
        return DateTimeUtils.a(c19304a);
    }

    public long getMillis() {
        return this.f14730a;
    }

    public C19304a getChronology() {
        return this.f14731b;
    }

    protected void setMillis(long j) {
        this.f14730a = m18433a(j, this.f14731b);
    }

    protected void setChronology(C19304a c19304a) {
        this.f14731b = m18434b(c19304a);
    }
}
