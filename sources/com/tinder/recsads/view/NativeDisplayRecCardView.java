package com.tinder.recsads.view;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.addy.Ad;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.cardstack.view.CardView;
import com.tinder.recs.view.RecCardView;
import com.tinder.recsads.C14760n.C14758d;
import com.tinder.recsads.C14760n.C14759e;
import com.tinder.recsads.NativeCardListener;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.C18029g;
import com.tinder.recsads.p466a.C16428a;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0019H\u0014J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0007J\b\u0010#\u001a\u00020\u0019H\u0014J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0014J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u000e\u0010)\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/tinder/recsads/view/NativeDisplayRecCardView;", "Lcom/tinder/recs/view/RecCardView;", "Lcom/tinder/recsads/card/AdRecCard;", "Lcom/tinder/cardstack/view/CardView;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ad", "Lcom/tinder/recsads/model/RecsNativeDisplayAd;", "adDisplayImageView", "Landroid/widget/ImageView;", "bottomGradient", "Landroid/view/View;", "clickthroughParams", "Landroid/widget/FrameLayout$LayoutParams;", "clickthroughView", "gradientParams", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/recsads/NativeCardListener;", "logoView", "titleView", "Landroid/widget/TextView;", "addNativeCardListener", "", "listener", "bind", "recCard", "onAttachedToCardCollectionLayout", "cardCollectionLayout", "Lcom/tinder/cardstack/view/CardCollectionLayout;", "onAttachedToWindow", "onCardViewRecycled", "onDestroy", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onMovedToTop", "removeNativeCardListener", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class NativeDisplayRecCardView extends RecCardView<C16428a> implements LifecycleObserver, CardView<C16428a> {
    /* renamed from: a */
    private final ImageView f14044a;
    /* renamed from: b */
    private final TextView f14045b;
    /* renamed from: c */
    private final ImageView f14046c;
    /* renamed from: d */
    private final View f14047d;
    /* renamed from: e */
    private final View f14048e;
    /* renamed from: f */
    private C18029g f14049f;
    /* renamed from: g */
    private final LayoutParams f14050g = new LayoutParams(-1, 0, 80);
    /* renamed from: h */
    private final LayoutParams f14051h = new LayoutParams(-1, 0, 80);
    /* renamed from: i */
    private CopyOnWriteArraySet<NativeCardListener> f14052i = new CopyOnWriteArraySet();

    public NativeDisplayRecCardView(@NotNull Context context) {
        C2668g.m10309b(context, "context");
        super(context, null, 2, null);
        View.inflate(context, C14759e.native_display_rec_card_view, this);
        Object findViewById = findViewById(C14758d.ads_card_display_image);
        C2668g.m10305a(findViewById, "findViewById(R.id.ads_card_display_image)");
        this.f14046c = (ImageView) findViewById;
        findViewById = findViewById(C14758d.ads_card_logo_image);
        C2668g.m10305a(findViewById, "findViewById(R.id.ads_card_logo_image)");
        this.f14044a = (ImageView) findViewById;
        findViewById = findViewById(C14758d.ads_card_title);
        C2668g.m10305a(findViewById, "findViewById(R.id.ads_card_title)");
        this.f14045b = (TextView) findViewById;
        findViewById = findViewById(C14758d.display_ad_bottom_gradient);
        C2668g.m10305a(findViewById, "findViewById(R.id.display_ad_bottom_gradient)");
        this.f14047d = findViewById;
        findViewById = findViewById(C14758d.clickthrough_view);
        C2668g.m10305a(findViewById, "findViewById(R.id.clickthrough_view)");
        this.f14048e = findViewById;
        onFinishInflate();
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m17350a((C16428a) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m17350a((C16428a) obj);
    }

    public /* synthetic */ void onMovedToTop(C8395a c8395a) {
        m17351b((C16428a) c8395a);
    }

    public /* synthetic */ void onMovedToTop(Object obj) {
        m17351b((C16428a) obj);
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
        int size = MeasureSpec.getSize(i2);
        this.f14050g.height = size / 3;
        this.f14047d.setLayoutParams(this.f14050g);
        this.f14051h.height = size / 4;
        this.f14048e.setLayoutParams(this.f14051h);
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public void m17350a(@NotNull C16428a c16428a) {
        C2668g.m10309b(c16428a, "recCard");
        super.bind((C8395a) c16428a);
        Ad c = ((C16464a) c16428a.getItem()).c();
        if (c == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsNativeDisplayAd");
        }
        this.f14049f = (C18029g) c;
        ImageView imageView = this.f14046c;
        C18029g c18029g = this.f14049f;
        if (c18029g == null) {
            C2668g.m10310b("ad");
        }
        imageView.setImageDrawable(c18029g.d());
        imageView = this.f14044a;
        c18029g = this.f14049f;
        if (c18029g == null) {
            C2668g.m10310b("ad");
        }
        imageView.setImageDrawable(c18029g.b());
        TextView textView = this.f14045b;
        c18029g = this.f14049f;
        if (c18029g == null) {
            C2668g.m10310b("ad");
        }
        textView.setText(c18029g.c());
        this.f14048e.setOnClickListener(new NativeDisplayRecCardView$a(this, c16428a));
    }

    /* renamed from: b */
    public void m17351b(@NotNull C16428a c16428a) {
        C2668g.m10309b(c16428a, "recCard");
        for (NativeCardListener nativeCardListener : this.f14052i) {
            Object obj = (C16464a) c16428a.getItem();
            C2668g.m10305a(obj, "recCard.item");
            nativeCardListener.onCardMovedToTop(obj);
        }
    }

    public void onAttachedToCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.m10309b(cardCollectionLayout, "cardCollectionLayout");
        super.onAttachedToCardCollectionLayout(cardCollectionLayout);
        cardCollectionLayout = cardStampsDecoration();
        if (cardCollectionLayout != null) {
            cardCollectionLayout.setShowSuperlikeStamp(false);
        }
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onDestroy() {
        C18029g c18029g = this.f14049f;
        if (c18029g == null) {
            C2668g.m10310b("ad");
        }
        c18029g.a();
    }

    public void onCardViewRecycled() {
        super.onCardViewRecycled();
        C18029g c18029g = this.f14049f;
        if (c18029g == null) {
            C2668g.m10310b("ad");
        }
        c18029g.a();
    }

    /* renamed from: a */
    public final void m17349a(@NotNull NativeCardListener nativeCardListener) {
        C2668g.m10309b(nativeCardListener, "listener");
        this.f14052i.add(nativeCardListener);
    }
}
