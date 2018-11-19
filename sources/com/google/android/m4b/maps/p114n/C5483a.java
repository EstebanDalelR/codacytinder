package com.google.android.m4b.maps.p114n;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p110j.C5442g;
import java.util.LinkedList;

/* renamed from: com.google.android.m4b.maps.n.a */
public abstract class C5483a<T extends C5485c> {
    /* renamed from: a */
    private T f20504a;
    /* renamed from: b */
    private Bundle f20505b;
    /* renamed from: c */
    private LinkedList<C5482a> f20506c;
    /* renamed from: d */
    private final C5486e<T> f20507d = new C67291(this);

    /* renamed from: com.google.android.m4b.maps.n.a$5 */
    class C54815 implements OnClickListener {
        /* renamed from: a */
        private /* synthetic */ Context f20502a;
        /* renamed from: b */
        private /* synthetic */ int f20503b;

        C54815(Context context, int i) {
            this.f20502a = context;
            this.f20503b = i;
        }

        public final void onClick(View view) {
            this.f20502a.startActivity(C5398g.m23577a(this.f20503b));
        }
    }

    /* renamed from: com.google.android.m4b.maps.n.a$a */
    interface C5482a {
        /* renamed from: a */
        int mo5636a();

        /* renamed from: b */
        void mo5637b();
    }

    /* renamed from: com.google.android.m4b.maps.n.a$1 */
    class C67291 implements C5486e<T> {
        /* renamed from: a */
        private /* synthetic */ C5483a f25231a;

        C67291(C5483a c5483a) {
            this.f25231a = c5483a;
        }

        /* renamed from: a */
        public final void mo5635a(T t) {
            this.f25231a.f20504a = t;
            t = this.f25231a.f20506c.iterator();
            while (t.hasNext()) {
                ((C5482a) t.next()).mo5637b();
            }
            this.f25231a.f20506c.clear();
            this.f25231a.f20505b = null;
        }
    }

    /* renamed from: com.google.android.m4b.maps.n.a$6 */
    class C67336 implements C5482a {
        /* renamed from: a */
        private /* synthetic */ C5483a f25243a;

        /* renamed from: a */
        public final int mo5636a() {
            return 5;
        }

        C67336(C5483a c5483a) {
            this.f25243a = c5483a;
        }

        /* renamed from: b */
        public final void mo5637b() {
            this.f25243a.f20504a.mo6969a();
        }
    }

    /* renamed from: a */
    protected abstract void mo4768a(C5486e<T> c5486e);

    /* renamed from: b */
    public final T m23943b() {
        return this.f20504a;
    }

    /* renamed from: a */
    private void m23935a(int i) {
        while (!this.f20506c.isEmpty() && ((C5482a) this.f20506c.getLast()).mo5636a() >= i) {
            this.f20506c.removeLast();
        }
    }

    /* renamed from: a */
    private void m23936a(Bundle bundle, C5482a c5482a) {
        if (this.f20504a != null) {
            c5482a.mo5637b();
            return;
        }
        if (this.f20506c == null) {
            this.f20506c = new LinkedList();
        }
        this.f20506c.add(c5482a);
        if (bundle != null) {
            if (this.f20505b == null) {
                this.f20505b = (Bundle) bundle.clone();
            } else {
                this.f20505b.putAll(bundle);
            }
        }
        mo4768a(this.f20507d);
    }

    /* renamed from: a */
    public final void m23940a(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        m23936a(bundle2, new C5482a(this) {
            /* renamed from: d */
            private /* synthetic */ C5483a f25235d;

            /* renamed from: a */
            public final int mo5636a() {
                return 0;
            }

            /* renamed from: b */
            public final void mo5637b() {
                this.f25235d.f20504a.mo6970a(activity, bundle, bundle2);
            }
        });
    }

    /* renamed from: a */
    public final void m23941a(final Bundle bundle) {
        m23936a(bundle, new C5482a(this) {
            /* renamed from: b */
            private /* synthetic */ C5483a f25237b;

            /* renamed from: a */
            public final int mo5636a() {
                return 1;
            }

            /* renamed from: b */
            public final void mo5637b() {
                this.f25237b.f20504a.mo6971a(bundle);
            }
        });
    }

    /* renamed from: a */
    public final View m23939a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        final View view = frameLayout;
        final LayoutInflater layoutInflater2 = layoutInflater;
        final ViewGroup viewGroup2 = viewGroup;
        final Bundle bundle2 = bundle;
        m23936a(bundle, new C5482a(this) {
            /* renamed from: e */
            private /* synthetic */ C5483a f25242e;

            /* renamed from: a */
            public final int mo5636a() {
                return 2;
            }

            /* renamed from: b */
            public final void mo5637b() {
                view.removeAllViews();
                view.addView(this.f25242e.f20504a.mo6968a(layoutInflater2, viewGroup2, bundle2));
            }
        });
        if (this.f20504a == null) {
            C5483a.m23937a(frameLayout);
        }
        return frameLayout;
    }

    /* renamed from: a */
    public static void m23937a(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        int a = C5398g.m23576a(context);
        CharSequence a2 = C5442g.m23675a(context, a, C5398g.m23587c(context));
        CharSequence a3 = C5442g.m23674a(context, a);
        View linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        View textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(a2);
        linearLayout.addView(textView);
        if (a3 != null) {
            frameLayout = new Button(context);
            frameLayout.setLayoutParams(new LayoutParams(-2, -2));
            frameLayout.setText(a3);
            linearLayout.addView(frameLayout);
            frameLayout.setOnClickListener(new C54815(context, a));
        }
    }

    /* renamed from: c */
    public final void m23945c() {
        m23936a(null, new C67336(this));
    }

    /* renamed from: d */
    public final void m23946d() {
        if (this.f20504a != null) {
            this.f20504a.mo6972b();
        } else {
            m23935a(5);
        }
    }

    /* renamed from: e */
    public final void m23947e() {
        if (this.f20504a != null) {
            this.f20504a.mo6974c();
        } else {
            m23935a(2);
        }
    }

    /* renamed from: f */
    public final void m23948f() {
        if (this.f20504a != null) {
            this.f20504a.mo6975d();
        } else {
            m23935a(1);
        }
    }

    /* renamed from: b */
    public final void m23944b(Bundle bundle) {
        if (this.f20504a != null) {
            this.f20504a.mo6973b(bundle);
            return;
        }
        if (this.f20505b != null) {
            bundle.putAll(this.f20505b);
        }
    }

    /* renamed from: g */
    public final void m23949g() {
        if (this.f20504a != null) {
            this.f20504a.mo6976e();
        }
    }
}
