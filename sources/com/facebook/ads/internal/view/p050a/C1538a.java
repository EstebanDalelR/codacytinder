package com.facebook.ads.internal.view.p050a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.facebook.ads.internal.p047k.C1507t;
import com.facebook.ads.internal.p047k.C1510w;
import java.util.List;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.a.a */
public class C1538a extends LinearLayout {
    /* renamed from: a */
    private static final int f4296a = Color.rgb(224, 224, 224);
    /* renamed from: b */
    private static final Uri f4297b = Uri.parse("http://www.facebook.com");
    /* renamed from: c */
    private static final OnTouchListener f4298c = new C15341();
    /* renamed from: d */
    private static final int f4299d = Color.argb(34, 0, 0, 0);
    /* renamed from: e */
    private ImageView f4300e;
    /* renamed from: f */
    private C1540c f4301f;
    /* renamed from: g */
    private ImageView f4302g;
    /* renamed from: h */
    private C1537a f4303h;
    /* renamed from: i */
    private String f4304i;

    /* renamed from: com.facebook.ads.internal.view.a.a$1 */
    static class C15341 implements OnTouchListener {
        C15341() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    view.setBackgroundColor(C1538a.f4299d);
                    return false;
                case 1:
                    view.setBackgroundColor(0);
                    return false;
                default:
                    return false;
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.a.a$2 */
    class C15352 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1538a f4294a;

        C15352(C1538a c1538a) {
            this.f4294a = c1538a;
        }

        public void onClick(View view) {
            if (this.f4294a.f4303h != null) {
                this.f4294a.f4303h.mo1818a();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.a.a$3 */
    class C15363 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1538a f4295a;

        C15363(C1538a c1538a) {
            this.f4295a = c1538a;
        }

        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f4295a.f4304i) && !"about:blank".equals(this.f4295a.f4304i)) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f4295a.f4304i));
                intent.addFlags(268435456);
                this.f4295a.getContext().startActivity(intent);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.a.a$a */
    public interface C1537a {
        /* renamed from: a */
        void mo1818a();
    }

    public C1538a(Context context) {
        super(context);
        m5400a(context);
    }

    /* renamed from: a */
    private void m5400a(Context context) {
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (50.0f * f);
        int i2 = (int) (f * 4.0f);
        setBackgroundColor(-1);
        setGravity(16);
        this.f4300e = new ImageView(context);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        this.f4300e.setScaleType(ScaleType.CENTER);
        this.f4300e.setImageBitmap(C1510w.m5311a(context, C1507t.BROWSER_CLOSE));
        this.f4300e.setOnTouchListener(f4298c);
        this.f4300e.setOnClickListener(new C15352(this));
        addView(this.f4300e, layoutParams);
        this.f4301f = new C1540c(context);
        layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        this.f4301f.setPadding(0, i2, 0, i2);
        addView(this.f4301f, layoutParams);
        this.f4302g = new ImageView(context);
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        this.f4302g.setScaleType(ScaleType.CENTER);
        this.f4302g.setOnTouchListener(f4298c);
        this.f4302g.setOnClickListener(new C15363(this));
        addView(this.f4302g, layoutParams2);
        setupDefaultNativeBrowser(context);
    }

    private void setupDefaultNativeBrowser(Context context) {
        Bitmap bitmap;
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", f4297b), 65536);
        if (queryIntentActivities.size() == 0) {
            this.f4302g.setVisibility(8);
            bitmap = null;
        } else {
            C1507t c1507t = (queryIntentActivities.size() == 1 && "com.android.chrome".equals(((ResolveInfo) queryIntentActivities.get(0)).activityInfo.packageName)) ? C1507t.BROWSER_LAUNCH_CHROME : C1507t.BROWSER_LAUNCH_NATIVE;
            bitmap = C1510w.m5311a(context, c1507t);
        }
        this.f4302g.setImageBitmap(bitmap);
    }

    public void setListener(C1537a c1537a) {
        this.f4303h = c1537a;
    }

    public void setTitle(String str) {
        this.f4301f.setTitle(str);
    }

    public void setUrl(String str) {
        this.f4304i = str;
        if (!TextUtils.isEmpty(str)) {
            if (!"about:blank".equals(str)) {
                this.f4301f.setSubtitle(str);
                this.f4302g.setEnabled(true);
                this.f4302g.setColorFilter(null);
                return;
            }
        }
        this.f4301f.setSubtitle(null);
        this.f4302g.setEnabled(false);
        this.f4302g.setColorFilter(new PorterDuffColorFilter(f4296a, Mode.SRC_IN));
    }
}
