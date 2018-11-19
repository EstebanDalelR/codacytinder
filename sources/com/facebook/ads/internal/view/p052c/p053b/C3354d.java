package com.facebook.ads.internal.view.p052c.p053b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.ads.internal.p041h.C1429s;
import com.facebook.ads.internal.view.C3394u;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3336i;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3338k;
import com.facebook.ads.internal.view.p052c.p080a.C3347t;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

@TargetApi(12)
/* renamed from: com.facebook.ads.internal.view.c.b.d */
public class C3354d implements C1582n {
    /* renamed from: a */
    private final Handler f10163a;
    /* renamed from: b */
    private View f10164b;
    @Nullable
    /* renamed from: c */
    private C1572a f10165c;
    @Nullable
    /* renamed from: d */
    private C3394u f10166d;
    /* renamed from: e */
    private boolean f10167e;
    /* renamed from: f */
    private final C3336i f10168f;
    /* renamed from: g */
    private final C3338k f10169g;
    /* renamed from: h */
    private final C3330c f10170h;
    /* renamed from: i */
    private final C1429s<C3347t> f10171i;

    /* renamed from: com.facebook.ads.internal.view.c.b.d$a */
    public enum C1572a {
        VISIBLE,
        INVSIBLE,
        FADE_OUT_ON_PLAY
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.d$4 */
    class C33534 extends C1429s<C3347t> {
        /* renamed from: a */
        final /* synthetic */ C3354d f10162a;

        /* renamed from: com.facebook.ads.internal.view.c.b.d$4$1 */
        class C15711 extends AnimatorListenerAdapter {
            /* renamed from: a */
            final /* synthetic */ C33534 f4364a;

            /* renamed from: com.facebook.ads.internal.view.c.b.d$4$1$1 */
            class C15701 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C15711 f4363a;

                /* renamed from: com.facebook.ads.internal.view.c.b.d$4$1$1$1 */
                class C15691 extends AnimatorListenerAdapter {
                    /* renamed from: a */
                    final /* synthetic */ C15701 f4362a;

                    C15691(C15701 c15701) {
                        this.f4362a = c15701;
                    }

                    public void onAnimationEnd(Animator animator) {
                        this.f4362a.f4363a.f4364a.f10162a.f10164b.setVisibility(8);
                    }
                }

                C15701(C15711 c15711) {
                    this.f4363a = c15711;
                }

                public void run() {
                    this.f4363a.f4364a.f10162a.f10164b.animate().alpha(0.0f).setDuration(500).setListener(new C15691(this));
                }
            }

            C15711(C33534 c33534) {
                this.f4364a = c33534;
            }

            public void onAnimationEnd(Animator animator) {
                this.f4364a.f10162a.f10163a.postDelayed(new C15701(this), DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
            }
        }

        C33534(C3354d c3354d) {
            this.f10162a = c3354d;
        }

        /* renamed from: a */
        public Class<C3347t> mo1725a() {
            return C3347t.class;
        }

