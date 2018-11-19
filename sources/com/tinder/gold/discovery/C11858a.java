package com.tinder.gold.discovery;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tinder.discovery.C8878a.C8873a;
import com.tinder.discovery.C8878a.C8874b;
import com.tinder.discovery.badge.Badgeable;
import com.tinder.discovery.badge.p233a.C8887a;
import com.tinder.discovery.badge.renderer.BadgeIconRenderer;
import com.tinder.discovery.badge.renderer.BadgeIconRenderer.BadgeIconRendererView;
import com.tinder.discovery.badge.renderer.BadgeIconRenderer.BadgePosition;
import com.tinder.gold.C9692b.C9685a;
import com.tinder.gold.C9692b.C9687c;
import com.tinder.gold.C9692b.C9688d;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.utils.au;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0014J\u0010\u0010'\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020\u0018H\u0002J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020#H\u0014J\b\u00100\u001a\u00020#H\u0014J(\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u0018H\u0014J\u0010\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020.H\u0016J\u0010\u00108\u001a\u00020#2\b\b\u0001\u00109\u001a\u00020\u0018J\u0010\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020.H\u0016J\u0010\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020.H\u0016J\b\u0010>\u001a\u00020#H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/tinder/gold/discovery/ShimmerDiscoveryNavigationView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/discovery/badge/Badgeable;", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgeIconRendererView;", "Lcom/tinder/gold/discovery/ShimmerDiscoveryNavigationTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "presenter", "Lcom/tinder/gold/discovery/ShimmerDiscoveryNavigationViewPresenter;", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/tinder/gold/discovery/ShimmerDiscoveryNavigationViewPresenter;)V", "badgeIconRenderer", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer;", "value", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;", "badgePosition", "getBadgePosition", "()Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;", "setBadgePosition", "(Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;)V", "discoveryIcon", "Landroid/widget/ImageView;", "goldColor", "", "selectedColor", "shimmerDiscoveryIcon", "shimmerLayout", "Lcom/tinder/shimmy/ShimmerFrameLayout;", "showBadgeAnimator", "Lcom/tinder/discovery/badge/animation/ShowBadgeAnimator;", "state", "Lcom/tinder/gold/discovery/State;", "unselectedColor", "disableShimmer", "", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawOnCanvasProxy", "enableShimmer", "getSelectColor", "getUnselectedColor", "hideBadge", "hideShimmer", "isShimmering", "", "onAttachedToWindow", "onDetachedFromWindow", "onSizeChanged", "w", "h", "oldw", "oldh", "setActivated", "activated", "setIcon", "resource", "setSelected", "selected", "showBadge", "animate", "showShimmer", "gold_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.gold.discovery.a */
public final class C11858a extends FrameLayout implements Badgeable, BadgeIconRendererView, ShimmerDiscoveryNavigationTarget {
    /* renamed from: a */
    private final ShimmerFrameLayout f38674a;
    /* renamed from: b */
    private final ImageView f38675b;
    /* renamed from: c */
    private final ImageView f38676c;
    /* renamed from: d */
    private State f38677d;
    /* renamed from: e */
    private final int f38678e;
    /* renamed from: f */
    private final int f38679f;
    /* renamed from: g */
    private final int f38680g;
    /* renamed from: h */
    private final BadgeIconRenderer f38681h;
    /* renamed from: i */
    private final C8887a f38682i;
    @NotNull
    /* renamed from: j */
    private BadgePosition f38683j;
    /* renamed from: k */
    private final C9693b f38684k;

    public /* synthetic */ C11858a(Context context, AttributeSet attributeSet, C9693b c9693b, int i, C15823e c15823e) {
        if ((i & 2) != null) {
            attributeSet = null;
        }
        if ((i & 4) != 0) {
            c9693b = null;
        }
        this(context, attributeSet, c9693b);
    }

