package com.tinder.recsads.view;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.formats.C2353b;
import com.tinder.cardstack.model.C8395a;
import com.tinder.recsads.C14760n.C14758d;
import com.tinder.recsads.C14760n.C14759e;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.RecsNativeVideoAd;
import com.tinder.recsads.p466a.C16428a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/recsads/view/NativePortraitRecCardView;", "Lcom/tinder/recsads/view/NativeVideoAdRecCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ad", "Lcom/tinder/recsads/model/RecsNativeVideoAd;", "bottomGradient", "Landroid/view/View;", "clickthroughTextView", "Landroid/widget/TextView;", "gradientParams", "Landroid/widget/FrameLayout$LayoutParams;", "logoView", "Landroid/widget/ImageView;", "mediaViewParams", "videoContainer", "Landroid/view/ViewGroup;", "bind", "", "recCard", "Lcom/tinder/recsads/card/AdRecCard;", "getAdViewLayoutResourceId", "", "onContentInflated", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class NativePortraitRecCardView extends NativeVideoAdRecCard {
    /* renamed from: a */
    private ImageView f58310a;
    /* renamed from: b */
    private TextView f58311b;
    /* renamed from: c */
    private ViewGroup f58312c;
    /* renamed from: d */
    private View f58313d;
    /* renamed from: e */
    private final LayoutParams f58314e = new LayoutParams(-1, 0, 80);
    /* renamed from: f */
    private final LayoutParams f58315f = new LayoutParams(-1, -1, 17);
    /* renamed from: g */
    private RecsNativeVideoAd f58316g;

    public NativePortraitRecCardView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m67232a((C16428a) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m67232a((C16428a) obj);
    }

    public int getAdViewLayoutResourceId() {
        return C14759e.native_portrait_rec_card_view;
    }

    /* renamed from: a */
    public void m67231a() {
        View findViewById = findViewById(C14758d.ads_video_container);
        C2668g.a(findViewById, "findViewById(R.id.ads_video_container)");
        this.f58312c = (ViewGroup) findViewById;
        findViewById = findViewById(C14758d.ads_card_logo_image);
        C2668g.a(findViewById, "findViewById(R.id.ads_card_logo_image)");
        this.f58310a = (ImageView) findViewById;
        findViewById = findViewById(C14758d.ads_card_clickthrough_text);
        C2668g.a(findViewById, "findViewById(R.id.ads_card_clickthrough_text)");
        this.f58311b = (TextView) findViewById;
        findViewById = findViewById(C14758d.portrait_ad_bottom_gradient);
        C2668g.a(findViewById, "findViewById(R.id.portrait_ad_bottom_gradient)");
        this.f58313d = findViewById;
    }

    /* renamed from: a */
    public void m67232a(@NotNull C16428a c16428a) {
        C2668g.b(c16428a, "recCard");
        super.a(c16428a);
        c16428a = ((C16464a) c16428a.getItem()).m61877c();
        if (c16428a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsNativeVideoAd");
        }
        this.f58316g = (RecsNativeVideoAd) c16428a;
        c16428a = this.f58312c;
        if (c16428a == null) {
            C2668g.b("videoContainer");
        }
        RecsNativeVideoAd recsNativeVideoAd = this.f58316g;
        if (recsNativeVideoAd == null) {
            C2668g.b("ad");
        }
        C2353b videoMediaView = recsNativeVideoAd.getNativeCustomTemplateAd().getVideoMediaView();
        C2668g.a(videoMediaView, "ad.nativeCustomTemplateAd.videoMediaView");
        a(c16428a, videoMediaView);
        c16428a = this.f58310a;
        if (c16428a == null) {
            C2668g.b("logoView");
        }
        recsNativeVideoAd = this.f58316g;
        if (recsNativeVideoAd == null) {
            C2668g.b("ad");
        }
        c16428a.setImageDrawable(recsNativeVideoAd.m65445b());
        c16428a = this.f58311b;
        if (c16428a == null) {
            C2668g.b("clickthroughTextView");
        }
        recsNativeVideoAd = this.f58316g;
        if (recsNativeVideoAd == null) {
            C2668g.b("ad");
        }
        c16428a.setText(recsNativeVideoAd.m65446c());
    }

    protected void onMeasure(int i, int i2) {
        float size = (float) MeasureSpec.getSize(i2);
        float size2 = (float) MeasureSpec.getSize(i);
        RecsNativeVideoAd recsNativeVideoAd = this.f58316g;
        if (recsNativeVideoAd == null) {
            C2668g.b("ad");
        }
        C2412j videoController = recsNativeVideoAd.getNativeCustomTemplateAd().getVideoController();
        C2668g.a(videoController, "ad.nativeCustomTemplateAd.videoController");
        float f = videoController.f();
        if (size2 / size > f) {
            this.f58315f.height = (int) (size2 / f);
            RecsNativeVideoAd recsNativeVideoAd2 = this.f58316g;
            if (recsNativeVideoAd2 == null) {
                C2668g.b("ad");
            }
            C2353b videoMediaView = recsNativeVideoAd2.getNativeCustomTemplateAd().getVideoMediaView();
            C2668g.a(videoMediaView, "ad.nativeCustomTemplateAd.videoMediaView");
            videoMediaView.setLayoutParams(this.f58315f);
        }
        this.f58314e.height = (int) (size / ((float) 3));
        View view = this.f58313d;
        if (view == null) {
            C2668g.b("bottomGradient");
        }
        view.setLayoutParams(this.f58314e);
        super.onMeasure(i, i2);
    }
}