        /* renamed from: a */
        public void m12886a(C3347t c3347t) {
            if (this.f10162a.f10166d != null && c3347t.m12879b().getAction() == 0) {
                this.f10162a.f10163a.removeCallbacksAndMessages(null);
                this.f10162a.f10164b.setVisibility(0);
                this.f10162a.f10164b.animate().alpha(1.0f).setDuration(500).setListener(new C15711(this));
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.d$1 */
    class C41631 extends C3336i {
        /* renamed from: a */
        final /* synthetic */ C3354d f13301a;

        C41631(C3354d c3354d) {
            this.f13301a = c3354d;
        }

        /* renamed from: a */
        public void m16520a(C3335h c3335h) {
            this.f13301a.f10163a.removeCallbacksAndMessages(null);
            this.f13301a.f10164b.clearAnimation();
            this.f13301a.f10164b.setAlpha(1.0f);
            this.f13301a.f10164b.setVisibility(0);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.d$2 */
    class C41642 extends C3338k {
        /* renamed from: a */
        final /* synthetic */ C3354d f13302a;

        /* renamed from: com.facebook.ads.internal.view.c.b.d$2$1 */
        class C15681 extends AnimatorListenerAdapter {
            /* renamed from: a */
            final /* synthetic */ C41642 f4361a;

            C15681(C41642 c41642) {
                this.f4361a = c41642;
            }

            public void onAnimationEnd(Animator animator) {
                this.f4361a.f13302a.f10164b.setVisibility(8);
            }
        }

        C41642(C3354d c3354d) {
            this.f13302a = c3354d;
        }

        /* renamed from: a */
        public void m16522a(C3337j c3337j) {
            if (this.f13302a.f10165c != C1572a.FADE_OUT_ON_PLAY) {
                if (!this.f13302a.f10167e) {
                    this.f13302a.f10163a.removeCallbacksAndMessages(null);
                    this.f13302a.f10164b.clearAnimation();
                    this.f13302a.f10164b.setAlpha(0.0f);
                    this.f13302a.f10164b.setVisibility(8);
                    return;
                }
            }
            this.f13302a.f10165c = null;
            this.f13302a.f10164b.animate().alpha(0.0f).setDuration(500).setListener(new C15681(this));
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.d$3 */
    class C41653 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C3354d f13303a;

        C41653(C3354d c3354d) {
            this.f13303a = c3354d;
        }

        /* renamed from: a */
        public void m16524a(C3329b c3329b) {
            if (this.f13303a.f10165c != C1572a.INVSIBLE) {
                this.f13303a.f10164b.setAlpha(1.0f);
                this.f13303a.f10164b.setVisibility(0);
            }
        }
    }

    public C3354d(View view, C1572a c1572a) {
        this(view, c1572a, false);
    }

    public C3354d(android.view.View r2, com.facebook.ads.internal.view.p052c.p053b.C3354d.C1572a r3, boolean r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:6:0x004e in {2, 4, 5} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        r1.<init>();
        r0 = new com.facebook.ads.internal.view.c.b.d$1;
        r0.<init>(r1);
        r1.f10168f = r0;
        r0 = new com.facebook.ads.internal.view.c.b.d$2;
        r0.<init>(r1);
        r1.f10169g = r0;
        r0 = new com.facebook.ads.internal.view.c.b.d$3;
        r0.<init>(r1);
        r1.f10170h = r0;
        r0 = new com.facebook.ads.internal.view.c.b.d$4;
        r0.<init>(r1);
        r1.f10171i = r0;
        r1.f10167e = r4;
        r1.f10164b = r2;
        r1.f10165c = r3;
        r2 = new android.os.Handler;
        r2.<init>();
        r1.f10163a = r2;
        r2 = r1.f10164b;
        r2.clearAnimation();
        r2 = com.facebook.ads.internal.view.p052c.p053b.C3354d.C1572a.INVSIBLE;
        if (r3 != r2) goto L_0x0043;
    L_0x0035:
        r2 = r1.f10164b;
        r3 = 0;
        r2.setAlpha(r3);
        r2 = r1.f10164b;
        r3 = 8;
    L_0x003f:
        r2.setVisibility(r3);
        return;
    L_0x0043:
        r2 = r1.f10164b;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2.setAlpha(r3);
        r2 = r1.f10164b;
        r3 = 0;
        goto L_0x003f;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.c.b.d.<init>(android.view.View, com.facebook.ads.internal.view.c.b.d$a, boolean):void");
    }

    /* renamed from: a */
    public void m12893a(android.view.View r1, com.facebook.ads.internal.view.p052c.p053b.C3354d.C1572a r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:6:0x0026 in {2, 4, 5} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = this;
        r0.f10164b = r1;
        r0.f10165c = r2;
        r1 = r0.f10164b;
        r1.clearAnimation();
        r1 = com.facebook.ads.internal.view.p052c.p053b.C3354d.C1572a.INVSIBLE;
        if (r2 != r1) goto L_0x001b;
    L_0x000d:
        r1 = r0.f10164b;
        r2 = 0;
        r1.setAlpha(r2);
        r1 = r0.f10164b;
        r2 = 8;
    L_0x0017:
        r1.setVisibility(r2);
        return;
    L_0x001b:
        r1 = r0.f10164b;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.setAlpha(r2);
        r1 = r0.f10164b;
        r2 = 0;
        goto L_0x0017;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.c.b.d.a(android.view.View, com.facebook.ads.internal.view.c.b.d$a):void");
    }

    /* renamed from: a */
    public void mo1788a(C3394u c3394u) {
        this.f10166d = c3394u;
        c3394u.getEventBus().m4995a(this.f10168f, this.f10169g, this.f10171i, this.f10170h);
    }

    /* renamed from: b */
    public void mo1789b(C3394u c3394u) {
        c3394u.getEventBus().m4997b(this.f10170h, this.f10171i, this.f10169g, this.f10168f);
        this.f10166d = null;
    }
}
