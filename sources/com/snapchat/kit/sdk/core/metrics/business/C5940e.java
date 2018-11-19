package com.snapchat.kit.sdk.core.metrics.business;

import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData.Builder;
import javax.inject.Inject;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.e */
public class C5940e {
    /* renamed from: a */
    private final KitEventBaseFactory f21715a;

    @Inject
    C5940e(KitEventBaseFactory kitEventBaseFactory) {
        this.f21715a = kitEventBaseFactory;
    }

    /* renamed from: a */
    public ServerEvent m25537a() {
        return m25535a(ServerEventData.newBuilder().setLoginKitAuthStart(LoginKitAuthStart.newBuilder().setLogKitEventBase(m25536b())));
    }

    /* renamed from: a */
    public ServerEvent m25538a(boolean z) {
        return m25535a(ServerEventData.newBuilder().setLoginKitAuthComplete(LoginKitAuthComplete.newBuilder().setLogKitEventBase(m25536b()).setIsSuccess(z)));
    }

    /* renamed from: a */
    private ServerEvent m25535a(Builder builder) {
        return ServerEvent.newBuilder().setEventData(builder).build();
    }

    /* renamed from: b */
    private LoginKitEventBase m25536b() {
        return LoginKitEventBase.newBuilder().setKitEventBase(this.f21715a.createKitEventBase(KitType.LOGIN_KIT, "1.0.2")).build();
    }
}
