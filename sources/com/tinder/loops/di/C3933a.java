package com.tinder.loops.di;

import android.arch.lifecycle.C0029n;
import android.arch.lifecycle.ViewModelProvider.Factory;
import android.content.Context;
import com.tinder.base.p172b.C12612b;
import com.tinder.loops.data.C11929a;
import com.tinder.loops.data.C11931e;
import com.tinder.loops.data.C13353b;
import com.tinder.loops.data.C13354d;
import com.tinder.loops.data.C13355f;
import com.tinder.loops.di.LoopsApplicationComponent.Parent;
import com.tinder.loops.di.MediaSelectorActivitySubComponent.Builder;
import com.tinder.loops.di.p271a.C13356b;
import com.tinder.loops.di.p271a.C13357c;
import com.tinder.loops.di.p271a.C13358d;
import com.tinder.loops.di.p271a.C9767a;
import com.tinder.loops.engine.creation.C13360b;
import com.tinder.loops.engine.creation.C13363d;
import com.tinder.loops.engine.creation.p276c.C13361b;
import com.tinder.loops.engine.creation.p276c.C13362d;
import com.tinder.loops.engine.creation.p278e.C13364b;
import com.tinder.loops.engine.creation.p278e.C13365d;
import com.tinder.loops.engine.creation.p278e.C13366g;
import com.tinder.loops.engine.creation.video.C13367b;
import com.tinder.loops.engine.extraction.C13369b;
import com.tinder.loops.engine.extraction.decoder.C13373b;
import com.tinder.loops.engine.extraction.decoder.filter.C13375b;
import com.tinder.loops.engine.extraction.extractor.C13377b;
import com.tinder.loops.engine.extraction.p279a.C13368b;
import com.tinder.loops.engine.extraction.p282d.C13370b;
import com.tinder.loops.engine.extraction.p282d.C13371d;
import com.tinder.loops.engine.extraction.p282d.C13372f;
import com.tinder.loops.engine.extraction.p283e.C13376b;
import com.tinder.loops.engine.extraction.retriever.C13378b;
import com.tinder.loops.p269c.C13352b;
import com.tinder.loops.p269c.C9763a;
import com.tinder.loops.ui.viewmodels.C13381b;
import com.tinder.loops.ui.viewmodels.C13382c;
import com.tinder.loops.ui.viewmodels.C13383e;
import com.tinder.loops.ui.viewmodels.C13384f;
import com.tinder.loops.ui.viewmodels.VideoCreationViewModel;
import com.tinder.loops.ui.viewmodels.VideoCropperViewModel;
import com.tinder.loops.ui.viewmodels.VideoExtractorViewModel;
import com.tinder.loops.ui.viewmodels.VideoFrameViewModel;
import com.tinder.rx.RxSchedulerProvider;
import com.tinder.viewmodel.C17260a;
import com.tinder.viewmodel.C18298b;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.C18319g;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.tinder.loops.di.a */
public final class C3933a implements LoopsApplicationComponent {
    /* renamed from: a */
    private Parent f12309a;
    /* renamed from: b */
    private C9767a f12310b;
    /* renamed from: c */
    private Provider<C9763a> f12311c;
    /* renamed from: d */
    private C13364b f12312d;
    /* renamed from: e */
    private C13367b f12313e;
    /* renamed from: f */
    private a$f f12314f;
    /* renamed from: g */
    private Provider<Context> f12315g;
    /* renamed from: h */
    private C13363d f12316h;
    /* renamed from: i */
    private C13360b f12317i;
    /* renamed from: j */
    private Provider<C11929a> f12318j;
    /* renamed from: k */
    private Provider<RxSchedulerProvider> f12319k;
    /* renamed from: l */
    private Provider<C11931e> f12320l;
    /* renamed from: m */
    private C13381b f12321m;
    /* renamed from: n */
    private C13377b f12322n;
    /* renamed from: o */
    private C13378b f12323o;
    /* renamed from: p */
    private C13370b f12324p;
    /* renamed from: q */
    private C13373b f12325q;
    /* renamed from: r */
    private C13369b f12326r;
    /* renamed from: s */
    private C13383e f12327s;
    /* renamed from: t */
    private C13382c f12328t;
    /* renamed from: u */
    private C13354d f12329u;
    /* renamed from: v */
    private C13384f f12330v;
    /* renamed from: w */
    private Provider<Map<Class<? extends C0029n>, Provider<C0029n>>> f12331w;
    /* renamed from: x */
    private Provider<C17260a> f12332x;
    /* renamed from: y */
    private Provider<Factory> f12333y;

