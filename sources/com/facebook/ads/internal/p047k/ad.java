package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.p035b.C1370b;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p041h.C1429s;
import com.facebook.ads.internal.view.C3394u;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3339l;
import com.facebook.ads.internal.view.p052c.p080a.C3340m;
import com.facebook.ads.internal.view.p052c.p080a.C3341n;
import com.facebook.ads.internal.view.p052c.p080a.C3343p;
import com.facebook.ads.internal.view.p052c.p080a.C3345r;
import com.facebook.ads.internal.view.p052c.p080a.C3346s;
import com.facebook.ads.internal.view.p052c.p080a.C3348u;
import com.facebook.ads.internal.view.p052c.p080a.C3349v;
import com.facebook.ads.internal.view.p052c.p080a.C3350w;
import com.facebook.ads.internal.view.p052c.p080a.C3351x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.k.ad */
public class ad extends al {
    /* renamed from: a */
    public int f13274a;
    /* renamed from: b */
    private final C3349v f13275b;
    /* renamed from: c */
    private final C1429s<C3345r> f13276c;
    /* renamed from: d */
    private final C1429s<C3335h> f13277d;
    /* renamed from: e */
    private final C1429s<C3337j> f13278e;
    /* renamed from: f */
    private final C1429s<C3341n> f13279f;
    /* renamed from: g */
    private final C1429s<C3329b> f13280g;
    /* renamed from: h */
    private final C1429s<C3343p> f13281h;
    /* renamed from: i */
    private final C1429s<C3350w> f13282i;
    /* renamed from: j */
    private final C1429s<C3351x> f13283j;
    /* renamed from: k */
    private final C1429s<C3346s> f13284k;
    /* renamed from: l */
    private final C3340m f13285l;
    /* renamed from: m */
    private final C3394u f13286m;
    /* renamed from: n */
    private boolean f13287n;

    /* renamed from: com.facebook.ads.internal.k.ad$2 */
    class C33112 extends C1429s<C3346s> {
        /* renamed from: a */
        final /* synthetic */ ad f10098a;

        C33112(ad adVar) {
            this.f10098a = adVar;
        }

        /* renamed from: a */
        public Class<C3346s> mo1725a() {
            return C3346s.class;
        }

        /* renamed from: a */
        public void m12782a(C3346s c3346s) {
            this.f10098a.m12813a(this.f10098a.m12824k(), this.f10098a.m12824k());
        }
    }

    /* renamed from: com.facebook.ads.internal.k.ad$4 */
    class C33124 extends C1429s<C3345r> {
        /* renamed from: a */
        static final /* synthetic */ boolean f10099a = true;
        /* renamed from: b */
        final /* synthetic */ ad f10100b;

        static {
            Class cls = ad.class;
        }

        C33124(ad adVar) {
            this.f10100b = adVar;
        }

        /* renamed from: a */
        public Class<C3345r> mo1725a() {
            return C3345r.class;
        }

