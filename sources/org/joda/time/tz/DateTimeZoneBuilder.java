package org.joda.time.tz;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.joda.time.C19304a;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;

public class DateTimeZoneBuilder {

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$a */
    private static final class C19330a {
        /* renamed from: a */
        final char f60289a;
        /* renamed from: b */
        final int f60290b;
        /* renamed from: c */
        final int f60291c;
        /* renamed from: d */
        final int f60292d;
        /* renamed from: e */
        final boolean f60293e;
        /* renamed from: f */
        final int f60294f;

        /* renamed from: a */
        static C19330a m69324a(DataInput dataInput) throws IOException {
            return new C19330a((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.m69335a(dataInput));
        }

        C19330a(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c == 'u' || c == 'w' || c == 's') {
                this.f60289a = c;
                this.f60290b = i;
                this.f60291c = i2;
                this.f60292d = i3;
                this.f60293e = z;
                this.f60294f = i4;
                return;
            }
            i2 = new StringBuilder();
            i2.append("Unknown mode: ");
            i2.append(c);
            throw new IllegalArgumentException(i2.toString());
        }

        /* renamed from: a */
        public long m69328a(long j, int i, int i2) {
            if (this.f60289a == 'w') {
                i += i2;
            } else if (this.f60289a != 115) {
                i = 0;
            }
            i = (long) i;
            long j2 = j + i;
            j = ISOChronology.m71188N();
            long a = m69323a(j, j.mo14499e().mo14528a(j.mo14499e().mo14538b(j.mo14478C().mo14538b(j2, this.f60290b), 0), this.f60294f));
            if (this.f60292d != 0) {
                a = m69327d(j, a);
                if (a <= j2) {
                    a = m69327d(j, m69323a(j, j.mo14478C().mo14538b(j.mo14480E().mo14528a(a, 1), this.f60290b)));
                }
            } else if (a <= j2) {
                a = m69323a(j, j.mo14480E().mo14528a(a, 1));
            }
            return a - i;
        }

