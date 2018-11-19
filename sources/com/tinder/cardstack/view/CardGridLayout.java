package com.tinder.cardstack.view;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.tinder.cardstack.cardgrid.view.BaseCardCollectionLayout;
import com.tinder.cardstack.cardgrid.view.C10483c;
import com.tinder.cardstack.cardgrid.view.C8387e;
import com.tinder.cardstack.cardgrid.view.CardGridViewHolderAdapter;
import com.tinder.cardstack.cardgrid.view.LoadingStatusViewHolderFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ,2\u00020\u0001:\u0004,-./B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0014J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u0019J\u0014\u0010 \u001a\u00020\u00192\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0016J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\u000fJ\u0006\u0010)\u001a\u00020\u0019J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u000fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/tinder/cardstack/view/CardGridLayout;", "Lcom/tinder/cardstack/cardgrid/view/BaseCardCollectionLayout;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardGridViewHolderAdapter", "Lcom/tinder/cardstack/cardgrid/view/CardGridViewHolderAdapter;", "gridLayoutManager", "Landroid/support/v7/widget/GridLayoutManager;", "gridSpacingItemDecoration", "Lcom/tinder/cardstack/cardgrid/view/GridSpacingItemDecoration;", "itemSpacingPx", "", "onScrollProgressListener", "Lcom/tinder/cardstack/view/CardGridLayout$OnScrollProgressListener;", "getOnScrollProgressListener", "()Lcom/tinder/cardstack/view/CardGridLayout$OnScrollProgressListener;", "setOnScrollProgressListener", "(Lcom/tinder/cardstack/view/CardGridLayout$OnScrollProgressListener;)V", "velocityTracker", "Lcom/tinder/cardstack/cardgrid/view/ScrollVelocityTracker;", "checkIfNewInsertsAffectFrozenCards", "", "startIndex", "numberOfItemsInserted", "getLayoutManager", "getScrollProgressPercent", "", "hideLoading", "setAdapter", "adapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "setLoadingStatusViewHolderFactory", "factory", "Lcom/tinder/cardstack/cardgrid/view/LoadingStatusViewHolderFactory;", "setSpanCount", "spanCount", "headerOffset", "showLoadingMore", "smoothScrollToPosition", "position", "Companion", "OnScrollProgressListener", "ScrollListener", "SpanSizeLookup", "cardstack_release"}, k = 1, mv = {1, 1, 9})
public final class CardGridLayout extends BaseCardCollectionLayout {
    /* renamed from: b */
    public static final C8403a f45332b = new C8403a();
    /* renamed from: i */
    private static final int f45333i = 2;
    /* renamed from: j */
    private static final float f45334j = 8.0f;
    /* renamed from: k */
    private static final int f45335k = 100;
    /* renamed from: l */
    private static final int f45336l = 10;
    @Nullable
    /* renamed from: c */
    private OnScrollProgressListener f45337c;
    /* renamed from: d */
    private GridLayoutManager f45338d;
    /* renamed from: e */
    private C10483c f45339e;
    /* renamed from: f */
    private CardGridViewHolderAdapter f45340f;
    /* renamed from: g */
    private final C8387e f45341g;
    /* renamed from: h */
    private final int f45342h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/cardstack/view/CardGridLayout$OnScrollProgressListener;", "", "onScrolled", "", "progress", "", "velocity", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    public interface OnScrollProgressListener {
        void onScrolled(float f, float f2);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/cardstack/view/CardGridLayout$Companion;", "", "()V", "DEFAULT_SPAN_COUNT", "", "getDEFAULT_SPAN_COUNT", "()I", "GRID_ITEM_SPACING_DIPS", "", "getGRID_ITEM_SPACING_DIPS", "()F", "MAX_SMOOTH_SCROLL_DISTANCE_NUMBER_OF_ITEMS", "getMAX_SMOOTH_SCROLL_DISTANCE_NUMBER_OF_ITEMS", "SCROLL_UPDATE_DEBOUNCE_INTERVAL_MILLIS", "getSCROLL_UPDATE_DEBOUNCE_INTERVAL_MILLIS", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.view.CardGridLayout$a */
    public static final class C8403a {
        private C8403a() {
        }

        /* renamed from: a */
        private final int m35868a() {
            return CardGridLayout.f45333i;
        }

        /* renamed from: b */
        private final float m35870b() {
            return CardGridLayout.f45334j;
        }

        /* renamed from: c */
        private final int m35873c() {
            return CardGridLayout.f45335k;
        }

