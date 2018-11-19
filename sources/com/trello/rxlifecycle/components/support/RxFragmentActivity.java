package com.trello.rxlifecycle.components.support;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.trello.rxlifecycle.C2662b;
import com.trello.rxlifecycle.LifecycleProvider;
import com.trello.rxlifecycle.LifecycleTransformer;
import com.trello.rxlifecycle.android.ActivityEvent;
import com.trello.rxlifecycle.android.C15490a;
import rx.Observable;
import rx.subjects.C19785a;

public class RxFragmentActivity extends FragmentActivity implements LifecycleProvider<ActivityEvent> {
    /* renamed from: a */
    private final C19785a<ActivityEvent> f59897a = C19785a.w();

    @CheckResult
    @NonNull
    public /* synthetic */ LifecycleTransformer bindUntilEvent(@NonNull Object obj) {
        return m68574a((ActivityEvent) obj);
    }

    @CheckResult
    @NonNull
    public final Observable<ActivityEvent> lifecycle() {
        return this.f59897a.e();
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public final <T> LifecycleTransformer<T> m68574a(@NonNull ActivityEvent activityEvent) {
        return C2662b.a(this.f59897a, activityEvent);
    }

    @CheckResult
    @NonNull
    public final <T> LifecycleTransformer<T> bindToLifecycle() {
        return C15490a.m57970a(this.f59897a);
    }

    @CallSuper
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f59897a.onNext(ActivityEvent.CREATE);
    }

    @CallSuper
    protected void onStart() {
        super.onStart();
        this.f59897a.onNext(ActivityEvent.START);
    }

    @CallSuper
    protected void onResume() {
        super.onResume();
        this.f59897a.onNext(ActivityEvent.RESUME);
    }

    @CallSuper
    protected void onPause() {
        this.f59897a.onNext(ActivityEvent.PAUSE);
        super.onPause();
    }

    @CallSuper
    protected void onStop() {
        this.f59897a.onNext(ActivityEvent.STOP);
        super.onStop();
    }

    @CallSuper
    protected void onDestroy() {
        this.f59897a.onNext(ActivityEvent.DESTROY);
        super.onDestroy();
    }
}
