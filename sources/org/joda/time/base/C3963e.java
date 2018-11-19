package org.joda.time.base;

import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.C19314d;
import org.joda.time.format.C19316b;

/* renamed from: org.joda.time.base.e */
public abstract class C3963e implements Comparable<ReadablePartial>, ReadablePartial {
    /* renamed from: a */
    protected abstract C19305b mo3938a(int i, C19304a c19304a);

    public /* synthetic */ int compareTo(Object obj) {
        return mo3937a((ReadablePartial) obj);
    }

    protected C3963e() {
    }

    public DateTimeFieldType getFieldType(int i) {
        return mo3938a(i, getChronology()).a();
    }

    public C19305b getField(int i) {
        return mo3938a(i, getChronology());
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        return getValue(m15499b(dateTimeFieldType));
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        return m15495a(dateTimeFieldType) != -1 ? true : null;
    }

    /* renamed from: a */
    public int m15495a(DateTimeFieldType dateTimeFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getFieldType(i) == dateTimeFieldType) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    protected int m15499b(DateTimeFieldType dateTimeFieldType) {
        int a = m15495a(dateTimeFieldType);
        if (a != -1) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Field '");
        stringBuilder.append(dateTimeFieldType);
        stringBuilder.append("' is not supported");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public DateTime toDateTime(ReadableInstant readableInstant) {
        C19304a b = DateTimeUtils.b(readableInstant);
        return new DateTime(b.b(this, DateTimeUtils.a(readableInstant)), b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePartial)) {
            return false;
        }
        ReadablePartial readablePartial = (ReadablePartial) obj;
        if (size() != readablePartial.size()) {
            return false;
        }
        int size = size();
        int i = 0;
        while (i < size) {
            if (getValue(i) == readablePartial.getValue(i)) {
                if (getFieldType(i) == readablePartial.getFieldType(i)) {
                    i++;
                }
            }
            return false;
        }
        return C19314d.a(getChronology(), readablePartial.getChronology());
    }

    public int hashCode() {
        int i = 157;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 23) + getValue(i2)) * 23) + getFieldType(i2).hashCode();
        }
        return i + getChronology().hashCode();
    }

    /* renamed from: a */
    public int mo3937a(ReadablePartial readablePartial) {
        if (this == readablePartial) {
            return 0;
        }
        if (size() != readablePartial.size()) {
            throw new ClassCastException("ReadablePartial objects must have matching field types");
        }
        int i;
        int size = size();
        for (i = 0; i < size; i++) {
            if (getFieldType(i) != readablePartial.getFieldType(i)) {
                throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
        }
        size = size();
        for (i = 0; i < size; i++) {
            if (getValue(i) > readablePartial.getValue(i)) {
                return 1;
            }
            if (getValue(i) < readablePartial.getValue(i)) {
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public String m15497a(C19316b c19316b) {
        if (c19316b == null) {
            return toString();
        }
        return c19316b.a(this);
    }
}
