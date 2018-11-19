package com.google.android.m4b.maps.p108h;

import android.content.Context;
import android.os.Looper;
import com.google.android.m4b.maps.p108h.C5414d.C5409b;
import com.google.android.m4b.maps.p108h.C5414d.C5410c;
import com.google.android.m4b.maps.p108h.C5414d.C5411d;
import com.google.android.m4b.maps.p110j.C5441f;
import com.google.android.m4b.maps.p110j.C5455p;
import com.google.android.m4b.maps.p110j.C5462v;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.h.b */
public final class C5406b<O> {
    /* renamed from: a */
    private final C5402b<?, O> f20345a;
    /* renamed from: b */
    private final C5404d<?, O> f20346b = null;
    /* renamed from: c */
    private final C5403c<?> f20347c;
    /* renamed from: d */
    private final C5405e<?> f20348d;
    /* renamed from: e */
    private final ArrayList<C6690o> f20349e;
    /* renamed from: f */
    private final String f20350f;

    /* renamed from: com.google.android.m4b.maps.h.b$a */
    public interface C5401a {
        /* renamed from: a */
        void mo5428a(C5410c c5410c);

        /* renamed from: a */
        void mo5429a(C5455p c5455p);

        /* renamed from: a */
        void mo5430a(C5455p c5455p, Set<C6690o> set);

        /* renamed from: a */
        void mo5431a(String str, PrintWriter printWriter);

        /* renamed from: d */
        void mo5432d();

        /* renamed from: e */
        boolean mo5413e();

        /* renamed from: f */
        boolean mo5433f();
    }

    /* renamed from: com.google.android.m4b.maps.h.b$b */
    public interface C5402b<T extends C5401a, O> {
        /* renamed from: a */
        T mo5396a(Context context, Looper looper, C5441f c5441f, O o, C5409b c5409b, C5411d c5411d);
    }

    /* renamed from: com.google.android.m4b.maps.h.b$c */
    public static final class C5403c<C extends C5401a> {
    }

    /* renamed from: com.google.android.m4b.maps.h.b$d */
    public interface C5404d<T, O> {
    }

    /* renamed from: com.google.android.m4b.maps.h.b$e */
    public static final class C5405e<C> {
    }

    public <C extends C5401a> C5406b(String str, C5402b<C, O> c5402b, C5403c<C> c5403c, C6690o... c6690oArr) {
        C5462v.m23768a((Object) c5402b, (Object) "Cannot construct an Api with a null ClientBuilder");
        C5462v.m23768a((Object) c5403c, (Object) "Cannot construct an Api with a null ClientKey");
        this.f20350f = str;
        this.f20345a = c5402b;
        this.f20347c = c5403c;
        this.f20348d = null;
        this.f20349e = new ArrayList(Arrays.asList(c6690oArr));
    }

    /* renamed from: a */
    public final C5402b<?, O> m23602a() {
        C5462v.m23771a(this.f20345a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f20345a;
    }

    /* renamed from: b */
    public final List<C6690o> m23603b() {
        return this.f20349e;
    }

    /* renamed from: c */
    public final C5403c<?> m23604c() {
        C5462v.m23771a(this.f20347c != null, (Object) "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return this.f20347c;
    }

    /* renamed from: d */
    public final String m23605d() {
        return this.f20350f;
    }
}
