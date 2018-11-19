package org.apache.commons.lang3.time;

import com.facebook.ads.internal.C1391d;
import com.foursquare.internal.util.C1948m;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import org.apache.commons.lang3.C15987b;
import org.apache.commons.lang3.C15991d;

/* renamed from: org.apache.commons.lang3.time.b */
public class C16004b {
    /* renamed from: a */
    static final Object f49761a = "y";
    /* renamed from: b */
    static final Object f49762b = "M";
    /* renamed from: c */
    static final Object f49763c = C1391d.f3780a;
    /* renamed from: d */
    static final Object f49764d = "H";
    /* renamed from: e */
    static final Object f49765e = C1948m.f5228a;
    /* renamed from: f */
    static final Object f49766f = "s";
    /* renamed from: g */
    static final Object f49767g = "S";

    /* renamed from: org.apache.commons.lang3.time.b$a */
    static class C16003a {
        /* renamed from: a */
        private final Object f49759a;
        /* renamed from: b */
        private int f49760b = 1;

        /* renamed from: a */
        static boolean m60757a(C16003a[] c16003aArr, Object obj) {
            for (C16003a c : c16003aArr) {
                if (c.m60760c() == obj) {
                    return 1;
                }
            }
            return false;
        }

        C16003a(Object obj) {
            this.f49759a = obj;
        }

        /* renamed from: a */
        void m60758a() {
            this.f49760b++;
        }

        /* renamed from: b */
        int m60759b() {
            return this.f49760b;
        }

