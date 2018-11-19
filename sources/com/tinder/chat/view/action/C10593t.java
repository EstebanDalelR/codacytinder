package com.tinder.chat.view.action;

import android.app.Activity;
import android.content.Context;
import com.tinder.chat.analytics.C10540v;
import com.tinder.chat.analytics.C10540v.C8437a;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.activities.MatchProfileActivity;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/view/action/MatchProfilePageDisplayAction;", "Lcom/tinder/chat/view/action/MatchProfileDisplayAction;", "activityContext", "Landroid/content/Context;", "chatOpenProfileEventDispatcher", "Lcom/tinder/chat/analytics/ChatOpenProfileEventDispatcher;", "(Landroid/content/Context;Lcom/tinder/chat/analytics/ChatOpenProfileEventDispatcher;)V", "show", "", "senderId", "", "matchId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.t */
public final class C10593t implements MatchProfileDisplayAction {
    /* renamed from: a */
    private final Context f34417a;
    /* renamed from: b */
    private final C10540v f34418b;

    public C10593t(@NotNull Context context, @NotNull C10540v c10540v) {
        C2668g.b(context, "activityContext");
        C2668g.b(c10540v, "chatOpenProfileEventDispatcher");
        this.f34417a = context;
        this.f34418b = c10540v;
    }

    public void show(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "senderId");
        C2668g.b(str2, "matchId");
        Context context = this.f34417a;
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        this.f34417a.startActivity(MatchProfileActivity.a((Activity) context, str, str2, ProfileScreenSource.CHAT));
        this.f34418b.m42632a(new C8437a(str2, "chat avatar"));
    }
}
