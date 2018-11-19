package com.tinder.reactions.navigation.view;

import android.content.Context;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.jakewharton.rxbinding2.p140b.C5716a;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.navigation.p396a.C16368c;
import com.tinder.reactions.navigation.p396a.C17992a;
import com.tinder.reactions.navigation.p398c.C14687e;
import com.tinder.reactions.navigation.p465e.C16373a;
import com.tinder.reactions.navigation.view.ScrollListenerViewPagerInterface.OnScrollChangeListener;
import com.tinder.reactions.navigation.view.widget.GalleryLayoutManager;
import com.tinder.reactions.navigation.view.widget.GalleryLayoutManager.ItemTransformer;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem;
import com.tinder.utils.av;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u001dH\u0002J\u001e\u0010#\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/tinder/reactions/navigation/view/GrandGestureNavigationView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "gestureTabClicked", "", "gestureTabItemWidth", "", "gestureViewPagerWidth", "", "gesturesTabTotalScrollX", "gesturesViewPagerTotalScrollX", "ignoreScrollEvent", "layoutManager", "Lcom/tinder/reactions/navigation/view/widget/GalleryLayoutManager;", "presenter", "Lcom/tinder/reactions/navigation/presenter/GestureNavigationPresenter;", "getPresenter", "()Lcom/tinder/reactions/navigation/presenter/GestureNavigationPresenter;", "setPresenter", "(Lcom/tinder/reactions/navigation/presenter/GestureNavigationPresenter;)V", "ratio", "reverseRatio", "setGrandGestures", "", "grandGestureItems", "", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem;", "gestureAnimationMediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "setupTabs", "tabDrawableResIds", "setupViewPager", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GrandGestureNavigationView extends FrameLayout {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14687e f46278a;
    /* renamed from: b */
    private final GalleryLayoutManager f46279b = new GalleryLayoutManager(0);
    /* renamed from: c */
    private int f46280c = av.b();
    /* renamed from: d */
    private float f46281d = getResources().getDimension(R.dimen.grand_gestures_tab_icon_size);
    /* renamed from: e */
    private float f46282e = (this.f46281d / ((float) this.f46280c));
    /* renamed from: f */
    private float f46283f = (((float) this.f46280c) / this.f46281d);
    /* renamed from: g */
    private boolean f46284g;
    /* renamed from: h */
    private int f46285h;
    /* renamed from: i */
    private int f46286i;
    /* renamed from: j */
    private boolean f46287j;
    /* renamed from: k */
    private HashMap f46288k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "position", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.view.GrandGestureNavigationView$a */
    static final class C16377a<T> implements Consumer<Integer> {
        /* renamed from: a */
        final /* synthetic */ GrandGestureNavigationView f50925a;

        C16377a(GrandGestureNavigationView grandGestureNavigationView) {
            this.f50925a = grandGestureNavigationView;
        }

        public /* synthetic */ void accept(Object obj) {
            m61756a((Integer) obj);
        }

        /* renamed from: a */
        public final void m61756a(Integer num) {
            RecyclerView recyclerView = (RecyclerView) this.f50925a.m55962a(C6248a.gesturesTabRecyclerView);
            C2668g.a(num, "position");
            recyclerView.smoothScrollToPosition(num.intValue());
            this.f50925a.f46287j = true;
            this.f50925a.getPresenter().m55943a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.view.GrandGestureNavigationView$b */
    static final class C16378b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16378b f50926a = new C16378b();

        C16378b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61757a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61757a(Throwable th) {
            C0001a.c(th, "Error handling gesture tab clicked", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"com/tinder/reactions/navigation/view/GrandGestureNavigationView$setupTabs$listener$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "(Lcom/tinder/reactions/navigation/view/GrandGestureNavigationView;)V", "lastPosition", "", "overallXScroll", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "onScrolled", "dx", "dy", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.view.GrandGestureNavigationView$c */
    public static final class C16379c extends OnScrollListener {
        /* renamed from: a */
        final /* synthetic */ GrandGestureNavigationView f50927a;
        /* renamed from: b */
        private int f50928b;
        /* renamed from: c */
        private int f50929c = -1;

        C16379c(GrandGestureNavigationView grandGestureNavigationView) {
            this.f50927a = grandGestureNavigationView;
        }

        public void onScrollStateChanged(@Nullable RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                recyclerView = this.f50927a.f46279b.m61791a();
                if (recyclerView != this.f50929c) {
                    if (this.f50927a.f46287j != 0) {
                        this.f50927a.f46287j = false;
                    } else {
                        this.f50927a.getPresenter().m55944b(recyclerView);
                    }
                    this.f50929c = recyclerView;
                }
            }
        }

        public void onScrolled(@Nullable RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f50928b += i;
            if (this.f50927a.f46284g == null) {
                this.f50927a.f46284g = 1;
                ((ScrollListenerViewPager) this.f50927a.m55962a(C6248a.gesturesViewPager)).scrollTo((int) (((float) this.f50928b) * this.f50927a.f46283f), 0);
                this.f50927a.f46284g = false;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"com/tinder/reactions/navigation/view/GrandGestureNavigationView$setupViewPager$1", "Lcom/tinder/reactions/navigation/view/ScrollListenerViewPagerInterface$OnScrollChangeListener;", "(Lcom/tinder/reactions/navigation/view/GrandGestureNavigationView;)V", "onScrollChange", "", "v", "Landroid/view/View;", "scrollX", "", "scrollY", "oldScrollX", "oldScrollY", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.view.GrandGestureNavigationView$d */
    public static final class C16380d implements OnScrollChangeListener {
        /* renamed from: a */
        final /* synthetic */ GrandGestureNavigationView f50930a;

        C16380d(GrandGestureNavigationView grandGestureNavigationView) {
            this.f50930a = grandGestureNavigationView;
        }

        public void onScrollChange(@NotNull View view, int i, int i2, int i3, int i4) {
            C2668g.b(view, "v");
            GrandGestureNavigationView grandGestureNavigationView = this.f50930a;
            grandGestureNavigationView.f46285h = grandGestureNavigationView.f46285h + (i - i3);
            view = (int) ((((float) this.f50930a.f46285h) * this.f50930a.f46282e) - ((float) this.f50930a.f46286i));
            GrandGestureNavigationView grandGestureNavigationView2 = this.f50930a;
            grandGestureNavigationView2.f46286i = grandGestureNavigationView2.f46286i + view;
            if (this.f50930a.f46284g == 0) {
                this.f50930a.f46284g = 1;
                ((RecyclerView) this.f50930a.m55962a(C6248a.gesturesTabRecyclerView)).scrollBy(view, 0);
                this.f50930a.f46284g = false;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"com/tinder/reactions/navigation/view/GrandGestureNavigationView$setupViewPager$2", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "(Lcom/tinder/reactions/navigation/view/GrandGestureNavigationView;)V", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.view.GrandGestureNavigationView$e */
    public static final class C16381e implements OnPageChangeListener {
        /* renamed from: a */
        final /* synthetic */ GrandGestureNavigationView f50931a;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        C16381e(GrandGestureNavigationView grandGestureNavigationView) {
            this.f50931a = grandGestureNavigationView;
        }

        public void onPageSelected(int i) {
            this.f50931a.getPresenter().m55945c(i);
        }
    }

    /* renamed from: a */
    public View m55962a(int i) {
        if (this.f46288k == null) {
            this.f46288k = new HashMap();
        }
        View view = (View) this.f46288k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f46288k.put(Integer.valueOf(i), view);
        return view;
    }

    public GrandGestureNavigationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        context = C14398a.m54830a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        setAlpha(null);
    }

    @NotNull
    public final C14687e getPresenter() {
        C14687e c14687e = this.f46278a;
        if (c14687e == null) {
            C2668g.b("presenter");
        }
        return c14687e;
    }

    public final void setPresenter(@NotNull C14687e c14687e) {
        C2668g.b(c14687e, "<set-?>");
        this.f46278a = c14687e;
    }

    /* renamed from: a */
    public final void m55963a(@NotNull Set<GrandGestureNavigationItem> set, @NotNull C14641a c14641a) {
        C2668g.b(set, "grandGestureItems");
        C2668g.b(c14641a, "gestureAnimationMediator");
        m55955b((Set) set, c14641a);
        Iterable<GrandGestureNavigationItem> iterable = set;
        Collection collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (GrandGestureNavigationItem a : iterable) {
            collection.add(Integer.valueOf(a.m55965a()));
        }
        setupTabs(C19299w.m68842n((List) collection));
    }

    private final void setupTabs(Set<Integer> set) {
        C16368c c16368c = new C16368c();
        c16368c.m61737a((Set) set);
        set = new C16379c(this);
        c16368c.m61735a().takeUntil(C5716a.a(this)).observeOn(C15674a.m58830a()).subscribe(new C16377a(this), C16378b.f50926a);
        this.f46279b.m61792a((RecyclerView) m55962a(C6248a.gesturesTabRecyclerView), 0);
        this.f46279b.m61793a((ItemTransformer) new C16373a(0.3f, 0.5f));
        RecyclerView recyclerView = (RecyclerView) m55962a(C6248a.gesturesTabRecyclerView);
        C2668g.a(recyclerView, "gesturesTabRecyclerView");
        recyclerView.setAdapter(c16368c);
        ((RecyclerView) m55962a(C6248a.gesturesTabRecyclerView)).addOnScrollListener((OnScrollListener) set);
    }

    /* renamed from: b */
    private final void m55955b(Set<GrandGestureNavigationItem> set, C14641a c14641a) {
        Context context = getContext();
        C2668g.a(context, "context");
        C17992a c17992a = new C17992a(c14641a, context);
        c17992a.m65354a((Set) set);
        ScrollListenerViewPager scrollListenerViewPager = (ScrollListenerViewPager) m55962a(C6248a.gesturesViewPager);
        if (scrollListenerViewPager == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.navigation.view.ScrollListenerViewPager");
        }
        scrollListenerViewPager.setOffscreenPageLimit(25);
        scrollListenerViewPager.setPageMargin(null);
        scrollListenerViewPager.setAdapter(c17992a);
        scrollListenerViewPager.addScrollListener((OnScrollChangeListener) new C16380d(this));
        scrollListenerViewPager.addOnPageChangeListener((OnPageChangeListener) new C16381e(this));
    }
}
