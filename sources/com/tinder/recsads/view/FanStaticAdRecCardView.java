package com.tinder.recsads.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.NativeAd.Image;
import com.tinder.addy.Ad;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.recs.view.RecCardView;
import com.tinder.recsads.C14760n.C14756b;
import com.tinder.recsads.C14760n.C14758d;
import com.tinder.recsads.C14760n.C14759e;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.C16466d;
import com.tinder.recsads.p466a.C16428a;
import com.tinder.recsads.view.listeners.DispatchTouchDownListener;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bH\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0002H\u0016J\u0010\u0010)\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020%H\u0002J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0002H\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0002H\u0016J\b\u00100\u001a\u00020%H\u0002J\u001a\u00101\u001a\u00020%2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0002J\u0018\u00106\u001a\u00020%2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\b\u00107\u001a\u00020%H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/tinder/recsads/view/FanStaticAdRecCardView;", "Lcom/tinder/recs/view/RecCardView;", "Lcom/tinder/recsads/card/AdRecCard;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adBody", "Landroid/widget/TextView;", "adCallToAction", "Lcom/tinder/recsads/view/RedGradientFillButtonView;", "adChoicesContainer", "Landroid/widget/FrameLayout;", "adChoicesUrl", "", "adContainer", "Landroid/widget/LinearLayout;", "adIconView", "Landroid/widget/ImageView;", "adMediaView", "Lcom/tinder/recsads/view/DispatchTouchDownListenerMediaView;", "adSponsorLabel", "adSponsorName", "Lcom/tinder/recsads/view/DispatchTouchDownListenerTextView;", "adTitle", "fanAd", "Lcom/tinder/recsads/model/RecsFanStaticAd;", "listener", "Lcom/tinder/recsads/view/FanStaticAdRecCardView$Listener;", "getListener", "()Lcom/tinder/recsads/view/FanStaticAdRecCardView$Listener;", "setListener", "(Lcom/tinder/recsads/view/FanStaticAdRecCardView$Listener;)V", "materialTouchDelegateSize", "", "addAdChoicesView", "", "ad", "bind", "recCard", "bindFanAd", "expandSponsoredTouchDelegate", "onAttachedToCardCollectionLayout", "cardCollectionLayout", "Lcom/tinder/cardstack/view/CardCollectionLayout;", "onMovedToTop", "onRemovedFromTop", "openAdChoices", "resizeNativeAdViewHeight", "nativeAdView", "Landroid/view/View;", "adCoverImage", "Lcom/facebook/ads/NativeAd$Image;", "setNativeAdViewLayoutParameters", "showFanAd", "Listener", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class FanStaticAdRecCardView extends RecCardView<C16428a> {
    /* renamed from: a */
    private final DispatchTouchDownListenerMediaView f56001a;
    /* renamed from: b */
    private final DispatchTouchDownListenerTextView f56002b;
    /* renamed from: c */
    private final LinearLayout f56003c;
    /* renamed from: d */
    private final ImageView f56004d;
    /* renamed from: e */
    private final DispatchTouchDownListenerTextView f56005e;
    /* renamed from: f */
    private final TextView f56006f;
    /* renamed from: g */
    private final TextView f56007g;
    /* renamed from: h */
    private final FrameLayout f56008h;
    /* renamed from: i */
    private final RedGradientFillButtonView f56009i;
    /* renamed from: j */
    private String f56010j;
    /* renamed from: k */
    private C16466d f56011k;
    /* renamed from: l */
    private int f56012l;
    @Nullable
    /* renamed from: m */
    private Listener f56013m;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/tinder/recsads/view/FanStaticAdRecCardView$Listener;", "", "onAdCardRemoved", "", "ad", "Lcom/tinder/addy/Ad;", "onAdImageClicked", "onAdTitleClicked", "onAdViewed", "onCallToActionClicked", "onSponsoredClicked", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onAdCardRemoved(@NotNull Ad ad);

        void onAdImageClicked(@NotNull Ad ad);

        void onAdTitleClicked(@NotNull Ad ad);

        void onAdViewed(@NotNull Ad ad);

        void onCallToActionClicked(@NotNull Ad ad);

        void onSponsoredClicked(@NotNull Ad ad);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanStaticAdRecCardView$a */
    static final class C14765a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ FanStaticAdRecCardView f46326a;

        C14765a(FanStaticAdRecCardView fanStaticAdRecCardView) {
            this.f46326a = fanStaticAdRecCardView;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f46326a.f56007g.getHitRect(rect);
            rect.bottom = rect.top + this.f46326a.f56012l;
            ViewParent parent = this.f46326a.f56007g.getParent();
            if (parent == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f46326a.f56007g));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recsads/view/FanStaticAdRecCardView$resizeNativeAdViewHeight$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/tinder/recsads/view/FanStaticAdRecCardView;Landroid/view/View;Lcom/facebook/ads/NativeAd$Image;)V", "onGlobalLayout", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanStaticAdRecCardView$b */
    public static final class C14766b implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ FanStaticAdRecCardView f46327a;
        /* renamed from: b */
        final /* synthetic */ View f46328b;
        /* renamed from: c */
        final /* synthetic */ Image f46329c;

        C14766b(FanStaticAdRecCardView fanStaticAdRecCardView, View view, Image image) {
            this.f46327a = fanStaticAdRecCardView;
            this.f46328b = view;
            this.f46329c = image;
        }

        public void onGlobalLayout() {
            this.f46327a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f46327a.m65468b(this.f46328b, this.f46329c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recsads/view/FanStaticAdRecCardView$showFanAd$2", "Lcom/tinder/recsads/view/listeners/DispatchTouchDownListener;", "(Lcom/tinder/recsads/view/FanStaticAdRecCardView;)V", "onDispatchTouchEvent", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanStaticAdRecCardView$c */
    public static final class C16474c implements DispatchTouchDownListener {
        /* renamed from: a */
        final /* synthetic */ FanStaticAdRecCardView f51126a;

        C16474c(FanStaticAdRecCardView fanStaticAdRecCardView) {
            this.f51126a = fanStaticAdRecCardView;
        }

        public void onDispatchTouchEvent() {
            C16466d a = this.f51126a.f56011k;
            if (a != null) {
                Listener listener = this.f51126a.getListener();
                if (listener != null) {
                    listener.onAdTitleClicked(a);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recsads/view/FanStaticAdRecCardView$showFanAd$3", "Lcom/tinder/recsads/view/listeners/DispatchTouchDownListener;", "(Lcom/tinder/recsads/view/FanStaticAdRecCardView;)V", "onDispatchTouchEvent", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanStaticAdRecCardView$d */
    public static final class C16475d implements DispatchTouchDownListener {
        /* renamed from: a */
        final /* synthetic */ FanStaticAdRecCardView f51127a;

        C16475d(FanStaticAdRecCardView fanStaticAdRecCardView) {
            this.f51127a = fanStaticAdRecCardView;
        }

        public void onDispatchTouchEvent() {
            C16466d a = this.f51127a.f56011k;
            if (a != null) {
                Listener listener = this.f51127a.getListener();
                if (listener != null) {
                    listener.onAdImageClicked(a);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recsads/view/FanStaticAdRecCardView$showFanAd$4", "Lcom/tinder/recsads/view/listeners/DispatchTouchDownListener;", "(Lcom/tinder/recsads/view/FanStaticAdRecCardView;)V", "onDispatchTouchEvent", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanStaticAdRecCardView$e */
    public static final class C16476e implements DispatchTouchDownListener {
        /* renamed from: a */
        final /* synthetic */ FanStaticAdRecCardView f51128a;

        C16476e(FanStaticAdRecCardView fanStaticAdRecCardView) {
            this.f51128a = fanStaticAdRecCardView;
        }

        public void onDispatchTouchEvent() {
            C16466d a = this.f51128a.f56011k;
            if (a != null) {
                Listener listener = this.f51128a.getListener();
                if (listener != null) {
                    listener.onAdTitleClicked(a);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/recsads/view/FanStaticAdRecCardView$showFanAd$5", "Lcom/tinder/recsads/view/listeners/DispatchTouchDownListener;", "(Lcom/tinder/recsads/view/FanStaticAdRecCardView;)V", "onDispatchTouchEvent", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.FanStaticAdRecCardView$f */
    public static final class C16477f implements DispatchTouchDownListener {
        /* renamed from: a */
        final /* synthetic */ FanStaticAdRecCardView f51129a;

        C16477f(FanStaticAdRecCardView fanStaticAdRecCardView) {
            this.f51129a = fanStaticAdRecCardView;
        }

        public void onDispatchTouchEvent() {
            C16466d a = this.f51129a.f56011k;
            if (a != null) {
                Listener listener = this.f51129a.getListener();
                if (listener != null) {
                    listener.onCallToActionClicked(a);
                }
            }
        }
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m65475c((C16428a) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m65475c((C16428a) obj);
    }

    public /* synthetic */ void onMovedToTop(C8395a c8395a) {
        m65473a((C16428a) c8395a);
    }

    public /* synthetic */ void onMovedToTop(Object obj) {
        m65473a((C16428a) obj);
    }

    public /* synthetic */ void onRemovedFromTop(C8395a c8395a) {
        m65474b((C16428a) c8395a);
    }

    public /* synthetic */ void onRemovedFromTop(Object obj) {
        m65474b((C16428a) obj);
    }

    public /* synthetic */ FanStaticAdRecCardView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public FanStaticAdRecCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        setLayoutParams((LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        LayoutInflater.from(context).inflate(C14759e.fan_static_ad_rec_card_view, this);
        attributeSet = findViewById(C14758d.fan_ad_media_view);
        C2668g.a(attributeSet, "findViewById(R.id.fan_ad_media_view)");
        this.f56001a = (DispatchTouchDownListenerMediaView) attributeSet;
        attributeSet = findViewById(C14758d.fan_ad_title);
        C2668g.a(attributeSet, "findViewById(R.id.fan_ad_title)");
        this.f56002b = (DispatchTouchDownListenerTextView) attributeSet;
        attributeSet = findViewById(C14758d.fan_ad_native_ad_unit);
        C2668g.a(attributeSet, "findViewById(R.id.fan_ad_native_ad_unit)");
        this.f56003c = (LinearLayout) attributeSet;
        attributeSet = findViewById(C14758d.fan_ad_sponsor_logo);
        C2668g.a(attributeSet, "findViewById(R.id.fan_ad_sponsor_logo)");
        this.f56004d = (ImageView) attributeSet;
        attributeSet = findViewById(C14758d.fan_ad_sponsor_name);
        C2668g.a(attributeSet, "findViewById(R.id.fan_ad_sponsor_name)");
        this.f56005e = (DispatchTouchDownListenerTextView) attributeSet;
        attributeSet = findViewById(C14758d.fan_ad_sponsor_label);
        C2668g.a(attributeSet, "findViewById(R.id.fan_ad_sponsor_label)");
        this.f56007g = (TextView) attributeSet;
        attributeSet = findViewById(C14758d.fan_ad_description);
        C2668g.a(attributeSet, "findViewById(R.id.fan_ad_description)");
        this.f56006f = (TextView) attributeSet;
        attributeSet = findViewById(C14758d.ad_choices_container);
        C2668g.a(attributeSet, "findViewById(R.id.ad_choices_container)");
        this.f56008h = (FrameLayout) attributeSet;
        attributeSet = findViewById(C14758d.fan_ad_action);
        C2668g.a(attributeSet, "findViewById(R.id.fan_ad_action)");
        this.f56009i = (RedGradientFillButtonView) attributeSet;
        this.f56012l = context.getResources().getDimensionPixelSize(C14756b.space_xxl);
        this.f56007g.setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.m65467b();
            }
        });
        onFinishInflate();
    }

    @Nullable
    public final Listener getListener() {
        return this.f56013m;
    }

    public final void setListener(@Nullable Listener listener) {
        this.f56013m = listener;
    }

    /* renamed from: a */
    public void m65473a(@NotNull C16428a c16428a) {
        C2668g.b(c16428a, "recCard");
        super.onMovedToTop(c16428a);
        c16428a = ((C16464a) c16428a.getItem()).m61877c();
        if (c16428a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsFanStaticAd");
        }
        C16466d c16466d = (C16466d) c16428a;
        Listener listener = this.f56013m;
        if (listener != null) {
            listener.onAdViewed(c16466d);
        }
        this.f56009i.m61912b();
    }

    /* renamed from: b */
    public void m65474b(@NotNull C16428a c16428a) {
        C2668g.b(c16428a, "recCard");
        super.onRemovedFromTop(c16428a);
        c16428a = ((C16464a) c16428a.getItem()).m61877c();
        if (c16428a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsFanStaticAd");
        }
        C16466d c16466d = (C16466d) c16428a;
        Listener listener = this.f56013m;
        if (listener != null) {
            listener.onAdCardRemoved(c16466d);
        }
        this.f56009i.m61911a();
    }

    public void onAttachedToCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.b(cardCollectionLayout, "cardCollectionLayout");
        super.onAttachedToCardCollectionLayout(cardCollectionLayout);
        m65462a();
        cardCollectionLayout = cardStampsDecoration();
        if (cardCollectionLayout != null) {
            cardCollectionLayout.setShowSuperlikeStamp(false);
        }
    }

    /* renamed from: c */
    public void m65475c(@NotNull C16428a c16428a) {
        C2668g.b(c16428a, "recCard");
        super.bind(c16428a);
        c16428a = ((C16464a) c16428a.getItem()).m61877c();
        if (c16428a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsFanStaticAd");
        }
        C16466d c16466d = (C16466d) c16428a;
        m65469b(c16466d);
        m65464a(c16466d);
    }

    /* renamed from: a */
    private final void m65464a(C16466d c16466d) {
        this.f56011k = c16466d;
        this.f56010j = c16466d.m61878a().getAdChoicesLinkUrl();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m65462a() {
        /*
        r4 = this;
        r0 = r4.f56011k;
        r1 = 0;
        if (r0 == 0) goto L_0x000a;
    L_0x0005:
        r0 = r0.m61878a();
        goto L_0x000b;
    L_0x000a:
        r0 = r1;
    L_0x000b:
        r2 = r4.f56001a;
        r2 = (android.view.View) r2;
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r3 = r0.getAdCoverImage();
        goto L_0x0017;
    L_0x0016:
        r3 = r1;
    L_0x0017:
        r4.m65463a(r2, r3);
        r2 = r4.f56002b;
        if (r0 == 0) goto L_0x0027;
    L_0x001e:
        r3 = r0.getAdSocialContext();
        if (r3 == 0) goto L_0x0027;
    L_0x0024:
        r3 = (java.lang.CharSequence) r3;
        goto L_0x0030;
    L_0x0027:
        if (r0 == 0) goto L_0x002e;
    L_0x0029:
        r3 = r0.getAdTitle();
        goto L_0x0024;
    L_0x002e:
        r3 = r1;
        goto L_0x0024;
    L_0x0030:
        r2.setText(r3);
        r2 = r4.f56006f;
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r3 = r0.getAdRawBody();
        goto L_0x003d;
    L_0x003c:
        r3 = r1;
    L_0x003d:
        r3 = (java.lang.CharSequence) r3;
        r2.setText(r3);
        r2 = r4.f56009i;
        if (r0 == 0) goto L_0x004b;
    L_0x0046:
        r3 = r0.getAdCallToAction();
        goto L_0x004c;
    L_0x004b:
        r3 = r1;
    L_0x004c:
        r3 = java.lang.String.valueOf(r3);
        r3 = (java.lang.CharSequence) r3;
        r2.setText(r3);
        r2 = r4.f56001a;
        r2.setNativeAd(r0);
        if (r0 == 0) goto L_0x0077;
    L_0x005c:
        r2 = r0.getAdIcon();
        if (r2 == 0) goto L_0x0077;
    L_0x0062:
        r3 = r4.getContext();
        r3 = com.bumptech.glide.C0994i.b(r3);
        r2 = r2.getUrl();
        r2 = r3.a(r2);
        r3 = r4.f56004d;
        r2.a(r3);
    L_0x0077:
        r2 = r4.f56005e;
        if (r0 == 0) goto L_0x007f;
    L_0x007b:
        r1 = r0.getAdTitle();
    L_0x007f:
        r1 = (java.lang.CharSequence) r1;
        r2.setText(r1);
        r1 = 5;
        r1 = new android.view.View[r1];
        r2 = 0;
        r3 = r4.f56002b;
        r3 = (android.view.View) r3;
        r1[r2] = r3;
        r2 = 1;
        r3 = r4.f56005e;
        r3 = (android.view.View) r3;
        r1[r2] = r3;
        r2 = 2;
        r3 = r4.f56009i;
        r3 = (android.view.View) r3;
        r1[r2] = r3;
        r2 = 3;
        r3 = r4.f56001a;
        r3 = (android.view.View) r3;
        r1[r2] = r3;
        r2 = 4;
        r3 = r4.f56004d;
        r3 = (android.view.View) r3;
        r1[r2] = r3;
        r1 = kotlin.collections.C17554o.m64199b(r1);
        if (r0 == 0) goto L_0x00b7;
    L_0x00b0:
        r2 = r4.f56003c;
        r2 = (android.view.View) r2;
        r0.registerViewForInteraction(r2, r1);
    L_0x00b7:
        r0 = r4.f56005e;
        r1 = new com.tinder.recsads.view.FanStaticAdRecCardView$c;
        r1.<init>(r4);
        r1 = (com.tinder.recsads.view.listeners.DispatchTouchDownListener) r1;
        r0.setOnDispatchTouchEventListener(r1);
        r0 = r4.f56001a;
        r1 = new com.tinder.recsads.view.FanStaticAdRecCardView$d;
        r1.<init>(r4);
        r1 = (com.tinder.recsads.view.listeners.DispatchTouchDownListener) r1;
        r0.setOnDispatchTouchEventListener(r1);
        r0 = r4.f56002b;
        r1 = new com.tinder.recsads.view.FanStaticAdRecCardView$e;
        r1.<init>(r4);
        r1 = (com.tinder.recsads.view.listeners.DispatchTouchDownListener) r1;
        r0.setOnDispatchTouchEventListener(r1);
        r0 = r4.f56009i;
        r1 = new com.tinder.recsads.view.FanStaticAdRecCardView$f;
        r1.<init>(r4);
        r1 = (com.tinder.recsads.view.listeners.DispatchTouchDownListener) r1;
        r0.setOnDispatchTouchEventListener(r1);
        r4.m65471c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recsads.view.FanStaticAdRecCardView.a():void");
    }

    /* renamed from: b */
    private final void m65467b() {
        C16466d c16466d = this.f56011k;
        if (c16466d != null) {
            Listener listener = this.f56013m;
            if (listener != null) {
                listener.onSponsoredClicked(c16466d);
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f56010j));
        Context context = getContext();
        C2668g.a(context, "context");
        if (!context.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            getContext().startActivity(intent);
        }
    }

    /* renamed from: b */
    private final void m65469b(C16466d c16466d) {
        this.f56008h.removeAllViews();
        this.f56008h.addView(new AdChoicesView(getContext(), c16466d.m61878a(), true));
    }

    /* renamed from: a */
    private final void m65463a(View view, Image image) {
        if (image != null) {
            if (getWidth() != 0) {
                m65468b(view, image);
            } else {
                getViewTreeObserver().addOnGlobalLayoutListener(new C14766b(this, view, image));
            }
        }
    }

    /* renamed from: b */
    private final void m65468b(View view, Image image) {
        int width = image.getWidth();
        image = image.getHeight();
        View rootView = getRootView();
        C2668g.a(rootView, "rootView");
        int height = rootView.getHeight();
        int width2 = getWidth();
        view.setLayoutParams(new LinearLayout.LayoutParams(width2, Math.min((int) ((((double) width2) / ((double) width)) * ((double) image)), height / 3)));
    }

    /* renamed from: c */
    private final void m65471c() {
        ViewParent parent = this.f56007g.getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        ((View) parent).post(new C14765a(this));
    }
}
