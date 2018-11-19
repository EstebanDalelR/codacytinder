package com.tinder.smsauth.data.api;

import com.tinder.smsauth.data.p412a.C14966b;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/smsauth/data/api/SmsAuthApiModule;", "", "()V", "provideSmsAuthService", "Lcom/tinder/smsauth/data/api/SmsAuthService;", "retrofit", "Lretrofit2/Retrofit;", "data"}, k = 1, mv = {1, 1, 10})
@Module(includes = {C14966b.class})
public final class SmsAuthApiModule {
    @NotNull
    @Provides
    public final SmsAuthService provideSmsAuthService(@NotNull Retrofit retrofit) {
        C2668g.b(retrofit, "retrofit");
        retrofit = retrofit.create(SmsAuthService.class);
        C2668g.a(retrofit, "retrofit.create(SmsAuthService::class.java)");
        return (SmsAuthService) retrofit;
    }
}