        /* renamed from: a */
        public void m12785a(C3345r c3345r) {
            if (!f10099a && this.f10100b == null) {
                throw new AssertionError();
            } else if (this.f10100b != null) {
                this.f10100b.m12821h();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.k.ad$5 */
    class C33135 extends C1429s<C3335h> {
        /* renamed from: a */
        static final /* synthetic */ boolean f10101a = true;
        /* renamed from: b */
        final /* synthetic */ ad f10102b;

        static {
            Class cls = ad.class;
        }

        C33135(ad adVar) {
            this.f10102b = adVar;
        }

        /* renamed from: a */
        public Class<C3335h> mo1725a() {
            return C3335h.class;
        }

        /* renamed from: a */
        public void m12788a(C3335h c3335h) {
            if (!f10101a && this.f10102b == null) {
                throw new AssertionError();
            } else if (this.f10102b != null) {
                this.f10102b.m12822i();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.k.ad$6 */
    class C33146 extends C1429s<C3337j> {
        /* renamed from: a */
        static final /* synthetic */ boolean f10103a = true;
        /* renamed from: b */
        final /* synthetic */ ad f10104b;

        static {
            Class cls = ad.class;
        }

        C33146(ad adVar) {
            this.f10104b = adVar;
        }

        /* renamed from: a */
        public Class<C3337j> mo1725a() {
            return C3337j.class;
        }

        /* renamed from: a */
        public void m12791a(C3337j c3337j) {
            if (!f10103a && this.f10104b == null) {
                throw new AssertionError();
            } else if (this.f10104b != null) {
                if (this.f10104b.f13287n) {
                    this.f10104b.m12823j();
                } else {
                    this.f10104b.f13287n = f10103a;
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.k.ad$7 */
    class C33157 extends C1429s<C3341n> {
        /* renamed from: a */
        final /* synthetic */ ad f10105a;

        C33157(ad adVar) {
            this.f10105a = adVar;
        }

        /* renamed from: a */
        public Class<C3341n> mo1725a() {
            return C3341n.class;
        }

        /* renamed from: a */
        public void m12794a(C3341n c3341n) {
            if (this.f10105a.f13274a <= 0 || this.f10105a.f13286m.getCurrentPosition() != this.f10105a.f13286m.getDuration() || this.f10105a.f13286m.getDuration() <= this.f10105a.f13274a) {
                this.f10105a.m12812a(this.f10105a.f13286m.getCurrentPosition());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.k.ad$8 */
    class C33168 extends C1429s<C3329b> {
        /* renamed from: a */
        final /* synthetic */ ad f10106a;

        C33168(ad adVar) {
            this.f10106a = adVar;
        }

        /* renamed from: a */
        public Class<C3329b> mo1725a() {
            return C3329b.class;
        }

        /* renamed from: a */
        public void m12797a(C3329b c3329b) {
            int currentPosition = this.f10106a.f13286m.getCurrentPosition();
            if (this.f10106a.f13274a > 0 && currentPosition == this.f10106a.f13286m.getDuration() && this.f10106a.f13286m.getDuration() > this.f10106a.f13274a) {
                return;
            }
            if (!(currentPosition == 0 && this.f10106a.f13286m.mo1835a()) && this.f10106a.f13286m.getDuration() >= currentPosition + 500) {
                this.f10106a.m12815b(currentPosition);
                return;
            }
            ad adVar;
            int i;
            if (this.f10106a.f13286m.getDuration() == 0) {
                adVar = this.f10106a;
                i = this.f10106a.f13274a;
            } else {
                adVar = this.f10106a;
                i = this.f10106a.f13286m.getDuration();
            }
            adVar.m12815b(i);
        }
    }

    /* renamed from: com.facebook.ads.internal.k.ad$9 */
    class C33179 extends C1429s<C3343p> {
        /* renamed from: a */
        final /* synthetic */ ad f10107a;

        C33179(ad adVar) {
            this.f10107a = adVar;
        }

        /* renamed from: a */
        public Class<C3343p> mo1725a() {
            return C3343p.class;
        }

        /* renamed from: a */
        public void m12800a(C3343p c3343p) {
            this.f10107a.m12813a(c3343p.m12875a(), c3343p.m12876b());
        }
    }

    /* renamed from: com.facebook.ads.internal.k.ad$1 */
    class C41521 extends C3349v {
        /* renamed from: a */
        static final /* synthetic */ boolean f13271a = true;
        /* renamed from: b */
        final /* synthetic */ ad f13272b;

        static {
            Class cls = ad.class;
        }

        C41521(ad adVar) {
            this.f13272b = adVar;
        }

        /* renamed from: a */
        public void m16493a(C3348u c3348u) {
            if (!f13271a && this.f13272b == null) {
                throw new AssertionError();
            } else if (this.f13272b != null) {
                this.f13272b.m12818e();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.k.ad$3 */
    class C41533 extends C3340m {
        /* renamed from: a */
        final /* synthetic */ ad f13273a;

        C41533(ad adVar) {
            this.f13273a = adVar;
        }

        /* renamed from: a */
        public void m16495a(C3339l c3339l) {
            this.f13273a.f13274a = this.f13273a.f13286m.getDuration();
        }
    }

    public ad(Context context, C1425f c1425f, C3394u c3394u, String str) {
        this(context, c1425f, c3394u, new ArrayList(), str);
    }

    public ad(Context context, C1425f c1425f, C3394u c3394u, String str, @Nullable Bundle bundle) {
        this(context, c1425f, c3394u, new ArrayList(), str, bundle);
    }

    public ad(Context context, C1425f c1425f, C3394u c3394u, List<C1370b> list, String str) {
        super(context, c1425f, c3394u, list, str);
        this.f13275b = new C41521(this);
        this.f13276c = new C33124(this);
        this.f13277d = new C33135(this);
        this.f13278e = new C33146(this);
        this.f13279f = new C33157(this);
        this.f13280g = new C33168(this);
        this.f13281h = new C33179(this);
        this.f13282i = new C1429s<C3350w>(this) {
            /* renamed from: a */
            final /* synthetic */ com.facebook.ads.internal.p047k.ad f10096a;

            {
                this.f10096a = r1;
            }

            /* renamed from: a */
            public Class<C3350w> mo1725a() {
                return C3350w.class;
            }

            /* renamed from: a */
            public void m12776a(C3350w c3350w) {
                this.f10096a.m12814b();
            }
        };
        this.f13283j = new C1429s<C3351x>(this) {
            /* renamed from: a */
            final /* synthetic */ com.facebook.ads.internal.p047k.ad f10097a;

            {
                this.f10097a = r1;
            }

            /* renamed from: a */
            public Class<C3351x> mo1725a() {
                return C3351x.class;
            }

            /* renamed from: a */
            public void m12779a(C3351x c3351x) {
                this.f10097a.m12816c();
            }
        };
        this.f13284k = new C33112(this);
        this.f13285l = new C41533(this);
        this.f13287n = false;
        this.f13286m = c3394u;
        this.f13286m.getEventBus().m4995a(this.f13275b, this.f13279f, this.f13276c, this.f13278e, this.f13277d, this.f13280g, this.f13281h, this.f13282i, this.f13283j, this.f13285l, this.f13284k);
    }

    public ad(Context context, C1425f c1425f, C3394u c3394u, List<C1370b> list, String str, @Nullable Bundle bundle) {
        super(context, c1425f, c3394u, list, str, bundle);
        this.f13275b = new C41521(this);
        this.f13276c = new C33124(this);
        this.f13277d = new C33135(this);
        this.f13278e = new C33146(this);
        this.f13279f = new C33157(this);
        this.f13280g = new C33168(this);
        this.f13281h = new C33179(this);
        this.f13282i = /* anonymous class already generated */;
        this.f13283j = /* anonymous class already generated */;
        this.f13284k = new C33112(this);
        this.f13285l = new C41533(this);
        this.f13287n = false;
        this.f13286m = c3394u;
        this.f13286m.getEventBus().m4995a(this.f13275b, this.f13279f, this.f13276c, this.f13278e, this.f13277d, this.f13280g, this.f13282i, this.f13283j, this.f13284k);
    }

    /* renamed from: a */
    public void m16499a() {
        this.f13286m.getEventBus().m4997b(this.f13275b, this.f13279f, this.f13276c, this.f13278e, this.f13277d, this.f13280g, this.f13282i, this.f13283j, this.f13285l, this.f13284k);
    }
}
