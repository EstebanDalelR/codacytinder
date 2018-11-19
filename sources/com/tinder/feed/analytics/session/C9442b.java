package com.tinder.feed.analytics.session;

import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10682a;
import com.tinder.common.navigation.Screen.C10683b;
import com.tinder.common.navigation.Screen.C10684c;
import com.tinder.common.navigation.Screen.C10691j;
import com.tinder.common.navigation.Screen.C10692k;
import com.tinder.common.navigation.Screen.Matches;
import com.tinder.common.navigation.Screen.Matches.Subscreen;
import com.tinder.feed.analytics.SessionDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toDestination", "Lcom/tinder/feed/analytics/SessionDestination;", "Lcom/tinder/common/navigation/Screen;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.session.b */
public final class C9442b {
    /* renamed from: b */
    private static final SessionDestination m39479b(@NotNull Screen screen) {
        if (C2668g.a(screen, C10683b.f35024a)) {
            return SessionDestination.BACKGROUND;
        }
        if (C2668g.a(screen, C10682a.f35023a)) {
            return SessionDestination.ACCOUNT;
        }
        if (C2668g.a(screen, C10692k.f35033a)) {
            return SessionDestination.RECS;
        }
        if (C2668g.a(screen, C10684c.f35025a)) {
            return SessionDestination.CHAT;
        }
        if (C2668g.a(screen, C10691j.f35032a)) {
            return SessionDestination.PROFILE;
        }
        if (C2668g.a(screen, new Matches(Subscreen.MESSAGES)) != null) {
            return SessionDestination.MATCH_LIST;
        }
        return SessionDestination.OTHER;
    }
}
