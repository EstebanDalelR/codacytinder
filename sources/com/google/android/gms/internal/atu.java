package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

@zzzv
public final class atu extends atv implements zzt<zzanh> {
    /* renamed from: a */
    private final zzanh f23150a;
    /* renamed from: b */
    private final Context f23151b;
    /* renamed from: c */
    private final WindowManager f23152c;
    /* renamed from: d */
    private final ala f23153d;
    /* renamed from: e */
    private DisplayMetrics f23154e;
    /* renamed from: f */
    private float f23155f;
    /* renamed from: g */
    private int f23156g = -1;
    /* renamed from: h */
    private int f23157h = -1;
    /* renamed from: i */
    private int f23158i;
    /* renamed from: j */
    private int f23159j = -1;
    /* renamed from: k */
    private int f23160k = -1;
    /* renamed from: l */
    private int f23161l = -1;
    /* renamed from: m */
    private int f23162m = -1;

    public atu(zzanh zzanh, Context context, ala ala) {
        super(zzanh);
        this.f23150a = zzanh;
        this.f23151b = context;
        this.f23153d = ala;
        this.f23152c = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final void m27251a(int i, int i2) {
        int i3 = 0;
        if (this.f23151b instanceof Activity) {
            i3 = ar.e().m19758c((Activity) this.f23151b)[0];
        }
        if (this.f23150a.zzsx() == null || !this.f23150a.zzsx().m20048d()) {
            aja.m19216a();
            this.f23161l = hn.m19871b(this.f23151b, this.f23150a.getWidth());
            aja.m19216a();
            this.f23162m = hn.m19871b(this.f23151b, this.f23150a.getHeight());
        }
        m19489b(i, i2 - i3, this.f23161l, this.f23162m);
        this.f23150a.zzsz().m19996a(i, i2);
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int b;
        int[] iArr;
        int b2;
        this.f23154e = new DisplayMetrics();
        Display defaultDisplay = this.f23152c.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f23154e);
        this.f23155f = this.f23154e.density;
        this.f23158i = defaultDisplay.getRotation();
        aja.m19216a();
        this.f23156g = hn.m19872b(this.f23154e, this.f23154e.widthPixels);
        aja.m19216a();
        this.f23157h = hn.m19872b(this.f23154e, this.f23154e.heightPixels);
        Activity zzsi = this.f23150a.zzsi();
        if (zzsi != null) {
            if (zzsi.getWindow() != null) {
                ar.e();
                int[] a = fk.m19710a(zzsi);
                aja.m19216a();
                this.f23159j = hn.m19872b(this.f23154e, a[0]);
                aja.m19216a();
                b = hn.m19872b(this.f23154e, a[1]);
                this.f23160k = b;
                if (this.f23150a.zzsx().m20048d()) {
                    this.f23150a.measure(0, 0);
                } else {
                    this.f23161l = this.f23156g;
                    this.f23162m = this.f23157h;
                }
                m19487a(this.f23156g, this.f23157h, this.f23159j, this.f23160k, this.f23155f, this.f23158i);
                this.f23150a.zza("onDeviceFeaturesReceived", new atr(new att().m19482b(this.f23153d.m19309a()).m19481a(this.f23153d.m19310b()).m19483c(this.f23153d.m19312d()).m19484d(this.f23153d.m19311c()).m19485e(true)).m19475a());
                iArr = new int[2];
                this.f23150a.getLocationOnScreen(iArr);
                aja.m19216a();
                b2 = hn.m19871b(this.f23151b, iArr[0]);
                aja.m19216a();
                m27251a(b2, hn.m19871b(this.f23151b, iArr[1]));
                if (hx.m19910a(2)) {
                    hx.m19915d("Dispatching Ready Event.");
                }
                m19490b(this.f23150a.zzsk().zzcv);
            }
        }
        this.f23159j = this.f23156g;
        b = this.f23157h;
        this.f23160k = b;
        if (this.f23150a.zzsx().m20048d()) {
            this.f23150a.measure(0, 0);
        } else {
            this.f23161l = this.f23156g;
            this.f23162m = this.f23157h;
        }
        m19487a(this.f23156g, this.f23157h, this.f23159j, this.f23160k, this.f23155f, this.f23158i);
        this.f23150a.zza("onDeviceFeaturesReceived", new atr(new att().m19482b(this.f23153d.m19309a()).m19481a(this.f23153d.m19310b()).m19483c(this.f23153d.m19312d()).m19484d(this.f23153d.m19311c()).m19485e(true)).m19475a());
        iArr = new int[2];
        this.f23150a.getLocationOnScreen(iArr);
        aja.m19216a();
        b2 = hn.m19871b(this.f23151b, iArr[0]);
        aja.m19216a();
        m27251a(b2, hn.m19871b(this.f23151b, iArr[1]));
        if (hx.m19910a(2)) {
            hx.m19915d("Dispatching Ready Event.");
        }
        m19490b(this.f23150a.zzsk().zzcv);
    }
}
