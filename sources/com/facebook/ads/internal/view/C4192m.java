package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.C1353c;
import com.facebook.ads.internal.adapters.C1366u;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1505r;
import com.facebook.ads.internal.p047k.ai;
import com.facebook.ads.internal.p049l.C1517a;
import com.facebook.ads.internal.p049l.C1517a.C1516a;
import com.facebook.ads.internal.view.component.p055a.C1594c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.m */
public class C4192m extends C3387o {
    /* renamed from: f */
    private final C1366u f13398f;
    /* renamed from: g */
    private final C1517a f13399g = new C1517a(this, 100, new C33831(this));
    /* renamed from: h */
    private final ai f13400h = new ai();
    /* renamed from: i */
    private long f13401i;

    /* renamed from: com.facebook.ads.internal.view.m$1 */
    class C33831 extends C1516a {
        /* renamed from: a */
        final /* synthetic */ C4192m f10291a;

        C33831(C4192m c4192m) {
            this.f10291a = c4192m;
        }

        /* renamed from: a */
        public void mo1681a() {
            if (!this.f10291a.f13400h.m5185b()) {
                this.f10291a.f13400h.m5183a();
                this.f10291a.b.mo1743a(this.f10291a.f13398f.m4762a(), new HashMap());
                if (this.f10291a.getAudienceNetworkListener() != null) {
                    this.f10291a.getAudienceNetworkListener().mo1646a("com.facebook.ads.interstitial.impression.logged");
                }
            }
        }
    }

    public C4192m(Context context, C1366u c1366u, C1425f c1425f) {
        super(context, c1425f);
        this.f13398f = c1366u;
        this.f13399g.m5349a(c1366u.m4770i());
        this.f13399g.m5352b(c1366u.m4771j());
    }

    private void setUpContent(int i) {
        C1353c c1353c = (C1353c) this.f13398f.m4765d().get(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new C1505r(imageView).m5301a(c1353c.m4740f());
        View a = C1594c.m5456a(getContext(), this.b, getAudienceNetworkListener(), imageView, this.d, this.e, a, i, c1353c.m4741g(), c1353c.m4742h());
        a.mo1815a(c1353c.m4736b(), c1353c.m4737c(), c1353c.m4738d(), c1353c.m4739e(), this.f13398f.m4762a(), ((double) c1353c.m4742h()) / ((double) c1353c.m4741g()));
        m13014a(a, a.mo1814a(), i);
    }

    /* renamed from: a */
    public void mo1823a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        super.m13015a(audienceNetworkActivity, this.f13398f);
        setUpContent(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.f13401i = System.currentTimeMillis();
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
        removeAllViews();
        setUpContent(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        if (this.f13398f != null) {
            C1482c.m5218a(C1481b.m5213a(this.f13401i, C1479a.XOUT, this.f13398f.m4767f()));
            if (!TextUtils.isEmpty(this.f13398f.m4762a())) {
                Map hashMap = new HashMap();
                this.f13399g.m5350a(hashMap);
                hashMap.put("touch", C1490h.m5244a(this.f13400h.m5188e()));
                this.b.mo1753g(this.f13398f.m4762a(), hashMap);
            }
        }
        super.onDestroy();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f13400h.m5184a(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f13399g != null) {
            if (i == 0) {
                this.f13399g.m5348a();
            } else if (i == 8) {
                this.f13399g.m5351b();
            }
        }
    }
}
