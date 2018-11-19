package com.facebook.ads.internal.adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView.ScaleType;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.p047k.C1505r;
import com.facebook.ads.internal.p047k.C1506s;
import com.facebook.ads.internal.view.C1621x;
import com.facebook.ads.internal.view.C3372g;
import com.facebook.ads.internal.view.hscroll.C4443b;
import java.util.List;

/* renamed from: com.facebook.ads.internal.adapters.h */
public class C3257h extends Adapter<C3372g> {
    /* renamed from: a */
    private static final int f9977a = Color.argb(51, 0, 0, 0);
    /* renamed from: b */
    private final List<NativeAd> f9978b;
    /* renamed from: c */
    private final int f9979c;
    /* renamed from: d */
    private final int f9980d;

    public C3257h(C4443b c4443b, List<NativeAd> list) {
        float f = c4443b.getContext().getResources().getDisplayMetrics().density;
        this.f9978b = list;
        this.f9979c = Math.round(f * 1.0f);
        this.f9980d = c4443b.getChildSpacing();
    }

    /* renamed from: a */
    public C3372g m12526a(ViewGroup viewGroup, int i) {
        C1621x c1621x = new C1621x(viewGroup.getContext());
        c1621x.setScaleType(ScaleType.CENTER_CROP);
        return new C3372g(c1621x);
    }

    /* renamed from: a */
    public void m12527a(final C3372g c3372g, int i) {
        LayoutParams marginLayoutParams = new MarginLayoutParams(-2, -1);
        marginLayoutParams.setMargins(i == 0 ? this.f9980d * 2 : this.f9980d, 0, i >= this.f9978b.size() - 1 ? this.f9980d * 2 : this.f9980d, 0);
        c3372g.f10251a.setBackgroundColor(0);
        c3372g.f10251a.setImageDrawable(null);
        c3372g.f10251a.setLayoutParams(marginLayoutParams);
        c3372g.f10251a.setPadding(this.f9979c, this.f9979c, this.f9979c, this.f9979c);
        NativeAd nativeAd = (NativeAd) this.f9978b.get(i);
        nativeAd.registerViewForInteraction(c3372g.f10251a);
        if (nativeAd.getAdCoverImage() != null) {
            C1505r c1505r = new C1505r(c3372g.f10251a);
            c1505r.m5299a(new C1506s(this) {
                /* renamed from: b */
                final /* synthetic */ C3257h f9976b;

                /* renamed from: a */
                public void mo1724a() {
                    c3372g.f10251a.setBackgroundColor(C3257h.f9977a);
                }
            });
            c1505r.m5301a(r9.getUrl());
        }
    }

    public int getItemCount() {
        return this.f9978b.size();
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        m12527a((C3372g) viewHolder, i);
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m12526a(viewGroup, i);
    }
}
