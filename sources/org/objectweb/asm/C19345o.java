package org.objectweb.asm;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;

/* renamed from: org.objectweb.asm.o */
final class C19345o {
    /* renamed from: a */
    int f60365a;
    /* renamed from: b */
    int f60366b;
    /* renamed from: c */
    int f60367c;
    /* renamed from: d */
    long f60368d;
    /* renamed from: e */
    String f60369e;
    /* renamed from: f */
    String f60370f;
    /* renamed from: g */
    String f60371g;
    /* renamed from: h */
    int f60372h;
    /* renamed from: i */
    C19345o f60373i;

    C19345o() {
    }

    C19345o(int i) {
        this.f60365a = i;
    }

    C19345o(int i, C19345o c19345o) {
        this.f60365a = i;
        this.f60366b = c19345o.f60366b;
        this.f60367c = c19345o.f60367c;
        this.f60368d = c19345o.f60368d;
        this.f60369e = c19345o.f60369e;
        this.f60370f = c19345o.f60370f;
        this.f60371g = c19345o.f60371g;
        this.f60372h = c19345o.f60372h;
    }

    /* renamed from: a */
    void m69416a(double d) {
        this.f60366b = 6;
        this.f60368d = Double.doubleToRawLongBits(d);
        this.f60372h = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED & (this.f60366b + ((int) d));
    }

    /* renamed from: a */
    void m69417a(float f) {
        this.f60366b = 4;
        this.f60367c = Float.floatToRawIntBits(f);
        this.f60372h = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED & (this.f60366b + ((int) f));
    }

    /* renamed from: a */
    void m69418a(int i) {
        this.f60366b = 3;
        this.f60367c = i;
        this.f60372h = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED & (this.f60366b + i);
    }

    /* renamed from: a */
    void m69419a(int i, int i2) {
        this.f60366b = 33;
        this.f60367c = i;
        this.f60372h = i2;
    }

    /* renamed from: a */
    void m69420a(int i, String str, String str2, String str3) {
        int hashCode;
        this.f60366b = i;
        this.f60369e = str;
        this.f60370f = str2;
        this.f60371g = str3;
        if (i != 1) {
            int hashCode2;
            if (i != 12) {
                if (!(i == 16 || i == 30)) {
                    switch (i) {
                        case 7:
                            this.f60367c = 0;
                            break;
                        case 8:
                            break;
                        default:
                            hashCode = str.hashCode() * str2.hashCode();
                            hashCode2 = str3.hashCode();
                            break;
                    }
                }
            }
            hashCode = str.hashCode();
            hashCode2 = str2.hashCode();
            hashCode *= hashCode2;
            this.f60372h = (i + hashCode) & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        hashCode = str.hashCode();
        this.f60372h = (i + hashCode) & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: a */
    void m69421a(long j) {
        this.f60366b = 5;
        this.f60368d = j;
        this.f60372h = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED & (this.f60366b + ((int) j));
    }

    /* renamed from: a */
    void m69422a(String str, String str2, int i) {
        this.f60366b = 18;
        this.f60368d = (long) i;
        this.f60369e = str;
        this.f60370f = str2;
        this.f60372h = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED & (((i * this.f60369e.hashCode()) * this.f60370f.hashCode()) + 18);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    boolean m69423a(org.objectweb.asm.C19345o r9) {
        /*
        r8 = this;
        r0 = r8.f60366b;
        r1 = 1;
        if (r0 == r1) goto L_0x0096;
    L_0x0005:
        r2 = 12;
        r3 = 0;
        if (r0 == r2) goto L_0x007f;
    L_0x000a:
        r2 = 16;
        if (r0 == r2) goto L_0x0096;
    L_0x000e:
        r2 = 18;
        if (r0 == r2) goto L_0x0060;
    L_0x0012:
        switch(r0) {
            case 3: goto L_0x0057;
            case 4: goto L_0x0057;
            case 5: goto L_0x004c;
            case 6: goto L_0x004c;
            case 7: goto L_0x0096;
            case 8: goto L_0x0096;
            default: goto L_0x0015;
        };
    L_0x0015:
        switch(r0) {
            case 30: goto L_0x0096;
            case 31: goto L_0x0039;
            case 32: goto L_0x004c;
            default: goto L_0x0018;
        };
    L_0x0018:
        r0 = r9.f60369e;
        r2 = r8.f60369e;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x0022:
        r0 = r9.f60370f;
        r2 = r8.f60370f;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0037;
    L_0x002c:
        r9 = r9.f60371g;
        r0 = r8.f60371g;
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x0037;
    L_0x0036:
        return r1;
    L_0x0037:
        r1 = 0;
        return r1;
    L_0x0039:
        r0 = r9.f60367c;
        r2 = r8.f60367c;
        if (r0 != r2) goto L_0x004a;
    L_0x003f:
        r9 = r9.f60369e;
        r0 = r8.f60369e;
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x004a;
    L_0x0049:
        return r1;
    L_0x004a:
        r1 = 0;
        return r1;
    L_0x004c:
        r4 = r9.f60368d;
        r6 = r8.f60368d;
        r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r9 != 0) goto L_0x0055;
    L_0x0054:
        return r1;
    L_0x0055:
        r1 = 0;
        return r1;
    L_0x0057:
        r9 = r9.f60367c;
        r0 = r8.f60367c;
        if (r9 != r0) goto L_0x005e;
    L_0x005d:
        return r1;
    L_0x005e:
        r1 = 0;
        return r1;
    L_0x0060:
        r4 = r9.f60368d;
        r6 = r8.f60368d;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x007d;
    L_0x0068:
        r0 = r9.f60369e;
        r2 = r8.f60369e;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x007d;
    L_0x0072:
        r9 = r9.f60370f;
        r0 = r8.f60370f;
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x007d;
    L_0x007c:
        return r1;
    L_0x007d:
        r1 = 0;
        return r1;
    L_0x007f:
        r0 = r9.f60369e;
        r2 = r8.f60369e;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0094;
    L_0x0089:
        r9 = r9.f60370f;
        r0 = r8.f60370f;
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x0094;
    L_0x0093:
        return r1;
    L_0x0094:
        r1 = 0;
        return r1;
    L_0x0096:
        r9 = r9.f60369e;
        r0 = r8.f60369e;
        r9 = r9.equals(r0);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.o.a(org.objectweb.asm.o):boolean");
    }
}
