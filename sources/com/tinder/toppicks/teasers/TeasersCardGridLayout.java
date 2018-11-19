package com.tinder.toppicks.teasers;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout;
import com.tinder.cardstack.cardgrid.view.C10483c;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.C10507a;
import com.tinder.cardstack.view.CardViewHolder;
import com.tinder.cardstack.view.CardViewHolder.Factory;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import com.tinder.recs.view.RecCardView$OnTouchEventInterceptedListener;
import com.tinder.recsgrid.C16488g;
import com.tinder.toppicks.header.C17028c;
import com.tinder.toppicks.header.TopPicksHeaderView;
import com.tinder.view.grid.ParallaxFrameLayout;
import com.tinder.view.grid.ParallaxFrameLayout.C15421a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J\u001a\u0010\u0016\u001a\u00020\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/toppicks/teasers/TeasersCardGridLayout;", "Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardAdapter", "Lcom/tinder/cardstack/view/CardViewAdapter;", "gridLayoutManager", "Landroid/support/v7/widget/GridLayoutManager;", "onCardClickedListener", "Lkotlin/Function1;", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "", "viewPagerParent", "Landroid/support/v4/view/ViewPager;", "checkIfNewInsertsAffectFrozenCards", "p0", "", "p1", "findViewPagerParent", "setOnCardClickedListener", "listener", "CardViewHolderFactory", "ParallaxFrameLayoutManager", "SpanSizeLookup", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TeasersCardGridLayout extends BaseCardCollectionLayout {
    /* renamed from: b */
    private final GridLayoutManager f59893b;
    /* renamed from: c */
    private final C10507a f59894c = new C10507a();
    /* renamed from: d */
    private Function1<? super TopPickTeaser, C15813i> f59895d = ((Function1) TeasersCardGridLayout$onCardClickedListener$1.f58691a);
    /* renamed from: e */
    private ViewPager f59896e = m68572g();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0004\u0018\u00002\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0002\f\rB\u0005¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tinder/toppicks/teasers/TeasersCardGridLayout$CardViewHolderFactory;", "Lcom/tinder/cardstack/view/CardViewHolder$Factory;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "(Lcom/tinder/toppicks/teasers/TeasersCardGridLayout;)V", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getViewType", "card", "HeaderCardViewHolder", "SimpleCardViewHolder", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.TeasersCardGridLayout$a */
    private final class C17109a implements Factory<CardViewHolder<C8395a<?>>, C8395a<?>> {
        /* renamed from: a */
        final /* synthetic */ TeasersCardGridLayout f52616a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.toppicks.teasers.TeasersCardGridLayout$a$c */
        static final class C15297c implements OnClickListener {
            /* renamed from: a */
            final /* synthetic */ C17109a f47452a;
            /* renamed from: b */
            final /* synthetic */ TopPickTeaserCardView f47453b;

            C15297c(C17109a c17109a, TopPickTeaserCardView topPickTeaserCardView) {
                this.f47452a = c17109a;
                this.f47453b = topPickTeaserCardView;
            }

            public final void onClick(View view) {
                view = this.f47453b.getTeaser();
                if (view != null) {
                    this.f47452a.f52616a.f59895d.invoke(view);
                }
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/toppicks/teasers/TeasersCardGridLayout$CardViewHolderFactory$HeaderCardViewHolder;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "itemView", "Landroid/view/View;", "(Lcom/tinder/toppicks/teasers/TeasersCardGridLayout$CardViewHolderFactory;Landroid/view/View;)V", "isSwipable", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.toppicks.teasers.TeasersCardGridLayout$a$a */
        public final class C18240a extends CardViewHolder<C8395a<?>> {
            /* renamed from: a */
            final /* synthetic */ C17109a f56536a;

            public boolean isSwipable() {
                return false;
            }

            public C18240a(C17109a c17109a, @NotNull View view) {
                C2668g.b(view, "itemView");
                this.f56536a = c17109a;
                super(view);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/toppicks/teasers/TeasersCardGridLayout$CardViewHolderFactory$SimpleCardViewHolder;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "itemView", "Landroid/view/View;", "(Lcom/tinder/toppicks/teasers/TeasersCardGridLayout$CardViewHolderFactory;Landroid/view/View;)V", "toppicks_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.toppicks.teasers.TeasersCardGridLayout$a$b */
        public final class C18241b extends CardViewHolder<C8395a<?>> {
            /* renamed from: a */
            final /* synthetic */ C17109a f56537a;

            public C18241b(C17109a c17109a, @NotNull View view) {
                C2668g.b(view, "itemView");
                this.f56537a = c17109a;
                super(view);
            }
        }

        public C17109a(TeasersCardGridLayout teasersCardGridLayout) {
            this.f52616a = teasersCardGridLayout;
        }

        public int getViewType(@Nullable C8395a<?> c8395a) {
            if (c8395a instanceof C17028c) {
                return null;
            }
            return (c8395a instanceof C17117b) != null ? 1 : -1;
        }

        @NotNull
        public CardViewHolder<C8395a<?>> createViewHolder(@NotNull ViewGroup viewGroup, int i) {
            C2668g.b(viewGroup, "parent");
            switch (i) {
                case 0:
                    viewGroup = viewGroup.getContext();
                    C2668g.a(viewGroup, "parent.context");
                    return (CardViewHolder) new C18240a(this, new TopPicksHeaderView(viewGroup, null, 2, null));
                case 1:
                    viewGroup = viewGroup.getContext();
                    C2668g.a(viewGroup, "parent.context");
                    i = new TopPickTeaserCardView(viewGroup, null, 2, null);
                    i.setOnClickListener((OnClickListener) new C15297c(this, i));
                    i.setOnTouchEventInterceptedListener((RecCardView$OnTouchEventInterceptedListener) new C16488g(this.f52616a.f59896e));
                    i.setParallaxManager((C15421a) new C17110b(this.f52616a));
                    return (CardViewHolder) new C18241b(this, (View) i);
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported view type: ");
                    stringBuilder.append(i);
                    throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/toppicks/teasers/TeasersCardGridLayout$ParallaxFrameLayoutManager;", "Lcom/tinder/view/grid/ParallaxFrameLayout$ParallaxManager;", "(Lcom/tinder/toppicks/teasers/TeasersCardGridLayout;)V", "tempChildLocation", "", "tempParentLocation", "getContainerHeight", "", "getYOffsetInContainer", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.TeasersCardGridLayout$b */
    private final class C17110b extends C15421a {
        /* renamed from: a */
        final /* synthetic */ TeasersCardGridLayout f52617a;
        /* renamed from: b */
        private final int[] f52618b = new int[2];
        /* renamed from: c */
        private final int[] f52619c = new int[2];

        public C17110b(TeasersCardGridLayout teasersCardGridLayout) {
            this.f52617a = teasersCardGridLayout;
        }

        /* renamed from: a */
        public int mo12672a() {
            ParallaxFrameLayout c = m57811c();
            if (c == null) {
                return 0;
            }
            this.f52617a.getLocationInWindow(this.f52618b);
            c.getLocationInWindow(this.f52619c);
            return this.f52619c[1] - this.f52618b[1];
        }

        /* renamed from: b */
        public int mo12673b() {
            return this.f52617a.getHeight();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/tinder/toppicks/teasers/TeasersCardGridLayout$SpanSizeLookup;", "Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;", "(Lcom/tinder/toppicks/teasers/TeasersCardGridLayout;)V", "getSpanSize", "", "position", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.teasers.TeasersCardGridLayout$c */
    private final class C17111c extends SpanSizeLookup {
        /* renamed from: a */
        final /* synthetic */ TeasersCardGridLayout f52620a;

        public C17111c(TeasersCardGridLayout teasersCardGridLayout) {
            this.f52620a = teasersCardGridLayout;
        }

        public int getSpanSize(int i) {
            return (this.f52620a.getAdapter().a(i) instanceof C17028c) != 0 ? 2 : 1;
        }
    }

    /* renamed from: a */
    protected void m68573a(int i, int i2) {
    }

    public TeasersCardGridLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        attributeSet = new GridLayoutManager(context, 2);
        attributeSet.setSpanSizeLookup(new C17111c(this));
        this.f59893b = attributeSet;
        context = context.getResources();
        C2668g.a(context, "context.resources");
        context = (int) TypedValue.applyDimension(1, 8.0f, context.getDisplayMetrics());
        setLayoutManager(this.f59893b);
        addItemDecoration(new C10483c(2, context, 1));
        setHasFixedSize(true);
        this.f59894c.a((Factory) new C17109a(this));
        setAdapter((Adapter) this.f59894c);
    }

    public final void setOnCardClickedListener(@NotNull Function1<? super TopPickTeaser, C15813i> function1) {
        C2668g.b(function1, "listener");
        this.f59895d = function1;
    }

    /* renamed from: g */
    private final ViewPager m68572g() {
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof ViewPager)) {
            parent = parent.getParent();
        }
        if (!(parent instanceof ViewPager)) {
            parent = (ViewParent) null;
        }
        return (ViewPager) parent;
    }
}
