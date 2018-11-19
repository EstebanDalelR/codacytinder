package com.facebook.ads.internal.view.component.p055a;

import android.content.Context;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.C1359i;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1604d.C1603a;
import com.facebook.ads.internal.view.component.C1602h;
import com.facebook.ads.internal.view.component.C4189a;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.component.a.b */
public abstract class C1593b extends RelativeLayout {
    /* renamed from: a */
    static final int f4411a = ((int) (an.f4090b * 16.0f));
    /* renamed from: b */
    static final int f4412b = ((int) (an.f4090b * 28.0f));
    /* renamed from: c */
    private final C1602h f4413c;
    /* renamed from: d */
    private final C4189a f4414d;

    C1593b(Context context, C1425f c1425f, C1603a c1603a, C1359i c1359i, boolean z) {
        super(context);
        this.f4414d = new C4189a(context, true, mo1817c(), c1359i, c1425f, c1603a);
        an.m5203a(this.f4414d);
        this.f4413c = new C1602h(getContext(), c1359i, z, true, mo1816b());
        an.m5203a(this.f4413c);
    }

    /* renamed from: a */
    public void mo1815a(String str, String str2, String str3, String str4, String str5, double d) {
        C1602h c1602h = this.f4413c;
        boolean z = !mo1814a() && d > 0.0d && d < 1.0d;
        c1602h.m5467a(str, str2, false, z);
        this.f4414d.m16594a(str3, str4, str5, new HashMap());
    }

    /* renamed from: a */
    public abstract boolean mo1814a();

    /* renamed from: b */
    protected boolean mo1816b() {
        return true;
    }

    /* renamed from: c */
    protected boolean mo1817c() {
        return true;
    }

    C4189a getCtaButton() {
        return this.f4414d;
    }

    C1602h getTextContainer() {
        return this.f4413c;
    }
}
