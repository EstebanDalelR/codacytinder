package com.tinder.notifications;

import android.content.res.Resources;
import com.tinder.domain.pushnotifications.model.PushNotificationType;
import com.tinder.notifications.C9953h.C9951e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/notifications/PushCopyFactory;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "messageLikesPushDescription", "", "kotlin.jvm.PlatformType", "messageLikesPushTitle", "messagePushTitle", "messagesPushDescription", "newMatchesPushDescription", "newMatchesPushTitle", "placesPushDescription", "placesPushTitle", "superLikesPushDescription", "superLikesPushTitle", "topPicksPushDescription", "topPicksPushTitle", "create", "Lcom/tinder/notifications/PushCopy;", "pushNotificationType", "Lcom/tinder/domain/pushnotifications/model/PushNotificationType;", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.notifications.f */
public final class C9945f {
    /* renamed from: a */
    private final String f32781a;
    /* renamed from: b */
    private final String f32782b;
    /* renamed from: c */
    private final String f32783c;
    /* renamed from: d */
    private final String f32784d;
    /* renamed from: e */
    private final String f32785e;
    /* renamed from: f */
    private final String f32786f;
    /* renamed from: g */
    private final String f32787g;
    /* renamed from: h */
    private final String f32788h;
    /* renamed from: i */
    private final String f32789i;
    /* renamed from: j */
    private final String f32790j;
    /* renamed from: k */
    private final String f32791k;
    /* renamed from: l */
    private final String f32792l;

    @Inject
    public C9945f(@NotNull Resources resources) {
        C2668g.b(resources, "resources");
        this.f32781a = resources.getString(C9951e.new_matches_push_title);
        this.f32782b = resources.getString(C9951e.new_matches_push_description);
        this.f32783c = resources.getString(C9951e.messages_push_title);
        this.f32784d = resources.getString(C9951e.messages_push_description);
        this.f32785e = resources.getString(C9951e.message_likes_push_title);
        this.f32786f = resources.getString(C9951e.message_likes_push_description);
        this.f32787g = resources.getString(C9951e.super_likes_push_title);
        this.f32788h = resources.getString(C9951e.super_likes_push_description);
        this.f32789i = resources.getString(C9951e.top_picks_push_title);
        this.f32790j = resources.getString(C9951e.top_picks_push_description);
        this.f32791k = resources.getString(C9951e.places_push_title);
        this.f32792l = resources.getString(C9951e.places_push_description);
    }

    @NotNull
    /* renamed from: a */
    public final C9944e m40918a(@NotNull PushNotificationType pushNotificationType) {
        C2668g.b(pushNotificationType, "pushNotificationType");
        String str;
        String str2;
        switch (C9946g.f32793a[pushNotificationType.ordinal()]) {
            case 1:
                str = this.f32781a;
                C2668g.a(str, "newMatchesPushTitle");
                str2 = this.f32782b;
                C2668g.a(str2, "newMatchesPushDescription");
                return new C9944e(str, str2);
            case 2:
                str = this.f32783c;
                C2668g.a(str, "messagePushTitle");
                str2 = this.f32784d;
                C2668g.a(str2, "messagesPushDescription");
                return new C9944e(str, str2);
            case 3:
                str = this.f32785e;
                C2668g.a(str, "messageLikesPushTitle");
                str2 = this.f32786f;
                C2668g.a(str2, "messageLikesPushDescription");
                return new C9944e(str, str2);
            case 4:
                str = this.f32787g;
                C2668g.a(str, "superLikesPushTitle");
                str2 = this.f32788h;
                C2668g.a(str2, "superLikesPushDescription");
                return new C9944e(str, str2);
            case 5:
                throw ((Throwable) new UnsupportedOperationException("NotificationSettingItemView does not support likes you"));
            case 6:
                str = this.f32789i;
                C2668g.a(str, "topPicksPushTitle");
                str2 = this.f32790j;
                C2668g.a(str2, "topPicksPushDescription");
                return new C9944e(str, str2);
            case 7:
                str = this.f32791k;
                C2668g.a(str, "placesPushTitle");
                str2 = this.f32792l;
                C2668g.a(str2, "placesPushDescription");
                return new C9944e(str, str2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
