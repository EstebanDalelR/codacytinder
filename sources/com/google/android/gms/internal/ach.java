package com.google.android.gms.internal;

final class ach implements acy {
    /* renamed from: c */
    private static final acp f22887c = new aci();
    /* renamed from: a */
    private final acp f22888a;
    /* renamed from: b */
    private final zzfgu f22889b;

    public ach() {
        this(zzfgu.DYNAMIC);
    }

    private ach(acp acp, zzfgu zzfgu) {
        this.f22888a = (acp) abx.m18860a(acp, "messageInfoFactory");
        this.f22889b = (zzfgu) abx.m18860a(zzfgu, "mode");
    }

    private ach(zzfgu zzfgu) {
        this(new ack(abw.m27015a(), m27019a()), zzfgu);
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.acp m27019a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "com.google.protobuf.DescriptorMessageInfoFactory";	 Catch:{ Exception -> 0x0019 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0019 }
        r1 = "getInstance";	 Catch:{ Exception -> 0x0019 }
        r2 = 0;	 Catch:{ Exception -> 0x0019 }
        r3 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0019 }
        r0 = r0.getDeclaredMethod(r1, r3);	 Catch:{ Exception -> 0x0019 }
        r1 = 0;	 Catch:{ Exception -> 0x0019 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0019 }
        r0 = r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0019 }
        r0 = (com.google.android.gms.internal.acp) r0;	 Catch:{ Exception -> 0x0019 }
        return r0;
    L_0x0019:
        r0 = f22887c;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ach.a():com.google.android.gms.internal.acp");
    }

    /* renamed from: a */
    private static <T> acx<T> m27020a(Class<T> cls, aco aco) {
        if (zzffu.class.isAssignableFrom(cls)) {
            if (m27021a(aco)) {
                return acr.m27028a(cls, aco, acd.m18868b(), acz.m18892c(), abt.m18843a(), acn.m18870b());
            }
            return acr.m27028a(cls, aco, acd.m18868b(), acz.m18892c(), null, acn.m18870b());
        } else if (m27021a(aco)) {
            return acr.m27028a(cls, aco, acd.m18867a(), acz.m18888a(), abt.m18844b(), acn.m18869a());
        } else {
            return acr.m27028a(cls, aco, acd.m18867a(), acz.m18891b(), null, acn.m18869a());
        }
    }

    /* renamed from: a */
    private static boolean m27021a(aco aco) {
        return aco.mo4203a() == act.f15018a;
    }

    /* renamed from: b */
    private static <T> acx<T> m27022b(Class<T> cls, aco aco) {
        if (zzffu.class.isAssignableFrom(cls)) {
            if (m27021a(aco)) {
                return acr.m27029b(cls, aco, acd.m18868b(), acz.m18892c(), abt.m18843a(), acn.m18870b());
            }
            return acr.m27029b(cls, aco, acd.m18868b(), acz.m18892c(), null, acn.m18870b());
        } else if (m27021a(aco)) {
            return acr.m27029b(cls, aco, acd.m18867a(), acz.m18888a(), abt.m18844b(), acn.m18869a());
        } else {
            return acr.m27029b(cls, aco, acd.m18867a(), acz.m18891b(), null, acn.m18869a());
        }
    }

    /* renamed from: a */
    public final <T> acx<T> mo4200a(Class<T> cls) {
        acz.m18890a((Class) cls);
        aco b = this.f22888a.mo4197b(cls);
        if (b.mo4204b()) {
            adm c;
            abr a;
            if (zzffu.class.isAssignableFrom(cls)) {
                c = acz.m18892c();
                a = abt.m18843a();
            } else {
                c = acz.m18888a();
                a = abt.m18844b();
            }
            return acs.m27032a(cls, c, a, b.mo4205c());
        }
        switch (acj.f15015a[this.f22889b.ordinal()]) {
            case 1:
                return m27020a(cls, b);
            case 2:
                return m27022b(cls, b);
            default:
                return b.mo4206d() ? m27020a(cls, b) : m27022b(cls, b);
        }
    }
}
