package com.tinder.recsads.view;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tinder.cardstack.model.C8395a;
import com.tinder.recs.view.RecCardView;
import com.tinder.recs.view.tappablecards.TappableCarouselView;
import com.tinder.recsads.C14760n.C14758d;
import com.tinder.recsads.C14760n.C14759e;
import com.tinder.recsads.model.BrandedProfileCardAd;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bJ\u0010\u0010#\u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020&H\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003J\b\u0010*\u001a\u00020!H\u0014J\b\u0010+\u001a\u00020!H\u0007J\b\u0010,\u001a\u00020!H\u0014J\u0018\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0015H\u0014J\u0018\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u0015H\u0002J\u000e\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u0015R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/tinder/recsads/view/BrandedProfileCardRecCardView;", "T", "Lcom/tinder/cardstack/model/Card;", "Lcom/tinder/recs/view/RecCardView;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ad", "Lcom/tinder/recsads/model/BrandedProfileCardAd;", "bottomGradient", "Landroid/view/View;", "cardInfoContainer", "getCardInfoContainer", "()Landroid/view/View;", "carouselView", "Lcom/tinder/recs/view/tappablecards/TappableCarouselView;", "Landroid/graphics/drawable/Drawable;", "<set-?>", "", "currentImageIndex", "getCurrentImageIndex", "()I", "setCurrentImageIndex", "(I)V", "gradientParams", "Landroid/widget/FrameLayout$LayoutParams;", "subtitleView", "Landroid/widget/TextView;", "titleView", "bindBrandedProfileCardAd", "", "brandedProfileCardAd", "bindCarouselView", "bindSubtitleView", "subtitle", "", "bindTitleView", "title", "findTappableCarouselView", "onAttachedToWindow", "onDestroy", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "showCarouselImage", "drawable", "imageIndex", "showPhotoAtIndex", "index", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public abstract class BrandedProfileCardRecCardView<T extends C8395a<?>> extends RecCardView<T> implements LifecycleObserver {
    /* renamed from: a */
    private int f14036a;
    /* renamed from: b */
    private final TextView f14037b;
    /* renamed from: c */
    private final TextView f14038c;
    /* renamed from: d */
    private final TappableCarouselView<Drawable> f14039d;
    /* renamed from: e */
    private final View f14040e;
    /* renamed from: f */
    private BrandedProfileCardAd f14041f;
    @NotNull
    /* renamed from: g */
    private final View f14042g;
    /* renamed from: h */
    private final LayoutParams f14043h;

    @JvmOverloads
    public /* synthetic */ BrandedProfileCardRecCardView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    @JvmOverloads
    public BrandedProfileCardRecCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        this.f14043h = new LayoutParams(-1, 0, 80);
        setLayoutParams((ViewGroup.LayoutParams) new LayoutParams(-1, -1));
        LayoutInflater.from(context).inflate(C14759e.branded_profile_card_rec_card_view, this);
        this.f14039d = m17338a();
        Object findViewById = findViewById(C14758d.ads_card_title);
        C2668g.m10305a(findViewById, "findViewById(R.id.ads_card_title)");
        this.f14037b = (TextView) findViewById;
        findViewById = findViewById(C14758d.ads_card_sub_title);
        C2668g.m10305a(findViewById, "findViewById(R.id.ads_card_sub_title)");
        this.f14038c = (TextView) findViewById;
        findViewById = findViewById(C14758d.display_ad_bottom_gradient);
        C2668g.m10305a(findViewById, "findViewById(R.id.display_ad_bottom_gradient)");
        this.f14040e = findViewById;
        findViewById = findViewById(C14758d.bpc_card_info_container);
        C2668g.m10305a(findViewById, "findViewById(R.id.bpc_card_info_container)");
        this.f14042g = findViewById;
        initializeCardStampsDecoration();
        context = cardStampsDecoration();
        if (context != null) {
            context.setShowSuperlikeStamp(false);
        }
    }

    private final void setCurrentImageIndex(int i) {
        this.f14036a = i;
    }

    public final int getCurrentImageIndex() {
        return this.f14036a;
    }

    @NotNull
    protected final View getCardInfoContainer() {
        return this.f14042g;
    }

    /* renamed from: a */
    public final void m17347a(@NotNull BrandedProfileCardAd brandedProfileCardAd) {
        C2668g.m10309b(brandedProfileCardAd, "brandedProfileCardAd");
        this.f14041f = brandedProfileCardAd;
        brandedProfileCardAd = this.f14041f;
        if (brandedProfileCardAd == null) {
            C2668g.m10310b("ad");
        }
        m17343a(brandedProfileCardAd.title());
        brandedProfileCardAd = this.f14041f;
        if (brandedProfileCardAd == null) {
            C2668g.m10310b("ad");
        }
        m17345b(brandedProfileCardAd.subtitle());
        brandedProfileCardAd = this.f14041f;
        if (brandedProfileCardAd == null) {
            C2668g.m10310b("ad");
        }
        m17344b(brandedProfileCardAd);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
        }
        ((AppCompatActivity) context).getLifecycle().mo36a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
        }
        ((AppCompatActivity) context).getLifecycle().mo37b(this);
    }

    protected void onMeasure(int i, int i2) {
        this.f14043h.height = MeasureSpec.getSize(i2) / 3;
        this.f14040e.setLayoutParams(this.f14043h);
        super.onMeasure(i, i2);
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onDestroy() {
        BrandedProfileCardAd brandedProfileCardAd = this.f14041f;
        if (brandedProfileCardAd == null) {
            C2668g.m10310b("ad");
        }
        brandedProfileCardAd.destroy();
    }

    /* renamed from: a */
    public final void m17346a(int i) {
        this.f14036a = i;
        i = this.f14041f;
        if (i == 0) {
            C2668g.m10310b("ad");
        }
        m17340a((Drawable) i.imageDrawables().get(this.f14036a), this.f14036a);
    }

    /* renamed from: a */
    private final void m17343a(String str) {
        this.f14037b.setText(str);
    }

    /* renamed from: b */
    private final void m17345b(String str) {
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            this.f14038c.setVisibility(8);
            return;
        }
        this.f14038c.setText(charSequence);
        this.f14038c.setVisibility(0);
    }

    /* renamed from: b */
    private final void m17344b(BrandedProfileCardAd brandedProfileCardAd) {
        this.f14036a = 0;
        this.f14039d.clearImage();
        if (brandedProfileCardAd.images().isEmpty()) {
            this.f14039d.setPageCount(0);
            this.f14039d.setOnTapListener(null);
            return;
        }
        this.f14039d.setPageCount(brandedProfileCardAd.images().size());
        m17340a((Drawable) brandedProfileCardAd.imageDrawables().get(this.f14036a), this.f14036a);
        this.f14039d.setOnTapListener(new BrandedProfileCardRecCardView$a(this, brandedProfileCardAd));
    }

    /* renamed from: a */
    private final void m17340a(Drawable drawable, int i) {
        this.f14039d.setImage(drawable);
        this.f14039d.setActivePage(i);
    }

    /* renamed from: a */
    private final TappableCarouselView<Drawable> m17338a() {
        View findViewById = findViewById(C14758d.bpc_carousel_view);
        if (findViewById != null) {
            return (TappableCarouselView) findViewById;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.view.tappablecards.TappableCarouselView<android.graphics.drawable.Drawable>");
    }
}
