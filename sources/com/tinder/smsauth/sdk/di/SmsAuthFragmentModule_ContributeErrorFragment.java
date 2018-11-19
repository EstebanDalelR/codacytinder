package com.tinder.smsauth.sdk.di;

import com.tinder.smsauth.ui.C18137c;
import dagger.Module;
import dagger.Subcomponent;
import dagger.Subcomponent.Builder;
import dagger.android.AndroidInjector;
import dagger.android.AndroidInjector$a;

@Module(subcomponents = {ErrorFragmentSubcomponent.class})
public abstract class SmsAuthFragmentModule_ContributeErrorFragment {

    @Subcomponent
    public interface ErrorFragmentSubcomponent extends AndroidInjector<C18137c> {

        @Builder
        /* renamed from: com.tinder.smsauth.sdk.di.SmsAuthFragmentModule_ContributeErrorFragment$ErrorFragmentSubcomponent$a */
        public static abstract class C18116a extends AndroidInjector$a<C18137c> {
        }
    }
}
