package okhttp3;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.internal.C15908c;
import okhttp3.internal.http.C15924c;

/* renamed from: okhttp3.h */
public final class C15897h {
    /* renamed from: a */
    private static final Pattern f49210a = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* renamed from: b */
    private static final Pattern f49211b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* renamed from: c */
    private static final Pattern f49212c = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* renamed from: d */
    private static final Pattern f49213d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    /* renamed from: e */
    private final String f49214e;
    /* renamed from: f */
    private final String f49215f;
    /* renamed from: g */
    private final long f49216g;
    /* renamed from: h */
    private final String f49217h;
    /* renamed from: i */
    private final String f49218i;
    /* renamed from: j */
    private final boolean f49219j;
    /* renamed from: k */
    private final boolean f49220k;
    /* renamed from: l */
    private final boolean f49221l;
    /* renamed from: m */
    private final boolean f49222m;

    private C15897h(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f49214e = str;
        this.f49215f = str2;
        this.f49216g = j;
        this.f49217h = str3;
        this.f49218i = str4;
        this.f49219j = z;
        this.f49220k = z2;
        this.f49222m = z3;
        this.f49221l = z4;
    }

    /* renamed from: a */
    public String m60096a() {
        return this.f49214e;
    }

    /* renamed from: b */
    public String m60098b() {
        return this.f49215f;
    }

