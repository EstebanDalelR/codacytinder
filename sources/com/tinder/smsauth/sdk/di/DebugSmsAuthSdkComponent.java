package com.tinder.smsauth.sdk.di;

import android.content.Context;
import com.tinder.smsauth.sdk.analytics.SmsAuthTracker;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/sdk/di/DebugSmsAuthSdkComponent;", "Lcom/tinder/smsauth/sdk/di/SmsAuthSdkComponent;", "Builder", "sdk_release"}, k = 1, mv = {1, 1, 10})
@Component(modules = {C14991c.class})
public interface DebugSmsAuthSdkComponent extends SmsAuthSdkComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/tinder/smsauth/sdk/di/DebugSmsAuthSdkComponent$Builder;", "", "build", "Lcom/tinder/smsauth/sdk/di/SmsAuthSdkComponent;", "context", "Landroid/content/Context;", "smsAuthTracker", "Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;", "sdk_release"}, k = 1, mv = {1, 1, 10})
    @dagger.Component.Builder
    public interface Builder {
        @NotNull
        SmsAuthSdkComponent build();

        @NotNull
        @BindsInstance
        Builder context(@NotNull Context context);

        @NotNull
        @BindsInstance
        Builder smsAuthTracker(@NotNull SmsAuthTracker smsAuthTracker);
    }
}
