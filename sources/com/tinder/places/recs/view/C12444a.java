package com.tinder.places.recs.view;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.facebook.ads.AdError;
import com.tinder.cardstack.view.CardGridLayout;
import com.tinder.domain.places.model.PlacesConfigExpansion.Size;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0003H\u0002J\u0016\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003J\u0006\u0010&\u001a\u00020\u000bJ \u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0016J\b\u0010+\u001a\u00020\u000bH\u0002J \u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0003H\u0002J\u000e\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020$J\u000e\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00020$J \u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0002J\u0010\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0002R\u000e\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R4\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00068"}, d2 = {"Lcom/tinder/places/recs/view/PlaceRecsScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "offset", "", "minScale", "", "gridView", "Lcom/tinder/cardstack/view/CardGridLayout;", "gridHeight", "centeredCallback", "Lkotlin/Function1;", "", "(IFLcom/tinder/cardstack/view/CardGridLayout;ILkotlin/jvm/functions/Function1;)V", "cardHeight", "fadeFromAlpha", "fadeToolbarBoundary", "fullNextBoundary", "fullPreviousBoundary", "lm", "Landroid/support/v7/widget/GridLayoutManager;", "maxScale", "prevCardPivot", "scrollFadeRange", "shrinkNextBoundary", "shrinkPreviousBoundary", "toolbarCollapser", "Lkotlin/Function2;", "Lcom/tinder/places/card/view/ToolbarCollapser;", "getToolbarCollapser", "()Lkotlin/jvm/functions/Function2;", "setToolbarCollapser", "(Lkotlin/jvm/functions/Function2;)V", "collapseToolbar", "dy", "doScaling", "view", "Landroid/view/View;", "index", "onExpansionEnd", "onScrolled", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "dx", "rescaleVisibleCards", "scaleRatio", "current", "start", "end", "setupNextBoundariesFromView", "recCard", "setupPreviousBoundariesFromView", "tween", "oldValue", "newValue", "ratio", "tweenScale", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.recs.view.a */
public final class C12444a extends OnScrollListener {
    /* renamed from: a */
    private final GridLayoutManager f40123a = this.f40137o.getLayoutManager();
    /* renamed from: b */
    private final float f40124b = 1065353216;
    /* renamed from: c */
    private final float f40125c = 1056964608;
    /* renamed from: d */
    private final int f40126d = (this.f40135m / 2);
    /* renamed from: e */
    private final float f40127e = -1110651699;
    @Nullable
    /* renamed from: f */
    private Function2<? super Float, ? super Integer, C15813i> f40128f;
    /* renamed from: g */
    private int f40129g;
    /* renamed from: h */
    private int f40130h;
    /* renamed from: i */
    private int f40131i;
    /* renamed from: j */
    private int f40132j;
    /* renamed from: k */
    private int f40133k;
    /* renamed from: l */
    private int f40134l;
    /* renamed from: m */
    private final int f40135m;
    /* renamed from: n */
    private final float f40136n;
    /* renamed from: o */
    private final CardGridLayout f40137o;
    /* renamed from: p */
    private final int f40138p;
    /* renamed from: q */
    private final Function1<Integer, C15813i> f40139q;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0010¸\u0006\u0011"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "(Lkotlin/jvm/functions/Function1;)V", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.view.a$a */
    public static final class C10285a implements OnLayoutChangeListener {
        /* renamed from: a */
        final /* synthetic */ C12444a f33425a;

