package com.tinder.fireboarding.p253a;

import android.content.SharedPreferences;
import com.f2prateek.rx.preferences.C1159e;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.fireboarding.domain.FireboardingEnabledRepository;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import java.util.concurrent.Callable;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/fireboarding/data/FireboardingEnabledSharedPreferenceRepository;", "Lcom/tinder/fireboarding/domain/FireboardingEnabledRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "rxSharedPreferences", "Lcom/f2prateek/rx/preferences/RxSharedPreferences;", "observe", "Lio/reactivex/Flowable;", "", "update", "Lio/reactivex/Completable;", "enabled", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.a.d */
public final class C11782d implements FireboardingEnabledRepository {
    /* renamed from: a */
    private final C1159e f38497a = C1159e.a(this.f38498b);
    /* renamed from: b */
    private final SharedPreferences f38498b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.a.d$a */
    static final class C9558a<V> implements Callable<Object> {
        /* renamed from: a */
        final /* synthetic */ C11782d f31951a;
        /* renamed from: b */
        final /* synthetic */ boolean f31952b;

        C9558a(C11782d c11782d, boolean z) {
            this.f31951a = c11782d;
            this.f31952b = z;
        }

        public /* synthetic */ Object call() {
            m39857a();
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m39857a() {
            this.f31951a.f38498b.edit().putBoolean("fireboarding_enabled", this.f31952b).apply();
        }
    }

    public C11782d(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f38498b = sharedPreferences;
    }

    @NotNull
    public C3956a update(boolean z) {
        z = C3956a.a(new C9558a(this, z));
        C2668g.a(z, "Completable.fromCallable…nabled).apply()\n        }");
        return z;
    }

    @NotNull
    public C3957b<Boolean> observe() {
        Observable c = this.f38497a.a("fireboarding_enabled", Boolean.valueOf(false)).c();
        C2668g.a(c, "rxSharedPreferences.getB…          .asObservable()");
        return RxJavaInteropExtKt.toV2Flowable(c);
    }
}
