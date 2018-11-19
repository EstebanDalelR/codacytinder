package com.tinder.recsads.view;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.C2412j.C2411a;
import com.google.android.gms.ads.formats.C2353b;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.cardstack.view.CardView;
import com.tinder.recs.view.RecCardView;
import com.tinder.recsads.C14760n.C14758d;
import com.tinder.recsads.C14760n.C14759e;
import com.tinder.recsads.NativeCardListener;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.RecsNativeVideoAd;
import com.tinder.recsads.p466a.C16428a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011*\u0001%\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004:\u0001EB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0004J\u000e\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u001cJ\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u000202H&J\u0010\u00103\u001a\u00020(2\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020(H\u0014J\b\u00107\u001a\u00020(H\u0016J\u0006\u00108\u001a\u00020(J\b\u00109\u001a\u00020(H&J\b\u0010:\u001a\u00020(H\u0007J\b\u0010;\u001a\u00020(H\u0014J\u0010\u0010<\u001a\u00020(2\u0006\u00100\u001a\u00020\u0002H\u0016J\u0006\u0010=\u001a\u00020(J\b\u0010>\u001a\u00020(H\u0007J\u0006\u0010?\u001a\u00020(J\u0010\u0010@\u001a\u00020(2\u0006\u00100\u001a\u00020\u0002H\u0016J\b\u0010A\u001a\u00020(H\u0007J\b\u0010B\u001a\u00020(H\u0002J\b\u0010C\u001a\u00020(H\u0002J\u000e\u0010D\u001a\u00020(2\u0006\u0010.\u001a\u00020\u001cR\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u00020%X\u0004¢\u0006\u0004\n\u0002\u0010&¨\u0006F"}, d2 = {"Lcom/tinder/recsads/view/NativeVideoAdRecCard;", "Lcom/tinder/recs/view/RecCardView;", "Lcom/tinder/recsads/card/AdRecCard;", "Lcom/tinder/cardstack/view/CardView;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ad", "Lcom/tinder/recsads/model/RecsNativeVideoAd;", "adRec", "Lcom/tinder/recsads/model/AdRec;", "clickthroughView", "Landroid/view/View;", "contentStub", "Landroid/view/ViewStub;", "isPlaying", "", "listener", "Lcom/tinder/recsads/view/NativeVideoAdRecCard$Listener;", "getListener", "()Lcom/tinder/recsads/view/NativeVideoAdRecCard$Listener;", "setListener", "(Lcom/tinder/recsads/view/NativeVideoAdRecCard$Listener;)V", "muteButton", "Landroid/widget/ImageView;", "nativeCardListeners", "", "Lcom/tinder/recsads/NativeCardListener;", "nativeVideoClickListener", "Landroid/view/View$OnClickListener;", "playPauseButton", "progress", "Landroid/widget/ProgressBar;", "videoController", "Lcom/google/android/gms/ads/VideoController;", "videoLifecycleCallbacks", "com/tinder/recsads/view/NativeVideoAdRecCard$videoLifecycleCallbacks$1", "Lcom/tinder/recsads/view/NativeVideoAdRecCard$videoLifecycleCallbacks$1;", "addMediaViewToContentView", "", "container", "Landroid/view/ViewGroup;", "mediaView", "Lcom/google/android/gms/ads/formats/MediaView;", "addNativeCardListener", "cardListener", "bind", "recCard", "getAdViewLayoutResourceId", "", "onAttachedToCardCollectionLayout", "cardCollectionLayout", "Lcom/tinder/cardstack/view/CardCollectionLayout;", "onAttachedToWindow", "onCardViewRecycled", "onClickThroughViewClick", "onContentInflated", "onDestroy", "onDetachedFromWindow", "onMovedToTop", "onMuteUnmuteButtonClick", "onPause", "onPlayPauseButtonClick", "onRemovedFromTop", "onResume", "pause", "play", "removeNativeCardListener", "Listener", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public abstract class NativeVideoAdRecCard extends RecCardView<C16428a> implements LifecycleObserver, CardView<C16428a> {
    /* renamed from: a */
    private final ImageView f14053a;
    /* renamed from: b */
    private final ImageView f14054b;
    /* renamed from: c */
    private final ProgressBar f14055c;
    /* renamed from: d */
    private final ViewStub f14056d;
    /* renamed from: e */
    private final View f14057e;
    @Nullable
    /* renamed from: f */
    private NativeVideoAdRecCard$Listener f14058f;
    /* renamed from: g */
    private final Set<NativeCardListener> f14059g = new LinkedHashSet();
    /* renamed from: h */
    private RecsNativeVideoAd f14060h;
    /* renamed from: i */
    private C16464a f14061i;
    /* renamed from: j */
    private C2412j f14062j;
    /* renamed from: k */
    private boolean f14063k = true;
    /* renamed from: l */
    private final OnClickListener f14064l = new NativeVideoAdRecCard$b(this);
    /* renamed from: m */
    private final NativeVideoAdRecCard$c f14065m;

    /* renamed from: a */
    public abstract void m17359a();

    public abstract int getAdViewLayoutResourceId();

    @NotNull
    /* renamed from: c */
    public static final /* synthetic */ RecsNativeVideoAd m17355c(NativeVideoAdRecCard nativeVideoAdRecCard) {
        nativeVideoAdRecCard = nativeVideoAdRecCard.f14060h;
        if (nativeVideoAdRecCard == null) {
            C2668g.m10310b("ad");
        }
        return nativeVideoAdRecCard;
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m17362a((C16428a) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m17362a((C16428a) obj);
    }

    public /* synthetic */ void onMovedToTop(C8395a c8395a) {
        m17364b((C16428a) c8395a);
    }

    public /* synthetic */ void onMovedToTop(Object obj) {
        m17364b((C16428a) obj);
    }

    public /* synthetic */ void onRemovedFromTop(C8395a c8395a) {
        m17366c((C16428a) c8395a);
    }

    public /* synthetic */ void onRemovedFromTop(Object obj) {
        m17366c((C16428a) obj);
    }

    public NativeVideoAdRecCard(@NotNull Context context) {
        C2668g.m10309b(context, "context");
        super(context, null, 2, null);
        android.support.v7.widget.CardView.inflate(context, C14759e.view_native_video, this);
        Object findViewById = findViewById(C14758d.ads_card_play_pause_button);
        C2668g.m10305a(findViewById, "findViewById(R.id.ads_card_play_pause_button)");
        this.f14053a = (ImageView) findViewById;
        findViewById = findViewById(C14758d.ads_card_mute_button);
        C2668g.m10305a(findViewById, "findViewById(R.id.ads_card_mute_button)");
        this.f14054b = (ImageView) findViewById;
        findViewById = findViewById(C14758d.progress_bar);
        C2668g.m10305a(findViewById, "findViewById(R.id.progress_bar)");
        this.f14055c = (ProgressBar) findViewById;
        findViewById = findViewById(C14758d.ads_card_stub);
        C2668g.m10305a(findViewById, "findViewById(R.id.ads_card_stub)");
        this.f14056d = (ViewStub) findViewById;
        findViewById = findViewById(C14758d.ads_card_click_through);
        C2668g.m10305a(findViewById, "findViewById(R.id.ads_card_click_through)");
        this.f14057e = findViewById;
        this.f14053a.setOnClickListener(this.f14064l);
        this.f14054b.setOnClickListener(this.f14064l);
        this.f14057e.setOnClickListener(this.f14064l);
        this.f14065m = new NativeVideoAdRecCard$c(this);
    }

    @Nullable
    public final NativeVideoAdRecCard$Listener getListener() {
        return this.f14058f;
    }

    public final void setListener(@Nullable NativeVideoAdRecCard$Listener nativeVideoAdRecCard$Listener) {
        this.f14058f = nativeVideoAdRecCard$Listener;
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

    /* renamed from: b */
    public void m17364b(@NotNull C16428a c16428a) {
        C2668g.m10309b(c16428a, "recCard");
        super.onMovedToTop((C8395a) c16428a);
        m17357e();
        for (NativeCardListener nativeCardListener : (Iterable) this.f14059g) {
            C16464a c16464a = this.f14061i;
            if (c16464a == null) {
                C2668g.m10310b("adRec");
            }
            nativeCardListener.onCardMovedToTop(c16464a);
        }
    }

    /* renamed from: c */
    public void m17366c(@NotNull C16428a c16428a) {
        C2668g.m10309b(c16428a, "recCard");
        super.onRemovedFromTop((C8395a) c16428a);
        m17358f();
    }

    public void onCardViewRecycled() {
        super.onCardViewRecycled();
        onDestroy();
    }

    public void onAttachedToCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.m10309b(cardCollectionLayout, "cardCollectionLayout");
        super.onAttachedToCardCollectionLayout(cardCollectionLayout);
        cardCollectionLayout = cardStampsDecoration();
        if (cardCollectionLayout != null) {
            cardCollectionLayout.setShowSuperlikeStamp(false);
        }
    }

    /* renamed from: a */
    public void m17362a(@NotNull C16428a c16428a) {
        C2668g.m10309b(c16428a, "recCard");
        super.bind((C8395a) c16428a);
        Object obj = (C16464a) c16428a.getItem();
        C2668g.m10305a(obj, "recCard.item");
        this.f14061i = obj;
        c16428a = ((C16464a) c16428a.getItem()).c();
        if (c16428a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsNativeVideoAd");
        }
        this.f14060h = (RecsNativeVideoAd) c16428a;
        c16428a = this.f14060h;
        if (c16428a == null) {
            C2668g.m10310b("ad");
        }
        this.f14062j = c16428a.getNativeCustomTemplateAd().getVideoController();
        this.f14053a.setVisibility(0);
        this.f14054b.setVisibility(0);
        this.f14056d.setLayoutResource(getAdViewLayoutResourceId());
        this.f14056d.setOnInflateListener(new NativeVideoAdRecCard$a(this));
        if (this.f14056d.getParent() != null) {
            this.f14056d.inflate();
        } else {
            this.f14056d.setVisibility(0);
        }
        c16428a = this.f14062j;
        if (c16428a != null) {
            c16428a.m8747a((C2411a) this.f14065m);
        }
        c16428a = this.f14062j;
        if (c16428a != null) {
            c16428a.m8751c();
        }
        this.f14055c.setVisibility(8);
    }

    /* renamed from: e */
    private final void m17357e() {
        this.f14063k = true;
        C2412j c2412j = this.f14062j;
        if (c2412j != null) {
            c2412j.m8750b();
        }
    }

    /* renamed from: f */
    private final void m17358f() {
        this.f14063k = false;
        C2412j c2412j = this.f14062j;
        if (c2412j != null) {
            c2412j.m8751c();
        }
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        m17357e();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        m17358f();
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onDestroy() {
        RecsNativeVideoAd recsNativeVideoAd = this.f14060h;
        if (recsNativeVideoAd == null) {
            C2668g.m10310b("ad");
        }
        recsNativeVideoAd.getNativeCustomTemplateAd().destroy();
    }

    /* renamed from: b */
    public final void m17363b() {
        for (NativeCardListener nativeCardListener : this.f14059g) {
            C16464a c16464a = this.f14061i;
            if (c16464a == null) {
                C2668g.m10310b("adRec");
            }
            nativeCardListener.onClickthroughClicked(c16464a);
        }
    }

    /* renamed from: c */
    public final void m17365c() {
        if (this.f14063k) {
            m17358f();
        } else {
            m17357e();
        }
    }

    /* renamed from: d */
    public final void m17367d() {
        C2412j c2412j = this.f14062j;
        if (c2412j != null) {
            c2412j.m8749a(c2412j.m8752d() ^ 1);
        }
    }

    /* renamed from: a */
    public final void m17361a(@NotNull NativeCardListener nativeCardListener) {
        C2668g.m10309b(nativeCardListener, "cardListener");
        this.f14059g.add(nativeCardListener);
    }

    /* renamed from: a */
    protected final void m17360a(@NotNull ViewGroup viewGroup, @NotNull C2353b c2353b) {
        C2668g.m10309b(viewGroup, "container");
        C2668g.m10309b(c2353b, "mediaView");
        if (c2353b.getParent() != null) {
            ViewParent parent = c2353b.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
        }
        viewGroup.addView(c2353b, 0, new LayoutParams(-1, -1));
    }
}
