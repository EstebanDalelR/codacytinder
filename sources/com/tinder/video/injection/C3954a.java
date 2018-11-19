package com.tinder.video.injection;

import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.tinder.video.activities.C17243a;
import com.tinder.video.activities.FullscreenVideoActivity;
import com.tinder.video.injection.VideoComponent.Parent;
import com.tinder.video.injection.p448a.C15414a;
import com.tinder.video.injection.p448a.C18291b;
import com.tinder.video.injection.p448a.C18292c;
import com.tinder.video.injection.p448a.C18293d;
import com.tinder.video.injection.p448a.C18294e;
import com.tinder.video.injection.p448a.C18295f;
import com.tinder.video.p445b.C15410a;
import com.tinder.video.p446c.C15412a;
import com.tinder.video.p446c.C18290b;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import javax.inject.Provider;

/* renamed from: com.tinder.video.injection.a */
public final class C3954a implements VideoComponent {
    /* renamed from: a */
    private a$b f12549a;
    /* renamed from: b */
    private Provider<Factory> f12550b;
    /* renamed from: c */
    private C18293d f12551c;
    /* renamed from: d */
    private C18291b f12552d;
    /* renamed from: e */
    private C18294e f12553e;
    /* renamed from: f */
    private C18295f f12554f;
    /* renamed from: g */
    private Provider<C15412a> f12555g;

    /* renamed from: com.tinder.video.injection.a$a */
    public static final class C2660a {
        /* renamed from: a */
        private C15414a f8405a;
        /* renamed from: b */
        private Parent f8406b;

        private C2660a() {
        }

        /* renamed from: a */
        public VideoComponent m10232a() {
            if (this.f8405a == null) {
                this.f8405a = new C15414a();
            }
            if (this.f8406b != null) {
                return new C3954a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C2660a m10233a(Parent parent) {
            this.f8406b = (Parent) C15521i.a(parent);
            return this;
        }
    }

    private C3954a(C2660a c2660a) {
        m15150a(c2660a);
    }

    /* renamed from: a */
    public static C2660a m15149a() {
        return new C2660a();
    }

    /* renamed from: a */
    private void m15150a(C2660a c2660a) {
        this.f12549a = new a$b(c2660a.f8406b);
        this.f12550b = C17281c.a(C18292c.b(c2660a.f8405a, this.f12549a));
        this.f12551c = C18293d.b(c2660a.f8405a);
        this.f12552d = C18291b.b(c2660a.f8405a);
        this.f12553e = C18294e.b(c2660a.f8405a, this.f12552d);
        this.f12554f = C18295f.b(c2660a.f8405a, this.f12553e);
        this.f12555g = C17281c.a(C18290b.b(this.f12550b, this.f12551c, this.f12554f, this.f12549a));
    }

    public void inject(FullscreenVideoActivity fullscreenVideoActivity) {
        m15148a(fullscreenVideoActivity);
    }

    /* renamed from: a */
    private FullscreenVideoActivity m15148a(FullscreenVideoActivity fullscreenVideoActivity) {
        C17243a.a(fullscreenVideoActivity, new C15410a());
        C17243a.a(fullscreenVideoActivity, (C15412a) this.f12555g.get());
        return fullscreenVideoActivity;
    }
}
