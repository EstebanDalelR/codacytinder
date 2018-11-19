package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.b */
final /* synthetic */ class C2446b implements Comparator {
    /* renamed from: a */
    static final Comparator f7390a = new C2446b();

    private C2446b() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).zzagw().compareTo(((Scope) obj2).zzagw());
    }
}
