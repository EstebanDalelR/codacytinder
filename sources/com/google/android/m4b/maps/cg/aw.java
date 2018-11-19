package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.BaseAdapter;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import java.util.List;

public final class aw extends au {
    /* renamed from: d */
    private static final int f24770d = Color.parseColor("#E2E2E2");
    /* renamed from: e */
    private final List<as> f24771e;
    /* renamed from: f */
    private ListView f24772f;

    /* renamed from: com.google.android.m4b.maps.cg.aw$a */
    class C5141a extends BaseAdapter {
        /* renamed from: a */
        final /* synthetic */ aw f19079a;

        public final long getItemId(int i) {
            return (long) i;
        }

        private C5141a(aw awVar) {
            this.f19079a = awVar;
        }

        public final int getCount() {
            return this.f19079a.f24771e.size();
        }

        public final Object getItem(int i) {
            return this.f19079a.f24771e.get(i);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.View getView(final int r9, android.view.View r10, android.view.ViewGroup r11) {
            /*
            r8 = this;
            r11 = 2;
            r0 = 0;
            r1 = 0;
            if (r10 == 0) goto L_0x0022;
        L_0x0005:
            r2 = r10 instanceof android.widget.FrameLayout;
            if (r2 == 0) goto L_0x0022;
        L_0x0009:
            r10 = (android.widget.FrameLayout) r10;
            r2 = r10.getChildCount();
            if (r2 != r11) goto L_0x0020;
        L_0x0011:
            r2 = r10.getChildAt(r1);
            r2 = r2 instanceof android.webkit.WebView;
            if (r2 == 0) goto L_0x0020;
        L_0x0019:
            r2 = r10.getChildAt(r1);
            r2 = (android.webkit.WebView) r2;
            goto L_0x0024;
        L_0x0020:
            r2 = r0;
            goto L_0x0024;
        L_0x0022:
            r10 = r0;
            r2 = r10;
        L_0x0024:
            if (r10 == 0) goto L_0x002a;
        L_0x0026:
            if (r2 == 0) goto L_0x002a;
        L_0x0028:
            goto L_0x00bb;
        L_0x002a:
            r10 = new android.widget.FrameLayout;
            r2 = r8.f19079a;
            r2 = r2.a;
            r10.<init>(r2);
            r2 = new android.widget.AbsListView$LayoutParams;
            r3 = r8.f19079a;
            r4 = 1116733440; // 0x42900000 float:72.0 double:5.517396283E-315;
            r3 = r3.m22893a(r4);
            r5 = -2;
            r2.<init>(r5, r3);
            r10.setLayoutParams(r2);
            r2 = new android.widget.FrameLayout$LayoutParams;
            r3 = r8.f19079a;
            r3 = r3.m22893a(r4);
            r2.<init>(r5, r3);
            r3 = new android.webkit.WebView;
            r6 = r8.f19079a;
            r6 = r6.a;
            r3.<init>(r6);
            r3.setVerticalScrollBarEnabled(r1);
            r3.setHorizontalScrollBarEnabled(r1);
            r3.setLayoutParams(r2);
            r10.addView(r3);
            r1 = new android.widget.RelativeLayout;
            r2 = r8.f19079a;
            r2 = r2.a;
            r1.<init>(r2);
            r2 = new android.widget.FrameLayout$LayoutParams;
            r6 = r8.f19079a;
            r4 = r6.m22893a(r4);
            r2.<init>(r5, r4);
            r1.setLayoutParams(r2);
            r2 = 1;
            r1.setClickable(r2);
            r2 = new com.google.android.m4b.maps.cg.aw$a$1;
            r2.<init>(r8, r9);
            r1.setOnClickListener(r2);
            r2 = new android.view.View;
            r4 = r8.f19079a;
            r4 = r4.a;
            r2.<init>(r4);
            r4 = new android.widget.RelativeLayout$LayoutParams;
            r6 = r8.f19079a;
            r7 = 1094713344; // 0x41400000 float:12.0 double:5.408602553E-315;
            r6 = r6.m22893a(r7);
            r4.<init>(r5, r6);
            r5 = 12;
            r4.addRule(r5);
            r2.setLayoutParams(r4);
            r4 = new android.graphics.drawable.GradientDrawable;
            r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
            r11 = new int[r11];
            r11 = {0, -1};
            r4.<init>(r5, r11);
            r2.setBackgroundDrawable(r4);
            r1.addView(r2);
            r10.addView(r1);
            r2 = r3;
        L_0x00bb:
            r11 = r8.f19079a;
            r11 = r11.f24771e;
            r9 = r11.get(r9);
            r9 = (com.google.android.m4b.maps.cg.as) r9;
            r9 = r9.getDescription();
            r11 = "text/html; charset=UTF-8";
            r2.loadData(r9, r11, r0);
            return r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.aw.a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    public aw(Context context, Resources resources, av avVar, List<as> list) {
        super(context, resources, avVar);
        this.f24771e = list;
        resources = new ListView(context);
        resources.setAdapter(new C5141a());
        resources.setDivider(new ColorDrawable(f24770d));
        resources.setDividerHeight(m22893a(0.5f));
        context = new LayoutParams(0, -2);
        context.weight = 1.0f;
        list = m22893a(11.0f);
        context.setMargins(list, list, 0, list);
        resources.setLayoutParams(context);
        resources.setTag("GoogleMapMapsEngineInfolistListView");
        this.f24772f = resources;
        m22895a(resources, true);
    }

    /* renamed from: a */
    public final void m29497a(int i) {
        this.c.m22898a(i);
    }
}
