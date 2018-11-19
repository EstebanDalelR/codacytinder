package com.tinder.application;

import com.tinder.activities.MainActivity;
import com.tinder.app.dagger.component.MainActivityComponent;
import com.tinder.app.dagger.component.MainActivityComponent.Builder;
import com.tinder.app.dagger.module.C8253o;
import com.tinder.app.dagger.module.ad;
import com.tinder.app.dagger.module.main.C8251a;
import com.tinder.app.dagger.module.p159a.C8243a;
import com.tinder.match.sponsoredmessage.C9882h;
import com.tinder.places.p156a.C6251e;
import com.tinder.toppicks.badge.TopPicksTriggerModule;
import dagger.internal.C15521i;

final class a$m implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33551a;
    /* renamed from: b */
    private TopPicksTriggerModule f33552b;
    /* renamed from: c */
    private C8251a f33553c;
    /* renamed from: d */
    private C6251e f33554d;
    /* renamed from: e */
    private ad f33555e;
    /* renamed from: f */
    private C9882h f33556f;
    /* renamed from: g */
    private C8253o f33557g;
    /* renamed from: h */
    private C8243a f33558h;
    /* renamed from: i */
    private MainActivity f33559i;

    private a$m(C4423a c4423a) {
        this.f33551a = c4423a;
    }

    public /* synthetic */ Builder mainActivity(MainActivity mainActivity) {
        return m41857a(mainActivity);
    }

    public MainActivityComponent build() {
        if (this.f33552b == null) {
            this.f33552b = new TopPicksTriggerModule();
        }
        if (this.f33553c == null) {
            this.f33553c = new C8251a();
        }
        if (this.f33554d == null) {
            this.f33554d = new C6251e();
        }
        if (this.f33555e == null) {
            this.f33555e = new ad();
        }
        if (this.f33556f == null) {
            this.f33556f = new C9882h();
        }
        if (this.f33557g == null) {
            this.f33557g = new C8253o();
        }
        if (this.f33558h == null) {
            this.f33558h = new C8243a();
        }
        if (this.f33559i != null) {
            return new a$n(this.f33551a, this, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(MainActivity.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$m m41857a(MainActivity mainActivity) {
        this.f33559i = (MainActivity) C15521i.a(mainActivity);
        return this;
    }
}
