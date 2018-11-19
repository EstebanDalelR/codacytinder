package com.facebook.ads.internal.adapters;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.internal.adapters.C4144l.C1360a;
import com.facebook.ads.internal.p034a.C1349b;
import com.facebook.ads.internal.p047k.C1505r;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1604d;
import com.facebook.ads.internal.view.C1604d.C1603a;
import com.facebook.ads.internal.view.p051b.C1546a;
import com.facebook.ads.internal.view.p052c.p053b.C1582n;
import com.facebook.ads.internal.view.p052c.p053b.C3354d;
import com.facebook.ads.internal.view.p052c.p053b.C3354d.C1572a;
import com.facebook.ads.internal.view.p052c.p053b.C3359j;
import com.facebook.ads.internal.view.p052c.p053b.C3362p;
import com.facebook.ads.internal.view.p052c.p053b.C4157a.C1566a;
import com.facebook.ads.internal.view.p052c.p053b.C4167g;
import com.facebook.ads.internal.view.p052c.p053b.C4177k;
import com.facebook.ads.internal.view.p052c.p053b.C4181l;
import com.facebook.ads.internal.view.p052c.p080a.C3347t;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.m */
public class C4352m extends C4143k implements OnTouchListener, C1604d {
    /* renamed from: i */
    static final /* synthetic */ boolean f14259i = true;
    /* renamed from: j */
    private static final String f14260j = "m";
    /* renamed from: A */
    private int f14261A = -12286980;
    /* renamed from: B */
    private boolean f14262B = false;
    /* renamed from: f */
    final int f14263f = 64;
    /* renamed from: g */
    final int f14264g = 64;
    /* renamed from: h */
    final int f14265h = 16;
    @Nullable
    /* renamed from: k */
    private C1603a f14266k;
    @Nullable
    /* renamed from: l */
    private Activity f14267l;
    /* renamed from: m */
    private BackButtonInterceptor f14268m = new C32701(this);
    /* renamed from: n */
    private final OnTouchListener f14269n = new C13612(this);
    /* renamed from: o */
    private C1360a f14270o = C1360a.UNSPECIFIED;
    /* renamed from: p */
    private C1546a f14271p;
    /* renamed from: q */
    private TextView f14272q;
    /* renamed from: r */
    private TextView f14273r;
    /* renamed from: s */
    private ImageView f14274s;
    @Nullable
    /* renamed from: t */
    private C1566a f14275t;
    /* renamed from: u */
    private C3362p f14276u;
    /* renamed from: v */
    private ViewGroup f14277v;
    /* renamed from: w */
    private C3354d f14278w;
    /* renamed from: x */
    private C3359j f14279x;
    /* renamed from: y */
    private int f14280y = -1;
    /* renamed from: z */
    private int f14281z = -10525069;

    /* renamed from: com.facebook.ads.internal.adapters.m$2 */
    class C13612 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C4352m f3682a;

        C13612(C4352m c4352m) {
            this.f3682a = c4352m;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return C4352m.f14259i;
            }
            if (this.f3682a.f14279x != null) {
                if (!this.f3682a.f14279x.m12918a()) {
                    return C4352m.f14259i;
                }
                if (!(this.f3682a.f14279x.getSkipSeconds() == 0 || this.f3682a.b == null)) {
                    this.f3682a.b.m13063g();
                }
                if (this.f3682a.b != null) {
                    this.f3682a.b.m13064h();
                }
            }
            this.f3682a.f14267l.finish();
            return C4352m.f14259i;
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.m$1 */
    class C32701 implements BackButtonInterceptor {
        /* renamed from: a */
        final /* synthetic */ C4352m f10001a;

        C32701(C4352m c4352m) {
            this.f10001a = c4352m;
        }

        public boolean interceptBackButton() {
            if (this.f10001a.f14279x == null) {
                return false;
            }
            if (!this.f10001a.f14279x.m12918a()) {
                return C4352m.f14259i;
            }
            if (!(this.f10001a.f14279x.getSkipSeconds() == 0 || this.f10001a.b == null)) {
                this.f10001a.b.m13063g();
            }
            if (this.f10001a.b != null) {
                this.f10001a.b.m13064h();
            }
            return false;
        }
    }

