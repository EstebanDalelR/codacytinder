package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.C1350a;
import com.facebook.ads.internal.C1373b;
import com.facebook.ads.internal.C1404f;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.protocol.C1521b;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.view.C3365c;

public class AdView extends RelativeLayout implements Ad {
    /* renamed from: a */
    private static final C1521b f9820a = C1521b.ADS;
    /* renamed from: b */
    private final DisplayMetrics f9821b;
    /* renamed from: c */
    private final AdSize f9822c;
    /* renamed from: d */
    private final String f9823d;
    /* renamed from: e */
    private DisplayAdController f9824e;
    /* renamed from: f */
    private AdListener f9825f;
    /* renamed from: g */
    private View f9826g;
    /* renamed from: h */
    private C1404f f9827h;
    /* renamed from: i */
    private volatile boolean f9828i;

    public AdView(Context context, final String str, AdSize adSize) {
        super(context);
        if (adSize != null) {
            if (adSize != AdSize.INTERSTITIAL) {
                this.f9821b = getContext().getResources().getDisplayMetrics();
                this.f9822c = adSize;
                this.f9823d = str;
                this.f9824e = new DisplayAdController(context, str, C1490h.m5239a(adSize), AdPlacementType.BANNER, adSize, f9820a, 1, false);
                this.f9824e.m12491a(new C1350a(this) {
                    /* renamed from: b */
                    final /* synthetic */ AdView f9819b;

                    /* renamed from: com.facebook.ads.AdView$1$1 */
                    class C13341 implements OnLongClickListener {
                        /* renamed from: a */
                        final /* synthetic */ C32181 f3507a;

                        C13341(C32181 c32181) {
                            this.f3507a = c32181;
                        }

                        public boolean onLongClick(View view) {
                            this.f3507a.f9819b.f9827h.setBounds(0, 0, this.f3507a.f9819b.f9826g.getWidth(), this.f3507a.f9819b.f9826g.getHeight());
                            this.f3507a.f9819b.f9827h.m4884a(this.f3507a.f9819b.f9827h.m4885a() ^ true);
                            return true;
                        }
                    }

                    /* renamed from: a */
                    public void mo1636a() {
                        if (this.f9819b.f9825f != null) {
                            this.f9819b.f9825f.onAdClicked(this.f9819b);
                        }
                    }

                    /* renamed from: a */
                    public void mo1637a(View view) {
                        if (view == null) {
                            throw new IllegalStateException("Cannot present null view");
                        }
                        this.f9819b.f9826g = view;
                        this.f9819b.removeAllViews();
                        this.f9819b.addView(this.f9819b.f9826g);
                        if (this.f9819b.f9826g instanceof C3365c) {
                            C1490h.m5251a(this.f9819b.f9821b, this.f9819b.f9826g, this.f9819b.f9822c);
                        }
                        if (this.f9819b.f9825f != null) {
                            this.f9819b.f9825f.onAdLoaded(this.f9819b);
                        }
                        if (C1418g.m4931b(this.f9819b.getContext())) {
                            this.f9819b.f9827h = new C1404f();
                            this.f9819b.f9827h.m4883a(str);
                            this.f9819b.f9827h.m4887b(this.f9819b.getContext().getPackageName());
                            if (this.f9819b.f9824e.m12489a() != null) {
                                this.f9819b.f9827h.m4881a(this.f9819b.f9824e.m12489a().m4901a());
                            }
                            if (this.f9819b.f9826g instanceof C3365c) {
                                this.f9819b.f9827h.m4882a(((C3365c) this.f9819b.f9826g).getViewabilityChecker());
                            }
                            this.f9819b.f9826g.setOnLongClickListener(new C13341(this));
                            this.f9819b.f9826g.getOverlay().add(this.f9819b.f9827h);
                        }
                    }

                    /* renamed from: a */
                    public void mo1638a(AdAdapter adAdapter) {
                        if (this.f9819b.f9824e != null) {
                            this.f9819b.f9824e.m12496b();
                        }
                    }

                    /* renamed from: a */
                    public void mo1639a(C1373b c1373b) {
                        if (this.f9819b.f9825f != null) {
                            this.f9819b.f9825f.onError(this.f9819b, c1373b.m4796b());
                        }
                    }

                    /* renamed from: b */
                    public void mo1640b() {
                        if (this.f9819b.f9825f != null) {
                            this.f9819b.f9825f.onLoggingImpression(this.f9819b);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalArgumentException("adSize");
    }

    /* renamed from: a */
    private void m12279a(String str) {
        if (this.f9828i) {
            if (this.f9824e != null) {
                this.f9824e.m12497b(str);
            }
            return;
        }
        this.f9824e.m12494a(str);
        this.f9828i = true;
    }

    public void destroy() {
        if (this.f9824e != null) {
            this.f9824e.m12498b(true);
            this.f9824e = null;
        }
        if (this.f9827h != null && C1418g.m4931b(getContext())) {
            this.f9827h.m4886b();
            this.f9826g.getOverlay().remove(this.f9827h);
        }
        removeAllViews();
        this.f9826g = null;
    }

    public void disableAutoRefresh() {
        if (this.f9824e != null) {
            this.f9824e.m12502f();
        }
    }

    public String getPlacementId() {
        return this.f9823d;
    }

    public void loadAd() {
        m12279a(null);
    }

    public void loadAdFromBid(String str) {
        m12279a(str);
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f9826g != null) {
            C1490h.m5251a(this.f9821b, this.f9826g, this.f9822c);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f9824e != null) {
            if (i == 0) {
                this.f9824e.m12501e();
                return;
            }
            if (i == 8) {
                this.f9824e.m12500d();
            }
        }
    }

    public void setAdListener(AdListener adListener) {
        this.f9825f = adListener;
    }
}
