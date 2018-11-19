package com.snapchat.kit.sdk.bitmoji.p143a.p144a;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.FragmentScope;
import java.util.Date;
import java.util.UUID;
import javax.inject.Inject;
import org.apache.commons.lang3.C15987b;

@FragmentScope
/* renamed from: com.snapchat.kit.sdk.bitmoji.a.a.f */
public class C5888f {
    /* renamed from: a */
    private String f21579a = null;
    /* renamed from: b */
    private Date f21580b;
    /* renamed from: c */
    private Date f21581c;
    /* renamed from: d */
    private Date f21582d;
    /* renamed from: e */
    private String f21583e;

    @Inject
    C5888f() {
    }

    /* renamed from: a */
    public void m25414a() {
        if (C15987b.a(this.f21579a) || this.f21581c == null || !C5888f.m25412a(this.f21580b)) {
            this.f21583e = C5888f.m25413f();
            this.f21582d = new Date();
            return;
        }
        this.f21583e = this.f21579a;
        this.f21582d = this.f21581c;
    }

    /* renamed from: b */
    public void m25416b() {
        m25415a(this.f21583e, this.f21582d, new Date());
        this.f21583e = null;
        this.f21582d = null;
    }

    /* renamed from: c */
    public String m25417c() {
        return this.f21583e;
    }

    @Nullable
    /* renamed from: d */
    public Date m25418d() {
        return this.f21582d;
    }

    @VisibleForTesting
    /* renamed from: a */
    void m25415a(String str, Date date, Date date2) {
        this.f21579a = str;
        this.f21581c = date;
        this.f21580b = date2;
    }

    /* renamed from: e */
    public boolean m25419e() {
        return this.f21583e != null;
    }

    /* renamed from: f */
    private static String m25413f() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    private static boolean m25412a(Date date) {
        return (date == null || System.currentTimeMillis() - date.getTime() >= 15000) ? null : true;
    }
}
