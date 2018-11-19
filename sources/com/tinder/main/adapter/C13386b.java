package com.tinder.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.activities.MainActivity;
import com.tinder.base.view.LockableViewPager$LockableViewPagerParent;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p231a.C11119a;
import com.tinder.discovery.view.singleviewswitcher.C11150a;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.C8908a;
import com.tinder.places.main.view.PlacesView;
import com.tinder.recs.view.RecsView;
import com.tinder.toppicks.view.TopPicksView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0006`\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/main/adapter/TinderDiscoveryViewContainerAdapter;", "Lcom/tinder/discovery/adapter/DiscoverySingleViewSwitcherAdapter;", "mainActivity", "Lcom/tinder/activities/MainActivity;", "discoveryChildViewAnimators", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "Lcom/tinder/discovery/view/singleviewswitcher/SingleViewSwitcher$ChildViewAnimator;", "inflater", "Landroid/view/LayoutInflater;", "(Lcom/tinder/activities/MainActivity;Ljava/util/Map;Landroid/view/LayoutInflater;)V", "discoverySegments", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "createChildViewAnimator", "position", "", "createView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "getCount", "setDiscoverySegments", "", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.adapter.b */
public final class C13386b extends C11119a {
    /* renamed from: a */
    private final ArrayList<DiscoverySegment> f42437a = new ArrayList();
    /* renamed from: b */
    private final MainActivity f42438b;
    /* renamed from: c */
    private final Map<DiscoverySegment, C8908a> f42439c;
    /* renamed from: d */
    private final LayoutInflater f42440d;

    public C13386b(@NotNull MainActivity mainActivity, @NotNull Map<DiscoverySegment, ? extends C8908a> map, @NotNull LayoutInflater layoutInflater) {
        C2668g.b(mainActivity, "mainActivity");
        C2668g.b(map, "discoveryChildViewAnimators");
        C2668g.b(layoutInflater, "inflater");
        this.f42438b = mainActivity;
        this.f42439c = map;
        this.f42440d = layoutInflater;
    }

    @NotNull
    /* renamed from: a */
    public View mo11176a(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        switch (C9814c.f32510a[((DiscoverySegment) this.f42437a.get(i)).ordinal()]) {
            case 1:
                viewGroup = viewGroup.getContext();
                C2668g.a(viewGroup, "parent.context");
                return (View) new PlacesView(viewGroup, null, 2, null);
            case 2:
                viewGroup = this.f42440d.inflate(R.layout.recs_view, viewGroup, false);
                if (viewGroup == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.view.RecsView");
                }
                RecsView recsView = (RecsView) viewGroup;
                recsView.setLockableViewPagerParent((LockableViewPager$LockableViewPagerParent) this.f42438b);
                return recsView;
            case 3:
                viewGroup = viewGroup.getContext();
                C2668g.a(viewGroup, "parent.context");
                return (View) new TopPicksView(viewGroup, null, 2, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    /* renamed from: a */
    public C8908a mo11177a(int i) {
        C8908a c8908a = (C8908a) this.f42439c.get((DiscoverySegment) this.f42437a.get(i));
        return c8908a != null ? c8908a : new C11150a(0, 0, 3, null);
    }

    /* renamed from: a */
    public int mo11175a() {
        return this.f42437a.size();
    }

    /* renamed from: a */
    public void mo11178a(@NotNull List<? extends DiscoverySegment> list) {
        C2668g.b(list, "discoverySegments");
        this.f42437a.clear();
        this.f42437a.addAll(list);
        m37705b();
    }
}
