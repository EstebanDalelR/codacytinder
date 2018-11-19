package com.tinder.module;

import android.app.Application;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.NetworkSamplerInterceptor;
import com.tinder.api.module.OkHttpModule;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.api.networkperf.interceptor.NetworkPerfInterceptor;
import com.tinder.common.logger.Logger;
import com.tinder.managers.bk;
import com.tinder.managers.bs;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0017"}, d2 = {"Lcom/tinder/module/ReleaseOkHttpModule;", "", "()V", "provideNetworkPerfInterceptor", "Lcom/tinder/api/networkperf/interceptor/NetworkPerfInterceptor;", "inspectors", "", "Lcom/tinder/api/networkperf/inspector/NetworkPerfInspector;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "responseErrorAdapter", "Lcom/tinder/api/moshi/ResponseErrorAdapter;", "logger", "Lcom/tinder/common/logger/Logger;", "provideNetworkPerfInterceptor$Tinder_release", "provideNetworkSamplerInterceptor", "Lcom/tinder/api/NetworkSamplerInterceptor;", "application", "Landroid/app/Application;", "networkQualitySampler", "Lcom/tinder/managers/NetworkQualitySampler;", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module(includes = {OkHttpModule.class})
public final class fe {
    @NotNull
    @Provides
    /* renamed from: a */
    public final NetworkSamplerInterceptor m40898a(@NotNull Application application, @NotNull bs bsVar, @NotNull bk bkVar) {
        C2668g.b(application, "application");
        C2668g.b(bsVar, "networkQualitySampler");
        C2668g.b(bkVar, "managerSharedPreferences");
        return new NetworkSamplerInterceptor(application, bsVar, bkVar);
    }

    @Singleton
    @JvmSuppressWildcards
    @NotNull
    @Provides
    /* renamed from: a */
    public final NetworkPerfInterceptor m40899a(@NotNull Set<NetworkPerfInspector> set, @NotNull C2630h c2630h, @NotNull ResponseErrorAdapter responseErrorAdapter, @NotNull Logger logger) {
        C2668g.b(set, "inspectors");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(responseErrorAdapter, "responseErrorAdapter");
        C2668g.b(logger, "logger");
        return new NetworkPerfInterceptor(set, c2630h, responseErrorAdapter, logger);
    }
}