    /* renamed from: a */
    private static boolean m60094a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == 46 && C15908c.m60178c(str) == null) {
            return true;
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public static C15897h m60093a(HttpUrl httpUrl, String str) {
        return C15897h.m60092a(System.currentTimeMillis(), httpUrl, str);
    }

    @javax.annotation.Nullable
    /* renamed from: a */
    static okhttp3.C15897h m60092a(long r26, okhttp3.HttpUrl r28, java.lang.String r29) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = r29;
        r3 = r29.length();
        r4 = 59;
        r5 = 0;
        r6 = okhttp3.internal.C15908c.m60151a(r2, r5, r3, r4);
        r7 = 61;
        r8 = okhttp3.internal.C15908c.m60151a(r2, r5, r6, r7);
        r9 = 0;
        if (r8 != r6) goto L_0x0017;
    L_0x0016:
        return r9;
    L_0x0017:
        r11 = okhttp3.internal.C15908c.m60177c(r2, r5, r8);
        r10 = r11.isEmpty();
        if (r10 != 0) goto L_0x014e;
    L_0x0021:
        r10 = okhttp3.internal.C15908c.m60173b(r11);
        r12 = -1;
        if (r10 == r12) goto L_0x002a;
    L_0x0028:
        goto L_0x014e;
    L_0x002a:
        r10 = 1;
        r8 = r8 + r10;
        r8 = okhttp3.internal.C15908c.m60177c(r2, r8, r6);
        r13 = okhttp3.internal.C15908c.m60173b(r8);
        if (r13 == r12) goto L_0x0037;
    L_0x0036:
        return r9;
    L_0x0037:
        r6 = r6 + r10;
        r12 = -1;
        r14 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
        r10 = r9;
        r21 = r10;
        r16 = r12;
        r22 = r14;
        r18 = 0;
        r19 = 0;
        r20 = 1;
        r24 = 0;
    L_0x004e:
        if (r6 >= r3) goto L_0x00c3;
    L_0x0050:
        r9 = okhttp3.internal.C15908c.m60151a(r2, r6, r3, r4);
        r4 = okhttp3.internal.C15908c.m60151a(r2, r6, r9, r7);
        r6 = okhttp3.internal.C15908c.m60177c(r2, r6, r4);
        if (r4 >= r9) goto L_0x0065;
    L_0x005e:
        r4 = r4 + 1;
        r4 = okhttp3.internal.C15908c.m60177c(r2, r4, r9);
        goto L_0x0067;
    L_0x0065:
        r4 = "";
    L_0x0067:
        r7 = "expires";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x007c;
    L_0x006f:
        r6 = r4.length();	 Catch:{ IllegalArgumentException -> 0x00bb }
        r6 = okhttp3.C15897h.m60090a(r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x00bb }
        r22 = r6;
    L_0x0079:
        r24 = 1;
        goto L_0x00bb;
    L_0x007c:
        r7 = "max-age";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x008b;
    L_0x0084:
        r6 = okhttp3.C15897h.m60089a(r4);	 Catch:{  }
        r16 = r6;
        goto L_0x0079;
    L_0x008b:
        r7 = "domain";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x009b;
    L_0x0093:
        r4 = okhttp3.C15897h.m60095b(r4);	 Catch:{ IllegalArgumentException -> 0x00bb }
        r10 = r4;
        r20 = 0;
        goto L_0x00bb;
    L_0x009b:
        r7 = "path";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x00a6;
    L_0x00a3:
        r21 = r4;
        goto L_0x00bb;
    L_0x00a6:
        r4 = "secure";
        r4 = r6.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x00b1;
    L_0x00ae:
        r18 = 1;
        goto L_0x00bb;
    L_0x00b1:
        r4 = "httponly";
        r4 = r6.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x00bb;
    L_0x00b9:
        r19 = 1;
    L_0x00bb:
        r6 = r9 + 1;
        r4 = 59;
        r7 = 61;
        r9 = 0;
        goto L_0x004e;
    L_0x00c3:
        r2 = -9223372036854775808;
        r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x00cb;
    L_0x00c9:
        r13 = r2;
        goto L_0x00f1;
    L_0x00cb:
        r2 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1));
        if (r2 == 0) goto L_0x00ef;
    L_0x00cf:
        r2 = 9223372036854775; // 0x20c49ba5e353f7 float:-3.943512E-16 double:4.663754807431093E-308;
        r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1));
        if (r4 > 0) goto L_0x00dd;
    L_0x00d8:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r16 = r16 * r2;
        goto L_0x00e2;
    L_0x00dd:
        r16 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x00e2:
        r2 = 0;
        r2 = r26 + r16;
        r4 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1));
        if (r4 < 0) goto L_0x00ed;
    L_0x00e9:
        r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c9;
    L_0x00ed:
        r13 = r14;
        goto L_0x00f1;
    L_0x00ef:
        r13 = r22;
    L_0x00f1:
        r0 = r28.m60010g();
        if (r10 != 0) goto L_0x00fa;
    L_0x00f7:
        r15 = r0;
        r1 = 0;
        goto L_0x0104;
    L_0x00fa:
        r1 = okhttp3.C15897h.m60094a(r0, r10);
        if (r1 != 0) goto L_0x0102;
    L_0x0100:
        r1 = 0;
        return r1;
    L_0x0102:
        r1 = 0;
        r15 = r10;
    L_0x0104:
        r0 = r0.length();
        r2 = r15.length();
        if (r0 == r2) goto L_0x0119;
    L_0x010e:
        r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m60426a();
        r0 = r0.m60430a(r15);
        if (r0 != 0) goto L_0x0119;
    L_0x0118:
        return r1;
    L_0x0119:
        r9 = r21;
        if (r9 == 0) goto L_0x0129;
    L_0x011d:
        r0 = "/";
        r0 = r9.startsWith(r0);
        if (r0 != 0) goto L_0x0126;
    L_0x0125:
        goto L_0x0129;
    L_0x0126:
        r16 = r9;
        goto L_0x013e;
    L_0x0129:
        r0 = r28.m60012i();
        r1 = 47;
        r1 = r0.lastIndexOf(r1);
        if (r1 == 0) goto L_0x013a;
    L_0x0135:
        r0 = r0.substring(r5, r1);
        goto L_0x013c;
    L_0x013a:
        r0 = "/";
    L_0x013c:
        r16 = r0;
    L_0x013e:
        r0 = new okhttp3.h;
        r10 = r0;
        r12 = r8;
        r17 = r18;
        r18 = r19;
        r19 = r20;
        r20 = r24;
        r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20);
        return r0;
    L_0x014e:
        r0 = r9;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.h.a(long, okhttp3.HttpUrl, java.lang.String):okhttp3.h");
    }

    /* renamed from: a */
    private static long m60090a(String str, int i, int i2) {
        i = C15897h.m60088a(str, i, i2, false);
        Matcher matcher = f49213d.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (i < i2) {
            int a = C15897h.m60088a(str, i + 1, i2, true);
            matcher.region(i, a);
            if (i3 == -1 && matcher.usePattern(f49213d).matches() != 0) {
                i = Integer.parseInt(matcher.group(1));
                i3 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
                i7 = i3;
                i3 = i;
            } else if (i5 == -1 && matcher.usePattern(f49212c).matches() != 0) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(f49211b).matches() != 0) {
                i6 = f49211b.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i4 == -1 && matcher.usePattern(f49210a).matches() != 0) {
                i4 = Integer.parseInt(matcher.group(1));
            }
            i = C15897h.m60088a(str, a + 1, i2, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else {
            if (i5 >= 1) {
                if (i5 <= 31) {
                    if (i3 >= 0) {
                        if (i3 <= 23) {
                            if (i7 >= 0) {
                                if (i7 <= 59) {
                                    if (i8 >= 0) {
                                        if (i8 <= 59) {
                                            str = new GregorianCalendar(C15908c.f49251g);
                                            str.setLenient(false);
                                            str.set(1, i4);
                                            str.set(2, i6 - 1);
                                            str.set(5, i5);
                                            str.set(11, i3);
                                            str.set(12, i7);
                                            str.set(13, i8);
                                            str.set(14, 0);
                                            return str.getTimeInMillis();
                                        }
                                    }
                                    throw new IllegalArgumentException();
                                }
                            }
                            throw new IllegalArgumentException();
                        }
                    }
                    throw new IllegalArgumentException();
                }
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private static int m60088a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            int i3;
            char charAt = str.charAt(i);
            if ((charAt >= ' ' || charAt == '\t') && charAt < '' && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')))) {
                if (charAt != ':') {
                    i3 = 0;
                    if (i3 == (z ^ 1)) {
                        return i;
                    }
                    i++;
                }
            }
            i3 = 1;
            if (i3 == (z ^ 1)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private static long m60089a(String str) {
        long j = Long.MIN_VALUE;
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                j = parseLong;
            }
            return j;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                if (str.startsWith("-") == null) {
                    j = Format.OFFSET_SAMPLE_RELATIVE;
                }
                return j;
            }
            throw e;
        }
    }

    /* renamed from: b */
    private static String m60095b(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        str = C15908c.m60156a(str);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static List<C15897h> m60091a(HttpUrl httpUrl, C15957l c15957l) {
        c15957l = c15957l.m60477b("Set-Cookie");
        int size = c15957l.size();
        List list = null;
        for (int i = 0; i < size; i++) {
            C15897h a = C15897h.m60093a(httpUrl, (String) c15957l.get(i));
            if (a != null) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(a);
            }
        }
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return Collections.emptyList();
    }

    public String toString() {
        return m60097a(false);
    }

    /* renamed from: a */
    String m60097a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f49214e);
        stringBuilder.append('=');
        stringBuilder.append(this.f49215f);
        if (this.f49221l) {
            if (this.f49216g == Long.MIN_VALUE) {
                stringBuilder.append("; max-age=0");
            } else {
                stringBuilder.append("; expires=");
                stringBuilder.append(C15924c.m60258a(new Date(this.f49216g)));
            }
        }
        if (!this.f49222m) {
            stringBuilder.append("; domain=");
            if (z) {
                stringBuilder.append(".");
            }
            stringBuilder.append(this.f49217h);
        }
        stringBuilder.append("; path=");
        stringBuilder.append(this.f49218i);
        if (this.f49219j) {
            stringBuilder.append("; secure");
        }
        if (this.f49220k) {
            stringBuilder.append("; httponly");
        }
        return stringBuilder.toString();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = false;
        if (!(obj instanceof C15897h)) {
            return false;
        }
        C15897h c15897h = (C15897h) obj;
        if (c15897h.f49214e.equals(this.f49214e) && c15897h.f49215f.equals(this.f49215f) && c15897h.f49217h.equals(this.f49217h) && c15897h.f49218i.equals(this.f49218i) && c15897h.f49216g == this.f49216g && c15897h.f49219j == this.f49219j && c15897h.f49220k == this.f49220k && c15897h.f49221l == this.f49221l && c15897h.f49222m == this.f49222m) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f49214e.hashCode()) * 31) + this.f49215f.hashCode()) * 31) + this.f49217h.hashCode()) * 31) + this.f49218i.hashCode()) * 31) + ((int) (this.f49216g ^ (this.f49216g >>> 32)))) * 31) + (this.f49219j ^ 1)) * 31) + (this.f49220k ^ 1)) * 31) + (this.f49221l ^ 1)) * 31) + (this.f49222m ^ 1);
    }
}
