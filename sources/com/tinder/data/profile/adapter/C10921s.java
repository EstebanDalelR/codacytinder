package com.tinder.data.profile.adapter;

import com.tinder.data.adapter.C2646o;
import com.tinder.domain.onboarding.Onboarding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/profile/adapter/OnboardingAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/onboarding/Onboarding;", "Lcom/tinder/api/model/profile/Onboarding;", "tutorialsAdapter", "Lcom/tinder/data/profile/adapter/OnboardingTutorialsAdapter;", "(Lcom/tinder/data/profile/adapter/OnboardingTutorialsAdapter;)V", "fromApi", "apiModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.adapter.s */
public final class C10921s extends C2646o<Onboarding, com.tinder.api.model.profile.Onboarding> {
    /* renamed from: a */
    private final C10922u f35622a;

    @Inject
    public C10921s(@NotNull C10922u c10922u) {
        C2668g.b(c10922u, "tutorialsAdapter");
        this.f35622a = c10922u;
    }

    @Nullable
    /* renamed from: a */
    public Onboarding m43513a(@NotNull com.tinder.api.model.profile.Onboarding onboarding) {
        C2668g.b(onboarding, "apiModel");
        onboarding = this.f35622a.a(onboarding.getTutorials());
        C2668g.a(onboarding, "tutorialsAdapter.fromApi(apiModel.tutorials)");
        return new Onboarding(onboarding);
    }
}
