package org.apache.commons.lang3.time;

import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.exception.C15992a;

public class FastDatePrinter implements Serializable, DatePrinter {
    /* renamed from: f */
    private static final ConcurrentMap<C16000i, String> f55183f = new ConcurrentHashMap(7);
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private final String f55184a;
    /* renamed from: b */
    private final TimeZone f55185b;
    /* renamed from: c */
    private final Locale f55186c;
    /* renamed from: d */
    private transient C15999f[] f55187d;
    /* renamed from: e */
    private transient int f55188e;

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$f */
    private interface C15999f {
        /* renamed from: a */
        int mo13478a();

        /* renamed from: a */
        void mo13479a(Appendable appendable, Calendar calendar) throws IOException;
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$i */
    private static class C16000i {
        /* renamed from: a */
        private final TimeZone f49751a;
        /* renamed from: b */
        private final int f49752b;
        /* renamed from: c */
        private final Locale f49753c;

        C16000i(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.f49751a = timeZone;
            if (z) {
                this.f49752b = Integer.MIN_VALUE | i;
            } else {
                this.f49752b = i;
            }
            this.f49753c = locale;
        }

        public int hashCode() {
            return (((this.f49752b * 31) + this.f49753c.hashCode()) * 31) + this.f49751a.hashCode();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16000i)) {
                return false;
            }
            C16000i c16000i = (C16000i) obj;
            if (!this.f49751a.equals(c16000i.f49751a) || this.f49752b != c16000i.f49752b || this.f49753c.equals(c16000i.f49753c) == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$a */
    private static class C17724a implements C15999f {
        /* renamed from: a */
        private final char f55168a;

        /* renamed from: a */
        public int mo13478a() {
            return 1;
        }

        C17724a(char c) {
            this.f55168a = c;
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f55168a);
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$c */
    private static class C17725c implements C15999f {
        /* renamed from: a */
        static final C17725c f55169a = new C17725c(3);
        /* renamed from: b */
        static final C17725c f55170b = new C17725c(5);
        /* renamed from: c */
        static final C17725c f55171c = new C17725c(6);
        /* renamed from: d */
        final int f55172d;

        /* renamed from: a */
        static C17725c m64588a(int i) {
            switch (i) {
                case 1:
                    return f55169a;
                case 2:
                    return f55170b;
                case 3:
                    return f55171c;
                default:
                    throw new IllegalArgumentException("invalid number of X");
            }
        }

        C17725c(int i) {
            this.f55172d = i;
        }

        /* renamed from: a */
        public int mo13478a() {
            return this.f55172d;
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i == 0) {
                appendable.append("Z");
                return;
            }
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            FastDatePrinter.m64606b(appendable, i2);
            if (this.f55172d >= 5) {
                if (this.f55172d == 6) {
                    appendable.append(':');
                }
                FastDatePrinter.m64606b(appendable, (i / ManagerWebServices.TIMEOUT_AUTH_MS) - (i2 * 60));
            }
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$d */
    private interface C17726d extends C15999f {
        /* renamed from: a */
        void mo13961a(Appendable appendable, int i) throws IOException;
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$g */
    private static class C17727g implements C15999f {
        /* renamed from: a */
        private final String f55173a;

        C17727g(String str) {
            this.f55173a = str;
        }

        /* renamed from: a */
        public int mo13478a() {
            return this.f55173a.length();
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f55173a);
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$h */
    private static class C17728h implements C15999f {
        /* renamed from: a */
        private final int f55174a;
        /* renamed from: b */
        private final String[] f55175b;

        C17728h(int i, String[] strArr) {
            this.f55174a = i;
            this.f55175b = strArr;
        }

        /* renamed from: a */
        public int mo13478a() {
            int length = this.f55175b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.f55175b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f55175b[calendar.get(this.f55174a)]);
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$j */
    private static class C17729j implements C15999f {
        /* renamed from: a */
        private final Locale f55176a;
        /* renamed from: b */
        private final int f55177b;
        /* renamed from: c */
        private final String f55178c;
        /* renamed from: d */
        private final String f55179d;

        C17729j(TimeZone timeZone, Locale locale, int i) {
            this.f55176a = locale;
            this.f55177b = i;
            this.f55178c = FastDatePrinter.m64602a(timeZone, false, i, locale);
            this.f55179d = FastDatePrinter.m64602a(timeZone, true, i, locale);
        }

        /* renamed from: a */
        public int mo13478a() {
            return Math.max(this.f55178c.length(), this.f55179d.length());
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) != null) {
                appendable.append(FastDatePrinter.m64602a(timeZone, true, this.f55177b, this.f55176a));
            } else {
                appendable.append(FastDatePrinter.m64602a(timeZone, null, this.f55177b, this.f55176a));
            }
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$k */
    private static class C17730k implements C15999f {
        /* renamed from: a */
        static final C17730k f55180a = new C17730k(true);
        /* renamed from: b */
        static final C17730k f55181b = new C17730k(false);
        /* renamed from: c */
        final boolean f55182c;

        /* renamed from: a */
        public int mo13478a() {
            return 5;
        }

        C17730k(boolean z) {
            this.f55182c = z;
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            FastDatePrinter.m64606b(appendable, i2);
            if (this.f55182c) {
                appendable.append(':');
            }
            FastDatePrinter.m64606b(appendable, (i / ManagerWebServices.TIMEOUT_AUTH_MS) - (i2 * 60));
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$b */
    private static class C18562b implements C17726d {
        /* renamed from: a */
        private final C17726d f57817a;

        C18562b(C17726d c17726d) {
            this.f57817a = c17726d;
        }

        /* renamed from: a */
        public int mo13478a() {
            return this.f57817a.mo13478a();
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            int i = 7;
            calendar = calendar.get(7);
            C17726d c17726d = this.f57817a;
            if (calendar != 1) {
                i = calendar - 1;
            }
            c17726d.mo13961a(appendable, i);
        }

        /* renamed from: a */
        public void mo13961a(Appendable appendable, int i) throws IOException {
            this.f57817a.mo13961a(appendable, i);
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$e */
    private static class C18563e implements C17726d {
        /* renamed from: a */
        private final int f57818a;
        /* renamed from: b */
        private final int f57819b;

        C18563e(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.f57818a = i;
            this.f57819b = i2;
        }

        /* renamed from: a */
        public int mo13478a() {
            return this.f57819b;
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            mo13961a(appendable, calendar.get(this.f57818a));
        }

        /* renamed from: a */
        public final void mo13961a(Appendable appendable, int i) throws IOException {
            FastDatePrinter.m64607b(appendable, i, this.f57819b);
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$l */
    private static class C18564l implements C17726d {
        /* renamed from: a */
        private final C17726d f57820a;

        C18564l(C17726d c17726d) {
            this.f57820a = c17726d;
        }

        /* renamed from: a */
        public int mo13478a() {
            return this.f57820a.mo13478a();
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(10);
            if (i == 0) {
                i = calendar.getLeastMaximum(10) + 1;
            }
            this.f57820a.mo13961a(appendable, i);
        }

        /* renamed from: a */
        public void mo13961a(Appendable appendable, int i) throws IOException {
            this.f57820a.mo13961a(appendable, i);
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$m */
    private static class C18565m implements C17726d {
        /* renamed from: a */
        private final C17726d f57821a;

        C18565m(C17726d c17726d) {
            this.f57821a = c17726d;
        }

        /* renamed from: a */
        public int mo13478a() {
            return this.f57821a.mo13478a();
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(11);
            if (i == 0) {
                i = calendar.getMaximum(11) + 1;
            }
            this.f57821a.mo13961a(appendable, i);
        }

        /* renamed from: a */
        public void mo13961a(Appendable appendable, int i) throws IOException {
            this.f57821a.mo13961a(appendable, i);
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$n */
    private static class C18566n implements C17726d {
        /* renamed from: a */
        static final C18566n f57822a = new C18566n();

        /* renamed from: a */
        public int mo13478a() {
            return 2;
        }

        C18566n() {
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            mo13961a(appendable, calendar.get(2) + 1);
        }

        /* renamed from: a */
        public final void mo13961a(Appendable appendable, int i) throws IOException {
            FastDatePrinter.m64606b(appendable, i);
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$o */
    private static class C18567o implements C17726d {
        /* renamed from: a */
        private final int f57823a;

        /* renamed from: a */
        public int mo13478a() {
            return 2;
        }

        C18567o(int i) {
            this.f57823a = i;
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            mo13961a(appendable, calendar.get(this.f57823a));
        }

        /* renamed from: a */
        public final void mo13961a(Appendable appendable, int i) throws IOException {
            if (i < 100) {
                FastDatePrinter.m64606b(appendable, i);
            } else {
                FastDatePrinter.m64607b(appendable, i, 2);
            }
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$p */
    private static class C18568p implements C17726d {
        /* renamed from: a */
        static final C18568p f57824a = new C18568p();

        /* renamed from: a */
        public int mo13478a() {
            return 2;
        }

        C18568p() {
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            mo13961a(appendable, calendar.get(1) % 100);
        }

        /* renamed from: a */
        public final void mo13961a(Appendable appendable, int i) throws IOException {
            FastDatePrinter.m64606b(appendable, i);
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$q */
    private static class C18569q implements C17726d {
        /* renamed from: a */
        static final C18569q f57825a = new C18569q();

        /* renamed from: a */
        public int mo13478a() {
            return 2;
        }

        C18569q() {
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            mo13961a(appendable, calendar.get(2) + 1);
        }

        /* renamed from: a */
        public final void mo13961a(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else {
                FastDatePrinter.m64606b(appendable, i);
            }
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$r */
    private static class C18570r implements C17726d {
        /* renamed from: a */
        private final int f57826a;

        /* renamed from: a */
        public int mo13478a() {
            return 4;
        }

        C18570r(int i) {
            this.f57826a = i;
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            mo13961a(appendable, calendar.get(this.f57826a));
        }

        /* renamed from: a */
        public final void mo13961a(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else if (i < 100) {
                FastDatePrinter.m64606b(appendable, i);
            } else {
                FastDatePrinter.m64607b(appendable, i, 1);
            }
        }
    }

    /* renamed from: org.apache.commons.lang3.time.FastDatePrinter$s */
    private static class C18571s implements C17726d {
        /* renamed from: a */
        private final C17726d f57827a;

        C18571s(C17726d c17726d) {
            this.f57827a = c17726d;
        }

        /* renamed from: a */
        public int mo13478a() {
            return this.f57827a.mo13478a();
        }

        /* renamed from: a */
        public void mo13479a(Appendable appendable, Calendar calendar) throws IOException {
            this.f57827a.mo13961a(appendable, C16002a.m60756b(calendar));
        }

        /* renamed from: a */
        public void mo13961a(Appendable appendable, int i) throws IOException {
            this.f57827a.mo13961a(appendable, i);
        }
    }

    protected FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.f55184a = str;
        this.f55185b = timeZone;
        this.f55186c = locale;
        m64605b();
    }

    /* renamed from: b */
    private void m64605b() {
        List a = m64611a();
        this.f55187d = (C15999f[]) a.toArray(new C15999f[a.size()]);
        int length = this.f55187d.length;
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                i += this.f55187d[length].mo13478a();
            } else {
                this.f55188e = i;
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected java.util.List<org.apache.commons.lang3.time.FastDatePrinter.C15999f> m64611a() {
        /*
        r17 = this;
        r0 = r17;
        r1 = new java.text.DateFormatSymbols;
        r2 = r0.f55186c;
        r1.<init>(r2);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r1.getEras();
        r4 = r1.getMonths();
        r5 = r1.getShortMonths();
        r6 = r1.getWeekdays();
        r7 = r1.getShortWeekdays();
        r1 = r1.getAmPmStrings();
        r8 = r0.f55184a;
        r8 = r8.length();
        r9 = 1;
        r10 = new int[r9];
        r11 = 0;
        r12 = 0;
    L_0x0031:
        if (r12 >= r8) goto L_0x018f;
    L_0x0033:
        r10[r11] = r12;
        r12 = r0.f55184a;
        r12 = r0.m64610a(r12, r10);
        r13 = r10[r11];
        r14 = r12.length();
        if (r14 != 0) goto L_0x0045;
    L_0x0043:
        goto L_0x018f;
    L_0x0045:
        r15 = r12.charAt(r11);
        r9 = 7;
        switch(r15) {
            case 68: goto L_0x017f;
            case 69: goto L_0x0171;
            case 70: goto L_0x0169;
            case 71: goto L_0x0162;
            case 72: goto L_0x015a;
            default: goto L_0x004d;
        };
    L_0x004d:
        switch(r15) {
            case 87: goto L_0x0154;
            case 88: goto L_0x014f;
            case 89: goto L_0x0120;
            case 90: goto L_0x0122;
            default: goto L_0x0050;
        };
    L_0x0050:
        switch(r15) {
            case 121: goto L_0x0120;
            case 122: goto L_0x0106;
            default: goto L_0x0053;
        };
    L_0x0053:
        r11 = 3;
        switch(r15) {
            case 39: goto L_0x00e9;
            case 75: goto L_0x00e1;
            case 77: goto L_0x00c2;
            case 83: goto L_0x00ba;
            case 97: goto L_0x00b1;
            case 100: goto L_0x00aa;
            case 104: goto L_0x009d;
            case 107: goto L_0x0090;
            case 109: goto L_0x0088;
            case 115: goto L_0x0080;
            case 117: goto L_0x0074;
            case 119: goto L_0x006e;
            default: goto L_0x0057;
        };
    L_0x0057:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Illegal pattern component: ";
        r2.append(r3);
        r2.append(r12);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x006e:
        r9 = r0.m64612a(r11, r14);
        goto L_0x0160;
    L_0x0074:
        r11 = new org.apache.commons.lang3.time.FastDatePrinter$b;
        r9 = r0.m64612a(r9, r14);
        r11.<init>(r9);
    L_0x007d:
        r9 = r11;
        goto L_0x0160;
    L_0x0080:
        r9 = 13;
        r9 = r0.m64612a(r9, r14);
        goto L_0x0160;
    L_0x0088:
        r9 = 12;
        r9 = r0.m64612a(r9, r14);
        goto L_0x0160;
    L_0x0090:
        r9 = new org.apache.commons.lang3.time.FastDatePrinter$m;
        r11 = 11;
        r11 = r0.m64612a(r11, r14);
        r9.<init>(r11);
        goto L_0x0160;
    L_0x009d:
        r9 = new org.apache.commons.lang3.time.FastDatePrinter$l;
        r11 = 10;
        r11 = r0.m64612a(r11, r14);
        r9.<init>(r11);
        goto L_0x0160;
    L_0x00aa:
        r9 = 5;
        r9 = r0.m64612a(r9, r14);
        goto L_0x0160;
    L_0x00b1:
        r9 = new org.apache.commons.lang3.time.FastDatePrinter$h;
        r11 = 9;
        r9.<init>(r11, r1);
        goto L_0x0160;
    L_0x00ba:
        r9 = 14;
        r9 = r0.m64612a(r9, r14);
        goto L_0x0160;
    L_0x00c2:
        r9 = 4;
        if (r14 < r9) goto L_0x00cd;
    L_0x00c5:
        r9 = new org.apache.commons.lang3.time.FastDatePrinter$h;
        r12 = 2;
        r9.<init>(r12, r4);
        goto L_0x0160;
    L_0x00cd:
        r12 = 2;
        if (r14 != r11) goto L_0x00d7;
    L_0x00d0:
        r9 = new org.apache.commons.lang3.time.FastDatePrinter$h;
        r9.<init>(r12, r5);
        goto L_0x0160;
    L_0x00d7:
        if (r14 != r12) goto L_0x00dd;
    L_0x00d9:
        r9 = org.apache.commons.lang3.time.FastDatePrinter.C18566n.f57822a;
        goto L_0x0160;
    L_0x00dd:
        r9 = org.apache.commons.lang3.time.FastDatePrinter.C18569q.f57825a;
        goto L_0x0160;
    L_0x00e1:
        r9 = 10;
        r9 = r0.m64612a(r9, r14);
        goto L_0x0160;
    L_0x00e9:
        r9 = 1;
        r11 = r12.substring(r9);
        r12 = r11.length();
        if (r12 != r9) goto L_0x0100;
    L_0x00f4:
        r9 = new org.apache.commons.lang3.time.FastDatePrinter$a;
        r12 = 0;
        r11 = r11.charAt(r12);
        r9.<init>(r11);
        goto L_0x0160;
    L_0x0100:
        r9 = new org.apache.commons.lang3.time.FastDatePrinter$g;
        r9.<init>(r11);
        goto L_0x0160;
    L_0x0106:
        r9 = 4;
        if (r14 < r9) goto L_0x0114;
    L_0x0109:
        r9 = new org.apache.commons.lang3.time.FastDatePrinter$j;
        r11 = r0.f55185b;
        r12 = r0.f55186c;
        r14 = 1;
        r9.<init>(r11, r12, r14);
        goto L_0x0160;
    L_0x0114:
        r14 = 1;
        r9 = new org.apache.commons.lang3.time.FastDatePrinter$j;
        r11 = r0.f55185b;
        r12 = r0.f55186c;
        r15 = 0;
        r9.<init>(r11, r12, r15);
        goto L_0x0160;
    L_0x0120:
        r9 = 2;
        goto L_0x0131;
    L_0x0122:
        r9 = 1;
        if (r14 != r9) goto L_0x0128;
    L_0x0125:
        r9 = org.apache.commons.lang3.time.FastDatePrinter.C17730k.f55181b;
        goto L_0x0160;
    L_0x0128:
        r9 = 2;
        if (r14 != r9) goto L_0x012e;
    L_0x012b:
        r9 = org.apache.commons.lang3.time.FastDatePrinter.C17725c.f55171c;
        goto L_0x0160;
    L_0x012e:
        r9 = org.apache.commons.lang3.time.FastDatePrinter.C17730k.f55180a;
        goto L_0x0160;
    L_0x0131:
        if (r14 != r9) goto L_0x0136;
    L_0x0133:
        r9 = org.apache.commons.lang3.time.FastDatePrinter.C18568p.f57824a;
        goto L_0x0142;
    L_0x0136:
        r9 = 4;
        if (r14 >= r9) goto L_0x013c;
    L_0x0139:
        r9 = 1;
        r14 = 4;
        goto L_0x013d;
    L_0x013c:
        r9 = 1;
    L_0x013d:
        r11 = r0.m64612a(r9, r14);
        r9 = r11;
    L_0x0142:
        r11 = 89;
        if (r15 != r11) goto L_0x0160;
    L_0x0146:
        r11 = new org.apache.commons.lang3.time.FastDatePrinter$s;
        r9 = (org.apache.commons.lang3.time.FastDatePrinter.C17726d) r9;
        r11.<init>(r9);
        goto L_0x007d;
    L_0x014f:
        r9 = org.apache.commons.lang3.time.FastDatePrinter.C17725c.m64588a(r14);
        goto L_0x0160;
    L_0x0154:
        r11 = 4;
        r9 = r0.m64612a(r11, r14);
        goto L_0x0160;
    L_0x015a:
        r9 = 11;
        r9 = r0.m64612a(r9, r14);
    L_0x0160:
        r12 = 0;
        goto L_0x0185;
    L_0x0162:
        r9 = new org.apache.commons.lang3.time.FastDatePrinter$h;
        r12 = 0;
        r9.<init>(r12, r3);
        goto L_0x0185;
    L_0x0169:
        r12 = 0;
        r9 = 8;
        r9 = r0.m64612a(r9, r14);
        goto L_0x0185;
    L_0x0171:
        r11 = 4;
        r12 = 0;
        r15 = new org.apache.commons.lang3.time.FastDatePrinter$h;
        if (r14 >= r11) goto L_0x0179;
    L_0x0177:
        r11 = r7;
        goto L_0x017a;
    L_0x0179:
        r11 = r6;
    L_0x017a:
        r15.<init>(r9, r11);
        r9 = r15;
        goto L_0x0185;
    L_0x017f:
        r12 = 0;
        r9 = 6;
        r9 = r0.m64612a(r9, r14);
    L_0x0185:
        r2.add(r9);
        r9 = 1;
        r11 = r13 + 1;
        r12 = r11;
        r11 = 0;
        goto L_0x0031;
    L_0x018f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.FastDatePrinter.a():java.util.List<org.apache.commons.lang3.time.FastDatePrinter$f>");
    }

    /* renamed from: a */
    protected String m64610a(String str, int[] iArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            stringBuilder.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                stringBuilder.append(charAt);
                i = i2;
            }
        } else {
            stringBuilder.append('\'');
            int i3 = 0;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != '\'') {
                    if (i3 == 0 && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    stringBuilder.append(charAt2);
                } else {
                    int i4 = i + 1;
                    if (i4 >= length || str.charAt(i4) != '\'') {
                        i3 ^= 1;
                    } else {
                        stringBuilder.append(charAt2);
                        i = i4;
                    }
                }
                i++;
            }
        }
        iArr[0] = i;
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected C17726d m64612a(int i, int i2) {
        switch (i2) {
            case 1:
                return new C18570r(i);
            case 2:
                return new C18567o(i);
            default:
                return new C18563e(i, i2);
        }
    }

    @Deprecated
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if ((obj instanceof Date) != null) {
            return format((Date) obj, stringBuffer);
        }
        if ((obj instanceof Calendar) != null) {
            return format((Calendar) obj, stringBuffer);
        }
        if ((obj instanceof Long) != null) {
            return format(((Long) obj).longValue(), stringBuffer);
        }
        fieldPosition = new StringBuilder();
        fieldPosition.append("Unknown class: ");
        if (obj == null) {
            obj = "<null>";
        } else {
            obj = obj.getClass().getName();
        }
        fieldPosition.append(obj);
        throw new IllegalArgumentException(fieldPosition.toString());
    }

    /* renamed from: a */
    String m64609a(Object obj) {
        if (obj instanceof Date) {
            return format((Date) obj);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown class: ");
        if (obj == null) {
            obj = "<null>";
        } else {
            obj = obj.getClass().getName();
        }
        stringBuilder.append(obj);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String format(long j) {
        Calendar c = m64608c();
        c.setTimeInMillis(j);
        return m64601a(c);
    }

    /* renamed from: a */
    private String m64601a(Calendar calendar) {
        return ((StringBuilder) m64600a(calendar, new StringBuilder(this.f55188e))).toString();
    }

    /* renamed from: c */
    private Calendar m64608c() {
        return Calendar.getInstance(this.f55185b, this.f55186c);
    }

    public String format(Date date) {
        Calendar c = m64608c();
        c.setTime(date);
        return m64601a(c);
    }

    public String format(Calendar calendar) {
        return ((StringBuilder) format(calendar, new StringBuilder(this.f55188e))).toString();
    }

    public StringBuffer format(long j, StringBuffer stringBuffer) {
        Calendar c = m64608c();
        c.setTimeInMillis(j);
        return (StringBuffer) m64600a(c, (Appendable) stringBuffer);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        Calendar c = m64608c();
        c.setTime(date);
        return (StringBuffer) m64600a(c, (Appendable) stringBuffer);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return format(calendar.getTime(), stringBuffer);
    }

    public <B extends Appendable> B format(long j, B b) {
        Calendar c = m64608c();
        c.setTimeInMillis(j);
        return m64600a(c, (Appendable) b);
    }

    public <B extends Appendable> B format(Date date, B b) {
        Calendar c = m64608c();
        c.setTime(date);
        return m64600a(c, (Appendable) b);
    }

    public <B extends Appendable> B format(Calendar calendar, B b) {
        if (!calendar.getTimeZone().equals(this.f55185b)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.f55185b);
        }
        return m64600a(calendar, (Appendable) b);
    }

    /* renamed from: a */
    private <B extends Appendable> B m64600a(Calendar calendar, B b) {
        try {
            for (C15999f a : this.f55187d) {
                a.mo13479a(b, calendar);
            }
        } catch (Calendar calendar2) {
            C15992a.m60741a(calendar2);
        }
        return b;
    }

    public String getPattern() {
        return this.f55184a;
    }

    public TimeZone getTimeZone() {
        return this.f55185b;
    }

    public Locale getLocale() {
        return this.f55186c;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        if (this.f55184a.equals(fastDatePrinter.f55184a) && this.f55185b.equals(fastDatePrinter.f55185b) && this.f55186c.equals(fastDatePrinter.f55186c) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.f55184a.hashCode() + ((this.f55185b.hashCode() + (this.f55186c.hashCode() * 13)) * 13);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastDatePrinter[");
        stringBuilder.append(this.f55184a);
        stringBuilder.append(",");
        stringBuilder.append(this.f55186c);
        stringBuilder.append(",");
        stringBuilder.append(this.f55185b.getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        m64605b();
    }

    /* renamed from: b */
    private static void m64606b(Appendable appendable, int i) throws IOException {
        appendable.append((char) ((i / 10) + 48));
        appendable.append((char) ((i % 10) + 48));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private static void m64607b(java.lang.Appendable r5, int r6, int r7) throws java.io.IOException {
        /*
        r0 = 10;
        r1 = 48;
        r2 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        if (r6 >= r2) goto L_0x0050;
    L_0x0008:
        r2 = 4;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = 100;
        if (r6 >= r3) goto L_0x0016;
    L_0x000f:
        r2 = 3;
        if (r6 >= r4) goto L_0x0016;
    L_0x0012:
        r2 = 2;
        if (r6 >= r0) goto L_0x0016;
    L_0x0015:
        r2 = 1;
    L_0x0016:
        r7 = r7 - r2;
    L_0x0017:
        if (r7 <= 0) goto L_0x001f;
    L_0x0019:
        r5.append(r1);
        r7 = r7 + -1;
        goto L_0x0017;
    L_0x001f:
        switch(r2) {
            case 1: goto L_0x004a;
            case 2: goto L_0x003b;
            case 3: goto L_0x002c;
            case 4: goto L_0x0023;
            default: goto L_0x0022;
        };
    L_0x0022:
        goto L_0x0073;
    L_0x0023:
        r7 = r6 / 1000;
        r7 = r7 + r1;
        r7 = (char) r7;
        r5.append(r7);
        r6 = r6 % 1000;
    L_0x002c:
        if (r6 < r4) goto L_0x0038;
    L_0x002e:
        r7 = r6 / 100;
        r7 = r7 + r1;
        r7 = (char) r7;
        r5.append(r7);
        r6 = r6 % 100;
        goto L_0x003b;
    L_0x0038:
        r5.append(r1);
    L_0x003b:
        if (r6 < r0) goto L_0x0047;
    L_0x003d:
        r7 = r6 / 10;
        r7 = r7 + r1;
        r7 = (char) r7;
        r5.append(r7);
        r6 = r6 % 10;
        goto L_0x004a;
    L_0x0047:
        r5.append(r1);
    L_0x004a:
        r6 = r6 + r1;
        r6 = (char) r6;
        r5.append(r6);
        goto L_0x0073;
    L_0x0050:
        r0 = new char[r0];
        r2 = 0;
    L_0x0053:
        if (r6 == 0) goto L_0x0061;
    L_0x0055:
        r3 = r2 + 1;
        r4 = r6 % 10;
        r4 = r4 + r1;
        r4 = (char) r4;
        r0[r2] = r4;
        r6 = r6 / 10;
        r2 = r3;
        goto L_0x0053;
    L_0x0061:
        if (r2 >= r7) goto L_0x0069;
    L_0x0063:
        r5.append(r1);
        r7 = r7 + -1;
        goto L_0x0061;
    L_0x0069:
        r2 = r2 + -1;
        if (r2 < 0) goto L_0x0073;
    L_0x006d:
        r6 = r0[r2];
        r5.append(r6);
        goto L_0x0069;
    L_0x0073:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.FastDatePrinter.b(java.lang.Appendable, int, int):void");
    }

    /* renamed from: a */
    static String m64602a(TimeZone timeZone, boolean z, int i, Locale locale) {
        C16000i c16000i = new C16000i(timeZone, z, i, locale);
        String str = (String) f55183f.get(c16000i);
        if (str != null) {
            return str;
        }
        str = timeZone.getDisplayName(z, i, locale);
        String str2 = (String) f55183f.putIfAbsent(c16000i, str);
        return str2 != null ? str2 : str;
    }
}