    public C11858a(@NotNull Context context, @Nullable AttributeSet attributeSet, @Nullable C9693b c9693b) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f38684k = c9693b;
        this.f38677d = State.NOT_SHIMMERING;
        this.f38678e = au.c(this, C9685a.gold1);
        this.f38679f = au.c(this, C9685a.tinder_red);
        this.f38680g = au.c(this, C9685a.tinder_gray);
        this.f38682i = new C8887a(null, 1, null);
        this.f38683j = BadgePosition.RIGHT;
        FrameLayout.inflate(context, C9688d.shimmer_discovery_navigation_view, this);
        context = findViewById(C9687c.discovery_shimmer_frame_layout);
        C2668g.a(context, "findViewById(R.id.discovery_shimmer_frame_layout)");
        this.f38674a = (ShimmerFrameLayout) context;
        context = findViewById(C9687c.discovery_icon);
        C2668g.a(context, "findViewById(R.id.discovery_icon)");
        this.f38675b = (ImageView) context;
        context = findViewById(C9687c.discovery_shimmer_icon);
        C2668g.a(context, "findViewById(R.id.discovery_shimmer_icon)");
        this.f38676c = (ImageView) context;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C8874b.actionbar_indicator_radius);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C8874b.actionbar_indicator_stroke_radius) + dimensionPixelSize;
        setWillNotDraw(false);
        BadgeIconRendererView badgeIconRendererView = this;
        int c = au.c(this, C8873a.white);
        int c2 = au.c(this, C8873a.tinder_red);
        c9693b = getResources();
        C2668g.a(c9693b, "resources");
        this.f38681h = new BadgeIconRenderer(badgeIconRendererView, dimensionPixelSize2, dimensionPixelSize, c, c2, c9693b.getDisplayMetrics().density, null, null, 192, null);
        setSelected(false);
        if (this.f38684k == null) {
            this.f38677d = State.ALWAYS_SHIMMERING;
            m47825a();
        }
    }

    @NotNull
    public final BadgePosition getBadgePosition() {
        return this.f38683j;
    }

    public final void setBadgePosition(@NotNull BadgePosition badgePosition) {
        C2668g.b(badgePosition, "value");
        this.f38683j = badgePosition;
        this.f38681h.m37689a(this.f38683j);
        invalidate();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9693b c9693b = this.f38684k;
        if (c9693b != null) {
            c9693b.m40149a((ShimmerDiscoveryNavigationTarget) this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9693b c9693b = this.f38684k;
        if (c9693b != null) {
            c9693b.m40148a();
        }
    }

    public void enableShimmer() {
        this.f38677d = State.SHIMMERING;
        m47825a();
    }

    public void disableShimmer() {
        this.f38677d = State.NOT_SHIMMERING;
        m47826b();
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (m47827c() && z) {
            m47825a();
        } else {
            m47826b();
        }
        this.f38675b.setColorFilter(z ? getSelectColor() : getUnselectedColor(), Mode.SRC_ATOP);
    }

    public void setActivated(boolean z) {
        super.setActivated(z);
        this.f38681h.m37690a(z ^ 1);
    }

    public void showBadge(boolean z) {
        this.f38681h.m37692b(true);
        if (z) {
            this.f38682i.m37670a(this.f38681h);
        } else {
            this.f38682i.m37669a();
        }
        invalidate();
    }

    public void hideBadge() {
        this.f38681h.m37692b(false);
        this.f38682i.m37669a();
        invalidate();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i3 = this.f38675b.getDrawable();
        i4 = 0;
        i3 = i3 != 0 ? i3.getIntrinsicWidth() : 0;
        Drawable drawable = this.f38675b.getDrawable();
        if (drawable != null) {
            i4 = drawable.getIntrinsicWidth();
        }
        this.f38681h.m37687a(i, i2, i3, i4);
    }

    protected void dispatchDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        this.f38681h.m37688a(canvas);
    }

    public void drawOnCanvasProxy(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    public final void setIcon(@DrawableRes int i) {
        this.f38675b.setImageResource(i);
        this.f38676c.setImageResource(i);
    }

    /* renamed from: a */
    private final void m47825a() {
        this.f38674a.setVisibility(0);
        this.f38675b.setVisibility(8);
    }

    /* renamed from: b */
    private final void m47826b() {
        this.f38674a.setVisibility(8);
        this.f38675b.setVisibility(0);
    }

    private final int getSelectColor() {
        return m47827c() ? this.f38678e : this.f38679f;
    }

    private final int getUnselectedColor() {
        return this.f38680g;
    }

    /* renamed from: c */
    private final boolean m47827c() {
        if (this.f38677d != State.SHIMMERING) {
            if (this.f38677d != State.ALWAYS_SHIMMERING) {
                return false;
            }
        }
        return true;
    }
}
