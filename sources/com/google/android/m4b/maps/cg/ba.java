package com.google.android.m4b.maps.cg;

import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.cg.az.C5143a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p124x.C5540h;
import com.google.android.m4b.maps.p124x.C5547o;
import com.google.android.m4b.maps.p124x.C5554v;
import com.google.android.m4b.maps.p124x.C5555w;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.List;
import java.util.Map;

public class ba {
    /* renamed from: a */
    private static final String f19091a = "ba";
    /* renamed from: b */
    private int f19092b = 0;
    /* renamed from: c */
    private final Map<az, C5143a> f19093c = ax.m20628d();
    /* renamed from: d */
    private final C5176g f19094d;
    /* renamed from: e */
    private final cb f19095e;
    /* renamed from: f */
    private final C5145a f19096f;
    /* renamed from: g */
    private final aa f19097g;
    /* renamed from: h */
    private C5554v f19098h;
    /* renamed from: i */
    private C5555w f19099i;
    /* renamed from: j */
    private C5547o f19100j;
    /* renamed from: k */
    private C5540h f19101k;
    /* renamed from: l */
    private final ap f19102l;
    /* renamed from: m */
    private final ao f19103m;
    /* renamed from: n */
    private final boolean f19104n;
    /* renamed from: o */
    private final bf f19105o;
    /* renamed from: p */
    private final Resources f19106p;

    /* renamed from: com.google.android.m4b.maps.cg.ba$a */
    public interface C5145a {
        /* renamed from: a */
        C5143a mo4933a(az azVar);

        /* renamed from: d */
        List<az> mo4937d();
    }

    public ba(C5145a c5145a, C5540h c5540h, C5176g c5176g, aa aaVar, cb cbVar, ap apVar, ao aoVar, boolean z, bf bfVar, Resources resources) {
        this.f19096f = c5145a;
        this.f19101k = c5540h;
        this.f19094d = c5176g;
        this.f19097g = aaVar;
        this.f19095e = cbVar;
        this.f19102l = apVar;
        this.f19103m = aoVar;
        this.f19104n = z;
        this.f19105o = bfVar;
        this.f19106p = resources;
    }

    /* renamed from: a */
    public final az m22924a(MarkerOptions markerOptions) {
        this.f19097g.mo4875a();
        C5571j.m24298a(markerOptions.getPosition() != null, (Object) "no position in marker options");
        az azVar = new az(String.format("m%d", new Object[]{Integer.valueOf(this.f19092b)}), markerOptions, this, this.f19094d, this.f19097g, this.f19095e, this.f19106p);
        this.f19092b += 1;
        C5143a a = this.f19096f.mo4933a(azVar);
        azVar.m32866a(a);
        a.mo4940a();
        this.f19093c.put(azVar, a);
        return azVar;
    }

