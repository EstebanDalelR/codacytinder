package com.tinder.feed.view.action;

import com.tinder.api.ManagerWebServices;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00060\u000bj\u0002`\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/feed/view/action/FeedInfoViewActionHandler;", "Lcom/tinder/feed/view/action/FeedInfoAvatarClickingActionHandler;", "fullscreenMatchProfileDisplayAction", "Lcom/tinder/feed/view/action/MatchProfileDisplayAction;", "(Lcom/tinder/feed/view/action/MatchProfileDisplayAction;)V", "onAvatarClicked", "", "userId", "", "matchId", "feedInfoOpenProfileListener", "Lkotlin/Function0;", "Lcom/tinder/feed/view/action/FeedInfoOpenProfileListener;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.action.c */
public final class C11723c implements FeedInfoAvatarClickingActionHandler {
    /* renamed from: a */
    private final MatchProfileDisplayAction f38241a;

    @Inject
    public C11723c(@NotNull MatchProfileDisplayAction matchProfileDisplayAction) {
        C2668g.b(matchProfileDisplayAction, "fullscreenMatchProfileDisplayAction");
        this.f38241a = matchProfileDisplayAction;
    }

    public void onAvatarClicked(@NotNull String str, @NotNull String str2, @NotNull Function0<C15813i> function0) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(str2, "matchId");
        C2668g.b(function0, "feedInfoOpenProfileListener");
        this.f38241a.show(str, str2);
        function0.invoke();
    }
}
