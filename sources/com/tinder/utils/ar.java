package com.tinder.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/tinder/utils/SystemSettingsIntentFactory;", "", "()V", "getAppSettingsIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getPushSettingsIntent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ar {
    @NotNull
    /* renamed from: a */
    public final Intent m57623a(@NotNull Context context) {
        C2668g.b(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", context.getPackageName());
        intent.putExtra("app_uid", context.getApplicationInfo().uid);
        context = intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        C2668g.a(context, "putExtra(\"android.provid…GE\", context.packageName)");
        C2668g.a(context, "with(Intent()) {\n       …xt.packageName)\n        }");
        return context;
    }

    @NotNull
    /* renamed from: b */
    public final Intent m57624b(@NotNull Context context) {
        C2668g.b(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("package:");
        stringBuilder.append(context.getPackageName());
        context = intent.setData(Uri.parse(stringBuilder.toString()));
        C2668g.a(context, "setData(Uri.parse(\"packa…${context.packageName}\"))");
        C2668g.a(context, "with(Intent()) {\n       …packageName}\"))\n        }");
        return context;
    }
}
