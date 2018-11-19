package com.tinder.match.navigation;

import com.tinder.common.navigation.Screen.Matches.Subscreen;
import io.reactivex.C3959e;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/tinder/match/navigation/MatchMessagesSubscreenTracker;", "Lcom/tinder/match/navigation/MatchSubscreensTracker;", "()V", "observe", "Lio/reactivex/Observable;", "Lcom/tinder/common/navigation/Screen$Matches$Subscreen;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.navigation.a */
public final class C12055a implements MatchSubscreensTracker {
    @NotNull
    public C3959e<Subscreen> observe() {
        C3959e<Subscreen> just = C3959e.just(Subscreen.MESSAGES);
        C2668g.a(just, "Observable.just(Screen.Matches.Subscreen.MESSAGES)");
        return just;
    }
}
