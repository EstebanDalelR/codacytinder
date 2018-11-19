package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver;
import com.facebook.accountkit.UpdateFlowBroadcastReceiver.Event;
import com.facebook.accountkit.internal.C1220c.C1219a;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

/* renamed from: com.facebook.accountkit.ui.u */
final class C4350u extends C4131w {
    C4350u(AccountKitConfiguration accountKitConfiguration) {
        super(accountKitConfiguration);
    }

    /* renamed from: a */
    public void mo1630a(final Activity activity) {
        super.mo1630a(activity);
        m16227g();
        this.a = new Handler();
        this.b = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C4350u f3469b;

            public void run() {
                Intent intent = new Intent(UpdateFlowBroadcastReceiver.f3151a);
                intent.putExtra(UpdateFlowBroadcastReceiver.f3152b, Event.SENT_CODE_COMPLETE);
                C0436c.m1648a(activity).m1653a(intent);
                this.f3469b.a = null;
                this.f3469b.b = null;
            }
        };
        this.a.postDelayed(this.b, DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    }

    /* renamed from: a */
    protected void mo3256a() {
        C1219a.m4280c(true, LoginType.PHONE);
    }
}
