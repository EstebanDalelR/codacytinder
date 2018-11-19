package com.tinder.reactions.gestures.view;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.reactions.gestures.common.GestureEvent.State;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0004R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/reactions/gestures/view/GrandGestureAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "grandGestureStateSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/reactions/gestures/common/GestureEvent$State;", "kotlin.jvm.PlatformType", "dispatchGestureActivatedEvent", "", "getGrandGestureStateObservable", "Lrx/Observable;", "resetProgress", "tiggerIncorrectInteraction", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public class GrandGestureAnimationView extends LottieAnimationView {
    /* renamed from: a */
    private final PublishSubject<State> f58244a = PublishSubject.w();

    public GrandGestureAnimationView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    /* renamed from: i */
    public void mo14139i() {
        setProgress(0.0f);
    }

    /* renamed from: j */
    protected final void m67182j() {
        this.f58244a.onNext(State.GESTURE_INCORRECT_INTERACTION);
    }

    @NotNull
    public final Observable<State> getGrandGestureStateObservable() {
        Observable<State> e = this.f58244a.e();
        C2668g.a(e, "grandGestureStateSubject.asObservable()");
        return e;
    }

    /* renamed from: k */
    public final void m67183k() {
        this.f58244a.onNext(State.GESTURE_ACTIVATED);
    }
}
