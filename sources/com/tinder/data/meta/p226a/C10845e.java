package com.tinder.data.meta.p226a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.User;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C10742q;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.meta.model.CurrentUser;
import java8.util.Objects;
import javax.inject.Inject;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.meta.a.e */
public class C10845e extends C2646o<CurrentUser, User> {
    @NonNull
    /* renamed from: a */
    private final C10844c f35466a;
    @NonNull
    /* renamed from: b */
    private final C10738l f35467b;
    @NonNull
    /* renamed from: c */
    private final C10742q f35468c;

    @Inject
    C10845e(@NonNull C10844c c10844c, @NonNull C10738l c10738l, @NonNull C10742q c10742q) {
        this.f35466a = c10844c;
        this.f35467b = c10738l;
        this.f35468c = c10742q;
    }

    @NonNull
    /* renamed from: a */
    public CurrentUser m43316a(@NonNull User user) {
        com.tinder.domain.common.model.User a = this.f35466a.m43313a(user);
        DateTime a2 = m43315a(user.createDate());
        int intValue = ((Integer) Objects.b(user.connectionCount(), Integer.valueOf(0))).intValue();
        Instagram a3 = user.instagram() != null ? this.f35468c.m43139a(user.instagram()) : null;
        boolean booleanValue = ((Boolean) Objects.b(user.isVerified(), Boolean.valueOf(false))).booleanValue();
        return CurrentUser.builder(a, a2).setConnectionCount(intValue).setInstagram(a3).setIsVerified(booleanValue).setPhoneId(user.phoneNumber()).setUsername(user.username()).build();
    }

    @NonNull
    /* renamed from: a */
    private DateTime m43315a(@Nullable String str) {
        if (str != null) {
            return this.f35467b.m43129a(str);
        }
        return DateTime.a();
    }
}
