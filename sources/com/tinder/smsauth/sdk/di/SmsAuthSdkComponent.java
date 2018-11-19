package com.tinder.smsauth.sdk.di;

import android.content.Context;
import com.tinder.smsauth.data.C14971d;
import com.tinder.smsauth.data.p412a.C14966b;
import com.tinder.smsauth.entity.SmsAuthType;
import com.tinder.smsauth.sdk.analytics.SmsAuthTracker;
import com.tinder.smsauth.sdk.di.SmsAuthComponent.Parent;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/sdk/di/SmsAuthSdkComponent;", "Lcom/tinder/smsauth/sdk/di/SmsAuthComponent$Parent;", "Builder", "sdk_release"}, k = 1, mv = {1, 1, 10})
@Component(modules = {C14971d.class})
public interface SmsAuthSdkComponent extends Parent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH'¨\u0006\r"}, d2 = {"Lcom/tinder/smsauth/sdk/di/SmsAuthSdkComponent$Builder;", "", "build", "Lcom/tinder/smsauth/sdk/di/SmsAuthSdkComponent;", "context", "Landroid/content/Context;", "networkModule", "Lcom/tinder/smsauth/data/network/NetworkModule;", "smsAuthTracker", "Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;", "smsAuthType", "type", "Lcom/tinder/smsauth/entity/SmsAuthType;", "sdk_release"}, k = 1, mv = {1, 1, 10})
    @dagger.Component.Builder
    public interface Builder {
        @NotNull
        SmsAuthSdkComponent build();

        @NotNull
        @BindsInstance
        Builder context(@NotNull Context context);

        @NotNull
        Builder networkModule(@NotNull C14966b c14966b);

        @NotNull
        @BindsInstance
        Builder smsAuthTracker(@NotNull SmsAuthTracker smsAuthTracker);

        @NotNull
        @BindsInstance
        Builder smsAuthType(@NotNull SmsAuthType smsAuthType);
    }
}
