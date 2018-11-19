package com.tinder.passport.p359e;

import android.support.annotation.NonNull;
import com.tinder.module.Default;
import com.tinder.passport.p301b.C10038a;
import com.tinder.passport.p302c.C10039a;
import com.tinder.passport.target.PassportTarget;
import com.tinder.presenters.PresenterBase;
import de.greenrobot.event.C2664c;
import javax.inject.Inject;

/* renamed from: com.tinder.passport.e.a */
public class C13543a extends PresenterBase<PassportTarget> {
    /* renamed from: a */
    private final C10039a f43263a;
    /* renamed from: b */
    private final C2664c f43264b;

    @Inject
    C13543a(C10039a c10039a, @Default C2664c c2664c) {
        this.f43263a = c10039a;
        this.f43264b = c2664c;
    }

    /* renamed from: a */
    public void m52926a(@NonNull PassportTarget passportTarget) {
        super.a(passportTarget);
        if (this.f43264b.b(this) == null) {
            this.f43264b.a(this);
        }
    }

    /* renamed from: a */
    public void m52925a() {
        super.a();
        this.f43264b.c(this);
    }

    /* renamed from: b */
    public void m52929b() {
        this.f43263a.m41085a().a(new C14122b(this), C14123c.f44819a);
    }

    /* renamed from: a */
    final /* synthetic */ void m52927a(Boolean bool) {
        PassportTarget passportTarget = (PassportTarget) H();
        if (passportTarget != null && bool != null && bool.booleanValue() != null) {
            passportTarget.setPassportLocation();
            this.f43263a.m41086b();
        }
    }

    public void onEvent(C10038a c10038a) {
        m52929b();
    }
}
