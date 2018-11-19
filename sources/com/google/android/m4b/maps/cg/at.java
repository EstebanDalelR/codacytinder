package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.m4b.maps.C4513R;

public final class at extends au {
    /* renamed from: d */
    private static final int f24766d = Color.parseColor("#4D4D4D");
    /* renamed from: e */
    private static final int f24767e = Color.parseColor("#E2E2E2");
    /* renamed from: f */
    private final as f24768f;
    /* renamed from: g */
    private View f24769g;

    /* renamed from: com.google.android.m4b.maps.cg.at$1 */
    class C51381 implements OnClickListener {
        /* renamed from: a */
        private /* synthetic */ at f19059a;

        C51381(at atVar) {
            this.f19059a = atVar;
        }

        public final void onClick(View view) {
            this.f19059a.c.m22897a();
        }
    }

    public at(Context context, Resources resources, av avVar, boolean z, as asVar) {
        super(context, resources, avVar);
        this.f24768f = asVar;
        if (z) {
            avVar = new LinearLayout(context);
            avVar.setLayoutParams(new LayoutParams(-1, -2));
            avVar.setOrientation(1);
            resources = new RelativeLayout(this.a);
            resources.setLayoutParams(new LayoutParams(-1, -2));
            z = new TextView(this.a);
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            int a = m22893a(11.0f);
            z.setPadding(a, a, a, a);
            z.setLayoutParams(layoutParams);
            z.setText(this.b.getString(C4513R.string.maps_BACK_TO_LIST));
            z.setTextColor(f24766d);
            z.setTextSize(16.0f);
            z.setTypeface(Typeface.DEFAULT_BOLD);
            z.setCompoundDrawablesWithIntrinsicBounds(this.b.getDrawable(C4513R.drawable.maps_btn_back), null, null, null);
            z.setOnClickListener(new C51381(this));
            this.f24769g = z;
            this.f24769g.setTag("GoogleMapMapsEngineInfocardBackButton");
            resources.addView(z);
            z = new RelativeLayout.LayoutParams(-2, -2);
            z.addRule(11);
            z.addRule(15);
            resources.addView(m22894a(), z);
            avVar.addView(resources);
            resources = new View(this.a);
            resources.setLayoutParams(new LayoutParams(-1, m22893a(true)));
            resources.setBackgroundColor(f24767e);
            avVar.addView(resources);
            avVar.addView(m29495a(context, false));
            m22895a(avVar, false);
            return;
        }
        m22895a(m29495a(context, true), true);
    }

    /* renamed from: a */
    private WebView m29495a(Context context, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        WebView webView = new WebView(context);
        if (z) {
            layoutParams = new LayoutParams(0, -2);
        } else {
            layoutParams = new LayoutParams(-2, 0);
        }
        layoutParams.weight = 1.0f;
        context = m22893a(11.0f);
        layoutParams.setMargins(context, context, z ? context : false, context);
        webView.setLayoutParams(layoutParams);
        webView.setFocusable(false);
        webView.loadData(this.f24768f.getDescription(), "text/html; charset=UTF-8", null);
        return webView;
    }
}
