package com.tinder.common.badge.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tinder.R;
import com.tinder.common.badge.p190a.C8525a;
import com.tinder.common.badge.target.BadgeAttributionTarget;
import com.tinder.common.model.Bindable;
import com.tinder.common.p191d.C8529a;
import com.tinder.common.view.extension.C8587g;
import com.tinder.deadshot.Deadshot;
import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.utils.au;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0003H\u0016J\b\u0010+\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020)H\u0016J\b\u0010-\u001a\u00020)H\u0016J\b\u0010.\u001a\u00020)H\u0014J\b\u0010/\u001a\u00020)H\u0014J\b\u00100\u001a\u00020)H\u0014J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H&J\u0010\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020\u0003H\u0016R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b \u0010!R\u0012\u0010#\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\rR\u000e\u0010%\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\r¨\u00065"}, d2 = {"Lcom/tinder/common/badge/view/BadgeAttributionIcon;", "Landroid/widget/FrameLayout;", "Lcom/tinder/common/model/Bindable;", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "Lcom/tinder/common/badge/target/BadgeAttributionTarget;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "boostIndicator", "Landroid/graphics/drawable/Drawable;", "getBoostIndicator", "()Landroid/graphics/drawable/Drawable;", "likesYouIndicator", "matchAttributionIcon", "Landroid/widget/ImageView;", "getMatchAttributionIcon", "()Landroid/widget/ImageView;", "matchAttributionIcon$delegate", "Lkotlin/Lazy;", "matchAttributionIconFastMatchBackground", "getMatchAttributionIconFastMatchBackground", "matchAttributionIconFastMatchBackground$delegate", "presenter", "Lcom/tinder/common/badge/presenter/BadgeAttributionPresenter;", "getPresenter", "()Lcom/tinder/common/badge/presenter/BadgeAttributionPresenter;", "setPresenter", "(Lcom/tinder/common/badge/presenter/BadgeAttributionPresenter;)V", "shimmerFrameLayout", "Lcom/tinder/shimmy/ShimmerFrameLayout;", "getShimmerFrameLayout", "()Lcom/tinder/shimmy/ShimmerFrameLayout;", "shimmerFrameLayout$delegate", "superlikeIndicator", "getSuperlikeIndicator", "topPicksIndicator", "verifiedIndicator", "getVerifiedIndicator", "bind", "", "item", "disableShimmer", "enableShimmer", "hideBadgeAttribution", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "resetBadge", "setupDagger", "showBadgeAttribution", "attribution", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class BadgeAttributionIcon extends FrameLayout implements BadgeAttributionTarget, Bindable<Attribution> {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f34952a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(BadgeAttributionIcon.class), "shimmerFrameLayout", "getShimmerFrameLayout()Lcom/tinder/shimmy/ShimmerFrameLayout;")), C15825i.a(new PropertyReference1Impl(C15825i.a(BadgeAttributionIcon.class), "matchAttributionIconFastMatchBackground", "getMatchAttributionIconFastMatchBackground()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(BadgeAttributionIcon.class), "matchAttributionIcon", "getMatchAttributionIcon()Landroid/widget/ImageView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C8525a f34953b;
    /* renamed from: c */
    private final Lazy f34954c = C18451c.a(LazyThreadSafetyMode.NONE, (Function0) new BadgeAttributionIcon$$special$$inlined$bindView$1(this, R.id.shimmerFrameLayout));
    /* renamed from: d */
    private final Lazy f34955d = C18451c.a(LazyThreadSafetyMode.NONE, (Function0) new BadgeAttributionIcon$$special$$inlined$bindView$2(this, R.id.matchAttributionIconFastmatchBackground));
    /* renamed from: e */
    private final Lazy f34956e = C18451c.a(LazyThreadSafetyMode.NONE, (Function0) new BadgeAttributionIcon$$special$$inlined$bindView$3(this, R.id.matchAttributionIcon));
    /* renamed from: f */
    private final Drawable f34957f = au.b(this, R.drawable.ic_match_type_likes_you);
    /* renamed from: g */
    private final Drawable f34958g = au.b(this, R.drawable.ic_top_picks_small_foreground);

    private final ImageView getMatchAttributionIcon() {
        Lazy lazy = this.f34956e;
        KProperty kProperty = f34952a[2];
        return (ImageView) lazy.getValue();
    }

    private final ImageView getMatchAttributionIconFastMatchBackground() {
        Lazy lazy = this.f34955d;
        KProperty kProperty = f34952a[1];
        return (ImageView) lazy.getValue();
    }

    private final ShimmerFrameLayout getShimmerFrameLayout() {
        Lazy lazy = this.f34954c;
        KProperty kProperty = f34952a[0];
        return (ShimmerFrameLayout) lazy.getValue();
    }

    /* renamed from: a */
    public abstract void mo11135a();

    @NotNull
    public abstract Drawable getBoostIndicator();

    @NotNull
    public abstract Drawable getSuperlikeIndicator();

    @NotNull
    public abstract Drawable getVerifiedIndicator();

    public /* synthetic */ void bind(Object obj) {
        m42976a((Attribution) obj);
    }

    public BadgeAttributionIcon(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    @NotNull
    public final C8525a getPresenter() {
        C8525a c8525a = this.f34953b;
        if (c8525a == null) {
            C2668g.b("presenter");
        }
        return c8525a;
    }

    public final void setPresenter(@NotNull C8525a c8525a) {
        C2668g.b(c8525a, "<set-?>");
        this.f34953b = c8525a;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8525a c8525a = this.f34953b;
        if (c8525a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c8525a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode()) {
            mo11135a();
        }
        setLayoutParams(C8529a.f30276a.m36495c());
        FrameLayout.inflate(getContext(), R.layout.view_match_attribution_icon, this);
    }

    /* renamed from: a */
    public void m42976a(@NotNull Attribution attribution) {
        C2668g.b(attribution, "item");
        if (isAttachedToWindow()) {
            C8525a c8525a;
            c8525a = this.f34953b;
            if (c8525a == null) {
                C2668g.b("presenter");
            }
            c8525a.m36489b(attribution);
            return;
        }
        m42974b();
        c8525a = this.f34953b;
        if (c8525a == null) {
            C2668g.b("presenter");
        }
        c8525a.m36487a(attribution);
    }

    /* renamed from: b */
    private final void m42974b() {
        getMatchAttributionIcon().setImageDrawable(null);
    }

    public void enableShimmer() {
        getShimmerFrameLayout().setEnabled(true);
        C8587g.m36614a(getMatchAttributionIconFastMatchBackground(), true);
    }

    public void disableShimmer() {
        getShimmerFrameLayout().setEnabled(false);
        C8587g.m36614a(getMatchAttributionIconFastMatchBackground(), false);
    }

    public void showBadgeAttribution(@NotNull Attribution attribution) {
        C2668g.b(attribution, "attribution");
        getMatchAttributionIcon().setVisibility(0);
        switch (C8528a.f30275a[attribution.ordinal()]) {
            case 1:
                attribution = null;
                break;
            case 2:
                attribution = getBoostIndicator();
                break;
            case 3:
                attribution = getSuperlikeIndicator();
                break;
            case 4:
                attribution = this.f34957f;
                break;
            case 5:
                attribution = this.f34958g;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (attribution != null) {
            getMatchAttributionIcon().setImageDrawable(attribution);
        }
    }

    public void hideBadgeAttribution() {
        getMatchAttributionIcon().setVisibility(8);
        getMatchAttributionIcon().setImageDrawable(null);
    }
}
