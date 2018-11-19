package org.joda.time.convert;

/* renamed from: org.joda.time.convert.d */
class C19313d {
    /* renamed from: a */
    private final Converter[] f60179a;
    /* renamed from: b */
    private C19312a[] f60180b = new C19312a[16];

    /* renamed from: org.joda.time.convert.d$a */
    static class C19312a {
        /* renamed from: a */
        final Class<?> f60177a;
        /* renamed from: b */
        final Converter f60178b;

        C19312a(Class<?> cls, Converter converter) {
            this.f60177a = cls;
            this.f60178b = converter;
        }
    }

    C19313d(Converter[] converterArr) {
        this.f60179a = converterArr;
    }

    /* renamed from: a */
    org.joda.time.convert.Converter m69072a(java.lang.Class<?> r10) throws java.lang.IllegalStateException {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r9 = this;
        r0 = r9.f60180b;
        r1 = r0.length;
        r2 = 0;
        if (r10 != 0) goto L_0x0007;
    L_0x0006:
        goto L_0x001d;
    L_0x0007:
        r3 = r10.hashCode();
        r4 = r1 + -1;
        r3 = r3 & r4;
    L_0x000e:
        r4 = r0[r3];
        if (r4 == 0) goto L_0x001f;
    L_0x0012:
        r5 = r4.f60177a;
        if (r5 != r10) goto L_0x0019;
    L_0x0016:
        r10 = r4.f60178b;
        return r10;
    L_0x0019:
        r3 = r3 + 1;
        if (r3 < r1) goto L_0x000e;
    L_0x001d:
        r3 = 0;
        goto L_0x000e;
    L_0x001f:
        r4 = org.joda.time.convert.C19313d.m69070a(r9, r10);
        r5 = new org.joda.time.convert.d$a;
        r5.<init>(r10, r4);
        r10 = r0.clone();
        r10 = (org.joda.time.convert.C19313d.C19312a[]) r10;
        r10[r3] = r5;
        r0 = 0;
    L_0x0031:
        if (r0 >= r1) goto L_0x003d;
    L_0x0033:
        r3 = r10[r0];
        if (r3 != 0) goto L_0x003a;
    L_0x0037:
        r9.f60180b = r10;
        return r4;
    L_0x003a:
        r0 = r0 + 1;
        goto L_0x0031;
    L_0x003d:
        r0 = r1 << 1;
        r3 = new org.joda.time.convert.C19313d.C19312a[r0];
        r5 = 0;
    L_0x0042:
        if (r5 >= r1) goto L_0x0061;
    L_0x0044:
        r6 = r10[r5];
        r7 = r6.f60177a;
        if (r7 != 0) goto L_0x004b;
    L_0x004a:
        goto L_0x005a;
    L_0x004b:
        r7 = r7.hashCode();
        r8 = r0 + -1;
        r7 = r7 & r8;
    L_0x0052:
        r8 = r3[r7];
        if (r8 == 0) goto L_0x005c;
    L_0x0056:
        r7 = r7 + 1;
        if (r7 < r0) goto L_0x0052;
    L_0x005a:
        r7 = 0;
        goto L_0x0052;
    L_0x005c:
        r3[r7] = r6;
        r5 = r5 + 1;
        goto L_0x0042;
    L_0x0061:
        r9.f60180b = r3;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.convert.d.a(java.lang.Class):org.joda.time.convert.Converter");
    }

    /* renamed from: a */
    int m69071a() {
        return this.f60179a.length;
    }

    /* renamed from: a */
    C19313d m69073a(int i, Converter[] converterArr) {
        Converter[] converterArr2 = this.f60179a;
        int length = converterArr2.length;
        if (i >= length) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = 0;
        if (converterArr != null) {
            converterArr[0] = converterArr2[i];
        }
        converterArr = new Converter[(length - 1)];
        int i3 = 0;
        while (i2 < length) {
            if (i2 != i) {
                int i4 = i3 + 1;
                converterArr[i3] = converterArr2[i2];
                i3 = i4;
            }
            i2++;
        }
        return new C19313d(converterArr);
    }

    /* renamed from: a */
    private static Converter m69070a(C19313d c19313d, Class<?> cls) {
        Converter[] converterArr = c19313d.f60179a;
        int length = converterArr.length;
        C19313d c19313d2 = c19313d;
        c19313d = length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Converter converter = converterArr[length];
            Class<?> supportedType = converter.getSupportedType();
            if (supportedType == cls) {
                return converter;
            }
            if (supportedType == null || !(cls == null || supportedType.isAssignableFrom(cls))) {
                c19313d = c19313d2.m69073a(length, null);
                converterArr = c19313d.f60179a;
                c19313d2 = c19313d;
                c19313d = converterArr.length;
            }
        }
        if (cls != null) {
            if (c19313d != null) {
                length = 0;
                if (c19313d == 1) {
                    return converterArr[0];
                }
                C19313d c19313d3 = c19313d2;
                int i = c19313d;
                while (true) {
                    c19313d--;
                    if (c19313d < null) {
                        break;
                    }
                    Class supportedType2 = converterArr[c19313d].getSupportedType();
                    C19313d c19313d4 = c19313d3;
                    int i2 = i;
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        } else if (i != c19313d && r0[i].getSupportedType().isAssignableFrom(supportedType2)) {
                            c19313d4 = c19313d4.m69073a(i, null);
                            converterArr = c19313d4.f60179a;
                            i2 = converterArr.length;
                            c19313d = i2 - 1;
                        }
                    }
                    i = i2;
                    c19313d3 = c19313d4;
                }
                if (i == 1) {
                    return converterArr[0];
                }
                c19313d = new StringBuilder();
                c19313d.append("Unable to find best converter for type \"");
                c19313d.append(cls.getName());
                c19313d.append("\" from remaining set: ");
                while (length < i) {
                    cls = converterArr[length];
                    Class supportedType3 = cls.getSupportedType();
                    c19313d.append(cls.getClass().getName());
                    c19313d.append('[');
                    if (supportedType3 == null) {
                        cls = null;
                    } else {
                        cls = supportedType3.getName();
                    }
                    c19313d.append(cls);
                    c19313d.append("], ");
                    length++;
                }
                throw new IllegalStateException(c19313d.toString());
            }
        }
        return null;
    }
}
