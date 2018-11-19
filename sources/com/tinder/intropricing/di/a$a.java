package com.tinder.intropricing.di;

import android.content.res.Resources;
import com.tinder.intropricing.di.IntroPricingApplicationComponent.Builder;
import com.tinder.intropricing.di.IntroPricingApplicationComponent.Parent;
import dagger.internal.C15521i;

final class a$a implements Builder {
    /* renamed from: a */
    private Parent f38733a;
    /* renamed from: b */
    private Resources f38734b;

    private a$a() {
    }

    public /* synthetic */ Builder parent(Parent parent) {
        return m47865a(parent);
    }

    public /* synthetic */ Builder resources(Resources resources) {
        return m47864a(resources);
    }

    public IntroPricingApplicationComponent build() {
        StringBuilder stringBuilder;
        if (this.f38733a == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.f38734b != null) {
            return new C3932a(this, null);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(Resources.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public a$a m47865a(Parent parent) {
        this.f38733a = (Parent) C15521i.a(parent);
        return this;
    }

    /* renamed from: a */
    public a$a m47864a(Resources resources) {
        this.f38734b = (Resources) C15521i.a(resources);
        return this;
    }
}
