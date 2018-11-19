package com.tinder.smsauth.sdk.di;

import com.tinder.smsauth.ui.C18136a;
import dagger.Module;
import dagger.Subcomponent;
import dagger.Subcomponent.Builder;
import dagger.android.AndroidInjector;
import dagger.android.AndroidInjector$a;

@Module(subcomponents = {CountryCodeSelectionFragmentSubcomponent.class})
public abstract class SmsAuthFragmentModule_ContributeCountryCodeSelectionFragment {

    @Subcomponent
    public interface CountryCodeSelectionFragmentSubcomponent extends AndroidInjector<C18136a> {

        @Builder
        /* renamed from: com.tinder.smsauth.sdk.di.SmsAuthFragmentModule_ContributeCountryCodeSelectionFragment$CountryCodeSelectionFragmentSubcomponent$a */
        public static abstract class C18115a extends AndroidInjector$a<C18136a> {
        }
    }
}
