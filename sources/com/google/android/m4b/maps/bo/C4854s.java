package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.be.C4778f;
import java.io.DataInput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bo.s */
public final class C4854s {
    /* renamed from: a */
    private static final av f17828a = new av(null, null, -1);
    /* renamed from: b */
    private final List<C4853a> f17829b;
    /* renamed from: c */
    private final C4838b f17830c;
    /* renamed from: d */
    private final String f17831d;

    /* renamed from: com.google.android.m4b.maps.bo.s$a */
    public static class C4853a {
        /* renamed from: a */
        private final int f17819a;
        /* renamed from: b */
        private final String f17820b;
        /* renamed from: c */
        private final int f17821c;
        /* renamed from: d */
        private final float f17822d;
        /* renamed from: e */
        private final String f17823e;
        /* renamed from: f */
        private final as f17824f;
        /* renamed from: g */
        private final int f17825g;
        /* renamed from: h */
        private final String f17826h;
        /* renamed from: i */
        private final float f17827i;

        public C4853a(int i, String str, int i2, String str2, as asVar, int i3, String str3, float f) {
            this.f17819a = i;
            this.f17820b = str;
            this.f17821c = i2;
            this.f17822d = 1065353216 / ((float) i2);
            this.f17823e = str2;
            this.f17824f = asVar;
            this.f17825g = i3;
            this.f17826h = str3;
            this.f17827i = f;
        }

        /* renamed from: a */
        public static void m21762a(DataInput dataInput, bc bcVar, av avVar, List<C4853a> list) {
            String intern;
            int readUnsignedByte;
            av a;
            int b;
            String str;
            float a2;
            List<C4853a> list2 = list;
            int readUnsignedByte2 = dataInput.readUnsignedByte();
            String str2 = null;
            if (ac.m21434a(readUnsignedByte2, 1) && bcVar.m21629a() == 10) {
                intern = dataInput.readUTF().intern();
                readUnsignedByte = dataInput.readUnsignedByte();
            } else {
                intern = null;
                readUnsignedByte = 1;
            }
            if (ac.m21434a(readUnsignedByte2, 2)) {
                str2 = C4778f.m21165a(dataInput.readUTF()).intern();
            }
            String str3 = str2;
            if (ac.m21434a(readUnsignedByte2, 4)) {
                a = av.m21574a(dataInput, bcVar);
            } else if (C4853a.m21763a(readUnsignedByte2)) {
                a = avVar;
            } else {
                a = C4854s.f17828a;
            }
            if (bcVar.m21629a() != 10 && ac.m21434a(readUnsignedByte2, 1)) {
                as a3 = a.m21575a();
                if (a3.m21564h()) {
                    C4850n l = a3.m21568l();
                    intern = l.m21758a();
                    b = l.m21759b();
                    str = intern;
                    a2 = ac.m21434a(readUnsignedByte2, 16) ? ((float) bl.m21698a(dataInput)) / 8.0f : 0.0f;
                    if (ac.m21434a(readUnsignedByte2, 32)) {
                        bl.m21698a(dataInput);
                    }
                    if (ac.m21434a(readUnsignedByte2, 8) || readUnsignedByte2 == 8) {
                        list2.add(new C4853a(readUnsignedByte2, str, b, str3, a.m21575a(), a.m21577c(), a.m21576b(), a2));
                    }
                    list2.add(new C4853a(readUnsignedByte2 ^ 8, str, b, str3, a.m21575a(), a.m21577c(), a.m21576b(), a2));
                    list2.add(new C4853a(8, null, 1, null, null, -1, null, -1.0f));
                    return;
                }
            }
            str = intern;
            b = readUnsignedByte;
            if (ac.m21434a(readUnsignedByte2, 16)) {
            }
            if (ac.m21434a(readUnsignedByte2, 32)) {
                bl.m21698a(dataInput);
            }
            if (ac.m21434a(readUnsignedByte2, 8)) {
            }
            list2.add(new C4853a(readUnsignedByte2, str, b, str3, a.m21575a(), a.m21577c(), a.m21576b(), a2));
        }

        /* renamed from: a */
        public final boolean m21764a() {
            return C4853a.m21763a(this.f17819a);
        }

        /* renamed from: b */
        public final boolean m21765b() {
            return ac.m21434a(this.f17819a, 1);
        }

        /* renamed from: c */
        public final boolean m21766c() {
            return ac.m21434a(this.f17819a, 2);
        }

        /* renamed from: d */
        public final boolean m21767d() {
            return ac.m21434a(this.f17819a, 4);
        }

        /* renamed from: e */
        public final boolean m21768e() {
            return ac.m21434a(this.f17819a, 16);
        }

        /* renamed from: f */
        public final boolean m21769f() {
            return ac.m21434a(this.f17819a, 8);
        }