        public C10285a(C12444a c12444a) {
            this.f33425a = c12444a;
        }

        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.f33425a.m48926a(view);
        }
    }

    /* renamed from: a */
    private final float m48922a(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) (i3 - i2));
    }

    public C12444a(int i, float f, @NotNull CardGridLayout cardGridLayout, int i2, @NotNull Function1<? super Integer, C15813i> function1) {
        C2668g.b(cardGridLayout, "gridView");
        C2668g.b(function1, "centeredCallback");
        this.f40135m = i;
        this.f40136n = f;
        this.f40137o = cardGridLayout;
        this.f40138p = i2;
        this.f40139q = function1;
    }

    /* renamed from: a */
    public final void m48928a(@Nullable Function2<? super Float, ? super Integer, C15813i> function2) {
        this.f40128f = function2;
    }

    /* renamed from: a */
    public final void m48925a() {
        View childAt = this.f40137o.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (!ViewCompat.z(childAt) || childAt.isLayoutRequested()) {
            childAt.addOnLayoutChangeListener(new C10285a(this));
        } else {
            m48926a(childAt);
        }
    }

    /* renamed from: a */
    public final void m48926a(@NotNull View view) {
        C2668g.b(view, "recCard");
        if (this.f40134l == 0) {
            m48929b(view);
        }
        if ((this.f40134l != 0 ? 1 : null) == null) {
            throw new IllegalArgumentException("setupNextBoundariesFromView must be called before setupPreviousBoundariesFromView".toString());
        }
        view = Size.Companion.getAbsoluteSize(view).getY();
        this.f40129g = view - this.f40134l;
        this.f40130h = (view - (this.f40134l / 2)) - this.f40135m;
        this.f40133k = view - this.f40135m;
    }

    /* renamed from: b */
    public final void m48929b(@NotNull View view) {
        C2668g.b(view, "recCard");
        if (this.f40134l == 0) {
            this.f40134l = Size.Companion.getAbsoluteSize(view).getHeight();
            this.f40132j = (this.f40138p - this.f40134l) - this.f40135m;
            this.f40131i = this.f40138p;
        }
    }

    /* renamed from: a */
    private final float m48921a(float f, float f2, float f3) {
        return f + ((f2 - f) * Math.max(f3, 0.0f));
    }

    /* renamed from: a */
    private final float m48920a(float f) {
        return m48921a(this.f40136n, this.f40124b, f);
    }

    /* renamed from: a */
    public final void m48927a(@NotNull View view, int i) {
        C2668g.b(view, "view");
        if (i != -1) {
            if (i != 0 || this.f40129g != 0) {
                if (this.f40137o.getAdapter().getItemViewType(i) == AdError.NO_FILL_ERROR_CODE) {
                    view.setScaleY(1.0f);
                    view.setScaleX(1.0f);
                    return;
                }
                Size absoluteSize = Size.Companion.getAbsoluteSize(view);
                view.setPivotX(C10287c.m41678a(i) != 0 ? 0 : (float) absoluteSize.getWidth());
                if (absoluteSize.getY() < this.f40130h) {
                    float a = m48922a(absoluteSize.getY(), this.f40129g, this.f40130h);
                    int a2 = m48920a(a);
                    view.setPivotY(((float) absoluteSize.getHeight()) * this.f40125c);
                    view.setAlpha(m48921a(this.f40127e, 1.0f, a));
                    i = a2;
                } else if (absoluteSize.getY() > this.f40132j) {
                    i = m48920a(((float) 1) - m48922a(absoluteSize.getY(), this.f40132j, this.f40131i));
                    view.setPivotY(0.0f);
                    view.setAlpha(1.0f);
                } else {
                    view.setPivotY(0.0f);
                    view.setAlpha(1.0f);
                    i = 1065353216;
                }
                view.setScaleY(i);
                view.setScaleX(i);
            }
        }
    }

    public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        C2668g.b(recyclerView, "recyclerView");
        m48924b();
        m48923a(i2);
    }

    /* renamed from: b */
    private final void m48924b() {
        int findFirstVisibleItemPosition = this.f40123a.findFirstVisibleItemPosition();
        this.f40139q.invoke(Integer.valueOf(findFirstVisibleItemPosition));
        int i = findFirstVisibleItemPosition - 1;
        View findViewByPosition = this.f40123a.findViewByPosition(i);
        if (findViewByPosition != null) {
            m48927a(findViewByPosition, i);
        }
        findViewByPosition = this.f40123a.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition != null) {
            m48927a(findViewByPosition, findFirstVisibleItemPosition);
        }
        i = findFirstVisibleItemPosition + 1;
        findViewByPosition = this.f40123a.findViewByPosition(i);
        if (findViewByPosition != null) {
            m48927a(findViewByPosition, i);
        }
        findFirstVisibleItemPosition += 2;
        findViewByPosition = this.f40123a.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition != null) {
            m48927a(findViewByPosition, findFirstVisibleItemPosition);
        }
    }

    /* renamed from: a */
    private final void m48923a(int i) {
        float f = -1.0f;
        Function2 function2;
        if (this.f40123a.findFirstVisibleItemPosition() > 0) {
            function2 = this.f40128f;
            if (function2 != null) {
                C15813i c15813i = (C15813i) function2.invoke(Float.valueOf(-1.0f), Integer.valueOf(i));
                return;
            }
            return;
        }
        View findViewByPosition = this.f40123a.findViewByPosition(0);
        if (findViewByPosition != null) {
            int y = Size.Companion.getAbsoluteSize(findViewByPosition).getY();
            if (y > this.f40133k + this.f40126d) {
                f = 1.0f;
            } else if (y >= this.f40133k - this.f40126d) {
                f = ((float) (y - this.f40133k)) / ((float) this.f40126d);
            }
            function2 = this.f40128f;
            if (function2 != null) {
                c15813i = (C15813i) function2.invoke(Float.valueOf(f), Integer.valueOf(i));
            }
        }
    }
}
