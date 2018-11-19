package com.tinder.home;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.view.View;
import com.tinder.activities.MainActivity;
import com.tinder.app.dagger.qualifier.DefaultMainPage;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.main.adapter.C13385a;
import com.tinder.main.adapter.MainTabbedPageLayoutAdapter;
import com.tinder.main.model.MainPage;
import com.tinder.main.p287c.C11993b;
import com.tinder.main.tab.listener.C12003d;
import com.tinder.scope.ActivityScope;
import dagger.Lazy;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001Bj\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0011\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u00070\r\u0012\u0013\b\u0001\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00070\u0010\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00070\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u00070\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/home/TinderMainTabbedPageLayoutAdapter;", "Lcom/tinder/main/adapter/MainTabbedPageLayoutAdapter;", "context", "Lcom/tinder/activities/MainActivity;", "pages", "", "Lcom/tinder/main/model/MainPage;", "Lkotlin/jvm/JvmSuppressWildcards;", "tabIconViewFactory", "Lcom/tinder/home/MainTabIconViewFactory;", "pagerAdapter", "Lcom/tinder/main/adapter/MainPageViewPagerAdapter;", "tabPageSelectedListeners", "", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "lazyDiscoveryTabView", "Ldagger/Lazy;", "Lcom/tinder/discovery/view/DiscoveryTabView;", "defaultMainPage", "(Lcom/tinder/activities/MainActivity;Ljava/util/List;Lcom/tinder/home/MainTabIconViewFactory;Lcom/tinder/main/adapter/MainPageViewPagerAdapter;Ljava/util/Map;Ldagger/Lazy;Lcom/tinder/main/model/MainPage;)V", "createPagerAdapter", "Landroid/support/v4/view/PagerAdapter;", "createView", "Landroid/view/View;", "position", "", "getDefaultPage", "getPages", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "indexOfMainPage", "mainPage", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.home.n */
public final class C13329n implements MainTabbedPageLayoutAdapter {
    /* renamed from: a */
    private final MainActivity f42289a;
    /* renamed from: b */
    private final List<MainPage> f42290b;
    /* renamed from: c */
    private final C9697c f42291c;
    /* renamed from: d */
    private final C13385a f42292d;
    /* renamed from: e */
    private final Map<MainPage, OnPageSelectedListener> f42293e;
    /* renamed from: f */
    private final Lazy<DiscoveryTabView> f42294f;
    /* renamed from: g */
    private final MainPage f42295g;

    @Inject
    public C13329n(@NotNull MainActivity mainActivity, @NotNull List<MainPage> list, @NotNull C9697c c9697c, @NotNull C13385a c13385a, @NotNull Map<MainPage, OnPageSelectedListener> map, @NotNull @ActivityScope Lazy<DiscoveryTabView> lazy, @NotNull @DefaultMainPage MainPage mainPage) {
        C2668g.b(mainActivity, "context");
        C2668g.b(list, "pages");
        C2668g.b(c9697c, "tabIconViewFactory");
        C2668g.b(c13385a, "pagerAdapter");
        C2668g.b(map, "tabPageSelectedListeners");
        C2668g.b(lazy, "lazyDiscoveryTabView");
        C2668g.b(mainPage, "defaultMainPage");
        this.f42289a = mainActivity;
        this.f42290b = list;
        this.f42291c = c9697c;
        this.f42292d = c13385a;
        this.f42293e = map;
        this.f42294f = lazy;
        this.f42295g = mainPage;
    }

    public /* synthetic */ TabbedPageLayout$Page getDefaultPage() {
        return m51577a();
    }

    @NotNull
    public View createView(int i) {
        MainPage mainPage = (MainPage) this.f42290b.get(i);
        if (C9705o.f32288a[mainPage.ordinal()] != 1) {
            C11993b a = this.f42291c.m40157a(this.f42291c.m40158a(mainPage), (Context) this.f42289a);
            i = this.f42293e.get(mainPage);
            if (i == 0) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.main.tab.listener.HomeTabIconViewPageSelectedListener");
            }
            ((C12003d) i).m48046a(a);
            return a;
        }
        i = this.f42294f.get();
        C2668g.a(i, "lazyDiscoveryTabView.get()");
        return (View) i;
    }

    @NotNull
    public List<TabbedPageLayout$Page> getPages() {
        return this.f42290b;
    }

    @NotNull
    public C0600i createPagerAdapter() {
        return this.f42292d;
    }

    @NotNull
    /* renamed from: a */
    public MainPage m51577a() {
        return this.f42295g;
    }

    public int indexOfMainPage(@NotNull MainPage mainPage) {
        C2668g.b(mainPage, "mainPage");
        return getPages().indexOf(mainPage);
    }
}
