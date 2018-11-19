package com.tinder.smsauth.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.tinder.smsauth.data.p412a.C14966b;
import com.tinder.smsauth.entity.C14976d;
import com.tinder.smsauth.entity.C16747a;
import com.tinder.smsauth.entity.C16748b;
import com.tinder.smsauth.entity.C16749e;
import com.tinder.smsauth.sdk.analytics.C16753a;
import com.tinder.smsauth.sdk.analytics.SmsAuthTracker;
import com.tinder.smsauth.sdk.di.C16762j;
import com.tinder.smsauth.sdk.di.C18125b;
import com.tinder.smsauth.sdk.di.SmsAuthSdkComponent;
import com.tinder.smsauth.ui.SmsAuthActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/smsauth/sdk/SmsAuth;", "", "()V", "createSdkComponent", "Lcom/tinder/smsauth/sdk/di/SmsAuthSdkComponent;", "context", "Landroid/content/Context;", "config", "Lcom/tinder/smsauth/sdk/SmsAuthConfig;", "extractLoginCredential", "Lcom/tinder/smsauth/entity/LoginCredentials;", "intent", "Landroid/content/Intent;", "launch", "", "fromActivity", "Landroid/app/Activity;", "requestCode", "", "sdk_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.sdk.b */
public final class C14986b {
    /* renamed from: a */
    public static final C14986b f46762a = new C14986b();

    private C14986b() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m56589a(@NotNull Activity activity, int i, @NotNull C14987c c14987c) {
        C2668g.b(activity, "fromActivity");
        C2668g.b(c14987c, "config");
        C14986b c14986b = f46762a;
        Application application = activity.getApplication();
        C2668g.a(application, "fromActivity.application");
        activity.getApplication().registerActivityLifecycleCallbacks(new C16762j(c14986b.m56588a(application, c14987c)));
        activity.startActivityForResult(SmsAuthActivity.f59935d.m56606a(activity), i);
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final C14976d m56587a(@NotNull Intent intent) {
        C2668g.b(intent, "intent");
        String stringExtra = intent.getStringExtra("refresh_token");
        String stringExtra2 = intent.getStringExtra("onboarding_token");
        intent = intent.getStringExtra("access_token");
        if (stringExtra2 != null) {
            C2668g.a(stringExtra, "refreshToken");
            intent = (C14976d) new C16749e(stringExtra, stringExtra2);
        } else {
            C16747a c16747a;
            if (intent != null) {
                C2668g.a(stringExtra, "refreshToken");
                c16747a = new C16747a(stringExtra, intent);
            } else {
                c16747a = null;
            }
            intent = c16747a;
        }
        if (intent != null) {
            return intent;
        }
        C2668g.a(stringExtra, "refreshToken");
        return (C14976d) new C16748b(stringExtra);
    }

    /* renamed from: a */
    private final SmsAuthSdkComponent m56588a(Context context, C14987c c14987c) {
        context = C18125b.m65761a().context(context).smsAuthType(c14987c.m56591b());
        SmsAuthTracker d = c14987c.m56593d();
        if (d == null) {
            d = new C16753a();
        }
        return context.smsAuthTracker(d).networkModule(new C14966b(c14987c.m56590a(), c14987c.m56592c())).build();
    }
}
