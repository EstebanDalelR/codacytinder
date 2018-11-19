package org.joda.time.format;

import com.facebook.ads.AdError;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.C19304a;
import org.joda.time.C19305b;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableDateTime.Property;
import org.joda.time.ReadablePartial;
import org.joda.time.field.C19800f;
import org.joda.time.field.MillisDurationField;

public class DateTimeFormatterBuilder {
    /* renamed from: a */
    private ArrayList<Object> f60181a = new ArrayList();
    /* renamed from: b */
    private Object f60182b;

    enum TimeZoneId implements C19324i, C19325k {
        INSTANCE;
        
        private static final List<String> ALL_IDS = null;
        private static final List<String> BASE_GROUPED_IDS = null;
        private static final Map<String, List<String>> GROUPED_IDS = null;
        static final int MAX_LENGTH = 0;
        static final int MAX_PREFIX_LENGTH = 0;

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        static {
            BASE_GROUPED_IDS = new ArrayList();
            ALL_IDS = new ArrayList(DateTimeZone.b());
            Collections.sort(ALL_IDS);
            GROUPED_IDS = new HashMap();
            int i = 0;
            int i2 = 0;
            for (String str : ALL_IDS) {
                int indexOf = str.indexOf(47);
                if (indexOf >= 0) {
                    if (indexOf < str.length()) {
                        indexOf++;
                    }
                    i2 = Math.max(i2, indexOf);
                    String substring = str.substring(0, indexOf + 1);
                    String substring2 = str.substring(indexOf);
                    if (!GROUPED_IDS.containsKey(substring)) {
                        GROUPED_IDS.put(substring, new ArrayList());
                    }
                    ((List) GROUPED_IDS.get(substring)).add(substring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                i = Math.max(i, str.length());
            }
            MAX_LENGTH = i;
            MAX_PREFIX_LENGTH = i2;
        }

        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        public void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.e() : "");
        }

        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
            int i2;
            String str;
            List list = BASE_GROUPED_IDS;
            int length = charSequence.length();
            int min = Math.min(length, MAX_PREFIX_LENGTH + i);
            String str2 = "";
            for (i2 = i; i2 < min; i2++) {
                String str3;
                if (charSequence.charAt(i2) == '/') {
                    Object stringBuilder;
                    int i3 = i2 + 1;
                    str2 = charSequence.subSequence(i, i3).toString();
                    min = str2.length() + i;
                    if (i2 < length) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(str2);
                        stringBuilder2.append(charSequence.charAt(i3));
                        stringBuilder = stringBuilder2.toString();
                    } else {
                        stringBuilder = str2;
                    }
                    list = (List) GROUPED_IDS.get(stringBuilder);
                    if (list == null) {
                        return i ^ -1;
                    }
                    str = null;
                    for (i2 = 0; i2 < list.size(); i2++) {
                        str3 = (String) list.get(i2);
                        if (DateTimeFormatterBuilder.m69099a(charSequence, min, str3) && (str == null || str3.length() > str.length())) {
                            str = str3;
                        }
                    }
                    if (str != null) {
                        return i ^ -1;
                    }
                    charSequence = new StringBuilder();
                    charSequence.append(str2);
                    charSequence.append(str);
                    c19319c.m69203a(DateTimeZone.a(charSequence.toString()));
                    return min + str.length();
                }
            }
            min = i;
            str = null;
            for (i2 = 0; i2 < list.size(); i2++) {
                str3 = (String) list.get(i2);
                str = str3;
            }
            if (str != null) {
                return i ^ -1;
            }
            charSequence = new StringBuilder();
            charSequence.append(str2);
            charSequence.append(str);
            c19319c.m69203a(DateTimeZone.a(charSequence.toString()));
            return min + str.length();
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$a */
    static class C19483a implements C19324i, C19325k {
        /* renamed from: a */
        private final char f60830a;

        public int estimateParsedLength() {
            return 1;
        }

        public int estimatePrintedLength() {
            return 1;
        }

        C19483a(char c) {
            this.f60830a = c;
        }

