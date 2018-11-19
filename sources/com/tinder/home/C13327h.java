package com.tinder.home;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.home.ShimmerHomeTabTarget.IconType;
import com.tinder.main.p287c.C11993b;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.utils.au;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0012H\u0016J\u0006\u0010%\u001a\u00020\u001cJ\b\u0010&\u001a\u00020\u001cH\u0014J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010(\u001a\u00020\u001cR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/tinder/home/ShimmerHomeTab;", "Lcom/tinder/main/view/MainTabIconView;", "Lcom/tinder/home/ShimmerHomeTabTarget;", "context", "Landroid/content/Context;", "icon", "", "shimmerHomeTabPresenter", "Lcom/tinder/home/ShimmerHomeTabPresenter;", "(Landroid/content/Context;ILcom/tinder/home/ShimmerHomeTabPresenter;)V", "goldColor", "getGoldColor", "()I", "grayColor", "getGrayColor", "iconType", "Lcom/tinder/home/ShimmerHomeTabTarget$IconType;", "noShimmerIcon", "Landroid/widget/ImageView;", "getNoShimmerIcon", "()Landroid/widget/ImageView;", "redColor", "getRedColor", "shimmerView", "Lcom/tinder/shimmy/ShimmerFrameLayout;", "getShimmerView", "()Lcom/tinder/shimmy/ShimmerFrameLayout;", "animateSelected", "", "animateUnselected", "getAnimListener", "Landroid/animation/Animator$AnimatorListener;", "isSelecting", "", "getSelectColor", "getUnselectedColor", "getViewToAnimate", "hideShimmer", "onDetachedFromWindow", "setIconType", "showShimmer", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.home.h */
public final class C13327h extends C11993b implements ShimmerHomeTabTarget {
    @NotNull
    /* renamed from: a */
    private final ShimmerFrameLayout f42282a;
    @NotNull
    /* renamed from: b */
    private final ImageView f42283b;
    /* renamed from: c */
    private final int f42284c = au.c(this, R.color.gold1);
    /* renamed from: d */
    private final int f42285d = au.c(this, R.color.tinder_gray);
    /* renamed from: e */
    private final int f42286e = au.c(this, R.color.tinder_red);
    /* renamed from: f */
    private IconType f42287f = IconType.REGULAR_RED;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/home/ShimmerHomeTab$getAnimListener$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/home/ShimmerHomeTab;Z)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.h$a */
    public static final class C9699a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C13327h f32278a;
        /* renamed from: b */
        final /* synthetic */ boolean f32279b;

        C9699a(C13327h c13327h, boolean z) {
            this.f32278a = c13327h;
            this.f32279b = z;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f32279b != null && this.f32278a.isSelected() != null && this.f32278a.f42287f == IconType.SAVORY_SHIMMER) {
                this.f32278a.m51576d();
            }
        }
    }

    public C13327h(@NotNull Context context, @DrawableRes int i, @NotNull C9701j c9701j) {
        C2668g.b(context, "context");
        C2668g.b(c9701j, "shimmerHomeTabPresenter");
        super(context);
        FrameLayout.inflate(context, R.layout.shimmer_tab_view, this);
        context = findViewById(R.id.shimmer_frame_layout);
        C2668g.a(context, "findViewById(R.id.shimmer_frame_layout)");
        this.f42282a = (ShimmerFrameLayout) context;
        context = findViewById(R.id.tab_icon);
        C2668g.a(context, "findViewById(R.id.tab_icon)");
        ImageView imageView = (ImageView) context;
        View findViewById = findViewById(R.id.non_shimmer_icon);
        C2668g.a(findViewById, "findViewById(R.id.non_shimmer_icon)");
        this.f42283b = (ImageView) findViewById;
        imageView.setImageResource(i);
        this.f42283b.setImageResource(i);
        Deadshot.take(this, c9701j);
    }

    @NotNull
    public final ShimmerFrameLayout getShimmerView() {
        return this.f42282a;
    }

    @NotNull
    public final ImageView getNoShimmerIcon() {
        return this.f42283b;
    }

    public final int getGoldColor() {
        return this.f42284c;
    }

    public final int getGrayColor() {
        return this.f42285d;
    }

    public final int getRedColor() {
        return this.f42286e;
    }

    public void setIconType(@NotNull IconType iconType) {
        C2668g.b(iconType, "iconType");
        this.f42287f = iconType;
        switch (C9700i.f32280a[iconType.ordinal()]) {
            case 1:
                m51575c();
                if (isSelected() != null) {
                    this.f42283b.setColorFilter(this.f42286e);
                    return;
                }
                return;
            case 2:
                if (isSelected() != null) {
                    m51576d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo11152a() {
        setSelected(true);
        super.mo11152a();
    }

    /* renamed from: b */
    public void mo11153b() {
        setSelected(false);
        m51575c();
        super.mo11153b();
    }

    public int getSelectColor() {
        switch (C9700i.f32281b[this.f42287f.ordinal()]) {
            case 1:
                return this.f42284c;
            case 2:
                return this.f42286e;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public int getUnselectedColor() {
        return this.f42285d;
    }

    @Nullable
    /* renamed from: a */
    public AnimatorListener mo11151a(boolean z) {
        return new C9699a(this, z);
    }

    @NotNull
    public ImageView getViewToAnimate() {
        return this.f42283b;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    /* renamed from: c */
    public final void m51575c() {
        this.f42282a.setVisibility(0);
        this.f42283b.setVisibility(0);
    }

    /* renamed from: d */
    public final void m51576d() {
        this.f42282a.setVisibility(0);
        this.f42283b.setVisibility(8);
    }
}
