package com.tinder.bitmoji.di;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.bitmoji.C10376d;
import com.tinder.bitmoji.C10378h;
import com.tinder.bitmoji.C10380k;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory;
import com.tinder.bitmoji.analytics.C10370a;
import com.tinder.bitmoji.di.BitmojiComponent.Parent;
import com.tinder.bitmoji.p177a.C10366a;
import com.tinder.bitmoji.p177a.C10367b;
import com.tinder.bitmoji.presenter.C8329a;
import com.tinder.bitmoji.presenter.C8330c;
import com.tinder.bitmoji.repository.BitmojiAuthRepository;
import com.tinder.bitmoji.repository.BitmojiImageUrlRepository;
import com.tinder.bitmoji.view.BitmojiIconView;
import com.tinder.bitmoji.view.C10397a;
import com.tinder.domain.injection.modules.RxSchedulersModule;
import com.tinder.domain.injection.modules.RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.usecase.GetProfileOptionData;
import dagger.internal.C15521i;
import io.reactivex.C15679f;

/* renamed from: com.tinder.bitmoji.di.a */
public final class C3921a implements BitmojiComponent {
    /* renamed from: a */
    private Parent f12220a;
    /* renamed from: b */
    private RxSchedulersModule f12221b;

    /* renamed from: com.tinder.bitmoji.di.a$a */
    public static final class C2638a {
        /* renamed from: a */
        private RxSchedulersModule f8224a;
        /* renamed from: b */
        private Parent f8225b;

        private C2638a() {
        }

        /* renamed from: a */
        public BitmojiComponent m9958a() {
            if (this.f8224a == null) {
                this.f8224a = new RxSchedulersModule();
            }
            if (this.f8225b != null) {
                return new C3921a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C2638a m9959a(Parent parent) {
            this.f8225b = (Parent) C15521i.a(parent);
            return this;
        }
    }

    private C3921a(C2638a c2638a) {
        m14713a(c2638a);
    }

    /* renamed from: a */
    public static C2638a m14711a() {
        return new C2638a();
    }

    /* renamed from: b */
    private C10378h m14714b() {
        return new C10378h((BitmojiAuthRepository) C15521i.a(this.f12220a.bitmojiAuthRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: c */
    private GetProfileOptionData m14715c() {
        return new GetProfileOptionData((ProfileLocalRepository) C15521i.a(this.f12220a.profileLocalRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: d */
    private C10370a m14716d() {
        return new C10370a((C2630h) C15521i.a(this.f12220a.fireworks(), "Cannot return null from a non-@Nullable component method"), new AppTutorialEventFactory(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(this.f12221b));
    }

    /* renamed from: e */
    private C8330c m14717e() {
        return new C8330c(m14714b(), m14715c(), m14716d(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(this.f12221b), (C15679f) C15521i.a(this.f12220a.mainThreadScheduler(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: f */
    private C10380k m14718f() {
        return new C10380k((BitmojiAuthRepository) C15521i.a(this.f12220a.bitmojiAuthRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: g */
    private C10376d m14719g() {
        return new C10376d((BitmojiAuthRepository) C15521i.a(this.f12220a.bitmojiAuthRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: h */
    private C8329a m14720h() {
        return new C8329a((BitmojiImageUrlRepository) C15521i.a(this.f12220a.bitmojiImageUrlRepository(), "Cannot return null from a non-@Nullable component method"), m14718f(), m14719g(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(this.f12221b), (C15679f) C15521i.a(this.f12220a.mainThreadScheduler(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: a */
    private void m14713a(C2638a c2638a) {
        this.f12220a = c2638a.f8225b;
        this.f12221b = c2638a.f8224a;
    }

    public void inject(C10366a c10366a) {
        m14710a(c10366a);
    }

    public void inject(BitmojiIconView bitmojiIconView) {
        m14712a(bitmojiIconView);
    }

    /* renamed from: a */
    private C10366a m14710a(C10366a c10366a) {
        C10367b.a(c10366a, m14717e());
        return c10366a;
    }

    /* renamed from: a */
    private BitmojiIconView m14712a(BitmojiIconView bitmojiIconView) {
        C10397a.a(bitmojiIconView, m14720h());
        return bitmojiIconView;
    }
}
