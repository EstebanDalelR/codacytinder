package com.tinder.design.tabbedpagelayout;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C2887d;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0003()*B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J-\u0010\u0018\u001a\u00020\u00112%\u0010\u0019\u001a!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u0012J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\nH\u0002J\b\u0010!\u001a\u00020\u0011H\u0014J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0014J\u000e\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\nJ\u000e\u0010&\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010'\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R3\u0010\u000b\u001a'\u0012#\u0012!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00120\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/tinder/design/tabbedpagelayout/TabLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/tinder/design/tabbedpagelayout/TabLayout$Adapter;", "selectedTabIndex", "", "tabReselectionListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "", "Lcom/tinder/design/tabbedpagelayout/TabReselectionListener;", "tabs", "Landroid/util/SparseArray;", "Lcom/tinder/design/tabbedpagelayout/TabLayout$Tab;", "viewPager", "Landroid/support/v4/view/ViewPager;", "addTabReselectionListener", "tabReselectionListener", "addTabs", "calculateUpdatedHeightMeasureSpec", "heightMeasureSpec", "clearTabs", "notifyTabReselectionEvents", "notifyTabSelectionChanged", "newIndex", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "selectTabAt", "index", "setAdapter", "setupWithViewPager", "Adapter", "Tab", "ViewPagerPageChangeListener", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
public final class TabLayout extends LinearLayout {
    /* renamed from: a */
    private final SparseArray<C8820a> f30926a;
    /* renamed from: b */
    private int f30927b;
    /* renamed from: c */
    private ViewPager f30928c;
    /* renamed from: d */
    private Adapter f30929d;
    /* renamed from: e */
    private CopyOnWriteArrayList<Function1<Integer, C15813i>> f30930e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/design/tabbedpagelayout/TabLayout$Adapter;", "", "count", "", "createTab", "Lcom/tinder/design/tabbedpagelayout/TabLayout$Tab;", "index", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
    public interface Adapter {
        int count();

        @NotNull
        C8820a createTab(int i);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/design/tabbedpagelayout/TabLayout$Tab;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.tabbedpagelayout.TabLayout$a */
    public static final class C8820a {
        @NotNull
        /* renamed from: a */
        private final View f30923a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8820a) {
                    if (C2668g.a(this.f30923a, ((C8820a) obj).f30923a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            View view = this.f30923a;
            return view != null ? view.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tab(view=");
            stringBuilder.append(this.f30923a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8820a(@NotNull View view) {
            C2668g.b(view, "view");
            this.f30923a = view;
        }

        @NotNull
        /* renamed from: a */
        public final View m37529a() {
            return this.f30923a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.tabbedpagelayout.TabLayout$c */
    static final class C8821c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ TabLayout f30924a;
        /* renamed from: b */
        final /* synthetic */ int f30925b;

        C8821c(TabLayout tabLayout, int i) {
            this.f30924a = tabLayout;
            this.f30925b = i;
        }

        public final void onClick(View view) {
            this.f30924a.m37533b(this.f30925b);
            this.f30924a.m37536a(this.f30925b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/design/tabbedpagelayout/TabLayout$ViewPagerPageChangeListener;", "Landroid/support/v4/view/ViewPager$SimpleOnPageChangeListener;", "(Lcom/tinder/design/tabbedpagelayout/TabLayout;)V", "onPageSelected", "", "position", "", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.tabbedpagelayout.TabLayout$b */
    private final class C13133b extends C2887d {
        /* renamed from: a */
        final /* synthetic */ TabLayout f41786a;

        public C13133b(TabLayout tabLayout) {
            this.f41786a = tabLayout;
        }

        public void onPageSelected(int i) {
            this.f41786a.m37536a(i);
        }
    }

    public /* synthetic */ TabLayout(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f30926a = new SparseArray();
        this.f30927b = -1;
        this.f30930e = new CopyOnWriteArrayList();
        setOrientation(null);
        setGravity(16);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, m37535d(i2));
    }

    /* renamed from: a */
    public final void m37537a(@NotNull Function1<? super Integer, C15813i> function1) {
        C2668g.b(function1, "tabReselectionListener");
        this.f30930e.add(function1);
    }

    public final void setAdapter(@NotNull Adapter adapter) {
        C2668g.b(adapter, "adapter");
        if (!C2668g.a(this.f30929d, adapter)) {
            m37530a();
            m37531a(adapter);
        }
    }

    /* renamed from: a */
    public final void m37536a(int i) {
        if (i != this.f30927b) {
            m37534c(i);
        }
    }

    public final void setupWithViewPager(@NotNull ViewPager viewPager) {
        C2668g.b(viewPager, "viewPager");
        this.f30928c = viewPager;
        viewPager.addOnPageChangeListener(new C13133b(this));
    }

    /* renamed from: a */
    private final void m37530a() {
        removeAllViews();
        this.f30926a.clear();
        this.f30930e.clear();
        this.f30927b = -1;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30930e.clear();
    }

    /* renamed from: a */
    private final void m37531a(Adapter adapter) {
        int count = adapter.count();
        for (int i = 0; i < count; i++) {
            C8820a createTab = adapter.createTab(i);
            this.f30926a.put(i, createTab);
            addView(createTab.m37529a(), i);
            createTab.m37529a().setOnClickListener(new C8821c(this, i));
        }
    }

    /* renamed from: b */
    private final void m37533b(int i) {
        if (i == this.f30927b) {
            for (Function1 invoke : this.f30930e) {
                invoke.invoke(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: c */
    private final void m37534c(int i) {
        this.f30927b = i;
        ViewPager viewPager = this.f30928c;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
        }
    }

    /* renamed from: d */
    private final int m37535d(int i) {
        int a = (C8824b.m37546a(this, 48) + getPaddingTop()) + getPaddingBottom();
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return MeasureSpec.makeMeasureSpec(Math.min(a, MeasureSpec.getSize(i)), 1073741824);
        }
        if (mode != 0) {
            return i;
        }
        return MeasureSpec.makeMeasureSpec(a, 1073741824);
    }
}
