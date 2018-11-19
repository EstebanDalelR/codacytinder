package retrofit.client;

/* renamed from: retrofit.client.b */
public final class C19368b {
    /* renamed from: a */
    private final String f60490a;
    /* renamed from: b */
    private final String f60491b;

    public C19368b(String str, String str2) {
        this.f60490a = str;
        this.f60491b = str2;
    }

    /* renamed from: a */
    public String m69544a() {
        return this.f60490a;
    }

    /* renamed from: b */
    public String m69545b() {
        return this.f60491b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x003d;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x003d;
    L_0x0012:
        r5 = (retrofit.client.C19368b) r5;
        r2 = r4.f60490a;
        if (r2 == 0) goto L_0x0023;
    L_0x0018:
        r2 = r4.f60490a;
        r3 = r5.f60490a;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0028;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r2 = r5.f60490a;
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4.f60491b;
        if (r2 == 0) goto L_0x0037;
    L_0x002c:
        r2 = r4.f60491b;
        r5 = r5.f60491b;
        r5 = r2.equals(r5);
        if (r5 != 0) goto L_0x003c;
    L_0x0036:
        goto L_0x003b;
    L_0x0037:
        r5 = r5.f60491b;
        if (r5 == 0) goto L_0x003c;
    L_0x003b:
        return r1;
    L_0x003c:
        return r0;
    L_0x003d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.client.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f60490a != null ? this.f60490a.hashCode() : 0) * 31;
        if (this.f60491b != null) {
            i = this.f60491b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f60490a != null ? this.f60490a : "");
        stringBuilder.append(": ");
        stringBuilder.append(this.f60491b != null ? this.f60491b : "");
        return stringBuilder.toString();
    }
}
