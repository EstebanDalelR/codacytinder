package com.tinder.tinderplus.p428a;

import android.support.annotation.NonNull;
import com.tinder.data.purchase.p091a.C10985c;
import com.tinder.data.purchase.p091a.C3927e;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.tinderplus.provider.C15220b;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;

@Singleton
/* renamed from: com.tinder.tinderplus.a.i */
public class C15193i {
    /* renamed from: a */
    private final C15220b f47252a;
    /* renamed from: b */
    private final LikeStatusProvider f47253b;
    /* renamed from: c */
    private final SubscriptionProvider f47254c;
    /* renamed from: d */
    private final C10985c f47255d;
    /* renamed from: e */
    private final C3927e f47256e;

    @Inject
    public C15193i(C15220b c15220b, LikeStatusProvider likeStatusProvider, SubscriptionProvider subscriptionProvider, C10985c c10985c, C3927e c3927e) {
        this.f47252a = c15220b;
        this.f47253b = likeStatusProvider;
        this.f47254c = subscriptionProvider;
        this.f47255d = c10985c;
        this.f47256e = c3927e;
    }

    /* renamed from: a */
    public boolean m57121a() {
        return this.f47254c.get().isPlus();
    }

    @Deprecated
    /* renamed from: b */
    public Observable<Boolean> m57122b() {
        return this.f47254c.observe().k(C18205j.f56442a);
    }

    /* renamed from: c */
    public boolean m57123c() {
        if (!m57121a()) {
            if (!m57119g()) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    /* renamed from: a */
    public void m57120a(String str) {
        this.f47255d.a(str).d();
        this.f47253b.resetLikeStatus();
    }

    @NonNull
    /* renamed from: d */
    public List<String> m57124d() {
        return this.f47252a.m57278a().mo12562b();
    }

    /* renamed from: e */
    public boolean m57125e() {
        return this.f47252a.m57278a().mo12565e().booleanValue();
    }

    /* renamed from: f */
    public boolean m57126f() {
        return this.f47252a.m57278a().mo12564d().booleanValue();
    }

    /* renamed from: g */
    private boolean m57119g() {
        return this.f47252a.m57278a().mo12561a().booleanValue();
    }
}
