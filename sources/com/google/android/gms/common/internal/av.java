package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.C2464a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.tg;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class av {
    /* renamed from: a */
    private final Account f7611a;
    /* renamed from: b */
    private final Set<Scope> f7612b;
    /* renamed from: c */
    private final Set<Scope> f7613c;
    /* renamed from: d */
    private final Map<Api<?>, ax> f7614d;
    /* renamed from: e */
    private final int f7615e;
    /* renamed from: f */
    private final View f7616f;
    /* renamed from: g */
    private final String f7617g;
    /* renamed from: h */
    private final String f7618h;
    /* renamed from: i */
    private final tg f7619i;
    /* renamed from: j */
    private Integer f7620j;

    public av(Account account, Set<Scope> set, Map<Api<?>, ax> map, int i, View view, String str, String str2, tg tgVar) {
        Map map2;
        this.f7611a = account;
        this.f7612b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map2 = Collections.EMPTY_MAP;
        }
        this.f7614d = map2;
        this.f7616f = view;
        this.f7615e = i;
        this.f7617g = str;
        this.f7618h = str2;
        this.f7619i = tgVar;
        Set hashSet = new HashSet(this.f7612b);
        for (ax axVar : this.f7614d.values()) {
            hashSet.addAll(axVar.f7627a);
        }
        this.f7613c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public static av m9106a(Context context) {
        return new C2464a(context).m8859a();
    }

    @Deprecated
    /* renamed from: a */
    public final String m9107a() {
        return this.f7611a != null ? this.f7611a.name : null;
    }

    /* renamed from: a */
    public final Set<Scope> m9108a(Api<?> api) {
        ax axVar = (ax) this.f7614d.get(api);
        if (axVar != null) {
            if (!axVar.f7627a.isEmpty()) {
                Set<Scope> hashSet = new HashSet(this.f7612b);
                hashSet.addAll(axVar.f7627a);
                return hashSet;
            }
        }
        return this.f7612b;
    }

    /* renamed from: a */
    public final void m9109a(Integer num) {
        this.f7620j = num;
    }

    /* renamed from: b */
    public final Account m9110b() {
        return this.f7611a;
    }

    /* renamed from: c */
    public final Account m9111c() {
        return this.f7611a != null ? this.f7611a : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public final Set<Scope> m9112d() {
        return this.f7612b;
    }

    /* renamed from: e */
    public final Set<Scope> m9113e() {
        return this.f7613c;
    }

    /* renamed from: f */
    public final Map<Api<?>, ax> m9114f() {
        return this.f7614d;
    }

    /* renamed from: g */
    public final String m9115g() {
        return this.f7617g;
    }

    /* renamed from: h */
    public final String m9116h() {
        return this.f7618h;
    }

    /* renamed from: i */
    public final tg m9117i() {
        return this.f7619i;
    }

    /* renamed from: j */
    public final Integer m9118j() {
        return this.f7620j;
    }
}