    /* renamed from: a */
    private void m17730a(int i) {
        ViewGroup viewGroup;
        int i2;
        View linearLayout;
        int i3 = i;
        float f = this.d.getResources().getDisplayMetrics().density;
        int i4 = (int) (56.0f * f);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, i4);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i5 = (int) (16.0f * f);
        this.f14279x.setPadding(i5, i5, i5, i5);
        this.f14279x.setLayoutParams(layoutParams);
        C1572a c1572a = mo3703g() ? C1572a.FADE_OUT_ON_PLAY : C1572a.VISIBLE;
        int id = r0.b.getId();
        Drawable gradientDrawable;
        LayoutParams layoutParams2;
        int i6;
        if (i3 == 1 && (m17735l() || m17736m())) {
            gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
            gradientDrawable.setCornerRadius(0.0f);
            LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(10);
            r0.b.setLayoutParams(layoutParams3);
            m17731a(r0.b);
            m17731a(r0.f14279x);
            if (r0.f14275t != null) {
                m17731a(r0.f14275t);
            }
            layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (((float) (((((r0.f14271p != null ? 64 : 0) + 60) + 16) + 16) + 16)) * f));
            layoutParams3.addRule(12);
            View relativeLayout = new RelativeLayout(r0.d);
            if (VERSION.SDK_INT >= 16) {
                relativeLayout.setBackground(gradientDrawable);
            } else {
                relativeLayout.setBackgroundDrawable(gradientDrawable);
            }
            relativeLayout.setLayoutParams(layoutParams3);
            relativeLayout.setPadding(i5, 0, i5, (int) (((float) (((r0.f14271p != null ? 64 : 0) + 16) + 16)) * f));
            r0.f14277v = relativeLayout;
            if (!r0.f14262B) {
                r0.f14278w.m12893a(relativeLayout, c1572a);
            }
            m17731a(relativeLayout);
            if (r0.f14276u != null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (6.0f * f));
                layoutParams2.addRule(12);
                layoutParams2.topMargin = (int) (-6.0f * f);
                r0.f14276u.setLayoutParams(layoutParams2);
                m17731a(r0.f14276u);
            }
            if (r0.f14271p != null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (64.0f * f));
                layoutParams2.bottomMargin = i5;
                layoutParams2.leftMargin = i5;
                layoutParams2.rightMargin = i5;
                layoutParams2.addRule(1);
                layoutParams2.addRule(12);
                r0.f14271p.setLayoutParams(layoutParams2);
                m17731a(r0.f14271p);
            }
            if (r0.f14274s != null) {
                i6 = (int) (60.0f * f);
                layoutParams2 = new RelativeLayout.LayoutParams(i6, i6);
                layoutParams2.addRule(12);
                layoutParams2.addRule(9);
                r0.f14274s.setLayoutParams(layoutParams2);
                m17732a(relativeLayout, r0.f14274s);
            }
            if (r0.f14272q != null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.bottomMargin = (int) (36.0f * f);
                layoutParams2.addRule(12);
                layoutParams2.addRule(9);
                r0.f14272q.setEllipsize(TruncateAt.END);
                r0.f14272q.setGravity(8388611);
                r0.f14272q.setLayoutParams(layoutParams2);
                r0.f14272q.setMaxLines(1);
                r0.f14272q.setPadding((int) (72.0f * f), 0, 0, 0);
                r0.f14272q.setTextColor(-1);
                r0.f14272q.setTextSize(18.0f);
                m17732a(relativeLayout, r0.f14272q);
            }
            if (r0.f14273r != null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(12);
                layoutParams2.addRule(9);
                layoutParams2.bottomMargin = (int) (4.0f * f);
                r0.f14273r.setEllipsize(TruncateAt.END);
                r0.f14273r.setGravity(8388611);
                r0.f14273r.setLayoutParams(layoutParams2);
                r0.f14273r.setMaxLines(1);
                r0.f14273r.setPadding((int) (f * 72.0f), 0, 0, 0);
                r0.f14273r.setTextColor(-1);
                m17732a(relativeLayout, r0.f14273r);
            }
            viewGroup = (ViewGroup) r0.b.getParent();
            i2 = -16777216;
        } else {
            if (i3 == 1) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(10);
                r0.b.setLayoutParams(layoutParams2);
                m17731a(r0.b);
                m17731a(r0.f14279x);
                if (r0.f14275t != null) {
                    m17731a(r0.f14275t);
                }
                linearLayout = new LinearLayout(r0.d);
                r0.f14277v = linearLayout;
                linearLayout.setGravity(112);
                linearLayout.setOrientation(1);
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                i4 = (int) (33.0f * f);
                layoutParams.leftMargin = i4;
                layoutParams.rightMargin = i4;
                layoutParams.topMargin = (int) (8.0f * f);
                if (r0.f14271p == null) {
                    layoutParams.bottomMargin = i5;
                } else {
                    layoutParams.bottomMargin = (int) (f * 80.0f);
                }
                layoutParams.addRule(3, id);
                linearLayout.setLayoutParams(layoutParams);
                m17731a(linearLayout);
                if (r0.f14271p != null) {
                    layoutParams = new RelativeLayout.LayoutParams(-1, (int) (f * 64.0f));
                    layoutParams.bottomMargin = i5;
                    layoutParams.leftMargin = i4;
                    layoutParams.rightMargin = i4;
                    layoutParams.addRule(1);
                    layoutParams.addRule(12);
                    r0.f14271p.setLayoutParams(layoutParams);
                    m17731a(r0.f14271p);
                }
                if (r0.f14272q != null) {
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.weight = 2.0f;
                    layoutParams.gravity = 17;
                    r0.f14272q.setEllipsize(TruncateAt.END);
                    r0.f14272q.setGravity(17);
                    r0.f14272q.setLayoutParams(layoutParams);
                    r0.f14272q.setMaxLines(2);
                    r0.f14272q.setPadding(0, 0, 0, 0);
                    r0.f14272q.setTextColor(r0.f14281z);
                    r0.f14272q.setTextSize(24.0f);
                    m17732a(linearLayout, r0.f14272q);
                }
                if (r0.f14274s != null) {
                    i4 = (int) (64.0f * f);
                    layoutParams = new LinearLayout.LayoutParams(i4, i4);
                    layoutParams.weight = 0.0f;
                    layoutParams.gravity = 17;
                    r0.f14274s.setLayoutParams(layoutParams);
                    m17732a(linearLayout, r0.f14274s);
                }
                if (r0.f14273r != null) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.weight = 2.0f;
                    layoutParams.gravity = 16;
                    r0.f14273r.setEllipsize(TruncateAt.END);
                    r0.f14273r.setGravity(16);
                    r0.f14273r.setLayoutParams(layoutParams);
                    r0.f14273r.setMaxLines(2);
                    r0.f14273r.setPadding(0, 0, 0, 0);
                    r0.f14273r.setTextColor(r0.f14281z);
                    m17732a(linearLayout, r0.f14273r);
                }
                if (r0.f14276u != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams2.addRule(3, id);
                    r0.f14276u.setLayoutParams(layoutParams2);
                    linearLayout = r0.f14276u;
                }
                viewGroup = (ViewGroup) r0.b.getParent();
                i2 = r0.f14280y;
            } else if (!m17737n() || m17736m()) {
                gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
                gradientDrawable.setCornerRadius(0.0f);
                r0.b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                m17731a(r0.b);
                m17731a(r0.f14279x);
                if (r0.f14275t != null) {
                    m17731a(r0.f14275t);
                }
                LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, (int) (124.0f * f));
                layoutParams4.addRule(12);
                View relativeLayout2 = new RelativeLayout(r0.d);
                if (VERSION.SDK_INT >= 16) {
                    relativeLayout2.setBackground(gradientDrawable);
                } else {
                    relativeLayout2.setBackgroundDrawable(gradientDrawable);
                }
                relativeLayout2.setLayoutParams(layoutParams4);
                relativeLayout2.setPadding(i5, 0, i5, i5);
                r0.f14277v = relativeLayout2;
                if (!r0.f14262B) {
                    r0.f14278w.m12893a(relativeLayout2, c1572a);
                }
                m17731a(relativeLayout2);
                if (r0.f14271p != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams((int) (110.0f * f), i4);
                    layoutParams2.rightMargin = i5;
                    layoutParams2.bottomMargin = i5;
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(11);
                    r0.f14271p.setLayoutParams(layoutParams2);
                    m17731a(r0.f14271p);
                }
                if (r0.f14274s != null) {
                    i6 = (int) (64.0f * f);
                    layoutParams2 = new RelativeLayout.LayoutParams(i6, i6);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(9);
                    layoutParams2.bottomMargin = (int) (8.0f * f);
                    r0.f14274s.setLayoutParams(layoutParams2);
                    m17732a(relativeLayout2, r0.f14274s);
                }
                if (r0.f14272q != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.bottomMargin = (int) (48.0f * f);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(9);
                    r0.f14272q.setEllipsize(TruncateAt.END);
                    r0.f14272q.setGravity(8388611);
                    r0.f14272q.setLayoutParams(layoutParams2);
                    r0.f14272q.setMaxLines(1);
                    r0.f14272q.setPadding((int) (f * 80.0f), 0, r0.f14271p != null ? (int) (126.0f * f) : 0, 0);
                    r0.f14272q.setTextColor(-1);
                    r0.f14272q.setTextSize(24.0f);
                    m17732a(relativeLayout2, r0.f14272q);
                }
                if (r0.f14273r != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(9);
                    r0.f14273r.setEllipsize(TruncateAt.END);
                    r0.f14273r.setGravity(8388611);
                    r0.f14273r.setLayoutParams(layoutParams2);
                    r0.f14273r.setMaxLines(2);
                    r0.f14273r.setTextColor(-1);
                    r0.f14273r.setPadding((int) (f * 80.0f), 0, r0.f14271p != null ? (int) (126.0f * f) : 0, 0);
                    m17732a(relativeLayout2, r0.f14273r);
                }
                if (r0.f14276u != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams2.addRule(12);
                    r0.f14276u.setLayoutParams(layoutParams2);
                    m17731a(r0.f14276u);
                }
                viewGroup = (ViewGroup) r0.b.getParent();
                i2 = -16777216;
            } else {
                layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
                layoutParams2.addRule(9);
                r0.b.setLayoutParams(layoutParams2);
                m17731a(r0.b);
                m17731a(r0.f14279x);
                if (r0.f14275t != null) {
                    m17731a(r0.f14275t);
                }
                linearLayout = new LinearLayout(r0.d);
                r0.f14277v = linearLayout;
                linearLayout.setGravity(112);
                linearLayout.setOrientation(1);
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.leftMargin = i5;
                layoutParams.rightMargin = i5;
                layoutParams.topMargin = (int) (8.0f * f);
                layoutParams.bottomMargin = (int) (f * 80.0f);
                layoutParams.addRule(1, id);
                linearLayout.setLayoutParams(layoutParams);
                m17731a(linearLayout);
                if (r0.f14276u != null) {
                    layoutParams = new RelativeLayout.LayoutParams(-1, (int) (6.0f * f));
                    layoutParams.addRule(5, id);
                    layoutParams.addRule(7, id);
                    layoutParams.addRule(3, id);
                    layoutParams.topMargin = (int) (-6.0f * f);
                    r0.f14276u.setLayoutParams(layoutParams);
                    m17731a(r0.f14276u);
                }
                if (r0.f14272q != null) {
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.weight = 2.0f;
                    layoutParams.gravity = 17;
                    r0.f14272q.setEllipsize(TruncateAt.END);
                    r0.f14272q.setGravity(17);
                    r0.f14272q.setLayoutParams(layoutParams);
                    r0.f14272q.setMaxLines(10);
                    r0.f14272q.setPadding(0, 0, 0, 0);
                    r0.f14272q.setTextColor(r0.f14281z);
                    r0.f14272q.setTextSize(24.0f);
                    m17732a(linearLayout, r0.f14272q);
                }
                if (r0.f14274s != null) {
                    i4 = (int) (f * 64.0f);
                    layoutParams = new LinearLayout.LayoutParams(i4, i4);
                    layoutParams.weight = 0.0f;
                    layoutParams.gravity = 17;
                    r0.f14274s.setLayoutParams(layoutParams);
                    m17732a(linearLayout, r0.f14274s);
                }
                if (r0.f14273r != null) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.weight = 2.0f;
                    layoutParams.gravity = 16;
                    r0.f14273r.setEllipsize(TruncateAt.END);
                    r0.f14273r.setGravity(17);
                    r0.f14273r.setLayoutParams(layoutParams);
                    r0.f14273r.setMaxLines(10);
                    r0.f14273r.setPadding(0, 0, 0, 0);
                    r0.f14273r.setTextColor(r0.f14281z);
                    m17732a(linearLayout, r0.f14273r);
                }
                if (r0.f14271p != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (f * 64.0f));
                    layoutParams2.bottomMargin = i5;
                    layoutParams2.leftMargin = i5;
                    layoutParams2.rightMargin = i5;
                    layoutParams2.addRule(1);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(1, id);
                    r0.f14271p.setLayoutParams(layoutParams2);
                    linearLayout = r0.f14271p;
                }
                viewGroup = (ViewGroup) r0.b.getParent();
                i2 = r0.f14280y;
            }
            m17731a(linearLayout);
            viewGroup = (ViewGroup) r0.b.getParent();
            i2 = r0.f14280y;
        }
        viewGroup.setBackgroundColor(i2);
        linearLayout = r0.b.getRootView();
        if (linearLayout != null) {
            linearLayout.setOnTouchListener(r0);
        }
    }

    /* renamed from: a */
    private void m17731a(View view) {
        if (this.f14266k != null) {
            this.f14266k.mo1645a(view);
        }
    }

    /* renamed from: a */
    private void m17732a(@Nullable ViewGroup viewGroup, @Nullable View view) {
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    /* renamed from: b */
    private void m17734b(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: l */
    private boolean m17735l() {
        return ((double) (this.b.getVideoHeight() > 0 ? ((float) this.b.getVideoWidth()) / ((float) this.b.getVideoHeight()) : -1.0f)) <= 0.9d ? f14259i : false;
    }

    /* renamed from: m */
    private boolean m17736m() {
        boolean z = false;
        if (this.b.getVideoHeight() <= 0) {
            return false;
        }
        Rect rect = new Rect();
        float f = this.d.getResources().getDisplayMetrics().density;
        this.f14267l.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.width() > rect.height()) {
            if (((float) (rect.width() - ((rect.height() * this.b.getVideoWidth()) / this.b.getVideoHeight()))) - (f * 192.0f) < 0.0f) {
                z = f14259i;
            }
            return z;
        }
        float f2 = 64.0f * f;
        if (((((float) (rect.height() - ((rect.width() * this.b.getVideoHeight()) / this.b.getVideoWidth()))) - f2) - f2) - (f * 40.0f) < 0.0f) {
            z = f14259i;
        }
        return z;
    }

    /* renamed from: n */
    private boolean m17737n() {
        double videoWidth = (double) (this.b.getVideoHeight() > 0 ? ((float) this.b.getVideoWidth()) / ((float) this.b.getVideoHeight()) : -1.0f);
        return (videoWidth <= 0.9d || videoWidth >= 1.1d) ? false : f14259i;
    }

    /* renamed from: o */
    private void m17738o() {
        m17734b(this.b);
        m17734b(this.f14271p);
        m17734b(this.f14272q);
        m17734b(this.f14273r);
        m17734b(this.f14274s);
        m17734b(this.f14276u);
        m17734b(this.f14277v);
        m17734b(this.f14279x);
        if (this.f14275t != null) {
            m17734b(this.f14275t);
        }
    }

    /* renamed from: a */
    protected void mo3702a() {
        if (this.c == null) {
            Log.e(f14260j, "Unable to add UI without a valid ad response.");
            return;
        }
        JSONObject jSONObject;
        String string = this.c.getString("ct");
        String optString = this.c.getJSONObject("context").optString("orientation");
        if (!optString.isEmpty()) {
            this.f14270o = C1360a.m4760a(Integer.parseInt(optString));
        }
        if (this.c.has("layout") && !this.c.isNull("layout")) {
            jSONObject = this.c.getJSONObject("layout");
            this.f14280y = (int) jSONObject.optLong("bgColor", (long) this.f14280y);
            this.f14281z = (int) jSONObject.optLong("textColor", (long) this.f14281z);
            this.f14261A = (int) jSONObject.optLong("accentColor", (long) this.f14261A);
            this.f14262B = jSONObject.optBoolean("persistentAdDetails", this.f14262B);
        }
        jSONObject = this.c.getJSONObject(ManagerWebServices.PARAM_TEXT);
        this.b.setId(VERSION.SDK_INT >= 17 ? View.generateViewId() : an.m5201a());
        int c = m16320c();
        Context context = this.d;
        if (c < 0) {
            c = 0;
        }
        this.f14279x = new C3359j(context, c, this.f14261A);
        this.f14279x.setOnTouchListener(this.f14269n);
        this.b.m13056a(this.f14279x);
        if (this.c.has("cta") && !this.c.isNull("cta")) {
            JSONObject jSONObject2 = this.c.getJSONObject("cta");
            this.f14271p = new C1546a(this.d, jSONObject2.getString("url"), jSONObject2.getString(ManagerWebServices.PARAM_TEXT), this.f14261A, this.b, this.a, string);
            C1349b.m4701a(this.d, this.a, string, Uri.parse(jSONObject2.getString("url")), new HashMap());
        }
        if (this.c.has(AnalyticsConstants.VALUE_SHARE_METHOD_ICON) && !this.c.isNull(AnalyticsConstants.VALUE_SHARE_METHOD_ICON)) {
            JSONObject jSONObject3 = this.c.getJSONObject(AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
            this.f14274s = new ImageView(this.d);
            new C1505r(this.f14274s).m5301a(jSONObject3.getString("url"));
        }
        if (this.c.has(ManagerWebServices.IG_PARAM_IMAGE) && !this.c.isNull(ManagerWebServices.IG_PARAM_IMAGE)) {
            jSONObject3 = this.c.getJSONObject(ManagerWebServices.IG_PARAM_IMAGE);
            C1582n c4167g = new C4167g(this.d);
            this.b.m13056a(c4167g);
            c4167g.setImage(jSONObject3.getString("url"));
        }
        CharSequence optString2 = jSONObject.optString(ManagerWebServices.PARAM_JOB_TITLE);
        if (!optString2.isEmpty()) {
            this.f14272q = new TextView(this.d);
            this.f14272q.setText(optString2);
            this.f14272q.setTypeface(Typeface.defaultFromStyle(1));
        }
        CharSequence optString3 = jSONObject.optString("subtitle");
        if (!optString3.isEmpty()) {
            this.f14273r = new TextView(this.d);
            this.f14273r.setText(optString3);
            this.f14273r.setTextSize(16.0f);
        }
        this.f14276u = new C3362p(this.d);
        this.b.m13056a(this.f14276u);
        Object d = m16321d();
        if (!TextUtils.isEmpty(d)) {
            this.f14275t = new C1566a(this.d, "AdChoices", d, new float[]{0.0f, 0.0f, 8.0f, 0.0f}, string);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            this.f14275t.setLayoutParams(layoutParams);
        }
        this.b.m13056a(new C4177k(this.d));
        C1582n c4181l = new C4181l(this.d);
        this.b.m13056a(c4181l);
        C1572a c1572a = mo3703g() ? C1572a.FADE_OUT_ON_PLAY : C1572a.VISIBLE;
        this.b.m13056a(new C3354d(c4181l, c1572a));
        this.f14278w = new C3354d(new RelativeLayout(this.d), c1572a);
        this.b.m13056a(this.f14278w);
    }

    @TargetApi(17)
    /* renamed from: a */
    public void mo1823a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        this.f14267l = audienceNetworkActivity;
        if (f14259i || this.f14266k != null) {
            audienceNetworkActivity.addBackButtonInterceptor(this.f14268m);
            m17738o();
            m17730a(this.f14267l.getResources().getConfiguration().orientation);
            if (mo3703g()) {
                mo3330e();
                return;
            } else {
                m16323f();
                return;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void m17741a(Configuration configuration) {
        m17738o();
        m17730a(configuration.orientation);
    }

    /* renamed from: a */
    public void mo1824a(Bundle bundle) {
    }

    /* renamed from: g */
    protected boolean mo3703g() {
        if (f14259i || this.c != null) {
            try {
                return this.c.getJSONObject("video").getBoolean(AudienceNetworkActivity.AUTOPLAY);
            } catch (Throwable e) {
                Log.w(String.valueOf(C4352m.class), "Invalid JSON", e);
                return f14259i;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: h */
    public void mo1825h() {
    }

    /* renamed from: i */
    public void mo1826i() {
    }

    /* renamed from: j */
    public C1360a m17746j() {
        return this.f14270o;
    }

    /* renamed from: k */
    public void m17747k() {
        if (this.f14267l != null) {
            this.f14267l.finish();
        }
    }

    public void onDestroy() {
        if (!(this.c == null || this.a == null)) {
            Object optString = this.c.optString("ct");
            if (!TextUtils.isEmpty(optString)) {
                this.a.mo1753g(optString, new HashMap());
            }
        }
        if (this.b != null) {
            this.b.m13064h();
        }
        C4144l.m16328a((C1604d) this);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b != null) {
            this.b.getEventBus().m4994a(new C3347t(view, motionEvent));
        }
        return f14259i;
    }

    public void setListener(C1603a c1603a) {
        this.f14266k = c1603a;
    }
}
