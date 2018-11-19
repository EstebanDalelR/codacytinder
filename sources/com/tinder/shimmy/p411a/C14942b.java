package com.tinder.shimmy.p411a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"findActivity", "Landroid/content/Context;", "shimmy_release"}, k = 2, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.a.b */
public final class C14942b {
    @Nullable
    /* renamed from: a */
    public static final Context m56447a(@NotNull Context context) {
        C2668g.b(context, "$receiver");
        if (context instanceof Activity) {
            return context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        context = ((ContextWrapper) context).getBaseContext();
        C2668g.a(context, "baseContext");
        return C14942b.m56447a(context);
    }
}
