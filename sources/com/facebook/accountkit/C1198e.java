package com.facebook.accountkit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.C0436c;
import com.facebook.accountkit.internal.C1220c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.accountkit.e */
public abstract class C1198e {
    /* renamed from: a */
    private boolean f3186a = false;
    /* renamed from: b */
    private boolean f3187b = false;
    /* renamed from: c */
    private final List<Intent> f3188c = new ArrayList();
    /* renamed from: d */
    private final BroadcastReceiver f3189d = new C1197a(this);

    /* renamed from: com.facebook.accountkit.e$a */
    private static class C1197a extends BroadcastReceiver {
        /* renamed from: a */
        final WeakReference<C1198e> f3185a;

        C1197a(C1198e c1198e) {
            this.f3185a = new WeakReference(c1198e);
        }

        public void onReceive(Context context, Intent intent) {
            C1198e c1198e = (C1198e) this.f3185a.get();
            if (c1198e != null && c1198e.mo1563a().contains(intent.getAction())) {
                if (c1198e.m4140f()) {
                    c1198e.f3188c.add(intent);
                } else if (c1198e.m4141g()) {
                    c1198e.mo1564a(intent);
                }
            }
        }
    }

    /* renamed from: a */
    protected abstract List<String> mo1563a();

    /* renamed from: a */
    protected abstract void mo1564a(Intent intent);

    /* renamed from: h */
    protected boolean mo1635h() {
        return true;
    }

    /* renamed from: c */
    public void m4137c() {
        if (!this.f3187b) {
            this.f3187b = true;
            mo1565b();
        }
        if (this.f3186a) {
            this.f3186a = false;
            ArrayList arrayList = new ArrayList(this.f3188c);
            this.f3188c.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Intent intent = (Intent) it.next();
                if (m4141g()) {
                    mo1564a(intent);
                }
            }
        }
    }

    /* renamed from: d */
    public void m4138d() {
        if (this.f3187b) {
            this.f3187b = false;
            m4132a(this.f3189d);
            this.f3188c.clear();
        }
    }

    /* renamed from: e */
    public void m4139e() {
        this.f3186a = true;
    }

    /* renamed from: f */
    public boolean m4140f() {
        return this.f3186a;
    }

    /* renamed from: g */
    public boolean m4141g() {
        return this.f3187b;
    }

    /* renamed from: b */
    private void mo1565b() {
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : mo1563a()) {
            intentFilter.addAction(addAction);
        }
        m4133a(this.f3189d, intentFilter);
    }

    /* renamed from: a */
    private void m4133a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Context a = C1220c.m4288a();
        if (mo1635h()) {
            C0436c.m1648a(a).m1652a(broadcastReceiver, intentFilter);
        } else {
            a.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* renamed from: a */
    private void m4132a(BroadcastReceiver broadcastReceiver) {
        Context a = C1220c.m4288a();
        if (mo1635h()) {
            C0436c.m1648a(a).m1651a(broadcastReceiver);
        } else {
            a.unregisterReceiver(broadcastReceiver);
        }
    }
}
