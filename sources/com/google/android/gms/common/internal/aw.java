package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.support.v4.util.C0546b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.tg;
import java.util.Collection;

public final class aw {
    /* renamed from: a */
    private Account f7621a;
    /* renamed from: b */
    private C0546b<Scope> f7622b;
    /* renamed from: c */
    private int f7623c = 0;
    /* renamed from: d */
    private String f7624d;
    /* renamed from: e */
    private String f7625e;
    /* renamed from: f */
    private tg f7626f = tg.f28809a;

    /* renamed from: a */
    public final av m9119a() {
        return new av(this.f7621a, this.f7622b, null, 0, null, this.f7624d, this.f7625e, this.f7626f);
    }

    /* renamed from: a */
    public final aw m9120a(Account account) {
        this.f7621a = account;
        return this;
    }

    /* renamed from: a */
    public final aw m9121a(String str) {
        this.f7624d = str;
        return this;
    }

    /* renamed from: a */
    public final aw m9122a(Collection<Scope> collection) {
        if (this.f7622b == null) {
            this.f7622b = new C0546b();
        }
        this.f7622b.addAll(collection);
        return this;
    }

    /* renamed from: b */
    public final aw m9123b(String str) {
        this.f7625e = str;
        return this;
    }
}
