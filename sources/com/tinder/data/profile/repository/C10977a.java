package com.tinder.data.profile.repository;

import com.tinder.api.ManagerWebServices;
import com.tinder.data.profile.client.C8756a;
import com.tinder.data.profile.persistence.ProfileDataStore;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.profile.model.InstagramAuthResult;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.repository.InstagramRepository;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/data/profile/repository/InstagramDataRepository;", "Lcom/tinder/domain/profile/repository/InstagramRepository;", "client", "Lcom/tinder/data/profile/client/InstagramClient;", "dataStore", "Lcom/tinder/data/profile/persistence/ProfileDataStore;", "(Lcom/tinder/data/profile/client/InstagramClient;Lcom/tinder/data/profile/persistence/ProfileDataStore;)V", "connect", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/InstagramAuthResult;", "authorizationCode", "", "disconnect", "Lio/reactivex/Completable;", "persistInstagram", "data", "Lcom/tinder/domain/common/model/Instagram;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.repository.a */
public final class C10977a implements InstagramRepository {
    /* renamed from: a */
    private final C8756a f35695a;
    /* renamed from: b */
    private final ProfileDataStore f35696b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/InstagramAuthResult;", "kotlin.jvm.PlatformType", "instagram", "Lcom/tinder/domain/common/model/Instagram;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.repository.a$a */
    static final class C10976a<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10977a f35694a;

        C10976a(C10977a c10977a) {
            this.f35694a = c10977a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43581a((Instagram) obj);
        }

        /* renamed from: a */
        public final C3960g<InstagramAuthResult> m43581a(@NotNull Instagram instagram) {
            C2668g.b(instagram, ManagerWebServices.IG_PARAM_INSTAGRAM);
            C3956a a = this.f35694a.m43583a(instagram);
            String username = instagram.username();
            C2668g.a(username, "instagram.username()");
            instagram = instagram.lastFetchedTime();
            C2668g.a(instagram, "instagram.lastFetchedTime()");
            return a.a(C3960g.a(new InstagramAuthResult(username, instagram.c())));
        }
    }

    @Inject
    public C10977a(@NotNull C8756a c8756a, @NotNull ProfileDataStore profileDataStore) {
        C2668g.b(c8756a, "client");
        C2668g.b(profileDataStore, "dataStore");
        this.f35695a = c8756a;
        this.f35696b = profileDataStore;
    }

    @NotNull
    public C3960g<InstagramAuthResult> connect(@NotNull String str) {
        C2668g.b(str, "authorizationCode");
        str = this.f35695a.m37292a(str).a(new C10976a(this));
        C2668g.a(str, "client.connect(authoriza…          )\n            }");
        return str;
    }

    @NotNull
    public C3956a disconnect() {
        C3956a a = this.f35695a.m37291a();
        Instagram instagram = Instagram.DISCONNECTED;
        C2668g.a(instagram, "Instagram.DISCONNECTED");
        a = a.b(m43583a(instagram));
        C2668g.a(a, "client.disconnect()\n    …(Instagram.DISCONNECTED))");
        return a;
    }

    /* renamed from: a */
    private final C3956a m43583a(Instagram instagram) {
        return this.f35696b.save(ProfileOption.Instagram.INSTANCE, instagram);
    }
}
