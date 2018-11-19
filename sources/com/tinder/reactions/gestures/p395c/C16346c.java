package com.tinder.reactions.gestures.p395c;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.gestures.animation.GrandGestureAnimationListener;
import com.tinder.reactions.gestures.common.GestureEvent;
import com.tinder.reactions.gestures.common.GestureEvent.State;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/reactions/gestures/provider/GestureEventProvider;", "Lcom/tinder/reactions/gestures/animation/GrandGestureAnimationListener;", "()V", "gestureEventSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/reactions/gestures/common/GestureEvent;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "onGestureActivated", "", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "update", "gestureEvent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.gestures.c.c */
public final class C16346c implements GrandGestureAnimationListener {
    /* renamed from: a */
    private final PublishSubject<GestureEvent> f50845a = PublishSubject.w();

    public void onGestureActivated(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        m61655a(new GestureEvent(State.GESTURE_ACTIVATED, grandGestureType));
    }

    @NotNull
    /* renamed from: a */
    public final Observable<GestureEvent> m61656a() {
        Observable<GestureEvent> e = this.f50845a.e();
        C2668g.a(e, "gestureEventSubject.asObservable()");
        return e;
    }

    /* renamed from: a */
    private final void m61655a(GestureEvent gestureEvent) {
        this.f50845a.onNext(gestureEvent);
    }
}
