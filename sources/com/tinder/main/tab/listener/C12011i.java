package com.tinder.main.tab.listener;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.design.tabbedpagelayout.model.ScrollState;
import com.tinder.home.p259b.C9695a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/main/tab/listener/TabSelectedProviderTabPageSelectedListener;", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "homePageTabSelectedProvider", "Lcom/tinder/home/provider/HomePageTabSelectedProvider;", "(Lcom/tinder/home/provider/HomePageTabSelectedProvider;)V", "onPageReselected", "", "reselectedPage", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "onPageScrollChanged", "state", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "onPageSelected", "selectedPage", "previousPage", "onPageUnselected", "unselectedPage", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.tab.listener.i */
public final class C12011i implements OnPageSelectedListener {
    /* renamed from: a */
    private final C9695a f38973a;

    public void onPageReselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "reselectedPage");
    }

    public void onPageScrollChanged(@NotNull ScrollState scrollState) {
        C2668g.b(scrollState, "state");
    }

    public void onPageUnselected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "unselectedPage");
    }

    public C12011i(@NotNull C9695a c9695a) {
        C2668g.b(c9695a, "homePageTabSelectedProvider");
        this.f38973a = c9695a;
    }

    public void onPageSelected(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page, @Nullable TabbedPageLayout$Page tabbedPageLayout$Page2) {
        C2668g.b(tabbedPageLayout$Page, "selectedPage");
        this.f38973a.m40152a(tabbedPageLayout$Page);
    }
}
