package com.tinder.module;

import com.tinder.feed.p341b.C11695a;
import com.tinder.match.navigation.C12055a;
import com.tinder.match.navigation.C12057b;
import com.tinder.match.navigation.MatchSubscreensTracker;
import com.tinder.match.p291b.C12042a;
import com.tinder.match.provider.C9879g;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/module/MatchSubscreensTrackingModule;", "", "()V", "provideMatchSubscreensTracker", "Lcom/tinder/match/navigation/MatchSubscreensTracker;", "feedExperimentUtility", "Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "matchTabSelectedProvider", "Lcom/tinder/match/provider/MatchesTabSelectedProvider;", "matchTabsPageSubscreenMapper", "Lcom/tinder/match/mapper/MatchTabsPageSubscreenMapper;", "provideMatchSubscreensTracker$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class er {
    @NotNull
    @Provides
    /* renamed from: a */
    public final MatchSubscreensTracker m40892a(@NotNull C11695a c11695a, @NotNull C9879g c9879g, @NotNull C12042a c12042a) {
        C2668g.b(c11695a, "feedExperimentUtility");
        C2668g.b(c9879g, "matchTabSelectedProvider");
        C2668g.b(c12042a, "matchTabsPageSubscreenMapper");
        if (c11695a.m47526e() != null) {
            return (MatchSubscreensTracker) new C12057b(c9879g, c12042a);
        }
        return (MatchSubscreensTracker) new C12055a();
    }
}
