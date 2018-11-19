package com.tinder.analytics.fireworks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C7322d.C6226b;
import com.tinder.common.utils.C8578a;
import com.tinder.enums.Gender;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bj;
import com.tinder.model.User;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.Lazy;
import java.util.Date;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.tinder.analytics.fireworks.e */
public class C7329e implements C6226b {
    @NonNull
    /* renamed from: a */
    private final C15193i f26480a;
    @NonNull
    /* renamed from: b */
    private final bj f26481b;
    @NonNull
    /* renamed from: c */
    private final Lazy<ManagerProfile> f26482c;

    @Inject
    C7329e(@NonNull C15193i c15193i, @NonNull bj bjVar, @NonNull Lazy<ManagerProfile> lazy) {
        this.f26480a = c15193i;
        this.f26481b = bjVar;
        this.f26482c = lazy;
    }

    @Nullable
    /* renamed from: i */
    protected User m31285i() {
        return ((ManagerProfile) this.f26482c.get()).c();
    }

    @Nullable
    /* renamed from: a */
    public String mo6785a() {
        User i = m31285i();
        Date birthDate = i != null ? i.getBirthDate() : null;
        if (birthDate == null) {
            return null;
        }
        return Long.toString(birthDate.getTime() / 1000);
    }

    @Nullable
    /* renamed from: b */
    public Boolean mo6786b() {
        User i = m31285i();
        if (i == null) {
            return null;
        }
        return Boolean.valueOf(i.isSpotifyConnected());
    }

    @Nullable
    /* renamed from: c */
    public Number mo6787c() {
        User i = m31285i();
        if (i != null) {
            Gender gender = i.getGender();
            if (gender != null) {
                return Integer.valueOf(gender.getBackendId());
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public Number mo6788d() {
        if (this.f26481b.f() && this.f26481b.e()) {
            return Integer.valueOf(-1);
        }
        if (this.f26481b.f()) {
            return Integer.valueOf(0);
        }
        return this.f26481b.e() ? Integer.valueOf(1) : null;
    }

    @Nullable
    /* renamed from: e */
    public String mo6789e() {
        User i = m31285i();
        return i != null ? i.getId() : null;
    }

    @Nullable
    /* renamed from: f */
    public Boolean mo6790f() {
        return Boolean.valueOf(this.f26480a.a());
    }

    @Nullable
    /* renamed from: g */
    public Boolean mo6791g() {
        User i = m31285i();
        if (i == null) {
            return null;
        }
        SearchTrack spotifyThemeTrack = i.getSpotifyThemeTrack();
        boolean z = (spotifyThemeTrack == null || C8578a.a(spotifyThemeTrack.getName())) ? false : true;
        return Boolean.valueOf(z);
    }

    @Nullable
    /* renamed from: h */
    public String mo6792h() {
        User i = m31285i();
        return i != null ? i.getAge() : null;
    }
}
