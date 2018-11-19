package com.tinder.managers;

import android.content.Context;
import com.tinder.module.ForApplication;
import com.tinder.utils.C15374w;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class bq {
    /* renamed from: a */
    public boolean f8351a;
    /* renamed from: b */
    public int f8352b;
    /* renamed from: c */
    public int f8353c;
    /* renamed from: d */
    private final bk f8354d;
    /* renamed from: e */
    private final Context f8355e;

    @Inject
    public bq(bk bkVar, @ForApplication Context context) {
        this.f8354d = bkVar;
        this.f8355e = context;
    }

    /* renamed from: a */
    public void m10147a() {
        this.f8352b = this.f8354d.m14972g();
        this.f8353c = C15374w.a(this.f8355e);
        boolean z = this.f8353c > this.f8352b && this.f8352b != 0;
        this.f8351a = z;
        this.f8354d.m14955a(this.f8353c);
    }
}
