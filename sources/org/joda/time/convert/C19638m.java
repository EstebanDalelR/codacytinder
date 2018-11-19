package org.joda.time.convert;

import com.facebook.ads.AdError;
import org.joda.time.C19304a;
import org.joda.time.DateTime;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.field.C19314d;
import org.joda.time.format.C19316b;
import org.joda.time.format.C19322g;
import org.joda.time.format.C19323h;
import org.joda.time.format.C19326m;

/* renamed from: org.joda.time.convert.m */
class C19638m extends C19481a implements DurationConverter, InstantConverter, IntervalConverter, PartialConverter, PeriodConverter {
    /* renamed from: a */
    static final C19638m f61408a = new C19638m();

    protected C19638m() {
    }

    public long getInstantMillis(Object obj, C19304a c19304a) {
        return C19322g.m69275b().m69164a(c19304a).m69159a((String) obj);
    }

    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, C19304a c19304a, C19316b c19316b) {
        if (c19316b.m69178g() != null) {
            c19304a = c19304a.mo14711a(c19316b.m69178g());
        }
        return c19304a.mo14493a(readablePartial, c19316b.m69164a(c19304a).m69159a((String) obj));
    }

    public long getDurationMillis(Object obj) {
        StringBuilder stringBuilder;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            length--;
            if (str.charAt(length) == 'S' || str.charAt(length) == 's') {
                long j;
                String substring = str.substring(2, length);
                int i = 0;
                int i2 = 0;
                int i3 = -1;
                while (i < substring.length()) {
                    if (substring.charAt(i) < '0' || substring.charAt(i) > '9') {
                        if (i == 0 && substring.charAt(0) == '-') {
                            i2 = 1;
                        } else if (i > i2 && substring.charAt(i) == '.' && i3 == -1) {
                            i3 = i;
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid format: \"");
                            stringBuilder.append(str);
                            stringBuilder.append('\"');
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    i++;
                }
                long j2 = 0;
                if (i3 > 0) {
                    j2 = Long.parseLong(substring.substring(i2, i3));
                    obj = substring.substring(i3 + 1);
                    if (obj.length() != 3) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(obj);
                        stringBuilder2.append("000");
                        obj = stringBuilder2.toString().substring(0, 3);
                    }
                    j = j2;
                    j2 = (long) Integer.parseInt(obj);
                } else if (i2 != 0) {
                    j = Long.parseLong(substring.substring(i2, substring.length()));
                } else {
                    j = Long.parseLong(substring);
                }
                if (i2 != 0) {
                    return C19314d.m69089a(C19314d.m69088a(-j, (int) AdError.NETWORK_ERROR_CODE), -j2);
                }
                return C19314d.m69089a(C19314d.m69088a(j, (int) AdError.NETWORK_ERROR_CODE), j2);
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid format: \"");
        stringBuilder.append(str);
        stringBuilder.append('\"');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, C19304a c19304a) {
        String str = (String) obj;
        c19304a = C19323h.m69282a();
        readWritablePeriod.clear();
        int a = c19304a.m69286a(readWritablePeriod, str, 0);
        if (a < str.length()) {
            if (a < 0) {
                c19304a.m69290a(readWritablePeriod.getPeriodType()).m69291b(str);
            }
            c19304a = new StringBuilder();
            c19304a.append("Invalid format: \"");
            c19304a.append(str);
            c19304a.append('\"');
            throw new IllegalArgumentException(c19304a.toString());
        }
    }

    public void setInto(ReadWritableInterval readWritableInterval, Object obj, C19304a c19304a) {
        C19638m c19638m = this;
        ReadWritableInterval readWritableInterval2 = readWritableInterval;
        C19304a c19304a2 = c19304a;
        String str = (String) obj;
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Format requires a '/' separator: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        String substring = str.substring(0, indexOf);
        if (substring.length() <= 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Format invalid: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() <= 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Format invalid: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        C19304a chronology;
        char charAt;
        DateTime d;
        long millis;
        C19304a c19304a3;
        C19316b a = C19322g.m69275b().m69164a(c19304a2);
        C19326m a2 = C19323h.m69282a();
        long j = 0;
        char charAt2 = substring.charAt(0);
        ReadablePeriod readablePeriod = null;
        if (charAt2 != 'P') {
            if (charAt2 != 'p') {
                DateTime d2 = a.m69175d(substring);
                j = d2.getMillis();
                chronology = d2.getChronology();
                charAt = substring2.charAt(0);
                if (charAt != 'P') {
                    if (charAt == 'p') {
                        d = a.m69175d(substring2);
                        millis = d.getMillis();
                        if (chronology == null) {
                            c19304a3 = chronology;
                        } else {
                            c19304a3 = d.getChronology();
                        }
                        if (c19304a2 != null) {
                            c19304a3 = c19304a2;
                        }
                        if (readablePeriod != null) {
                            j = c19304a3.mo14491a(readablePeriod, millis, -1);
                        }
                        readWritableInterval2.setInterval(j, millis);
                        readWritableInterval2.setChronology(c19304a3);
                        return;
                    }
                }
                if (readablePeriod == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Interval composed of two durations: ");
                    stringBuilder.append(str);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                ReadablePeriod a3 = a2.m69290a(getPeriodType(substring2)).m69288a(substring2);
                if (c19304a2 != null) {
                    c19304a2 = chronology;
                }
                millis = c19304a2.mo14491a(a3, j, 1);
                c19304a3 = c19304a2;
                readWritableInterval2.setInterval(j, millis);
                readWritableInterval2.setChronology(c19304a3);
                return;
            }
        }
        readablePeriod = a2.m69290a(getPeriodType(substring)).m69288a(substring);
        chronology = null;
        charAt = substring2.charAt(0);
        if (charAt != 'P') {
            if (charAt == 'p') {
                d = a.m69175d(substring2);
                millis = d.getMillis();
                if (chronology == null) {
                    c19304a3 = d.getChronology();
                } else {
                    c19304a3 = chronology;
                }
                if (c19304a2 != null) {
                    c19304a3 = c19304a2;
                }
                if (readablePeriod != null) {
                    j = c19304a3.mo14491a(readablePeriod, millis, -1);
                }
                readWritableInterval2.setInterval(j, millis);
                readWritableInterval2.setChronology(c19304a3);
                return;
            }
        }
        if (readablePeriod == null) {
            ReadablePeriod a32 = a2.m69290a(getPeriodType(substring2)).m69288a(substring2);
            if (c19304a2 != null) {
                c19304a2 = chronology;
            }
            millis = c19304a2.mo14491a(a32, j, 1);
            c19304a3 = c19304a2;
            readWritableInterval2.setInterval(j, millis);
            readWritableInterval2.setChronology(c19304a3);
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Interval composed of two durations: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public Class<?> getSupportedType() {
        return String.class;
    }
}
