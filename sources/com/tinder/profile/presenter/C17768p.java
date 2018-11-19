package com.tinder.profile.presenter;

import com.tinder.common.repository.MyUserRepository;
import com.tinder.domain.profile.experiment.NewPhotoGridExperiment;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.managers.bk;
import com.tinder.profile.adapters.C14367k;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.profile.p363b.C14385i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.presenter.p */
public final class C17768p implements Factory<C14429h> {
    /* renamed from: a */
    private final Provider<C14385i> f55443a;
    /* renamed from: b */
    private final Provider<MyUserRepository> f55444b;
    /* renamed from: c */
    private final Provider<C14367k> f55445c;
    /* renamed from: d */
    private final Provider<bk> f55446d;
    /* renamed from: e */
    private final Provider<C14418b> f55447e;
    /* renamed from: f */
    private final Provider<NewPhotoGridExperiment> f55448f;
    /* renamed from: g */
    private final Provider<LoadProfileOptionData> f55449g;

    public /* synthetic */ Object get() {
        return m64959a();
    }

    /* renamed from: a */
    public C14429h m64959a() {
        return C17768p.m64958a(this.f55443a, this.f55444b, this.f55445c, this.f55446d, this.f55447e, this.f55448f, this.f55449g);
    }

    /* renamed from: a */
    public static C14429h m64958a(Provider<C14385i> provider, Provider<MyUserRepository> provider2, Provider<C14367k> provider3, Provider<bk> provider4, Provider<C14418b> provider5, Provider<NewPhotoGridExperiment> provider6, Provider<LoadProfileOptionData> provider7) {
        return new C14429h((C14385i) provider.get(), (MyUserRepository) provider2.get(), (C14367k) provider3.get(), (bk) provider4.get(), (C14418b) provider5.get(), (NewPhotoGridExperiment) provider6.get(), (LoadProfileOptionData) provider7.get());
    }

    /* renamed from: a */
    public static C14429h m64957a(C14385i c14385i, MyUserRepository myUserRepository, C14367k c14367k, bk bkVar, C14418b c14418b, NewPhotoGridExperiment newPhotoGridExperiment, LoadProfileOptionData loadProfileOptionData) {
        return new C14429h(c14385i, myUserRepository, c14367k, bkVar, c14418b, newPhotoGridExperiment, loadProfileOptionData);
    }
}
