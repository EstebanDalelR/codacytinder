package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.C1432i;

public class ac extends BroadcastReceiver {
    /* renamed from: a */
    private String f3624a;
    /* renamed from: b */
    private ab f3625b;
    /* renamed from: c */
    private aa f3626c;

    public ac(String str, aa aaVar, ab abVar) {
        this.f3626c = aaVar;
        this.f3625b = abVar;
        this.f3624a = str;
    }

    /* renamed from: a */
    public IntentFilter m4726a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C1432i.REWARDED_VIDEO_COMPLETE.m5006a(this.f3624a));
        intentFilter.addAction(C1432i.REWARDED_VIDEO_ERROR.m5006a(this.f3624a));
        intentFilter.addAction(C1432i.REWARDED_VIDEO_AD_CLICK.m5006a(this.f3624a));
        intentFilter.addAction(C1432i.REWARDED_VIDEO_IMPRESSION.m5006a(this.f3624a));
        intentFilter.addAction(C1432i.REWARDED_VIDEO_CLOSED.m5006a(this.f3624a));
        intentFilter.addAction(C1432i.REWARD_SERVER_SUCCESS.m5006a(this.f3624a));
        intentFilter.addAction(C1432i.REWARD_SERVER_FAILED.m5006a(this.f3624a));
        return intentFilter;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (C1432i.REWARDED_VIDEO_COMPLETE.m5006a(this.f3624a).equals(action)) {
            this.f3625b.mo1706d(this.f3626c);
        } else if (C1432i.REWARDED_VIDEO_ERROR.m5006a(this.f3624a).equals(action)) {
            this.f3625b.mo1703a(this.f3626c, AdError.INTERNAL_ERROR);
        } else if (C1432i.REWARDED_VIDEO_AD_CLICK.m5006a(this.f3624a).equals(action)) {
            this.f3625b.mo1704b(this.f3626c);
        } else if (C1432i.REWARDED_VIDEO_IMPRESSION.m5006a(this.f3624a).equals(action)) {
            this.f3625b.mo1705c(this.f3626c);
        } else if (C1432i.REWARDED_VIDEO_CLOSED.m5006a(this.f3624a).equals(action)) {
            this.f3625b.mo1701a();
        } else if (C1432i.REWARD_SERVER_FAILED.m5006a(this.f3624a).equals(action)) {
            this.f3625b.mo1707e(this.f3626c);
        } else {
            if (C1432i.REWARD_SERVER_SUCCESS.m5006a(this.f3624a).equals(action)) {
                this.f3625b.mo1708f(this.f3626c);
            }
        }
    }
}
