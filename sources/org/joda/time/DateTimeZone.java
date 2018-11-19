package org.joda.time;

import com.facebook.ads.AdError;
import com.google.android.exoplayer2.Format;
import com.tinder.api.ManagerWebServices;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.format.C19320f;
import org.joda.time.tz.C19502a;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;

public abstract class DateTimeZone implements Serializable {
    /* renamed from: a */
    public static final DateTimeZone f8461a = UTCDateTimeZone.f60818b;
    /* renamed from: b */
    private static final AtomicReference<Provider> f8462b = new AtomicReference();
    /* renamed from: c */
    private static final AtomicReference<NameProvider> f8463c = new AtomicReference();
    /* renamed from: d */
    private static final AtomicReference<DateTimeZone> f8464d = new AtomicReference();
    private static final long serialVersionUID = 5546345482340108586L;
    /* renamed from: e */
    private final String f8465e;

    /* renamed from: a */
    public abstract String m10344a(long j);

    /* renamed from: b */
    public abstract int m10346b(long j);

    /* renamed from: c */
    public abstract int m10348c(long j);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract boolean m10353f();

    /* renamed from: g */
    public abstract long m10354g(long j);

    /* renamed from: h */
    public abstract long m10355h(long j);

    /* renamed from: a */
    public static org.joda.time.DateTimeZone m10323a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = f8464d;
        r0 = r0.get();
        r0 = (org.joda.time.DateTimeZone) r0;
        if (r0 != 0) goto L_0x0037;
    L_0x000a:
        r1 = "user.timezone";	 Catch:{ RuntimeException -> 0x0017 }
        r1 = java.lang.System.getProperty(r1);	 Catch:{ RuntimeException -> 0x0017 }
        if (r1 == 0) goto L_0x0017;	 Catch:{ RuntimeException -> 0x0017 }
    L_0x0012:
        r1 = m10325a(r1);	 Catch:{ RuntimeException -> 0x0017 }
        r0 = r1;
    L_0x0017:
        if (r0 != 0) goto L_0x0022;
    L_0x0019:
        r1 = java.util.TimeZone.getDefault();	 Catch:{ IllegalArgumentException -> 0x0022 }
        r1 = m10327a(r1);	 Catch:{ IllegalArgumentException -> 0x0022 }
        r0 = r1;
    L_0x0022:
        if (r0 != 0) goto L_0x0026;
    L_0x0024:
        r0 = f8461a;
    L_0x0026:
        r1 = f8464d;
        r2 = 0;
        r1 = r1.compareAndSet(r2, r0);
        if (r1 != 0) goto L_0x0037;
    L_0x002f:
        r0 = f8464d;
        r0 = r0.get();
        r0 = (org.joda.time.DateTimeZone) r0;
    L_0x0037:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.a():org.joda.time.DateTimeZone");
    }

    /* renamed from: a */
    public static void m10328a(DateTimeZone dateTimeZone) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone == null) {
            throw new IllegalArgumentException("The datetime zone must not be null");
        }
        f8464d.set(dateTimeZone);
    }

    @FromString
    /* renamed from: a */
    public static DateTimeZone m10325a(String str) {
        if (str == null) {
            return m10323a();
        }
        if (str.equals("UTC")) {
            return f8461a;
        }
        DateTimeZone zone = m10335c().getZone(str);
        if (zone != null) {
            return zone;
        }
        if (!str.startsWith("+")) {
            if (!str.startsWith("-")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The datetime zone id '");
                stringBuilder.append(str);
                stringBuilder.append("' is not recognised");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        int d = m10336d(str);
        if (((long) d) == 0) {
            return f8461a;
        }
        return m10326a(m10330b(d), d);
    }

    /* renamed from: a */
    public static DateTimeZone m10324a(int i) {
        if (i >= -86399999) {
            if (i <= 86399999) {
                return m10326a(m10330b(i), i);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Millis out of range: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static DateTimeZone m10327a(TimeZone timeZone) {
        if (timeZone == null) {
            return m10323a();
        }
        String id = timeZone.getID();
        if (id == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        } else if (id.equals("UTC")) {
            return f8461a;
        } else {
            DateTimeZone dateTimeZone = null;
            String c = m10334c(id);
            Provider c2 = m10335c();
            if (c != null) {
                dateTimeZone = c2.getZone(c);
            }
            if (dateTimeZone == null) {
                dateTimeZone = c2.getZone(id);
            }
            if (dateTimeZone != null) {
                return dateTimeZone;
            }
            if (c == null && (id.startsWith("GMT+") || id.startsWith("GMT-"))) {
                id = id.substring(3);
                if (id.length() > 2) {
                    char charAt = id.charAt(1);
                    if (charAt > '9' && Character.isDigit(charAt)) {
                        id = m10331b(id);
                    }
                }
                int d = m10336d(id);
                if (((long) d) == 0) {
                    return f8461a;
                }
                return m10326a(m10330b(d), d);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The datetime zone id '");
            stringBuilder.append(id);
            stringBuilder.append("' is not recognised");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private static String m10331b(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (str = null; str < stringBuilder.length(); str++) {
            int digit = Character.digit(stringBuilder.charAt(str), 10);
            if (digit >= 0) {
                stringBuilder.setCharAt(str, (char) (digit + 48));
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static DateTimeZone m10326a(String str, int i) {
        if (i == 0) {
            return f8461a;
        }
        return new FixedDateTimeZone(str, null, i, i);
    }

    /* renamed from: b */
    public static Set<String> m10332b() {
        return m10335c().getAvailableIDs();
    }

    /* renamed from: c */
    public static Provider m10335c() {
        Provider provider = (Provider) f8462b.get();
        if (provider != null) {
            return provider;
        }
        provider = m10338g();
        return !f8462b.compareAndSet(null, provider) ? (Provider) f8462b.get() : provider;
    }

    /* renamed from: a */
    public static void m10329a(Provider provider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (provider == null) {
            provider = m10338g();
        } else {
            m10333b(provider);
        }
        f8462b.set(provider);
    }

    /* renamed from: b */
    private static Provider m10333b(Provider provider) {
        Set availableIDs = provider.getAvailableIDs();
        if (availableIDs != null) {
            if (availableIDs.size() != 0) {
                if (!availableIDs.contains("UTC")) {
                    throw new IllegalArgumentException("The provider doesn't support UTC");
                } else if (f8461a.equals(provider.getZone("UTC"))) {
                    return provider;
                } else {
                    throw new IllegalArgumentException("Invalid UTC zone provided");
                }
            }
        }
        throw new IllegalArgumentException("The provider doesn't have any available ids");
    }

    /* renamed from: g */
    private static org.joda.time.tz.Provider m10338g() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = "org.joda.time.DateTimeZone.Provider";	 Catch:{ SecurityException -> 0x001e }
        r0 = java.lang.System.getProperty(r0);	 Catch:{ SecurityException -> 0x001e }
        if (r0 == 0) goto L_0x001e;
    L_0x0008:
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0017 }
        r0 = r0.newInstance();	 Catch:{ Exception -> 0x0017 }
        r0 = (org.joda.time.tz.Provider) r0;	 Catch:{ Exception -> 0x0017 }
        r0 = m10333b(r0);	 Catch:{ Exception -> 0x0017 }
        return r0;
    L_0x0017:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ SecurityException -> 0x001e }
        r1.<init>(r0);	 Catch:{ SecurityException -> 0x001e }
        throw r1;	 Catch:{ SecurityException -> 0x001e }
    L_0x001e:
        r0 = "org.joda.time.DateTimeZone.Folder";	 Catch:{ SecurityException -> 0x003c }
        r0 = java.lang.System.getProperty(r0);	 Catch:{ SecurityException -> 0x003c }
        if (r0 == 0) goto L_0x003c;
    L_0x0026:
        r1 = new org.joda.time.tz.c;	 Catch:{ Exception -> 0x0035 }
        r2 = new java.io.File;	 Catch:{ Exception -> 0x0035 }
        r2.<init>(r0);	 Catch:{ Exception -> 0x0035 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0035 }
        r0 = m10333b(r1);	 Catch:{ Exception -> 0x0035 }
        return r0;
    L_0x0035:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ SecurityException -> 0x003c }
        r1.<init>(r0);	 Catch:{ SecurityException -> 0x003c }
        throw r1;	 Catch:{ SecurityException -> 0x003c }
    L_0x003c:
        r0 = new org.joda.time.tz.c;	 Catch:{ Exception -> 0x0048 }
        r1 = "org/joda/time/tz/data";	 Catch:{ Exception -> 0x0048 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0048 }
        r0 = m10333b(r0);	 Catch:{ Exception -> 0x0048 }
        return r0;
    L_0x0048:
        r0 = move-exception;
        r0.printStackTrace();
        r0 = new org.joda.time.tz.b;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.g():org.joda.time.tz.Provider");
    }

    /* renamed from: d */
    public static NameProvider m10337d() {
        NameProvider nameProvider = (NameProvider) f8463c.get();
        if (nameProvider != null) {
            return nameProvider;
        }
        nameProvider = m10339h();
        return !f8463c.compareAndSet(null, nameProvider) ? (NameProvider) f8463c.get() : nameProvider;
    }

    /* renamed from: h */
    private static org.joda.time.tz.NameProvider m10339h() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 0;
        r1 = "org.joda.time.DateTimeZone.NameProvider";	 Catch:{ SecurityException -> 0x001c }
        r1 = java.lang.System.getProperty(r1);	 Catch:{ SecurityException -> 0x001c }
        if (r1 == 0) goto L_0x001c;
    L_0x0009:
        r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x0015 }
        r1 = r1.newInstance();	 Catch:{ Exception -> 0x0015 }
        r1 = (org.joda.time.tz.NameProvider) r1;	 Catch:{ Exception -> 0x0015 }
        r0 = r1;
        goto L_0x001c;
    L_0x0015:
        r1 = move-exception;
        r2 = new java.lang.RuntimeException;	 Catch:{ SecurityException -> 0x001c }
        r2.<init>(r1);	 Catch:{ SecurityException -> 0x001c }
        throw r2;	 Catch:{ SecurityException -> 0x001c }
    L_0x001c:
        if (r0 != 0) goto L_0x0023;
    L_0x001e:
        r0 = new org.joda.time.tz.a;
        r0.<init>();
    L_0x0023:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeZone.h():org.joda.time.tz.NameProvider");
    }

    /* renamed from: c */
    private static String m10334c(String str) {
        return (String) DateTimeZone$a.f60068a.get(str);
    }

    /* renamed from: d */
    private static int m10336d(String str) {
        return -((int) DateTimeZone$a.f60069b.a(str));
    }

    /* renamed from: b */
    private static String m10330b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        C19320f.a(stringBuffer, i2, 2);
        i -= i2 * 3600000;
        i2 = i / ManagerWebServices.TIMEOUT_AUTH_MS;
        stringBuffer.append(':');
        C19320f.a(stringBuffer, i2, 2);
        i -= i2 * ManagerWebServices.TIMEOUT_AUTH_MS;
        if (i == 0) {
            return stringBuffer.toString();
        }
        int i3 = i / AdError.NETWORK_ERROR_CODE;
        stringBuffer.append(':');
        C19320f.a(stringBuffer, i3, 2);
        i -= i3 * AdError.NETWORK_ERROR_CODE;
        if (i == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        C19320f.a(stringBuffer, i, 3);
        return stringBuffer.toString();
    }

    protected DateTimeZone(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.f8465e = str;
    }

    @ToString
    /* renamed from: e */
    public final String m10351e() {
        return this.f8465e;
    }

    /* renamed from: a */
    public String m10345a(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String a = m10344a(j);
        if (a == null) {
            return this.f8465e;
        }
        NameProvider d = m10337d();
        if (d instanceof C19502a) {
            locale = ((C19502a) d).a(locale, this.f8465e, a, m10349d(j));
        } else {
            locale = d.getShortName(locale, this.f8465e, a);
        }
        if (locale != null) {
            return locale;
        }
        return m10330b(m10346b(j));
    }

    /* renamed from: b */
    public String m10347b(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String a = m10344a(j);
        if (a == null) {
            return this.f8465e;
        }
        NameProvider d = m10337d();
        if (d instanceof C19502a) {
            locale = ((C19502a) d).b(locale, this.f8465e, a, m10349d(j));
        } else {
            locale = d.getName(locale, this.f8465e, a);
        }
        if (locale != null) {
            return locale;
        }
        return m10330b(m10346b(j));
    }

    /* renamed from: a */
    public final int m10340a(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return m10346b(DateTimeUtils.a());
        }
        return m10346b(readableInstant.getMillis());
    }

    /* renamed from: d */
    public boolean m10349d(long j) {
        return m10346b(j) == m10348c(j) ? 1 : 0;
    }

    /* renamed from: e */
    public int m10350e(long j) {
        int b = m10346b(j);
        long j2 = j - ((long) b);
        int b2 = m10346b(j2);
        if (b != b2) {
            if (b - b2 < 0) {
                long g = m10354g(j2);
                if (g == j2) {
                    g = Format.OFFSET_SAMPLE_RELATIVE;
                }
                long j3 = j - ((long) b2);
                j = m10354g(j3);
                if (j == j3) {
                    j = Format.OFFSET_SAMPLE_RELATIVE;
                }
                if (g != j) {
                    return b;
                }
            }
        } else if (b >= 0) {
            j = m10355h(j2);
            if (j < j2) {
                int b3 = m10346b(j);
                if (j2 - j <= ((long) (b3 - b))) {
                    return b3;
                }
            }
        }
        return b2;
    }

    /* renamed from: f */
    public long m10352f(long j) {
        long b = (long) m10346b(j);
        long j2 = j + b;
        if ((j ^ j2) >= 0 || (j ^ b) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    /* renamed from: a */
    public long m10342a(long j, boolean z, long j2) {
        j2 = m10346b(j2);
        long j3 = j - ((long) j2);
        if (m10346b(j3) == j2) {
            return j3;
        }
        return m10341a(j, z);
    }

    /* renamed from: a */
    public long m10341a(long j, boolean z) {
        long j2;
        long j3;
        int b = m10346b(j);
        long j4 = j - ((long) b);
        int b2 = m10346b(j4);
        if (b != b2 && (z || b < 0)) {
            long g = m10354g(j4);
            int i = (g > j4 ? 1 : (g == j4 ? 0 : -1));
            j4 = Format.OFFSET_SAMPLE_RELATIVE;
            if (i == 0) {
                g = Format.OFFSET_SAMPLE_RELATIVE;
            }
            long j5 = j - ((long) b2);
            long g2 = m10354g(j5);
            if (g2 != j5) {
                j4 = g2;
            }
            if (g != j4) {
                if (z) {
                    throw new IllegalInstantException(j, m10351e());
                }
                j2 = (long) b;
                j3 = j - j2;
                if ((j ^ j3) < 0 || (j ^ j2) >= 0) {
                    return j3;
                }
                throw new ArithmeticException("Subtracting time zone offset caused overflow");
            }
        }
        b = b2;
        j2 = (long) b;
        j3 = j - j2;
        if ((j ^ j3) < 0) {
        }
        return j3;
    }

    /* renamed from: a */
    public long m10343a(DateTimeZone dateTimeZone, long j) {
        if (dateTimeZone == null) {
            dateTimeZone = m10323a();
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone2 == this) {
            return j;
        }
        return dateTimeZone2.m10342a(m10352f(j), false, j);
    }

    public int hashCode() {
        return m10351e().hashCode() + 57;
    }

    public String toString() {
        return m10351e();
    }

    protected Object writeReplace() throws ObjectStreamException {
        return new DateTimeZone$Stub(this.f8465e);
    }
}