        public void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.f60830a);
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.f60830a);
        }

        public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
            if (i >= charSequence.length()) {
                return i ^ -1;
            }
            c19319c = charSequence.charAt(i);
            C19319c c19319c2 = this.f60830a;
            if (c19319c != c19319c2) {
                c19319c = Character.toUpperCase(c19319c);
                c19319c2 = Character.toUpperCase(c19319c2);
                if (!(c19319c == c19319c2 || Character.toLowerCase(c19319c) == Character.toLowerCase(c19319c2))) {
                    return i ^ -1;
                }
            }
            return i + 1;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$b */
    static class C19484b implements C19324i, C19325k {
        /* renamed from: a */
        private final C19325k[] f60831a;
        /* renamed from: b */
        private final C19324i[] f60832b;
        /* renamed from: c */
        private final int f60833c;
        /* renamed from: d */
        private final int f60834d;

        C19484b(List<Object> list) {
            int i;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            m70305a(list, arrayList, arrayList2);
            int i2 = 0;
            if (!arrayList.contains(null)) {
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    this.f60831a = new C19325k[size];
                    int i3 = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        C19325k c19325k = (C19325k) arrayList.get(i4);
                        i3 += c19325k.estimatePrintedLength();
                        this.f60831a[i4] = c19325k;
                    }
                    this.f60833c = i3;
                    if (!arrayList2.contains(null)) {
                        if (arrayList2.isEmpty()) {
                            list = arrayList2.size();
                            this.f60832b = new C19324i[list];
                            i = 0;
                            while (i2 < list) {
                                C19324i c19324i = (C19324i) arrayList2.get(i2);
                                i += c19324i.estimateParsedLength();
                                this.f60832b[i2] = c19324i;
                                i2++;
                            }
                            this.f60834d = i;
                            return;
                        }
                    }
                    this.f60832b = null;
                    this.f60834d = 0;
                }
            }
            this.f60831a = null;
            this.f60833c = 0;
            if (arrayList2.contains(null)) {
                if (arrayList2.isEmpty()) {
                    list = arrayList2.size();
                    this.f60832b = new C19324i[list];
                    i = 0;
                    while (i2 < list) {
                        C19324i c19324i2 = (C19324i) arrayList2.get(i2);
                        i += c19324i2.estimateParsedLength();
                        this.f60832b[i2] = c19324i2;
                        i2++;
                    }
                    this.f60834d = i;
                    return;
                }
            }
            this.f60832b = null;
            this.f60834d = 0;
        }

        public int estimatePrintedLength() {
            return this.f60833c;
        }

        public void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            C19325k[] c19325kArr = this.f60831a;
            if (c19325kArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (C19325k printTo : c19325kArr) {
                printTo.printTo(appendable, j, c19304a, i, dateTimeZone, locale2);
            }
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            C19325k[] c19325kArr = this.f60831a;
            if (c19325kArr == null) {
                throw new UnsupportedOperationException();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (C19325k printTo : c19325kArr) {
                printTo.printTo(appendable, readablePartial, locale);
            }
        }

        public int estimateParsedLength() {
            return this.f60834d;
        }

        public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
            C19324i[] c19324iArr = this.f60832b;
            if (c19324iArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = c19324iArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = c19324iArr[i2].parseInto(c19319c, charSequence, i);
            }
            return i;
        }

        /* renamed from: a */
        boolean m70307a() {
            return this.f60831a != null;
        }

        /* renamed from: b */
        boolean m70308b() {
            return this.f60832b != null;
        }

        /* renamed from: a */
        private void m70305a(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof C19484b) {
                    m70306a(list2, ((C19484b) obj).f60831a);
                } else {
                    list2.add(obj);
                }
                obj = list.get(i + 1);
                if (obj instanceof C19484b) {
                    m70306a(list3, ((C19484b) obj).f60832b);
                } else {
                    list3.add(obj);
                }
            }
        }

        /* renamed from: a */
        private void m70306a(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$d */
    static class C19485d implements C19324i, C19325k {
        /* renamed from: a */
        protected int f60835a;
        /* renamed from: b */
        protected int f60836b;
        /* renamed from: c */
        private final DateTimeFieldType f60837c;

        protected C19485d(DateTimeFieldType dateTimeFieldType, int i, int i2) {
            this.f60837c = dateTimeFieldType;
            dateTimeFieldType = 18;
            if (i2 <= 18) {
                dateTimeFieldType = i2;
            }
            this.f60835a = i;
            this.f60836b = dateTimeFieldType;
        }

        public int estimatePrintedLength() {
            return this.f60836b;
        }

        public void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            m70310a(appendable, j, c19304a);
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            m70310a(appendable, readablePartial.getChronology().mo14496b(readablePartial, 0), readablePartial.getChronology());
        }

        /* renamed from: a */
        protected void m70310a(java.lang.Appendable r9, long r10, org.joda.time.C19304a r12) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r8 = this;
            r0 = r8.f60837c;
            r12 = r0.mo14453a(r12);
            r0 = r8.f60835a;
            r10 = r12.mo14557i(r10);	 Catch:{ RuntimeException -> 0x0074 }
            r1 = 0;
            r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1));
            r1 = 48;
            if (r3 != 0) goto L_0x001d;
        L_0x0014:
            r0 = r0 + -1;
            if (r0 < 0) goto L_0x001c;
        L_0x0018:
            r9.append(r1);
            goto L_0x0014;
        L_0x001c:
            return;
        L_0x001d:
            r10 = r8.m70309a(r10, r12);
            r11 = 0;
            r2 = r10[r11];
            r12 = 1;
            r4 = r10[r12];
            r10 = (int) r4;
            r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
            r6 = r2 & r4;
            r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
            if (r4 != 0) goto L_0x0037;
        L_0x0031:
            r2 = (int) r2;
            r2 = java.lang.Integer.toString(r2);
            goto L_0x003b;
        L_0x0037:
            r2 = java.lang.Long.toString(r2);
        L_0x003b:
            r3 = r2.length();
        L_0x003f:
            if (r3 >= r10) goto L_0x0049;
        L_0x0041:
            r9.append(r1);
            r0 = r0 + -1;
            r10 = r10 + -1;
            goto L_0x003f;
        L_0x0049:
            if (r0 >= r10) goto L_0x0070;
        L_0x004b:
            if (r0 >= r10) goto L_0x005d;
        L_0x004d:
            if (r3 <= r12) goto L_0x005d;
        L_0x004f:
            r4 = r3 + -1;
            r4 = r2.charAt(r4);
            if (r4 == r1) goto L_0x0058;
        L_0x0057:
            goto L_0x005d;
        L_0x0058:
            r10 = r10 + -1;
            r3 = r3 + -1;
            goto L_0x004b;
        L_0x005d:
            r10 = r2.length();
            if (r3 >= r10) goto L_0x0070;
        L_0x0063:
            if (r11 >= r3) goto L_0x006f;
        L_0x0065:
            r10 = r2.charAt(r11);
            r9.append(r10);
            r11 = r11 + 1;
            goto L_0x0063;
        L_0x006f:
            return;
        L_0x0070:
            r9.append(r2);
            return;
        L_0x0074:
            org.joda.time.format.DateTimeFormatterBuilder.m69097a(r9, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.d.a(java.lang.Appendable, long, org.joda.time.a):void");
        }

        /* renamed from: a */
        private long[] m70309a(long j, C19305b c19305b) {
            long d = c19305b.mo14548d().mo14561d();
            c19305b = this.f60836b;
            while (true) {
                long j2;
                switch (c19305b) {
                    case 1:
                        j2 = 10;
                        break;
                    case 2:
                        j2 = 100;
                        break;
                    case 3:
                        j2 = 1000;
                        break;
                    case 4:
                        j2 = 10000;
                        break;
                    case 5:
                        j2 = 100000;
                        break;
                    case 6:
                        j2 = 1000000;
                        break;
                    case 7:
                        j2 = 10000000;
                        break;
                    case 8:
                        j2 = 100000000;
                        break;
                    case 9:
                        j2 = 1000000000;
                        break;
                    case 10:
                        j2 = 10000000000L;
                        break;
                    case 11:
                        j2 = 100000000000L;
                        break;
                    case 12:
                        j2 = 1000000000000L;
                        break;
                    case 13:
                        j2 = 10000000000000L;
                        break;
                    case 14:
                        j2 = 100000000000000L;
                        break;
                    case 15:
                        j2 = 1000000000000000L;
                        break;
                    case 16:
                        j2 = 10000000000000000L;
                        break;
                    case 17:
                        j2 = 100000000000000000L;
                        break;
                    case 18:
                        j2 = 1000000000000000000L;
                        break;
                    default:
                        j2 = 1;
                        break;
                }
                if ((d * j2) / j2 == d) {
                    return new long[]{(j * j2) / d, (long) c19305b};
                }
                c19305b--;
            }
        }

        public int estimateParsedLength() {
            return this.f60836b;
        }

        public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
            C19305b a = this.f60837c.mo14453a(c19319c.m69199a());
            int min = Math.min(this.f60836b, charSequence.length() - i);
            long d = a.mo14548d().mo14561d() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < min) {
                char charAt = charSequence.charAt(i + i2);
                if (charAt < '0') {
                    break;
                } else if (charAt > '9') {
                    break;
                } else {
                    i2++;
                    d /= 10;
                    j += ((long) (charAt - 48)) * d;
                }
            }
            j /= 10;
            if (i2 == 0) {
                return i ^ -1;
            }
            if (j > 2147483647L) {
                return i ^ -1;
            }
            c19319c.m69204a(new C19800f(DateTimeFieldType.m68875a(), MillisDurationField.f60823a, a.mo14548d()), (int) j);
            return i + i2;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$e */
    static class C19486e implements C19324i {
        /* renamed from: a */
        private final C19324i[] f60838a;
        /* renamed from: b */
        private final int f60839b;

        C19486e(C19324i[] c19324iArr) {
            this.f60838a = c19324iArr;
            int length = c19324iArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    C19324i c19324i = c19324iArr[length];
                    if (c19324i != null) {
                        int estimateParsedLength = c19324i.estimateParsedLength();
                        if (estimateParsedLength > i) {
                            i = estimateParsedLength;
                        }
                    }
                } else {
                    this.f60839b = i;
                    return;
                }
            }
        }

        public int estimateParsedLength() {
            return this.f60839b;
        }

        public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
            C19324i[] c19324iArr = this.f60838a;
            int length = c19324iArr.length;
            Object f = c19319c.m69210f();
            Object obj = null;
            int i2 = i;
            int i3 = i2;
            Object obj2 = null;
            int i4 = 0;
            while (i4 < length) {
                C19324i c19324i = c19324iArr[i4];
                if (c19324i != null) {
                    int parseInto = c19324i.parseInto(c19319c, charSequence, i);
                    if (parseInto >= i) {
                        if (parseInto <= i2) {
                            continue;
                        } else {
                            if (parseInto < charSequence.length()) {
                                i2 = i4 + 1;
                                if (i2 < length) {
                                    if (c19324iArr[i2] != null) {
                                        obj2 = c19319c.m69210f();
                                        i2 = parseInto;
                                    }
                                }
                            }
                            return parseInto;
                        }
                    } else if (parseInto < 0) {
                        parseInto ^= -1;
                        if (parseInto > i3) {
                            i3 = parseInto;
                        }
                    }
                    c19319c.m69205a(f);
                    i4++;
                } else if (i2 <= i) {
                    return i;
                } else {
                    obj = 1;
                    if (i2 <= i) {
                        if (i2 == i || r3 == null) {
                            return i3 ^ -1;
                        }
                    }
                    if (obj2 != null) {
                        c19319c.m69205a(obj2);
                    }
                    return i2;
                }
            }
            if (i2 <= i) {
                if (i2 == i) {
                }
                return i3 ^ -1;
            }
            if (obj2 != null) {
                c19319c.m69205a(obj2);
            }
            return i2;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$f */
    static abstract class C19487f implements C19324i, C19325k {
        /* renamed from: a */
        protected final DateTimeFieldType f60840a;
        /* renamed from: b */
        protected final int f60841b;
        /* renamed from: c */
        protected final boolean f60842c;

        C19487f(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.f60840a = dateTimeFieldType;
            this.f60841b = i;
            this.f60842c = z;
        }

        public int estimateParsedLength() {
            return this.f60841b;
        }

        public int parseInto(org.joda.time.format.C19319c r17, java.lang.CharSequence r18, int r19) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r16 = this;
            r0 = r16;
            r1 = r18;
            r2 = r19;
            r3 = r0.f60841b;
            r4 = r18.length();
            r4 = r4 - r2;
            r3 = java.lang.Math.min(r3, r4);
            r4 = 0;
            r5 = r3;
            r3 = 0;
            r6 = 0;
            r7 = 0;
        L_0x0016:
            r8 = 48;
            if (r3 >= r5) goto L_0x0061;
        L_0x001a:
            r9 = r2 + r3;
            r10 = r1.charAt(r9);
            r11 = 57;
            if (r3 != 0) goto L_0x0059;
        L_0x0024:
            r12 = 43;
            r13 = 45;
            if (r10 == r13) goto L_0x002c;
        L_0x002a:
            if (r10 != r12) goto L_0x0059;
        L_0x002c:
            r14 = r0.f60842c;
            if (r14 == 0) goto L_0x0059;
        L_0x0030:
            r6 = 1;
            if (r10 != r13) goto L_0x0035;
        L_0x0033:
            r7 = 1;
            goto L_0x0036;
        L_0x0035:
            r7 = 0;
        L_0x0036:
            if (r10 != r12) goto L_0x0039;
        L_0x0038:
            goto L_0x003a;
        L_0x0039:
            r6 = 0;
        L_0x003a:
            r10 = r3 + 1;
            if (r10 >= r5) goto L_0x0064;
        L_0x003e:
            r9 = r9 + 1;
            r9 = r1.charAt(r9);
            if (r9 < r8) goto L_0x0064;
        L_0x0046:
            if (r9 <= r11) goto L_0x0049;
        L_0x0048:
            goto L_0x0064;
        L_0x0049:
            r5 = r5 + 1;
            r3 = r18.length();
            r3 = r3 - r2;
            r5 = java.lang.Math.min(r5, r3);
            r3 = r10;
            r15 = r7;
            r7 = r6;
            r6 = r15;
            goto L_0x0016;
        L_0x0059:
            if (r10 < r8) goto L_0x0061;
        L_0x005b:
            if (r10 <= r11) goto L_0x005e;
        L_0x005d:
            goto L_0x0061;
        L_0x005e:
            r3 = r3 + 1;
            goto L_0x0016;
        L_0x0061:
            r15 = r7;
            r7 = r6;
            r6 = r15;
        L_0x0064:
            if (r3 != 0) goto L_0x0069;
        L_0x0066:
            r1 = r2 ^ -1;
            return r1;
        L_0x0069:
            r4 = 9;
            if (r3 < r4) goto L_0x008e;
        L_0x006d:
            if (r6 == 0) goto L_0x007f;
        L_0x006f:
            r4 = r2 + 1;
            r2 = r2 + r3;
            r1 = r1.subSequence(r4, r2);
            r1 = r1.toString();
            r1 = java.lang.Integer.parseInt(r1);
            goto L_0x00b6;
        L_0x007f:
            r3 = r3 + r2;
            r1 = r1.subSequence(r2, r3);
            r1 = r1.toString();
            r1 = java.lang.Integer.parseInt(r1);
            r2 = r3;
            goto L_0x00b6;
        L_0x008e:
            if (r7 != 0) goto L_0x0095;
        L_0x0090:
            if (r6 == 0) goto L_0x0093;
        L_0x0092:
            goto L_0x0095;
        L_0x0093:
            r4 = r2;
            goto L_0x0097;
        L_0x0095:
            r4 = r2 + 1;
        L_0x0097:
            r5 = r4 + 1;
            r4 = r1.charAt(r4);	 Catch:{ StringIndexOutOfBoundsException -> 0x00be }
            r4 = r4 - r8;
            r2 = r2 + r3;
        L_0x009f:
            if (r5 >= r2) goto L_0x00b1;
        L_0x00a1:
            r3 = r4 << 3;
            r4 = r4 << 1;
            r3 = r3 + r4;
            r4 = r5 + 1;
            r5 = r1.charAt(r5);
            r3 = r3 + r5;
            r3 = r3 - r8;
            r5 = r4;
            r4 = r3;
            goto L_0x009f;
        L_0x00b1:
            if (r7 == 0) goto L_0x00b5;
        L_0x00b3:
            r1 = -r4;
            goto L_0x00b6;
        L_0x00b5:
            r1 = r4;
        L_0x00b6:
            r3 = r0.f60840a;
            r4 = r17;
            r4.m69201a(r3, r1);
            return r2;
        L_0x00be:
            r1 = r2 ^ -1;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.f.parseInto(org.joda.time.format.c, java.lang.CharSequence, int):int");
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$h */
    static class C19488h implements C19324i, C19325k {
        /* renamed from: a */
        private final String f60843a;

        C19488h(String str) {
            this.f60843a = str;
        }

        public int estimatePrintedLength() {
            return this.f60843a.length();
        }

        public void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.f60843a);
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.f60843a);
        }

        public int estimateParsedLength() {
            return this.f60843a.length();
        }

        public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
            return DateTimeFormatterBuilder.m69100b(charSequence, i, this.f60843a) != null ? i + this.f60843a.length() : i ^ -1;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$i */
    static class C19489i implements C19324i, C19325k {
        /* renamed from: a */
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> f60844a = new ConcurrentHashMap();
        /* renamed from: b */
        private final DateTimeFieldType f60845b;
        /* renamed from: c */
        private final boolean f60846c;

        C19489i(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.f60845b = dateTimeFieldType;
            this.f60846c = z;
        }

        public int estimatePrintedLength() {
            return this.f60846c ? 6 : 20;
        }

        public void printTo(java.lang.Appendable r1, long r2, org.joda.time.C19304a r4, int r5, org.joda.time.DateTimeZone r6, java.util.Locale r7) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = this;
            r2 = r0.m70311a(r2, r4, r7);	 Catch:{ RuntimeException -> 0x0008 }
            r1.append(r2);	 Catch:{ RuntimeException -> 0x0008 }
            goto L_0x000e;
        L_0x0008:
            r2 = 65533; // 0xfffd float:9.1831E-41 double:3.23776E-319;
            r1.append(r2);
        L_0x000e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.i.printTo(java.lang.Appendable, long, org.joda.time.a, int, org.joda.time.DateTimeZone, java.util.Locale):void");
        }

        public void printTo(java.lang.Appendable r1, org.joda.time.ReadablePartial r2, java.util.Locale r3) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = this;
            r2 = r0.m70312a(r2, r3);	 Catch:{ RuntimeException -> 0x0008 }
            r1.append(r2);	 Catch:{ RuntimeException -> 0x0008 }
            goto L_0x000e;
        L_0x0008:
            r2 = 65533; // 0xfffd float:9.1831E-41 double:3.23776E-319;
            r1.append(r2);
        L_0x000e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.i.printTo(java.lang.Appendable, org.joda.time.ReadablePartial, java.util.Locale):void");
        }

        /* renamed from: a */
        private String m70311a(long j, C19304a c19304a, Locale locale) {
            c19304a = this.f60845b.mo14453a(c19304a);
            if (this.f60846c) {
                return c19304a.mo14541b(j, locale);
            }
            return c19304a.mo14532a(j, locale);
        }

        /* renamed from: a */
        private String m70312a(ReadablePartial readablePartial, Locale locale) {
            if (!readablePartial.isSupported(this.f60845b)) {
                return "�";
            }
            C19305b a = this.f60845b.mo14453a(readablePartial.getChronology());
            if (this.f60846c) {
                return a.mo14542b(readablePartial, locale);
            }
            return a.mo14533a(readablePartial, locale);
        }

        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
            int c;
            Locale b = c19319c.m69206b();
            Map map = (Map) f60844a.get(b);
            if (map == null) {
                map = new ConcurrentHashMap();
                f60844a.put(b, map);
            }
            Object[] objArr = (Object[]) map.get(this.f60845b);
            if (objArr == null) {
                Map concurrentHashMap = new ConcurrentHashMap(32);
                Property a = new MutableDateTime(0, DateTimeZone.f8461a).m71486a(this.f60845b);
                int g = a.m69083g();
                int h = a.m69084h();
                if (h - g > 32) {
                    return i ^ -1;
                }
                c = a.m69078c(b);
                while (g <= h) {
                    a.m70110a(g);
                    concurrentHashMap.put(a.m69077b(b), Boolean.TRUE);
                    concurrentHashMap.put(a.m69077b(b).toLowerCase(b), Boolean.TRUE);
                    concurrentHashMap.put(a.m69077b(b).toUpperCase(b), Boolean.TRUE);
                    concurrentHashMap.put(a.m69074a(b), Boolean.TRUE);
                    concurrentHashMap.put(a.m69074a(b).toLowerCase(b), Boolean.TRUE);
                    concurrentHashMap.put(a.m69074a(b).toUpperCase(b), Boolean.TRUE);
                    g++;
                }
                if ("en".equals(b.getLanguage()) && this.f60845b == DateTimeFieldType.m68897w()) {
                    concurrentHashMap.put("BCE", Boolean.TRUE);
                    concurrentHashMap.put("bce", Boolean.TRUE);
                    concurrentHashMap.put("CE", Boolean.TRUE);
                    concurrentHashMap.put("ce", Boolean.TRUE);
                    c = 3;
                }
                map.put(this.f60845b, new Object[]{concurrentHashMap, Integer.valueOf(c)});
                map = concurrentHashMap;
            } else {
                map = (Map) objArr[0];
                c = ((Integer) objArr[1]).intValue();
            }
            for (int min = Math.min(charSequence.length(), c + i); min > i; min--) {
                String obj = charSequence.subSequence(i, min).toString();
                if (map.containsKey(obj)) {
                    c19319c.m69202a(this.f60845b, obj, b);
                    return min;
                }
            }
            return i ^ -1;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$j */
    static class C19490j implements C19324i, C19325k {
        /* renamed from: a */
        private final Map<String, DateTimeZone> f60847a;
        /* renamed from: b */
        private final int f60848b;

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        C19490j(int i, Map<String, DateTimeZone> map) {
            this.f60848b = i;
            this.f60847a = map;
        }

        public int estimatePrintedLength() {
            return this.f60848b == 1 ? 4 : 20;
        }

        public void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(m70313a(j - ((long) i), dateTimeZone, locale));
        }

        /* renamed from: a */
        private String m70313a(long j, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            switch (this.f60848b) {
                case 0:
                    return dateTimeZone.b(j, locale);
                case 1:
                    return dateTimeZone.a(j, locale);
                default:
                    return "";
            }
        }

        public int estimateParsedLength() {
            return this.f60848b == 1 ? 4 : 20;
        }

        public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
            Map map = this.f60847a;
            if (map == null) {
                map = DateTimeUtils.m68913b();
            }
            String str = null;
            for (String str2 : map.keySet()) {
                if (DateTimeFormatterBuilder.m69099a(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return i ^ -1;
            }
            c19319c.m69203a((DateTimeZone) map.get(str));
            return i + str.length();
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$k */
    static class C19491k implements C19324i, C19325k {
        /* renamed from: a */
        private final String f60849a;
        /* renamed from: b */
        private final String f60850b;
        /* renamed from: c */
        private final boolean f60851c;
        /* renamed from: d */
        private final int f60852d;
        /* renamed from: e */
        private final int f60853e;

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        C19491k(String str, String str2, boolean z, int i, int i2) {
            this.f60849a = str;
            this.f60850b = str2;
            this.f60851c = z;
            if (i > 0) {
                if (i2 >= i) {
                    str = 4;
                    if (i > 4) {
                        i2 = 4;
                    } else {
                        str = i;
                    }
                    this.f60852d = str;
                    this.f60853e = i2;
                    return;
                }
            }
            throw new IllegalArgumentException();
        }

        public int estimatePrintedLength() {
            int i = (this.f60852d + 1) << 1;
            if (this.f60851c) {
                i += this.f60852d - 1;
            }
            return (this.f60849a == null || this.f60849a.length() <= i) ? i : this.f60849a.length();
        }

        public void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            if (dateTimeZone != null) {
                if (i != 0 || this.f60849a == null) {
                    if (i >= 0) {
                        appendable.append(43);
                    } else {
                        appendable.append(45);
                        i = -i;
                    }
                    int i2 = i / 3600000;
                    C19320f.m69217a(appendable, i2, 2);
                    if (this.f60853e != 1) {
                        i -= i2 * 3600000;
                        if (i != 0 || this.f60852d > 1) {
                            i2 = i / ManagerWebServices.TIMEOUT_AUTH_MS;
                            if (this.f60851c != null) {
                                appendable.append(':');
                            }
                            C19320f.m69217a(appendable, i2, 2);
                            if (this.f60853e != 2) {
                                i -= i2 * ManagerWebServices.TIMEOUT_AUTH_MS;
                                if (i != 0 || this.f60852d > 2) {
                                    int i3 = i / AdError.NETWORK_ERROR_CODE;
                                    if (this.f60851c) {
                                        appendable.append(':');
                                    }
                                    C19320f.m69217a(appendable, i3, 2);
                                    if (this.f60853e != 3) {
                                        i -= i3 * AdError.NETWORK_ERROR_CODE;
                                        if (i != 0 || this.f60852d > 3) {
                                            if (this.f60851c != null) {
                                                appendable.append(46);
                                            }
                                            C19320f.m69217a(appendable, i, 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                appendable.append(this.f60849a);
            }
        }

        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int parseInto(org.joda.time.format.C19319c r12, java.lang.CharSequence r13, int r14) {
            /*
            r11 = this;
            r0 = r13.length();
            r0 = r0 - r14;
            r1 = r11.f60850b;
            r2 = 43;
            r3 = 45;
            r4 = 0;
            if (r1 == 0) goto L_0x0040;
        L_0x000e:
            r1 = r11.f60850b;
            r1 = r1.length();
            if (r1 != 0) goto L_0x0029;
        L_0x0016:
            if (r0 <= 0) goto L_0x0021;
        L_0x0018:
            r1 = r13.charAt(r14);
            if (r1 == r3) goto L_0x0040;
        L_0x001e:
            if (r1 != r2) goto L_0x0021;
        L_0x0020:
            goto L_0x0040;
        L_0x0021:
            r13 = java.lang.Integer.valueOf(r4);
            r12.m69200a(r13);
            return r14;
        L_0x0029:
            r1 = r11.f60850b;
            r1 = org.joda.time.format.DateTimeFormatterBuilder.m69100b(r13, r14, r1);
            if (r1 == 0) goto L_0x0040;
        L_0x0031:
            r13 = java.lang.Integer.valueOf(r4);
            r12.m69200a(r13);
            r12 = r11.f60850b;
            r12 = r12.length();
            r14 = r14 + r12;
            return r14;
        L_0x0040:
            r1 = 1;
            if (r0 > r1) goto L_0x0046;
        L_0x0043:
            r12 = r14 ^ -1;
            return r12;
        L_0x0046:
            r5 = r13.charAt(r14);
            if (r5 != r3) goto L_0x004e;
        L_0x004c:
            r2 = 1;
            goto L_0x0051;
        L_0x004e:
            if (r5 != r2) goto L_0x0134;
        L_0x0050:
            r2 = 0;
        L_0x0051:
            r0 = r0 + -1;
            r14 = r14 + r1;
            r3 = 2;
            r5 = r11.m70314a(r13, r14, r3);
            if (r5 >= r3) goto L_0x005e;
        L_0x005b:
            r12 = r14 ^ -1;
            return r12;
        L_0x005e:
            r5 = org.joda.time.format.C19320f.m69212a(r13, r14);
            r6 = 23;
            if (r5 <= r6) goto L_0x0069;
        L_0x0066:
            r12 = r14 ^ -1;
            return r12;
        L_0x0069:
            r6 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
            r5 = r5 * r6;
            r0 = r0 + -2;
            r14 = r14 + r3;
            if (r0 > 0) goto L_0x0075;
        L_0x0073:
            goto L_0x0129;
        L_0x0075:
            r6 = r13.charAt(r14);
            r7 = 58;
            r8 = 48;
            if (r6 != r7) goto L_0x0085;
        L_0x007f:
            r0 = r0 + -1;
            r14 = r14 + 1;
            r4 = 1;
            goto L_0x008b;
        L_0x0085:
            if (r6 < r8) goto L_0x0129;
        L_0x0087:
            r9 = 57;
            if (r6 > r9) goto L_0x0129;
        L_0x008b:
            r6 = r11.m70314a(r13, r14, r3);
            if (r6 != 0) goto L_0x0095;
        L_0x0091:
            if (r4 != 0) goto L_0x0095;
        L_0x0093:
            goto L_0x0129;
        L_0x0095:
            if (r6 >= r3) goto L_0x009a;
        L_0x0097:
            r12 = r14 ^ -1;
            return r12;
        L_0x009a:
            r6 = org.joda.time.format.C19320f.m69212a(r13, r14);
            r9 = 59;
            if (r6 <= r9) goto L_0x00a5;
        L_0x00a2:
            r12 = r14 ^ -1;
            return r12;
        L_0x00a5:
            r10 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
            r6 = r6 * r10;
            r5 = r5 + r6;
            r0 = r0 + -2;
            r14 = r14 + 2;
            if (r0 > 0) goto L_0x00b3;
        L_0x00b1:
            goto L_0x0129;
        L_0x00b3:
            if (r4 == 0) goto L_0x00c1;
        L_0x00b5:
            r6 = r13.charAt(r14);
            if (r6 == r7) goto L_0x00bd;
        L_0x00bb:
            goto L_0x0129;
        L_0x00bd:
            r0 = r0 + -1;
            r14 = r14 + 1;
        L_0x00c1:
            r6 = r11.m70314a(r13, r14, r3);
            if (r6 != 0) goto L_0x00ca;
        L_0x00c7:
            if (r4 != 0) goto L_0x00ca;
        L_0x00c9:
            goto L_0x0129;
        L_0x00ca:
            if (r6 >= r3) goto L_0x00cf;
        L_0x00cc:
            r12 = r14 ^ -1;
            return r12;
        L_0x00cf:
            r6 = org.joda.time.format.C19320f.m69212a(r13, r14);
            if (r6 <= r9) goto L_0x00d8;
        L_0x00d5:
            r12 = r14 ^ -1;
            return r12;
        L_0x00d8:
            r6 = r6 * 1000;
            r5 = r5 + r6;
            r0 = r0 + -2;
            r14 = r14 + 2;
            if (r0 > 0) goto L_0x00e2;
        L_0x00e1:
            goto L_0x0129;
        L_0x00e2:
            if (r4 == 0) goto L_0x00f7;
        L_0x00e4:
            r0 = r13.charAt(r14);
            r6 = 46;
            if (r0 == r6) goto L_0x00f5;
        L_0x00ec:
            r0 = r13.charAt(r14);
            r6 = 44;
            if (r0 == r6) goto L_0x00f5;
        L_0x00f4:
            goto L_0x0129;
        L_0x00f5:
            r14 = r14 + 1;
        L_0x00f7:
            r0 = 3;
            r0 = r11.m70314a(r13, r14, r0);
            if (r0 != 0) goto L_0x0101;
        L_0x00fe:
            if (r4 != 0) goto L_0x0101;
        L_0x0100:
            goto L_0x0129;
        L_0x0101:
            if (r0 >= r1) goto L_0x0106;
        L_0x0103:
            r12 = r14 ^ -1;
            return r12;
        L_0x0106:
            r4 = r14 + 1;
            r14 = r13.charAt(r14);
            r14 = r14 - r8;
            r14 = r14 * 100;
            r5 = r5 + r14;
            if (r0 <= r1) goto L_0x0128;
        L_0x0112:
            r14 = r4 + 1;
            r1 = r13.charAt(r4);
            r1 = r1 - r8;
            r1 = r1 * 10;
            r5 = r5 + r1;
            if (r0 <= r3) goto L_0x0129;
        L_0x011e:
            r0 = r14 + 1;
            r13 = r13.charAt(r14);
            r13 = r13 - r8;
            r5 = r5 + r13;
            r14 = r0;
            goto L_0x0129;
        L_0x0128:
            r14 = r4;
        L_0x0129:
            if (r2 == 0) goto L_0x012c;
        L_0x012b:
            r5 = -r5;
        L_0x012c:
            r13 = java.lang.Integer.valueOf(r5);
            r12.m69200a(r13);
            return r14;
        L_0x0134:
            r12 = r14 ^ -1;
            return r12;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.k.parseInto(org.joda.time.format.c, java.lang.CharSequence, int):int");
        }

        /* renamed from: a */
        private int m70314a(CharSequence charSequence, int i, int i2) {
            i2 = Math.min(charSequence.length() - i, i2);
            int i3 = 0;
            while (i2 > 0) {
                char charAt = charSequence.charAt(i + i3);
                if (charAt < '0') {
                    break;
                } else if (charAt > '9') {
                    break;
                } else {
                    i3++;
                    i2--;
                }
            }
            return i3;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$l */
    static class C19492l implements C19324i, C19325k {
        /* renamed from: a */
        private final DateTimeFieldType f60854a;
        /* renamed from: b */
        private final int f60855b;
        /* renamed from: c */
        private final boolean f60856c;

        public int estimatePrintedLength() {
            return 2;
        }

        C19492l(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.f60854a = dateTimeFieldType;
            this.f60855b = i;
            this.f60856c = z;
        }

        public int estimateParsedLength() {
            return this.f60856c ? 4 : 2;
        }

        public int parseInto(org.joda.time.format.C19319c r13, java.lang.CharSequence r14, int r15) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r12 = this;
            r0 = r14.length();
            r0 = r0 - r15;
            r1 = r12.f60856c;
            r2 = 57;
            r3 = 2;
            r4 = 0;
            r5 = 48;
            r6 = 1;
            if (r1 != 0) goto L_0x0019;
        L_0x0010:
            r0 = java.lang.Math.min(r3, r0);
            if (r0 >= r3) goto L_0x0052;
        L_0x0016:
            r13 = r15 ^ -1;
            return r13;
        L_0x0019:
            r1 = r15;
            r15 = 0;
            r7 = 0;
            r8 = 0;
        L_0x001d:
            if (r15 >= r0) goto L_0x0047;
        L_0x001f:
            r9 = r1 + r15;
            r9 = r14.charAt(r9);
            if (r15 != 0) goto L_0x003f;
        L_0x0027:
            r10 = 45;
            if (r9 == r10) goto L_0x002f;
        L_0x002b:
            r11 = 43;
            if (r9 != r11) goto L_0x003f;
        L_0x002f:
            if (r9 != r10) goto L_0x0033;
        L_0x0031:
            r8 = 1;
            goto L_0x0034;
        L_0x0033:
            r8 = 0;
        L_0x0034:
            if (r8 == 0) goto L_0x003a;
        L_0x0036:
            r15 = r15 + 1;
        L_0x0038:
            r7 = 1;
            goto L_0x001d;
        L_0x003a:
            r1 = r1 + 1;
            r0 = r0 + -1;
            goto L_0x0038;
        L_0x003f:
            if (r9 < r5) goto L_0x0047;
        L_0x0041:
            if (r9 <= r2) goto L_0x0044;
        L_0x0043:
            goto L_0x0047;
        L_0x0044:
            r15 = r15 + 1;
            goto L_0x001d;
        L_0x0047:
            if (r15 != 0) goto L_0x004c;
        L_0x0049:
            r13 = r1 ^ -1;
            return r13;
        L_0x004c:
            if (r7 != 0) goto L_0x009f;
        L_0x004e:
            if (r15 == r3) goto L_0x0051;
        L_0x0050:
            goto L_0x009f;
        L_0x0051:
            r15 = r1;
        L_0x0052:
            r0 = r14.charAt(r15);
            if (r0 < r5) goto L_0x009c;
        L_0x0058:
            if (r0 <= r2) goto L_0x005b;
        L_0x005a:
            goto L_0x009c;
        L_0x005b:
            r0 = r0 - r5;
            r1 = r15 + 1;
            r14 = r14.charAt(r1);
            if (r14 < r5) goto L_0x0099;
        L_0x0064:
            if (r14 <= r2) goto L_0x0067;
        L_0x0066:
            goto L_0x0099;
        L_0x0067:
            r1 = r0 << 3;
            r0 = r0 << r6;
            r1 = r1 + r0;
            r1 = r1 + r14;
            r1 = r1 - r5;
            r14 = r12.f60855b;
            r0 = r13.m69209e();
            if (r0 == 0) goto L_0x007d;
        L_0x0075:
            r14 = r13.m69209e();
            r14 = r14.intValue();
        L_0x007d:
            r14 = r14 + -50;
            r0 = 100;
            if (r14 < 0) goto L_0x0086;
        L_0x0083:
            r2 = r14 % 100;
            goto L_0x008b;
        L_0x0086:
            r2 = r14 + 1;
            r2 = r2 % r0;
            r2 = r2 + 99;
        L_0x008b:
            if (r1 >= r2) goto L_0x008e;
        L_0x008d:
            goto L_0x008f;
        L_0x008e:
            r0 = 0;
        L_0x008f:
            r14 = r14 + r0;
            r14 = r14 - r2;
            r1 = r1 + r14;
            r14 = r12.f60854a;
            r13.m69201a(r14, r1);
            r15 = r15 + r3;
            return r15;
        L_0x0099:
            r13 = r15 ^ -1;
            return r13;
        L_0x009c:
            r13 = r15 ^ -1;
            return r13;
        L_0x009f:
            r0 = 9;
            if (r15 < r0) goto L_0x00b1;
        L_0x00a3:
            r15 = r15 + r1;
            r14 = r14.subSequence(r1, r15);
            r14 = r14.toString();
            r14 = java.lang.Integer.parseInt(r14);
            goto L_0x00d6;
        L_0x00b1:
            if (r8 == 0) goto L_0x00b6;
        L_0x00b3:
            r0 = r1 + 1;
            goto L_0x00b7;
        L_0x00b6:
            r0 = r1;
        L_0x00b7:
            r2 = r0 + 1;
            r0 = r14.charAt(r0);	 Catch:{ StringIndexOutOfBoundsException -> 0x00dc }
            r0 = r0 - r5;
            r15 = r15 + r1;
        L_0x00bf:
            if (r2 >= r15) goto L_0x00d1;
        L_0x00c1:
            r1 = r0 << 3;
            r0 = r0 << 1;
            r1 = r1 + r0;
            r0 = r2 + 1;
            r2 = r14.charAt(r2);
            r1 = r1 + r2;
            r1 = r1 - r5;
            r2 = r0;
            r0 = r1;
            goto L_0x00bf;
        L_0x00d1:
            if (r8 == 0) goto L_0x00d5;
        L_0x00d3:
            r14 = -r0;
            goto L_0x00d6;
        L_0x00d5:
            r14 = r0;
        L_0x00d6:
            r0 = r12.f60854a;
            r13.m69201a(r0, r14);
            return r15;
        L_0x00dc:
            r13 = r1 ^ -1;
            return r13;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.l.parseInto(org.joda.time.format.c, java.lang.CharSequence, int):int");
        }

        public void printTo(Appendable appendable, long j, C19304a c19304a, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int a = m70315a(j, c19304a);
            if (a < 0) {
                appendable.append('�');
                appendable.append('�');
                return;
            }
            C19320f.m69217a(appendable, a, 2);
        }

        /* renamed from: a */
        private int m70315a(long r2, org.joda.time.C19304a r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = r1.f60854a;	 Catch:{ RuntimeException -> 0x0010 }
            r4 = r0.mo14453a(r4);	 Catch:{ RuntimeException -> 0x0010 }
            r2 = r4.mo14524a(r2);	 Catch:{ RuntimeException -> 0x0010 }
            if (r2 >= 0) goto L_0x000d;	 Catch:{ RuntimeException -> 0x0010 }
        L_0x000c:
            r2 = -r2;	 Catch:{ RuntimeException -> 0x0010 }
        L_0x000d:
            r2 = r2 % 100;	 Catch:{ RuntimeException -> 0x0010 }
            return r2;
        L_0x0010:
            r2 = -1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.l.a(long, org.joda.time.a):int");
        }

        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int a = m70316a(readablePartial);
            if (a < 0) {
                appendable.append('�');
                appendable.append('�');
                return;
            }
            C19320f.m69217a(appendable, a, 2);
        }

        /* renamed from: a */
        private int m70316a(org.joda.time.ReadablePartial r2) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = r1.f60854a;
            r0 = r2.isSupported(r0);
            if (r0 == 0) goto L_0x0014;
        L_0x0008:
            r0 = r1.f60854a;	 Catch:{ RuntimeException -> 0x0014 }
            r2 = r2.get(r0);	 Catch:{ RuntimeException -> 0x0014 }
            if (r2 >= 0) goto L_0x0011;	 Catch:{ RuntimeException -> 0x0014 }
        L_0x0010:
            r2 = -r2;	 Catch:{ RuntimeException -> 0x0014 }
        L_0x0011:
            r2 = r2 % 100;	 Catch:{ RuntimeException -> 0x0014 }
            return r2;
        L_0x0014:
            r2 = -1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.l.a(org.joda.time.ReadablePartial):int");
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$g */
    static class C19641g extends C19487f {
        /* renamed from: d */
        protected final int f61423d;

        protected C19641g(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
            super(dateTimeFieldType, i, z);
            this.f61423d = i2;
        }

        public int estimatePrintedLength() {
            return this.b;
        }

        public void printTo(java.lang.Appendable r1, long r2, org.joda.time.C19304a r4, int r5, org.joda.time.DateTimeZone r6, java.util.Locale r7) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = this;
            r5 = r0.a;	 Catch:{ RuntimeException -> 0x0010 }
            r4 = r5.mo14453a(r4);	 Catch:{ RuntimeException -> 0x0010 }
            r2 = r4.mo14524a(r2);	 Catch:{ RuntimeException -> 0x0010 }
            r3 = r0.f61423d;	 Catch:{ RuntimeException -> 0x0010 }
            org.joda.time.format.C19320f.m69217a(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0010 }
            goto L_0x0015;
        L_0x0010:
            r2 = r0.f61423d;
            org.joda.time.format.DateTimeFormatterBuilder.m69097a(r1, r2);
        L_0x0015:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.g.printTo(java.lang.Appendable, long, org.joda.time.a, int, org.joda.time.DateTimeZone, java.util.Locale):void");
        }

        public void printTo(java.lang.Appendable r1, org.joda.time.ReadablePartial r2, java.util.Locale r3) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = this;
            r3 = r0.a;
            r3 = r2.isSupported(r3);
            if (r3 == 0) goto L_0x001a;
        L_0x0008:
            r3 = r0.a;	 Catch:{ RuntimeException -> 0x0014 }
            r2 = r2.get(r3);	 Catch:{ RuntimeException -> 0x0014 }
            r3 = r0.f61423d;	 Catch:{ RuntimeException -> 0x0014 }
            org.joda.time.format.C19320f.m69217a(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0014 }
            goto L_0x001f;
        L_0x0014:
            r2 = r0.f61423d;
            org.joda.time.format.DateTimeFormatterBuilder.m69097a(r1, r2);
            goto L_0x001f;
        L_0x001a:
            r2 = r0.f61423d;
            org.joda.time.format.DateTimeFormatterBuilder.m69097a(r1, r2);
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.g.printTo(java.lang.Appendable, org.joda.time.ReadablePartial, java.util.Locale):void");
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$m */
    static class C19642m extends C19487f {
        protected C19642m(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z);
        }

        public int estimatePrintedLength() {
            return this.b;
        }

        public void printTo(java.lang.Appendable r1, long r2, org.joda.time.C19304a r4, int r5, org.joda.time.DateTimeZone r6, java.util.Locale r7) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = this;
            r5 = r0.a;	 Catch:{ RuntimeException -> 0x000e }
            r4 = r5.mo14453a(r4);	 Catch:{ RuntimeException -> 0x000e }
            r2 = r4.mo14524a(r2);	 Catch:{ RuntimeException -> 0x000e }
            org.joda.time.format.C19320f.m69216a(r1, r2);	 Catch:{ RuntimeException -> 0x000e }
            goto L_0x0014;
        L_0x000e:
            r2 = 65533; // 0xfffd float:9.1831E-41 double:3.23776E-319;
            r1.append(r2);
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.m.printTo(java.lang.Appendable, long, org.joda.time.a, int, org.joda.time.DateTimeZone, java.util.Locale):void");
        }

        public void printTo(java.lang.Appendable r2, org.joda.time.ReadablePartial r3, java.util.Locale r4) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r4 = r1.a;
            r4 = r3.isSupported(r4);
            r0 = 65533; // 0xfffd float:9.1831E-41 double:3.23776E-319;
            if (r4 == 0) goto L_0x0019;
        L_0x000b:
            r4 = r1.a;	 Catch:{ RuntimeException -> 0x0015 }
            r3 = r3.get(r4);	 Catch:{ RuntimeException -> 0x0015 }
            org.joda.time.format.C19320f.m69216a(r2, r3);	 Catch:{ RuntimeException -> 0x0015 }
            goto L_0x001c;
        L_0x0015:
            r2.append(r0);
            goto L_0x001c;
        L_0x0019:
            r2.append(r0);
        L_0x001c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.m.printTo(java.lang.Appendable, org.joda.time.ReadablePartial, java.util.Locale):void");
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$c */
    static class C19803c extends C19641g {
        protected C19803c(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z, i);
        }

        public int parseInto(C19319c c19319c, CharSequence charSequence, int i) {
            c19319c = super.parseInto(c19319c, charSequence, i);
            if (c19319c < null) {
                return c19319c;
            }
            int i2 = this.b + i;
            if (c19319c != i2) {
                if (this.c) {
                    charSequence = charSequence.charAt(i);
                    if (charSequence == 45 || charSequence == 43) {
                        i2++;
                    }
                }
                if (c19319c > i2) {
                    return (i2 + 1) ^ -1;
                }
                if (c19319c < i2) {
                    return c19319c ^ -1;
                }
            }
            return c19319c;
        }
    }

    /* renamed from: a */
    public C19316b m69119a() {
        Object k = m69104k();
        C19324i c19324i = null;
        C19325k c19325k = m69101b(k) ? (C19325k) k : null;
        if (m69103c(k)) {
            c19324i = (C19324i) k;
        }
        if (c19325k == null) {
            if (c19324i == null) {
                throw new UnsupportedOperationException("Both printing and parsing not supported");
            }
        }
        return new C19316b(c19325k, c19324i);
    }

    /* renamed from: b */
    public DateTimeParser m69126b() {
        Object k = m69104k();
        if (m69103c(k)) {
            return C19495j.m70320a((C19324i) k);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69118a(C19316b c19316b) {
        if (c19316b != null) {
            return m69096a(c19316b.m69165a(), c19316b.m69173c());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69116a(DateTimeParser dateTimeParser) {
        m69102c(dateTimeParser);
        return m69096a(null, C19493d.m70317a(dateTimeParser));
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69117a(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        if (dateTimePrinter != null) {
            m69098a(dateTimePrinter);
        }
        if (dateTimeParserArr == null) {
            throw new IllegalArgumentException("No parsers supplied");
        }
        int length = dateTimeParserArr.length;
        int i = 0;
        if (length != 1) {
            C19324i[] c19324iArr = new C19324i[length];
            while (i < length - 1) {
                C19324i a = C19493d.m70317a(dateTimeParserArr[i]);
                c19324iArr[i] = a;
                if (a == null) {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
                i++;
            }
            c19324iArr[i] = C19493d.m70317a(dateTimeParserArr[i]);
            return m69096a(C19494e.m70319a(dateTimePrinter), new C19486e(c19324iArr));
        } else if (dateTimeParserArr[0] != null) {
            return m69096a(C19494e.m70319a(dateTimePrinter), C19493d.m70317a(dateTimeParserArr[0]));
        } else {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    /* renamed from: b */
    public DateTimeFormatterBuilder m69125b(DateTimeParser dateTimeParser) {
        m69102c(dateTimeParser);
        return m69096a(null, new C19486e(new C19324i[]{C19493d.m70317a(dateTimeParser), null}));
    }

    /* renamed from: c */
    private void m69102c(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    /* renamed from: a */
    private void m69098a(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    /* renamed from: a */
    private DateTimeFormatterBuilder m69095a(Object obj) {
        this.f60182b = null;
        this.f60181a.add(obj);
        this.f60181a.add(obj);
        return this;
    }

    /* renamed from: a */
    private DateTimeFormatterBuilder m69096a(C19325k c19325k, C19324i c19324i) {
        this.f60182b = null;
        this.f60181a.add(c19325k);
        this.f60181a.add(c19324i);
        return this;
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69105a(char c) {
        return m69095a(new C19483a(c));
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69109a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        switch (str.length()) {
            case 0:
                return this;
            case 1:
                return m69095a(new C19483a(str.charAt(0)));
            default:
                return m69095a(new C19488h(str));
        }
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69115a(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i >= 0) {
            if (i2 > 0) {
                if (i <= 1) {
                    return m69095a(new C19642m(dateTimeFieldType, i2, false));
                }
                return m69095a(new C19641g(dateTimeFieldType, i2, false, i));
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69114a(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        } else if (i > 0) {
            return m69095a(new C19803c(dateTimeFieldType, i, false));
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal number of digits: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    public DateTimeFormatterBuilder m69124b(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i >= 0) {
            if (i2 > 0) {
                if (i <= 1) {
                    return m69095a(new C19642m(dateTimeFieldType, i2, true));
                }
                return m69095a(new C19641g(dateTimeFieldType, i2, true, i));
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69113a(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return m69095a(new C19489i(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: b */
    public DateTimeFormatterBuilder m69123b(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return m69095a(new C19489i(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: c */
    public DateTimeFormatterBuilder m69130c(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i2 < i) {
            i2 = i;
        }
        if (i >= 0) {
            if (i2 > 0) {
                return m69095a(new C19485d(dateTimeFieldType, i, i2));
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69107a(int i, int i2) {
        return m69130c(DateTimeFieldType.m68878d(), i, i2);
    }

    /* renamed from: b */
    public DateTimeFormatterBuilder m69121b(int i, int i2) {
        return m69130c(DateTimeFieldType.m68880f(), i, i2);
    }

    /* renamed from: c */
    public DateTimeFormatterBuilder m69129c(int i, int i2) {
        return m69130c(DateTimeFieldType.m68881g(), i, i2);
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69106a(int i) {
        return m69115a(DateTimeFieldType.m68877c(), i, 2);
    }

    /* renamed from: b */
    public DateTimeFormatterBuilder m69120b(int i) {
        return m69115a(DateTimeFieldType.m68879e(), i, 2);
    }

    /* renamed from: c */
    public DateTimeFormatterBuilder m69128c(int i) {
        return m69115a(DateTimeFieldType.m68881g(), i, 2);
    }

    /* renamed from: d */
    public DateTimeFormatterBuilder m69132d(int i) {
        return m69115a(DateTimeFieldType.m68882h(), i, 2);
    }

    /* renamed from: e */
    public DateTimeFormatterBuilder m69135e(int i) {
        return m69115a(DateTimeFieldType.m68883i(), i, 2);
    }

    /* renamed from: f */
    public DateTimeFormatterBuilder m69138f(int i) {
        return m69115a(DateTimeFieldType.m68884j(), i, 2);
    }

    /* renamed from: g */
    public DateTimeFormatterBuilder m69141g(int i) {
        return m69115a(DateTimeFieldType.m68886l(), i, 1);
    }

    /* renamed from: h */
    public DateTimeFormatterBuilder m69144h(int i) {
        return m69115a(DateTimeFieldType.m68887m(), i, 2);
    }

    /* renamed from: i */
    public DateTimeFormatterBuilder m69146i(int i) {
        return m69115a(DateTimeFieldType.m68888n(), i, 3);
    }

    /* renamed from: j */
    public DateTimeFormatterBuilder m69148j(int i) {
        return m69115a(DateTimeFieldType.m68889o(), i, 2);
    }

    /* renamed from: d */
    public DateTimeFormatterBuilder m69133d(int i, int i2) {
        return m69124b(DateTimeFieldType.m68890p(), i, i2);
    }

    /* renamed from: k */
    public DateTimeFormatterBuilder m69149k(int i) {
        return m69115a(DateTimeFieldType.m68892r(), i, 2);
    }

    /* renamed from: e */
    public DateTimeFormatterBuilder m69136e(int i, int i2) {
        return m69124b(DateTimeFieldType.m68893s(), i, i2);
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69108a(int i, boolean z) {
        return m69095a(new C19492l(DateTimeFieldType.m68893s(), i, z));
    }

    /* renamed from: b */
    public DateTimeFormatterBuilder m69122b(int i, boolean z) {
        return m69095a(new C19492l(DateTimeFieldType.m68890p(), i, z));
    }

    /* renamed from: f */
    public DateTimeFormatterBuilder m69139f(int i, int i2) {
        return m69115a(DateTimeFieldType.m68894t(), i, i2);
    }

    /* renamed from: g */
    public DateTimeFormatterBuilder m69142g(int i, int i2) {
        return m69124b(DateTimeFieldType.m68896v(), i, i2);
    }

    /* renamed from: c */
    public DateTimeFormatterBuilder m69127c() {
        return m69113a(DateTimeFieldType.m68885k());
    }

    /* renamed from: d */
    public DateTimeFormatterBuilder m69131d() {
        return m69113a(DateTimeFieldType.m68886l());
    }

    /* renamed from: e */
    public DateTimeFormatterBuilder m69134e() {
        return m69123b(DateTimeFieldType.m68886l());
    }

    /* renamed from: f */
    public DateTimeFormatterBuilder m69137f() {
        return m69113a(DateTimeFieldType.m68892r());
    }

    /* renamed from: g */
    public DateTimeFormatterBuilder m69140g() {
        return m69123b(DateTimeFieldType.m68892r());
    }

    /* renamed from: h */
    public DateTimeFormatterBuilder m69143h() {
        return m69113a(DateTimeFieldType.m68897w());
    }

    /* renamed from: i */
    public DateTimeFormatterBuilder m69145i() {
        return m69096a(new C19490j(0, null), null);
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69112a(Map<String, DateTimeZone> map) {
        C19325k c19490j = new C19490j(1, map);
        return m69096a(c19490j, (C19324i) c19490j);
    }

    /* renamed from: j */
    public DateTimeFormatterBuilder m69147j() {
        return m69096a(TimeZoneId.INSTANCE, TimeZoneId.INSTANCE);
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69111a(String str, boolean z, int i, int i2) {
        return m69095a((Object) new C19491k(str, str, z, i, i2));
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder m69110a(String str, String str2, boolean z, int i, int i2) {
        return m69095a((Object) new C19491k(str, str2, z, i, i2));
    }

    /* renamed from: k */
    private Object m69104k() {
        Object obj = this.f60182b;
        if (obj == null) {
            if (this.f60181a.size() == 2) {
                Object obj2 = this.f60181a.get(0);
                Object obj3 = this.f60181a.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new C19484b(this.f60181a);
            }
            this.f60182b = obj;
        }
        return obj;
    }

    /* renamed from: b */
    private boolean m69101b(Object obj) {
        if (obj instanceof C19325k) {
            return obj instanceof C19484b ? ((C19484b) obj).m70307a() : true;
        } else {
            return null;
        }
    }

    /* renamed from: c */
    private boolean m69103c(Object obj) {
        if (obj instanceof C19324i) {
            return obj instanceof C19484b ? ((C19484b) obj).m70308b() : true;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    static void m69097a(Appendable appendable, int i) throws IOException {
        while (true) {
            i--;
            if (i >= 0) {
                appendable.append('�');
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    static boolean m69099a(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static boolean m69100b(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2) {
                charAt = Character.toUpperCase(charAt);
                charAt2 = Character.toUpperCase(charAt2);
                if (!(charAt == charAt2 || Character.toLowerCase(charAt) == Character.toLowerCase(charAt2))) {
                    return false;
                }
            }
        }
        return true;
    }
}
