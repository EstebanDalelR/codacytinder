package com.tinder.feed.view.action;

import android.content.Context;
import com.tinder.api.ManagerWebServices;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.activities.MatchProfileActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/feed/view/action/MatchProfilePageDisplayAction;", "Lcom/tinder/feed/view/action/MatchProfileDisplayAction;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "show", "", "userId", "", "matchId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.action.d */
public final class C11724d implements MatchProfileDisplayAction {
    /* renamed from: a */
    private final Context f38242a;

    public C11724d(@NotNull Context context) {
        C2668g.b(context, "context");
        this.f38242a = context;
    }

    public void show(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(str2, "matchId");
        this.f38242a.startActivity(MatchProfileActivity.a(this.f38242a, str, str2, ProfileScreenSource.FEED));
    }
}
