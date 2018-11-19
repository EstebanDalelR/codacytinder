package com.snapchat.kit.sdk.core.metrics.business;

import android.os.Build.VERSION;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.C7140a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import javax.inject.Inject;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.metrics.business.c */
public class C7144c implements MetricQueue<ServerEvent> {
    /* renamed from: a */
    private final C5941h f25892a;
    /* renamed from: b */
    private final C7140a<ServerEvent> f25893b;

    public /* synthetic */ void push(Object obj) {
        m30803a((ServerEvent) obj);
    }

    @Inject
    C7144c(C5941h c5941h, C7140a<ServerEvent> c7140a) {
        this.f25892a = c5941h;
        this.f25893b = c7140a;
    }

    /* renamed from: a */
    public void m30803a(ServerEvent serverEvent) {
        this.f25893b.push(ServerEvent.newBuilder(serverEvent).setSequenceId(this.f25892a.m25540b()).setOsType("Android").setOsVersion(VERSION.RELEASE == null ? "" : VERSION.RELEASE).build());
    }
}
