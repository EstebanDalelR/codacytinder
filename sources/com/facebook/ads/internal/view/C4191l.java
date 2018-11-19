package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.C1353c;
import com.facebook.ads.internal.adapters.C1366u;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.ai;
import com.facebook.ads.internal.p049l.C1517a;
import com.facebook.ads.internal.p049l.C1517a.C1516a;
import com.facebook.ads.internal.view.C3380k.C1612a;
import com.facebook.ads.internal.view.component.C1598d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.l */
public class C4191l extends C3387o {
    /* renamed from: f */
    private final ai f13387f = new ai();
    @Nullable
    /* renamed from: g */
    private LinearLayout f13388g;
    /* renamed from: h */
    private String f13389h;
    /* renamed from: i */
    private long f13390i;
    /* renamed from: j */
    private String f13391j;
    /* renamed from: k */
    private List<C1612a> f13392k;
    @Nullable
    /* renamed from: l */
    private C1598d f13393l;
    @Nullable
    /* renamed from: m */
    private RecyclerView f13394m;
    /* renamed from: n */
    private C1517a f13395n;
    /* renamed from: o */
    private int f13396o;
    /* renamed from: p */
    private int f13397p;

    /* renamed from: com.facebook.ads.internal.view.l$1 */
    class C33811 extends C1516a {
        /* renamed from: a */
        final /* synthetic */ C4191l f10288a;

        C33811(C4191l c4191l) {
            this.f10288a = c4191l;
        }

        /* renamed from: a */
        public void mo1681a() {
            Map hashMap = new HashMap();
            if (!this.f10288a.f13387f.m5185b()) {
                this.f10288a.f13387f.m5183a();
                if (this.f10288a.getAudienceNetworkListener() != null) {
                    this.f10288a.getAudienceNetworkListener().mo1646a("com.facebook.ads.interstitial.impression.logged");
                }
                if (!TextUtils.isEmpty(this.f10288a.f13389h)) {
                    this.f10288a.f13395n.m5350a(hashMap);
                    hashMap.put("touch", C1490h.m5244a(this.f10288a.f13387f.m5188e()));
                    this.f10288a.b.mo1743a(this.f10288a.f13389h, hashMap);
                }
            }
        }
    }

    public C4191l(Context context, C1425f c1425f) {
        super(context, c1425f);
    }

    /* renamed from: a */
    private void m16601a(C1366u c1366u) {
        this.f13389h = c1366u.m4762a();
        this.f13391j = c1366u.m4767f();
        this.f13396o = c1366u.m4770i();
        this.f13397p = c1366u.m4771j();
        List d = c1366u.m4765d();
        this.f13392k = new ArrayList(d.size());
        for (int i = 0; i < d.size(); i++) {
            C1353c c1353c = (C1353c) d.get(i);
            this.f13392k.add(new C1612a(i, d.size(), c1353c.m4740f(), c1353c.m4735a(), c1353c.m4737c(), c1353c.m4738d(), c1353c.m4739e()));
        }
    }

    /* renamed from: a */
    public void mo3347a() {
        if (this.f13388g != null) {
            this.f13388g.removeAllViews();
            this.f13388g = null;
        }
        if (this.f13394m != null) {
            this.f13394m.removeAllViews();
            this.f13394m = null;
        }
        if (this.f13393l != null) {
            this.f13393l.removeAllViews();
            this.f13393l = null;
        }
    }

