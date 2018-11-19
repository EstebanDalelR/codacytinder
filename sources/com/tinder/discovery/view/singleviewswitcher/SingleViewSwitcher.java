package com.tinder.discovery.view.singleviewswitcher;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019*\u0001\u0015\b\u0016\u0018\u00002\u00020\u0001:\u0003012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u000eJ\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0013H\u0002J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0010H\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0014J\b\u0010&\u001a\u00020\u001aH\u0016J\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u000eJ\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0013H\u0002J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010+\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0010J\u0018\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0010H\u0002J\u0010\u0010/\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0013H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00180\nX\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$Adapter;", "childViewAnimators", "Landroid/util/SparseArray;", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewAnimator;", "childViewPreDetachListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewPreDetachListener;", "currentViewPosition", "", "disappearingViews", "", "Landroid/view/View;", "onDataSetChangedListener", "com/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$onDataSetChangedListener$1", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$onDataSetChangedListener$1;", "viewHolder", "Ljava/lang/ref/WeakReference;", "addAnimatorInternal", "", "adapterPosition", "childViewAnimator", "addOnChildViewPreDetachListener", "onChildViewPreDetachListener", "endAllChildViewAnimations", "getChildViewAdapterPosition", "childView", "getOrCreateView", "position", "onDataSetChanged", "onDetachedFromWindow", "removeAllViews", "removeChildViewPreDetachListener", "removeDisappearingView", "view", "setAdapter", "showViewAt", "switchViews", "currVisibleViewPosition", "nextVisibleViewPosition", "triggerChildViewPreDetach", "Adapter", "ChildViewAnimator", "ChildViewPreDetachListener", "discovery_release"}, k = 1, mv = {1, 1, 10})
public class SingleViewSwitcher extends FrameLayout {
    /* renamed from: a */
    private Adapter f31185a;
    /* renamed from: b */
    private int f31186b = -1;
    /* renamed from: c */
    private final SparseArray<WeakReference<View>> f31187c = new SparseArray();
    /* renamed from: d */
    private final SparseArray<C8908a> f31188d = new SparseArray();
    /* renamed from: e */
    private final CopyOnWriteArrayList<ChildViewPreDetachListener> f31189e = new CopyOnWriteArrayList();
    /* renamed from: f */
    private final List<View> f31190f = ((List) new ArrayList());
    /* renamed from: g */
    private final C11149b f31191g = new C11149b(this);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u0011\u001a\u00020\fH&J\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$Adapter;", "", "()V", "onDataSetChangedListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$Adapter$OnDataSetChangedListener;", "addOnDataSetChangedListener", "", "onDataSetChangedListener", "createChildViewAnimator", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewAnimator;", "position", "", "createView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "getCount", "notifyDataSetChanged", "removeOnDataSetChangedListener", "OnDataSetChangedListener", "discovery_release"}, k = 1, mv = {1, 1, 10})
    public static abstract class Adapter {
        /* renamed from: a */
        private final CopyOnWriteArraySet<OnDataSetChangedListener> f31182a = new CopyOnWriteArraySet();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$Adapter$OnDataSetChangedListener;", "", "onDataSetChanged", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
        public interface OnDataSetChangedListener {
            void onDataSetChanged();
        }

        /* renamed from: a */
        public abstract int mo11175a();

        @NotNull
        /* renamed from: a */
        public abstract View mo11176a(@NotNull ViewGroup viewGroup, int i);

        @NotNull
        /* renamed from: a */
        public abstract C8908a mo11177a(int i);

        /* renamed from: a */
        public final void m37704a(@NotNull OnDataSetChangedListener onDataSetChangedListener) {
            C2668g.b(onDataSetChangedListener, "onDataSetChangedListener");
            this.f31182a.add(onDataSetChangedListener);
        }

        /* renamed from: b */
        public final void m37706b(@NotNull OnDataSetChangedListener onDataSetChangedListener) {
            C2668g.b(onDataSetChangedListener, "onDataSetChangedListener");
            this.f31182a.remove(onDataSetChangedListener);
        }

