package com.tinder.smsauth.sdk.di;

import com.tinder.smsauth.sdk.di.SmsAuthComponent.Parent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/smsauth/sdk/di/SmsAuthComponent;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class SmsAuthLifecycleListener$1 extends Lambda implements Function0<SmsAuthComponent> {
    /* renamed from: a */
    final /* synthetic */ Parent f58530a;

    SmsAuthLifecycleListener$1(Parent parent) {
        this.f58530a = parent;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m67359a();
    }

    /* renamed from: a */
    public final SmsAuthComponent m67359a() {
        SmsAuthComponent a = C18124a.m65751a().m56597a(this.f58530a).m56596a();
        C2668g.a(a, "DaggerSmsAuthComponent.b…ent)\n            .build()");
        return a;
    }
}
