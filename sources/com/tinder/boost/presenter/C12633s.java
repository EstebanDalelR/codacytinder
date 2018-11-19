package com.tinder.boost.presenter;

import com.tinder.R;
import com.tinder.boost.model.BoostState;
import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.p178a.C8337b;
import com.tinder.boost.provider.BoostUpdateProvider;
import com.tinder.boost.provider.C2639c;
import com.tinder.boost.target.BoostUpdateTarget;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.boost.model.BoostStatusExt;
import com.tinder.model.DefaultObserver;
import com.tinder.paywall.p305d.C10057a;
import com.tinder.presenters.PresenterBase;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.RxUtils;
import java.text.DecimalFormat;
import javax.inject.Inject;
import rx.Subscription;
import rx.p500e.C19573b;

/* renamed from: com.tinder.boost.presenter.s */
public class C12633s extends PresenterBase<BoostUpdateTarget> {
    /* renamed from: a */
    private final C10400d f40758a;
    /* renamed from: b */
    private final BoostUpdateProvider f40759b;
    /* renamed from: c */
    private final C2639c f40760c;
    /* renamed from: d */
    private final C19573b f40761d = new C19573b();
    /* renamed from: e */
    private final C15193i f40762e;
    /* renamed from: f */
    private final C10057a f40763f;
    /* renamed from: g */
    private final C8337b f40764g;
    /* renamed from: h */
    private final DecimalFormat f40765h = new DecimalFormat("#.0");

    /* renamed from: com.tinder.boost.presenter.s$3 */
    class C126323 extends DefaultObserver<Float> {
        /* renamed from: a */
        final /* synthetic */ C12633s f40757a;

        C126323(C12633s c12633s) {
            this.f40757a = c12633s;
        }

        public /* synthetic */ void onNext(Object obj) {
            m49878a((Float) obj);
        }

        /* renamed from: a */
        public void m49878a(Float f) {
            BoostUpdateTarget boostUpdateTarget = (BoostUpdateTarget) this.f40757a.H();
            if (boostUpdateTarget != null) {
                boostUpdateTarget.showBoostPercent(f);
            }
        }
    }

    @Inject
    public C12633s(C10400d c10400d, BoostUpdateProvider boostUpdateProvider, C15193i c15193i, C10057a c10057a, C8337b c8337b, C2639c c2639c) {
        this.f40758a = c10400d;
        this.f40759b = boostUpdateProvider;
        this.f40762e = c15193i;
        this.f40763f = c10057a;
        this.f40764g = c8337b;
        this.f40760c = c2639c;
    }

    /* renamed from: a */
    public void m49881a() {
        super.a();
        this.f40761d.unsubscribe();
    }

    /* renamed from: b */
    public void m49882b() {
        m49884d();
        m49880f();
        m49885e();
        this.f40764g.m35508d();
    }

    /* renamed from: c */
    public long m49883c() {
        return this.f40758a.m42285h();
    }

    /* renamed from: d */
    void m49884d() {
        BoostUpdateTarget boostUpdateTarget = (BoostUpdateTarget) H();
        if (boostUpdateTarget != null) {
            BoostStatus e = this.f40758a.m42282e();
            if (e != null) {
                boostUpdateTarget.showDescription(BoostStatusExt.multiplierString(e));
                boostUpdateTarget.showEmitterWithDuration(this.f40758a.m42277c());
            }
        }
    }

    /* renamed from: f */
    private void m49880f() {
        final BoostUpdateTarget boostUpdateTarget = (BoostUpdateTarget) H();
        Subscription a = this.f40759b.a().a(RxUtils.a()).a(new DefaultObserver<String>(this) {
            /* renamed from: b */
            final /* synthetic */ C12633s f40754b;

            public /* synthetic */ void onNext(Object obj) {
                m49876a((String) obj);
            }

            /* renamed from: a */
            public void m49876a(String str) {
                if (boostUpdateTarget != null) {
                    boostUpdateTarget.updateMultiplierText(str);
                }
            }
        });
        Subscription a2 = this.f40759b.b().a(RxUtils.a()).a(new DefaultObserver<Long>(this) {
            /* renamed from: b */
            final /* synthetic */ C12633s f40756b;

            public /* synthetic */ void onNext(Object obj) {
                m49877a((Long) obj);
            }

            /* renamed from: a */
            public void m49877a(Long l) {
                if (boostUpdateTarget != null) {
                    boostUpdateTarget.showTimerText(l.longValue());
                }
            }
        });
        Subscription a3 = this.f40759b.c().a(RxUtils.a()).a(new C126323(this));
        Subscription a4 = this.f40760c.a().a(RxUtils.a()).a(new C13651t(boostUpdateTarget), C13652u.f43495a);
        this.f40761d.a(new Subscription[]{a, a2, a3, a4});
    }

    /* renamed from: a */
    static final /* synthetic */ void m49879a(BoostUpdateTarget boostUpdateTarget, BoostState boostState) {
        if (boostUpdateTarget != null && boostState == BoostState.COMPLETED) {
            boostUpdateTarget.showFinished();
        }
    }

    /* renamed from: e */
    void m49885e() {
        BoostUpdateTarget boostUpdateTarget = (BoostUpdateTarget) H();
        if (boostUpdateTarget != null) {
            if (this.f40762e.a()) {
                boostUpdateTarget.showSubscriberSection();
            } else {
                boostUpdateTarget.showNonSubscriberSection(this.f40763f.m41124a((int) R.string.boost_summary_info_title_upsell, this.f40758a.m42282e()), this.f40763f.m41124a((int) R.string.boost_summary_info_description_upsell, this.f40758a.m42282e()));
            }
        }
    }
}
