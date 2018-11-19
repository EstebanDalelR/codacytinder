package com.tinder.recsads;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.ads.Ad;
import com.tinder.cardstack.model.C8395a;
import com.tinder.recs.card.AdRecCard;
import com.tinder.recs.model.AdRec;
import com.tinder.recs.view.RecCardView;
import com.tinder.recsads.model.BrandedProfileCardAd;
import com.tinder.recsads.view.BrandedProfileCardRecCardView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/recsads/V1BrandedProfileCardRecCardView;", "Lcom/tinder/recsads/view/BrandedProfileCardRecCardView;", "Lcom/tinder/recs/card/AdRecCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "listeners", "", "Lcom/tinder/recsads/V1BrandedProfileCardRecCardView$Listener;", "addListener", "", "listener", "bind", "recCard", "onMovedToTop", "onRemovedFromTop", "removeListener", "Listener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class V1BrandedProfileCardRecCardView extends BrandedProfileCardRecCardView<AdRecCard> {
    /* renamed from: a */
    private final List<Listener> f58283a = ((List) new ArrayList());
    /* renamed from: b */
    private HashMap f58284b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lcom/tinder/recsads/V1BrandedProfileCardRecCardView$Listener;", "", "onCardInfoClicked", "", "adRec", "Lcom/tinder/recs/model/AdRec;", "brandedProfileCardAd", "Lcom/tinder/recsads/model/BrandedProfileCardAd;", "currentPhotoIndex", "", "cardView", "Lcom/tinder/recs/view/RecCardView;", "onCardMovedToTop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onCardInfoClicked(@NotNull AdRec adRec, @NotNull BrandedProfileCardAd brandedProfileCardAd, int i, @NotNull RecCardView<?> recCardView);

        void onCardMovedToTop(@NotNull BrandedProfileCardAd brandedProfileCardAd);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.V1BrandedProfileCardRecCardView$a */
    static final class C14726a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ V1BrandedProfileCardRecCardView f46301a;
        /* renamed from: b */
        final /* synthetic */ AdRec f46302b;

        C14726a(V1BrandedProfileCardRecCardView v1BrandedProfileCardRecCardView, AdRec adRec) {
            this.f46301a = v1BrandedProfileCardRecCardView;
            this.f46302b = adRec;
        }

        public final void onClick(View view) {
            for (Listener listener : this.f46301a.f58283a) {
                AdRec adRec = this.f46302b;
                Ad ad = this.f46302b.getAd();
                if (ad == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.BrandedProfileCardAd");
                }
                listener.onCardInfoClicked(adRec, (BrandedProfileCardAd) ad, this.f46301a.getCurrentImageIndex(), this.f46301a);
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        if (this.f58284b != null) {
            this.f58284b.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f58284b == null) {
            this.f58284b = new HashMap();
        }
        View view = (View) this.f58284b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f58284b.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m67215a((AdRecCard) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m67215a((AdRecCard) obj);
    }

    public /* synthetic */ void onMovedToTop(C8395a c8395a) {
        m67217b((AdRecCard) c8395a);
    }

    public /* synthetic */ void onMovedToTop(Object obj) {
        m67217b((AdRecCard) obj);
    }

    public /* synthetic */ void onRemovedFromTop(C8395a c8395a) {
        m67218c((AdRecCard) c8395a);
    }

    public /* synthetic */ void onRemovedFromTop(Object obj) {
        m67218c((AdRecCard) obj);
    }

    public V1BrandedProfileCardRecCardView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, null, 2, null);
    }

    /* renamed from: a */
    public void m67215a(@NotNull AdRecCard adRecCard) {
        C2668g.b(adRecCard, "recCard");
        super.bind(adRecCard);
        AdRec adRec = (AdRec) adRecCard.getItem();
        if (adRec == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.model.AdRec");
        }
        adRecCard = adRec.getAd();
        if (adRecCard == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.BrandedProfileCardAd");
        }
        a((BrandedProfileCardAd) adRecCard);
    }

    /* renamed from: b */
    public void m67217b(@NotNull AdRecCard adRecCard) {
        C2668g.b(adRecCard, "recCard");
        super.onMovedToTop(adRecCard);
        AdRec adRec = (AdRec) adRecCard.getItem();
        if (adRec == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.model.AdRec");
        }
        getCardInfoContainer().setOnClickListener(new C14726a(this, adRec));
        for (Listener listener : this.f58283a) {
            Ad ad = adRec.getAd();
            if (ad == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.BrandedProfileCardAd");
            }
            listener.onCardMovedToTop((BrandedProfileCardAd) ad);
        }
    }

    /* renamed from: c */
    public void m67218c(@NotNull AdRecCard adRecCard) {
        C2668g.b(adRecCard, "recCard");
        super.onRemovedFromTop(adRecCard);
        getCardInfoContainer().setOnClickListener(null);
    }

    /* renamed from: a */
    public final void m67216a(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        this.f58283a.add(listener);
    }
}
