package org.joda.time.format;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/* renamed from: org.joda.time.format.n */
public class C19328n {
    /* renamed from: a */
    private static final ConcurrentMap<String, Pattern> f60273a = new ConcurrentHashMap();
    /* renamed from: b */
    private int f60274b;
    /* renamed from: c */
    private int f60275c;
    /* renamed from: d */
    private int f60276d;
    /* renamed from: e */
    private boolean f60277e;
    /* renamed from: f */
    private C19327f f60278f;
    /* renamed from: g */
    private List<Object> f60279g;
    /* renamed from: h */
    private boolean f60280h;
    /* renamed from: i */
    private boolean f60281i;
    /* renamed from: j */
    private C19498c[] f60282j;

    /* renamed from: org.joda.time.format.n$f */
    interface C19327f {
        /* renamed from: a */
        int mo14728a(int i);

        /* renamed from: a */
        int mo14729a(String str, int i);

        /* renamed from: a */
        void mo14730a(Writer writer, int i) throws IOException;

        /* renamed from: a */
        void mo14731a(StringBuffer stringBuffer, int i);

        /* renamed from: a */
        void mo14578a(Set<C19327f> set);

        /* renamed from: a */
        String[] mo14732a();

        /* renamed from: b */
        int mo14733b(String str, int i);
    }

    /* renamed from: org.joda.time.format.n$a */
    static class C19497a implements PeriodParser, PeriodPrinter {
        /* renamed from: a */
        private final PeriodPrinter[] f60861a;
        /* renamed from: b */
        private final PeriodParser[] f60862b;

