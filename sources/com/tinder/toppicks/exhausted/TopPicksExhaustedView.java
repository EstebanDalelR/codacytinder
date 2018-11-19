package com.tinder.toppicks.exhausted;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.tinder.paywall.legacy.PaywallFlowFailureListener;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.paywall.legacy.TopPicksPaywallViewFactory;
import com.tinder.paywall.legacy.TopPicksPaywallViewFactory.C10064a;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.PurchaseSuccess;
import com.tinder.toppicks.C15235b.C15226b;
import com.tinder.toppicks.C15235b.C15229e;
import com.tinder.toppicks.C15235b.C15230f;
import com.tinder.toppicks.di.TopPicksInjector$Factory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.collections.C19291t;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0011J.\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\"2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002J \u0010,\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u0011H\u0002J(\u00102\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001a2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000207H\u0002J\u0014\u00108\u001a\u00020%2\f\u00109\u001a\b\u0012\u0004\u0012\u00020#0\"J\b\u0010:\u001a\u00020%H\u0016J\b\u0010;\u001a\u00020%H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/tinder/toppicks/exhausted/TopPicksExhaustedView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/toppicks/exhausted/TopPicksExhaustedTarget;", "Lcom/tinder/paywall/legacy/PaywallFlowSuccessListener;", "Lcom/tinder/paywall/legacy/PaywallFlowFailureListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "alcPaywallContainer", "Landroid/widget/FrameLayout;", "cardLeft", "Lcom/tinder/toppicks/exhausted/TeaserExhaustedCardView;", "cardMain", "cardRight", "padding", "", "presenter", "Lcom/tinder/toppicks/exhausted/TopPicksExhaustedPresenter;", "getPresenter", "()Lcom/tinder/toppicks/exhausted/TopPicksExhaustedPresenter;", "setPresenter", "(Lcom/tinder/toppicks/exhausted/TopPicksExhaustedPresenter;)V", "teasersContainer", "topPicksPaywallView", "Landroid/view/View;", "topPicksPaywallViewFactory", "Lcom/tinder/paywall/legacy/TopPicksPaywallViewFactory;", "getTopPicksPaywallViewFactory", "()Lcom/tinder/paywall/legacy/TopPicksPaywallViewFactory;", "setTopPicksPaywallViewFactory", "(Lcom/tinder/paywall/legacy/TopPicksPaywallViewFactory;)V", "viewModels", "", "Lcom/tinder/toppicks/exhausted/TopPickTeaserExhaustedViewModel;", "animateCardsToPosition", "", "centerX", "animateTeaserCardToPosition", "Landroid/animation/ValueAnimator;", "view", "viewModel", "cardTranslation", "animateViewRotations", "finalRotation", "reverse", "", "animateViewScale", "finalScale", "applyLayoutParamsToView", "cardWidth", "", "cardHeight", "position", "Landroid/graphics/PointF;", "bind", "teasers", "handleFailure", "handleSuccess", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksExhaustedView extends LinearLayout implements PaywallFlowFailureListener, PaywallFlowSuccessListener, TopPicksExhaustedTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C15265b f52454a;
    @Inject
    @NotNull
    /* renamed from: b */
    public TopPicksPaywallViewFactory f52455b;
    /* renamed from: c */
    private final FrameLayout f52456c;
    /* renamed from: d */
    private final FrameLayout f52457d;
    /* renamed from: e */
    private final TeaserExhaustedCardView f52458e;
    /* renamed from: f */
    private final TeaserExhaustedCardView f52459f;
    /* renamed from: g */
    private final TeaserExhaustedCardView f52460g;
    /* renamed from: h */
    private View f52461h;
    /* renamed from: i */
    private final float f52462i;
    /* renamed from: j */
    private List<C15264a> f52463j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/toppicks/exhausted/TopPicksExhaustedView$animateTeaserCardToPosition$xAnim$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.exhausted.TopPicksExhaustedView$a */
    static final class C15260a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ View f47376a;

        C15260a(View view) {
            this.f47376a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f47376a;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            view.setX(((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/toppicks/exhausted/TopPicksExhaustedView$animateTeaserCardToPosition$yAnim$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.exhausted.TopPicksExhaustedView$b */
    static final class C15261b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ View f47377a;

        C15261b(View view) {
            this.f47377a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f47377a;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            view.setY(((Float) valueAnimator).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/toppicks/exhausted/TopPicksExhaustedView$animateViewRotations$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.exhausted.TopPicksExhaustedView$c */
    static final class C15262c implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ View f47378a;
        /* renamed from: b */
        final /* synthetic */ boolean f47379b;

        C15262c(View view, boolean z) {
            this.f47378a = view;
            this.f47379b = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            valueAnimator = ((Float) valueAnimator).floatValue();
            View view = this.f47378a;
            if (this.f47379b) {
                valueAnimator = -valueAnimator;
            }
            view.setRotation(valueAnimator);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/toppicks/exhausted/TopPicksExhaustedView$animateViewScale$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.exhausted.TopPicksExhaustedView$d */
    static final class C15263d implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ View f47380a;

        C15263d(View view) {
            this.f47380a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            valueAnimator = ((Float) valueAnimator).floatValue();
            this.f47380a.setScaleX(valueAnimator);
            this.f47380a.setScaleY(valueAnimator);
        }
    }

    public void handleFailure() {
    }

    public /* synthetic */ TopPicksExhaustedView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksExhaustedView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f52462i = context.getResources().getDimension(C15226b.space_s);
        this.f52463j = C17554o.m64195a();
        ((TopPicksInjector$Factory) context).provideTopPicksInjector().inject(this);
        LinearLayout.inflate(context, C15230f.view_teasers_exhausted, this);
        setOrientation(1);
        context = findViewById(C15229e.teasers_container);
        C2668g.a(context, "findViewById(R.id.teasers_container)");
        this.f52456c = (FrameLayout) context;
        context = findViewById(C15229e.alc_view_container);
        C2668g.a(context, "findViewById(R.id.alc_view_container)");
        this.f52457d = (FrameLayout) context;
        context = findViewById(C15229e.main_pick);
        C2668g.a(context, "findViewById(R.id.main_pick)");
        this.f52458e = (TeaserExhaustedCardView) context;
        context = findViewById(C15229e.left_pick);
        C2668g.a(context, "findViewById(R.id.left_pick)");
        this.f52459f = (TeaserExhaustedCardView) context;
        context = findViewById(C15229e.right_pick);
        C2668g.a(context, "findViewById(R.id.right_pick)");
        this.f52460g = (TeaserExhaustedCardView) context;
    }

    @NotNull
    public final C15265b getPresenter() {
        C15265b c15265b = this.f52454a;
        if (c15265b == null) {
            C2668g.b("presenter");
        }
        return c15265b;
    }

    public final void setPresenter(@NotNull C15265b c15265b) {
        C2668g.b(c15265b, "<set-?>");
        this.f52454a = c15265b;
    }

    @NotNull
    public final TopPicksPaywallViewFactory getTopPicksPaywallViewFactory() {
        TopPicksPaywallViewFactory topPicksPaywallViewFactory = this.f52455b;
        if (topPicksPaywallViewFactory == null) {
            C2668g.b("topPicksPaywallViewFactory");
        }
        return topPicksPaywallViewFactory;
    }

    public final void setTopPicksPaywallViewFactory(@NotNull TopPicksPaywallViewFactory topPicksPaywallViewFactory) {
        C2668g.b(topPicksPaywallViewFactory, "<set-?>");
        this.f52455b = topPicksPaywallViewFactory;
    }

    public void handleSuccess() {
        C15265b c15265b = this.f52454a;
        if (c15265b == null) {
            C2668g.b("presenter");
        }
        c15265b.m57365a(PurchaseSuccess.INSTANCE);
    }

    /* renamed from: a */
    public final void m62811a(@NotNull List<C15264a> list) {
        C2668g.b(list, "teasers");
        if ((list.size() >= 3 ? 1 : null) == null) {
            throw new IllegalStateException("Must supply at least 3 teaser view models".toString());
        }
        this.f52463j = list;
        for (C15264a c15264a : list) {
            switch (C15266c.f47387a[c15264a.m57361b().ordinal()]) {
                case 1:
                    this.f52458e.m66079a(c15264a.m57360a());
                    break;
                case 2:
                    this.f52459f.m66079a(c15264a.m57360a());
                    break;
                case 3:
                    this.f52460g.m66079a(c15264a.m57360a());
                    break;
                default:
                    break;
            }
        }
        if (this.f52461h == null) {
            TopPicksPaywallViewFactory topPicksPaywallViewFactory = this.f52455b;
            if (topPicksPaywallViewFactory == null) {
                C2668g.b("topPicksPaywallViewFactory");
            }
            Context context = getContext();
            C2668g.a(context, "context");
            this.f52461h = C10064a.a(topPicksPaywallViewFactory, context, TopPicksPaywallSource.EXHAUSTED_VIEW_EMPTY_STATE, this, this, null, 16, null);
            list = new LayoutParams(-1, -2);
            list.gravity = 80;
            this.f52457d.addView(this.f52461h, (ViewGroup.LayoutParams) list);
        }
    }

    /* renamed from: a */
    public final void m62810a(float f) {
        if ((this.f52463j.size() >= 3 ? 1 : null) == null) {
            throw new IllegalStateException("Must bind the teasers view models first!".toString());
        }
        List arrayList = new ArrayList();
        for (C15264a c15264a : this.f52463j) {
            List a;
            Collection collection = arrayList;
            switch (C15266c.f47388b[c15264a.m57361b().ordinal()]) {
                case 1:
                    a = m62808a((View) this.f52458e, c15264a, f, 0.0f);
                    break;
                case 2:
                    a = m62808a((View) this.f52459f, c15264a, f, -0.4f);
                    break;
                case 3:
                    a = m62808a((View) this.f52460g, c15264a, f, 0.4f);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            C19291t.m68635a(collection, (Iterable) a);
        }
        Collection collection2 = arrayList;
        if ((collection2.isEmpty() ^ Float.MIN_VALUE) != null) {
            f = new AnimatorSet();
            f.playTogether(C19299w.m68809b((Collection) C19299w.m68809b(collection2, (Iterable) C17554o.m64199b((Object[]) new ValueAnimator[]{m62806a(this.f52459f, 0.8f), m62806a(this.f52460g, 0.8f)})), (Iterable) C17554o.m64199b((Object[]) new ValueAnimator[]{m62807a(this.f52459f, 10.0f, true), m62807a(this.f52460g, 10.0f, false)})));
            f.setDuration(500);
            f.setInterpolator(new OvershootInterpolator(1.0f));
            f.setStartDelay(100);
            f.start();
        }
    }

    /* renamed from: a */
    private final void m62809a(View view, int i, int i2, PointF pointF) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        view.setX(pointF.x);
        view.setY(pointF.y);
    }

    /* renamed from: a */
    private final ValueAnimator m62806a(View view, float f) {
        f = ValueAnimator.ofFloat(new float[]{1.0f, f});
        f.addUpdateListener(new C15263d(view));
        C2668g.a(f, "ValueAnimator.ofFloat(1f…e\n            }\n        }");
        return f;
    }

    /* renamed from: a */
    private final ValueAnimator m62807a(View view, float f, boolean z) {
        f = ValueAnimator.ofFloat(new float[]{0.0f, f});
        f.addUpdateListener(new C15262c(view, z));
        C2668g.a(f, "ValueAnimator.ofFloat(0f…}\n            }\n        }");
        return f;
    }

    /* renamed from: a */
    private final List<ValueAnimator> m62808a(View view, C15264a c15264a, float f, float f2) {
        PointF c = c15264a.m57362c();
        int d = (int) (((float) c15264a.m57363d()) * 0.75f);
        int e = (int) (((float) c15264a.m57364e()) * 1061158912);
        float f3 = (float) d;
        f3 *= f2;
        f2 = new PointF(f - (f3 / 2.0f), this.f52462i);
        if (view.getX() == f2.x + f3 && view.getY() == f2.y) {
            return C17554o.m64195a();
        }
        m62809a(view, d, e, c);
        ValueAnimator.ofFloat(new float[]{c.x, f2.x + f3}).addUpdateListener(new C15260a(view));
        ValueAnimator.ofFloat(new float[]{c.y, f2.y}).addUpdateListener(new C15261b(view));
        return C17554o.m64199b((Object[]) new ValueAnimator[]{f, f2});
    }
}
