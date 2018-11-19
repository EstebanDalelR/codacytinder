package com.tinder.paywall.views;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C2887d;
import android.support.v4.view.ViewPager.PageTransformer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.paywall.p304b.C12265d;
import com.viewpagerindicator.CirclePageIndicator;
import io.fabric.sdk.android.services.events.C15645a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\fJ\b\u0010%\u001a\u00020 H\u0014J\u0010\u0010&\u001a\u00020 2\u0006\u0010#\u001a\u00020\bH\u0002J\b\u0010'\u001a\u00020 H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/tinder/paywall/views/PaywallPerksCarouselView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animateBackground", "", "isDismissed", "isTouching", "onPageChangeListener", "Lcom/tinder/paywall/views/OnPerksCarouselPageChangeListener;", "pagerIndicator", "Lcom/viewpagerindicator/CirclePageIndicator;", "getPagerIndicator", "()Lcom/viewpagerindicator/CirclePageIndicator;", "setPagerIndicator", "(Lcom/viewpagerindicator/CirclePageIndicator;)V", "pagerLooper", "Landroid/os/Handler;", "pagerRunnable", "Ljava/lang/Runnable;", "perksPager", "Landroid/support/v4/view/ViewPager;", "getPerksPager", "()Landroid/support/v4/view/ViewPager;", "setPerksPager", "(Landroid/support/v4/view/ViewPager;)V", "white", "", "bind", "", "payWallPerksAdapter", "Lcom/tinder/paywall/perks/PaywallPerksAdapter;", "shouldAutoAdvance", "listener", "onDetachedFromWindow", "setupPerksAutoScroll", "setupPerksCarousel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PaywallPerksCarouselView extends FrameLayout {
    /* renamed from: a */
    private final Handler f33050a = new Handler();
    /* renamed from: b */
    private boolean f33051b;
    /* renamed from: c */
    private boolean f33052c;
    /* renamed from: d */
    private Runnable f33053d;
    /* renamed from: e */
    private boolean f33054e;
    /* renamed from: f */
    private OnPerksCarouselPageChangeListener f33055f;
    @NotNull
    @BindView(2131363146)
    public CirclePageIndicator pagerIndicator;
    @NotNull
    @BindView(2131363157)
    public ViewPager perksPager;
    @BindColor(2131100300)
    @JvmField
    public int white;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/paywall/views/PaywallPerksCarouselView$setupPerksAutoScroll$1", "Ljava/lang/Runnable;", "(Lcom/tinder/paywall/views/PaywallPerksCarouselView;)V", "reschedule", "", "run", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.views.PaywallPerksCarouselView$a */
    public static final class C10099a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ PaywallPerksCarouselView f33048a;

        C10099a(PaywallPerksCarouselView paywallPerksCarouselView) {
            this.f33048a = paywallPerksCarouselView;
        }

        public void run() {
            if (this.f33048a.f33051b) {
                m41285a();
                return;
            }
            int currentItem = this.f33048a.getPerksPager().getCurrentItem();
            C0600i adapter = this.f33048a.getPerksPager().getAdapter();
            if (adapter == null) {
                C2668g.a();
            }
            C2668g.a(adapter, "perksPager.adapter!!");
            int count = adapter.getCount();
            if (currentItem < count - 1) {
                currentItem++;
                if (currentItem < count) {
                    this.f33048a.getPerksPager().setCurrentItem(currentItem, true);
                }
            } else if (count > 0) {
                this.f33048a.getPerksPager().setCurrentItem(0, true);
            }
            m41285a();
        }

        /* renamed from: a */
        private final void m41285a() {
            if (!this.f33048a.f33052c) {
                this.f33048a.f33050a.postDelayed(this, (long) (this.f33048a.f33051b ? C15645a.MAX_BYTE_SIZE_PER_FILE : 2000));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.views.PaywallPerksCarouselView$b */
    static final class C10100b implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ PaywallPerksCarouselView f33049a;

        C10100b(PaywallPerksCarouselView paywallPerksCarouselView) {
            this.f33049a = paywallPerksCarouselView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getActionMasked()) {
                case null:
                    this.f33049a.f33051b = true;
                    this.f33049a.f33050a.removeCallbacks(this.f33049a.f33053d);
                    break;
                case 1:
                    this.f33049a.f33051b = false;
                    this.f33049a.f33050a.postDelayed(this.f33049a.f33053d, (long) C15645a.MAX_BYTE_SIZE_PER_FILE);
                    break;
                default:
                    break;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "page", "Landroid/view/View;", "position", "", "transformPage"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.views.PaywallPerksCarouselView$c */
    static final class C12291c implements PageTransformer {
        /* renamed from: a */
        final /* synthetic */ PaywallPerksCarouselView f39791a;

        C12291c(PaywallPerksCarouselView paywallPerksCarouselView) {
            this.f39791a = paywallPerksCarouselView;
        }

        public final void transformPage(@NotNull View view, float f) {
            C2668g.b(view, "page");
            int width = view.getWidth();
            View findViewById = view.findViewById(R.id.paywall_perk_background);
            float f2 = (float) 1;
            if (f <= f2) {
                View findViewById2 = view.findViewById(R.id.paywall_perk_image);
                C2668g.a(findViewById2, "page.findViewById<View>(R.id.paywall_perk_image)");
                float f3 = (float) width;
                findViewById2.setTranslationX(f * f3);
                findViewById2 = view.findViewById(R.id.paywall_perk_title);
                C2668g.a(findViewById2, "page.findViewById<View>(R.id.paywall_perk_title)");
                findViewById2.setTranslationX((f3 / 0.75f) * f);
                findViewById2 = view.findViewById(R.id.paywall_perk_timer_text);
                C2668g.a(findViewById2, "page.findViewById<View>(….paywall_perk_timer_text)");
                float f4 = (f3 / 0.5f) * f;
                findViewById2.setTranslationX(f4);
                findViewById2 = view.findViewById(R.id.paywall_perk_byline);
                C2668g.a(findViewById2, "page.findViewById<View>(R.id.paywall_perk_byline)");
                findViewById2.setTranslationX(f4);
                if (!this.f39791a.f33054e) {
                    return;
                }
                if (f < ((float) -1)) {
                    C2668g.a(findViewById, "backgroundGradient");
                    findViewById.setAlpha(null);
                } else if (f <= ((float) 0)) {
                    C2668g.a(findViewById, "backgroundGradient");
                    findViewById.setAlpha(f2 + f);
                    view.setTranslationX((-f) * f3);
                } else if (f <= f2) {
                    C2668g.a(findViewById, "backgroundGradient");
                    findViewById.setAlpha(f2 - f);
                    view.setTranslationX((-f) * f3);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"com/tinder/paywall/views/PaywallPerksCarouselView$setupPerksCarousel$pageChangeListener$1", "Landroid/support/v4/view/ViewPager$SimpleOnPageChangeListener;", "(Lcom/tinder/paywall/views/PaywallPerksCarouselView;)V", "lastPage", "", "getLastPage$Tinder_release", "()I", "setLastPage$Tinder_release", "(I)V", "onPageSelected", "", "position", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.views.PaywallPerksCarouselView$d */
    public static final class C13556d extends C2887d {
        /* renamed from: a */
        final /* synthetic */ PaywallPerksCarouselView f43284a;
        /* renamed from: b */
        private int f43285b;

        C13556d(PaywallPerksCarouselView paywallPerksCarouselView) {
            this.f43284a = paywallPerksCarouselView;
        }

        public void onPageSelected(int i) {
            OnPerksCarouselPageChangeListener f = this.f43284a.f33055f;
            if (f != null) {
                f.onPageChange(i, this.f43285b);
            }
            this.f43285b = i;
        }
    }

    public PaywallPerksCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.view_paywall_perks_carousel, this);
        ButterKnife.a(this);
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C6249b.PaywallPerksCarouselView);
            try {
                this.f33054e = context.getBoolean(0, false);
                attributeSet = this.pagerIndicator;
                if (attributeSet == null) {
                    C2668g.b("pagerIndicator");
                }
                attributeSet.setFillColor(context.getColor(1, this.white));
            } finally {
                context.recycle();
            }
        }
    }

    @NotNull
    public final ViewPager getPerksPager() {
        ViewPager viewPager = this.perksPager;
        if (viewPager == null) {
            C2668g.b("perksPager");
        }
        return viewPager;
    }

    public final void setPerksPager(@NotNull ViewPager viewPager) {
        C2668g.b(viewPager, "<set-?>");
        this.perksPager = viewPager;
    }

    @NotNull
    public final CirclePageIndicator getPagerIndicator() {
        CirclePageIndicator circlePageIndicator = this.pagerIndicator;
        if (circlePageIndicator == null) {
            C2668g.b("pagerIndicator");
        }
        return circlePageIndicator;
    }

    public final void setPagerIndicator(@NotNull CirclePageIndicator circlePageIndicator) {
        C2668g.b(circlePageIndicator, "<set-?>");
        this.pagerIndicator = circlePageIndicator;
    }

    /* renamed from: a */
    public static /* synthetic */ void m41287a(PaywallPerksCarouselView paywallPerksCarouselView, C12265d c12265d, boolean z, OnPerksCarouselPageChangeListener onPerksCarouselPageChangeListener, int i, Object obj) {
        if ((i & 2) != null) {
            z = true;
        }
        if ((i & 4) != 0) {
            onPerksCarouselPageChangeListener = null;
        }
        paywallPerksCarouselView.m41295a(c12265d, z, onPerksCarouselPageChangeListener);
    }

    /* renamed from: a */
    public final void m41295a(@NotNull C12265d c12265d, boolean z, @Nullable OnPerksCarouselPageChangeListener onPerksCarouselPageChangeListener) {
        C2668g.b(c12265d, "payWallPerksAdapter");
        this.f33055f = onPerksCarouselPageChangeListener;
        onPerksCarouselPageChangeListener = this.perksPager;
        if (onPerksCarouselPageChangeListener == null) {
            C2668g.b("perksPager");
        }
        onPerksCarouselPageChangeListener.setAdapter(c12265d);
        setupPerksAutoScroll(z);
        m41286a();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f33053d;
        if (runnable != null) {
            this.f33050a.removeCallbacks(runnable);
            this.f33053d = (Runnable) null;
        }
    }

    private final void setupPerksAutoScroll(boolean z) {
        this.f33053d = new C10099a(this);
        if (z) {
            this.f33050a.postDelayed(this.f33053d, (long) 12000);
        }
        z = this.perksPager;
        if (!z) {
            C2668g.b("perksPager");
        }
        z.setOnTouchListener(new C10100b(this));
    }

    /* renamed from: a */
    private final void m41286a() {
        ViewPager viewPager = this.perksPager;
        if (viewPager == null) {
            C2668g.b("perksPager");
        }
        viewPager.setPageTransformer(false, new C12291c(this));
        C13556d c13556d = new C13556d(this);
        ViewPager viewPager2 = this.perksPager;
        if (viewPager2 == null) {
            C2668g.b("perksPager");
        }
        viewPager2.addOnPageChangeListener(c13556d);
        c13556d.onPageSelected(0);
        CirclePageIndicator circlePageIndicator = this.pagerIndicator;
        if (circlePageIndicator == null) {
            C2668g.b("pagerIndicator");
        }
        viewPager2 = this.perksPager;
        if (viewPager2 == null) {
            C2668g.b("perksPager");
        }
        circlePageIndicator.setViewPager(viewPager2);
    }
}