    /* renamed from: a */
    public final void m22926a(az azVar) {
        this.f19102l.m32829a(azVar);
        C5143a c5143a = (C5143a) this.f19093c.get(azVar);
        if (c5143a == null) {
            if (C4728u.m21050a(f19091a, 6)) {
                String str = f19091a;
                azVar = String.valueOf(azVar);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(azVar).length() + 35);
                stringBuilder.append("MarkerRenderer is null for Marker: ");
                stringBuilder.append(azVar);
                Log.e(str, stringBuilder.toString());
            }
            return;
        }
        c5143a.mo4942b();
        this.f19093c.remove(azVar);
    }

    /* renamed from: a */
    public final void m22925a() {
        this.f19097g.mo4875a();
        for (az a : this.f19093c.keySet()) {
            a.m32865a();
        }
        this.f19093c.clear();
    }

    /* renamed from: a */
    public final void m22928a(C5554v c5554v) {
        this.f19097g.mo4875a();
        this.f19098h = c5554v;
    }

    /* renamed from: a */
    public final void m22929a(C5555w c5555w) {
        this.f19097g.mo4875a();
        this.f19099i = c5555w;
    }

    /* renamed from: a */
    public final void m22927a(C5547o c5547o) {
        this.f19097g.mo4875a();
        this.f19100j = c5547o;
    }

    /* renamed from: b */
    public final boolean m22932b(az azVar) {
        return ((C5143a) this.f19093c.get(azVar)).mo4946f();
    }

    /* renamed from: c */
    final C5143a m22933c(az azVar) {
        C5143a c5143a = (C5143a) this.f19093c.get(azVar);
        if (c5143a != null) {
            return c5143a;
        }
        if (C4728u.m21050a(f19091a, 6)) {
            String str = f19091a;
            azVar = String.valueOf(azVar);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(azVar).length() + 35);
            stringBuilder.append("MarkerRenderer is null for Marker: ");
            stringBuilder.append(azVar);
            Log.e(str, stringBuilder.toString());
        }
        return null;
    }

    /* renamed from: d */
    public final void m22934d(az azVar) {
        if (this.f19099i != null) {
            try {
                ((C5143a) this.f19093c.get(azVar)).mo4945e();
                this.f19099i.mo5807a(azVar);
            } catch (az azVar2) {
                throw new RuntimeRemoteException(azVar2);
            }
        }
    }

    /* renamed from: e */
    public final void m22935e(az azVar) {
        if (this.f19099i != null) {
            try {
                ((C5143a) this.f19093c.get(azVar)).mo4945e();
                this.f19099i.mo5809c(azVar);
            } catch (az azVar2) {
                throw new RuntimeRemoteException(azVar2);
            }
        }
    }

    /* renamed from: f */
    public final void m22936f(az azVar) {
        if (this.f19099i != null) {
            try {
                ((C5143a) this.f19093c.get(azVar)).mo4945e();
                this.f19099i.mo5808b(azVar);
            } catch (az azVar2) {
                throw new RuntimeRemoteException(azVar2);
            }
        }
    }

    /* renamed from: g */
    public final boolean m22937g(az azVar) {
        try {
            if (this.f19098h == null) {
                this.f19095e.mo5310b(C5164a.MARKER_CLICK_WITHOUT_LISTENER);
            } else if (this.f19098h.mo5806a(azVar)) {
                this.f19095e.mo5310b(C5164a.MARKER_CLICK_WITH_INTERRUPTING_LISTENER);
                return true;
            } else {
                this.f19095e.mo5310b(C5164a.MARKER_CLICK_WITH_LISTENER);
            }
            azVar.showInfoWindow();
            if (!this.f19104n) {
                this.f19102l.m32832a(true, true, azVar, this.f19096f.mo4937d().size() > 1);
            }
            return false;
        } catch (az azVar2) {
            throw new RuntimeRemoteException(azVar2);
        }
    }

    /* renamed from: h */
    public final void m22938h(az azVar) {
        if (this.f19100j == null) {
            this.f19095e.mo5310b(C5164a.MARKER_INFO_WINDOW_CLICK_WITHOUT_LISTENER);
            return;
        }
        try {
            this.f19095e.mo5310b(C5164a.MARKER_INFO_WINDOW_CLICK_WITH_LISTENER);
            this.f19100j.mo5797a(azVar);
        } catch (az azVar2) {
            throw new RuntimeRemoteException(azVar2);
        }
    }

    /* renamed from: b */
    public final C5540h m22931b() {
        return this.f19101k;
    }

    /* renamed from: i */
    public final boolean m22939i(az azVar) {
        azVar = this.f19103m.mo5340e().mo4932e().mo4986a(azVar.getPosition());
        View d = this.f19103m.mo5339d();
        return (azVar.x < 0 || azVar.x >= d.getWidth() || azVar.y < 0 || azVar.y >= d.getHeight()) ? null : true;
    }

    /* renamed from: a */
    final void m22930a(boolean z) {
        for (az a : this.f19093c.keySet()) {
            a.m32868a(z);
        }
    }
}
