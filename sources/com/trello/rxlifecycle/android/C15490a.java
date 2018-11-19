package com.trello.rxlifecycle.android;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import com.trello.rxlifecycle.C2662b;
import com.trello.rxlifecycle.LifecycleTransformer;
import com.trello.rxlifecycle.OutsideLifecycleException;
import rx.Observable;
import rx.functions.Func1;

/* renamed from: com.trello.rxlifecycle.android.a */
public class C15490a {
    /* renamed from: a */
    private static final Func1<ActivityEvent, ActivityEvent> f47932a = new C183131();
    /* renamed from: b */
    private static final Func1<FragmentEvent, FragmentEvent> f47933b = new C183142();

    /* renamed from: com.trello.rxlifecycle.android.a$1 */
    static class C183131 implements Func1<ActivityEvent, ActivityEvent> {
        C183131() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m66306a((ActivityEvent) obj);
        }

        /* renamed from: a */
        public ActivityEvent m66306a(ActivityEvent activityEvent) {
            switch (activityEvent) {
                case CREATE:
                    return ActivityEvent.DESTROY;
                case START:
                    return ActivityEvent.STOP;
                case RESUME:
                    return ActivityEvent.PAUSE;
                case PAUSE:
                    return ActivityEvent.STOP;
                case STOP:
                    return ActivityEvent.DESTROY;
                case DESTROY:
                    throw new OutsideLifecycleException("Cannot bind to Activity lifecycle when outside of it.");
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Binding to ");
                    stringBuilder.append(activityEvent);
                    stringBuilder.append(" not yet implemented");
                    throw new UnsupportedOperationException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: com.trello.rxlifecycle.android.a$2 */
    static class C183142 implements Func1<FragmentEvent, FragmentEvent> {
        C183142() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m66307a((FragmentEvent) obj);
        }

        /* renamed from: a */
        public FragmentEvent m66307a(FragmentEvent fragmentEvent) {
            switch (fragmentEvent) {
                case ATTACH:
                    return FragmentEvent.DETACH;
                case CREATE:
                    return FragmentEvent.DESTROY;
                case CREATE_VIEW:
                    return FragmentEvent.DESTROY_VIEW;
                case START:
                    return FragmentEvent.STOP;
                case RESUME:
                    return FragmentEvent.PAUSE;
                case PAUSE:
                    return FragmentEvent.STOP;
                case STOP:
                    return FragmentEvent.DESTROY_VIEW;
                case DESTROY_VIEW:
                    return FragmentEvent.DESTROY;
                case DESTROY:
                    return FragmentEvent.DETACH;
                case DETACH:
                    throw new OutsideLifecycleException("Cannot bind to Fragment lifecycle when outside of it.");
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Binding to ");
                    stringBuilder.append(fragmentEvent);
                    stringBuilder.append(" not yet implemented");
                    throw new UnsupportedOperationException(stringBuilder.toString());
            }
        }
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public static <T> LifecycleTransformer<T> m57970a(@NonNull Observable<ActivityEvent> observable) {
        return C2662b.a(observable, f47932a);
    }
}
