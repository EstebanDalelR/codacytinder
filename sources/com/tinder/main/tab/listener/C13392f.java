package com.tinder.main.tab.listener;

import com.tinder.main.model.MainPage;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/tinder/main/tab/listener/MatchesTabPageSelectedListener;", "Lcom/tinder/main/tab/listener/HomeTabIconViewPageSelectedListener;", "page", "Lcom/tinder/main/model/MainPage;", "(Lcom/tinder/main/model/MainPage;)V", "shouldPreserveTabIconBadge", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.tab.listener.f */
public final class C13392f extends C12003d {
    /* renamed from: a */
    protected boolean mo11180a() {
        return true;
    }

    public C13392f(@NotNull MainPage mainPage) {
        C2668g.b(mainPage, "page");
        super(mainPage);
    }
}