        /* renamed from: c */
        Object m60760c() {
            return this.f49759a;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C16003a)) {
                return false;
            }
            C16003a c16003a = (C16003a) obj;
            if (this.f49759a.getClass() != c16003a.f49759a.getClass() || this.f49760b != c16003a.f49760b) {
                return false;
            }
            if (this.f49759a instanceof StringBuilder) {
                return this.f49759a.toString().equals(c16003a.f49759a.toString());
            }
            if (this.f49759a instanceof Number) {
                return this.f49759a.equals(c16003a.f49759a);
            }
            if (this.f49759a == c16003a.f49759a) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return this.f49759a.hashCode();
        }

        public String toString() {
            return C15987b.m60652a(this.f49759a.toString(), this.f49760b);
        }
    }

    /* renamed from: a */
    public static String m60761a(long j) {
        return C16004b.m60762a(j, "HH:mm:ss.SSS");
    }

    /* renamed from: a */
    public static String m60762a(long j, String str) {
        return C16004b.m60763a(j, str, true);
    }

    /* renamed from: a */
    public static String m60763a(long j, String str, boolean z) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        C15991d.m60740a(0, Format.OFFSET_SAMPLE_RELATIVE, j, "durationMillis must not be negative");
        C16003a[] a = C16004b.m60766a(str);
        if (C16003a.m60757a(a, f49763c)) {
            long j8 = j / 86400000;
            j2 = j - (86400000 * j8);
            j3 = j8;
        } else {
            j2 = j;
            j3 = 0;
        }
        if (C16003a.m60757a(a, f49764d)) {
            long j9 = j2 / 3600000;
            j2 -= 3600000 * j9;
            j4 = j9;
        } else {
            j4 = 0;
        }
        if (C16003a.m60757a(a, f49765e)) {
            j9 = j2 / 60000;
            j2 -= 60000 * j9;
            j5 = j9;
        } else {
            j5 = 0;
        }
        if (C16003a.m60757a(a, f49766f)) {
            long j10 = j2 / 1000;
            j6 = j10;
            j7 = j2 - (1000 * j10);
        } else {
            j6 = 0;
            j7 = j2;
        }
        return C16004b.m60765a(a, 0, 0, j3, j4, j5, j6, j7, z);
    }

    /* renamed from: a */
    static String m60765a(C16003a[] c16003aArr, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        C16003a[] c16003aArr2 = c16003aArr;
        long j8 = j7;
        boolean z2 = z;
        StringBuilder stringBuilder = new StringBuilder();
        int length = c16003aArr2.length;
        int i = 0;
        Object obj = null;
        while (i < length) {
            int i2;
            int i3;
            long j9;
            C16003a c16003a = c16003aArr2[i];
            Object c = c16003a.m60760c();
            int b = c16003a.m60759b();
            long j10;
            if (c instanceof StringBuilder) {
                stringBuilder.append(c.toString());
                j10 = j3;
                i2 = length;
                i3 = i;
            } else {
                if (c.equals(f49761a)) {
                    stringBuilder.append(C16004b.m60764a(j, z2, b));
                    j10 = j3;
                    i2 = length;
                    i3 = i;
                } else {
                    long j11 = j;
                    if (c.equals(f49762b)) {
                        i3 = i;
                        stringBuilder.append(C16004b.m60764a(j2, z2, b));
                        j10 = j3;
                    } else {
                        i3 = i;
                        long j12 = j2;
                        if (c.equals(f49763c)) {
                            stringBuilder.append(C16004b.m60764a(j3, z2, b));
                        } else {
                            j10 = j3;
                            if (c.equals(f49764d)) {
                                i2 = length;
                                stringBuilder.append(C16004b.m60764a(j4, z2, b));
                            } else {
                                i2 = length;
                                j9 = j4;
                                if (c.equals(f49765e)) {
                                    stringBuilder.append(C16004b.m60764a(j5, z2, b));
                                } else {
                                    j9 = j5;
                                    if (c.equals(f49766f)) {
                                        stringBuilder.append(C16004b.m60764a(j6, z2, b));
                                        obj = 1;
                                    } else {
                                        j9 = j6;
                                        if (c.equals(f49767g)) {
                                            if (obj != null) {
                                                i = 3;
                                                if (z2) {
                                                    i = Math.max(3, b);
                                                }
                                                stringBuilder.append(C16004b.m60764a(j8, true, i));
                                            } else {
                                                stringBuilder.append(C16004b.m60764a(j8, z2, b));
                                            }
                                            obj = null;
                                        }
                                    }
                                    i = i3 + 1;
                                    length = i2;
                                }
                            }
                            j9 = j6;
                            obj = null;
                            i = i3 + 1;
                            length = i2;
                        }
                    }
                    i2 = length;
                }
                obj = null;
            }
            j9 = j6;
            i = i3 + 1;
            length = i2;
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m60764a(long j, boolean z, int i) {
        String l = Long.toString(j);
        return z ? C15987b.m60653a(l, i, '0') : l;
    }

    /* renamed from: a */
    static C16003a[] m60766a(String str) {
        ArrayList arrayList = new ArrayList(str.length());
        StringBuilder stringBuilder = null;
        C16003a c16003a = stringBuilder;
        Object obj = null;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (obj == null || charAt == '\'') {
                Object obj2;
                if (charAt != '\'') {
                    if (charAt == 'H') {
                        obj2 = f49764d;
                    } else if (charAt == 'M') {
                        obj2 = f49762b;
                    } else if (charAt == 'S') {
                        obj2 = f49767g;
                    } else if (charAt == 'd') {
                        obj2 = f49763c;
                    } else if (charAt == 'm') {
                        obj2 = f49765e;
                    } else if (charAt == 's') {
                        obj2 = f49766f;
                    } else if (charAt != 'y') {
                        if (stringBuilder == null) {
                            stringBuilder = new StringBuilder();
                            arrayList.add(new C16003a(stringBuilder));
                        }
                        stringBuilder.append(charAt);
                        obj2 = null;
                    } else {
                        obj2 = f49761a;
                    }
                } else if (obj != null) {
                    stringBuilder = null;
                    obj2 = stringBuilder;
                    obj = null;
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    arrayList.add(new C16003a(stringBuilder2));
                    obj2 = null;
                    stringBuilder = stringBuilder2;
                    obj = 1;
                }
                if (obj2 != null) {
                    if (c16003a == null || !c16003a.m60760c().equals(obj2)) {
                        c16003a = new C16003a(obj2);
                        arrayList.add(c16003a);
                    } else {
                        c16003a.m60758a();
                    }
                    stringBuilder = null;
                }
            } else {
                stringBuilder.append(charAt);
            }
        }
        if (obj == null) {
            return (C16003a[]) arrayList.toArray(new C16003a[arrayList.size()]);
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Unmatched quote in format: ");
        stringBuilder3.append(str);
        throw new IllegalArgumentException(stringBuilder3.toString());
    }
}
