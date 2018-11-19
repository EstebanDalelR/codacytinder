package com.tinder.application;

import android.support.v7.app.AppCompatActivity;
import com.tinder.profile.module.C14421a;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.module.ProfileComponent.Builder;
import dagger.internal.C15521i;

final class a$ab implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33437a;
    /* renamed from: b */
    private C14421a f33438b;
    /* renamed from: c */
    private AppCompatActivity f33439c;

    private a$ab(C4423a c4423a) {
        this.f33437a = c4423a;
    }

    public /* synthetic */ Builder profileActivityContext(AppCompatActivity appCompatActivity) {
        return m41693a(appCompatActivity);
    }

    public ProfileComponent build() {
        if (this.f33438b == null) {
            this.f33438b = new C14421a();
        }
        if (this.f33439c != null) {
            return new a$ac(this.f33437a, this, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AppCompatActivity.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$ab m41693a(AppCompatActivity appCompatActivity) {
        this.f33439c = (AppCompatActivity) C15521i.a(appCompatActivity);
        return this;
    }
}