    /* renamed from: com.tinder.loops.di.a$a */
    public static final class C2648a {
        /* renamed from: a */
        private C9767a f8297a;
        /* renamed from: b */
        private Parent f8298b;

        private C2648a() {
        }

        /* renamed from: a */
        public LoopsApplicationComponent m10053a() {
            if (this.f8297a == null) {
                this.f8297a = new C9767a();
            }
            if (this.f8298b != null) {
                return new C3933a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C2648a m10054a(Parent parent) {
            this.f8298b = (Parent) C15521i.a(parent);
            return this;
        }
    }

    private C3933a(C2648a c2648a) {
        m14838a(c2648a);
    }

    /* renamed from: a */
    public static C2648a m14836a() {
        return new C2648a();
    }

    /* renamed from: a */
    private void m14838a(C2648a c2648a) {
        this.f12311c = C17281c.a(C13352b.b(C12612b.c()));
        this.f12309a = c2648a.f8298b;
        this.f12310b = c2648a.f8297a;
        this.f12312d = C13364b.b(C13366g.c(), C13365d.c());
        this.f12313e = C13367b.b(C13362d.c(), C13361b.c(), C13368b.c(), this.f12312d);
        this.f12314f = new a$f(c2648a.f8298b);
        this.f12315g = C17281c.a(C13357c.b(c2648a.f8297a, this.f12314f));
        this.f12316h = C13363d.b(this.f12315g);
        this.f12317i = C13360b.b(this.f12313e, this.f12316h);
        this.f12318j = C17281c.a(C13353b.c());
        this.f12319k = C17281c.a(C13358d.b(c2648a.f8297a));
        this.f12320l = C17281c.a(C13355f.c());
        this.f12321m = C13381b.b(this.f12317i, this.f12318j, this.f12319k, this.f12320l);
        this.f12322n = C13377b.b(this.f12315g);
        this.f12323o = C13378b.b(this.f12315g);
        this.f12324p = C13370b.b(C13372f.c(), C13371d.c());
        this.f12325q = C13373b.b(C13376b.c(), this.f12322n, this.f12323o, C13368b.c(), this.f12324p);
        this.f12326r = C13369b.b(this.f12325q, C13375b.c());
        this.f12327s = C13383e.b(this.f12326r, this.f12318j, this.f12319k);
        this.f12328t = C13382c.b(this.f12320l);
        this.f12329u = C13354d.b(this.f12326r, this.f12323o, this.f12319k);
        this.f12330v = C13384f.b(this.f12329u, this.f12319k);
        this.f12331w = C18319g.a(4).a(VideoCreationViewModel.class, this.f12321m).a(VideoExtractorViewModel.class, this.f12327s).a(VideoCropperViewModel.class, this.f12328t).a(VideoFrameViewModel.class, this.f12330v).a();
        this.f12332x = C17281c.a(C18298b.b(this.f12331w));
        this.f12333y = C17281c.a(C13356b.b(c2648a.f8297a, this.f12332x));
    }

    public Builder mediaSelectorActivityComponentBuilder() {
        return new a$b(this, null);
    }

    public TrimAndCropActivitySubcomponent.Builder TrimAndCropActivitySubcomponentBuilder() {
        return new a$d(this, null);
    }
}
