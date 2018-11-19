package com.tinder.api;

import com.tinder.domain.auth.UniqueIdFactory;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15963q.C15962a;
import okhttp3.C15966s;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/api/InstallIdHeaderInterceptor;", "Lokhttp3/Interceptor;", "uniqueIdFactory", "Lcom/tinder/domain/auth/UniqueIdFactory;", "(Lcom/tinder/domain/auth/UniqueIdFactory;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class InstallIdHeaderInterceptor implements Interceptor {
    @Deprecated
    public static final Companion Companion = new Companion();
    private static final String INSTALL_ID_HEADER = "install-id";
    private final UniqueIdFactory uniqueIdFactory;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/api/InstallIdHeaderInterceptor$Companion;", "", "()V", "INSTALL_ID_HEADER", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private static final class Companion {
        private Companion() {
        }
    }

    @Inject
    public InstallIdHeaderInterceptor(@NotNull UniqueIdFactory uniqueIdFactory) {
        C2668g.b(uniqueIdFactory, "uniqueIdFactory");
        this.uniqueIdFactory = uniqueIdFactory;
    }

    @NotNull
    public C15966s intercept(@NotNull Chain chain) {
        C2668g.b(chain, "chain");
        C15962a e = chain.request().e();
        e.a(INSTALL_ID_HEADER, this.uniqueIdFactory.getInstanceId());
        chain = chain.proceed(e.d());
        C2668g.a(chain, "chain.proceed(builder.build())");
        return chain;
    }
}
