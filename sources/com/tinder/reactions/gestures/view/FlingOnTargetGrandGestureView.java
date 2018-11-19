package com.tinder.reactions.gestures.view;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.reactions.gestures.common.FlingComponentPositionChangedListener;
import com.tinder.reactions.gestures.common.FlingInteractionEventListener;
import com.tinder.reactions.gestures.common.GestureEvent.State;
import com.tinder.reactions.p389d.C14618a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0014J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\u0006\u0010 \u001a\u00020\u000eJ\b\u0010!\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J \u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0016J \u0010'\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0016R2\u0010\t\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/tinder/reactions/gestures/view/FlingOnTargetGrandGestureView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/reactions/gestures/common/FlingComponentPositionChangedListener;", "Lcom/tinder/reactions/gestures/common/FlingInteractionEventListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "grandGestureStateSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/reactions/gestures/common/GestureEvent$State;", "kotlin.jvm.PlatformType", "changeTargetBackgroundScaleAndAlpha", "", "normalizedY", "", "dispatchGestureActivatedEvent", "dispatchIncorrectInteractionEvent", "getGrandGestureStateObservable", "Lrx/Observable;", "getTransformedViewAlpha", "originalValue", "getTransformedViewScaleFactor", "onAttachedToWindow", "setFlingComponentAnimation", "animationFile", "", "setFlingComponentAnimation$Tinder_release", "setScaleForTargetBackground", "scaleFactor", "setupTargetImageSwinging", "showTutorial", "verticalLimitNotReached", "verticalLimitReached", "verticalPositionChangedOnDrag", "currentY", "topYLimit", "bottomYLimit", "verticalPositionChangedOnGlide", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FlingOnTargetGrandGestureView extends FrameLayout implements FlingComponentPositionChangedListener, FlingInteractionEventListener {
    /* renamed from: a */
    private final PublishSubject<State> f50869a = PublishSubject.w();
    /* renamed from: b */
    private HashMap f50870b;

    /* renamed from: a */
    public View m61691a(int i) {
        if (this.f50870b == null) {
            this.f50870b = new HashMap();
        }
        View view = (View) this.f50870b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f50870b.put(Integer.valueOf(i), view);
        return view;
    }

    public FlingOnTargetGrandGestureView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.view_fling_on_target_grand_gesture, this);
        ((FlingableLottieAnimationView) m61691a(C6248a.flingableComponentView)).m67178a((FlingComponentPositionChangedListener) this);
        ((FlingableLottieAnimationView) m61691a(C6248a.flingableComponentView)).m67179a((FlingInteractionEventListener) this);
        setScaleForTargetBackground(0.9f);
    }

    @NotNull
    public final Observable<State> getGrandGestureStateObservable() {
        Observable<State> e = this.f50869a.e();
        C2668g.a(e, "grandGestureStateSubject.asObservable()");
        return e;
    }

    /* renamed from: a */
    public final void m61692a() {
        ((GrandGestureInstructionTextView) m61691a(C6248a.swipeUpInstruction)).m55908a();
    }

    public final void setFlingComponentAnimation$Tinder_release(@NotNull String str) {
        C2668g.b(str, "animationFile");
        ((FlingableLottieAnimationView) m61691a(C6248a.flingableComponentView)).setAnimation(str);
        ((FlingableLottieAnimationView) m61691a(C6248a.flingableComponentView)).b(true);
        ((FlingableLottieAnimationView) m61691a(C6248a.flingableComponentView)).m67180i();
        ((FlingableLottieAnimationView) m61691a(C6248a.flingableComponentView)).c();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m61690d();
    }

    public void verticalLimitNotReached() {
        m61689c();
    }

    public void verticalLimitReached() {
        m61687b();
    }

    public void verticalPositionChangedOnDrag(float f, float f2, float f3) {
        m61685a(C14618a.f46122a.m55772a(Math.abs(f), f2, f3));
    }

    public void verticalPositionChangedOnGlide(float f, float f2, float f3) {
        if (f <= f3) {
            m61685a(Math.abs(C14618a.f46122a.m55772a(Math.abs(f), f2, f3)));
        }
    }

    /* renamed from: b */
    private final void m61687b() {
        this.f50869a.onNext(State.GESTURE_ACTIVATED);
    }

    /* renamed from: c */
    private final void m61689c() {
        this.f50869a.onNext(State.GESTURE_INCORRECT_INTERACTION);
    }

    private final void setScaleForTargetBackground(float f) {
        FrameLayout frameLayout = (FrameLayout) m61691a(C6248a.targetBackgroundView);
        C2668g.a(frameLayout, "targetBackgroundView");
        frameLayout.setScaleX(f);
        frameLayout = (FrameLayout) m61691a(C6248a.targetBackgroundView);
        C2668g.a(frameLayout, "targetBackgroundView");
        frameLayout.setScaleY(f);
    }

    /* renamed from: d */
    private final void m61690d() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.swing_view_from_corner);
        C2668g.a(loadAnimation, "swingAnimation");
        loadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        ((CardView) m61691a(C6248a.targetMatchAvatar)).startAnimation(loadAnimation);
    }

    /* renamed from: a */
    private final void m61685a(float f) {
        f = Math.max(1.4f * f, f);
        float b = m61686b(f);
        if (b > 0.9f) {
            b = 0.9f;
        }
        setScaleForTargetBackground(b);
        f = m61688c(f);
        FrameLayout frameLayout = (FrameLayout) m61691a(C6248a.targetBackgroundView);
        C2668g.a(frameLayout, "targetBackgroundView");
        frameLayout.setAlpha(f);
    }

    /* renamed from: b */
    private final float m61686b(float f) {
        return C14618a.m55771a(C14618a.f46122a, f, 0.0f, 0.0f, 0.7f, 0.9f, 6, null);
    }

    /* renamed from: c */
    private final float m61688c(float f) {
        return C14618a.m55771a(C14618a.f46122a, f, 0.0f, 0.0f, 0.35f, 1.0f, 6, null);
    }
}
