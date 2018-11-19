package com.tinder.smsauth.sdk.di;

import android.content.Context;
import com.google.android.gms.auth.api.C2422a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.C2464a;
import com.google.android.gms.common.api.Scope;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, d2 = {"Lcom/tinder/smsauth/sdk/di/GoogleApiModule;", "", "()V", "providePhoneNumberCollector", "Lcom/tinder/smsauth/ui/PhoneNumberCollector;", "googlePhoneNumberCollector", "Lcom/tinder/smsauth/sdk/GooglePhoneNumberCollector;", "Companion", "sdk_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.smsauth.sdk.di.d */
public abstract class C14993d {
    /* renamed from: a */
    public static final C14992a f46770a = new C14992a();

    @Module
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/smsauth/sdk/di/GoogleApiModule$Companion;", "", "()V", "provideGoogleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "context", "Landroid/content/Context;", "sdk_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.sdk.di.d$a */
    public static final class C14992a {
        private C14992a() {
        }

        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final GoogleApiClient m56598a(@NotNull Context context) {
            C2668g.b(context, "context");
            context = new C2464a(context).a(C2422a.f7346d, new Scope[0]).b();
            C2668g.a(context, "GoogleApiClient.Builder(…\n                .build()");
            return context;
        }
    }

    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final GoogleApiClient m56599a(@NotNull Context context) {
        return f46770a.m56598a(context);
    }
}
