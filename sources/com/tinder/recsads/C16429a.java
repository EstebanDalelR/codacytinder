package com.tinder.recsads;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tinder.addy.Ad.AdType;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardViewHolder;
import com.tinder.cardstack.view.CardViewHolder.Factory;
import com.tinder.recsads.C14760n.C14759e;
import com.tinder.recsads.listener.C16462a;
import com.tinder.recsads.listener.C16463c;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.RecsAdType;
import com.tinder.recsads.model.RecsNativeVideoAd;
import com.tinder.recsads.model.RecsNativeVideoAd.Style;
import com.tinder.recsads.p466a.C16428a;
import com.tinder.recsads.view.AddyV2BrandedProfileCardRecCardView;
import com.tinder.recsads.view.AddyV2BrandedProfileCardRecCardView.Listener;
import com.tinder.recsads.view.FanStaticAdRecCardView;
import com.tinder.recsads.view.NativeDisplayRecCardView;
import com.tinder.recsads.view.NativePortraitRecCardView;
import com.tinder.recsads.view.NativeSquareOldVideoRecCardView;
import com.tinder.recsads.view.NativeSquareVideoRecCardView;
import com.tinder.recsads.view.NativeVideoAdRecCard$Listener;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B2\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\"\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0014\u0010\u001d\u001a\u00020\u00182\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/recsads/AdRecCardViewHolderFactory;", "Lcom/tinder/cardstack/view/CardViewHolder$Factory;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "videoAnalyticsListener", "Lcom/tinder/recsads/NativeVideoAdRecCardAnalyticsListener;", "nativeAdCardListeners", "", "Lcom/tinder/recsads/NativeCardListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "brandedProfileCardImpressionTrackerListener", "Lcom/tinder/recsads/listener/BrandedProfileCardImpressionTrackerListener;", "fanStaticAdAnalyticsListener", "Lcom/tinder/recsads/listener/FanStaticAdAnalyticsListener;", "(Lcom/tinder/recsads/NativeVideoAdRecCardAnalyticsListener;Ljava/util/Set;Lcom/tinder/recsads/listener/BrandedProfileCardImpressionTrackerListener;Lcom/tinder/recsads/listener/FanStaticAdAnalyticsListener;)V", "brandedProfileCardListener", "Lcom/tinder/recsads/view/AddyV2BrandedProfileCardRecCardView$Listener;", "getBrandedProfileCardListener", "()Lcom/tinder/recsads/view/AddyV2BrandedProfileCardRecCardView$Listener;", "setBrandedProfileCardListener", "(Lcom/tinder/recsads/view/AddyV2BrandedProfileCardRecCardView$Listener;)V", "typeLayouts", "", "", "", "createViewHolder", "container", "Landroid/view/ViewGroup;", "type", "getViewType", "card", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.a */
public final class C16429a implements Factory<CardViewHolder<C8395a<?>>, C8395a<?>> {
    /* renamed from: a */
    private final Map<Object, Integer> f50982a = ah.m66889a((Pair[]) new Pair[]{C15811g.m59834a(RecsAdType.NATIVE_DISPLAY_DFP, Integer.valueOf(C14759e.native_display_rec_card_view)), C15811g.m59834a(Style.PORTRAIT, Integer.valueOf(C14759e.native_portrait_rec_card_view)), C15811g.m59834a(Style.SQUARE, Integer.valueOf(C14759e.view_ad_native_square)), C15811g.m59834a(Style.OLD, Integer.valueOf(C14759e.view_ad_native_square_old)), C15811g.m59834a(RecsAdType.BRANDED_PROFILE_CARD, Integer.valueOf(C14759e.branded_profile_card_rec_card_view)), C15811g.m59834a(RecsAdType.FAN_VIDEO, Integer.valueOf(C14759e.fan_video_ad_rec_card_view)), C15811g.m59834a(RecsAdType.FAN, Integer.valueOf(C14759e.fan_static_ad_rec_card_view))});
    @Nullable
    /* renamed from: b */
    private Listener f50983b;
    /* renamed from: c */
    private final C16461l f50984c;
    /* renamed from: d */
    private final Set<NativeCardListener> f50985d;
    /* renamed from: e */
    private final C16462a f50986e;
    /* renamed from: f */
    private final C16463c f50987f;

    @Inject
    public C16429a(@NotNull C16461l c16461l, @NotNull Set<NativeCardListener> set, @NotNull C16462a c16462a, @NotNull C16463c c16463c) {
        C2668g.b(c16461l, "videoAnalyticsListener");
        C2668g.b(set, "nativeAdCardListeners");
        C2668g.b(c16462a, "brandedProfileCardImpressionTrackerListener");
        C2668g.b(c16463c, "fanStaticAdAnalyticsListener");
        this.f50984c = c16461l;
        this.f50985d = set;
        this.f50986e = c16462a;
        this.f50987f = c16463c;
    }

