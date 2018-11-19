package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.C1196d.C1194g;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.facebook.accountkit.ui.C1327y.C4351a;
import com.facebook.accountkit.ui.C1328z.C4132a;
import com.facebook.accountkit.ui.LoginFlowBroadcastReceiver.Event;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

/* renamed from: com.facebook.accountkit.ui.b */
public class C4125b extends C3210g {
    /* renamed from: a */
    private C4351a f13079a;
    /* renamed from: b */
    private C4351a f13080b;
    /* renamed from: c */
    private C4132a f13081c;
    /* renamed from: d */
    private C4132a f13082d;
    /* renamed from: f */
    private C4351a f13083f;
    /* renamed from: g */
    private C4351a f13084g;
    /* renamed from: h */
    private Handler f13085h;
    /* renamed from: i */
    private Runnable f13086i;

    C4125b(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: a */
    public void mo1630a(final Activity activity) {
        super.mo1630a(activity);
        m16145g();
        this.f13085h = new Handler();
        this.f13086i = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C4125b f3458b;

            public void run() {
                C0436c.m1648a(activity).m1653a(new Intent(LoginFlowBroadcastReceiver.f3413b).putExtra(LoginFlowBroadcastReceiver.f3414c, Event.ACCOUNT_VERIFIED_COMPLETE));
                this.f3458b.f13085h = null;
                this.f3458b.f13086i = null;
            }
        };
        this.f13085h.postDelayed(this.f13086i, DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    }

    /* renamed from: a */
    protected void mo3256a() {
        C1219a.m4285e(true);
    }

    /* renamed from: b */
    public void mo1631b(Activity activity) {
        m16145g();
        super.mo1631b(activity);
    }

    /* renamed from: b */
    public C4127h mo3259b() {
        if (this.f13079a == null) {
            mo3270a(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13079a;
    }

    /* renamed from: a */
    public void mo3270a(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13079a = (C4351a) c4127h;
        }
    }

    /* renamed from: b */
    public void mo3260b(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13080b = (C4351a) c4127h;
        }
    }

    /* renamed from: a */
    public void mo3258a(@Nullable C4132a c4132a) {
        this.f13081c = c4132a;
    }

    /* renamed from: c */
    public C4132a mo3272c() {
        if (this.f13082d == null) {
            mo3271b(C1328z.m4644a(this.e.getUIManager(), C1194g.com_accountkit_account_verified, new String[0]));
        }
        return this.f13082d;
    }

    /* renamed from: b */
    public void mo3271b(@Nullable C4132a c4132a) {
        this.f13082d = c4132a;
    }

    /* renamed from: d */
    public LoginFlowState mo3261d() {
        return LoginFlowState.ACCOUNT_VERIFIED;
    }

    /* renamed from: e */
    public C4127h mo3262e() {
        if (this.f13083f == null) {
            this.f13083f = C1327y.m4641a(this.e.getUIManager(), mo3261d());
        }
        return this.f13083f;
    }

    /* renamed from: f */
    public C4127h mo3263f() {
        if (this.f13084g == null) {
            mo3273c(C1327y.m4641a(this.e.getUIManager(), mo3261d()));
        }
        return this.f13084g;
    }

    /* renamed from: c */
    public void mo3273c(@Nullable C4127h c4127h) {
        if (c4127h instanceof C4351a) {
            this.f13084g = (C4351a) c4127h;
        }
    }

    /* renamed from: g */
    private void m16145g() {
        if (this.f13085h != null && this.f13086i != null) {
            this.f13085h.removeCallbacks(this.f13086i);
            this.f13086i = null;
            this.f13085h = null;
        }
    }
}
