package com.tinder.purchase;

import com.tinder.domain.profile.model.ProfileV2Experiment;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.purchase.SubscriptionProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.f */
public final class C17833f implements Factory<SubscriptionProvider> {
    /* renamed from: a */
    private final PurchaseModule f55649a;
    /* renamed from: b */
    private final Provider<ProfileV2Experiment> f55650b;
    /* renamed from: c */
    private final Provider<LoadProfileOptionData> f55651c;

    public /* synthetic */ Object get() {
        return m65119a();
    }

    public C17833f(PurchaseModule purchaseModule, Provider<ProfileV2Experiment> provider, Provider<LoadProfileOptionData> provider2) {
        this.f55649a = purchaseModule;
        this.f55650b = provider;
        this.f55651c = provider2;
    }

    /* renamed from: a */
    public SubscriptionProvider m65119a() {
        return C17833f.m65117a(this.f55649a, this.f55650b, this.f55651c);
    }

    /* renamed from: a */
    public static SubscriptionProvider m65117a(PurchaseModule purchaseModule, Provider<ProfileV2Experiment> provider, Provider<LoadProfileOptionData> provider2) {
        return C17833f.m65116a(purchaseModule, (ProfileV2Experiment) provider.get(), (LoadProfileOptionData) provider2.get());
    }

    /* renamed from: b */
    public static C17833f m65118b(PurchaseModule purchaseModule, Provider<ProfileV2Experiment> provider, Provider<LoadProfileOptionData> provider2) {
        return new C17833f(purchaseModule, provider, provider2);
    }

    /* renamed from: a */
    public static SubscriptionProvider m65116a(PurchaseModule purchaseModule, ProfileV2Experiment profileV2Experiment, LoadProfileOptionData loadProfileOptionData) {
        return (SubscriptionProvider) C15521i.m58001a(purchaseModule.m55297a(profileV2Experiment, loadProfileOptionData), "Cannot return null from a non-@Nullable @Provides method");
    }
}
