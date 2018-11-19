package com.tinder.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"CHROME_PACKAGE", "", "SERVICE_ACTION", "findActivity", "Landroid/content/Context;", "isChromeCustomTabsSupported", "", "base_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.utils.p */
public final class C15365p {
    /* renamed from: a */
    public static final boolean m57674a(@NotNull Context context) {
        C2668g.b(context, "$receiver");
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage("com.android.chrome");
        int i = 0;
        context = context.getPackageManager().queryIntentServices(intent, 0);
        if (context != null) {
            i = 1;
        }
        C2668g.a(context, "info");
        return (((Collection) context).isEmpty() ^ 1) & i;
    }

    @Nullable
    /* renamed from: b */
    public static final Context m57675b(@NotNull Context context) {
        C2668g.b(context, "$receiver");
        if (context instanceof Activity) {
            return context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        context = ((ContextWrapper) context).getBaseContext();
        C2668g.a(context, "this.baseContext");
        return C15365p.m57675b(context);
    }
}
