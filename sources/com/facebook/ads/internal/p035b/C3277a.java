package com.facebook.ads.internal.p035b;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.ads.internal.p047k.ag;
import com.facebook.ads.internal.p049l.C1517a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.b.a */
public final class C3277a implements ag<Bundle> {
    /* renamed from: a */
    private final View f10026a;
    /* renamed from: b */
    private final List<C3278d> f10027b;
    /* renamed from: c */
    private final Context f10028c;
    /* renamed from: d */
    private C1372c f10029d;

    public C3277a(Context context, View view, List<C1370b> list) {
        this.f10028c = context;
        this.f10026a = view;
        this.f10027b = new ArrayList(list.size());
        for (C1370b c3278d : list) {
            this.f10027b.add(new C3278d(c3278d));
        }
        this.f10029d = new C1372c();
    }

    public C3277a(Context context, View view, List<C1370b> list, Bundle bundle) {
        this.f10028c = context;
        this.f10026a = view;
        this.f10027b = new ArrayList(list.size());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("TESTS");
        for (int i = 0; i < list.size(); i++) {
            this.f10027b.add(new C3278d((C1370b) list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.f10029d = (C1372c) bundle.getSerializable("STATISTICS");
    }

    /* renamed from: a */
    public void m12636a() {
        this.f10029d.m4788a();
    }

    /* renamed from: a */
    public void m12637a(double d, double d2) {
        if (d2 >= 0.0d) {
            this.f10029d.m4791b(d, d2);
        }
        d2 = (double) C1517a.m5330a(this.f10026a, 0).m5356c();
        this.f10029d.m4789a(d, d2);
        for (C3278d a : this.f10027b) {
            a.m12642a(d, d2);
        }
    }

    /* renamed from: b */
    public C1372c m12638b() {
        return this.f10029d;
    }

    public Bundle getSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("STATISTICS", this.f10029d);
        ArrayList arrayList = new ArrayList(this.f10027b.size());
        for (C3278d saveInstanceState : this.f10027b) {
            arrayList.add(saveInstanceState.getSaveInstanceState());
        }
        bundle.putParcelableArrayList("TESTS", arrayList);
        return bundle;
    }
}