        C19497a(List<Object> list) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            m70321a(list, arrayList, arrayList2);
            if (arrayList.size() <= null) {
                this.f60861a = null;
            } else {
                this.f60861a = (PeriodPrinter[]) arrayList.toArray(new PeriodPrinter[arrayList.size()]);
            }
            if (arrayList2.size() <= null) {
                this.f60862b = null;
            } else {
                this.f60862b = (PeriodParser[]) arrayList2.toArray(new PeriodParser[arrayList2.size()]);
            }
        }

        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.f60861a;
            int length = periodPrinterArr.length;
            int i2 = 0;
            while (i2 < i) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 += periodPrinterArr[length].countFieldsToPrint(readablePeriod, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, locale);
            }
            return i2;
        }

        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.f60861a;
            int length = periodPrinterArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                i += periodPrinterArr[length].calculatePrintedLength(readablePeriod, locale);
            }
        }

        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter printTo : this.f60861a) {
                printTo.printTo(stringBuffer, readablePeriod, locale);
            }
        }

        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            for (PeriodPrinter printTo : this.f60861a) {
                printTo.printTo(writer, readablePeriod, locale);
            }
        }

        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i, Locale locale) {
            PeriodParser[] periodParserArr = this.f60862b;
            if (periodParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = periodParserArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = periodParserArr[i2].parseInto(readWritablePeriod, str, i, locale);
            }
            return i;
        }

        /* renamed from: a */
        private void m70321a(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof PeriodPrinter) {
                    if (obj instanceof C19497a) {
                        m70322a(list2, ((C19497a) obj).f60861a);
                    } else {
                        list2.add(obj);
                    }
                }
                obj = list.get(i + 1);
                if (obj instanceof PeriodParser) {
                    if (obj instanceof C19497a) {
                        m70322a(list3, ((C19497a) obj).f60862b);
                    } else {
                        list3.add(obj);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m70322a(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }
    }

    /* renamed from: org.joda.time.format.n$c */
    static class C19498c implements PeriodParser, PeriodPrinter {
        /* renamed from: a */
        private final int f60863a;
        /* renamed from: b */
        private final int f60864b;
        /* renamed from: c */
        private final int f60865c;
        /* renamed from: d */
        private final boolean f60866d;
        /* renamed from: e */
        private final int f60867e;
        /* renamed from: f */
        private final C19498c[] f60868f;
        /* renamed from: g */
        private final C19327f f60869g;
        /* renamed from: h */
        private final C19327f f60870h;

        C19498c(int i, int i2, int i3, boolean z, int i4, C19498c[] c19498cArr, C19327f c19327f, C19327f c19327f2) {
            this.f60863a = i;
            this.f60864b = i2;
            this.f60865c = i3;
            this.f60866d = z;
            this.f60867e = i4;
            this.f60868f = c19498cArr;
            this.f60869g = c19327f;
            this.f60870h = c19327f2;
        }

        C19498c(C19498c c19498c, C19327f c19327f) {
            this.f60863a = c19498c.f60863a;
            this.f60864b = c19498c.f60864b;
            this.f60865c = c19498c.f60865c;
            this.f60866d = c19498c.f60866d;
            this.f60867e = c19498c.f60867e;
            this.f60868f = c19498c.f60868f;
            this.f60869g = c19498c.f60869g;
            if (c19498c.f60870h != null) {
                c19327f = new C19643b(c19498c.f60870h, c19327f);
            }
            this.f60870h = c19327f;
        }

        /* renamed from: a */
        public void m70327a(C19498c[] c19498cArr) {
            Set hashSet = new HashSet();
            Set hashSet2 = new HashSet();
            for (C19498c c19498c : c19498cArr) {
                if (!(c19498c == null || equals(c19498c))) {
                    hashSet.add(c19498c.f60869g);
                    hashSet2.add(c19498c.f60870h);
                }
            }
            if (this.f60869g != null) {
                this.f60869g.mo14578a(hashSet);
            }
            if (this.f60870h != null) {
                this.f60870h.mo14578a(hashSet2);
            }
        }

        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            if (i <= 0) {
                return 0;
            }
            if (this.f60864b != 4) {
                if (m70325a(readablePeriod) == Format.OFFSET_SAMPLE_RELATIVE) {
                    return 0;
                }
            }
            return 1;
        }

        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            readablePeriod = m70325a(readablePeriod);
            if (readablePeriod == Format.OFFSET_SAMPLE_RELATIVE) {
                return null;
            }
            int max = Math.max(C19320f.m69211a(readablePeriod), this.f60863a);
            if (this.f60867e >= 8) {
                int i;
                if (readablePeriod < null) {
                    i = 5;
                } else {
                    i = 4;
                }
                max = Math.max(max, i) + 1;
                if (this.f60867e == 9 && Math.abs(readablePeriod) % 1000 == 0) {
                    max -= 4;
                }
                readablePeriod /= 1000;
            }
            int i2 = (int) readablePeriod;
            if (this.f60869g != null) {
                max += this.f60869g.mo14728a(i2);
            }
            if (this.f60870h != null) {
                max += this.f60870h.mo14728a(i2);
            }
            return max;
        }

        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            readablePeriod = m70325a(readablePeriod);
            if (readablePeriod != Format.OFFSET_SAMPLE_RELATIVE) {
                int i = (int) readablePeriod;
                if (this.f60867e >= 8) {
                    i = (int) (readablePeriod / 1000);
                }
                if (this.f60869g != null) {
                    this.f60869g.mo14731a(stringBuffer, i);
                }
                int length = stringBuffer.length();
                int i2 = this.f60863a;
                if (i2 <= 1) {
                    C19320f.m69219a(stringBuffer, i);
                } else {
                    C19320f.m69220a(stringBuffer, i, i2);
                }
                if (this.f60867e >= 8) {
                    int abs = (int) (Math.abs(readablePeriod) % 1000);
                    if (this.f60867e == 8 || abs > 0) {
                        if (readablePeriod < 0 && readablePeriod > -1000) {
                            stringBuffer.insert(length, '-');
                        }
                        stringBuffer.append('.');
                        C19320f.m69220a(stringBuffer, abs, 3);
                    }
                }
                if (this.f60870h != null) {
                    this.f60870h.mo14731a(stringBuffer, i);
                }
            }
        }

        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            readablePeriod = m70325a(readablePeriod);
            if (readablePeriod != Format.OFFSET_SAMPLE_RELATIVE) {
                int i = (int) readablePeriod;
                if (this.f60867e >= 8) {
                    i = (int) (readablePeriod / 1000);
                }
                if (this.f60869g != null) {
                    this.f60869g.mo14730a(writer, i);
                }
                int i2 = this.f60863a;
                if (i2 <= 1) {
                    C19320f.m69214a(writer, i);
                } else {
                    C19320f.m69215a(writer, i, i2);
                }
                if (this.f60867e >= 8) {
                    int abs = (int) (Math.abs(readablePeriod) % 1000);
                    if (this.f60867e == 8 || abs > 0) {
                        writer.write(46);
                        C19320f.m69215a(writer, abs, 3);
                    }
                }
                if (this.f60870h != null) {
                    this.f60870h.mo14730a(writer, i);
                }
            }
        }

        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i, Locale locale) {
            ReadWritablePeriod readWritablePeriod2 = readWritablePeriod;
            String str2 = str;
            int i2 = i;
            Object obj = this.f60864b == 4 ? 1 : null;
            if (i2 >= str.length()) {
                return obj != null ? i2 ^ -1 : i2;
            }
            int i3;
            if (r0.f60869g != null) {
                i2 = r0.f60869g.mo14729a(str2, i2);
                if (i2 < 0) {
                    return obj == null ? i2 ^ -1 : i2;
                } else {
                    obj = 1;
                }
            }
            if (r0.f60870h == null || obj != null) {
                i3 = -1;
            } else {
                i3 = r0.f60870h.mo14733b(str2, i2);
                if (i3 < 0) {
                    return obj == null ? i3 ^ -1 : i3;
                } else {
                    obj = 1;
                }
            }
            if (obj == null && !m70328a(readWritablePeriod.getPeriodType(), r0.f60867e)) {
                return i2;
            }
            int min;
            if (i3 > 0) {
                min = Math.min(r0.f60865c, i3 - i2);
            } else {
                min = Math.min(r0.f60865c, str.length() - i2);
            }
            int i4 = i2;
            i2 = 0;
            int i5 = -1;
            Object obj2 = null;
            Object obj3 = null;
            while (i2 < min) {
                int i6;
                int i7 = i4 + i2;
                char charAt = str2.charAt(i7);
                if (i2 == 0 && ((charAt == '-' || charAt == '+') && !r0.f60866d)) {
                    obj3 = charAt == '-' ? 1 : null;
                    i6 = i2 + 1;
                    if (i6 >= min) {
                        break;
                    }
                    char charAt2 = str2.charAt(i7 + 1);
                    if (charAt2 < '0') {
                        break;
                    } else if (charAt2 > '9') {
                        break;
                    } else {
                        if (obj3 != null) {
                            i2 = i6;
                        } else {
                            i4++;
                        }
                        min = Math.min(min + 1, str.length() - i4);
                    }
                } else {
                    if (charAt < '0' || charAt > '9') {
                        if ((charAt != '.' && charAt != ',') || (r0.f60867e != 8 && r0.f60867e != 9)) {
                            break;
                        } else if (i5 >= 0) {
                            break;
                        } else {
                            i7++;
                            min = Math.min(min + 1, str.length() - i4);
                            i5 = i7;
                        }
                    } else {
                        obj2 = 1;
                    }
                    i2++;
                }
            }
            if (obj2 == null) {
                return i4 ^ -1;
            }
            if (i3 >= 0 && i4 + i2 != i3) {
                return i4;
            }
            if (r0.f60867e != 8 && r0.f60867e != 9) {
                m70326a(readWritablePeriod2, r0.f60867e, m70323a(str2, i4, i2));
            } else if (i5 < 0) {
                m70326a(readWritablePeriod2, 6, m70323a(str2, i4, i2));
                m70326a(readWritablePeriod2, 7, 0);
            } else {
                i3 = m70323a(str2, i4, (i5 - i4) - 1);
                m70326a(readWritablePeriod2, 6, i3);
                int i8 = (i4 + i2) - i5;
                if (i8 <= 0) {
                    i8 = 0;
                } else {
                    if (i8 >= 3) {
                        i8 = m70323a(str2, i5, 3);
                    } else {
                        i6 = m70323a(str2, i5, i8);
                        i8 = i8 == 1 ? i6 * 100 : i6 * 10;
                    }
                    if (obj3 != null || i3 < 0) {
                        i8 = -i8;
                    }
                }
                m70326a(readWritablePeriod2, 7, i8);
            }
            i4 += i2;
            if (i4 >= 0 && r0.f60870h != null) {
                i4 = r0.f60870h.mo14729a(str2, i4);
            }
            return i4;
        }

        /* renamed from: a */
        private int m70323a(String str, int i, int i2) {
            if (i2 >= 10) {
                return Integer.parseInt(str.substring(i, i2 + i));
            }
            int i3 = 0;
            if (i2 <= 0) {
                return 0;
            }
            int i4 = i + 1;
            i = str.charAt(i);
            i2--;
            if (i == 45) {
                i2--;
                if (i2 < 0) {
                    return 0;
                }
                i = i4 + 1;
                char charAt = str.charAt(i4);
                i4 = i;
                i = charAt;
                i3 = 1;
            }
            i -= 48;
            while (true) {
                int i5 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                i2 = (i << 3) + (i << 1);
                i4++;
                i = (i2 + str.charAt(i4)) - 48;
                i2 = i5;
            }
            if (i3 != 0) {
                i = -i;
            }
            return i;
        }

        /* renamed from: a */
        long m70325a(ReadablePeriod readablePeriod) {
            PeriodType periodType;
            if (this.f60864b == 4) {
                periodType = null;
            } else {
                periodType = readablePeriod.getPeriodType();
            }
            if (periodType != null && !m70328a(periodType, this.f60867e)) {
                return Format.OFFSET_SAMPLE_RELATIVE;
            }
            long j;
            switch (this.f60867e) {
                case 0:
                    j = (long) readablePeriod.get(DurationFieldType.m68927j());
                    break;
                case 1:
                    j = (long) readablePeriod.get(DurationFieldType.m68926i());
                    break;
                case 2:
                    j = (long) readablePeriod.get(DurationFieldType.m68924g());
                    break;
                case 3:
                    j = (long) readablePeriod.get(DurationFieldType.m68923f());
                    break;
                case 4:
                    j = (long) readablePeriod.get(DurationFieldType.m68921d());
                    break;
                case 5:
                    j = (long) readablePeriod.get(DurationFieldType.m68920c());
                    break;
                case 6:
                    j = (long) readablePeriod.get(DurationFieldType.m68919b());
                    break;
                case 7:
                    j = (long) readablePeriod.get(DurationFieldType.m68918a());
                    break;
                case 8:
                case 9:
                    j = (((long) readablePeriod.get(DurationFieldType.m68919b())) * 1000) + ((long) readablePeriod.get(DurationFieldType.m68918a()));
                    break;
                default:
                    return Format.OFFSET_SAMPLE_RELATIVE;
            }
            if (j == 0) {
                int i = this.f60864b;
                if (i != 5) {
                    switch (i) {
                        case 1:
                            if (m70329b(readablePeriod) == null || this.f60868f[this.f60867e] != this) {
                                return Format.OFFSET_SAMPLE_RELATIVE;
                            }
                            readablePeriod = Math.min(this.f60867e, 8) - 1;
                            while (readablePeriod >= null && readablePeriod <= 9) {
                                if (m70328a(periodType, readablePeriod) && this.f60868f[readablePeriod] != null) {
                                    return Format.OFFSET_SAMPLE_RELATIVE;
                                }
                                readablePeriod--;
                            }
                            break;
                        case 2:
                            if (m70329b(readablePeriod) != null && this.f60868f[this.f60867e] == this) {
                                readablePeriod = this.f60867e;
                                while (true) {
                                    readablePeriod++;
                                    if (readablePeriod > 9) {
                                        break;
                                    } else if (m70328a(periodType, readablePeriod) && this.f60868f[readablePeriod] != null) {
                                        return Format.OFFSET_SAMPLE_RELATIVE;
                                    }
                                }
                            } else {
                                return Format.OFFSET_SAMPLE_RELATIVE;
                            }
                            break;
                        default:
                            break;
                    }
                }
                return Format.OFFSET_SAMPLE_RELATIVE;
            }
            return j;
        }

        /* renamed from: b */
        boolean m70329b(ReadablePeriod readablePeriod) {
            int size = readablePeriod.size();
            for (int i = 0; i < size; i++) {
                if (readablePeriod.getValue(i) != 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        boolean m70328a(PeriodType periodType, int i) {
            boolean z = false;
            switch (i) {
                case 0:
                    return periodType.m68945a(DurationFieldType.m68927j());
                case 1:
                    return periodType.m68945a(DurationFieldType.m68926i());
                case 2:
                    return periodType.m68945a(DurationFieldType.m68924g());
                case 3:
                    return periodType.m68945a(DurationFieldType.m68923f());
                case 4:
                    return periodType.m68945a(DurationFieldType.m68921d());
                case 5:
                    return periodType.m68945a(DurationFieldType.m68920c());
                case 6:
                    return periodType.m68945a(DurationFieldType.m68919b());
                case 7:
                    return periodType.m68945a(DurationFieldType.m68918a());
                case 8:
                case 9:
                    if (!(periodType.m68945a(DurationFieldType.m68919b()) == 0 && periodType.m68945a(DurationFieldType.m68918a()) == null)) {
                        z = true;
                    }
                    return z;
                default:
                    return false;
            }
        }

        /* renamed from: a */
        void m70326a(ReadWritablePeriod readWritablePeriod, int i, int i2) {
            switch (i) {
                case 0:
                    readWritablePeriod.setYears(i2);
                    return;
                case 1:
                    readWritablePeriod.setMonths(i2);
                    return;
                case 2:
                    readWritablePeriod.setWeeks(i2);
                    return;
                case 3:
                    readWritablePeriod.setDays(i2);
                    return;
                case 4:
                    readWritablePeriod.setHours(i2);
                    return;
                case 5:
                    readWritablePeriod.setMinutes(i2);
                    return;
                case 6:
                    readWritablePeriod.setSeconds(i2);
                    return;
                case 7:
                    readWritablePeriod.setMillis(i2);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        int m70324a() {
            return this.f60867e;
        }
    }

    /* renamed from: org.joda.time.format.n$d */
    static abstract class C19499d implements C19327f {
        /* renamed from: a */
        private volatile String[] f60871a;

        C19499d() {
        }

        /* renamed from: a */
        public void mo14578a(Set<C19327f> set) {
            if (this.f60871a == null) {
                String str = null;
                int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                for (String str2 : mo14732a()) {
                    if (str2.length() < i) {
                        i = str2.length();
                        str = str2;
                    }
                }
                Set hashSet = new HashSet();
                for (C19327f c19327f : set) {
                    if (c19327f != null) {
                        for (String str3 : c19327f.mo14732a()) {
                            if (str3.length() > i || (str3.equalsIgnoreCase(r5) && !str3.equals(r5))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.f60871a = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }

        /* renamed from: a */
        protected boolean m70331a(int i, String str, int i2) {
            if (this.f60871a != null) {
                for (String str2 : this.f60871a) {
                    int length = str2.length();
                    if ((i < length && str.regionMatches(true, i2, str2, 0, length)) || (i == length && str.regionMatches(false, i2, str2, 0, length))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: org.joda.time.format.n$e */
    static class C19500e implements PeriodParser, PeriodPrinter {
        /* renamed from: a */
        static final C19500e f60872a = new C19500e("");
        /* renamed from: b */
        private final String f60873b;

        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            return 0;
        }

        C19500e(String str) {
            this.f60873b = str;
        }

        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            return this.f60873b.length();
        }

        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            stringBuffer.append(this.f60873b);
        }

        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            writer.write(this.f60873b);
        }

        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i, Locale locale) {
            return str.regionMatches(true, i, this.f60873b, 0, this.f60873b.length()) != null ? i + this.f60873b.length() : i ^ -1;
        }
    }

    /* renamed from: org.joda.time.format.n$g */
    static class C19501g implements PeriodParser, PeriodPrinter {
        /* renamed from: a */
        private final String f60874a;
        /* renamed from: b */
        private final String f60875b;
        /* renamed from: c */
        private final String[] f60876c;
        /* renamed from: d */
        private final boolean f60877d;
        /* renamed from: e */
        private final boolean f60878e;
        /* renamed from: f */
        private final PeriodPrinter f60879f;
        /* renamed from: g */
        private volatile PeriodPrinter f60880g;
        /* renamed from: h */
        private final PeriodParser f60881h;
        /* renamed from: i */
        private volatile PeriodParser f60882i;

        C19501g(String str, String str2, String[] strArr, PeriodPrinter periodPrinter, PeriodParser periodParser, boolean z, boolean z2) {
            this.f60874a = str;
            this.f60875b = str2;
            if (str2 == null || str.equals(str2)) {
                if (strArr != null) {
                    if (strArr.length == 0) {
                    }
                }
                this.f60876c = new String[]{str};
                this.f60879f = periodPrinter;
                this.f60881h = periodParser;
                this.f60877d = z;
                this.f60878e = z2;
            }
            Collection treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
            treeSet.add(str);
            treeSet.add(str2);
            if (strArr != null) {
                str = strArr.length;
                while (true) {
                    str--;
                    if (str < null) {
                        break;
                    }
                    treeSet.add(strArr[str]);
                }
            }
            str = new ArrayList(treeSet);
            Collections.reverse(str);
            this.f60876c = (String[]) str.toArray(new String[str.size()]);
            this.f60879f = periodPrinter;
            this.f60881h = periodParser;
            this.f60877d = z;
            this.f60878e = z2;
        }

        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            int countFieldsToPrint = this.f60879f.countFieldsToPrint(readablePeriod, i, locale);
            return countFieldsToPrint < i ? countFieldsToPrint + this.f60880g.countFieldsToPrint(readablePeriod, i, locale) : countFieldsToPrint;
        }

        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter periodPrinter = this.f60879f;
            PeriodPrinter periodPrinter2 = this.f60880g;
            int calculatePrintedLength = periodPrinter.calculatePrintedLength(readablePeriod, locale) + periodPrinter2.calculatePrintedLength(readablePeriod, locale);
            if (!this.f60877d) {
                return (!this.f60878e || periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) <= null) ? calculatePrintedLength : calculatePrintedLength + this.f60874a.length();
            } else {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) <= 0) {
                    return calculatePrintedLength;
                }
                if (!this.f60878e) {
                    return calculatePrintedLength + this.f60874a.length();
                }
                readablePeriod = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                if (readablePeriod <= null) {
                    return calculatePrintedLength;
                }
                return calculatePrintedLength + (readablePeriod > 1 ? this.f60874a : this.f60875b).length();
            }
        }

        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter periodPrinter = this.f60879f;
            PeriodPrinter periodPrinter2 = this.f60880g;
            periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            if (this.f60877d) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.f60878e) {
                        int countFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (countFieldsToPrint > 0) {
                            stringBuffer.append(countFieldsToPrint > 1 ? this.f60874a : this.f60875b);
                        }
                    } else {
                        stringBuffer.append(this.f60874a);
                    }
                }
            } else if (this.f60878e && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                stringBuffer.append(this.f60874a);
            }
            periodPrinter2.printTo(stringBuffer, readablePeriod, locale);
        }

        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            PeriodPrinter periodPrinter = this.f60879f;
            PeriodPrinter periodPrinter2 = this.f60880g;
            periodPrinter.printTo(writer, readablePeriod, locale);
            if (this.f60877d) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.f60878e) {
                        int countFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (countFieldsToPrint > 0) {
                            writer.write(countFieldsToPrint > 1 ? this.f60874a : this.f60875b);
                        }
                    } else {
                        writer.write(this.f60874a);
                    }
                }
            } else if (this.f60878e && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                writer.write(this.f60874a);
            }
            periodPrinter2.printTo(writer, readablePeriod, locale);
        }

        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i, Locale locale) {
            ReadWritablePeriod readWritablePeriod2 = readWritablePeriod;
            String str2 = str;
            int i2 = i;
            Locale locale2 = locale;
            int parseInto = this.f60881h.parseInto(readWritablePeriod2, str2, i2, locale2);
            if (parseInto < 0) {
                return parseInto;
            }
            int i3;
            Object obj;
            int parseInto2;
            if (parseInto > i2) {
                String[] strArr = r0.f60876c;
                int length = strArr.length;
                int i4 = 0;
                while (i4 < length) {
                    String str3;
                    String str4 = strArr[i4];
                    if (str4 == null || str4.length() == 0) {
                        str3 = str4;
                    } else {
                        str3 = str4;
                        if (!str2.regionMatches(true, parseInto, str4, 0, str4.length())) {
                            i4++;
                        }
                    }
                    if (str3 == null) {
                        i3 = 0;
                    } else {
                        i3 = str3.length();
                    }
                    parseInto += i3;
                    obj = 1;
                    parseInto2 = r0.f60882i.parseInto(readWritablePeriod2, str2, parseInto, locale2);
                    if (parseInto2 < 0) {
                        return parseInto2;
                    }
                    if (obj == null && parseInto2 == parseInto && r17 > 0) {
                        return parseInto ^ -1;
                    }
                    return (parseInto2 > parseInto || obj != null || r0.f60877d) ? parseInto2 : parseInto ^ -1;
                }
            }
            obj = null;
            i3 = -1;
            parseInto2 = r0.f60882i.parseInto(readWritablePeriod2, str2, parseInto, locale2);
            if (parseInto2 < 0) {
                return parseInto2;
            }
            if (obj == null) {
            }
            if (parseInto2 > parseInto) {
            }
        }

        /* renamed from: a */
        C19501g m70334a(PeriodPrinter periodPrinter, PeriodParser periodParser) {
            this.f60880g = periodPrinter;
            this.f60882i = periodParser;
            return this;
        }
    }

    /* renamed from: org.joda.time.format.n$b */
    static class C19643b extends C19499d {
        /* renamed from: a */
        private final C19327f f61424a;
        /* renamed from: b */
        private final C19327f f61425b;
        /* renamed from: c */
        private final String[] f61426c;

        C19643b(C19327f c19327f, C19327f c19327f2) {
            this.f61424a = c19327f;
            this.f61425b = c19327f2;
            c19327f = new HashSet();
            for (String str : this.f61424a.mo14732a()) {
                for (String str2 : this.f61425b.mo14732a()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(str2);
                    c19327f.add(stringBuilder.toString());
                }
            }
            this.f61426c = (String[]) c19327f.toArray(new String[c19327f.size()]);
        }

        /* renamed from: a */
        public int mo14728a(int i) {
            return this.f61424a.mo14728a(i) + this.f61425b.mo14728a(i);
        }

        /* renamed from: a */
        public void mo14731a(StringBuffer stringBuffer, int i) {
            this.f61424a.mo14731a(stringBuffer, i);
            this.f61425b.mo14731a(stringBuffer, i);
        }

        /* renamed from: a */
        public void mo14730a(Writer writer, int i) throws IOException {
            this.f61424a.mo14730a(writer, i);
            this.f61425b.mo14730a(writer, i);
        }

        /* renamed from: a */
        public int mo14729a(String str, int i) {
            int a = this.f61424a.mo14729a(str, i);
            if (a >= 0) {
                a = this.f61425b.mo14729a(str, a);
                if (a >= 0 && m70331a(mo14729a(str, a) - a, str, i) != null) {
                    return i ^ -1;
                }
            }
            return a;
        }

        /* renamed from: b */
        public int mo14733b(String str, int i) {
            int b = this.f61424a.mo14733b(str, i);
            if (b >= 0) {
                int b2 = this.f61425b.mo14733b(str, this.f61424a.mo14729a(str, b));
                if (b2 < 0 || m70331a(this.f61425b.mo14729a(str, b2) - b, str, i) == null) {
                    return b > 0 ? b : b2;
                }
            }
            return i ^ -1;
        }

        /* renamed from: a */
        public String[] mo14732a() {
            return (String[]) this.f61426c.clone();
        }
    }

    /* renamed from: org.joda.time.format.n$h */
    static class C19644h extends C19499d {
        /* renamed from: a */
        private final String f61427a;

        C19644h(String str) {
            this.f61427a = str;
        }

        /* renamed from: a */
        public int mo14728a(int i) {
            return this.f61427a.length();
        }

        /* renamed from: a */
        public void mo14731a(StringBuffer stringBuffer, int i) {
            stringBuffer.append(this.f61427a);
        }

        /* renamed from: a */
        public void mo14730a(Writer writer, int i) throws IOException {
            writer.write(this.f61427a);
        }

        /* renamed from: a */
        public int mo14729a(String str, int i) {
            String str2 = this.f61427a;
            int length = str2.length();
            return (str.regionMatches(true, i, str2, 0, length) && m70331a(length, str, i) == null) ? i + length : i ^ -1;
        }

        /* renamed from: b */
        public int mo14733b(String str, int i) {
            String str2 = this.f61427a;
            int length = str2.length();
            int length2 = str.length();
            int i2 = i;
            while (i2 < length2) {
                if (str.regionMatches(true, i2, str2, 0, length) && !m70331a(length, str, i2)) {
                    return i2;
                }
                switch (str.charAt(i2)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i2++;
                    default:
                        break;
                }
                return i ^ -1;
            }
            return i ^ -1;
        }

        /* renamed from: a */
        public String[] mo14732a() {
            return new String[]{this.f61427a};
        }
    }

    public C19328n() {
        m69311b();
    }

    /* renamed from: a */
    public C19326m m69308a() {
        C19326m a = C19328n.m69300a(this.f60279g, this.f60280h, this.f60281i);
        for (C19498c c19498c : this.f60282j) {
            if (c19498c != null) {
                c19498c.m70327a(this.f60282j);
            }
        }
        this.f60282j = (C19498c[]) this.f60282j.clone();
        return a;
    }

    /* renamed from: b */
    public void m69311b() {
        this.f60274b = 1;
        this.f60275c = 2;
        this.f60276d = 10;
        this.f60277e = false;
        this.f60278f = null;
        if (this.f60279g == null) {
            this.f60279g = new ArrayList();
        } else {
            this.f60279g.clear();
        }
        this.f60280h = false;
        this.f60281i = false;
        this.f60282j = new C19498c[10];
    }

    /* renamed from: a */
    public C19328n m69309a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        m69307j();
        PeriodPrinter c19500e = new C19500e(str);
        m69302a(c19500e, (PeriodParser) c19500e);
        return this;
    }

    /* renamed from: c */
    public C19328n m69312c() {
        m69304a(0);
        return this;
    }

    /* renamed from: d */
    public C19328n m69314d() {
        m69304a(1);
        return this;
    }

    /* renamed from: e */
    public C19328n m69315e() {
        m69304a(2);
        return this;
    }

    /* renamed from: f */
    public C19328n m69316f() {
        m69304a(3);
        return this;
    }

    /* renamed from: g */
    public C19328n m69317g() {
        m69304a(4);
        return this;
    }

    /* renamed from: h */
    public C19328n m69318h() {
        m69304a(5);
        return this;
    }

    /* renamed from: i */
    public C19328n m69319i() {
        m69304a(9);
        return this;
    }

    /* renamed from: a */
    private void m69304a(int i) {
        m69305a(i, this.f60274b);
    }

    /* renamed from: a */
    private void m69305a(int i, int i2) {
        PeriodPrinter c19498c = new C19498c(i2, this.f60275c, this.f60276d, this.f60277e, i, this.f60282j, this.f60278f, null);
        m69302a(c19498c, (PeriodParser) c19498c);
        this.f60282j[i] = c19498c;
        this.f60278f = 0;
    }

    /* renamed from: b */
    public C19328n m69310b(String str) {
        if (str != null) {
            return m69303a(new C19644h(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private C19328n m69303a(C19327f c19327f) {
        Object obj = null;
        Object obj2;
        if (this.f60279g.size() > 0) {
            obj = this.f60279g.get(this.f60279g.size() - 2);
            obj2 = this.f60279g.get(this.f60279g.size() - 1);
        } else {
            obj2 = null;
        }
        if (!(obj == null || r0 == null || obj != r0)) {
            if (obj instanceof C19498c) {
                m69307j();
                C19498c c19498c = new C19498c((C19498c) obj, c19327f);
                this.f60279g.set(this.f60279g.size() - 2, c19498c);
                this.f60279g.set(this.f60279g.size() - 1, c19498c);
                this.f60282j[c19498c.m70324a()] = c19498c;
                return this;
            }
        }
        throw new IllegalStateException("No field to apply suffix to");
    }

    /* renamed from: c */
    public C19328n m69313c(String str) {
        return m69301a(str, str, null, false, true);
    }

    /* renamed from: a */
    private C19328n m69301a(String str, String str2, String[] strArr, boolean z, boolean z2) {
        C19328n c19328n = this;
        if (str != null) {
            if (str2 != null) {
                m69307j();
                List list = c19328n.f60279g;
                if (list.size() == 0) {
                    if (z2 && !z) {
                        PeriodPrinter c19501g = new C19501g(str, str2, strArr, C19500e.f60872a, C19500e.f60872a, z, z2);
                        m69302a(c19501g, (PeriodParser) c19501g);
                    }
                    return c19328n;
                }
                C19501g c19501g2 = null;
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (list.get(size) instanceof C19501g) {
                        break;
                    } else {
                        size--;
                    }
                }
                c19501g2 = (C19501g) list.get(size);
                list = list.subList(size + 1, list.size());
                List list2 = list;
                if (c19501g2 == null || list2.size() != 0) {
                    Object[] a = C19328n.m69306a(list2);
                    list2.clear();
                    C19501g c19501g3 = new C19501g(str, str2, strArr, (PeriodPrinter) a[0], (PeriodParser) a[1], z, z2);
                    list2.add(c19501g3);
                    list2.add(c19501g3);
                    return c19328n;
                }
                throw new IllegalStateException("Cannot have two adjacent separators");
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    private void m69307j() throws IllegalStateException {
        if (this.f60278f != null) {
            throw new IllegalStateException("Prefix not followed by field");
        }
        this.f60278f = null;
    }

    /* renamed from: a */
    private C19328n m69302a(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        this.f60279g.add(periodPrinter);
        this.f60279g.add(periodParser);
        int i = 0;
        this.f60280h = (periodPrinter == null ? true : null) | this.f60280h;
        periodPrinter = this.f60281i;
        if (periodParser == null) {
            i = 1;
        }
        this.f60281i = periodPrinter | i;
        return this;
    }

    /* renamed from: a */
    private static C19326m m69300a(List<Object> list, boolean z, boolean z2) {
        if (z && z2) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof C19501g)) {
            C19501g c19501g = (C19501g) list.get(0);
            if (c19501g.f60882i == null && c19501g.f60880g == null) {
                list = C19328n.m69300a(list.subList(2, size), z, z2);
                list = c19501g.m70334a(list.m69289a(), list.m69292b());
                return new C19326m(list, list);
            }
        }
        list = C19328n.m69306a((List) list);
        if (z) {
            return new C19326m(null, (PeriodParser) list[1]);
        }
        if (z2) {
            return new C19326m((PeriodPrinter) list[0], null);
        }
        return new C19326m((PeriodPrinter) list[0], (PeriodParser) list[1]);
    }

    /* renamed from: a */
    private static Object[] m69306a(List<Object> list) {
        switch (list.size()) {
            case 0:
                return new Object[]{C19500e.f60872a, C19500e.f60872a};
            case 1:
                return new Object[]{list.get(0), list.get(1)};
            default:
                C19497a c19497a = new C19497a(list);
                return new Object[]{c19497a, c19497a};
        }
    }
}
