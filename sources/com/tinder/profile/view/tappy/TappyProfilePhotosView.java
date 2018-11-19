package com.tinder.profile.view.tappy;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.R;
import com.tinder.profile.view.ProfilePhotosView;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import kotlin.C15810e;
import kotlin.C15813i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 *2\u00020\u0001:\u0001*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010%\u001a\u00020\bH\u0014J\b\u0010&\u001a\u00020!H\u0014J\b\u0010'\u001a\u00020\u0015H\u0014J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010)\u001a\u00020\u0015H\u0014R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nRW\u0010\r\u001aK\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u000ej\u0002`\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8FX\u0002¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/tinder/profile/view/tappy/TappyProfilePhotosView;", "Lcom/tinder/profile/view/ProfilePhotosView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "indicator", "Lcom/tinder/profile/view/tappy/TappyViewPagerIndicator;", "getIndicator", "()Lcom/tinder/profile/view/tappy/TappyViewPagerIndicator;", "indicator$delegate", "Lkotlin/Lazy;", "onTapListener", "Lkotlin/Function3;", "Lcom/tinder/recs/view/tappablecards/TapRegionDetector$TapRegion;", "Lkotlin/ParameterName;", "name", "region", "", "selectedPage", "", "isOverTap", "", "Lcom/tinder/profile/view/tappy/OnTapListener;", "overTapAnimationDistance", "", "overTapAnimator", "Landroid/animation/ObjectAnimator;", "getOverTapAnimator", "()Landroid/animation/ObjectAnimator;", "overTapAnimator$delegate", "tappablePager", "Lcom/tinder/profile/view/tappy/TappableViewPager;", "getTappablePager", "()Lcom/tinder/profile/view/tappy/TappableViewPager;", "tappablePager$delegate", "getPageIndicator", "getViewPager", "shouldShowSinglePageIndicator", "startOverTapAnimation", "viewPagerInterceptsClicks", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappyProfilePhotosView extends ProfilePhotosView {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f55457a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TappyProfilePhotosView.class), "tappablePager", "getTappablePager()Lcom/tinder/profile/view/tappy/TappableViewPager;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TappyProfilePhotosView.class), "indicator", "getIndicator()Lcom/tinder/profile/view/tappy/TappyViewPagerIndicator;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TappyProfilePhotosView.class), "overTapAnimator", "getOverTapAnimator()Landroid/animation/ObjectAnimator;"))};
    /* renamed from: b */
    public static final C14457a f55458b = new C14457a();
    @NotNull
    /* renamed from: c */
    private final Lazy f55459c = C15810e.m59832a(LazyThreadSafetyMode.NONE, new TappyProfilePhotosView$$special$$inlined$bindView$1(this, R.id.profile_tappy_carousel_view_pager));
    @NotNull
    /* renamed from: d */
    private final Lazy f55460d = C15810e.m59832a(LazyThreadSafetyMode.NONE, new TappyProfilePhotosView$$special$$inlined$bindView$2(this, R.id.profile_tappy_carousel_page_indicator));
    /* renamed from: e */
    private final Lazy f55461e = C15810e.m59833a((Function0) new TappyProfilePhotosView$overTapAnimator$2(this));
    /* renamed from: f */
    private final float f55462f;
    /* renamed from: g */
    private final Function3<TapRegion, Integer, Boolean, C15813i> f55463g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/profile/view/tappy/TappyProfilePhotosView$Companion;", "", "()V", "OVER_TAP_ANIMATOR_DURATION", "", "OVER_TAP_ANIMATOR_REPEAT_COUNT", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.tappy.TappyProfilePhotosView$a */
    public static final class C14457a {
        private C14457a() {
        }
    }

    private final ObjectAnimator getOverTapAnimator() {
        Lazy lazy = this.f55461e;
        KProperty kProperty = f55457a[2];
        return (ObjectAnimator) lazy.getValue();
    }

    /* renamed from: a */
    protected boolean mo13484a() {
        return true;
    }

    /* renamed from: b */
    protected boolean mo13485b() {
        return true;
    }

    @NotNull
    public final TappyViewPagerIndicator getIndicator() {
        Lazy lazy = this.f55460d;
        KProperty kProperty = f55457a[1];
        return (TappyViewPagerIndicator) lazy.getValue();
    }

    @NotNull
    public final TappableViewPager getTappablePager() {
        Lazy lazy = this.f55459c;
        KProperty kProperty = f55457a[0];
        return (TappableViewPager) lazy.getValue();
    }

    public TappyProfilePhotosView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        this.f55462f = context.getResources().getDimension(R.dimen.tappy_profile_over_tap_distance);
        this.f55463g = (Function3) new TappyProfilePhotosView$onTapListener$1(this);
        View.inflate(context, R.layout.merge_tappy_profile_photos_view, this);
        getTappablePager().setOnTapListener(this.f55463g);
    }

    @NotNull
    protected TappableViewPager getViewPager() {
        return getTappablePager();
    }

    @NotNull
    protected TappyViewPagerIndicator getPageIndicator() {
        return getIndicator();
    }

    /* renamed from: a */
    private final void m64964a(TapRegion tapRegion) {
        if (!getOverTapAnimator().isRunning()) {
            float f = this.f55462f * ((float) (tapRegion == TapRegion.LEFT ? true : -1));
            getOverTapAnimator().setFloatValues(new float[]{0.0f, f});
            getOverTapAnimator().start();
        }
    }
}