        /* renamed from: b */
        public long m69329b(long j, int i, int i2) {
            if (this.f60289a == 'w') {
                i += i2;
            } else if (this.f60289a != 115) {
                i = 0;
            }
            i = (long) i;
            long j2 = j + i;
            j = ISOChronology.m71188N();
            long b = m69325b(j, j.mo14499e().mo14528a(j.mo14499e().mo14538b(j.mo14478C().mo14538b(j2, this.f60290b), 0), this.f60294f));
            if (this.f60292d != 0) {
                b = m69327d(j, b);
                if (b >= j2) {
                    b = m69327d(j, m69325b(j, j.mo14478C().mo14538b(j.mo14480E().mo14528a(b, -1), this.f60290b)));
                }
            } else if (b >= j2) {
                b = m69325b(j, j.mo14480E().mo14528a(b, -1));
            }
            return b - i;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19330a)) {
                return false;
            }
            C19330a c19330a = (C19330a) obj;
            if (this.f60289a != c19330a.f60289a || this.f60290b != c19330a.f60290b || this.f60291c != c19330a.f60291c || this.f60292d != c19330a.f60292d || this.f60293e != c19330a.f60293e || this.f60294f != c19330a.f60294f) {
                z = false;
            }
            return z;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[OfYear]\nMode: ");
            stringBuilder.append(this.f60289a);
            stringBuilder.append('\n');
            stringBuilder.append("MonthOfYear: ");
            stringBuilder.append(this.f60290b);
            stringBuilder.append('\n');
            stringBuilder.append("DayOfMonth: ");
            stringBuilder.append(this.f60291c);
            stringBuilder.append('\n');
            stringBuilder.append("DayOfWeek: ");
            stringBuilder.append(this.f60292d);
            stringBuilder.append('\n');
            stringBuilder.append("AdvanceDayOfWeek: ");
            stringBuilder.append(this.f60293e);
            stringBuilder.append('\n');
            stringBuilder.append("MillisOfDay: ");
            stringBuilder.append(this.f60294f);
            stringBuilder.append('\n');
            return stringBuilder.toString();
        }

        /* renamed from: a */
        private long m69323a(C19304a c19304a, long j) {
            try {
                return m69326c(c19304a, j);
            } catch (IllegalArgumentException e) {
                if (this.f60290b == 2 && this.f60291c == 29) {
                    while (!c19304a.mo14480E().mo14543b(j)) {
                        j = c19304a.mo14480E().mo14528a(j, 1);
                    }
                    return m69326c(c19304a, j);
                }
                throw e;
            }
        }

        /* renamed from: b */
        private long m69325b(C19304a c19304a, long j) {
            try {
                return m69326c(c19304a, j);
            } catch (IllegalArgumentException e) {
                if (this.f60290b == 2 && this.f60291c == 29) {
                    while (!c19304a.mo14480E().mo14543b(j)) {
                        j = c19304a.mo14480E().mo14528a(j, -1);
                    }
                    return m69326c(c19304a, j);
                }
                throw e;
            }
        }

        /* renamed from: c */
        private long m69326c(C19304a c19304a, long j) {
            if (this.f60291c >= 0) {
                return c19304a.mo14515u().mo14538b(j, this.f60291c);
            }
            return c19304a.mo14515u().mo14528a(c19304a.mo14478C().mo14528a(c19304a.mo14515u().mo14538b(j, 1), 1), this.f60291c);
        }

        /* renamed from: d */
        private long m69327d(C19304a c19304a, long j) {
            int a = this.f60292d - c19304a.mo14514t().mo14524a(j);
            if (a == 0) {
                return j;
            }
            if (this.f60293e) {
                if (a < 0) {
                    a += 7;
                }
            } else if (a > 0) {
                a -= 7;
            }
            return c19304a.mo14514t().mo14528a(j, a);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$b */
    private static final class C19331b {
        /* renamed from: a */
        final C19330a f60295a;
        /* renamed from: b */
        final String f60296b;
        /* renamed from: c */
        final int f60297c;

        /* renamed from: a */
        static C19331b m69330a(DataInput dataInput) throws IOException {
            return new C19331b(C19330a.m69324a(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.m69335a(dataInput));
        }

        C19331b(C19330a c19330a, String str, int i) {
            this.f60295a = c19330a;
            this.f60296b = str;
            this.f60297c = i;
        }

        /* renamed from: a */
        public long m69331a(long j, int i, int i2) {
            return this.f60295a.m69328a(j, i, i2);
        }

        /* renamed from: b */
        public long m69334b(long j, int i, int i2) {
            return this.f60295a.m69329b(j, i, i2);
        }

        /* renamed from: a */
        public String m69332a() {
            return this.f60296b;
        }

        /* renamed from: b */
        public int m69333b() {
            return this.f60297c;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19331b)) {
                return false;
            }
            C19331b c19331b = (C19331b) obj;
            if (this.f60297c != c19331b.f60297c || !this.f60296b.equals(c19331b.f60296b) || this.f60295a.equals(c19331b.f60295a) == null) {
                z = false;
            }
            return z;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f60295a);
            stringBuilder.append(" named ");
            stringBuilder.append(this.f60296b);
            stringBuilder.append(" at ");
            stringBuilder.append(this.f60297c);
            return stringBuilder.toString();
        }
    }

    private static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        /* renamed from: b */
        final int f60886b;
        /* renamed from: c */
        final C19331b f60887c;
        /* renamed from: d */
        final C19331b f60888d;

        /* renamed from: f */
        public boolean m70349f() {
            return false;
        }

        /* renamed from: a */
        static DSTZone m70344a(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.m69335a(dataInput), C19331b.m69330a(dataInput), C19331b.m69330a(dataInput));
        }

        DSTZone(String str, int i, C19331b c19331b, C19331b c19331b2) {
            super(str);
            this.f60886b = i;
            this.f60887c = c19331b;
            this.f60888d = c19331b2;
        }

        /* renamed from: a */
        public String m70346a(long j) {
            return m70345i(j).m69332a();
        }

        /* renamed from: b */
        public int m70347b(long j) {
            return this.f60886b + m70345i(j).m69333b();
        }

        /* renamed from: c */
        public int m70348c(long j) {
            return this.f60886b;
        }

        /* renamed from: g */
        public long m70350g(long r9) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r8 = this;
            r0 = r8.f60886b;
            r1 = r8.f60887c;
            r2 = r8.f60888d;
            r3 = 0;
            r5 = r2.m69333b();	 Catch:{ IllegalArgumentException -> 0x0018, IllegalArgumentException -> 0x0018 }
            r5 = r1.m69331a(r9, r0, r5);	 Catch:{ IllegalArgumentException -> 0x0018, IllegalArgumentException -> 0x0018 }
            r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
            if (r7 <= 0) goto L_0x0019;
        L_0x0014:
            r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
            if (r7 >= 0) goto L_0x0019;
        L_0x0018:
            r5 = r9;
        L_0x0019:
            r1 = r1.m69333b();	 Catch:{ IllegalArgumentException -> 0x002b, IllegalArgumentException -> 0x002b }
            r0 = r2.m69331a(r9, r0, r1);	 Catch:{ IllegalArgumentException -> 0x002b, IllegalArgumentException -> 0x002b }
            r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
            if (r2 <= 0) goto L_0x002a;
        L_0x0025:
            r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
            if (r2 >= 0) goto L_0x002a;
        L_0x0029:
            goto L_0x002b;
        L_0x002a:
            r9 = r0;
        L_0x002b:
            r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
            if (r0 <= 0) goto L_0x0030;
        L_0x002f:
            goto L_0x0031;
        L_0x0030:
            r9 = r5;
        L_0x0031:
            return r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.DSTZone.g(long):long");
        }

        /* renamed from: h */
        public long m70351h(long r11) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r10 = this;
            r0 = 1;
            r2 = r11 + r0;
            r11 = r10.f60886b;
            r12 = r10.f60887c;
            r4 = r10.f60888d;
            r5 = 0;
            r7 = r4.m69333b();	 Catch:{ IllegalArgumentException -> 0x001c, IllegalArgumentException -> 0x001c }
            r7 = r12.m69334b(r2, r11, r7);	 Catch:{ IllegalArgumentException -> 0x001c, IllegalArgumentException -> 0x001c }
            r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
            if (r9 >= 0) goto L_0x001d;
        L_0x0018:
            r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
            if (r9 <= 0) goto L_0x001d;
        L_0x001c:
            r7 = r2;
        L_0x001d:
            r12 = r12.m69333b();	 Catch:{ IllegalArgumentException -> 0x002f, IllegalArgumentException -> 0x002f }
            r11 = r4.m69334b(r2, r11, r12);	 Catch:{ IllegalArgumentException -> 0x002f, IllegalArgumentException -> 0x002f }
            r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
            if (r4 >= 0) goto L_0x002e;
        L_0x0029:
            r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
            if (r4 <= 0) goto L_0x002e;
        L_0x002d:
            goto L_0x002f;
        L_0x002e:
            r2 = r11;
        L_0x002f:
            r11 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1));
            if (r11 <= 0) goto L_0x0034;
        L_0x0033:
            r2 = r7;
        L_0x0034:
            r11 = 0;
            r11 = r2 - r0;
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.DSTZone.h(long):long");
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            if (!e().equals(dSTZone.e()) || this.f60886b != dSTZone.f60886b || !this.f60887c.equals(dSTZone.f60887c) || this.f60888d.equals(dSTZone.f60888d) == null) {
                z = false;
            }
            return z;
        }

        /* renamed from: i */
        private org.joda.time.tz.DateTimeZoneBuilder.C19331b m70345i(long r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r7 = this;
            r0 = r7.f60886b;
            r1 = r7.f60887c;
            r2 = r7.f60888d;
            r3 = r2.m69333b();	 Catch:{ IllegalArgumentException -> 0x000f, IllegalArgumentException -> 0x000f }
            r3 = r1.m69331a(r8, r0, r3);	 Catch:{ IllegalArgumentException -> 0x000f, IllegalArgumentException -> 0x000f }
            goto L_0x0010;
        L_0x000f:
            r3 = r8;
        L_0x0010:
            r5 = r1.m69333b();	 Catch:{ IllegalArgumentException -> 0x0019, IllegalArgumentException -> 0x0019 }
            r5 = r2.m69331a(r8, r0, r5);	 Catch:{ IllegalArgumentException -> 0x0019, IllegalArgumentException -> 0x0019 }
            r8 = r5;
        L_0x0019:
            r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
            if (r0 <= 0) goto L_0x001e;
        L_0x001d:
            goto L_0x001f;
        L_0x001e:
            r1 = r2;
        L_0x001f:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.DSTZone.i(long):org.joda.time.tz.DateTimeZoneBuilder$b");
        }
    }

    private static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        /* renamed from: b */
        private final long[] f60889b;
        /* renamed from: c */
        private final int[] f60890c;
        /* renamed from: d */
        private final int[] f60891d;
        /* renamed from: e */
        private final String[] f60892e;
        /* renamed from: f */
        private final DSTZone f60893f;

        /* renamed from: f */
        public boolean m70356f() {
            return false;
        }

        /* renamed from: a */
        static org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone m70352a(java.io.DataInput r11, java.lang.String r12) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = r11.readUnsignedShort();
            r1 = new java.lang.String[r0];
            r2 = 0;
            r3 = 0;
        L_0x0008:
            if (r3 >= r0) goto L_0x0013;
        L_0x000a:
            r4 = r11.readUTF();
            r1[r3] = r4;
            r3 = r3 + 1;
            goto L_0x0008;
        L_0x0013:
            r3 = r11.readInt();
            r6 = new long[r3];
            r7 = new int[r3];
            r8 = new int[r3];
            r9 = new java.lang.String[r3];
        L_0x001f:
            if (r2 >= r3) goto L_0x0051;
        L_0x0021:
            r4 = org.joda.time.tz.DateTimeZoneBuilder.m69335a(r11);
            r6[r2] = r4;
            r4 = org.joda.time.tz.DateTimeZoneBuilder.m69335a(r11);
            r4 = (int) r4;
            r7[r2] = r4;
            r4 = org.joda.time.tz.DateTimeZoneBuilder.m69335a(r11);
            r4 = (int) r4;
            r8[r2] = r4;
            r4 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
            if (r0 >= r4) goto L_0x003e;
        L_0x0039:
            r4 = r11.readUnsignedByte();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0049 }
            goto L_0x0042;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0049 }
        L_0x003e:
            r4 = r11.readUnsignedShort();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0049 }
        L_0x0042:
            r4 = r1[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0049 }
            r9[r2] = r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0049 }
            r2 = r2 + 1;
            goto L_0x001f;
        L_0x0049:
            r11 = new java.io.IOException;
            r12 = "Invalid encoding";
            r11.<init>(r12);
            throw r11;
        L_0x0051:
            r0 = 0;
            r1 = r11.readBoolean();
            if (r1 == 0) goto L_0x005e;
        L_0x0058:
            r11 = org.joda.time.tz.DateTimeZoneBuilder.DSTZone.m70344a(r11, r12);
            r10 = r11;
            goto L_0x005f;
        L_0x005e:
            r10 = r0;
        L_0x005f:
            r11 = new org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone;
            r4 = r11;
            r5 = r12;
            r4.<init>(r5, r6, r7, r8, r9, r10);
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone.a(java.io.DataInput, java.lang.String):org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone");
        }

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.f60889b = jArr;
            this.f60890c = iArr;
            this.f60891d = iArr2;
            this.f60892e = strArr;
            this.f60893f = dSTZone;
        }

        /* renamed from: a */
        public String m70353a(long j) {
            long[] jArr = this.f60889b;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.f60892e[binarySearch];
            }
            binarySearch ^= -1;
            if (binarySearch < jArr.length) {
                return binarySearch > 0 ? this.f60892e[binarySearch - 1] : "UTC";
            } else {
                if (this.f60893f == null) {
                    return this.f60892e[binarySearch - 1];
                }
                return this.f60893f.m70346a(j);
            }
        }

        /* renamed from: b */
        public int m70354b(long j) {
            long[] jArr = this.f60889b;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.f60890c[binarySearch];
            }
            binarySearch ^= -1;
            if (binarySearch < jArr.length) {
                return binarySearch > 0 ? this.f60890c[binarySearch - 1] : 0;
            } else {
                if (this.f60893f == null) {
                    return this.f60890c[binarySearch - 1];
                }
                return this.f60893f.m70347b(j);
            }
        }

        /* renamed from: c */
        public int m70355c(long j) {
            long[] jArr = this.f60889b;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.f60891d[binarySearch];
            }
            binarySearch ^= -1;
            if (binarySearch < jArr.length) {
                return binarySearch > 0 ? this.f60891d[binarySearch - 1] : 0;
            } else {
                if (this.f60893f == null) {
                    return this.f60891d[binarySearch - 1];
                }
                return this.f60893f.m70348c(j);
            }
        }

        /* renamed from: g */
        public long m70357g(long j) {
            long[] jArr = this.f60889b;
            int binarySearch = Arrays.binarySearch(jArr, j);
            binarySearch = binarySearch >= 0 ? binarySearch + 1 : binarySearch ^ -1;
            if (binarySearch < jArr.length) {
                return jArr[binarySearch];
            }
            if (this.f60893f == null) {
                return j;
            }
            long j2 = jArr[jArr.length - 1];
            if (j < j2) {
                j = j2;
            }
            return this.f60893f.m70350g(j);
        }

        /* renamed from: h */
        public long m70358h(long j) {
            long[] jArr = this.f60889b;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return j > Long.MIN_VALUE ? j - 1 : j;
            } else {
                binarySearch ^= -1;
                long j2;
                if (binarySearch < jArr.length) {
                    if (binarySearch > 0) {
                        j2 = jArr[binarySearch - 1];
                        if (j2 > Long.MIN_VALUE) {
                            return j2 - 1;
                        }
                    }
                    return j;
                }
                if (this.f60893f != null) {
                    j2 = this.f60893f.m70351h(j);
                    if (j2 < j) {
                        return j2;
                    }
                }
                j2 = jArr[binarySearch - 1];
                return j2 > Long.MIN_VALUE ? j2 - 1 : j;
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (e().equals(precalculatedZone.e()) && Arrays.equals(this.f60889b, precalculatedZone.f60889b) && Arrays.equals(this.f60892e, precalculatedZone.f60892e) && Arrays.equals(this.f60890c, precalculatedZone.f60890c) && Arrays.equals(this.f60891d, precalculatedZone.f60891d)) {
                if (this.f60893f == null) {
                    if (precalculatedZone.f60893f == null) {
                        return z;
                    }
                } else if (this.f60893f.equals(precalculatedZone.f60893f) != null) {
                    return z;
                }
            }
            z = false;
            return z;
        }
    }

    /* renamed from: a */
    public static DateTimeZone m69337a(InputStream inputStream, String str) throws IOException {
        if (inputStream instanceof DataInput) {
            return m69336a((DataInput) inputStream, str);
        }
        return m69336a(new DataInputStream(inputStream), str);
    }

    /* renamed from: a */
    public static DateTimeZone m69336a(DataInput dataInput, String str) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return CachedDateTimeZone.m70335b(PrecalculatedZone.m70352a(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            DateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) m69335a(dataInput), (int) m69335a(dataInput));
            if (fixedDateTimeZone.equals(DateTimeZone.f8461a) != null) {
                fixedDateTimeZone = DateTimeZone.f8461a;
            }
            return fixedDateTimeZone;
        } else if (readUnsignedByte == 80) {
            return PrecalculatedZone.m70352a(dataInput, str);
        } else {
            throw new IOException("Invalid encoding");
        }
    }

    /* renamed from: a */
    static long m69335a(DataInput dataInput) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        switch (readUnsignedByte >> 6) {
            case 1:
                return ((long) (dataInput.readUnsignedByte() | ((((readUnsignedByte << 26) >> 2) | (dataInput.readUnsignedByte() << 16)) | (dataInput.readUnsignedByte() << 8)))) * 60000;
            case 2:
                return ((((((((long) readUnsignedByte) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24))) | ((long) (dataInput.readUnsignedByte() << 16))) | ((long) (dataInput.readUnsignedByte() << 8))) | ((long) dataInput.readUnsignedByte())) * 1000;
            case 3:
                return dataInput.readLong();
            default:
                return ((long) ((readUnsignedByte << 26) >> 26)) * 1800000;
        }
    }
}
