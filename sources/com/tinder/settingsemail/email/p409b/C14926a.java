package com.tinder.settingsemail.email.p409b;

import android.app.Activity;
import android.content.res.Resources;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/settingsemail/email/module/EmailSettingsModule;", "", "()V", "provideResources", "Landroid/content/res/Resources;", "activity", "Landroid/app/Activity;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.settingsemail.email.b.a */
public final class C14926a {
    @NotNull
    @Provides
    /* renamed from: a */
    public final Resources m56389a(@NotNull Activity activity) {
        C2668g.b(activity, "activity");
        activity = activity.getResources();
        C2668g.a(activity, "activity.resources");
        return activity;
    }
}