        /* renamed from: d */
        private final int m35874d() {
            return CardGridLayout.f45336l;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/cardstack/view/CardGridLayout$ScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "(Lcom/tinder/cardstack/view/CardGridLayout;)V", "onScrolled", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "dx", "", "dy", "shouldTrack", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.view.CardGridLayout$b */
    private final class C10503b extends OnScrollListener {
        /* renamed from: a */
        final /* synthetic */ CardGridLayout f34159a;

        public C10503b(CardGridLayout cardGridLayout) {
            this.f34159a = cardGridLayout;
        }

        public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            C2668g.b(recyclerView, "recyclerView");
            if (m42465a() != null) {
                recyclerView = this.f34159a.getScrollProgressPercent();
                this.f34159a.f45341g.m35754a(recyclerView);
                i = this.f34159a.getOnScrollProgressListener();
                if (i != 0) {
                    i.onScrolled(recyclerView, this.f34159a.f45341g.m35753a());
                }
            }
        }

        /* renamed from: a */
        public final boolean m42465a() {
            return ((long) CardGridLayout.f45332b.m35873c()) < System.currentTimeMillis() - this.f34159a.f45341g.m35755b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/tinder/cardstack/view/CardGridLayout$SpanSizeLookup;", "Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;", "(Lcom/tinder/cardstack/view/CardGridLayout;)V", "getSpanSize", "", "position", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.view.CardGridLayout$c */
    private final class C10504c extends SpanSizeLookup {
        /* renamed from: a */
        final /* synthetic */ CardGridLayout f34160a;

        public C10504c(CardGridLayout cardGridLayout) {
            this.f34160a = cardGridLayout;
        }

        public int getSpanSize(int i) {
            return i == this.f34160a.f45340f.m49905c() ? CardGridLayout.m54450d(this.f34160a).getSpanCount() : 1;
        }
    }

    /* renamed from: a */
    protected void mo11333a(int i, int i2) {
    }

    @NotNull
    /* renamed from: d */
    public static final /* synthetic */ GridLayoutManager m54450d(CardGridLayout cardGridLayout) {
        cardGridLayout = cardGridLayout.f45338d;
        if (cardGridLayout == null) {
            C2668g.b("gridLayoutManager");
        }
        return cardGridLayout;
    }

    @Nullable
    public final OnScrollProgressListener getOnScrollProgressListener() {
        return this.f45337c;
    }

    public final void setOnScrollProgressListener(@Nullable OnScrollProgressListener onScrollProgressListener) {
        this.f45337c = onScrollProgressListener;
    }

    public CardGridLayout(@NotNull Context context) {
        C2668g.b(context, "ctx");
        this(context, null);
    }

    public CardGridLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "ctx");
        super(context, attributeSet);
        this.f45340f = new CardGridViewHolderAdapter();
        this.f45341g = new C8387e();
        setAdapter((Adapter) this.f45340f);
        context = f45332b.m35870b();
        attributeSet = getContext();
        C2668g.a(attributeSet, "context");
        attributeSet = attributeSet.getResources();
        C2668g.a(attributeSet, "context.resources");
        this.f45342h = (int) TypedValue.applyDimension(1, context, attributeSet.getDisplayMetrics());
        m54447a(this, f45332b.m35868a(), null, 2, null);
        addOnScrollListener((OnScrollListener) new C10503b(this));
    }

    @NotNull
    public GridLayoutManager getLayoutManager() {
        GridLayoutManager gridLayoutManager = this.f45338d;
        if (gridLayoutManager == null) {
            C2668g.b("gridLayoutManager");
        }
        return gridLayoutManager;
    }

    public void setAdapter(@NotNull Adapter<?> adapter) {
        C2668g.b(adapter, "adapter");
        super.setAdapter(adapter);
        this.f45340f = (CardGridViewHolderAdapter) adapter;
    }

    /* renamed from: a */
    public static /* synthetic */ void m54447a(CardGridLayout cardGridLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        cardGridLayout.m54456b(i, i2);
    }

    /* renamed from: b */
    public final void m54456b(int i, int i2) {
        this.f45338d = new GridLayoutManager(getContext(), i);
        GridLayoutManager gridLayoutManager = this.f45338d;
        if (gridLayoutManager == null) {
            C2668g.b("gridLayoutManager");
        }
        gridLayoutManager.setSpanSizeLookup(new C10504c(this));
        gridLayoutManager = this.f45338d;
        if (gridLayoutManager == null) {
            C2668g.b("gridLayoutManager");
        }
        setLayoutManager(gridLayoutManager);
        removeItemDecoration(this.f45339e);
        this.f45339e = new C10483c(i, this.f45342h, i2);
        addItemDecoration((ItemDecoration) this.f45339e);
    }

    /* renamed from: g */
    public final void m54457g() {
        this.f45340f.m49902a();
    }

    /* renamed from: h */
    public final void m54458h() {
        this.f45340f.m49904b();
    }

    public final void setLoadingStatusViewHolderFactory(@NotNull LoadingStatusViewHolderFactory loadingStatusViewHolderFactory) {
        C2668g.b(loadingStatusViewHolderFactory, "factory");
        this.f45340f.m49903a(loadingStatusViewHolderFactory);
    }

    public void smoothScrollToPosition(int i) {
        float scrollProgressPercent = getScrollProgressPercent();
        C10507a adapter = getAdapter();
        C2668g.a(adapter, "adapter");
        int itemCount = (int) (scrollProgressPercent * ((float) adapter.getItemCount()));
        if (Math.abs(i - itemCount) > f45332b.m35874d()) {
            if (itemCount < i) {
                itemCount = i - f45332b.m35874d();
            } else {
                itemCount = f45332b.m35874d() + i;
            }
            scrollToPosition(itemCount);
        }
        super.smoothScrollToPosition(i);
    }

    private final float getScrollProgressPercent() {
        return ((float) computeVerticalScrollOffset()) / ((float) computeVerticalScrollRange());
    }
}
