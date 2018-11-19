package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.joda.time.base.BaseDateTime;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.C19314d;

public class MutableDateTime extends BaseDateTime implements Serializable, Cloneable, ReadWritableDateTime {
    private static final long serialVersionUID = 2852608688135209575L;
    /* renamed from: a */
    private C19305b f62147a;
    /* renamed from: b */
    private int f62148b;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -4481126543819298617L;
        /* renamed from: a */
        private MutableDateTime f60816a;
        /* renamed from: b */
        private C19305b f60817b;

        Property(MutableDateTime mutableDateTime, C19305b c19305b) {
            this.f60816a = mutableDateTime;
            this.f60817b = c19305b;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f60816a);
            objectOutputStream.writeObject(this.f60817b.mo14534a());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f60816a = (MutableDateTime) objectInputStream.readObject();
            this.f60817b = ((DateTimeFieldType) objectInputStream.readObject()).mo14453a(this.f60816a.getChronology());
        }

        /* renamed from: a */
        public C19305b mo14450a() {
            return this.f60817b;
        }

        /* renamed from: b */
        protected long mo14451b() {
            return this.f60816a.getMillis();
        }

        /* renamed from: c */
        protected C19304a mo14452c() {
            return this.f60816a.getChronology();
        }

        /* renamed from: a */
        public MutableDateTime m70110a(int i) {
            this.f60816a.setMillis(mo14450a().mo14538b(this.f60816a.getMillis(), i));
            return this.f60816a;
        }
    }

    public MutableDateTime(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public MutableDateTime(long j, C19304a c19304a) {
        super(j, c19304a);
    }

    public void setMillis(long j) {
        switch (this.f62148b) {
            case 0:
                break;
            case 1:
                j = this.f62147a.mo14547d(j);
                break;
            case 2:
                j = this.f62147a.mo14549e(j);
                break;
            case 3:
                j = this.f62147a.mo14551f(j);
                break;
            case 4:
                j = this.f62147a.mo14554g(j);
                break;
            case 5:
                j = this.f62147a.mo14556h(j);
                break;
            default:
                break;
        }
        super.setMillis(j);
    }

    public void setMillis(ReadableInstant readableInstant) {
        setMillis(DateTimeUtils.m68904a(readableInstant));
    }

    public void add(long j) {
        setMillis(C19314d.m69089a(getMillis(), j));
    }

    public void add(ReadableDuration readableDuration) {
        add(readableDuration, 1);
    }

    public void add(ReadableDuration readableDuration, int i) {
        if (readableDuration != null) {
            add(C19314d.m69088a(readableDuration.getMillis(), i));
        }
    }

    public void add(ReadablePeriod readablePeriod) {
        add(readablePeriod, 1);
    }

    public void add(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod != null) {
            setMillis(getChronology().mo14491a(readablePeriod, getMillis(), i));
        }
    }

    public void setChronology(C19304a c19304a) {
        super.setChronology(c19304a);
    }

    public void setZone(DateTimeZone dateTimeZone) {
        dateTimeZone = DateTimeUtils.m68906a(dateTimeZone);
        C19304a chronology = getChronology();
        if (chronology.mo14710a() != dateTimeZone) {
            setChronology(chronology.mo14711a(dateTimeZone));
        }
    }

    public void setZoneRetainFields(DateTimeZone dateTimeZone) {
        dateTimeZone = DateTimeUtils.m68906a(dateTimeZone);
        DateTimeZone a = DateTimeUtils.m68906a(getZone());
        if (dateTimeZone != a) {
            long a2 = a.a(dateTimeZone, getMillis());
            setChronology(getChronology().mo14711a(dateTimeZone));
            setMillis(a2);
        }
    }

    public void set(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        setMillis(dateTimeFieldType.mo14453a(getChronology()).mo14538b(getMillis(), i));
    }

    public void add(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (i != 0) {
            setMillis(durationFieldType.mo14457a(getChronology()).mo14558a(getMillis(), i));
        }
    }

    public void setYear(int i) {
        setMillis(getChronology().mo14480E().mo14538b(getMillis(), i));
    }

    public void addYears(int i) {
        if (i != 0) {
            setMillis(getChronology().mo14479D().mo14558a(getMillis(), i));
        }
    }

    public void setWeekyear(int i) {
        setMillis(getChronology().mo14520z().mo14538b(getMillis(), i));
    }

    public void addWeekyears(int i) {
        if (i != 0) {
            setMillis(getChronology().mo14519y().mo14558a(getMillis(), i));
        }
    }

    public void setMonthOfYear(int i) {
        setMillis(getChronology().mo14478C().mo14538b(getMillis(), i));
    }

    public void addMonths(int i) {
        if (i != 0) {
            setMillis(getChronology().mo14477B().mo14558a(getMillis(), i));
        }
    }

    public void setWeekOfWeekyear(int i) {
        setMillis(getChronology().mo14518x().mo14538b(getMillis(), i));
    }

    public void addWeeks(int i) {
        if (i != 0) {
            setMillis(getChronology().mo14517w().mo14558a(getMillis(), i));
        }
    }

    public void setDayOfYear(int i) {
        setMillis(getChronology().mo14516v().mo14538b(getMillis(), i));
    }

    public void setDayOfMonth(int i) {
        setMillis(getChronology().mo14515u().mo14538b(getMillis(), i));
    }

    public void setDayOfWeek(int i) {
        setMillis(getChronology().mo14514t().mo14538b(getMillis(), i));
    }

    public void addDays(int i) {
        if (i != 0) {
            setMillis(getChronology().mo14513s().mo14558a(getMillis(), i));
        }
    }

    public void setHourOfDay(int i) {
        setMillis(getChronology().mo14507m().mo14538b(getMillis(), i));
    }

    public void addHours(int i) {
        if (i != 0) {
            setMillis(getChronology().mo14506l().mo14558a(getMillis(), i));
        }
    }

    public void setMinuteOfDay(int i) {
        setMillis(getChronology().mo14505k().mo14538b(getMillis(), i));
    }

    public void setMinuteOfHour(int i) {
        setMillis(getChronology().mo14504j().mo14538b(getMillis(), i));
    }

    public void addMinutes(int i) {
        if (i != 0) {
            setMillis(getChronology().mo14503i().mo14558a(getMillis(), i));
        }
    }

    public void setSecondOfDay(int i) {
        setMillis(getChronology().mo14502h().mo14538b(getMillis(), i));
    }

    public void setSecondOfMinute(int i) {
        setMillis(getChronology().mo14501g().mo14538b(getMillis(), i));
    }

    public void addSeconds(int i) {
        if (i != 0) {
            setMillis(getChronology().mo14500f().mo14558a(getMillis(), i));
        }
    }

    public void setMillisOfDay(int i) {
        setMillis(getChronology().mo14499e().mo14538b(getMillis(), i));
    }

    public void setMillisOfSecond(int i) {
        setMillis(getChronology().mo14498d().mo14538b(getMillis(), i));
    }

    public void addMillis(int i) {
        if (i != 0) {
            setMillis(getChronology().mo14497c().mo14558a(getMillis(), i));
        }
    }

    /* renamed from: a */
    public void m71487a(long j) {
        setMillis(getChronology().mo14499e().mo14538b(j, getMillisOfDay()));
    }

    public void setDate(int i, int i2, int i3) {
        m71487a(getChronology().mo14487a(i, i2, i3, 0));
    }

    public void setTime(int i, int i2, int i3, int i4) {
        setMillis(getChronology().mo14489a(getMillis(), i, i2, i3, i4));
    }

    public void setDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        setMillis(getChronology().mo14488a(i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: a */
    public Property m71486a(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        C19305b a = dateTimeFieldType.mo14453a(getChronology());
        if (a.mo14546c()) {
            return new Property(this, a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Field '");
        stringBuilder.append(dateTimeFieldType);
        stringBuilder.append("' is not supported");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public java.lang.Object clone() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new java.lang.InternalError;
        r1 = "Clone error";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.MutableDateTime.clone():java.lang.Object");
    }
}
