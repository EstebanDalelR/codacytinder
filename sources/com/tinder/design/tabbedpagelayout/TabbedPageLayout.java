package com.tinder.design.tabbedpagelayout;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C2887d;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tinder.design.tabbedpagelayout.C8823a.C8822a;
import com.tinder.design.tabbedpagelayout.TabLayout.Adapter;
import com.tinder.design.tabbedpagelayout.TabLayout.C8820a;
import com.tinder.design.tabbedpagelayout.model.ScrollState;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001:\u0004'()*B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\rJ\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0014J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\bJ\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\rH\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0011H\u0002J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\rJ\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\rH\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$TabbedPageLayoutAdapter;", "onPageSelectedListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "selectedPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "tabLayout", "Lcom/tinder/design/tabbedpagelayout/TabLayout;", "tabLayoutId", "", "viewPager", "Landroid/support/v4/view/ViewPager;", "viewPagerId", "addPageSelectedListener", "", "pageSelectedListener", "getDisplayedPage", "handlePageScrollStateChange", "state", "handlePageSelection", "position", "onFinishInflate", "removePageSelectedListener", "setAdapter", "tabbedPageLayoutAdapter", "setDefaultPage", "page", "setDisplayedIndex", "index", "setDisplayedPage", "verifyAdapterIsSetAndPageIsPresent", "OnPageSelectedListener", "Page", "TabLayoutAdapter", "TabbedPageLayoutAdapter", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
public class TabbedPageLayout extends LinearLayout {
    /* renamed from: a */
    private ViewPager f30931a;
    /* renamed from: b */
    private TabLayout f30932b;
    /* renamed from: c */
    private TabbedPageLayoutAdapter f30933c;
    /* renamed from: d */
    private TabbedPageLayout$Page f30934d;
    /* renamed from: e */
    private final int f30935e;
    /* renamed from: f */
    private final int f30936f;
    /* renamed from: g */
    private final CopyOnWriteArraySet<OnPageSelectedListener> f30937g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "", "onPageReselected", "", "reselectedPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "onPageScrollChanged", "state", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "onPageSelected", "selectedPage", "previousPage", "onPageUnselected", "unselectedPage", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
    public interface OnPageSelectedListener {
        void onPageReselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page);

        void onPageScrollChanged(@NotNull ScrollState scrollState);

