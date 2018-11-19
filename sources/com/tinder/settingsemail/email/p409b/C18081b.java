package com.tinder.settingsemail.email.p409b;

import android.app.Activity;
import android.content.res.Resources;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settingsemail.email.b.b */
public final class C18081b implements Factory<Resources> {
    /* renamed from: a */
    private final C14926a f56166a;
    /* renamed from: b */
    private final Provider<Activity> f56167b;

    public /* synthetic */ Object get() {
        return m65661a();
    }

    /* renamed from: a */
    public Resources m65661a() {
        return C18081b.m65660a(this.f56166a, this.f56167b);
    }

    /* renamed from: a */
    public static Resources m65660a(C14926a c14926a, Provider<Activity> provider) {
        return C18081b.m65659a(c14926a, (Activity) provider.get());
    }

    /* renamed from: a */
    public static Resources m65659a(C14926a c14926a, Activity activity) {
        return (Resources) C15521i.m58001a(c14926a.m56389a(activity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
