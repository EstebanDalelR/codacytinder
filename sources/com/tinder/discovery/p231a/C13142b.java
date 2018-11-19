package com.tinder.discovery.p231a;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.view.View;
import com.tinder.R;
import com.tinder.discovery.badge.renderer.BadgeIconRenderer.BadgePosition;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.view.DiscoveryNavigationView;
import com.tinder.discovery.view.DiscoveryTabView.Adapter;
import com.tinder.discovery.view.DiscoveryTabView.Adapter.OnSegmentsUpdatedListener;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.gold.discovery.C11858a;
import com.tinder.gold.discovery.C9693b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0002J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\u0014\u0010#\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0$R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/discovery/adapter/DiscoveryToggleNavigationAdapter;", "Lcom/tinder/discovery/view/DiscoveryTabView$Adapter;", "discoverySegmentsUpdatedListeners", "", "Lcom/tinder/discovery/view/DiscoveryTabView$Adapter$OnSegmentsUpdatedListener;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Ljava/util/Set;Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "discoverySegments", "Ljava/util/ArrayList;", "Lcom/tinder/discovery/model/DiscoverySegment;", "Lkotlin/collections/ArrayList;", "afterNotifyDataSetChanged", "", "createDiscoveryView", "Lcom/tinder/discovery/view/DiscoveryNavigationView;", "context", "Landroid/content/Context;", "icon", "", "createShimmerDiscoveryView", "Lcom/tinder/gold/discovery/ShimmerDiscoveryNavigationView;", "alwaysShimmer", "", "createView", "Landroid/view/View;", "index", "getCount", "getDefaultDisplayedIndex", "getDiscoverySegmentAt", "indexOfDiscoverySegment", "segment", "notifyDiscoverySegmentsUpdated", "segmentIndexToBadgePosition", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;", "setDiscoverySegments", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.a.b */
public final class C13142b extends Adapter {
    /* renamed from: a */
    private final ArrayList<DiscoverySegment> f41804a = new ArrayList();
    /* renamed from: b */
    private final Set<OnSegmentsUpdatedListener> f41805b;
    /* renamed from: c */
    private final SubscriptionProvider f41806c;

    public C13142b(@NotNull Set<? extends OnSegmentsUpdatedListener> set, @NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(set, "discoverySegmentsUpdatedListeners");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f41805b = set;
        this.f41806c = subscriptionProvider;
    }

    @NotNull
    /* renamed from: a */
    public View mo11095a(@NotNull Context context, int i) {
        C2668g.b(context, "context");
        switch (C8877c.f31077a[((DiscoverySegment) this.f41804a.get(i)).ordinal()]) {
            case 1:
                context = m51063b(context, R.drawable.ic_discovery_segment_places);
                context.setBadgePosition(m51062b(i));
                return (View) context;
            case 2:
                return C13142b.m51061a(this, context, R.drawable.ic_discovery_segment_recs, false, 4, null);
            case 3:
                context = m51060a(context, R.drawable.ic_discovery_segment_toppicks, true);
                context.setBadgePosition(m51062b(i));
                return (View) context;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public int mo11093a() {
        return this.f41804a.size();
    }

    /* renamed from: b */
    public int mo11097b() {
        return this.f41804a.indexOf(DiscoverySegment.RECS);
    }

    @Nullable
    /* renamed from: a */
    public DiscoverySegment mo11096a(int i) {
        return (DiscoverySegment) C19301m.c(this.f41804a, i);
    }

    /* renamed from: a */
    public int mo11094a(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "segment");
        return this.f41804a.indexOf(discoverySegment);
    }

    /* renamed from: e */
    public void mo11098e() {
        super.mo11098e();
        m51071f();
    }

    /* renamed from: f */
    public void m51071f() {
        for (OnSegmentsUpdatedListener onSegmentsUpdated : this.f41805b) {
            onSegmentsUpdated.onSegmentsUpdated(this.f41804a);
        }
    }

    /* renamed from: a */
    public final void m51068a(@NotNull List<? extends DiscoverySegment> list) {
        C2668g.b(list, "discoverySegments");
        this.f41804a.clear();
        this.f41804a.addAll(list);
        m37577c();
    }

    /* renamed from: b */
    private final DiscoveryNavigationView m51063b(Context context, @DrawableRes int i) {
        DiscoveryNavigationView discoveryNavigationView = new DiscoveryNavigationView(context, null, 2, null);
        discoveryNavigationView.setImageResource(i);
        return discoveryNavigationView;
    }

    /* renamed from: a */
    static /* synthetic */ C11858a m51061a(C13142b c13142b, Context context, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c13142b.m51060a(context, i, z);
    }

    /* renamed from: a */
    private final C11858a m51060a(Context context, @DrawableRes int i, boolean z) {
        C11858a c11858a = new C11858a(context, null, z ? false : new C9693b(this.f41806c), 2, null);
        c11858a.setIcon(i);
        return c11858a;
    }

    /* renamed from: b */
    private final BadgePosition m51062b(int i) {
        if (i == 0) {
            return BadgePosition.LEFT;
        }
        if (i == this.f41804a.size() - 1) {
            return BadgePosition.RIGHT;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected: index=");
        stringBuilder.append(i);
        stringBuilder.append(", segments=");
        stringBuilder.append(this.f41804a.size());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
