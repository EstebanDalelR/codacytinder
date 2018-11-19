package com.tinder.data.profile.adapter;

import com.tinder.api.model.common.User;
import com.tinder.data.adapter.C10743s;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.profile.model.Interests;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/data/profile/adapter/InterestsAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/profile/model/Interests;", "Lcom/tinder/api/model/common/User;", "interestAdapter", "Lcom/tinder/data/adapter/InterestDomainApiAdapter;", "(Lcom/tinder/data/adapter/InterestDomainApiAdapter;)V", "fromApi", "apiModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.adapter.o */
public final class C10919o extends C2646o<Interests, User> {
    /* renamed from: a */
    private final C10743s f35621a;

    @Inject
    public C10919o(@NotNull C10743s c10743s) {
        C2668g.b(c10743s, "interestAdapter");
        this.f35621a = c10743s;
    }

    @NotNull
    /* renamed from: a */
    public Interests m43509a(@NotNull User user) {
        C2668g.b(user, "apiModel");
        user = user.interests();
        if (user != null) {
            user = this.f35621a.a(user);
            if (user != null) {
                C2668g.a(user, "interestsList");
                return new Interests(user);
            }
        }
        user = C19301m.a();
        C2668g.a(user, "interestsList");
        return new Interests(user);
    }
}
