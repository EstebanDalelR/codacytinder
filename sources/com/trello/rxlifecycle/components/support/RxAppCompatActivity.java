package com.trello.rxlifecycle.components.support;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.trello.rxlifecycle.C2662b;
import com.trello.rxlifecycle.LifecycleProvider;
import com.trello.rxlifecycle.LifecycleTransformer;
import com.trello.rxlifecycle.android.ActivityEvent;
import com.trello.rxlifecycle.android.C15490a;
import rx.Observable;
import rx.subjects.C19785a;

public class RxAppCompatActivity extends AppCompatActivity implements LifecycleProvider<ActivityEvent> {
    /* renamed from: a */
    private final C19785a<ActivityEvent> f59966a = C19785a.w();

    @CheckResult
    @NonNull
    public /* synthetic */ LifecycleTransformer bindUntilEvent(@NonNull Object obj) {
        return m68632a((ActivityEvent) obj);
    }

    @CheckResult
    @NonNull
    public final Observable<ActivityEvent> lifecycle() {
        return this.f59966a.e();
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public final <T> LifecycleTransformer<T> m68632a(@NonNull ActivityEvent activityEvent) {
        return C2662b.a(this.f59966a, activityEvent);
    }

    @CheckResult
    @NonNull
    public final <T> LifecycleTransformer<T> bindToLifecycle() {
        return C15490a.m57970a(this.f59966a);
    }

    @CallSuper
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f59966a.onNext(ActivityEvent.CREATE);
    }

    @CallSuper
    protected void onStart() {
        super.onStart();
        this.f59966a.onNext(ActivityEvent.START);
    }

    @CallSuper
    protected void onResume() {
        super.onResume();
        this.f59966a.onNext(ActivityEvent.RESUME);
    }

    @CallSuper
    protected void onPause() {
        this.f59966a.onNext(ActivityEvent.PAUSE);
        super.onPause();
    }

    @CallSuper
    protected void onStop() {
        this.f59966a.onNext(ActivityEvent.STOP);
        super.onStop();
    }

    @CallSuper
    protected void onDestroy() {
        this.f59966a.onNext(ActivityEvent.DESTROY);
        super.onDestroy();
    }
}
