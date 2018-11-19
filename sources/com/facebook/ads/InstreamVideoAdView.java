package com.facebook.ads;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.C1350a;
import com.facebook.ads.internal.C1373b;
import com.facebook.ads.internal.C1404f;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C3274t;
import com.facebook.ads.internal.adapters.C4143k;
import com.facebook.ads.internal.p041h.C3288g;
import com.facebook.ads.internal.p047k.ag;
import com.facebook.ads.internal.protocol.C1521b;
import com.facebook.ads.internal.protocol.C1522c;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.p033a.C1341a;
import java.util.EnumSet;

public class InstreamVideoAdView extends RelativeLayout implements Ad, ag<Bundle> {
    /* renamed from: a */
    private final Context f9839a;
    /* renamed from: b */
    private final String f9840b;
    /* renamed from: c */
    private final AdSize f9841c;
    /* renamed from: d */
    private DisplayAdController f9842d;
    @Nullable
    /* renamed from: e */
    private C4143k f9843e;
    /* renamed from: f */
    private boolean f9844f;
    @Nullable
    /* renamed from: g */
    private InstreamVideoAdListener f9845g;
    @Nullable
    /* renamed from: h */
    private View f9846h;
    @Nullable
    /* renamed from: i */
    private Bundle f9847i;
    @Nullable
    /* renamed from: j */
    private C1404f f9848j;

    /* renamed from: com.facebook.ads.InstreamVideoAdView$1 */
    class C32271 extends C1350a {
        /* renamed from: a */
        final /* synthetic */ InstreamVideoAdView f9837a;

        /* renamed from: com.facebook.ads.InstreamVideoAdView$1$1 */
        class C13371 implements OnLongClickListener {
            /* renamed from: a */
            final /* synthetic */ C32271 f3533a;

            C13371(C32271 c32271) {
                this.f3533a = c32271;
            }

            public boolean onLongClick(View view) {
                if (this.f3533a.f9837a.f9846h == null || this.f3533a.f9837a.f9848j == null) {
                    return false;
                }
                this.f3533a.f9837a.f9848j.setBounds(0, 0, this.f3533a.f9837a.f9846h.getWidth(), this.f3533a.f9837a.f9846h.getHeight());
                this.f3533a.f9837a.f9848j.m4884a(this.f3533a.f9837a.f9848j.m4885a() ^ true);
                return true;
            }
        }

        C32271(InstreamVideoAdView instreamVideoAdView) {
            this.f9837a = instreamVideoAdView;
        }

        /* renamed from: a */
        public void mo1636a() {
            if (this.f9837a.f9845g != null) {
                this.f9837a.f9845g.onAdClicked(this.f9837a);
            }
        }

        /* renamed from: a */
        public void mo1637a(View view) {
            if (view == null) {
                throw new IllegalStateException("Cannot present null view");
            }
            this.f9837a.f9846h = view;
            this.f9837a.removeAllViews();
            this.f9837a.f9846h.setLayoutParams(new LayoutParams(-1, -1));
            this.f9837a.addView(this.f9837a.f9846h);
            if (C1418g.m4931b(this.f9837a.f9839a)) {
                this.f9837a.f9848j = new C1404f();
                this.f9837a.f9848j.m4883a(this.f9837a.f9840b);
                this.f9837a.f9848j.m4887b(this.f9837a.f9839a.getPackageName());
                if (this.f9837a.f9842d.m12489a() != null) {
                    this.f9837a.f9848j.m4881a(this.f9837a.f9842d.m12489a().m4901a());
                }
                this.f9837a.f9846h.getOverlay().add(this.f9837a.f9848j);
                this.f9837a.f9846h.setOnLongClickListener(new C13371(this));
            }
        }

        /* renamed from: a */
        public void mo1638a(AdAdapter adAdapter) {
            if (this.f9837a.f9842d != null) {
                this.f9837a.f9844f = true;
                if (this.f9837a.f9845g != null) {
                    this.f9837a.f9845g.onAdLoaded(this.f9837a);
                }
            }
        }

        /* renamed from: a */
        public void mo1639a(C1373b c1373b) {
            if (this.f9837a.f9845g != null) {
                this.f9837a.f9845g.onError(this.f9837a, c1373b.m4796b());
            }
        }

        /* renamed from: b */
        public void mo1640b() {
        }

        /* renamed from: c */
        public void mo1655c() {
            if (this.f9837a.f9845g != null) {
                this.f9837a.f9845g.onAdVideoComplete(this.f9837a);
            }
        }
    }

    /* renamed from: com.facebook.ads.InstreamVideoAdView$2 */
    class C32282 implements C1341a {
        /* renamed from: a */
        final /* synthetic */ InstreamVideoAdView f9838a;

