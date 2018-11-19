package com.tinder.toppicks.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardViewHolder;
import com.tinder.cardstack.view.CardViewHolder.Factory;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.recs.card.TopPickTeaserRecCard;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.view.RecCardView$OnTouchEventInterceptedListener;
import com.tinder.recsgrid.C16488g;
import com.tinder.toppicks.header.C17028c;
import com.tinder.toppicks.header.TopPicksHeaderView;
import com.tinder.view.grid.ParallaxFrameLayout.C15421a;
import com.tinder.views.grid.GridUserRecCardView;
import com.tinder.views.grid.RefreshableGridRecsView$d;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0004\u0018\u00002\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0002\f\rB\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksGridRecsView$TopPicksCardViewHolderFactory;", "Lcom/tinder/cardstack/view/CardViewHolder$Factory;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "(Lcom/tinder/toppicks/view/TopPicksGridRecsView;)V", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getViewType", "card", "HeaderCardViewHolder", "SimpleCardViewHolder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
final class TopPicksGridRecsView$c implements Factory<CardViewHolder<C8395a<?>>, C8395a<?>> {
    /* renamed from: a */
    final /* synthetic */ TopPicksGridRecsView f52666a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.view.TopPicksGridRecsView$c$c */
    static final class C15304c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ TopPicksGridRecsView$c f47482a;
        /* renamed from: b */
        final /* synthetic */ GridUserRecCardView f47483b;

        C15304c(TopPicksGridRecsView$c topPicksGridRecsView$c, GridUserRecCardView gridUserRecCardView) {
            this.f47482a = topPicksGridRecsView$c;
            this.f47483b = gridUserRecCardView;
        }

        public final void onClick(View view) {
            this.f47482a.f52666a.b(this.f47483b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.view.TopPicksGridRecsView$c$d */
    static final class C15305d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ TopPicksGridRecsView$c f47484a;

        C15305d(TopPicksGridRecsView$c topPicksGridRecsView$c) {
            this.f47484a = topPicksGridRecsView$c;
        }

        public final void onClick(View view) {
            this.f47484a.f52666a.a(TopPicksPaywallSource.CLICK_ON_TEASER);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksGridRecsView$TopPicksCardViewHolderFactory$HeaderCardViewHolder;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "itemView", "Landroid/view/View;", "(Lcom/tinder/toppicks/view/TopPicksGridRecsView$TopPicksCardViewHolderFactory;Landroid/view/View;)V", "isSwipable", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.view.TopPicksGridRecsView$c$a */
    public final class C18242a extends CardViewHolder<C8395a<?>> {
        /* renamed from: a */
        final /* synthetic */ TopPicksGridRecsView$c f56553a;

        public boolean isSwipable() {
            return false;
        }

        public C18242a(TopPicksGridRecsView$c topPicksGridRecsView$c, @NotNull View view) {
            C2668g.b(view, "itemView");
            this.f56553a = topPicksGridRecsView$c;
            super(view);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksGridRecsView$TopPicksCardViewHolderFactory$SimpleCardViewHolder;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "itemView", "Landroid/view/View;", "(Lcom/tinder/toppicks/view/TopPicksGridRecsView$TopPicksCardViewHolderFactory;Landroid/view/View;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.view.TopPicksGridRecsView$c$b */
    public final class C18243b extends CardViewHolder<C8395a<?>> {
        /* renamed from: a */
        final /* synthetic */ TopPicksGridRecsView$c f56554a;

        public C18243b(TopPicksGridRecsView$c topPicksGridRecsView$c, @NotNull View view) {
            C2668g.b(view, "itemView");
            this.f56554a = topPicksGridRecsView$c;
            super(view);
        }
    }

    public TopPicksGridRecsView$c(TopPicksGridRecsView topPicksGridRecsView) {
        this.f52666a = topPicksGridRecsView;
    }

    public int getViewType(@Nullable C8395a<?> c8395a) {
        if (c8395a instanceof C17028c) {
            return 2;
        }
        if (c8395a instanceof UserRecCard) {
            return null;
        }
        return (c8395a instanceof TopPickTeaserRecCard) != null ? 1 : -1;
    }

    @NotNull
    public CardViewHolder<C8395a<?>> createViewHolder(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        switch (i) {
            case 0:
                viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recs_card_top_picks, viewGroup, false);
                if (viewGroup == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.views.grid.GridUserRecCardView");
                }
                GridUserRecCardView gridUserRecCardView = (GridUserRecCardView) viewGroup;
                gridUserRecCardView.setOnClickListener((OnClickListener) new C15304c(this, gridUserRecCardView));
                gridUserRecCardView.setOnTouchEventInterceptedListener((RecCardView$OnTouchEventInterceptedListener) new C16488g(TopPicksGridRecsView.a(this.f52666a)));
                gridUserRecCardView.getParallaxFrameLayout().setParallaxManager(new RefreshableGridRecsView$d(this.f52666a));
                return (CardViewHolder) new C18243b(this, gridUserRecCardView);
            case 1:
                viewGroup = viewGroup.getContext();
                C2668g.a(viewGroup, "parent.context");
                i = new TopPicksTeaserRecCardView(viewGroup, null, 2, null);
                i.setParallaxManager((C15421a) new RefreshableGridRecsView$d(this.f52666a));
                i.setOnClickListener((OnClickListener) new C15305d(this));
                i.setOnTouchEventInterceptedListener((RecCardView$OnTouchEventInterceptedListener) new C16488g(TopPicksGridRecsView.a(this.f52666a)));
                return (CardViewHolder) new C18243b(this, (View) i);
            case 2:
                viewGroup = viewGroup.getContext();
                C2668g.a(viewGroup, "parent.context");
                return (CardViewHolder) new C18242a(this, new TopPicksHeaderView(viewGroup, null, 2, null));
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported view type: ");
                stringBuilder.append(i);
                throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
        }
    }
}
