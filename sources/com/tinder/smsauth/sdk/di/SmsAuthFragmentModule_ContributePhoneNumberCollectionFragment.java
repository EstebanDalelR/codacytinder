package com.tinder.smsauth.sdk.di;

import com.tinder.smsauth.ui.C18141i;
import dagger.Module;
import dagger.Subcomponent;
import dagger.Subcomponent.Builder;
import dagger.android.AndroidInjector;
import dagger.android.AndroidInjector$a;

@Module(subcomponents = {PhoneNumberCollectionFragmentSubcomponent.class})
public abstract class SmsAuthFragmentModule_ContributePhoneNumberCollectionFragment {

    @Subcomponent
    public interface PhoneNumberCollectionFragmentSubcomponent extends AndroidInjector<C18141i> {

        @Builder
        /* renamed from: com.tinder.smsauth.sdk.di.SmsAuthFragmentModule_ContributePhoneNumberCollectionFragment$PhoneNumberCollectionFragmentSubcomponent$a */
        public static abstract class C18118a extends AndroidInjector$a<C18141i> {
        }
    }
}
