package com.tinder.recs.presenter;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.main.model.MainPage;
import kotlin.Metadata;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "page", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class GamepadPresenter$observeHomePageRecs$1<T, R> implements Func1<TabbedPageLayout$Page, Boolean> {
    public static final GamepadPresenter$observeHomePageRecs$1 INSTANCE = new GamepadPresenter$observeHomePageRecs$1();

    GamepadPresenter$observeHomePageRecs$1() {
    }

    public /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((TabbedPageLayout$Page) obj));
    }

    public final boolean call(TabbedPageLayout$Page tabbedPageLayout$Page) {
        return tabbedPageLayout$Page == MainPage.RECS ? true : null;
    }
}
