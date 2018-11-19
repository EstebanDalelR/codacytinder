package com.tinder.smsauth.sdk.di;

import com.tinder.di.C8837b;
import com.tinder.smsauth.sdk.di.SmsAuthComponent.Parent;
import com.tinder.smsauth.ui.SmsAuthActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/smsauth/sdk/di/SmsAuthLifecycleListener;", "Lcom/tinder/di/InjectingActivityLifecycleListener;", "Lcom/tinder/smsauth/sdk/di/SmsAuthComponent;", "component", "Lcom/tinder/smsauth/sdk/di/SmsAuthComponent$Parent;", "(Lcom/tinder/smsauth/sdk/di/SmsAuthComponent$Parent;)V", "sdk_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.sdk.di.j */
public final class C16762j extends C8837b<SmsAuthComponent> {
    public C16762j(@NotNull Parent parent) {
        C2668g.b(parent, "component");
        super(al.m59817a(C15825i.m59860a(SmsAuthActivity.class)), al.m59817a(C15825i.m59860a(SmsAuthActivity.class)), new SmsAuthLifecycleListener$1(parent));
    }
}
