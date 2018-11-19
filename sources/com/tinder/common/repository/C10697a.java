package com.tinder.common.repository;

import android.support.annotation.Nullable;
import com.tinder.enums.Gender;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.model.User;
import com.tinder.p071a.C3870m;
import java.util.ArrayList;
import java.util.List;
import rx.Observable;

@Deprecated
/* renamed from: com.tinder.common.repository.a */
public class C10697a implements MyUserRepository {
    /* renamed from: a */
    private final bk f35039a;
    /* renamed from: b */
    private final bj f35040b;

    public C10697a(bk bkVar, bj bjVar) {
        this.f35039a = bkVar;
        this.f35040b = bjVar;
    }

    @Deprecated
    public Observable<User> loadMyUser() {
        return Observable.a(new C8552b(this));
    }

    /* renamed from: a */
    final /* synthetic */ User m43016a() throws Exception {
        User a = C3870m.a(this.f35039a.K());
        m43014a(a);
        return a;
    }

    /* renamed from: a */
    private void m43014a(@Nullable User user) {
        if (user != null) {
            user.setInterestedIn(m43015b());
            user.setAgeFilterMin(this.f35040b.c());
            user.setAgeFilterMax(this.f35040b.d());
            user.setDiscoverable(this.f35040b.g());
            user.setDistanceFilter((int) this.f35040b.b());
        }
    }

    /* renamed from: b */
    private List<Gender> m43015b() {
        boolean f = this.f35040b.f();
        boolean e = this.f35040b.e();
        List<Gender> arrayList = new ArrayList();
        if (e && f) {
            arrayList.add(Gender.MALE);
            arrayList.add(Gender.FEMALE);
        } else if (e) {
            arrayList.add(Gender.FEMALE);
        } else if (f) {
            arrayList.add(Gender.MALE);
        }
        return arrayList;
    }
}
