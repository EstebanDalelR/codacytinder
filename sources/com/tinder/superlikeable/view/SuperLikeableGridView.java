package com.tinder.superlikeable.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tinder.domain.recs.model.Swipe.Method;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.superlikeable.C15088a.C15083a;
import com.tinder.superlikeable.animation.C15122e;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003XYZB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u00103\u001a\u0002042\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\fH\u0002J\u0018\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00112\u0006\u00107\u001a\u00020\fH\u0002J\u0018\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u0015H\u0014J\u0010\u0010=\u001a\u00020>2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010?\u001a\u00020@H\u0016J\u0018\u0010A\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010B\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010C\u001a\u00020\u0017H\u0014J\u0010\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020FH\u0016J0\u0010G\u001a\u00020\u00172\u0006\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00152\u0006\u0010K\u001a\u00020\u00152\u0006\u0010L\u001a\u00020\u0015H\u0014J\u0018\u0010M\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u0015H\u0014J\u0010\u0010P\u001a\u00020@2\u0006\u0010Q\u001a\u00020FH\u0016J\u000e\u0010R\u001a\u00020\u00172\u0006\u0010S\u001a\u00020TJ\u0014\u0010U\u001a\u00020\u00172\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eJ\b\u0010W\u001a\u00020\u0017H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000RR\u0010\u000f\u001a:\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010j\u0004\u0018\u0001`\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR8\u0010 \u001a\f\u0012\u0004\u0012\u00020\u00170\u001ej\u0002`\u001f2\u0010\u0010\u001d\u001a\f\u0012\u0004\u0012\u00020\u00170\u001ej\u0002`\u001f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$Rg\u0010%\u001aO\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b('\u0012\u0013\u0012\u00110(¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u0017\u0018\u00010&j\u0004\u0018\u0001`*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R6\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170&j\u0002`0X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.¨\u0006["}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableGridView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "childDrawingOrderController", "Lcom/tinder/superlikeable/view/SuperLikeableGridView$ChildDrawingOrderController;", "controller", "Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController;", "flingEscapeVelocity", "", "introAnimator", "Lcom/tinder/superlikeable/animation/SuperLikeableIntroAnimator;", "onCellClickedListener", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "index", "", "Lcom/tinder/superlikeable/view/OnCellClickedListener;", "getOnCellClickedListener", "()Lkotlin/jvm/functions/Function2;", "setOnCellClickedListener", "(Lkotlin/jvm/functions/Function2;)V", "value", "Lkotlin/Function0;", "Lcom/tinder/superlikeable/view/OnFlingCompleteListener;", "onFlingCompleteListener", "getOnFlingCompleteListener", "()Lkotlin/jvm/functions/Function0;", "setOnFlingCompleteListener", "(Lkotlin/jvm/functions/Function0;)V", "onSwipeListener", "Lkotlin/Function3;", "viewIndex", "Lcom/tinder/domain/recs/model/Swipe$Method;", "swipeMethod", "Lcom/tinder/superlikeable/view/OnSwipeListener;", "getOnSwipeListener", "()Lkotlin/jvm/functions/Function3;", "setOnSwipeListener", "(Lkotlin/jvm/functions/Function3;)V", "onViewMovedListener", "Lcom/tinder/superlikeable/view/OnViewMovedListener;", "getOnViewMovedListener", "setOnViewMovedListener", "applyGravityToLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "calculateItemAlpha", "height", "dragY", "changeAlphaOfGridItemsWhenViewMoved", "selectedView", "getChildDrawingOrder", "childCount", "iteration", "getLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "hasOverlappingRendering", "", "onCardClickedListener", "onCardSuperLikeClicked", "onDetachedFromWindow", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "setAdapter", "adapter", "Lcom/tinder/superlikeable/view/SuperLikeableGridView$GridAdapter;", "showIntroTutorialAnimation", "onAnimationEndListener", "verifyClipChildren", "CellView", "ChildDrawingOrderController", "GridAdapter", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableGridView extends FrameLayout {
    /* renamed from: a */
    private final float f47159a;
    /* renamed from: b */
    private final C16907b f47160b;
    /* renamed from: c */
    private final C15122e f47161c;
    @Nullable
    /* renamed from: d */
    private Function3<? super View, ? super Integer, ? super Method, C15813i> f47162d;
    /* renamed from: e */
    private final C15157a f47163e = new C15157a();
    @NotNull
    /* renamed from: f */
    private Function3<? super View, ? super Float, ? super Float, C15813i> f47164f = SuperLikeableGridView$onViewMovedListener$1.f58614a;
    @Nullable
    /* renamed from: g */
    private Function2<? super View, ? super Integer, C15813i> f47165g;
    @NotNull
    /* renamed from: h */
    private Function0<C15813i> f47166h = SuperLikeableGridView$onFlingCompleteListener$1.f58613a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableGridView$GridAdapter;", "", "getCount", "", "getView", "Lcom/tinder/superlikeable/view/SuperLikeableGridView$CellView;", "container", "Landroid/view/ViewGroup;", "position", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public interface GridAdapter {
        int getCount();

        @NotNull
        CellView getView(@NotNull ViewGroup viewGroup, int i);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableGridView$ChildDrawingOrderController;", "", "()V", "<set-?>", "", "activeChildIndex", "getActiveChildIndex", "()I", "setActiveChildIndex", "(I)V", "getDrawingOrder", "childCount", "iteration", "resetChildIndex", "", "updateActiveChildIndex", "newActiveChildIndex", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableGridView$a */
    public static final class C15157a {
        /* renamed from: a */
        private int f47153a = Integer.MIN_VALUE;

        /* renamed from: a */
        public final void m57027a(int i) {
            this.f47153a = i;
        }

        /* renamed from: a */
        public final int m57025a(int i, int i2) {
            if ((i2 < i ? 1 : null) == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid iteration = ");
                stringBuilder.append(i2);
                stringBuilder.append(" for childCount = ");
                stringBuilder.append(i);
                throw ((Throwable) new IllegalStateException(stringBuilder.toString().toString()));
            } else if (this.f47153a == Integer.MIN_VALUE) {
                return i2;
            } else {
                if (i2 == i - 1) {
                    i2 = this.f47153a;
                } else if (i2 >= this.f47153a) {
                    i2++;
                }
                return i2;
            }
        }

        /* renamed from: a */
        public final void m57026a() {
            this.f47153a = Integer.MIN_VALUE;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableGridView$b */
    static final class C15158b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableGridView f47154a;
        /* renamed from: b */
        final /* synthetic */ CellView f47155b;
        /* renamed from: c */
        final /* synthetic */ int f47156c;

        C15158b(SuperLikeableGridView superLikeableGridView, CellView cellView, int i) {
            this.f47154a = superLikeableGridView;
            this.f47155b = cellView;
            this.f47156c = i;
        }

        public final void onClick(View view) {
            this.f47154a.m57038b(this.f47155b, this.f47156c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableGridView$c */
    static final class C15159c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableGridView f47157a;
        /* renamed from: b */
        final /* synthetic */ CellView f47158b;

        C15159c(SuperLikeableGridView superLikeableGridView, CellView cellView) {
            this.f47157a = superLikeableGridView;
            this.f47158b = cellView;
        }

        public final void onClick(View view) {
            this.f47157a.m57037b(this.f47158b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableGridView$CellView;", "Landroid/support/v7/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onCellClickedListener", "Landroid/view/View$OnClickListener;", "onCellSuperLikeClickedListener", "hasOverlappingRendering", "", "notifyCellClicked", "", "view", "notifySuperLikeClicked", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onViewMoved", "dragX", "", "dragY", "setOnCellClickedListener", "setOnCellSuperLikeClickListener", "onCardSuperLikeClickedListener", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public static abstract class CellView extends CardView {
        /* renamed from: a */
        private OnClickListener f52072a = ((OnClickListener) C15156b.f47152a);
        /* renamed from: b */
        private OnClickListener f52073b = ((OnClickListener) C15155a.f47151a);

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.superlikeable.view.SuperLikeableGridView$CellView$a */
        static final class C15155a implements OnClickListener {
            /* renamed from: a */
            public static final C15155a f47151a = new C15155a();

            C15155a() {
            }

            public final void onClick(View view) {
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.superlikeable.view.SuperLikeableGridView$CellView$b */
        static final class C15156b implements OnClickListener {
            /* renamed from: a */
            public static final C15156b f47152a = new C15156b();

            C15156b() {
            }

            public final void onClick(View view) {
            }
        }

        /* renamed from: a */
        public abstract void mo13541a(float f, float f2);

        public boolean hasOverlappingRendering() {
            return false;
        }

        public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
            return false;
        }

        public CellView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
            C2668g.b(context, "context");
            super(context, attributeSet);
        }

        /* renamed from: a */
        public final void m62510a(@NotNull CellView cellView) {
            C2668g.b(cellView, "view");
            this.f52072a.onClick(cellView);
        }

        public final void setOnCellSuperLikeClickListener(@NotNull OnClickListener onClickListener) {
            C2668g.b(onClickListener, "onCardSuperLikeClickedListener");
            this.f52072a = onClickListener;
        }

        /* renamed from: b */
        public final void m62511b(@NotNull CellView cellView) {
            C2668g.b(cellView, "view");
            this.f52073b.onClick(cellView);
        }

        public final void setOnCellClickedListener(@NotNull OnClickListener onClickListener) {
            C2668g.b(onClickListener, "onCellClickedListener");
            this.f52073b = onClickListener;
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public SuperLikeableGridView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        final SuperLikeableGridView superLikeableGridView = this;
        C2668g.b(context, "context");
        super(context, attributeSet);
        superLikeableGridView.f47159a = ((float) context.getResources().getDimensionPixelSize(C15083a.fling_escape_velocity_dp)) * 6.0f;
        ViewGroup viewGroup = superLikeableGridView;
        SuperLikeableViewDragHelper superLikeableViewDragHelper = new SuperLikeableViewDragHelper(viewGroup, null, null, null, null, null, null, 126, null);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C2668g.a(viewConfiguration, "ViewConfiguration.get(context)");
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        superLikeableGridView.f47161c = new C15122e(superLikeableViewDragHelper, null, 2, null);
        SuperLikeableViewDragHelper superLikeableViewDragHelper2 = superLikeableViewDragHelper;
        C16907b c16907b = r2;
        C16907b c16907b2 = new C16907b(viewGroup, scaledTouchSlop, new C16905a(superLikeableGridView.f47159a), superLikeableViewDragHelper, null, null, null, null, null, null, null, 2032, null);
        superLikeableGridView.f47160b = c16907b;
        superLikeableGridView.f47160b.m62548a((Function2) new Function2<View, Method, C15813i>() {
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                m67444a((View) obj, (Method) obj2);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67444a(@NotNull View view, @NotNull Method method) {
                C2668g.b(view, "view");
                C2668g.b(method, "swipeMethod");
                Function3 onSwipeListener = superLikeableGridView.getOnSwipeListener();
                if (onSwipeListener != null) {
                    C15813i c15813i = (C15813i) onSwipeListener.invoke(view, Integer.valueOf(superLikeableGridView.indexOfChild(view)), method);
                }
            }
        });
        superLikeableGridView.f47160b.m62547a((Function1) new Function1<View, C15813i>() {
            public /* synthetic */ Object invoke(Object obj) {
                m67445a((View) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67445a(@NotNull View view) {
                C2668g.b(view, "view");
                superLikeableGridView.f47163e.m57027a(superLikeableGridView.indexOfChild(view));
                superLikeableGridView.invalidate();
            }
        });
        superLikeableGridView.f47160b.m62550b((Function0) new Function0<C15813i>() {
            public /* synthetic */ Object invoke() {
                m67446a();
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67446a() {
                superLikeableGridView.f47163e.m57026a();
                superLikeableGridView.invalidate();
            }
        });
        superLikeableViewDragHelper2.m57052a((Function3) new Function3<View, Float, Float, C15813i>() {
            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m67447a((View) obj, ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67447a(@NotNull View view, float f, float f2) {
                C2668g.b(view, "view");
                superLikeableGridView.getOnViewMovedListener().invoke(view, Float.valueOf(f), Float.valueOf(f2));
                superLikeableGridView.m57033a(view, f2);
            }
        });
        setChildrenDrawingOrderEnabled(true);
    }

    @Nullable
    public final Function3<View, Integer, Method, C15813i> getOnSwipeListener() {
        return this.f47162d;
    }

    public final void setOnSwipeListener(@Nullable Function3<? super View, ? super Integer, ? super Method, C15813i> function3) {
        this.f47162d = function3;
    }

    @NotNull
    public final Function3<View, Float, Float, C15813i> getOnViewMovedListener() {
        return this.f47164f;
    }

    public final void setOnViewMovedListener(@NotNull Function3<? super View, ? super Float, ? super Float, C15813i> function3) {
        C2668g.b(function3, "<set-?>");
        this.f47164f = function3;
    }

    @Nullable
    public final Function2<View, Integer, C15813i> getOnCellClickedListener() {
        return this.f47165g;
    }

    public final void setOnCellClickedListener(@Nullable Function2<? super View, ? super Integer, C15813i> function2) {
        this.f47165g = function2;
    }

    @NotNull
    public final Function0<C15813i> getOnFlingCompleteListener() {
        return this.f47166h;
    }

    public final void setOnFlingCompleteListener(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "value");
        this.f47160b.m62546a((Function0) function0);
    }

    protected int getChildDrawingOrder(int i, int i2) {
        return this.f47163e.m57025a(i, i2);
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int i3;
        if (getChildCount() != 4) {
            if (getChildCount() != 0) {
                obj = null;
                if (obj != null) {
                    throw ((Throwable) new IllegalStateException("Unexpected Child count. The child count should be 0 or 4".toString()));
                }
                int i4;
                int size = MeasureSpec.getSize(i);
                int size2 = MeasureSpec.getSize(i2);
                i = MeasureSpec.getMode(i);
                i2 = MeasureSpec.getMode(i2);
                i4 = size2 / 2;
                i = MeasureSpec.makeMeasureSpec(size / 2, i);
                i2 = MeasureSpec.makeMeasureSpec(i4, i2);
                i4 = getChildCount();
                for (i3 = 0; i3 < i4; i3++) {
                    measureChildWithMargins(getChildAt(i3), i, 0, i2, 0);
                }
                setMeasuredDimension(size, size2);
                return;
            }
        }
        obj = 1;
        if (obj != null) {
            int size3 = MeasureSpec.getSize(i);
            int size22 = MeasureSpec.getSize(i2);
            i = MeasureSpec.getMode(i);
            i2 = MeasureSpec.getMode(i2);
            i4 = size22 / 2;
            i = MeasureSpec.makeMeasureSpec(size3 / 2, i);
            i2 = MeasureSpec.makeMeasureSpec(i4, i2);
            i4 = getChildCount();
            for (i3 = 0; i3 < i4; i3++) {
                measureChildWithMargins(getChildAt(i3), i, 0, i2, 0);
            }
            setMeasuredDimension(size3, size22);
            return;
        }
        throw ((Throwable) new IllegalStateException("Unexpected Child count. The child count should be 0 or 4".toString()));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m57032a();
    }

    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "ev");
        if (this.f47160b.m62551b(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        return this.f47160b.m62549a(motionEvent);
    }

    protected void onDetachedFromWindow() {
        this.f47161c.m56954a();
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void m57039a(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "onAnimationEndListener");
        C15122e c15122e = this.f47161c;
        View childAt = getChildAt(0);
        C2668g.a(childAt, "getChildAt(0)");
        this.f47161c.m56955a(c15122e.m56953a(childAt), function0);
    }

    public final void setAdapter(@NotNull GridAdapter gridAdapter) {
        C2668g.b(gridAdapter, "adapter");
        removeAllViews();
        int count = gridAdapter.getCount();
        for (int i = 0; i < count; i++) {
            CellView view = gridAdapter.getView(this, i);
            View view2 = view;
            addView(view2, m57030a(view2, i));
            view.setOnCellClickedListener(new C15158b(this, view, i));
            view.setOnCellSuperLikeClickListener(new C15159c(this, view));
        }
    }

    /* renamed from: a */
    private final void m57032a() {
        ViewParent parent = getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (VERSION.SDK_INT < 18) {
            viewGroup.setClipChildren(false);
        } else if ((viewGroup.getClipChildren() ^ 1) == 0) {
            throw new IllegalStateException("Check implementation. The Parent should have clipChildren false".toString());
        }
    }

    /* renamed from: a */
    private final LayoutParams m57030a(View view, int i) {
        view = m57029a(view);
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        LayoutParams layoutParams = (LayoutParams) view;
        switch (i) {
            case 0:
                layoutParams.gravity = 8388659;
                break;
            case 1:
                layoutParams.gravity = 8388661;
                break;
            case 2:
                layoutParams.gravity = 8388691;
                break;
            case 3:
                layoutParams.gravity = 8388693;
                break;
            default:
                break;
        }
        return layoutParams;
    }

    /* renamed from: a */
    private final ViewGroup.LayoutParams m57029a(View view) {
        view = view.getLayoutParams();
        return view == null ? (ViewGroup.LayoutParams) new LayoutParams(-1, -1) : view;
    }

    /* renamed from: b */
    private final void m57037b(View view) {
        Function2 a = this.f47160b.m62545a();
        this.f47160b.m62548a(C15175c.m57067a());
        this.f47160b.onViewSelected(view);
        this.f47160b.onViewDragged(view, 0.0f, -1.0f, 0.0f, 0.0f);
        this.f47160b.onViewReleased(view, 0.0f, this.f47159a * ((float) -1));
        a.invoke(view, SwipeMethod.GAMEPAD_BUTTON);
    }

    /* renamed from: b */
    private final void m57038b(View view, int i) {
        Function2 function2 = this.f47165g;
        if (function2 != null) {
            C15813i c15813i = (C15813i) function2.invoke(view, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private final void m57033a(View view, float f) {
        int i = 0;
        if (f < ((float) null)) {
            if (view.getHeight() > 0) {
                f = m57028a((float) view.getHeight(), Math.abs(f));
                int childCount = getChildCount();
                while (i < childCount) {
                    View childAt = getChildAt(i);
                    if (!C2668g.a(childAt, view)) {
                        C2668g.a(childAt, "childView");
                        if (childAt.getAlpha() != f) {
                            childAt.setAlpha(f);
                        }
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private final float m57028a(float f, float f2) {
        return ((float) 1) - Math.max(Math.min(f2 / f, 0.8f), 0.0f);
    }
}
