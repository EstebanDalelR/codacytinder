package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.C5942c;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.ClientFactory;
import com.snapchat.kit.sdk.core.networking.LoginClient;
import dagger.Component;
import javax.inject.Named;

@SnapConnectScope
@Component(modules = {C5951d.class, C5942c.class})
public interface SnapKitComponent {
    MetricQueue<ServerEvent> analyticsEventQueue();

    ClientFactory apiFactory();

    AuthTokenManager authTokenManager();

    @Named("client_id")
    String clientId();

    Context context();

    Gson gson();

    void inject(SnapKitActivity snapKitActivity);

    KitEventBaseFactory kitEventBaseFactory();

    LoginClient loginClient();

    LoginStateController logoutController();

    MetricQueue<OpMetric> operationalMetricsQueue();

    @Named("redirect_url")
    String redirectUrl();

    SharedPreferences sharedPreferences();
}
