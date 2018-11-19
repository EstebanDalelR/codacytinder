package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.ui.C1327y.C4351a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.LoginFlowBroadcastReceiver.Event;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

/* renamed from: com.facebook.accountkit.ui.w */
abstract class C4131w extends C3210g {
    @Nullable
    /* renamed from: a */
    Handler f13116a;
    @Nullable
    /* renamed from: b */
    Runnable f13117b;
    /* renamed from: c */
    private C4351a f13118c;
    /* renamed from: d */
    private C4351a f13119d;
    /* renamed from: f */
    private C4132a f13120f;
    /* renamed from: g */
    private C4132a f13121g;
    /* renamed from: h */
    private C4351a f13122h;
    /* renamed from: i */
    private C4351a f13123i;

    C4131w(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: a */
    public void mo1630a(final Activity activity) {
        super.mo1630a(activity);
        m16227g();
        this.f13116a = new Handler();
        this.f13117b = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C4131w f3472b;

            public void run() {
                C0436c.m1648a(activity).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.SENT_CODE_COMPLETE));
                this.f3472b.f13116a = null;
                this.f3472b.f13117b = null;
            }
        };
        this.f13116a.postDelayed(this.f13117b, DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    }

    /* renamed from: b */
    public void mo1631b(Activity activity) {
        m16227g();
        super.mo1631b(activity);
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f13118c == null) {
            mo3270a(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13118c;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13118c = (C4351a) c4127h;
        }
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13119d = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13120f = c4132a;
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.f13121g == null) {
            mo3271b(C1328z.m4644a(this.e.getUIManager(), C1194g.com_accountkit_sent_title, new String[0]));
        }
        return this.f13121g;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        this.f13121g = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return LoginFlowState.SENT_CODE;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13122h == null) {
            this.f13122h = C1327y.m4641a(this.e.getUIManager(), mo3261d());
        }
        return this.f13122h;
    }

    /* renamed from: f */
    public C4127h mo3263f() {
        if (this.f13123i == null) {
            mo3273c(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13123i;
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13123i = (C4351a) c4127h;
        }
    }

    /* renamed from: g */
    void m16227g() {
        if (this.f13116a != null && this.f13117b != null) {
            this.f13116a.removeCallbacks(this.f13117b);
            this.f13117b = null;
            this.f13116a = null;
        }
    }
}
