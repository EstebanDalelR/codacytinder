package com.tinder.smsauth.sdk.di;

import com.tinder.smsauth.ui.SmsAuthActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.Subcomponent.Builder;
import dagger.android.AndroidInjector;
import dagger.android.AndroidInjector$a;

@Module(subcomponents = {SmsAuthActivitySubcomponent.class})
public abstract class SmsAuthActivityModule_SmsAuthActivity {

    @Subcomponent(modules = {C14995i.class, C14993d.class})
    public interface SmsAuthActivitySubcomponent extends AndroidInjector<SmsAuthActivity> {

        @Builder
        /* renamed from: com.tinder.smsauth.sdk.di.SmsAuthActivityModule_SmsAuthActivity$SmsAuthActivitySubcomponent$a */
        public static abstract class C18114a extends AndroidInjector$a<SmsAuthActivity> {
        }
    }
}
