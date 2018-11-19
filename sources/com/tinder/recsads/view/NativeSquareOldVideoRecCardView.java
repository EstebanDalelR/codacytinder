package com.tinder.recsads.view;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/recsads/view/NativeSquareOldVideoRecCardView;", "Lcom/tinder/recsads/view/NativeVideoAdRecCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clickableView", "Landroid/view/View;", "contentView", "Landroid/view/ViewGroup;", "logoView", "Landroid/widget/ImageView;", "subTitleView", "Landroid/widget/TextView;", "titleView", "bind", "", "recCard", "Lcom/tinder/recsads/card/AdRecCard;", "getAdViewLayoutResourceId", "", "onContentInflated", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class NativeSquareOldVideoRecCardView extends NativeVideoAdRecCard {
    /* renamed from: a */
    private ViewGroup f58317a;
    /* renamed from: b */
    private ImageView f58318b;
    /* renamed from: c */
    private TextView f58319c;
    /* renamed from: d */
    private TextView f58320d;
    /* renamed from: e */
    private View f58321e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.NativeSquareOldVideoRecCardView$a */
    static final class C14772a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ NativeSquareOldVideoRecCardView f46339a;

        C14772a(NativeSquareOldVideoRecCardView nativeSquareOldVideoRecCardView) {
            this.f46339a = nativeSquareOldVideoRecCardView;
        }

        public final void onClick(View view) {
            this.f46339a.b();
        }
    }

    public NativeSquareOldVideoRecCardView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m67234a((C16428a) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m67234a((C16428a) obj);
    }

    public int getAdViewLayoutResourceId() {
        return C14759e.view_ad_native_square_old;
    }

    /* renamed from: a */
    public void m67233a() {
        View findViewById = findViewById(C14758d.ads_video_container);
        C2668g.a(findViewById, "findViewById(R.id.ads_video_container)");
        this.f58317a = (ViewGroup) findViewById;
        findViewById = findViewById(C14758d.ads_card_logo_image);
        C2668g.a(findViewById, "findViewById(R.id.ads_card_logo_image)");
        this.f58318b = (ImageView) findViewById;
        findViewById = findViewById(C14758d.ads_card_title);
        C2668g.a(findViewById, "findViewById(R.id.ads_card_title)");
        this.f58320d = (TextView) findViewById;
        findViewById = findViewById(C14758d.ads_card_sub_title);
        C2668g.a(findViewById, "findViewById(R.id.ads_card_sub_title)");
        this.f58319c = (TextView) findViewById;
        findViewById = findViewById(C14758d.clickable_surface);
        C2668g.a(findViewById, "findViewById(R.id.clickable_surface)");
        this.f58321e = findViewById;
    }

    /* renamed from: a */
    public void m67234a(@NotNull C16428a c16428a) {
        C2668g.b(c16428a, "recCard");
        super.a(c16428a);
        c16428a = ((C16464a) c16428a.getItem()).m61877c();
        if (c16428a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsNativeVideoAd");
        }
        RecsNativeVideoAd recsNativeVideoAd = (RecsNativeVideoAd) c16428a;
        ViewGroup viewGroup = this.f58317a;
        if (viewGroup == null) {
            C2668g.b("contentView");
        }
        C2353b videoMediaView = recsNativeVideoAd.getNativeCustomTemplateAd().getVideoMediaView();
        C2668g.a(videoMediaView, "ad.nativeCustomTemplateAd.videoMediaView");
        a(viewGroup, videoMediaView);
        TextView textView = this.f58320d;
        if (textView == null) {
            C2668g.b("titleView");
        }
        textView.setText(recsNativeVideoAd.m65447d());
        ImageView imageView = this.f58318b;
        if (imageView == null) {
            C2668g.b("logoView");
        }
        imageView.setImageDrawable(recsNativeVideoAd.m65445b());
        textView = this.f58319c;
        if (textView == null) {
            C2668g.b("subTitleView");
        }
        textView.setText(recsNativeVideoAd.m65448e());
        c16428a = this.f58321e;
        if (c16428a == null) {
            C2668g.b("clickableView");
        }
        c16428a.setOnClickListener(new C14772a(this));
    }
}
