package com.tinder.superlikeable.lottie;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.superlikeable.C15088a.C15087e;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\rJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u00020\rH\u0002J\u0012\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001d\u001a\u00020\rH\u0016J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0014J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView;", "Lcom/airbnb/lottie/LottieAnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "aspectRatio", "", "expectedMaxWidth", "", "onViewReadyListener", "Lkotlin/Function0;", "", "Lcom/tinder/superlikeable/lottie/OnViewReadyListener;", "getOnViewReadyListener", "()Lkotlin/jvm/functions/Function0;", "setOnViewReadyListener", "(Lkotlin/jvm/functions/Function0;)V", "viewDelegate", "Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView$SuperLikeableLogoLottieViewDelegate;", "isViewReady", "", "loadComposition", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;", "notifyOnViewReady", "onCompositionLoadedByLoader", "composition", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setComposition", "SuperLikeableLogoLottieViewDelegate", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableLogoLottieView extends LottieAnimationView {
    /* renamed from: a */
    private final float f58600a;
    /* renamed from: b */
    private final int f58601b;
    @NotNull
    /* renamed from: c */
    private Function0<C15813i> f58602c;
    /* renamed from: d */
    private final C15144a f58603d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001&B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0019\u001a\u00020\u000fH\u0002J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0007J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070%R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView$SuperLikeableLogoLottieViewDelegate;", "", "superLikeableLogoLottieView", "Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView;", "onCompositionLoadedListener", "Lkotlin/Function1;", "Lcom/airbnb/lottie/LottieComposition;", "", "Lcom/tinder/superlikeable/lottie/OnCompositionLoadedListener;", "lottieCompositionLoader", "Lcom/tinder/superlikeable/lottie/LottieCompositionLoader;", "subscriptionHolder", "Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView$SuperLikeableLogoLottieViewDelegate$SubscriptionHolder;", "(Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView;Lkotlin/jvm/functions/Function1;Lcom/tinder/superlikeable/lottie/LottieCompositionLoader;Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView$SuperLikeableLogoLottieViewDelegate$SubscriptionHolder;)V", "<set-?>", "", "isViewReady", "()Z", "setViewReady", "(Z)V", "lottieComposition", "getLottieComposition", "()Lcom/airbnb/lottie/LottieComposition;", "setLottieComposition", "(Lcom/airbnb/lottie/LottieComposition;)V", "isLoading", "loadComposition", "compositionFileName", "", "onDetachedFromWindow", "onLoadError", "throwable", "", "onLoaded", "composition", "setComposition", "onGlobalLayoutNotifier", "Lkotlin/Function0;", "SubscriptionHolder", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.lottie.SuperLikeableLogoLottieView$a */
    public static final class C15144a {
        @Nullable
        /* renamed from: a */
        private C0788c f47124a;
        /* renamed from: b */
        private boolean f47125b;
        /* renamed from: c */
        private SuperLikeableLogoLottieView f47126c;
        /* renamed from: d */
        private final Function1<C0788c, C15813i> f47127d;
        /* renamed from: e */
        private final C15147a f47128e;
        /* renamed from: f */
        private final C15142a f47129f;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView$SuperLikeableLogoLottieViewDelegate$SubscriptionHolder;", "", "()V", "subscription", "Lrx/Subscription;", "hasSubscription", "", "releaseSubscription", "", "setSubscription", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.superlikeable.lottie.SuperLikeableLogoLottieView$a$a */
        public static final class C15142a {
            /* renamed from: a */
            private Subscription f47121a;

            /* renamed from: a */
            public final void m56984a(@Nullable Subscription subscription) {
                this.f47121a = subscription;
            }

            /* renamed from: a */
            public final boolean m56985a() {
                return this.f47121a != null;
            }

            /* renamed from: b */
            public final void m56986b() {
                Subscription subscription = this.f47121a;
                if (subscription != null) {
                    subscription.unsubscribe();
                }
                this.f47121a = (Subscription) null;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/superlikeable/lottie/SuperLikeableLogoLottieView$SuperLikeableLogoLottieViewDelegate$setComposition$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView$SuperLikeableLogoLottieViewDelegate;Lkotlin/jvm/functions/Function0;)V", "onGlobalLayout", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.superlikeable.lottie.SuperLikeableLogoLottieView$a$b */
        public static final class C15143b implements OnGlobalLayoutListener {
            /* renamed from: a */
            final /* synthetic */ C15144a f47122a;
            /* renamed from: b */
            final /* synthetic */ Function0 f47123b;

            C15143b(C15144a c15144a, Function0 function0) {
                this.f47122a = c15144a;
                this.f47123b = function0;
            }

            public void onGlobalLayout() {
                this.f47122a.f47126c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f47122a.f47125b = true;
                this.f47123b.invoke();
            }
        }

        public C15144a(@NotNull SuperLikeableLogoLottieView superLikeableLogoLottieView, @NotNull Function1<? super C0788c, C15813i> function1, @NotNull C15147a c15147a, @NotNull C15142a c15142a) {
            C2668g.b(superLikeableLogoLottieView, "superLikeableLogoLottieView");
            C2668g.b(function1, "onCompositionLoadedListener");
            C2668g.b(c15147a, "lottieCompositionLoader");
            C2668g.b(c15142a, "subscriptionHolder");
            this.f47126c = superLikeableLogoLottieView;
            this.f47127d = function1;
            this.f47128e = c15147a;
            this.f47129f = c15142a;
        }

        public /* synthetic */ C15144a(SuperLikeableLogoLottieView superLikeableLogoLottieView, Function1 function1, C15147a c15147a, C15142a c15142a, int i, C15823e c15823e) {
            if ((i & 4) != null) {
                c15147a = new C15147a(null, 1, null);
            }
            if ((i & 8) != 0) {
                c15142a = new C15142a();
            }
            this(superLikeableLogoLottieView, function1, c15147a, c15142a);
        }

        @Nullable
        /* renamed from: a */
        public final C0788c m56994a() {
            return this.f47124a;
        }

        /* renamed from: b */
        public final boolean m56997b() {
            return this.f47125b;
        }

        /* renamed from: a */
        public final void m56995a(@NotNull C0788c c0788c, @NotNull Function0<C15813i> function0) {
            C2668g.b(c0788c, "composition");
            C2668g.b(function0, "onGlobalLayoutNotifier");
            this.f47126c.getViewTreeObserver().addOnGlobalLayoutListener(new C15143b(this, function0));
            this.f47124a = c0788c;
        }

        /* renamed from: a */
        public final void m56996a(@NotNull String str) {
            C2668g.b(str, "compositionFileName");
            if (!this.f47125b) {
                if (!m56993d()) {
                    C15142a c15142a = this.f47129f;
                    C15147a c15147a = this.f47128e;
                    Context context = this.f47126c.getContext();
                    C2668g.a(context, "superLikeableLogoLottieView.context");
                    C15144a c15144a = this;
                    c15142a.m56984a(c15147a.m57002a(context, str).b(Schedulers.io()).a(C19397a.a()).a(new C18941b(new C19166xf102b84(c15144a)), new C18941b(new C19167xf102b85(c15144a))));
                }
            }
        }

        /* renamed from: c */
        public final void m56998c() {
            this.f47129f.m56986b();
        }

        /* renamed from: d */
        private final boolean m56993d() {
            return this.f47129f.m56985a();
        }

        /* renamed from: a */
        private final void m56988a(C0788c c0788c) {
            if (c0788c == null) {
                this.f47125b = true;
            }
            this.f47127d.invoke(c0788c);
            this.f47129f.m56986b();
        }

        /* renamed from: a */
        private final void m56992a(Throwable th) {
            this.f47127d.invoke(null);
            this.f47129f.m56986b();
            C0001a.b(th, "Error when loading composition.", new Object[0]);
        }
    }

    public /* synthetic */ SuperLikeableLogoLottieView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public SuperLikeableLogoLottieView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f58602c = SuperLikeableLogoLottieView$onViewReadyListener$1.f58599a;
        this.f58603d = new C15144a(this, new SuperLikeableLogoLottieView$viewDelegate$1(this), null, null, 12, null);
        int i = 260;
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C15087e.SuperLikeableLogoLottieView, 0, 0);
            try {
                this.f58600a = context.getFloat(C15087e.SuperLikeableLogoLottieView_aspectRatio, 3.43f);
                i = context.getInt(C15087e.SuperLikeableLogoLottieView_maxWidth, 260);
            } finally {
                context.recycle();
            }
        } else {
            this.f58600a = 3.43f;
        }
        context = (float) i;
        attributeSet = getResources();
        C2668g.a(attributeSet, "resources");
        this.f58601b = (int) (context * attributeSet.getDisplayMetrics().density);
    }

    @NotNull
    public final Function0<C15813i> getOnViewReadyListener() {
        return this.f58602c;
    }

    public final void setOnViewReadyListener(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "<set-?>");
        this.f58602c = function0;
    }

    protected void onMeasure(int i, int i2) {
        int min = Math.min(MeasureSpec.getSize(i), this.f58601b);
        super.onMeasure(MeasureSpec.makeMeasureSpec(min, MeasureSpec.getMode(i)), MeasureSpec.makeMeasureSpec((int) (((float) min) / this.f58600a), MeasureSpec.getMode(i2)));
    }

    public void setComposition(@NotNull C0788c c0788c) {
        C2668g.b(c0788c, "composition");
        this.f58603d.m56995a(c0788c, (Function0) new SuperLikeableLogoLottieView$setComposition$1(this));
        super.setComposition(c0788c);
        getParent().requestLayout();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58603d.m56998c();
    }

    /* renamed from: i */
    public final void m67437i() {
        this.f58603d.m56996a("superlikeable_logo.json");
    }

    /* renamed from: j */
    public final boolean m67438j() {
        return this.f58603d.m56997b();
    }

    @Nullable
    /* renamed from: k */
    public final C0788c m67439k() {
        return this.f58603d.m56994a();
    }

    /* renamed from: a */
    private final void m67433a(C0788c c0788c) {
        if (c0788c == null) {
            m67436l();
        } else {
            setComposition(c0788c);
        }
    }

    /* renamed from: l */
    private final void m67436l() {
        this.f58602c.invoke();
    }
}
