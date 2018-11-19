package com.tinder.data.profile.adapter;

import com.tinder.api.model.profile.Onboarding;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.onboarding.Onboarding.Tutorial;
import com.tinder.domain.onboarding.Onboarding.Tutorial.Name;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/profile/adapter/OnboardingTutorialsAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial;", "Lcom/tinder/api/model/profile/Onboarding$Tutorial;", "onboardingTutorialsAssetsAdapter", "Lcom/tinder/data/profile/adapter/OnboardingTutorialsAssetsAdapter;", "(Lcom/tinder/data/profile/adapter/OnboardingTutorialsAssetsAdapter;)V", "fromApi", "apiModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.adapter.u */
public final class C10922u extends C2646o<Tutorial, Onboarding.Tutorial> {
    /* renamed from: a */
    private final C10923w f35623a;

    @Inject
    public C10922u(@NotNull C10923w c10923w) {
        C2668g.b(c10923w, "onboardingTutorialsAssetsAdapter");
        this.f35623a = c10923w;
    }

    @Nullable
    /* renamed from: a */
    public Tutorial m43515a(@NotNull Onboarding.Tutorial tutorial) {
        C2668g.b(tutorial, "apiModel");
        Name fromApiName = Name.Companion.fromApiName(tutorial.getName());
        tutorial = this.f35623a.a(tutorial.getAssets());
        C2668g.a(tutorial, "onboardingTutorialsAsset….fromApi(apiModel.assets)");
        return new Tutorial(tutorial, fromApiName);
    }
}
