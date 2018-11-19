package com.tinder.smsauth.ui.view.p413a;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.ColorRes;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"getSupportColor", "", "Landroid/content/Context;", "resId", "ui_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.ui.view.a.a */
public final class C15028a {
    /* renamed from: a */
    public static final int m56627a(@NotNull Context context, @ColorRes int i) {
        C2668g.b(context, "$receiver");
        if (VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }
}
