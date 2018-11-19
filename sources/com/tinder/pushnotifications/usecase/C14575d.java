package com.tinder.pushnotifications.usecase;

import com.tinder.api.model.settings.PushSettings;
import com.tinder.managers.bk;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/pushnotifications/usecase/PauseNotifications;", "", "updatePushSetting", "Lcom/tinder/pushnotifications/usecase/UpdatePushSetting;", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "(Lcom/tinder/pushnotifications/usecase/UpdatePushSetting;Lcom/tinder/managers/ManagerSharedPreferences;)V", "pause", "Lrx/Completable;", "unPause", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.usecase.d */
public final class C14575d {
    /* renamed from: a */
    private final C14576e f46008a;
    /* renamed from: b */
    private final bk f46009b;

    @Inject
    public C14575d(@NotNull C14576e c14576e, @NotNull bk bkVar) {
        C2668g.b(c14576e, "updatePushSetting");
        C2668g.b(bkVar, "managerSharedPreferences");
        this.f46008a = c14576e;
        this.f46009b = bkVar;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m55610a() {
        return this.f46008a.m55613a(new PushSettings(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), null, null, Boolean.valueOf(false), 48, null));
    }

    @NotNull
    /* renamed from: b */
    public final Completable m55611b() {
        return this.f46008a.m55613a(new PushSettings(Boolean.valueOf(this.f46009b.h()), Boolean.valueOf(this.f46009b.i()), Boolean.valueOf(this.f46009b.e()), Boolean.valueOf(this.f46009b.j()), null, null, Boolean.valueOf(true), 48, null));
    }
}
