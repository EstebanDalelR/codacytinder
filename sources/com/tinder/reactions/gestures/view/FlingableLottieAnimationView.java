package com.tinder.reactions.gestures.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.deadshot.Deadshot;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.gestures.common.FlingComponentPositionChangedListener;
import com.tinder.reactions.gestures.common.FlingInteractionEventListener;
import com.tinder.reactions.gestures.p394b.C14651a;
import com.tinder.reactions.gestures.target.FlingableLottieAnimationTarget;
import com.tinder.reactions.p389d.C14618a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0002J\u001a\u0010\u001c\u001a\u00020\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u0017J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0014J\b\u0010#\u001a\u00020\u0017H\u0014J\b\u0010$\u001a\u00020\u0017H\u0014J\b\u0010%\u001a\u00020\u0017H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0017H\u0002J \u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0002J \u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0016J \u0010-\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006."}, d2 = {"Lcom/tinder/reactions/gestures/view/FlingableLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Lcom/tinder/reactions/gestures/common/FlingComponentPositionChangedListener;", "Lcom/tinder/reactions/gestures/target/FlingableLottieAnimationTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defaultAnimationHeight", "", "defaultAnimationWidth", "grandGestureDragFlingMediator", "Lcom/tinder/reactions/gestures/view/GrandGestureFlingPositionMediator;", "initialAnimationHeight", "initialAnimationWidth", "presenter", "Lcom/tinder/reactions/gestures/presenter/FlingableLottieAnimationPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/reactions/gestures/presenter/FlingableLottieAnimationPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/reactions/gestures/presenter/FlingableLottieAnimationPresenter;)V", "addInteractionEventListener", "", "flingInteractionEventListener", "Lcom/tinder/reactions/gestures/common/FlingInteractionEventListener;", "addPositionChangedListener", "flingComponentPositionChangedListener", "initAttrs", "defStyle", "", "initializeAnimationScale", "isMeasured", "", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "reset", "setupDagger", "setupTouchDelegateAfterLayoutChanges", "updateAnimationScale", "currentY", "bottomYLimit", "topYLimit", "verticalPositionChangedOnDrag", "verticalPositionChangedOnGlide", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FlingableLottieAnimationView extends LottieAnimationView implements FlingComponentPositionChangedListener, FlingableLottieAnimationTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14651a f58238a;
    /* renamed from: b */
    private float f58239b = getResources().getDimension(R.dimen.flingable_animation_view_height);
    /* renamed from: c */
    private float f58240c = getResources().getDimension(R.dimen.flingable_animation_view_width);
    /* renamed from: d */
    private float f58241d = this.f58240c;
    /* renamed from: e */
    private float f58242e = this.f58239b;
    /* renamed from: f */
    private C16356b f58243f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.FlingableLottieAnimationView$a */
    static final class C17986a<T, R> implements Func1<Void, Boolean> {
        /* renamed from: a */
        final /* synthetic */ FlingableLottieAnimationView f55919a;

        C17986a(FlingableLottieAnimationView flingableLottieAnimationView) {
            this.f55919a = flingableLottieAnimationView;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65341a((Void) obj));
        }

        /* renamed from: a */
        public final boolean m65341a(Void voidR) {
            return this.f55919a.m67176k();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.FlingableLottieAnimationView$b */
    static final class C18745b<T> implements Action1<Void> {
        /* renamed from: a */
        final /* synthetic */ FlingableLottieAnimationView f58236a;

        C18745b(FlingableLottieAnimationView flingableLottieAnimationView) {
            this.f58236a = flingableLottieAnimationView;
        }

        public /* synthetic */ void call(Object obj) {
            m67169a((Void) obj);
        }

        /* renamed from: a */
        public final void m67169a(Void voidR) {
            FlingableLottieAnimationView.m67174b(this.f58236a).m61707a((View) this.f58236a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.FlingableLottieAnimationView$c */
    static final class C18746c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18746c f58237a = new C18746c();

        C18746c() {
        }

        public /* synthetic */ void call(Object obj) {
            m67170a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67170a(Throwable th) {
            C0001a.c(th, "Error observing layout changes for flingable component", new Object[0]);
        }
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ C16356b m67174b(FlingableLottieAnimationView flingableLottieAnimationView) {
        flingableLottieAnimationView = flingableLottieAnimationView.f58243f;
        if (flingableLottieAnimationView == null) {
            C2668g.b("grandGestureDragFlingMediator");
        }
        return flingableLottieAnimationView;
    }

    public FlingableLottieAnimationView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        m67172a(attributeSet, null);
    }

    @NotNull
    public final C14651a getPresenter$Tinder_release() {
        C14651a c14651a = this.f58238a;
        if (c14651a == null) {
            C2668g.b("presenter");
        }
        return c14651a;
    }

    public final void setPresenter$Tinder_release(@NotNull C14651a c14651a) {
        C2668g.b(c14651a, "<set-?>");
        this.f58238a = c14651a;
    }

    /* renamed from: a */
    public final void m67178a(@NotNull FlingComponentPositionChangedListener flingComponentPositionChangedListener) {
        C2668g.b(flingComponentPositionChangedListener, "flingComponentPositionChangedListener");
        C16356b c16356b = this.f58243f;
        if (c16356b == null) {
            C2668g.b("grandGestureDragFlingMediator");
        }
        c16356b.m61708a(flingComponentPositionChangedListener);
    }

    /* renamed from: a */
    public final void m67179a(@NotNull FlingInteractionEventListener flingInteractionEventListener) {
        C2668g.b(flingInteractionEventListener, "flingInteractionEventListener");
        C16356b c16356b = this.f58243f;
        if (c16356b == null) {
            C2668g.b("grandGestureDragFlingMediator");
        }
        c16356b.m61709a(flingInteractionEventListener);
    }

    /* renamed from: i */
    public final void m67180i() {
        setScale(0.15f);
    }

    public void reset() {
        C16356b c16356b = this.f58243f;
        if (c16356b == null) {
            C2668g.b("grandGestureDragFlingMediator");
        }
        c16356b.m61706a();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14651a c14651a = this.f58238a;
        if (c14651a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c14651a);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        C14651a c14651a = this.f58238a;
        if (c14651a == null) {
            C2668g.b("presenter");
        }
        c14651a.m55864b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void verticalPositionChangedOnDrag(float f, float f2, float f3) {
        m67171a(f, f3, f2);
    }

    public void verticalPositionChangedOnGlide(float f, float f2, float f3) {
        m67171a(f, f3, f2);
    }

    /* renamed from: a */
    private final void m67172a(AttributeSet attributeSet, int i) {
        m67177l();
        attributeSet = getContext().obtainStyledAttributes(attributeSet, C6249b.FlingableLottieAnimationView, i, 0);
        this.f58242e = (float) attributeSet.getDimensionPixelSize(0, (int) this.f58239b);
        this.f58241d = (float) attributeSet.getDimensionPixelSize(1, (int) this.f58240c);
        attributeSet.recycle();
        this.f58243f = new C16356b(this.f58242e, this.f58241d);
        attributeSet = this.f58243f;
        if (attributeSet == null) {
            C2668g.b("grandGestureDragFlingMediator");
        }
        attributeSet.m61708a((FlingComponentPositionChangedListener) this);
        m67175j();
    }

    /* renamed from: a */
    private final void m67171a(float f, float f2, float f3) {
        setScale(C14618a.m55771a(C14618a.f46122a, Math.abs(Math.abs(C14618a.f46122a.m55772a(f, f2, f3))), 0.0f, 0.0f, 0.15f, 0.22f, 6, null));
    }

    /* renamed from: j */
    private final void m67175j() {
        View view = this;
        C5707b.c(view).j(C14612a.f46118a.m55756a(view)).f(new C17986a(this)).c(1).a(C19397a.a()).a(new C18745b(this), C18746c.f58237a);
    }

    /* renamed from: k */
    private final boolean m67176k() {
        return getMeasuredWidth() > 0 && getMeasuredHeight() > 0;
    }

    /* renamed from: l */
    private final void m67177l() {
        Context a = C14398a.m54830a(getContext());
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) a).provideChatActivityComponent().inject(this);
    }
}
