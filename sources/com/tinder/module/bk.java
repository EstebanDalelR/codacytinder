package com.tinder.module;

import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.settings.email.usecase.LoadEmailDisplaySettings;
import com.tinder.managers.UserMetaManager;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bk implements Factory<LoadEmailDisplaySettings> {
    /* renamed from: a */
    private final bj f42816a;
    /* renamed from: b */
    private final Provider<LoadProfileOptionData> f42817b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f42818c;

    public /* synthetic */ Object get() {
        return m52173a();
    }

    /* renamed from: a */
    public LoadEmailDisplaySettings m52173a() {
        return m52172a(this.f42816a, this.f42817b, this.f42818c);
    }

    /* renamed from: a */
    public static LoadEmailDisplaySettings m52172a(bj bjVar, Provider<LoadProfileOptionData> provider, Provider<UserMetaManager> provider2) {
        return m52171a(bjVar, (LoadProfileOptionData) provider.get(), (UserMetaManager) provider2.get());
    }

    /* renamed from: a */
    public static LoadEmailDisplaySettings m52171a(bj bjVar, LoadProfileOptionData loadProfileOptionData, UserMetaManager userMetaManager) {
        return (LoadEmailDisplaySettings) C15521i.a(bjVar.m40792a(loadProfileOptionData, userMetaManager), "Cannot return null from a non-@Nullable @Provides method");
    }
}