    /* renamed from: a */
    public void mo1823a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        C1366u c1366u = (C1366u) intent.getSerializableExtra("ad_data_bundle");
        super.m13015a(audienceNetworkActivity, c1366u);
        m16601a(c1366u);
        setUpLayout(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.f13390i = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo1824a(Bundle bundle) {
    }

    /* renamed from: h */
    public void mo1825h() {
    }

    /* renamed from: i */
    public void mo1826i() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        mo3347a();
        setUpLayout(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        super.onDestroy();
        C1482c.m5218a(C1481b.m5213a(this.f13390i, C1479a.XOUT, this.f13391j));
        if (!TextUtils.isEmpty(this.f13389h)) {
            Map hashMap = new HashMap();
            this.f13395n.m5350a(hashMap);
            hashMap.put("touch", C1490h.m5244a(this.f13387f.m5188e()));
            this.b.mo1753g(this.f13389h, hashMap);
        }
        mo3347a();
        this.f13395n.m5351b();
        this.f13395n = null;
        this.f13392k = null;
    }

    public void setUpLayout(int i) {
        LinearLayout linearLayout;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6 = i;
        this.f13388g = new LinearLayout(getContext());
        if (i6 == 1) {
            linearLayout = r0.f13388g;
            i2 = 17;
        } else {
            linearLayout = r0.f13388g;
            i2 = 48;
        }
        linearLayout.setGravity(i2);
        r0.f13388g.setLayoutParams(new LayoutParams(-1, -1));
        r0.f13388g.setOrientation(1);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        i2 = displayMetrics.widthPixels;
        int i7 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        if (i6 == 1) {
            i7 = Math.min(i2 - ((int) (32.0f * f)), i7 / 2);
            i2 = (i2 - i7) / 8;
            i3 = i2;
            i4 = i7;
            i5 = i2 * 4;
            z = false;
        } else {
            i2 = (int) (f * 8.0f);
            i3 = i2;
            i4 = i7 - ((int) (120.0f * f));
            i5 = i2 * 2;
            z = true;
        }
        r0.f13394m = new RecyclerView(getContext());
        r0.f13394m.setLayoutParams(new LayoutParams(-1, -2));
        r0.f13394m.setAdapter(new C3380k(r0.f13392k, r0.b, r0.f13387f, getAudienceNetworkListener(), i6 == 1 ? r0.d : r0.e, r0.f13389h, i4, i3, i5, z));
        final LayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        r0.f13394m.setLayoutManager(linearLayoutManager);
        r0.f13395n = new C1517a(r0.f13394m, 1, new C33811(r0));
        r0.f13395n.m5349a(r0.f13396o);
        r0.f13395n.m5352b(r0.f13397p);
        if (i6 == 1) {
            new PagerSnapHelper().attachToRecyclerView(r0.f13394m);
            r0.f13394m.addOnScrollListener(new OnScrollListener(r0) {
                /* renamed from: b */
                final /* synthetic */ C4191l f10290b;

                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                }

                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    i2 = linearLayoutManager.findLastVisibleItemPosition();
                    int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                    if (findFirstCompletelyVisibleItemPosition == -1) {
                        View findViewByPosition;
                        if (i > 0) {
                            if (this.f10290b.f13393l != null) {
                                this.f10290b.f13393l.m5466a(i2);
                            }
                            findViewByPosition = linearLayoutManager.findViewByPosition(i2);
                        } else {
                            if (this.f10290b.f13393l != null) {
                                this.f10290b.f13393l.m5466a(findFirstVisibleItemPosition);
                            }
                            findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                        }
                        findViewByPosition.setAlpha(1.0f);
                        return;
                    }
                    if (this.f10290b.f13393l != null) {
                        this.f10290b.f13393l.m5466a(findFirstCompletelyVisibleItemPosition);
                    }
                    if (findFirstCompletelyVisibleItemPosition != findFirstVisibleItemPosition) {
                        linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition).setAlpha(0.5f);
                    }
                    linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition).setAlpha(1.0f);
                    if (findFirstCompletelyVisibleItemPosition != i2) {
                        linearLayoutManager.findViewByPosition(i2).setAlpha(0.5f);
                    }
                }
            });
            r0.f13393l = new C1598d(getContext(), i6 == 1 ? r0.d : r0.e, r0.f13392k.size());
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) (8.0f * f));
            layoutParams.setMargins(0, (int) (f * 12.0f), 0, 0);
            r0.f13393l.setLayoutParams(layoutParams);
        }
        r0.f13388g.addView(r0.f13394m);
        if (r0.f13393l != null) {
            r0.f13388g.addView(r0.f13393l);
        }
        m13014a(r0.f13388g, false, i6);
        r0.f13395n.m5348a();
    }
}
