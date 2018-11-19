package com.tinder.dialogs;

import com.tinder.presenters.PresenterDialogIsTween;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.dialogs.o */
public final class C11116o implements MembersInjector<DialogIsTween> {
    /* renamed from: a */
    private final Provider<PresenterDialogIsTween> f35991a;

    public /* synthetic */ void injectMembers(Object obj) {
        m43853a((DialogIsTween) obj);
    }

    /* renamed from: a */
    public void m43853a(DialogIsTween dialogIsTween) {
        C11116o.m43852a(dialogIsTween, (PresenterDialogIsTween) this.f35991a.get());
    }

    /* renamed from: a */
    public static void m43852a(DialogIsTween dialogIsTween, PresenterDialogIsTween presenterDialogIsTween) {
        dialogIsTween.f35948a = presenterDialogIsTween;
    }
}
