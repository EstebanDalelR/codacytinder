package com.tinder.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.activities.MainActivity;
import com.tinder.base.view.LockableViewPager$LockableViewPagerParent;
import com.tinder.common.p191d.C8529a;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.p231a.C11119a;
import com.tinder.discovery.view.DiscoveryContainerView;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.Adapter;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.ChildViewPreDetachListener;
import com.tinder.feed.view.FeedMainView;
import com.tinder.main.model.MainPage;
import com.tinder.main.tab.listener.C13393g;
import com.tinder.match.views.MatchMainView;
import com.tinder.profiletab.view.ProfileTabView;
import com.tinder.recs.view.RecsView;
import com.tinder.scope.ActivityScope;
import dagger.Lazy;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001Bf\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0011\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00070\t\u0012\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u00070\f\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0019\u0010\u000b\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u00070\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00070\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/main/adapter/TinderMainPageViewPagerAdapter;", "Lcom/tinder/main/adapter/MainPageViewPagerAdapter;", "mainActivity", "Lcom/tinder/activities/MainActivity;", "pages", "", "Lcom/tinder/main/model/MainPage;", "Lkotlin/jvm/JvmSuppressWildcards;", "listeners", "", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "childViewPreDetachListeners", "", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewPreDetachListener;", "lazyDiscoveryTabView", "Ldagger/Lazy;", "Lcom/tinder/discovery/view/DiscoveryTabView;", "discoverySingleViewSwitcherAdapter", "Lcom/tinder/discovery/adapter/DiscoverySingleViewSwitcherAdapter;", "(Lcom/tinder/activities/MainActivity;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ldagger/Lazy;Lcom/tinder/discovery/adapter/DiscoverySingleViewSwitcherAdapter;)V", "createViewForPage", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "position", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.adapter.d */
public final class C14049d extends C13385a {
    /* renamed from: a */
    private final MainActivity f44549a;
    /* renamed from: b */
    private final List<MainPage> f44550b;
    /* renamed from: c */
    private final Map<MainPage, OnPageSelectedListener> f44551c;
    /* renamed from: d */
    private final Set<ChildViewPreDetachListener> f44552d;
    /* renamed from: e */
    private final Lazy<DiscoveryTabView> f44553e;
    /* renamed from: f */
    private final C11119a f44554f;

    @Inject
    public C14049d(@NotNull MainActivity mainActivity, @NotNull List<MainPage> list, @NotNull Map<MainPage, OnPageSelectedListener> map, @NotNull Set<ChildViewPreDetachListener> set, @NotNull @ActivityScope Lazy<DiscoveryTabView> lazy, @NotNull C11119a c11119a) {
        C2668g.b(mainActivity, "mainActivity");
        C2668g.b(list, "pages");
        C2668g.b(map, "listeners");
        C2668g.b(set, "childViewPreDetachListeners");
        C2668g.b(lazy, "lazyDiscoveryTabView");
        C2668g.b(c11119a, "discoverySingleViewSwitcherAdapter");
        super(list);
        this.f44549a = mainActivity;
        this.f44550b = list;
        this.f44551c = map;
        this.f44552d = set;
        this.f44553e = lazy;
        this.f44554f = c11119a;
    }

    @NotNull
    /* renamed from: a */
    public View mo11322a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "container");
        MainPage mainPage = (MainPage) this.f44550b.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (C9815e.f32511a[mainPage.ordinal()]) {
            case 1:
                viewGroup = from.inflate(R.layout.profile_tab, viewGroup, false);
                if (viewGroup == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.profiletab.view.ProfileTabView");
                }
                ProfileTabView profileTabView = (ProfileTabView) viewGroup;
                i = this.f44551c.get(mainPage);
                if (i == 0) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.main.tab.listener.ProfileTabPageSelectedListener");
                }
                ((C13393g) i).m51802a(profileTabView);
                return profileTabView;
            case 2:
                viewGroup = from.inflate(R.layout.recs_view, viewGroup, false);
                if (viewGroup == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.view.RecsView");
                }
                RecsView recsView = (RecsView) viewGroup;
                this.f44549a.setContainer(recsView);
                recsView.setLockableViewPagerParent((LockableViewPager$LockableViewPagerParent) this.f44549a);
                return recsView;
            case 3:
                C2668g.a(from, "inflater");
                i = from.getContext();
                C2668g.a(i, "inflater.context");
                viewGroup = new MatchMainView(i, null, 2, null);
                viewGroup.setLayoutParams(C8529a.f30276a.m36493a());
                viewGroup = viewGroup;
                break;
            case 4:
                C2668g.a(from, "inflater");
                i = from.getContext();
                C2668g.a(i, "inflater.context");
                viewGroup = new FeedMainView(i, null, 2, null);
                viewGroup.setLayoutParams(C8529a.f30276a.m36493a());
                viewGroup = viewGroup;
                break;
            case 5:
                viewGroup = viewGroup.getContext();
                C2668g.a(viewGroup, "container.context");
                i = new DiscoveryContainerView(viewGroup, null, 2, null);
                i.setAdapter((Adapter) this.f44554f);
                for (ChildViewPreDetachListener a : (Iterable) this.f44552d) {
                    i.m37725a(a);
                }
                ((DiscoveryTabView) this.f44553e.get()).setupWithDiscoveryContainerView(i);
                return (View) i;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return viewGroup;
    }
}
