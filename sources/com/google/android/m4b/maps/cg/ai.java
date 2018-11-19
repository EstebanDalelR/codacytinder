package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.RelativeLayout;
import com.google.android.m4b.maps.C4513R;

public final class ai {
    /* renamed from: a */
    private final aj f19040a;
    /* renamed from: b */
    private final View f19041b;

    /* renamed from: com.google.android.m4b.maps.cg.ai$1 */
    class C51261 implements OnItemClickListener {
        /* renamed from: a */
        private /* synthetic */ ai f19039a;

        C51261(ai aiVar) {
            this.f19039a = aiVar;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f19039a.f19040a.m29486a(i);
        }
    }

    private ai(aj ajVar, View view) {
        this.f19040a = ajVar;
        this.f19041b = view;
    }

    /* renamed from: a */
    public static ai m22844a(Context context, Resources resources) {
        View ajVar = new aj(context, resources);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(C4513R.dimen.maps_btn_width), -2);
        layoutParams.addRule(15);
        ajVar.setLayoutParams(layoutParams);
        ajVar.setBackgroundDrawable(resources.getDrawable(C4513R.drawable.maps_fproundcorner));
        ajVar.setCacheColorHint(0);
        ajVar.setChoiceMode(1);
        ajVar.setDivider(new ColorDrawable(0));
        ajVar.setVerticalScrollBarEnabled(false);
        ajVar.setScrollingCacheEnabled(true);
        ajVar.setSmoothScrollbarEnabled(true);
        ajVar.setVisibility(8);
        View relativeLayout = new RelativeLayout(context);
        relativeLayout.addView(ajVar);
        relativeLayout.setVisibility(8);
        context = new ai(ajVar, relativeLayout);
        context.f19040a.setOnItemClickListener(new C51261(context));
        return context;
    }

    /* renamed from: a */
    public final void m22847a(int i) {
        this.f19041b.setVisibility(i);
    }

    /* renamed from: a */
    public final void m22848a(ac acVar) {
        this.f19040a.m29487a(acVar);
    }

    /* renamed from: a */
    public final View m22846a() {
        return this.f19041b;
    }
}
