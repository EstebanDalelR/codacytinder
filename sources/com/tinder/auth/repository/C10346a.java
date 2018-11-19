package com.tinder.auth.repository;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.f2prateek.rx.preferences2.C1163d;
import com.tinder.auth.model.C8286a;
import com.tinder.auth.model.C8291f;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3959e;
import io.reactivex.functions.Function3;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/auth/repository/AuthLedgerSharedPreferencesRepository;", "Lcom/tinder/auth/repository/AuthLedgerRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "debounceScheduler", "Lio/reactivex/Scheduler;", "(Landroid/content/SharedPreferences;Lio/reactivex/Scheduler;)V", "rxSharedPreferences", "Lcom/f2prateek/rx/preferences2/RxSharedPreferences;", "loadLedger", "Lio/reactivex/Flowable;", "Lcom/tinder/auth/model/AuthLedger;", "saveLedger", "Lio/reactivex/Completable;", "authLedger", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.repository.a */
public final class C10346a implements AuthLedgerRepository {
    /* renamed from: a */
    private final C1163d f33767a = C1163d.a(this.f33768b);
    /* renamed from: b */
    private final SharedPreferences f33768b;
    /* renamed from: c */
    private final C15679f f33769c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.repository.a$b */
    static final class C8295b<V> implements Callable<Object> {
        /* renamed from: a */
        final /* synthetic */ C10346a f29568a;
        /* renamed from: b */
        final /* synthetic */ C8286a f29569b;

        C8295b(C10346a c10346a, C8286a c8286a) {
            this.f29568a = c10346a;
            this.f29569b = c8286a;
        }

        public /* synthetic */ Object call() {
            m35389a();
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m35389a() {
            Editor edit = this.f29568a.f33768b.edit();
            edit.putBoolean("KEY_IS_NEW_USER", this.f29569b.m35361a());
            edit.putBoolean("KEY_EXISTING_USER_SMS_VALIDATION_REQUIRED", this.f29569b.m35362b().m35380a());
            edit.putBoolean("KEY_IS_SMS_VERIFICATION_DISMISSIBLE", this.f29569b.m35362b().m35381b());
            edit.apply();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/auth/model/AuthLedger;", "isNewUser", "", "smsValidationRequired", "isDimissable", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.repository.a$a */
    static final class C10345a<T1, T2, T3, R> implements Function3<Boolean, Boolean, Boolean, C8286a> {
        /* renamed from: a */
        public static final C10345a f33766a = new C10345a();

        C10345a() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
            return m42153a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
        }

        @NotNull
        /* renamed from: a */
        public final C8286a m42153a(boolean z, boolean z2, boolean z3) {
            return new C8286a(z, new C8291f(z2, z3));
        }
    }

    public C10346a(@NotNull SharedPreferences sharedPreferences, @NotNull C15679f c15679f) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        C2668g.b(c15679f, "debounceScheduler");
        this.f33768b = sharedPreferences;
        this.f33769c = c15679f;
    }

    @NotNull
    public C3957b<C8286a> loadLedger() {
        C3957b<C8286a> toFlowable = C3959e.combineLatest(this.f33767a.a("KEY_IS_NEW_USER", Boolean.valueOf(false)).asObservable(), this.f33767a.a("KEY_EXISTING_USER_SMS_VALIDATION_REQUIRED", Boolean.valueOf(false)).asObservable(), this.f33767a.a("KEY_IS_SMS_VERIFICATION_DISMISSIBLE", Boolean.valueOf(true)).asObservable(), C10345a.f33766a).debounce(500, TimeUnit.MILLISECONDS, this.f33769c).toFlowable(BackpressureStrategy.LATEST);
        C2668g.a(toFlowable, "Observable.combineLatest…kpressureStrategy.LATEST)");
        return toFlowable;
    }

    @NotNull
    public C3956a saveLedger(@NotNull C8286a c8286a) {
        C2668g.b(c8286a, "authLedger");
        c8286a = C3956a.a(new C8295b(this, c8286a));
        C2668g.a(c8286a, "Completable.fromCallable… editor.apply()\n        }");
        return c8286a;
    }
}
