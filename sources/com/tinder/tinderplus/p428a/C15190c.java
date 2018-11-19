package com.tinder.tinderplus.p428a;

import android.support.annotation.NonNull;
import com.tinder.api.ManagerNetwork;
import com.tinder.passport.model.PassportLocation;
import com.tinder.passport.p093d.C3945a;
import java.util.List;
import javax.inject.Inject;

/* renamed from: com.tinder.tinderplus.a.c */
public class C15190c {
    /* renamed from: a */
    private final ManagerNetwork f47238a;
    /* renamed from: b */
    private final C3945a f47239b;
    /* renamed from: c */
    private final C15193i f47240c;

    @Inject
    public C15190c(ManagerNetwork managerNetwork, C3945a c3945a, C15193i c15193i) {
        this.f47238a = managerNetwork;
        this.f47239b = c3945a;
        this.f47240c = c15193i;
    }

    /* renamed from: a */
    public boolean m57106a(@NonNull PassportLocation passportLocation) {
        if (this.f47240c.m57121a()) {
            PassportLocation b = this.f47239b.b();
            Object obj = (b == null || !b.equals(passportLocation)) ? null : 1;
            if (obj == null) {
                this.f47238a.cancelRequestsWithTag("travel_request");
                this.f47239b.d(passportLocation);
                this.f47239b.a(passportLocation);
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: a */
    public List<PassportLocation> m57105a() {
        return this.f47239b.a(4);
    }
}
