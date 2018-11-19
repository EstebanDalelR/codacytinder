package com.tinder.data.profile.p228a;

import com.tinder.data.profile.p331b.C10926a;
import com.tinder.data.profile.persistence.C10961b;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.ProfileImageUploader;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.a.d */
public final class C13060d implements Factory<C10912c> {
    /* renamed from: a */
    private final Provider<C10926a> f41620a;
    /* renamed from: b */
    private final Provider<C8750a> f41621b;
    /* renamed from: c */
    private final Provider<C10961b> f41622c;
    /* renamed from: d */
    private final Provider<ProfileImageUploader> f41623d;
    /* renamed from: e */
    private final Provider<LoadProfileOptionData> f41624e;

    public /* synthetic */ Object get() {
        return m50820a();
    }

    public C13060d(Provider<C10926a> provider, Provider<C8750a> provider2, Provider<C10961b> provider3, Provider<ProfileImageUploader> provider4, Provider<LoadProfileOptionData> provider5) {
        this.f41620a = provider;
        this.f41621b = provider2;
        this.f41622c = provider3;
        this.f41623d = provider4;
        this.f41624e = provider5;
    }

    /* renamed from: a */
    public C10912c m50820a() {
        return C13060d.m50818a(this.f41620a, this.f41621b, this.f41622c, this.f41623d, this.f41624e);
    }

    /* renamed from: a */
    public static C10912c m50818a(Provider<C10926a> provider, Provider<C8750a> provider2, Provider<C10961b> provider3, Provider<ProfileImageUploader> provider4, Provider<LoadProfileOptionData> provider5) {
        return new C10912c((C10926a) provider.get(), (C8750a) provider2.get(), (C10961b) provider3.get(), (ProfileImageUploader) provider4.get(), (LoadProfileOptionData) provider5.get());
    }

    /* renamed from: b */
    public static C13060d m50819b(Provider<C10926a> provider, Provider<C8750a> provider2, Provider<C10961b> provider3, Provider<ProfileImageUploader> provider4, Provider<LoadProfileOptionData> provider5) {
        return new C13060d(provider, provider2, provider3, provider4, provider5);
    }
}