        C32282(InstreamVideoAdView instreamVideoAdView) {
            this.f9838a = instreamVideoAdView;
        }

        /* renamed from: a */
        public void mo1656a(C3274t c3274t) {
            this.f9838a.f9844f = true;
            if (this.f9838a.f9845g != null) {
                this.f9838a.f9845g.onAdLoaded(this.f9838a);
            }
        }

        /* renamed from: a */
        public void mo1657a(C3274t c3274t, View view) {
            if (view == null) {
                throw new IllegalStateException("Cannot present null view");
            }
            this.f9838a.f9846h = view;
            this.f9838a.removeAllViews();
            this.f9838a.f9846h.setLayoutParams(new LayoutParams(-1, -1));
            this.f9838a.addView(this.f9838a.f9846h);
        }

        /* renamed from: a */
        public void mo1658a(C3274t c3274t, AdError adError) {
            if (this.f9838a.f9845g != null) {
                this.f9838a.f9845g.onError(this.f9838a, adError);
            }
        }

        /* renamed from: b */
        public void mo1659b(C3274t c3274t) {
            if (this.f9838a.f9845g != null) {
                this.f9838a.f9845g.onAdClicked(this.f9838a);
            }
        }

        /* renamed from: c */
        public void mo1660c(C3274t c3274t) {
        }

        /* renamed from: d */
        public void mo1661d(C3274t c3274t) {
            if (this.f9838a.f9845g != null) {
                this.f9838a.f9845g.onAdVideoComplete(this.f9838a);
            }
        }
    }

    public InstreamVideoAdView(Context context, Bundle bundle) {
        this(context, bundle.getString("placementID"), (AdSize) bundle.get("adSize"));
        this.f9847i = bundle;
    }

    public InstreamVideoAdView(Context context, String str, AdSize adSize) {
        super(context);
        this.f9844f = false;
        this.f9839a = context;
        this.f9840b = str;
        this.f9841c = adSize;
        this.f9842d = getController();
    }

    /* renamed from: a */
    private final void m12321a() {
        if (this.f9842d != null) {
            this.f9842d.m12498b(true);
            this.f9842d = null;
            this.f9842d = getController();
            this.f9843e = null;
            this.f9844f = false;
            removeAllViews();
        }
    }

    /* renamed from: a */
    private void m12322a(String str) {
        if (this.f9847i != null) {
            this.f9843e = new C4143k();
            this.f9843e.m16317a(getContext(), new C32282(this), C3288g.m12671a(getContext()), this.f9847i.getBundle("adapter"), EnumSet.of(CacheFlag.NONE));
            return;
        }
        this.f9842d.m12494a(str);
    }

    private DisplayAdController getController() {
        this.f9842d = new DisplayAdController(getContext(), this.f9840b, C1522c.INSTREAM_VIDEO, AdPlacementType.INSTREAM, this.f9841c, C1521b.ADS, 1, true);
        this.f9842d.m12491a(new C32271(this));
        return this.f9842d;
    }

    public void destroy() {
        if (this.f9848j != null && C1418g.m4931b(this.f9839a)) {
            this.f9848j.m4886b();
            if (this.f9846h != null) {
                this.f9846h.getOverlay().remove(this.f9848j);
            }
        }
        m12321a();
    }

    public String getPlacementId() {
        return this.f9840b;
    }

    public Bundle getSaveInstanceState() {
        C3274t c3274t = this.f9843e != null ? this.f9843e : (C3274t) this.f9842d.m12503g();
        if (c3274t == null) {
            return null;
        }
        Bundle saveInstanceState = c3274t.getSaveInstanceState();
        if (saveInstanceState == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("adapter", saveInstanceState);
        bundle.putString("placementID", this.f9840b);
        bundle.putSerializable("adSize", this.f9841c);
        return bundle;
    }

    public boolean isAdLoaded() {
        return this.f9844f;
    }

    public void loadAd() {
        m12322a(null);
    }

    public void loadAdFromBid(String str) {
        m12322a(str);
    }

    public void setAdListener(InstreamVideoAdListener instreamVideoAdListener) {
        this.f9845g = instreamVideoAdListener;
    }

    public boolean show() {
        if (this.f9844f) {
            if (this.f9842d != null || this.f9843e != null) {
                if (this.f9843e != null) {
                    this.f9843e.mo3330e();
                } else {
                    this.f9842d.m12496b();
                }
                this.f9844f = false;
                return true;
            }
        }
        if (this.f9845g != null) {
            this.f9845g.onError(this, AdError.INTERNAL_ERROR);
        }
        return false;
    }
}
