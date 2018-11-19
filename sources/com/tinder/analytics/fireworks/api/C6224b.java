package com.tinder.analytics.fireworks.api;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\b\u0017¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/tinder/analytics/fireworks/api/FireworksUrlProvider;", "", "()V", "fireworksUrl", "", "sparksHost", "(Ljava/lang/String;Ljava/lang/String;)V", "getFireworksUrl", "()Ljava/lang/String;", "getSparksHost", "analytics_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.fireworks.api.b */
public final class C6224b {
    @NotNull
    /* renamed from: a */
    private final String f22795a;
    @NotNull
    /* renamed from: b */
    private final String f22796b;

    public C6224b(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "fireworksUrl");
        C2668g.b(str2, "sparksHost");
        this.f22795a = str;
        this.f22796b = str2;
    }

    @NotNull
    /* renamed from: a */
    public final String m26860a() {
        return this.f22795a;
    }

    @NotNull
    /* renamed from: b */
    public final String m26861b() {
        return this.f22796b;
    }

    @Inject
    public C6224b() {
        this("https://etl.tindersparks.com", "https://etl.tindersparks.com:443/v2/");
    }
}
