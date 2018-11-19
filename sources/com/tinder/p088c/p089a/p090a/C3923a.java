package com.tinder.p088c.p089a.p090a;

import com.tinder.data.adapter.C2645i;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.PlusControlSettings.Blend;
import com.tinder.domain.meta.model.PlusControlSettings.DiscoverableParty;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.model.User;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/legacy/model/adapter/TinderPlusSettingsLegacyUserAdapter;", "Lcom/tinder/data/adapter/BoundaryAdapter;", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "Lcom/tinder/model/User;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "adapt", "input", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "This data flow is replaced by ProfileRemoteRepository & Datastore")
/* renamed from: com.tinder.c.a.a.a */
public final class C3923a extends C2645i<PlusControlSettings, User> {
    /* renamed from: a */
    private final SubscriptionProvider f12238a;

    public /* synthetic */ Object adapt(Object obj) {
        return m14738a((User) obj);
    }

    @Inject
    public C3923a(@NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.m10309b(subscriptionProvider, "subscriptionProvider");
        this.f12238a = subscriptionProvider;
    }

    @NotNull
    /* renamed from: a */
    public PlusControlSettings m14738a(@NotNull User user) {
        C2668g.m10309b(user, "input");
        Object build = PlusControlSettings.builder().isHideAds(this.f12238a.get().isActiveSubscription()).isHideAge(user.getHideAge()).isHideDistance(user.getHideDistance()).blend(Blend.from(user.getBlend())).discoverableParty(DiscoverableParty.from(user.getDiscoverability())).build();
        C2668g.m10305a(build, "PlusControlSettings.buil…\n                .build()");
        return build;
    }
}
