package com.tinder.match.p291b;

import com.tinder.common.function.Mapper;
import com.tinder.common.navigation.Screen.Matches.Subscreen;
import com.tinder.match.viewmodel.MatchTabsPage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/match/mapper/MatchTabsPageSubscreenMapper;", "Lcom/tinder/common/function/Mapper;", "Lcom/tinder/match/viewmodel/MatchTabsPage;", "Lcom/tinder/common/navigation/Screen$Matches$Subscreen;", "()V", "map", "matchTabsPage", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.b.a */
public final class C12042a implements Mapper<MatchTabsPage, Subscreen> {
    public /* synthetic */ Object map(Object obj) {
        return m48143a((MatchTabsPage) obj);
    }

    @NotNull
    /* renamed from: a */
    public Subscreen m48143a(@NotNull MatchTabsPage matchTabsPage) {
        C2668g.b(matchTabsPage, "matchTabsPage");
        switch (C9849b.f32630a[matchTabsPage.ordinal()]) {
            case 1:
                return Subscreen.FEED;
            case 2:
                return Subscreen.MESSAGES;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
