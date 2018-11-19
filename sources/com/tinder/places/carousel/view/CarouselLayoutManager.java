package com.tinder.places.carousel.view;

import android.graphics.PointF;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.tinder.places.card.view.PlaceCardView;
import com.tinder.places.carousel.p309a.C10190b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ab;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0003jklB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u0018J(\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\tH\u0002J\b\u0010,\u001a\u00020\u0007H\u0016J\b\u0010-\u001a\u00020\u0007H\u0016J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\tH\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\"2\u0006\u00105\u001a\u000206H\u0002J3\u00107\u001a\u00020\"2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u0001032\n\u0010<\u001a\u00060=R\u00020>H\u0002¢\u0006\u0002\u0010?J\u001c\u0010@\u001a\u00020\"2\n\u0010<\u001a\u00060=R\u00020>2\u0006\u00105\u001a\u000206H\u0002J\b\u0010A\u001a\u00020BH\u0016J\u0018\u0010C\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u00105\u001a\u000206H\u0002J\b\u0010D\u001a\u000203H\u0002J\b\u0010E\u001a\u00020\tH\u0002J\u0015\u0010F\u001a\u0004\u0018\u0001032\u0006\u0010G\u001a\u00020\t¢\u0006\u0002\u0010HJ\b\u0010I\u001a\u00020\tH\u0002J\u0006\u0010J\u001a\u00020\tJ\u000e\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tJ\u0006\u0010M\u001a\u00020\tJ\u0010\u0010N\u001a\u0002032\u0006\u00100\u001a\u00020\tH\u0002J\u0018\u0010O\u001a\u00020\t2\u0006\u0010P\u001a\u00020\t2\u0006\u0010Q\u001a\u000203H\u0002J\b\u0010R\u001a\u00020\tH\u0002J \u0010S\u001a\u00020\"2\n\u0010T\u001a\u0006\u0012\u0002\b\u00030U2\n\u0010V\u001a\u0006\u0012\u0002\b\u00030UH\u0016J\u0010\u0010W\u001a\u00020\"2\u0006\u0010#\u001a\u00020>H\u0016J \u0010X\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010>2\f\u0010<\u001a\b\u0018\u00010=R\u00020>H\u0016J\u001c\u0010Y\u001a\u00020\"2\n\u0010<\u001a\u00060=R\u00020>2\u0006\u00105\u001a\u000206H\u0016J,\u0010Z\u001a\u00020\"2\n\u0010<\u001a\u00060=R\u00020>2\u0006\u00105\u001a\u0002062\u0006\u0010[\u001a\u00020\t2\u0006\u0010\\\u001a\u00020\tH\u0016J\u001c\u0010]\u001a\u00020$2\u0006\u0010^\u001a\u00020\t2\n\u0010<\u001a\u00060=R\u00020>H\u0002J$\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020\t2\n\u0010<\u001a\u00060=R\u00020>2\u0006\u00105\u001a\u000206H\u0002J$\u0010a\u001a\u00020\t2\u0006\u0010b\u001a\u00020\t2\n\u0010<\u001a\u00060=R\u00020>2\u0006\u00105\u001a\u000206H\u0016J\u0010\u0010c\u001a\u00020\"2\u0006\u0010^\u001a\u00020\tH\u0016J(\u0010d\u001a\u00020\t2\u0006\u0010e\u001a\u00020\t2\f\u0010<\u001a\b\u0018\u00010=R\u00020>2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010f\u001a\u00020\"2\u0006\u0010)\u001a\u00020\tH\u0002J\u0018\u0010g\u001a\u00020\"2\u0006\u0010#\u001a\u00020h2\u0006\u0010;\u001a\u000203H\u0002J\u0018\u0010i\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010;\u001a\u000203H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006m"}, d2 = {"Lcom/tinder/places/carousel/view/CarouselLayoutManager;", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "Landroid/support/v7/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;", "scrollCalculator", "Lcom/tinder/places/carousel/util/ScrollCalculator;", "(Lcom/tinder/places/carousel/util/ScrollCalculator;)V", "cardViewMeasured", "", "centerItemPosition", "", "decoratedChildHeight", "decoratedChildWidth", "itemsCount", "layoutHelper", "Lcom/tinder/places/carousel/view/LayoutOrderHelper;", "value", "Lcom/tinder/places/carousel/view/CarouselLayoutManager$LayoutTransformer;", "layoutTransformer", "getLayoutTransformer", "()Lcom/tinder/places/carousel/view/CarouselLayoutManager$LayoutTransformer;", "setLayoutTransformer", "(Lcom/tinder/places/carousel/view/CarouselLayoutManager$LayoutTransformer;)V", "onCenterItemChangedListeners", "", "Lcom/tinder/places/carousel/view/CarouselLayoutManager$OnCenterItemChangedListener;", "pendingCarouselSavedState", "Lcom/tinder/places/carousel/view/CarouselSavedState;", "pendingScrollPosition", "selectedPosition", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "addAndMeasureView", "", "view", "Landroid/view/View;", "addOnItemChangedListener", "listener", "calculateArrayPosition", "index", "centerItem", "layoutCount", "firstVisible", "canScrollHorizontally", "canScrollVertically", "computeScrollVectorForPosition", "Landroid/graphics/PointF;", "targetPosition", "detectOnItemSelectionChanged", "currentScrollPosition", "", "determineScrollOffset", "state", "Landroid/support/v7/widget/RecyclerView$State;", "fillChildItem", "rect", "Landroid/graphics/Rect;", "adapterPos", "itemPositionDiff", "recycler", "Landroid/support/v7/widget/RecyclerView$Recycler;", "Landroid/support/v7/widget/RecyclerView;", "(Landroid/graphics/Rect;ILjava/lang/Float;Landroid/support/v7/widget/RecyclerView$Recycler;)V", "fillData", "generateDefaultLayoutParams", "Landroid/support/v7/widget/RecyclerView$LayoutParams;", "generateLayoutOrderInfo", "getCurrentScrollPosition", "getHeightNoPadding", "getItemDiffForPos", "adapterPosition", "(I)Ljava/lang/Float;", "getMaxScrollOffset", "getOffsetCenterView", "getOffsetNextView", "numOfItems", "getOffsetPrevView", "getPositionsToMove", "getTranslatedValue", "original", "translation", "getWidthNoPadding", "onAdapterChanged", "oldAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "newAdapter", "onAttachedToWindow", "onDetachedFromWindow", "onLayoutChildren", "onMeasure", "widthSpec", "heightSpec", "retrieveChild", "position", "scrollBy", "diff", "scrollHorizontallyBy", "dx", "scrollToPosition", "scrollVerticallyBy", "dy", "selectItemCenterPosition", "setCardContentAlpha", "Lcom/tinder/places/card/view/PlaceCardView;", "showMaxCardsInStack", "Companion", "LayoutTransformer", "OnCenterItemChangedListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class CarouselLayoutManager extends LayoutManager implements ScrollVectorProvider {
    /* renamed from: a */
    public static final C10196a f39899a = new C10196a();
    /* renamed from: b */
    private int f39900b = -1;
    /* renamed from: c */
    private int f39901c = -1;
    /* renamed from: d */
    private int f39902d = -1;
    /* renamed from: e */
    private int f39903e = -1;
    /* renamed from: f */
    private int f39904f = -1;
    /* renamed from: g */
    private int f39905g;
    /* renamed from: h */
    private boolean f39906h;
    /* renamed from: i */
    private final C10202d f39907i = new C10202d();
    @Nullable
    /* renamed from: j */
    private LayoutTransformer f39908j;
    /* renamed from: k */
    private final List<OnCenterItemChangedListener> f39909k = ((List) new ArrayList());
    /* renamed from: l */
    private CarouselSavedState f39910l;
    /* renamed from: m */
    private final C10190b f39911m;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/places/carousel/view/CarouselLayoutManager$LayoutTransformer;", "", "transform", "Lcom/tinder/places/carousel/view/CarouselItemTransformation;", "child", "Landroid/view/View;", "itemPositionToCenterDiff", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface LayoutTransformer {
        @NotNull
        C10200b transform(@NotNull View view, float f);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/places/carousel/view/CarouselLayoutManager$OnCenterItemChangedListener;", "", "onCenterItemChanged", "", "adapterPosition", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface OnCenterItemChangedListener {
        void onCenterItemChanged(int i);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/carousel/view/CarouselLayoutManager$Companion;", "", "()V", "MAX_ITEMS_IN_STACK", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.view.CarouselLayoutManager$a */
    public static final class C10196a {
        private C10196a() {
        }
    }

    /* renamed from: a */
    private final int m48674a(int i, int i2, int i3, int i4) {
        return i == i2 ? i3 - 1 : i < i2 ? i - i4 : (i3 - (i - i2)) - 1;
    }

    public boolean canScrollHorizontally() {
        return true;
    }

    public boolean canScrollVertically() {
        return false;
    }

    public int scrollVerticallyBy(int i, @Nullable Recycler recycler, @Nullable State state) {
        return 0;
    }

    @Inject
    public CarouselLayoutManager(@NotNull C10190b c10190b) {
        C2668g.b(c10190b, "scrollCalculator");
        this.f39911m = c10190b;
    }

    /* renamed from: a */
    public final int m48691a() {
        return this.f39903e;
    }

    /* renamed from: a */
    public final void m48692a(int i) {
        this.f39903e = i;
    }

    /* renamed from: a */
    public final void m48693a(@Nullable LayoutTransformer layoutTransformer) {
        this.f39908j = layoutTransformer;
        requestLayout();
    }

    @NotNull
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public void scrollToPosition(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Position can't be less than 0, it is ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f39902d = i;
        requestLayout();
    }

    @Nullable
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return 0;
        }
        return new PointF(-Math.signum(m48687e(i)), 0.0f);
    }

    public int scrollHorizontallyBy(int i, @NotNull Recycler recycler, @NotNull State state) {
        C2668g.b(recycler, "recycler");
        C2668g.b(state, "state");
        return m48675a(i, recycler, state);
    }

    public void onMeasure(@NotNull Recycler recycler, @NotNull State state, int i, int i2) {
        C2668g.b(recycler, "recycler");
        C2668g.b(state, "state");
        if (!this.f39906h) {
            this.f39900b = -1;
            this.f39901c = -1;
        }
        super.onMeasure(recycler, state, i, i2);
    }

    public void onAdapterChanged(@NotNull Adapter<?> adapter, @NotNull Adapter<?> adapter2) {
        C2668g.b(adapter, "oldAdapter");
        C2668g.b(adapter2, "newAdapter");
        super.onAdapterChanged(adapter, adapter2);
        this.f39906h = null;
        removeAllViews();
    }

    public void onAttachedToWindow(@NotNull RecyclerView recyclerView) {
        C2668g.b(recyclerView, "view");
        super.onAttachedToWindow(recyclerView);
        if (recyclerView.hasFixedSize() == null) {
            throw ((Throwable) new IllegalStateException("RecyclerView using CarouselLayoutManager must have fixed size"));
        }
    }

    public void onDetachedFromWindow(@Nullable RecyclerView recyclerView, @Nullable Recycler recycler) {
        this.f39906h = false;
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    public void onLayoutChildren(@NotNull Recycler recycler, @NotNull State state) {
        C2668g.b(recycler, "recycler");
        C2668g.b(state, "state");
        int i = -1;
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            m48686d(-1);
            return;
        }
        if (!this.f39906h && this.f39900b == -1) {
            View viewForPosition = recycler.getViewForPosition(0);
            C2668g.a(viewForPosition, "view");
            m48682a(viewForPosition);
            this.f39900b = getDecoratedMeasuredWidth(viewForPosition);
            this.f39901c = getDecoratedMeasuredHeight(viewForPosition);
            if (this.f39902d == -1 && this.f39910l == null) {
                this.f39902d = this.f39904f;
            }
            if (viewForPosition instanceof PlaceCardView) {
                this.f39906h = true;
            }
        }
        if (-1 != this.f39902d) {
            int itemCount = state.getItemCount();
            if (itemCount != 0) {
                i = Math.max(0, Math.min(itemCount - 1, this.f39902d));
            }
            this.f39902d = i;
        }
        m48681a(state);
        m48680a(recycler, state);
    }

    /* renamed from: a */
    public final void m48694a(@NotNull OnCenterItemChangedListener onCenterItemChangedListener) {
        C2668g.b(onCenterItemChangedListener, "listener");
        this.f39909k.add(onCenterItemChangedListener);
    }

    /* renamed from: b */
    public final int m48695b() {
        float d = m48685d();
        if (d < ((float) 0) && ((int) d) == 0) {
            d = 0.0f;
        } else if (d > ((float) (this.f39905g - 1))) {
            d = ((float) this.f39905g) - 1.0f;
        }
        return (Math.round(d) * this.f39900b) - this.f39907i.m41516a();
    }

    /* renamed from: b */
    public final int m48696b(int i) {
        int d = (int) m48685d();
        i--;
        return (int) (((d == i ? (float) i : ((float) d) + 1065353216) * ((float) this.f39900b)) - ((float) this.f39907i.m41516a()));
    }

    /* renamed from: c */
    public final int m48697c() {
        return (Math.round(((int) m48685d()) == 0 ? 0.0f : m48685d() - ((float) 1)) * this.f39900b) - this.f39907i.m41516a();
    }

    /* renamed from: a */
    private final int m48675a(int i, Recycler recycler, State state) {
        if (this.f39900b != -1) {
            if (this.f39901c != 1) {
                if (getChildCount() != 0) {
                    if (i != 0) {
                        int e = m48688e();
                        i = this.f39911m.m41474a(i, this.f39907i.m41516a(), e, this.f39900b, this.f39903e != -1);
                        if (i != 0) {
                            C10202d c10202d = this.f39907i;
                            c10202d.m41519b(c10202d.m41516a() + i);
                            m48680a(recycler, state);
                        }
                        return i;
                    }
                }
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final void m48681a(State state) {
        if (this.f39902d != -1) {
            this.f39907i.m41519b(this.f39902d * this.f39900b);
            this.f39902d = -1;
            this.f39910l = (CarouselSavedState) null;
        } else if (this.f39910l != null) {
            CarouselSavedState carouselSavedState = this.f39910l;
            if (carouselSavedState != null) {
                this.f39907i.m41519b(this.f39911m.m41475a(carouselSavedState.getCenterItemPosition(), state, this.f39900b));
                this.f39910l = (CarouselSavedState) null;
            }
        } else if (state.didStructureChange() && this.f39904f != -1) {
            this.f39907i.m41519b(this.f39911m.m41475a(this.f39904f, state, this.f39900b));
        }
    }

    /* renamed from: a */
    private final void m48677a(float f) {
        int round = Math.round(f);
        if (this.f39903e == round || this.f39903e == -1) {
            this.f39904f = round;
            m48686d(round);
            this.f39903e = -1;
        }
    }

    /* renamed from: d */
    private final void m48686d(int i) {
        for (OnCenterItemChangedListener onCenterItemChanged : this.f39909k) {
            onCenterItemChanged.onCenterItemChanged(i);
        }
    }

    /* renamed from: a */
    private final void m48680a(Recycler recycler, State state) {
        float d = m48685d();
        m48678a(d, state);
        detachAndScrapAttachedViews(recycler);
        state = m48690g();
        int f = (m48689f() - this.f39900b) / 2;
        Rect rect = new Rect(f, state - this.f39901c, this.f39900b + f, state);
        state = this.f39907i.m41520b();
        C2668g.a(state, "layoutOrderInfos");
        for (C10203e c10203e : state) {
            Integer a = c10203e.m41521a();
            if (a != null) {
                m48679a(rect, a.intValue(), c10203e.m41524b(), recycler);
            }
        }
        Set<View> set = (Set) new LinkedHashSet();
        Set<View> linkedHashSet = new LinkedHashSet();
        List<ViewHolder> scrapList = recycler.getScrapList();
        C2668g.a(scrapList, "recycler.scrapList");
        for (ViewHolder viewHolder : scrapList) {
            C2668g.a(viewHolder, "holder");
            View view;
            if (viewHolder.getAdapterPosition() != -1) {
                view = viewHolder.itemView;
                C2668g.a(view, "holder.itemView");
                linkedHashSet.add(view);
            } else {
                view = viewHolder.itemView;
                C2668g.a(view, "holder.itemView");
                set.add(view);
            }
        }
        for (View recycleView : linkedHashSet) {
            recycler.recycleView(recycleView);
        }
        for (View addDisappearingView : set) {
            addDisappearingView(addDisappearingView);
        }
        m48677a(d);
    }

    /* renamed from: a */
    private final void m48679a(Rect rect, int i, Float f, Recycler recycler) {
        View a = m48676a(i, recycler);
        ViewCompat.i(a, (float) (this.f39905g - i));
        i = this.f39908j;
        if (i != 0) {
            if (f == null) {
                C2668g.a();
            }
            i = i.transform(a, f.floatValue());
            a.setScaleX(i.m41508a());
            a.setScaleY(i.m41509b());
            a.layout(m48673a(rect.left, i.m41510c()), m48673a(rect.top, i.m41511d()), m48673a(rect.right, i.m41510c()), m48673a(rect.bottom, i.m41511d()));
            float floatValue = f.floatValue();
            m48683a(a, floatValue);
            if ((a instanceof PlaceCardView) != 0) {
                m48684a((PlaceCardView) a, floatValue);
                return;
            }
            return;
        }
        throw ((Throwable) new IllegalStateException("LayoutTransformer must be implemented"));
    }

    /* renamed from: a */
    private final void m48683a(View view, float f) {
        if (f >= 3.0f) {
            view.setVisibility(1.1E-44f);
        } else {
            view.setVisibility(0.0f);
        }
    }

    /* renamed from: a */
    private final void m48684a(PlaceCardView placeCardView, float f) {
        float sqrt = (float) Math.sqrt((double) Math.abs(f));
        if (f >= -1.0f && f <= 1.0f) {
            placeCardView.setFrontContentAlpha(((float) Float.MIN_VALUE) - sqrt);
        } else if (f > 1.0f) {
            placeCardView.setFrontContentAlpha(0.0f);
        }
    }

    /* renamed from: a */
    private final int m48673a(int i, float f) {
        return Math.round(((float) i) + f);
    }

    /* renamed from: a */
    private final void m48678a(float f, State state) {
        this.f39905g = state.getItemCount();
        int round = Math.round(f);
        int max = Math.max(round - 1, 0);
        int min = Math.min(round + 2, this.f39905g - 1);
        int i = (min - max) + 1;
        this.f39907i.m41517a(i);
        Iterator it = new C18461c(max, min).iterator();
        while (it.hasNext()) {
            int b = ((ab) it).b();
            float f2 = ((float) b) - f;
            this.f39907i.m41518a(m48674a(b, round, i, max), b, f2);
        }
    }

    /* renamed from: a */
    private final View m48676a(int i, Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(i);
        C2668g.a(viewForPosition, "view");
        m48682a(viewForPosition);
        return viewForPosition;
    }

    /* renamed from: a */
    private final void m48682a(View view) {
        addView(view);
        measureChildWithMargins(view, 0, 0);
    }

    @Nullable
    /* renamed from: c */
    public final Float m48698c(int i) {
        Object b = this.f39907i.m41520b();
        C2668g.a(b, "layoutHelper.layoutOrderInfos");
        for (C10203e c10203e : b) {
            Object obj;
            Integer a = c10203e.m41521a();
            if (a != null) {
                if (a.intValue() == i) {
                    obj = 1;
                    if (obj != null) {
                        break;
                    }
                }
            }
            obj = null;
            if (obj != null) {
                break;
            }
        }
        C10203e c10203e2 = null;
        if (c10203e2 != null) {
            return c10203e2.m41524b();
        }
        return null;
    }

    /* renamed from: e */
    private final float m48687e(int i) {
        return m48685d() - ((float) i);
    }

    /* renamed from: d */
    private final float m48685d() {
        if (m48688e() == 0) {
            return 0.0f;
        }
        return (((float) this.f39907i.m41516a()) * 1.0f) / ((float) this.f39900b);
    }

    /* renamed from: e */
    private final int m48688e() {
        return this.f39900b * (this.f39905g - 1);
    }

    /* renamed from: f */
    private final int m48689f() {
        return (getWidth() - getPaddingStart()) - getPaddingEnd();
    }

    /* renamed from: g */
    private final int m48690g() {
        return (getHeight() - getPaddingEnd()) - getPaddingStart();
    }
}
