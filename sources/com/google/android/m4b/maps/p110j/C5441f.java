package com.google.android.m4b.maps.p110j;

import android.accounts.Account;
import android.view.View;
import com.google.android.m4b.maps.p108h.C5406b;
import com.google.android.m4b.maps.p108h.C6690o;
import com.google.android.m4b.maps.p121u.C5524d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.j.f */
public final class C5441f {
    /* renamed from: a */
    private final Account f20403a;
    /* renamed from: b */
    private final Set<C6690o> f20404b;
    /* renamed from: c */
    private final Set<C6690o> f20405c;
    /* renamed from: d */
    private final Map<C5406b<?>, C5440a> f20406d;
    /* renamed from: e */
    private final int f20407e;
    /* renamed from: f */
    private final View f20408f;
    /* renamed from: g */
    private final String f20409g;
    /* renamed from: h */
    private final String f20410h;
    /* renamed from: i */
    private final C5524d f20411i;
    /* renamed from: j */
    private Integer f20412j;

    /* renamed from: com.google.android.m4b.maps.j.f$a */
    public static final class C5440a {
        /* renamed from: a */
        public final Set<C6690o> f20401a;
        /* renamed from: b */
        public final boolean f20402b;
    }

    public C5441f(Account account, Collection<C6690o> collection, Map<C5406b<?>, C5440a> map, int i, View view, String str, String str2, C5524d c5524d) {
        this.f20403a = account;
        if (collection == null) {
            account = Collections.EMPTY_SET;
        } else {
            account = Collections.unmodifiableSet(new HashSet(collection));
        }
        this.f20404b = account;
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.f20406d = map;
        this.f20408f = view;
        this.f20407e = i;
        this.f20409g = str;
        this.f20410h = str2;
        this.f20411i = c5524d;
        account = new HashSet(this.f20404b);
        collection = this.f20406d.values().iterator();
        while (collection.hasNext() != null) {
            account.addAll(((C5440a) collection.next()).f20401a);
        }
        this.f20405c = Collections.unmodifiableSet(account);
    }

    @Deprecated
    /* renamed from: a */
    public final String m23663a() {
        return this.f20403a != null ? this.f20403a.name : null;
    }

    /* renamed from: b */
    public final Account m23665b() {
        return this.f20403a;
    }

    /* renamed from: c */
    public final Account m23666c() {
        return this.f20403a != null ? this.f20403a : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public final Set<C6690o> m23667d() {
        return this.f20404b;
    }

    /* renamed from: e */
    public final Set<C6690o> m23668e() {
        return this.f20405c;
    }

    /* renamed from: f */
    public final Map<C5406b<?>, C5440a> m23669f() {
        return this.f20406d;
    }

    /* renamed from: g */
    public final String m23670g() {
        return this.f20409g;
    }

    /* renamed from: h */
    public final String m23671h() {
        return this.f20410h;
    }

    /* renamed from: i */
    public final C5524d m23672i() {
        return this.f20411i;
    }

    /* renamed from: j */
    public final Integer m23673j() {
        return this.f20412j;
    }

    /* renamed from: a */
    public final void m23664a(Integer num) {
        this.f20412j = num;
    }
}
