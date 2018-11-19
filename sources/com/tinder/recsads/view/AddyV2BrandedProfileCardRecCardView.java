package com.tinder.recsads.view;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.addy.Ad;
import com.tinder.cardstack.model.C8395a;
import com.tinder.recs.view.RecCardView;
import com.tinder.recsads.model.BrandedProfileCardAd;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.p466a.C16428a;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/recsads/view/AddyV2BrandedProfileCardRecCardView;", "Lcom/tinder/recsads/view/BrandedProfileCardRecCardView;", "Lcom/tinder/recsads/card/AdRecCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/recsads/view/AddyV2BrandedProfileCardRecCardView$Listener;", "addListener", "", "listener", "bind", "recCard", "onMovedToTop", "onRemovedFromTop", "removeListener", "Listener", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public final class AddyV2BrandedProfileCardRecCardView extends BrandedProfileCardRecCardView<C16428a> {
    /* renamed from: a */
    private final CopyOnWriteArraySet<Listener> f58309a = new CopyOnWriteArraySet();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lcom/tinder/recsads/view/AddyV2BrandedProfileCardRecCardView$Listener;", "", "onCardInfoClicked", "", "adRec", "Lcom/tinder/recsads/model/AdRec;", "brandedProfileCardAd", "Lcom/tinder/recsads/model/BrandedProfileCardAd;", "currentPhotoIndex", "", "cardView", "Lcom/tinder/recs/view/RecCardView;", "onCardMovedToTop", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onCardInfoClicked(@NotNull C16464a c16464a, @NotNull BrandedProfileCardAd brandedProfileCardAd, int i, @NotNull RecCardView<?> recCardView);

        void onCardMovedToTop(@NotNull BrandedProfileCardAd brandedProfileCardAd);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.view.AddyV2BrandedProfileCardRecCardView$a */
    static final class C14763a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ AddyV2BrandedProfileCardRecCardView f46322a;
        /* renamed from: b */
        final /* synthetic */ C16464a f46323b;

        C14763a(AddyV2BrandedProfileCardRecCardView addyV2BrandedProfileCardRecCardView, C16464a c16464a) {
            this.f46322a = addyV2BrandedProfileCardRecCardView;
            this.f46323b = c16464a;
        }

        public final void onClick(View view) {
            for (Listener listener : this.f46322a.f58309a) {
                C16464a c16464a = this.f46323b;
                Ad c = this.f46323b.m61877c();
                if (c == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.BrandedProfileCardAd");
                }
                listener.onCardInfoClicked(c16464a, (BrandedProfileCardAd) c, this.f46322a.getCurrentImageIndex(), this.f46322a);
            }
        }
    }

    public /* synthetic */ void bind(C8395a c8395a) {
        m67227a((C16428a) c8395a);
    }

    public /* synthetic */ void bind(Object obj) {
        m67227a((C16428a) obj);
    }

    public /* synthetic */ void onMovedToTop(C8395a c8395a) {
        m67229b((C16428a) c8395a);
    }

    public /* synthetic */ void onMovedToTop(Object obj) {
        m67229b((C16428a) obj);
    }

    public /* synthetic */ void onRemovedFromTop(C8395a c8395a) {
        m67230c((C16428a) c8395a);
    }

    public /* synthetic */ void onRemovedFromTop(Object obj) {
        m67230c((C16428a) obj);
    }

    public AddyV2BrandedProfileCardRecCardView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, null, 2, null);
    }

    /* renamed from: a */
    public void m67227a(@NotNull C16428a c16428a) {
        C2668g.b(c16428a, "recCard");
        super.bind(c16428a);
        c16428a = ((C16464a) c16428a.getItem()).m61877c();
        if (c16428a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.BrandedProfileCardAd");
        }
        a((BrandedProfileCardAd) c16428a);
    }

    /* renamed from: b */
    public void m67229b(@NotNull C16428a c16428a) {
        C2668g.b(c16428a, "recCard");
        super.onMovedToTop(c16428a);
        C16464a c16464a = (C16464a) c16428a.getItem();
        if (c16464a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.AdRec");
        }
        getCardInfoContainer().setOnClickListener(new C14763a(this, c16464a));
        for (Listener listener : this.f58309a) {
            Ad c = c16464a.m61877c();
            if (c == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.BrandedProfileCardAd");
            }
            listener.onCardMovedToTop((BrandedProfileCardAd) c);
        }
    }

    /* renamed from: c */
    public void m67230c(@NotNull C16428a c16428a) {
        C2668g.b(c16428a, "recCard");
        super.onRemovedFromTop(c16428a);
        getCardInfoContainer().setOnClickListener(null);
    }

    /* renamed from: a */
    public final void m67228a(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        this.f58309a.add(listener);
    }
}
