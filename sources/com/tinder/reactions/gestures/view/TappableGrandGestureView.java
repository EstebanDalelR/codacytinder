package com.tinder.reactions.gestures.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.C6250b.C6248a;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.gestures.common.GestureEvent.State;
import com.tinder.utils.av;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tinder/reactions/gestures/view/TappableGrandGestureView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backgroundType", "", "tappableAnimationView", "Lcom/tinder/reactions/gestures/view/GrandGestureAnimationView;", "getTappableAnimationView$Tinder_release", "()Lcom/tinder/reactions/gestures/view/GrandGestureAnimationView;", "setTappableAnimationView$Tinder_release", "(Lcom/tinder/reactions/gestures/view/GrandGestureAnimationView;)V", "adjustMargins", "", "getGrandGestureStateObservable", "Lrx/Observable;", "Lcom/tinder/reactions/gestures/common/GestureEvent$State;", "onFinishInflate", "setNewTopMargin", "view", "Landroid/view/View;", "newMargin", "BackgroundType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappableGrandGestureView extends FrameLayout {
    /* renamed from: a */
    private final int f46250a;
    /* renamed from: b */
    private HashMap f46251b;
    @NotNull
    @BindView(2131363740)
    public GrandGestureAnimationView tappableAnimationView;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/reactions/gestures/view/TappableGrandGestureView$BackgroundType;", "", "(Ljava/lang/String;I)V", "DRAWABLE", "ANIMATED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum BackgroundType {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.TappableGrandGestureView$a */
    static final class C18751a<T> implements Action1<Void> {
        /* renamed from: a */
        final /* synthetic */ TappableGrandGestureView f58249a;

        C18751a(TappableGrandGestureView tappableGrandGestureView) {
            this.f58249a = tappableGrandGestureView;
        }

        public /* synthetic */ void call(Object obj) {
            m67188a((Void) obj);
        }

        /* renamed from: a */
        public final void m67188a(Void voidR) {
            this.f58249a.getTappableAnimationView$Tinder_release().m67183k();
        }
    }

    /* renamed from: a */
    public View m55913a(int i) {
        if (this.f46251b == null) {
            this.f46251b = new HashMap();
        }
        View view = (View) this.f46251b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f46251b.put(Integer.valueOf(i), view);
        return view;
    }

    public TappableGrandGestureView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        attributeSet = context.obtainStyledAttributes(attributeSet, C6249b.TappableGrandGestureView, 0, 0);
        this.f46250a = attributeSet.getInt(0, -1);
        if (this.f46250a == BackgroundType.ANIMATED.ordinal()) {
            FrameLayout.inflate(context, R.layout.view_animated_bg_tappable_grand_gesture, this);
        } else {
            FrameLayout.inflate(context, R.layout.view_tappable_grand_gesture, this);
        }
        attributeSet.recycle();
    }

    @NotNull
    public final GrandGestureAnimationView getTappableAnimationView$Tinder_release() {
        GrandGestureAnimationView grandGestureAnimationView = this.tappableAnimationView;
        if (grandGestureAnimationView == null) {
            C2668g.b("tappableAnimationView");
        }
        return grandGestureAnimationView;
    }

    public final void setTappableAnimationView$Tinder_release(@NotNull GrandGestureAnimationView grandGestureAnimationView) {
        C2668g.b(grandGestureAnimationView, "<set-?>");
        this.tappableAnimationView = grandGestureAnimationView;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
        if (this.f46250a == BackgroundType.ANIMATED.ordinal()) {
            m55911a();
        }
        C14612a c14612a = C14612a.f46118a;
        GrandGestureAnimationView grandGestureAnimationView = this.tappableAnimationView;
        if (grandGestureAnimationView == null) {
            C2668g.b("tappableAnimationView");
        }
        c14612a.m55762g(grandGestureAnimationView).d(new C18751a(this));
    }

    /* renamed from: a */
    private final void m55911a() {
        float c = (float) av.c();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) m55913a(C6248a.animatedBackgroundView);
        C2668g.a(lottieAnimationView, "animatedBackgroundView");
        m55912a(lottieAnimationView, (int) (0.2f * c));
        GrandGestureAnimationView grandGestureAnimationView = this.tappableAnimationView;
        if (grandGestureAnimationView == null) {
            C2668g.b("tappableAnimationView");
        }
        m55912a(grandGestureAnimationView, (int) (c * 0.17f));
    }

    @NotNull
    public final Observable<State> getGrandGestureStateObservable() {
        GrandGestureAnimationView grandGestureAnimationView = this.tappableAnimationView;
        if (grandGestureAnimationView == null) {
            C2668g.b("tappableAnimationView");
        }
        return grandGestureAnimationView.getGrandGestureStateObservable();
    }

    /* renamed from: a */
    private final void m55912a(View view, int i) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = i;
        view.setLayoutParams(layoutParams2);
    }
}
