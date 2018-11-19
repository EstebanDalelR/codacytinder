package com.tinder.application;

import com.tinder.settings.loops.activity.AutoPlayLoopsOptionsActivity;
import com.tinder.settings.loops.injection.AutoPlayLoopsOptionsActivityComponent;
import com.tinder.settings.loops.injection.AutoPlayLoopsOptionsActivityComponent.Builder;
import dagger.internal.C15521i;

final class a$a implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33434a;
    /* renamed from: b */
    private AutoPlayLoopsOptionsActivity f33435b;

    private a$a(C4423a c4423a) {
        this.f33434a = c4423a;
    }

    public /* synthetic */ Builder autoPlayLoopsOptionsActivity(AutoPlayLoopsOptionsActivity autoPlayLoopsOptionsActivity) {
        return m41687a(autoPlayLoopsOptionsActivity);
    }

    public AutoPlayLoopsOptionsActivityComponent build() {
        if (this.f33435b != null) {
            return new a$b(this.f33434a, this, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AutoPlayLoopsOptionsActivity.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$a m41687a(AutoPlayLoopsOptionsActivity autoPlayLoopsOptionsActivity) {
        this.f33435b = (AutoPlayLoopsOptionsActivity) C15521i.a(autoPlayLoopsOptionsActivity);
        return this;
    }
}
