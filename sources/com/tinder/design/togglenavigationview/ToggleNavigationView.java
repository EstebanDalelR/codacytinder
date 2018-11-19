package com.tinder.design.togglenavigationview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tinder.design.togglenavigationview.C8835b.C8833a;
import com.tinder.design.togglenavigationview.C8835b.C8834b;
import com.tinder.design.togglenavigationview.FlingHelper.Callback;
import com.tinder.design.togglenavigationview.p230a.C8831a;
import com.tinder.design.togglenavigationview.p230a.C8832b;
import com.tinder.utils.au;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¥\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0012*\u0001\u0015\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0004ghijB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0019J\u0010\u00101\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020/H\u0002J\u0010\u00105\u001a\u0002062\u0006\u00102\u001a\u000203H\u0002J\u0010\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000fH\u0002J\b\u00109\u001a\u00020*H\u0002J\b\u0010:\u001a\u00020 H\u0016J\u0018\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000fH\u0002J\b\u0010>\u001a\u00020/H\u0002J\u0010\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020AH\u0014J\u0010\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020DH\u0016J0\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000fH\u0014J\u0010\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u000fH\u0016J\u0010\u0010M\u001a\u00020/2\u0006\u0010L\u001a\u00020\u000fH\u0016J\b\u0010N\u001a\u00020/H\u0016J\b\u0010O\u001a\u00020/H\u0016J(\u0010P\u001a\u00020/2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\u000fH\u0014J\u0010\u0010U\u001a\u00020 2\u0006\u0010V\u001a\u00020DH\u0016J\u0010\u0010W\u001a\u00020/2\u0006\u0010X\u001a\u00020YH\u0002J\u0010\u0010Z\u001a\u00020/2\u0006\u0010X\u001a\u00020YH\u0002J\u000e\u0010[\u001a\u00020/2\u0006\u00100\u001a\u00020\u0019J\u000e\u0010\\\u001a\u00020/2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010]\u001a\u00020/2\u0006\u0010^\u001a\u00020\u000fJ\u0010\u0010_\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010`\u001a\u00020 H\u0002J\b\u0010a\u001a\u00020/H\u0002J\u0010\u0010b\u001a\u00020/2\u0006\u0010c\u001a\u00020\u000fH\u0002J\u0010\u0010d\u001a\u00020/2\u0006\u0010e\u001a\u00020\u000fH\u0002J\u0010\u0010f\u001a\u00020/2\u0006\u0010X\u001a\u00020YH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R$\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000¨\u0006k"}, d2 = {"Lcom/tinder/design/togglenavigationview/ToggleNavigationView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/design/togglenavigationview/ScrollingViewContainer;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/tinder/design/togglenavigationview/ToggleNavigationView$Adapter;", "backgroundDrawableInsetPx", "", "childViewFinder", "Lcom/tinder/design/togglenavigationview/ChildViewFinder;", "childViewHeight", "", "flingHelper", "Lcom/tinder/design/togglenavigationview/FlingHelper;", "navIconCentersX", "Landroid/util/SparseIntArray;", "onDataSetChangedListener", "com/tinder/design/togglenavigationview/ToggleNavigationView$onDataSetChangedListener$1", "Lcom/tinder/design/togglenavigationview/ToggleNavigationView$onDataSetChangedListener$1;", "onSelectionChangeListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/design/togglenavigationview/ToggleNavigationView$OnSelectionChangeListener;", "paddingExtra", "scaleWhenSelected", "scaleWhenUnselected", "scrollDetector", "Lcom/tinder/design/togglenavigationview/ScrollDetector;", "selected", "", "selectedBackgroundRenderer", "Lcom/tinder/design/togglenavigationview/renderer/SelectedSegmentBackgroundRenderer;", "<set-?>", "selectedIndex", "getSelectedIndex", "()I", "setSelectedIndex", "(I)V", "shadowColors", "", "viewBackgroundInsetTop", "viewBackgroundRenderer", "Lcom/tinder/design/togglenavigationview/renderer/CircularBackgroundRenderer;", "addOnSelectionChangeListener", "", "onSelectionChangeListener", "applyLayoutParams", "childView", "Landroid/view/View;", "createAndAddNewChildViews", "getLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "getRadius", "height", "getSelectedSegmentBackgroundShadowColors", "isSelected", "notifySelectionChanged", "nextIndex", "prevIndex", "onDataSetChanged", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onLayout", "changed", "l", "t", "r", "b", "onPreScroll", "dx", "onScroll", "onScrollFinished", "onScrollStarted", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", "event", "onViewSelected", "animationDuration", "", "onViewUnselected", "removeOnSelectionChangeListener", "setAdapter", "setDisplayedIndex", "index", "setSelected", "shouldShowBackgroundRenderer", "updateBackgroundRendererVisibility", "updateSelectedBackgroundRendererCenter", "targetIndex", "updateSelectedScale", "childViewCount", "updateViewPositions", "Adapter", "Companion", "FlingCallback", "OnSelectionChangeListener", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
public final class ToggleNavigationView extends LinearLayout implements ScrollingViewContainer {
    /* renamed from: a */
    public static final C8829a f35888a = new C8829a();
    /* renamed from: b */
    private Adapter f35889b;
    /* renamed from: c */
    private final int f35890c;
    /* renamed from: d */
    private final float f35891d;
    /* renamed from: e */
    private final int[] f35892e;
    /* renamed from: f */
    private final C8831a f35893f;
    /* renamed from: g */
    private final C8832b f35894g;
    /* renamed from: h */
    private final CopyOnWriteArraySet<OnSelectionChangeListener> f35895h;
    /* renamed from: i */
    private final SparseIntArray f35896i;
    /* renamed from: j */
    private float f35897j;
    /* renamed from: k */
    private float f35898k;
    /* renamed from: l */
    private boolean f35899l;
    /* renamed from: m */
    private int f35900m;
    /* renamed from: n */
    private final FlingHelper f35901n;
    /* renamed from: o */
    private final C11103a f35902o;
    /* renamed from: p */
    private final ScrollDetector f35903p;
    /* renamed from: q */
    private final float f35904q;
    /* renamed from: r */
    private final int f35905r;
    /* renamed from: s */
    private final C11102d f35906s;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0010H&J\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/design/togglenavigationview/ToggleNavigationView$Adapter;", "", "()V", "onDataSetChangedListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/design/togglenavigationview/ToggleNavigationView$Adapter$OnDataSetChangedListener;", "addOnDataSetChangedListener", "", "onDataSetChangedListener", "afterNotifyDataSetChanged", "beforeNotifyDataSetChanged", "createView", "Landroid/view/View;", "context", "Landroid/content/Context;", "index", "", "getCount", "getDefaultDisplayedIndex", "notifyDataSetChanged", "removeOnDataSetChangedListener", "OnDataSetChangedListener", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
    public static abstract class Adapter {
        /* renamed from: a */
        private final CopyOnWriteArraySet<OnDataSetChangedListener> f30960a = new CopyOnWriteArraySet();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/design/togglenavigationview/ToggleNavigationView$Adapter$OnDataSetChangedListener;", "", "onDataSetChanged", "", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
        public interface OnDataSetChangedListener {
            void onDataSetChanged();
        }

        /* renamed from: a */
        public abstract int mo11093a();

        @NotNull
        /* renamed from: a */
        public abstract View mo11095a(@NotNull Context context, int i);

        /* renamed from: b */
        public abstract int mo11097b();

        /* renamed from: d */
        public void m37578d() {
        }

        /* renamed from: e */
        public void mo11098e() {
        }

        /* renamed from: a */
        public final void m37574a(@NotNull OnDataSetChangedListener onDataSetChangedListener) {
            C2668g.b(onDataSetChangedListener, "onDataSetChangedListener");
            this.f30960a.add(onDataSetChangedListener);
        }

        /* renamed from: b */
        public final void m37576b(@NotNull OnDataSetChangedListener onDataSetChangedListener) {
            C2668g.b(onDataSetChangedListener, "onDataSetChangedListener");
            this.f30960a.remove(onDataSetChangedListener);
        }

        /* renamed from: c */
        public final void m37577c() {
            m37578d();
            for (OnDataSetChangedListener onDataSetChanged : this.f30960a) {
                onDataSetChanged.onDataSetChanged();
            }
            mo11098e();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/tinder/design/togglenavigationview/ToggleNavigationView$OnSelectionChangeListener;", "", "onSelectionChanged", "", "nextIndex", "", "prevIndex", "onSelectionClicked", "index", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
    public interface OnSelectionChangeListener {
        void onSelectionChanged(int i, int i2);

        void onSelectionClicked(int i);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/design/togglenavigationview/ToggleNavigationView$Companion;", "", "()V", "INVALID_INDEX", "", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.togglenavigationview.ToggleNavigationView$a */
    public static final class C8829a {
        private C8829a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tinder/design/togglenavigationview/ToggleNavigationView$createAndAddNewChildViews$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.togglenavigationview.ToggleNavigationView$c */
    static final class C8830c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ int f30961a;
        /* renamed from: b */
        final /* synthetic */ ToggleNavigationView f30962b;

        C8830c(int i, ToggleNavigationView toggleNavigationView) {
            this.f30961a = i;
            this.f30962b = toggleNavigationView;
        }

        public final void onClick(View view) {
            this.f30962b.setDisplayedIndex(this.f30961a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tinder/design/togglenavigationview/ToggleNavigationView$FlingCallback;", "Lcom/tinder/design/togglenavigationview/FlingHelper$Callback;", "(Lcom/tinder/design/togglenavigationview/ToggleNavigationView;)V", "flingBy", "", "dx", "", "flingCancelled", "flingFinished", "targetIndex", "flingStarted", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.togglenavigationview.ToggleNavigationView$b */
    private final class C11101b implements Callback {
        /* renamed from: a */
        final /* synthetic */ ToggleNavigationView f35886a;

        public void flingCancelled() {
        }

        public void flingStarted() {
        }

        public C11101b(ToggleNavigationView toggleNavigationView) {
            this.f35886a = toggleNavigationView;
        }

        public void flingBy(int i) {
            this.f35886a.f35894g.m37590b(i);
            this.f35886a.invalidate();
        }

        public void flingFinished(int i) {
            this.f35886a.setDisplayedIndex(i);
            this.f35886a.m43792c(i);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/design/togglenavigationview/ToggleNavigationView$onDataSetChangedListener$1", "Lcom/tinder/design/togglenavigationview/ToggleNavigationView$Adapter$OnDataSetChangedListener;", "(Lcom/tinder/design/togglenavigationview/ToggleNavigationView;)V", "onDataSetChanged", "", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.togglenavigationview.ToggleNavigationView$d */
    public static final class C11102d implements OnDataSetChangedListener {
        /* renamed from: a */
        final /* synthetic */ ToggleNavigationView f35887a;

        C11102d(ToggleNavigationView toggleNavigationView) {
            this.f35887a = toggleNavigationView;
        }

        public void onDataSetChanged() {
            this.f35887a.m43780a();
        }
    }

    public /* synthetic */ ToggleNavigationView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public ToggleNavigationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f35890c = (int) au.a(this, 48.0f);
        this.f35891d = au.a(this, 1.0f);
        this.f35892e = getSelectedSegmentBackgroundShadowColors();
        this.f35893f = new C8831a(au.c(this, C8833a.toggle_background));
        this.f35894g = new C8832b(this.f35892e, this.f35891d);
        this.f35895h = new CopyOnWriteArraySet();
        this.f35896i = new SparseIntArray();
        this.f35897j = 1.0f;
        this.f35898k = 1.1f;
        this.f35900m = -1;
        Resources resources = getResources();
        C2668g.a(resources, "resources");
        this.f35901n = new FlingHelper(resources.getDisplayMetrics().density, new C11101b(this), null, null, 12, null);
        this.f35902o = new C11103a(this, this.f35894g);
        this.f35903p = new ScrollDetector(this, this.f35902o, null, 4, null);
        this.f35904q = this.f35891d * ((float) this.f35894g.m37584a());
        this.f35905r = (int) au.a(this, 5.0f);
        this.f35906s = new C11102d(this);
        setOrientation(0);
        setClipToPadding(false);
        setClipChildren(false);
        setWillNotDraw(false);
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C8834b.ToggleNavigationView);
            try {
                this.f35897j = context.getFloat(C8834b.ToggleNavigationView_tnv_scaleWhenSelected, 1.0f);
                this.f35898k = context.getFloat(C8834b.ToggleNavigationView_tnv_scaleWhenUnselected, 1.1f);
            } finally {
                context.recycle();
            }
        }
        context = Math.max((int) this.f35904q, this.f35905r);
        setPadding(getPaddingLeft() + context, getPaddingTop(), getPaddingRight() + context, getPaddingBottom());
    }

    private final void setSelectedIndex(int i) {
        this.f35900m = i;
    }

    public final int getSelectedIndex() {
        return this.f35900m;
    }

    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "ev");
        if (!isSelected()) {
            if (!this.f35903p.m37571a()) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        if (!isSelected()) {
            if (!this.f35903p.m37571a()) {
                return super.onTouchEvent(motionEvent);
            }
        }
        this.f35903p.m37570a(motionEvent);
        return true;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i3 = m43786b(i2);
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        C8831a.m37580a(this.f35893f, i5, i6, i7, (int) this.f35904q, (int) this.f35904q, 0, 0, 96, null);
        this.f35894g.m37586a(i, i2, i3);
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.onDraw(canvas);
        this.f35893f.m37582a(canvas);
        this.f35894g.m37587a(canvas);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        z = getChildCount();
        for (boolean z2 = false; z2 < z; z2++) {
            i2 = getChildAt(z2);
            C2668g.a(i2, "childView");
            this.f35896i.put(z2, i2.getLeft() + (i2.getMeasuredWidth() / 2));
        }
        this.f35901n.m37556a(this.f35896i);
        if (!(this.f35901n.m37558c() || this.f35900m)) {
            this.f35894g.m37585a(this.f35896i.get(this.f35900m));
        }
        m43783a((long) false);
    }

    public void setSelected(boolean z) {
        this.f35899l = z;
        m43788b();
        m43783a(75);
        invalidate();
    }

    public boolean isSelected() {
        return this.f35899l;
    }

    public int onPreScroll(int i) {
        int b = ((this.f35894g.m37589b() + this.f35894g.m37591c()) / 2) + i;
        if (b <= this.f35901n.m37557b() || i <= 0) {
            return (b >= this.f35901n.m37553a() || i >= 0) ? i : (i + this.f35901n.m37553a()) - b;
        } else {
            return (i + this.f35901n.m37557b()) - b;
        }
    }

    public void onScroll(int i) {
        this.f35894g.m37590b(i);
        invalidate();
    }

    public void onScrollStarted() {
        this.f35901n.m37559d();
    }

    public void onScrollFinished() {
        this.f35901n.m37554a(this.f35894g.m37589b() + (this.f35894g.m37594f() / 2));
    }

    public final void setAdapter(@NotNull Adapter adapter) {
        C2668g.b(adapter, "adapter");
        Adapter adapter2 = this.f35889b;
        if (adapter2 != null) {
            adapter2.m37576b(this.f35906s);
        }
        adapter.m37574a(this.f35906s);
        this.f35889b = adapter;
        this.f35900m = -1;
        m43791c();
        setDisplayedIndex(adapter.mo11097b());
    }

    public final void setDisplayedIndex(int i) {
        if (i != this.f35900m) {
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                C2668g.a(childAt, "childView");
                childAt.setSelected(i == i2);
                i2++;
            }
            m43782a(i, this.f35900m);
            this.f35901n.m37559d();
            if (this.f35896i.size() <= 0 || !this.f35899l) {
                m43792c(i);
            } else {
                this.f35901n.m37555a(this.f35894g.m37589b() + (this.f35894g.m37594f() / 2), i);
            }
            this.f35900m = i;
            if (this.f35899l == 0) {
                m43783a(45);
            }
        }
    }

    /* renamed from: a */
    public final void m43795a(@NotNull OnSelectionChangeListener onSelectionChangeListener) {
        C2668g.b(onSelectionChangeListener, "onSelectionChangeListener");
        this.f35895h.add(onSelectionChangeListener);
    }

    /* renamed from: b */
    public final void m43796b(@NotNull OnSelectionChangeListener onSelectionChangeListener) {
        C2668g.b(onSelectionChangeListener, "onSelectionChangeListener");
        this.f35895h.remove(onSelectionChangeListener);
    }

    /* renamed from: a */
    private final void m43780a() {
        this.f35900m = -1;
        this.f35896i.clear();
        this.f35901n.m37559d();
        m43791c();
        Adapter adapter = this.f35889b;
        if (adapter != null) {
            setDisplayedIndex(adapter.mo11097b());
        }
        m43788b();
    }

    /* renamed from: b */
    private final void m43788b() {
        this.f35893f.m37583a(m43794d());
        this.f35894g.m37588a(m43794d());
    }

    /* renamed from: c */
    private final void m43791c() {
        removeAllViews();
        Adapter adapter = this.f35889b;
        if (adapter != null) {
            int a = adapter.mo11093a();
            for (int i = 0; i < a; i++) {
                Context context = getContext();
                C2668g.a(context, "context");
                View a2 = adapter.mo11095a(context, i);
                m43784a(a2);
                addView(a2);
                a2.setOnClickListener(new C8830c(i, this));
            }
            m43781a(adapter.mo11093a());
        }
    }

    /* renamed from: a */
    private final void m43781a(int i) {
        this.f35897j = i == 1 ? 1067869798 : 1065353216;
    }

    /* renamed from: a */
    private final void m43782a(int i, int i2) {
        for (OnSelectionChangeListener onSelectionChanged : this.f35895h) {
            onSelectionChanged.onSelectionChanged(i, i2);
        }
    }

    /* renamed from: a */
    private final void m43784a(View view) {
        LayoutParams b = m43787b(view);
        b.gravity = 17;
        b.width = this.f35890c;
        b.height = this.f35890c + ((int) this.f35904q);
        view.setLayoutParams(b);
    }

    /* renamed from: b */
    private final LayoutParams m43787b(View view) {
        view = view.getLayoutParams();
        if (view == null) {
            return (LayoutParams) ((ViewGroup.LayoutParams) new LayoutParams(-2, -2));
        }
        if (view instanceof LayoutParams) {
            return (LayoutParams) view;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final int m43786b(int i) {
        return (i / 2) + this.f35905r;
    }

    private final int[] getSelectedSegmentBackgroundShadowColors() {
        return au.a(this, new int[]{C8833a.grey_t05, C8833a.grey_t10, C8833a.grey_t15, C8833a.grey_t15, C8833a.grey_t20, C8833a.grey_t25, 17170443});
    }

    /* renamed from: a */
    private final void m43783a(long j) {
        if (isSelected()) {
            m43789b(j);
        } else {
            m43793c(j);
        }
    }

    /* renamed from: b */
    private final void m43789b(long j) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            C2668g.a(childAt, "childView");
            childAt.setClickable(true);
            childAt.setSelected(i == this.f35900m);
            childAt.setActivated(true);
            childAt.animate().cancel();
            ViewPropertyAnimator scaleY = childAt.animate().alpha(1.0f).translationX(0.0f).scaleX(this.f35897j).scaleY(this.f35897j);
            C2668g.a(scaleY, "childView.animate()\n    …scaleY(scaleWhenSelected)");
            scaleY.setDuration(j);
            i++;
        }
    }

    /* renamed from: c */
    private final void m43793c(long j) {
        int left = getLeft() + (getWidth() / 2);
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            C2668g.a(childAt, "childView");
            childAt.setClickable(false);
            childAt.setSelected(false);
            childAt.setActivated(false);
            int left2 = childAt.getLeft() + (childAt.getWidth() / 2);
            float f = i == this.f35900m ? 1.0f : 0.0f;
            left2 = left - left2;
            childAt.animate().cancel();
            ViewPropertyAnimator scaleY = childAt.animate().alpha(f).translationX((float) left2).scaleX(this.f35898k).scaleY(this.f35898k);
            C2668g.a(scaleY, "childView.animate()\n    …aleY(scaleWhenUnselected)");
            scaleY.setDuration(j);
            i++;
        }
    }

    /* renamed from: c */
    private final void m43792c(int i) {
        this.f35894g.m37585a(this.f35896i.get(i));
        invalidate();
    }

    /* renamed from: d */
    private final boolean m43794d() {
        if (this.f35899l) {
            Adapter adapter = this.f35889b;
            if ((adapter != null ? adapter.mo11093a() : 0) > 1) {
                return true;
            }
        }
        return false;
    }
}
