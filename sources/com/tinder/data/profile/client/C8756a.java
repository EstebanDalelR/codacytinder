package com.tinder.data.profile.client;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApi;
import com.tinder.api.model.common.NetworkError;
import com.tinder.api.request.InstagramAuthResponse;
import com.tinder.data.adapter.C10742q;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.profile.model.exception.InstagramAccountAlreadyInUseException;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/data/profile/client/InstagramClient;", "", "tinderApi", "Lcom/tinder/api/TinderApi;", "adapter", "Lcom/tinder/data/adapter/InstagramDomainApiAdapter;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/adapter/InstagramDomainApiAdapter;)V", "connect", "Lio/reactivex/Single;", "Lcom/tinder/domain/common/model/Instagram;", "authorizationCode", "", "disconnect", "Lio/reactivex/Completable;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.client.a */
public final class C8756a {
    /* renamed from: a */
    private final TinderApi f30750a;
    /* renamed from: b */
    private final C10742q f30751b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lcom/tinder/api/request/InstagramAuthResponse;", "kotlin.jvm.PlatformType", "throwable", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.client.a$a */
    static final class C10929a<T, R> implements Function<Throwable, SingleSource<? extends InstagramAuthResponse>> {
        /* renamed from: a */
        public static final C10929a f35631a = new C10929a();

        C10929a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43525a((Throwable) obj);
        }

        /* renamed from: a */
        public final SingleSource<? extends InstagramAuthResponse> m43525a(@NotNull Throwable th) {
            C2668g.b(th, "throwable");
            if ((th instanceof NetworkError) && C2668g.a(ManagerWebServices.IG_ERROR_ALREADY_IN_USE, ((NetworkError) th).getText())) {
                return C3960g.a(new InstagramAccountAlreadyInUseException());
            }
            return C3960g.a(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/model/Instagram;", "it", "Lcom/tinder/api/request/InstagramAuthResponse;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.client.a$b */
    static final class C10930b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8756a f35632a;

        C10930b(C8756a c8756a) {
            this.f35632a = c8756a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43526a((InstagramAuthResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Instagram m43526a(@NotNull InstagramAuthResponse instagramAuthResponse) {
            C2668g.b(instagramAuthResponse, "it");
            com.tinder.api.model.common.Instagram instagram = instagramAuthResponse.getInstagram();
            if (instagram != null) {
                Instagram a = this.f35632a.f30751b.m43139a(instagram);
                if (a != null) {
                    return a;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Response doesn't have Instagram data: ");
            stringBuilder.append(instagramAuthResponse);
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    @Inject
    public C8756a(@NotNull TinderApi tinderApi, @NotNull C10742q c10742q) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c10742q, "adapter");
        this.f30750a = tinderApi;
        this.f30751b = c10742q;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<Instagram> m37292a(@NotNull String str) {
        C2668g.b(str, "authorizationCode");
        str = this.f30750a.authInstagram(str).f(C10929a.f35631a).e(new C10930b(this));
        C2668g.a(str, "tinderApi.authInstagram(…data: $it\")\n            }");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37291a() {
        C3956a logoutInstagram = this.f30750a.logoutInstagram();
        C2668g.a(logoutInstagram, "tinderApi.logoutInstagram()");
        return logoutInstagram;
    }
}
