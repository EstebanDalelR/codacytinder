package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zy extends aat {
    /* renamed from: d */
    private static volatile po f23539d;
    /* renamed from: e */
    private static final Object f23540e = new Object();
    /* renamed from: f */
    private na f23541f = null;

    public zy(ub ubVar, String str, String str2, nx nxVar, int i, int i2, na naVar) {
        super(ubVar, str, str2, nxVar, i, 27);
        this.f23541f = naVar;
    }

    /* renamed from: c */
    private final java.lang.String m27516c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.a;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0 = r0.m20219l();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        if (r0 == 0) goto L_0x0011;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x0008:
        r0 = r2.a;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0 = r0.m20219l();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0.get();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x0011:
        r0 = r2.a;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0 = r0.m20218k();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        if (r0 == 0) goto L_0x0020;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x0019:
        r1 = r0.f26988n;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        if (r1 == 0) goto L_0x0020;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x001d:
        r0 = r0.f26988n;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        return r0;
    L_0x0020:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zy.c():java.lang.String");
    }

    /* renamed from: a */
    protected final void mo4165a() throws IllegalAccessException, InvocationTargetException {
        Object obj;
        Object obj2;
        String c;
        boolean z = false;
        if (!(f23539d == null || vk.m20257b(f23539d.f23414a) || f23539d.f23414a.equals("E"))) {
            if (!f23539d.f23414a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                obj = null;
                if (obj != null) {
                    synchronized (f23540e) {
                        po poVar;
                        na naVar = this.f23541f;
                        if (vk.m20257b(null)) {
                            obj2 = 4;
                        } else {
                            na naVar2 = this.f23541f;
                            vk.m20257b(null);
                            if (Boolean.valueOf(false).booleanValue()) {
                                if (this.a.m20216i()) {
                                    if (((Boolean) aja.m19221f().m19334a(alo.bB)).booleanValue()) {
                                        if (((Boolean) aja.m19221f().m19334a(alo.bC)).booleanValue()) {
                                            obj2 = 1;
                                            if (obj2 != null) {
                                                obj2 = 3;
                                            }
                                        }
                                    }
                                }
                                obj2 = null;
                                if (obj2 != null) {
                                    obj2 = 3;
                                }
                            }
                            obj2 = 2;
                        }
                        Method method = this.c;
                        Object[] objArr = new Object[2];
                        objArr[0] = this.a.m20204a();
                        if (obj2 == 2) {
                            z = true;
                        }
                        objArr[1] = Boolean.valueOf(z);
                        poVar = new po((String) method.invoke(null, objArr));
                        f23539d = poVar;
                        if (vk.m20257b(poVar.f23414a) || f23539d.f23414a.equals("E")) {
                            switch (obj2) {
                                case 3:
                                    c = m27516c();
                                    if (!vk.m20257b(c)) {
                                        f23539d.f23414a = c;
                                        break;
                                    }
                                    break;
                                case 4:
                                    f23539d.f23414a = null.f26944a;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                }
                synchronized (this.b) {
                    if (f23539d != null) {
                        this.b.f26988n = f23539d.f23414a;
                        this.b.f26994t = Long.valueOf(f23539d.f23415b);
                        this.b.f26993s = f23539d.f23416c;
                        this.b.f26953C = f23539d.f23417d;
                        this.b.f26954D = f23539d.f23418e;
                    }
                }
            }
        }
        obj = 1;
        if (obj != null) {
            synchronized (f23540e) {
                na naVar3 = this.f23541f;
                if (vk.m20257b(null)) {
                    na naVar22 = this.f23541f;
                    vk.m20257b(null);
                    if (Boolean.valueOf(false).booleanValue()) {
                        if (this.a.m20216i()) {
                            if (((Boolean) aja.m19221f().m19334a(alo.bB)).booleanValue()) {
                                if (((Boolean) aja.m19221f().m19334a(alo.bC)).booleanValue()) {
                                    obj2 = 1;
                                    if (obj2 != null) {
                                        obj2 = 3;
                                    }
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 != null) {
                            obj2 = 3;
                        }
                    }
                    obj2 = 2;
                } else {
                    obj2 = 4;
                }
                Method method2 = this.c;
                Object[] objArr2 = new Object[2];
                objArr2[0] = this.a.m20204a();
                if (obj2 == 2) {
                    z = true;
                }
                objArr2[1] = Boolean.valueOf(z);
                poVar = new po((String) method2.invoke(null, objArr2));
                f23539d = poVar;
                switch (obj2) {
                    case 3:
                        c = m27516c();
                        if (vk.m20257b(c)) {
                            f23539d.f23414a = c;
                            break;
                        }
                        break;
                    case 4:
                        f23539d.f23414a = null.f26944a;
                        break;
                    default:
                        break;
                }
            }
        }
        synchronized (this.b) {
            if (f23539d != null) {
                this.b.f26988n = f23539d.f23414a;
                this.b.f26994t = Long.valueOf(f23539d.f23415b);
                this.b.f26993s = f23539d.f23416c;
                this.b.f26953C = f23539d.f23417d;
                this.b.f26954D = f23539d.f23418e;
            }
        }
    }
}