        /* renamed from: b */
        public final void m37705b() {
            for (OnDataSetChangedListener onDataSetChanged : this.f31182a) {
                onDataSetChanged.onDataSetChanged();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewPreDetachListener;", "", "onChildViewPreDetachListener", "", "childView", "Landroid/view/View;", "discovery_release"}, k = 1, mv = {1, 1, 10})
    public interface ChildViewPreDetachListener {
        void onChildViewPreDetachListener(@NotNull View view);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH&J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH&R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewAnimator;", "", "()V", "isRunning", "", "parentView", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher;", "getParentView$discovery_release", "()Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher;", "setParentView$discovery_release", "(Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher;)V", "endAnimation", "", "onAnimationFinished", "view", "Landroid/view/View;", "onAnimationStarted", "startAppearingAnimation", "adapterPosition", "", "startDisappearingAnimation", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher$a */
    public static abstract class C8908a {
        @Nullable
        /* renamed from: a */
        private SingleViewSwitcher f31183a;
        /* renamed from: b */
        private boolean f31184b;

        /* renamed from: a */
        public abstract void mo10008a();

        /* renamed from: a */
        public abstract void mo10009a(int i, @NotNull View view);

        /* renamed from: b */
        public abstract void mo10010b(int i, @NotNull View view);

        /* renamed from: a */
        public final void m37710a(@Nullable SingleViewSwitcher singleViewSwitcher) {
            this.f31183a = singleViewSwitcher;
        }

        @CallSuper
        /* renamed from: a */
        public void m37709a(@NotNull View view) {
            C2668g.b(view, "view");
            this.f31184b = true;
        }

        @CallSuper
        /* renamed from: b */
        public void m37712b(@NotNull View view) {
            C2668g.b(view, "view");
            SingleViewSwitcher singleViewSwitcher = this.f31183a;
            if (singleViewSwitcher == null) {
                C2668g.a();
            }
            if (singleViewSwitcher.f31190f.contains(view)) {
                singleViewSwitcher.m37717a(view);
            }
            this.f31184b = null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$onDataSetChangedListener$1", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$Adapter$OnDataSetChangedListener;", "(Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher;)V", "onDataSetChanged", "", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher$b */
    public static final class C11149b implements OnDataSetChangedListener {
        /* renamed from: a */
        final /* synthetic */ SingleViewSwitcher f36063a;

        C11149b(SingleViewSwitcher singleViewSwitcher) {
            this.f36063a = singleViewSwitcher;
        }

        public void onDataSetChanged() {
            this.f36063a.m37714a();
        }
    }

    public SingleViewSwitcher(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
    }

    public final void setAdapter(@NotNull Adapter adapter) {
        C2668g.b(adapter, "adapter");
        Adapter adapter2 = this.f31185a;
        if (adapter2 != null) {
            adapter2.m37706b(this.f31191g);
            m37720b();
            this.f31188d.clear();
            this.f31187c.clear();
            removeAllViews();
            this.f31186b = -1;
        }
        this.f31185a = adapter;
        adapter.m37704a((OnDataSetChangedListener) this.f31191g);
        int a = adapter.mo11175a();
        for (int i = 0; i < a; i++) {
            m37716a(i, adapter.mo11177a(i));
        }
    }

    /* renamed from: a */
    private final void m37714a() {
        Adapter adapter = this.f31185a;
        if (adapter != null) {
            m37720b();
            this.f31188d.clear();
            this.f31187c.clear();
            removeAllViews();
            this.f31186b = -1;
            int a = adapter.mo11175a();
            for (int i = 0; i < a; i++) {
                m37716a(i, adapter.mo11177a(i));
            }
        }
    }

    /* renamed from: a */
    public final void m37724a(int i) {
        if (i != this.f31186b) {
            m37715a(this.f31186b, i);
            this.f31186b = i;
        }
    }

    protected void onDetachedFromWindow() {
        for (View c : this.f31190f) {
            ((C8908a) this.f31188d.get(m37723c(c))).mo10008a();
        }
        if (this.f31190f.isEmpty()) {
            super.onDetachedFromWindow();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C2668g.a(childAt, "getChildAt(i)");
            m37721b(childAt);
        }
        super.removeAllViews();
    }

    /* renamed from: a */
    public final void m37725a(@NotNull ChildViewPreDetachListener childViewPreDetachListener) {
        C2668g.b(childViewPreDetachListener, "onChildViewPreDetachListener");
        this.f31189e.add(childViewPreDetachListener);
    }

    /* renamed from: a */
    private final void m37716a(int i, C8908a c8908a) {
        c8908a.m37710a(this);
        this.f31188d.put(i, c8908a);
    }

    /* renamed from: b */
    private final void m37720b() {
        int size = this.f31188d.size();
        for (int i = 0; i < size; i++) {
            ((C8908a) this.f31188d.get(this.f31188d.keyAt(i))).mo10008a();
        }
    }

    /* renamed from: a */
    private final void m37715a(int i, int i2) {
        int i3 = 0;
        if ((i != i2 ? 1 : null) == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected: currVisibleViewPosition=");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append("nextVisibleViewPosition=");
            stringBuilder.append(i2);
            throw ((Throwable) new IllegalStateException(stringBuilder.toString().toString()));
        }
        m37720b();
        if ((getChildCount() <= 1 ? 1 : 0) == 0) {
            i = new StringBuilder();
            i.append("Check implementation: childCount=");
            i.append(getChildCount());
            i.append(", maxAllowed=1");
            throw ((Throwable) new IllegalStateException(i.toString().toString()));
        }
        List<View> list = (List) new ArrayList();
        for (int childCount = getChildCount(); childCount >= 1; childCount--) {
            View childAt = getChildAt(childCount - 1);
            detachViewFromParent(childAt);
            C2668g.a(childAt, "childView");
            list.add(childAt);
        }
        View b = m37719b(i2);
        if ((1 ^ list.contains(b)) == 0) {
            throw ((Throwable) new IllegalStateException("Check implementation: appearing view is present in detachedView".toString()));
        }
        for (View childAt2 : list) {
            int i4 = i3 + 1;
            int c = m37723c(childAt2);
            attachViewToParent(childAt2, i3, childAt2.getLayoutParams());
            this.f31190f.add(childAt2);
            ((C8908a) this.f31188d.get(c)).mo10010b(c, childAt2);
            i3 = i4;
        }
        addView(b);
        ((C8908a) this.f31188d.get(i2)).mo10009a(i2, b);
        list.clear();
    }

    /* renamed from: b */
    private final View m37719b(int i) {
        if (this.f31187c.get(i) == null || ((WeakReference) this.f31187c.get(i)).get() == null) {
            SparseArray sparseArray = this.f31187c;
            Adapter adapter = this.f31185a;
            if (adapter == null) {
                C2668g.a();
            }
            sparseArray.put(i, new WeakReference(adapter.mo11176a(this, i)));
        }
        i = ((WeakReference) this.f31187c.get(i)).get();
        if (i == 0) {
            C2668g.a();
        }
        return (View) i;
    }

    /* renamed from: a */
    private final void m37717a(View view) {
        m37721b(view);
        this.f31190f.remove(view);
        removeView(view);
    }

    /* renamed from: b */
    private final void m37721b(View view) {
        for (ChildViewPreDetachListener onChildViewPreDetachListener : this.f31189e) {
            onChildViewPreDetachListener.onChildViewPreDetachListener(view);
        }
    }

    /* renamed from: c */
    private final int m37723c(View view) {
        int size = this.f31187c.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.f31187c.keyAt(i);
            WeakReference weakReference = (WeakReference) this.f31187c.get(keyAt);
            if (C2668g.a(view, weakReference != null ? (View) weakReference.get() : null)) {
                return keyAt;
            }
        }
        return -1;
    }
}
