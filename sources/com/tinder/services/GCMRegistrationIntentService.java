package com.tinder.services;

import android.app.IntentService;
import android.content.Intent;
import com.google.android.gms.iid.C2553a;
import com.tinder.domain.pushnotifications.usecase.RegisterPushToken;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.bk;
import com.tinder.utils.ad;
import javax.inject.Inject;
import rx.schedulers.Schedulers;

public class GCMRegistrationIntentService extends IntentService {
    @Inject
    /* renamed from: a */
    bk f46437a;
    @Inject
    /* renamed from: b */
    RegisterPushToken f46438b;

    public GCMRegistrationIntentService() {
        super("gcmRegistrationIntentService");
        ManagerApp.e().inject(this);
    }

    protected void onHandleIntent(Intent intent) {
        try {
            ad.a("GCM onHandleIntent");
            String b = C2553a.c(this).b("465293127427", "GCM", null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GCM Registration Token: ");
            stringBuilder.append(b);
            ad.e(stringBuilder.toString());
            m56191a(b);
        } catch (Intent intent2) {
            ad.a("GCM Failed to complete token refresh", intent2);
            this.f46437a.j(false);
        }
    }

    /* renamed from: a */
    private void m56191a(String str) {
        this.f46438b.execute(str).b(Schedulers.io()).a(new C18823a(this), C18824b.f58364a);
    }

    /* renamed from: a */
    final /* synthetic */ void m56193a() {
        this.f46437a.j(true);
    }
}
