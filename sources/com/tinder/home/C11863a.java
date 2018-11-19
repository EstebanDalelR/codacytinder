package com.tinder.home;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.design.tabbedpagelayout.model.ScrollState;
import com.tinder.main.model.MainPage;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.model.SparksEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/home/AnalyticsMainPageSelectedListener;", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "managerAnalytics", "Lcom/tinder/managers/ManagerAnalytics;", "breadcrumbTracker", "Lcom/tinder/managers/LegacyBreadCrumbTracker;", "(Lcom/tinder/managers/ManagerAnalytics;Lcom/tinder/managers/LegacyBreadCrumbTracker;)V", "onPageReselected", "", "reselectedPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "onPageScrollChanged", "state", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "onPageSelected", "selectedPage", "previousPage", "onPageUnselected", "unselectedPage", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.home.a */
public final class C11863a implements OnPageSelectedListener {
    /* renamed from: a */
    private final ManagerAnalytics f38695a;
    /* renamed from: b */
    private final LegacyBreadCrumbTracker f38696b;

    public void onPageReselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "reselectedPage");
    }

    public void onPageScrollChanged(@NotNull ScrollState scrollState) {
        C2668g.b(scrollState, "state");
    }

    public void onPageUnselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "unselectedPage");
    }

    public C11863a(@NotNull ManagerAnalytics managerAnalytics, @NotNull LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        C2668g.b(managerAnalytics, "managerAnalytics");
        C2668g.b(legacyBreadCrumbTracker, "breadcrumbTracker");
        this.f38695a = managerAnalytics;
        this.f38696b = legacyBreadCrumbTracker;
    }

    public void onPageSelected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page, @Nullable TabbedPageLayout$Page tabbedPageLayout$Page2) {
        C2668g.b(tabbedPageLayout$Page, "selectedPage");
        if (tabbedPageLayout$Page2 != null && tabbedPageLayout$Page2 == MainPage.RECS) {
            this.f38695a.m40477a(new SparksEvent("Recs.End"));
        }
        switch (C9696b.f32270a[((MainPage) tabbedPageLayout$Page).ordinal()]) {
            case 1:
                this.f38696b.m40476a("recsTab");
                this.f38695a.m40477a(new SparksEvent("Recs.Start"));
                return;
            case 2:
                this.f38696b.m40476a("matchesTab");
                return;
            case 3:
                this.f38696b.m40476a("myProfileTab");
                return;
            default:
                return;
        }
    }
}
