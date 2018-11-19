package com.tinder.presenters;

import android.support.annotation.CallSuper;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.trello.rxlifecycle.C2662b;
import com.trello.rxlifecycle.LifecycleProvider;
import com.trello.rxlifecycle.LifecycleTransformer;
import com.trello.rxlifecycle.OutsideLifecycleException;
import java8.util.Optional;
import rx.Observable;
import rx.functions.Action1;
import rx.subjects.C19785a;

@Deprecated
public abstract class PresenterBase<T> implements LifecycleProvider<PresenterBase$LifecycleEvent> {
    @NonNull
    /* renamed from: a */
    private final C19785a<PresenterBase$LifecycleEvent> f12464a = C19785a.w();
    @NonNull
    /* renamed from: b */
    private Optional<T> f12465b = Optional.a();

    /* renamed from: b */
    final /* synthetic */ PresenterBase$LifecycleEvent m15095b(PresenterBase$LifecycleEvent presenterBase$LifecycleEvent) {
        return m15088c(presenterBase$LifecycleEvent);
    }

    @CheckResult
    @NonNull
    public /* synthetic */ LifecycleTransformer bindUntilEvent(@NonNull Object obj) {
        return m15091a((PresenterBase$LifecycleEvent) obj);
    }

    @CallSuper
    /* renamed from: a */
    public void m15093a(@NonNull T t) {
        this.f12465b = Optional.a(t);
        this.f12464a.onNext(PresenterBase$LifecycleEvent.TAKE_TARGET);
    }

    @CallSuper
    /* renamed from: a */
    public void mo3589a() {
        this.f12465b = Optional.a();
        this.f12464a.onNext(PresenterBase$LifecycleEvent.DROP_TARGET);
    }

    /* renamed from: G */
    public boolean m15089G() {
        return this.f12465b.c();
    }

    @Nullable
    /* renamed from: H */
    public T m15090H() {
        return this.f12465b.c(null);
    }

    /* renamed from: a */
    protected final void m15094a(Action1<T> action1) {
        if (m15089G()) {
            action1.call(this.f12465b.b());
        }
    }

    @CheckResult
    @NonNull
    public final Observable<PresenterBase$LifecycleEvent> lifecycle() {
        return this.f12464a.e();
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public final <E> LifecycleTransformer<E> m15091a(@NonNull PresenterBase$LifecycleEvent presenterBase$LifecycleEvent) {
        return C2662b.m10237a(this.f12464a, (Object) presenterBase$LifecycleEvent);
    }

    @CheckResult
    @NonNull
    public final <E> LifecycleTransformer<E> bindToLifecycle() {
        return C2662b.m10238a(this.f12464a, new gf(this));
    }

    @NonNull
    /* renamed from: c */
    private PresenterBase$LifecycleEvent m15088c(@NonNull PresenterBase$LifecycleEvent presenterBase$LifecycleEvent) {
        switch (PresenterBase$1.f45536a[presenterBase$LifecycleEvent.ordinal()]) {
            case 1:
                return PresenterBase$LifecycleEvent.DROP_TARGET;
            case 2:
                throw new OutsideLifecycleException("Cannot bind to Presenter lifecycle when outside of it.");
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Binding to ");
                stringBuilder.append(presenterBase$LifecycleEvent);
                stringBuilder.append(" not yet implemented");
                throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }
}
