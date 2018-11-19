package com.tinder.auth.accountkit;

import com.tinder.auth.interactor.AddSmsValidateEvent;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.accountkit.i */
public final class C10329i implements MembersInjector<ValidateAccountKitUiManager> {
    /* renamed from: a */
    private final Provider<AddSmsValidateEvent> f33735a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42110a((ValidateAccountKitUiManager) obj);
    }

    /* renamed from: a */
    public void m42110a(ValidateAccountKitUiManager validateAccountKitUiManager) {
        C10329i.m42109a(validateAccountKitUiManager, (AddSmsValidateEvent) this.f33735a.get());
    }

    /* renamed from: a */
    public static void m42109a(ValidateAccountKitUiManager validateAccountKitUiManager, AddSmsValidateEvent addSmsValidateEvent) {
        validateAccountKitUiManager.addSmsValidateEvent = addSmsValidateEvent;
    }
}
