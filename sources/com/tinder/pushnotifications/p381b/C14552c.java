package com.tinder.pushnotifications.p381b;

import android.content.Context;
import android.support.v4.app.C0422u;
import com.tinder.module.ForApplication;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/pushnotifications/provider/PushSettingsProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isPushEnabled", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.b.c */
public final class C14552c {
    /* renamed from: a */
    private final Context f45980a;

    @Inject
    public C14552c(@NotNull @ForApplication Context context) {
        C2668g.b(context, "context");
        this.f45980a = context;
    }

    /* renamed from: a */
    public final boolean m55576a() {
        return C0422u.a(this.f45980a).a();
    }
}