    /* renamed from: a */
    public final void m61809a(@Nullable Listener listener) {
        this.f50983b = listener;
    }

    @NotNull
    public CardViewHolder<C8395a<?>> createViewHolder(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "container");
        if (i == C14759e.native_portrait_rec_card_view) {
            viewGroup = viewGroup.getContext();
            C2668g.a(viewGroup, "container.context");
            i = new NativePortraitRecCardView(viewGroup);
            i.setListener((NativeVideoAdRecCard$Listener) this.f50984c);
            for (NativeCardListener a : (Iterable) this.f50985d) {
                i.a(a);
            }
            i = (View) i;
        } else if (i == C14759e.view_ad_native_square) {
            viewGroup = viewGroup.getContext();
            C2668g.a(viewGroup, "container.context");
            i = new NativeSquareVideoRecCardView(viewGroup);
            i.setListener((NativeVideoAdRecCard$Listener) this.f50984c);
            for (NativeCardListener a2 : (Iterable) this.f50985d) {
                i.a(a2);
            }
            i = (View) i;
        } else if (i == C14759e.view_ad_native_square_old) {
            viewGroup = viewGroup.getContext();
            C2668g.a(viewGroup, "container.context");
            i = new NativeSquareOldVideoRecCardView(viewGroup);
            i.setListener((NativeVideoAdRecCard$Listener) this.f50984c);
            for (NativeCardListener a22 : (Iterable) this.f50985d) {
                i.a(a22);
            }
            i = (View) i;
        } else if (i == C14759e.native_display_rec_card_view) {
            viewGroup = viewGroup.getContext();
            C2668g.a(viewGroup, "container.context");
            i = new NativeDisplayRecCardView(viewGroup);
            for (NativeCardListener a222 : (Iterable) this.f50985d) {
                i.a(a222);
            }
            i = (View) i;
        } else if (i == C14759e.fan_video_ad_rec_card_view) {
            i = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
            C2668g.a(i, "LayoutInflater.from(cont…e(type, container, false)");
        } else if (i == C14759e.branded_profile_card_rec_card_view) {
            viewGroup = viewGroup.getContext();
            C2668g.a(viewGroup, "container.context");
            i = new AddyV2BrandedProfileCardRecCardView(viewGroup);
            Listener listener = this.f50983b;
            if (listener != null) {
                i.m67228a(listener);
            }
            i.m67228a((Listener) this.f50986e);
            i = (View) i;
        } else if (i == C14759e.fan_static_ad_rec_card_view) {
            viewGroup = viewGroup.getContext();
            C2668g.a(viewGroup, "container.context");
            i = new FanStaticAdRecCardView(viewGroup, null, 2, null);
            i.setListener((FanStaticAdRecCardView.Listener) this.f50987f);
            i = (View) i;
        } else {
            throw ((Throwable) new IllegalArgumentException("Un-configured View Type"));
        }
        i.setLayoutParams(new LayoutParams(-1, -1));
        return new CardViewHolder(i);
    }

    public int getViewType(@NotNull C8395a<?> c8395a) {
        C2668g.b(c8395a, "card");
        if (!(c8395a instanceof C16428a)) {
            c8395a = null;
        }
        C16428a c16428a = (C16428a) c8395a;
        if (c16428a != null) {
            C16464a c16464a = (C16464a) c16428a.getItem();
            if (c16464a != null) {
                c8395a = c16464a.m61877c();
                if (c8395a != null) {
                    AdType adType = c8395a.adType();
                    Integer num;
                    if (adType == RecsAdType.NATIVE_VIDEO_DFP) {
                        Map map = this.f50982a;
                        if (c8395a == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsNativeVideoAd");
                        }
                        num = (Integer) map.get(((RecsNativeVideoAd) c8395a).m65444a());
                        if (num != null) {
                            return num.intValue();
                        }
                        throw ((Throwable) new IllegalArgumentException("Native Video Style does not have a layout configured"));
                    } else if (adType == RecsAdType.BRANDED_PROFILE_CARD) {
                        num = (Integer) this.f50982a.get(RecsAdType.BRANDED_PROFILE_CARD);
                        if (num != null) {
                            return num.intValue();
                        }
                        throw ((Throwable) new IllegalArgumentException("Branded Profile Card does not have a layout configured"));
                    } else if (adType == RecsAdType.FAN) {
                        num = (Integer) this.f50982a.get(RecsAdType.FAN);
                        if (num != null) {
                            return num.intValue();
                        }
                        throw ((Throwable) new IllegalArgumentException("Fan static ad does not have a layout configured"));
                    } else {
                        Integer num2 = (Integer) this.f50982a.get(c8395a.adType());
                        if (num2 != null) {
                            return num2.intValue();
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Un-configured Ad Type ");
                        stringBuilder.append(c8395a.adType());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
        }
        throw ((Throwable) new IllegalArgumentException("Card must be an AdRecCard"));
    }
}