        void onPageSelected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page, @Nullable TabbedPageLayout$Page tabbedPageLayout$Page2);

        void onPageUnselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH&¨\u0006\f"}, d2 = {"Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$TabbedPageLayoutAdapter;", "", "createPagerAdapter", "Landroid/support/v4/view/PagerAdapter;", "createView", "Landroid/view/View;", "position", "", "getDefaultPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "getPages", "", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
    public interface TabbedPageLayoutAdapter {
        @NotNull
        C0600i createPagerAdapter();

        @NotNull
        View createView(int i);

        @NotNull
        TabbedPageLayout$Page getDefaultPage();

        @NotNull
        List<TabbedPageLayout$Page> getPages();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$TabLayoutAdapter;", "Lcom/tinder/design/tabbedpagelayout/TabLayout$Adapter;", "tabbedPageLayoutAdapter", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$TabbedPageLayoutAdapter;", "(Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$TabbedPageLayoutAdapter;)V", "count", "", "createTab", "Lcom/tinder/design/tabbedpagelayout/TabLayout$Tab;", "index", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.tabbedpagelayout.TabbedPageLayout$a */
    public static final class C11100a implements Adapter {
        /* renamed from: a */
        private final TabbedPageLayoutAdapter f35885a;

        public C11100a(@NotNull TabbedPageLayoutAdapter tabbedPageLayoutAdapter) {
            C2668g.b(tabbedPageLayoutAdapter, "tabbedPageLayoutAdapter");
            this.f35885a = tabbedPageLayoutAdapter;
        }

        public int count() {
            return this.f35885a.getPages().size();
        }

        @NotNull
        public C8820a createTab(int i) {
            return new C8820a(this.f35885a.createView(i));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/tinder/design/tabbedpagelayout/TabbedPageLayout$onFinishInflate$3", "Landroid/support/v4/view/ViewPager$SimpleOnPageChangeListener;", "(Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout;)V", "onPageScrollStateChanged", "", "state", "", "onPageSelected", "position", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.tabbedpagelayout.TabbedPageLayout$b */
    public static final class C13134b extends C2887d {
        /* renamed from: a */
        final /* synthetic */ TabbedPageLayout f41787a;

        C13134b(TabbedPageLayout tabbedPageLayout) {
            this.f41787a = tabbedPageLayout;
        }

        public void onPageSelected(int i) {
            this.f41787a.m37539a(i);
        }

        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            this.f41787a.m37543b(i);
        }
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ TabbedPageLayoutAdapter m37542b(TabbedPageLayout tabbedPageLayout) {
        tabbedPageLayout = tabbedPageLayout.f30933c;
        if (tabbedPageLayout == null) {
            C2668g.b("adapter");
        }
        return tabbedPageLayout;
    }

    public /* synthetic */ TabbedPageLayout(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TabbedPageLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f30937g = new CopyOnWriteArraySet();
        setOrientation(1);
        context = context.getTheme().obtainStyledAttributes(attributeSet, C8822a.TabbedPageLayout, 0, 0);
        try {
            this.f30935e = context.getResourceId(C8822a.TabbedPageLayout_tpl_viewPagerId, -1);
            this.f30936f = context.getResourceId(C8822a.TabbedPageLayout_tpl_tabLayoutID, -1);
        } finally {
            context.recycle();
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(this.f30935e);
        if (findViewById == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to find ViewPager with ID: ");
            stringBuilder.append(this.f30935e);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        this.f30931a = (ViewPager) findViewById;
        findViewById = findViewById(this.f30936f);
        if (findViewById == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to find TabLayout with ID: ");
            stringBuilder.append(this.f30936f);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        this.f30932b = (TabLayout) findViewById;
        ViewPager viewPager = this.f30931a;
        if (viewPager == null) {
            C2668g.b("viewPager");
        }
        viewPager.addOnPageChangeListener(new C13134b(this));
    }

    public final void setAdapter(@NotNull TabbedPageLayoutAdapter tabbedPageLayoutAdapter) {
        C2668g.b(tabbedPageLayoutAdapter, "tabbedPageLayoutAdapter");
        this.f30933c = tabbedPageLayoutAdapter;
        ViewPager viewPager = this.f30931a;
        if (viewPager == null) {
            C2668g.b("viewPager");
        }
        TabbedPageLayoutAdapter tabbedPageLayoutAdapter2 = this.f30933c;
        if (tabbedPageLayoutAdapter2 == null) {
            C2668g.b("adapter");
        }
        viewPager.setAdapter(tabbedPageLayoutAdapter2.createPagerAdapter());
        TabLayout tabLayout = this.f30932b;
        if (tabLayout == null) {
            C2668g.b("tabLayout");
        }
        ViewPager viewPager2 = this.f30931a;
        if (viewPager2 == null) {
            C2668g.b("viewPager");
        }
        tabLayout.setupWithViewPager(viewPager2);
        tabLayout = this.f30932b;
        if (tabLayout == null) {
            C2668g.b("tabLayout");
        }
        tabLayout.setAdapter(new C11100a(tabbedPageLayoutAdapter));
        tabbedPageLayoutAdapter = this.f30933c;
        if (tabbedPageLayoutAdapter == null) {
            C2668g.b("adapter");
        }
        setDefaultPage(tabbedPageLayoutAdapter.getDefaultPage());
        tabbedPageLayoutAdapter = this.f30932b;
        if (tabbedPageLayoutAdapter == null) {
            C2668g.b("tabLayout");
        }
        tabbedPageLayoutAdapter.m37537a((Function1) new TabbedPageLayout$setAdapter$1(this));
    }

    public final void setDisplayedPage(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "page");
        m37540a(tabbedPageLayout$Page);
        TabbedPageLayoutAdapter tabbedPageLayoutAdapter = this.f30933c;
        if (tabbedPageLayoutAdapter == null) {
            C2668g.b("adapter");
        }
        setDisplayedIndex(tabbedPageLayoutAdapter.getPages().indexOf(tabbedPageLayout$Page));
    }

    @NotNull
    public final TabbedPageLayout$Page getDisplayedPage() {
        TabbedPageLayout$Page tabbedPageLayout$Page = this.f30934d;
        if (tabbedPageLayout$Page != null) {
            return tabbedPageLayout$Page;
        }
        throw new IllegalStateException("No Page displayed");
    }

    /* renamed from: a */
    public final void m37545a(@NotNull OnPageSelectedListener onPageSelectedListener) {
        C2668g.b(onPageSelectedListener, "pageSelectedListener");
        this.f30937g.add(onPageSelectedListener);
    }

    private final void setDisplayedIndex(int i) {
        TabbedPageLayoutAdapter tabbedPageLayoutAdapter = this.f30933c;
        if (tabbedPageLayoutAdapter == null) {
            C2668g.b("adapter");
        }
        if (tabbedPageLayoutAdapter == null) {
            throw new IllegalStateException("Adapter must be set before setting a displayed index".toString());
        }
        TabLayout tabLayout = this.f30932b;
        if (tabLayout == null) {
            C2668g.b("tabLayout");
        }
        tabLayout.m37536a(i);
    }

    /* renamed from: a */
    private final void m37540a(TabbedPageLayout$Page tabbedPageLayout$Page) {
        TabbedPageLayoutAdapter tabbedPageLayoutAdapter = this.f30933c;
        if (tabbedPageLayoutAdapter == null) {
            C2668g.b("adapter");
        }
        if (tabbedPageLayoutAdapter == null) {
            throw new IllegalStateException("Adapter must be set before setting a page".toString());
        }
        tabbedPageLayoutAdapter = this.f30933c;
        if (tabbedPageLayoutAdapter == null) {
            C2668g.b("adapter");
        }
        if (!tabbedPageLayoutAdapter.getPages().contains(tabbedPageLayout$Page)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Page ");
            stringBuilder.append(tabbedPageLayout$Page);
            stringBuilder.append(" is not provided by adapter");
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
    }

    /* renamed from: a */
    private final void m37539a(int i) {
        TabbedPageLayoutAdapter tabbedPageLayoutAdapter = this.f30933c;
        if (tabbedPageLayoutAdapter == null) {
            C2668g.b("adapter");
        }
        TabbedPageLayout$Page tabbedPageLayout$Page = (TabbedPageLayout$Page) tabbedPageLayoutAdapter.getPages().get(i);
        TabbedPageLayout$Page tabbedPageLayout$Page2 = this.f30934d;
        if (tabbedPageLayout$Page2 != null) {
            for (OnPageSelectedListener onPageUnselected : this.f30937g) {
                onPageUnselected.onPageUnselected(tabbedPageLayout$Page2);
            }
        }
        for (OnPageSelectedListener onPageSelected : this.f30937g) {
            onPageSelected.onPageSelected(tabbedPageLayout$Page, this.f30934d);
        }
        this.f30934d = tabbedPageLayout$Page;
    }

    /* renamed from: b */
    private final void m37543b(int i) {
        i = ScrollState.Companion.m37547a(i);
        for (OnPageSelectedListener onPageScrollChanged : this.f30937g) {
            onPageScrollChanged.onPageScrollChanged(i);
        }
    }

    private final void setDefaultPage(TabbedPageLayout$Page tabbedPageLayout$Page) {
        m37540a(tabbedPageLayout$Page);
        TabbedPageLayoutAdapter tabbedPageLayoutAdapter = this.f30933c;
        if (tabbedPageLayoutAdapter == null) {
            C2668g.b("adapter");
        }
        tabbedPageLayout$Page = tabbedPageLayoutAdapter.getPages().indexOf(tabbedPageLayout$Page);
        setDisplayedIndex(tabbedPageLayout$Page);
        if (tabbedPageLayout$Page == null) {
            m37539a((int) null);
        }
    }
}
