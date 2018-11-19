package com.tinder.data.profile.adapter;

import com.tinder.api.model.profile.Onboarding.Tutorial;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.onboarding.Onboarding.Tutorial.Asset;
import com.tinder.domain.onboarding.Onboarding.Tutorial.Asset.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/profile/adapter/OnboardingTutorialsAssetsAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Asset;", "Lcom/tinder/api/model/profile/Onboarding$Tutorial$Asset;", "()V", "fromApi", "apiModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.adapter.w */
public final class C10923w extends C2646o<Asset, Tutorial.Asset> {
    @Nullable
    /* renamed from: a */
    public Asset m43517a(@NotNull Tutorial.Asset asset) {
        C2668g.b(asset, "apiModel");
        return new Asset(Type.Companion.fromApiName(asset.getType()), asset.getUrl());
    }
}
