package com.tinder.profile.p363b;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApi;
import com.tinder.api.model.profile.Share;
import com.tinder.domain.common.reactivex.usecase.ObservableUseCase;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/profile/interactor/GetShareLinkUrl;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableUseCase;", "", "tinderApi", "Lcom/tinder/api/TinderApi;", "(Lcom/tinder/api/TinderApi;)V", "execute", "Lio/reactivex/Observable;", "userId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.b.z */
public final class C16093z implements ObservableUseCase<String, String> {
    /* renamed from: a */
    private final TinderApi f50036a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "shareResponse", "Lretrofit2/Response;", "Lcom/tinder/api/model/profile/Share;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.b.z$a */
    static final class C16092a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16092a f50035a = new C16092a();

        C16092a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60895a((Response) obj);
        }

        @Nullable
        /* renamed from: a */
        public final String m60895a(@NotNull Response<Share> response) {
            C2668g.b(response, "shareResponse");
            Share share = (Share) response.body();
            return share != null ? share.link() : null;
        }
    }

    @Inject
    public C16093z(@NotNull TinderApi tinderApi) {
        C2668g.b(tinderApi, "tinderApi");
        this.f50036a = tinderApi;
    }

    public /* synthetic */ C3959e execute(Object obj) {
        return m60896a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3959e<String> m60896a(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        str = this.f50036a.getShareLink(str);
        C2668g.a(str, "tinderApi.getShareLink(userId)");
        str = RxJavaInteropExtKt.toV2Observable(str).map(C16092a.f50035a);
        C2668g.a(str, "tinderApi.getShareLink(u…Response.body()?.link() }");
        return str;
    }
}
