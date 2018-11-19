package com.tinder.common.reactivex.p319a.p320a;

import com.tinder.common.reactivex.schedulers.Schedulers;
import io.reactivex.C15679f;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/common/reactivex/android/schedulers/AndroidSchedulers;", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "mainThread", "trampoline", "reactivex-android_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.reactivex.a.a.a */
public final class C10696a implements Schedulers {
    /* renamed from: a */
    public static final C10696a f35038a = new C10696a();

    private C10696a() {
    }

    @NotNull
    public C15679f io() {
        C15679f b = C15756a.b();
        C2668g.a(b, "io.reactivex.schedulers.Schedulers.io()");
        return b;
    }

    @NotNull
    public C15679f computation() {
        C15679f a = C15756a.a();
        C2668g.a(a, "io.reactivex.schedulers.Schedulers.computation()");
        return a;
    }

    @NotNull
    public C15679f trampoline() {
        C15679f c = C15756a.c();
        C2668g.a(c, "io.reactivex.schedulers.Schedulers.trampoline()");
        return c;
    }

    @NotNull
    public C15679f mainThread() {
        C15679f a = C15674a.a();
        C2668g.a(a, "io.reactivex.android.sch…idSchedulers.mainThread()");
        return a;
    }
}