        /* renamed from: g */
        public final String m21770g() {
            return this.f17820b;
        }

        /* renamed from: h */
        public final float m21771h() {
            return this.f17822d;
        }

        /* renamed from: i */
        public final String m21772i() {
            return this.f17823e;
        }

        /* renamed from: j */
        public final as m21773j() {
            return this.f17824f;
        }

        /* renamed from: k */
        public final float m21774k() {
            return this.f17827i;
        }

        public final int hashCode() {
            int i = 0;
            int floatToIntBits = (((((((((((this.f17819a + 31) * 31) + Float.floatToIntBits(this.f17827i)) * 31) + (this.f17820b == null ? 0 : this.f17820b.hashCode())) * 31) + (this.f17824f == null ? 0 : this.f17824f.hashCode())) * 31) + (this.f17826h == null ? 0 : this.f17826h.hashCode())) * 31) + Float.floatToIntBits((float) this.f17821c)) * 31;
            if (this.f17823e != null) {
                i = this.f17823e.hashCode();
            }
            return floatToIntBits + i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4853a c4853a = (C4853a) obj;
            if (this.f17819a != c4853a.f17819a || Float.floatToIntBits(this.f17827i) != Float.floatToIntBits(c4853a.f17827i)) {
                return false;
            }
            if (this.f17820b == null) {
                if (c4853a.f17820b != null) {
                    return false;
                }
            } else if (!this.f17820b.equals(c4853a.f17820b)) {
                return false;
            }
            if (this.f17824f == null) {
                if (c4853a.f17824f != null) {
                    return false;
                }
            } else if (!this.f17824f.equals(c4853a.f17824f)) {
                return false;
            }
            if (this.f17826h == null) {
                if (c4853a.f17826h != null) {
                    return false;
                }
            } else if (!this.f17826h.equals(c4853a.f17826h)) {
                return false;
            }
            if (Float.floatToIntBits((float) this.f17821c) != Float.floatToIntBits((float) c4853a.f17821c)) {
                return false;
            }
            if (this.f17823e == null) {
                return c4853a.f17823e == null;
            } else {
                return this.f17823e.equals(c4853a.f17823e);
            }
        }

        /* renamed from: l */
        public final int m21775l() {
            return (((ac.m21432a(this.f17820b) + 24) + ac.m21432a(this.f17823e)) + ac.m21432a(this.f17826h)) + ac.m21430a(this.f17824f);
        }

        /* renamed from: a */
        private static boolean m21763a(int i) {
            return ac.m21434a(i, 2) && ac.m21434a(i, 1) == 0;
        }
    }

    public C4854s(List<C4853a> list, C4838b c4838b) {
        StringBuilder stringBuilder = new StringBuilder();
        for (C4853a c4853a : list) {
            if (c4853a.m21766c()) {
                stringBuilder.append(c4853a.m21772i());
            }
            if (c4853a.m21769f()) {
                stringBuilder.append('\n');
            }
        }
        this.f17831d = stringBuilder.toString();
        this.f17830c = c4838b;
        this.f17829b = list;
    }

    /* renamed from: a */
    public static C4854s m21776a(DataInput dataInput, bc bcVar, av avVar) {
        int a = bl.m21698a(dataInput);
        List arrayList = new ArrayList();
        for (int i = 0; i < a; i++) {
            C4853a.m21762a(dataInput, bcVar, avVar, arrayList);
        }
        if (a > 1) {
            dataInput = C4838b.m21599a(dataInput);
        } else {
            dataInput = C4838b.f17701b;
        }
        return new C4854s(arrayList, dataInput);
    }

    /* renamed from: a */
    public final String m21779a() {
        return this.f17831d;
    }

    /* renamed from: b */
    public final int m21780b() {
        return this.f17829b.size();
    }

    /* renamed from: a */
    public final C4853a m21778a(int i) {
        return (C4853a) this.f17829b.get(i);
    }

    /* renamed from: c */
    public final C4838b m21781c() {
        return this.f17830c;
    }

    public final int hashCode() {
        return (((this.f17830c == null ? 0 : this.f17830c.hashCode()) + 31) * 31) + this.f17829b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4854s c4854s = (C4854s) obj;
        if (this.f17830c == null) {
            if (c4854s.f17830c != null) {
                return false;
            }
        } else if (!this.f17830c.equals(c4854s.f17830c)) {
            return false;
        }
        return this.f17829b.equals(c4854s.f17829b);
    }

    /* renamed from: d */
    public final int m21782d() {
        int i = 0;
        for (C4853a l : this.f17829b) {
            i += l.m21775l();
        }
        return ((i + 24) + ac.m21432a(this.f17831d)) + C4838b.m21600c();
    }
}
