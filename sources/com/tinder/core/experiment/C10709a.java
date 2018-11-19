package com.tinder.core.experiment;

import com.tinder.domain.message.GifProvider;
import com.tinder.domain.message.GifProviderExperimentUtility;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tinder/core/experiment/AbTestGifProviderExperimentUtility;", "Lcom/tinder/domain/message/GifProviderExperimentUtility;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/core/experiment/AbTestUtility;)V", "gifProvider", "Lcom/tinder/domain/message/GifProvider;", "getGifProvider", "()Lcom/tinder/domain/message/GifProvider;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.core.experiment.a */
public final class C10709a implements GifProviderExperimentUtility {
    @NotNull
    /* renamed from: a */
    private final GifProvider f35068a;

    @Inject
    public C10709a(@NotNull AbTestUtility abTestUtility) {
        C2668g.b(abTestUtility, "abTestUtility");
        this.f35068a = GifProvider.Companion.from(abTestUtility.getGifProvider());
    }

    @NotNull
    public GifProvider getGifProvider() {
        return this.f35068a;
    }
}
