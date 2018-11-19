package android.arch.paging;

import android.arch.paging.C0054f.C0051c;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: android.arch.paging.l */
class C2707l<T> extends C0054f<T> {
    /* renamed from: h */
    private final boolean f8556h;
    /* renamed from: i */
    private final Object f8557i;
    /* renamed from: j */
    private final DataSource<?, T> f8558j;

    /* renamed from: a */
    void mo49a(int i) {
    }

    /* renamed from: a */
    void mo52a(@NonNull C0054f<T> c0054f, @NonNull C0051c c0051c) {
    }

    /* renamed from: d */
    public boolean mo73d() {
        return true;
    }

    /* renamed from: f */
    public boolean mo74f() {
        return true;
    }

    C2707l(@NonNull C0054f<T> c0054f) {
        super(c0054f.f129e.m203a(), c0054f.f125a, c0054f.f126b, null, c0054f.f128d);
        this.f8558j = c0054f.mo54b();
        this.f8556h = c0054f.mo53a();
        this.f8557i = c0054f.mo57c();
    }

    /* renamed from: a */
    boolean mo53a() {
        return this.f8556h;
    }

    @Nullable
    /* renamed from: c */
    public Object mo57c() {
        return this.f8557i;
    }

    @NonNull
    /* renamed from: b */
    public DataSource<?, T> mo54b() {
        return this.f8558j;
    }
}
