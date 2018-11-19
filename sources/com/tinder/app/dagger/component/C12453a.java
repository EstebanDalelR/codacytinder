package com.tinder.app.dagger.component;

import com.tinder.messageads.p294a.C9898a;
import com.tinder.messageads.p295b.C12121b;
import com.tinder.messageads.p295b.C13471a;
import com.tinder.messageads.p297d.C13473b;
import com.tinder.messageads.p297d.C13474c;
import com.tinder.messageads.p297d.C13475d;
import com.tinder.messageads.p297d.C9907a;
import com.tinder.messageads.p298e.C9910c;
import com.tinder.messageads.p350g.C12130c;
import com.tinder.messageads.p350g.C13478b;
import com.tinder.messageads.provider.C9913a;
import com.tinder.messageads.repository.MessageAdSettingsRepository;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.component.a */
public final class C12453a implements MessageAdSettingsViewComponent {
    /* renamed from: a */
    private C9907a f40150a;
    /* renamed from: b */
    private C13475d f40151b;
    /* renamed from: c */
    private C13473b f40152c;
    /* renamed from: d */
    private C13478b f40153d;
    /* renamed from: e */
    private Provider<C9913a> f40154e;

    /* renamed from: com.tinder.app.dagger.component.a$a */
    public static final class C8242a {
        /* renamed from: a */
        private C9907a f29464a;

        private C8242a() {
        }

        /* renamed from: a */
        public MessageAdSettingsViewComponent m35137a() {
            if (this.f29464a != null) {
                return new C12453a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C9907a.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C8242a m35138a(C9907a c9907a) {
            this.f29464a = (C9907a) C15521i.a(c9907a);
            return this;
        }
    }

    private C12453a(C8242a c8242a) {
        m48948a(c8242a);
    }

    /* renamed from: a */
    public static C8242a m48946a() {
        return new C8242a();
    }

    /* renamed from: b */
    private C9910c m48949b() {
        return new C9910c((C9913a) this.f40154e.get());
    }

    /* renamed from: c */
    private MessageAdSettingsRepository m48950c() {
        return C13473b.m52033a(this.f40150a, C13475d.m52043c(this.f40150a));
    }

    /* renamed from: d */
    private C12130c m48951d() {
        return new C12130c(m48950c());
    }

    /* renamed from: e */
    private C9898a m48952e() {
        return new C9898a((C9913a) this.f40154e.get(), m48951d());
    }

    /* renamed from: a */
    private void m48948a(C8242a c8242a) {
        this.f40151b = C13475d.m52042b(c8242a.f29464a);
        this.f40152c = C13473b.m52035b(c8242a.f29464a, this.f40151b);
        this.f40153d = C13478b.m52050b(this.f40152c);
        this.f40154e = C17281c.a(C13474c.m52039b(c8242a.f29464a, this.f40153d));
        this.f40150a = c8242a.f29464a;
    }

    public void inject(C13471a c13471a) {
        m48947a(c13471a);
    }

    /* renamed from: a */
    private C13471a m48947a(C13471a c13471a) {
        C12121b.m48261a(c13471a, m48949b());
        C12121b.m48260a(c13471a, m48952e());
        return c13471a;
    }
}
