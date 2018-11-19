package com.tinder.main.tab.listener;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.design.tabbedpagelayout.model.ScrollState;
import com.tinder.main.model.MainPage;
import com.tinder.main.p287c.C11993b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/main/tab/listener/HomeTabIconViewPageSelectedListener;", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "page", "Lcom/tinder/main/model/MainPage;", "(Lcom/tinder/main/model/MainPage;)V", "tabIconView", "Lcom/tinder/main/view/MainTabIconView;", "onPageReselected", "", "reselectedPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "onPageScrollChanged", "state", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "onPageSelected", "selectedPage", "previousPage", "onPageUnselected", "unselectedPage", "setTabIconView", "mainTabIconView", "shouldPreserveTabIconBadge", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.tab.listener.d */
public class C12003d implements OnPageSelectedListener {
    /* renamed from: a */
    private C11993b f38964a;
    /* renamed from: b */
    private final MainPage f38965b;

    /* renamed from: a */
    protected boolean mo11180a() {
        return false;
    }

    public void onPageReselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "reselectedPage");
    }

    public void onPageScrollChanged(@NotNull ScrollState scrollState) {
        C2668g.b(scrollState, "state");
    }

    public C12003d(@NotNull MainPage mainPage) {
        C2668g.b(mainPage, "page");
        this.f38965b = mainPage;
    }

    public void onPageSelected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page, @Nullable TabbedPageLayout$Page tabbedPageLayout$Page2) {
        C2668g.b(tabbedPageLayout$Page, "selectedPage");
        if (tabbedPageLayout$Page == this.f38965b) {
            if (mo11180a() == null) {
                tabbedPageLayout$Page = this.f38964a;
                if (tabbedPageLayout$Page == null) {
                    C2668g.b("tabIconView");
                }
                tabbedPageLayout$Page.m48036b(null);
            }
            tabbedPageLayout$Page = this.f38964a;
            if (tabbedPageLayout$Page == null) {
                C2668g.b("tabIconView");
            }
            tabbedPageLayout$Page.mo11152a();
        }
    }

    public void onPageUnselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "unselectedPage");
        if (tabbedPageLayout$Page == this.f38965b) {
            tabbedPageLayout$Page = this.f38964a;
            if (tabbedPageLayout$Page == null) {
                C2668g.b("tabIconView");
            }
            tabbedPageLayout$Page.mo11153b();
        }
    }

    /* renamed from: a */
    public final void m48046a(@NotNull C11993b c11993b) {
        C2668g.b(c11993b, "mainTabIconView");
        this.f38964a = c11993b;
    }
}
