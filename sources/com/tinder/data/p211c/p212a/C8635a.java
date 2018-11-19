package com.tinder.data.p211c.p212a;

import com.tinder.data.p211c.C10761a;
import com.tinder.data.p211c.C8636b;
import com.tinder.domain.connectivity.ConnectivityRepository;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/data/connectivity/module/ConnectivityModule;", "", "()V", "provideConnectivityRepository", "Lcom/tinder/domain/connectivity/ConnectivityRepository;", "reactiveNetworkWrapper", "Lcom/tinder/data/connectivity/ReactiveNetworkWrapper;", "provideConnectivityRepository$data_release", "data_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.data.c.a.a */
public final class C8635a {
    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final ConnectivityRepository m36789a(@NotNull C8636b c8636b) {
        C2668g.b(c8636b, "reactiveNetworkWrapper");
        return new C10761a(c8636b);
    }
}
