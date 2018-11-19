package com.tinder.smsauth.sdk.di;

import android.content.Context;
import com.tinder.smsauth.core.di.scope.SmsAuthScope;
import com.tinder.smsauth.entity.SmsAuthRepository;
import com.tinder.smsauth.sdk.analytics.SmsAuthTracker;
import dagger.Component;
import dagger.android.C15511b;
import dagger.android.HasActivityInjector;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Component(dependencies = {Parent.class}, modules = {C15511b.class, C14996k.class, C14994h.class, C14997r.class, C14998s.class})
@SmsAuthScope
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/sdk/di/SmsAuthComponent;", "Ldagger/android/HasActivityInjector;", "Parent", "sdk_release"}, k = 1, mv = {1, 1, 10})
public interface SmsAuthComponent extends HasActivityInjector {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/smsauth/sdk/di/SmsAuthComponent$Parent;", "", "context", "Landroid/content/Context;", "smsAuthRepository", "Lcom/tinder/smsauth/entity/SmsAuthRepository;", "smsAuthTracker", "Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;", "sdk_release"}, k = 1, mv = {1, 1, 10})
    public interface Parent {
        @NotNull
        Context context();

        @NotNull
        SmsAuthRepository smsAuthRepository();

        @NotNull
        SmsAuthTracker smsAuthTracker();
    }
}
