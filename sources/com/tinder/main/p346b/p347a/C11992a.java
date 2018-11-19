package com.tinder.main.p346b.p347a;

import com.tinder.activities.MainActivity;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.main.model.MainPage;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/main/segment/listener/DiscoveryPageForwardingSegmentChangedListener;", "Lcom/tinder/discovery/view/DiscoveryTabView$OnSegmentChangedListener;", "mainActivity", "Lcom/tinder/activities/MainActivity;", "(Lcom/tinder/activities/MainActivity;)V", "onSegmentChanged", "", "nextSegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "prevSegment", "onSegmentClicked", "segment", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.b.a.a */
public final class C11992a implements OnSegmentChangedListener {
    /* renamed from: a */
    private final MainActivity f38946a;

    public void onSegmentChanged(@NotNull DiscoverySegment discoverySegment, @Nullable DiscoverySegment discoverySegment2) {
        C2668g.b(discoverySegment, "nextSegment");
    }

    public C11992a(@NotNull MainActivity mainActivity) {
        C2668g.b(mainActivity, "mainActivity");
        this.f38946a = mainActivity;
    }

    public void onSegmentClicked(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "segment");
        this.f38946a.e().setDisplayedPage(MainPage.DISCOVERY);
    }
}
