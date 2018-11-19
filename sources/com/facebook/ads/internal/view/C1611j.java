package com.facebook.ads.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.C1359i;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1505r;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1604d.C1603a;
import com.facebook.ads.internal.view.component.C1602h;
import com.facebook.ads.internal.view.component.C4189a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.j */
public class C1611j extends RelativeLayout {
    /* renamed from: a */
    private final Paint f4456a;
    /* renamed from: b */
    private final float f4457b;
    /* renamed from: c */
    private final float f4458c;
    /* renamed from: d */
    private final float f4459d;
    /* renamed from: e */
    private LinearLayout f4460e;
    /* renamed from: f */
    private C1602h f4461f;
    /* renamed from: g */
    private C4189a f4462g;
    /* renamed from: h */
    private C1621x f4463h;
    /* renamed from: i */
    private C1425f f4464i;
    /* renamed from: j */
    private C1603a f4465j;
    /* renamed from: k */
    private final String f4466k;

    public C1611j(Context context, C1359i c1359i, boolean z, C1425f c1425f, C1603a c1603a, String str) {
        super(context);
        this.f4464i = c1425f;
        this.f4465j = c1603a;
        this.f4466k = str;
        float f = getResources().getDisplayMetrics().density;
        this.f4457b = 1.0f * f;
        this.f4459d = 4.0f * f;
        this.f4458c = 6.0f * f;
        setGravity(17);
        setPadding((int) this.f4457b, 0, (int) this.f4457b, (int) this.f4457b);
        an.m5204a((View) this, 0);
        if (z) {
            m5489b(context, f, c1359i);
        } else {
            m5488a(context, f, c1359i);
        }
        this.f4456a = new Paint();
        this.f4456a.setColor(-16777216);
        this.f4456a.setStyle(Style.FILL);
        this.f4456a.setAlpha(16);
        this.f4456a.setAntiAlias(true);
    }

    /* renamed from: a */
    private void m5488a(Context context, float f, C1359i c1359i) {
        Context context2 = context;
        this.f4463h = new C1621x(context2);
        this.f4463h.setLayoutParams(new LayoutParams(-1, -2));
        an.m5203a(this.f4463h);
        this.f4461f = new C1602h(context2, c1359i, false, false, true);
        this.f4461f.setAlignment(3);
        this.f4461f.setLayoutParams(new LayoutParams(-1, -2));
        this.f4461f.setPadding(0, 0, 0, (int) (20.0f * f));
        this.f4462g = new C4189a(context2, true, false, c1359i, this.f4464i, this.f4465j);
        this.f4462g.setLayoutParams(new LayoutParams(-1, -2));
        this.f4460e = new LinearLayout(context2);
        if (VERSION.SDK_INT >= 16) {
            r0.f4460e.setBackground(new ColorDrawable(-1));
        } else {
            r0.f4460e.setBackgroundDrawable(new ColorDrawable(-1));
        }
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(3, r0.f4463h.getId());
        r0.f4460e.setLayoutParams(layoutParams);
        r0.f4460e.setOrientation(1);
        int i = (int) (16.0f * f);
        r0.f4460e.setPadding(i, i, i, i);
        r0.f4460e.addView(r0.f4461f);
        r0.f4460e.addView(r0.f4462g);
        addView(r0.f4463h);
        addView(r0.f4460e);
    }

    /* renamed from: b */
    private void m5489b(Context context, float f, C1359i c1359i) {
        C1621x c1621x;
        int generateViewId;
        this.f4463h = new C1621x(context);
        this.f4463h.setLayoutParams(new LayoutParams(-1, -2));
        if (VERSION.SDK_INT >= 17) {
            c1621x = this.f4463h;
            generateViewId = View.generateViewId();
        } else {
            c1621x = this.f4463h;
            generateViewId = an.m5201a();
        }
        c1621x.setId(generateViewId);
        this.f4461f = new C1602h(context, c1359i, true, true, true);
        this.f4461f.setAlignment(3);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(8, this.f4463h.getId());
        int i = (int) (f * 12.0f);
        this.f4461f.setLayoutParams(layoutParams);
        this.f4461f.setPadding(i, i, i, i);
        Drawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        an.m5205a(this.f4461f, gradientDrawable);
        this.f4462g = new C4189a(context, false, false, c1359i, this.f4464i, this.f4465j);
        ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.f4463h.getId());
        this.f4462g.setLayoutParams(layoutParams2);
        addView(this.f4463h);
        addView(this.f4461f);
        addView(this.f4462g);
    }

    /* renamed from: a */
    public void m5490a(String str, String str2) {
        this.f4461f.m5467a(str, str2, true, false);
    }

    /* renamed from: a */
    public void m5491a(String str, String str2, Map<String, String> map) {
        this.f4462g.m16594a(str, str2, this.f4466k, map);
    }

    protected void onDraw(Canvas canvas) {
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), this.f4458c, this.f4458c, Direction.CW);
        canvas.drawPath(path, this.f4456a);
        path = new Path();
        path.addRoundRect(new RectF(this.f4457b, 0.0f, ((float) getWidth()) - this.f4457b, ((float) getHeight()) - this.f4457b), this.f4459d, this.f4459d, Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    public void setImageUrl(String str) {
        new C1505r(this.f4463h).m5301a(str);
    }
}
