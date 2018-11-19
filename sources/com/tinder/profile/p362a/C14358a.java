package com.tinder.profile.p362a;

import android.support.annotation.NonNull;
import com.tinder.profile.model.Profile;
import com.tinder.profile.p363b.C16075g;
import com.tinder.profile.p363b.C16075g.C14381a;
import com.tinder.profile.p363b.C16076h;
import com.tinder.profile.p363b.C16076h.C14384a;
import com.tinder.profile.p363b.C16082r;
import com.tinder.profile.p363b.C16082r.C14391a;
import javax.inject.Inject;

/* renamed from: com.tinder.profile.a.a */
public class C14358a {
    @NonNull
    /* renamed from: a */
    private final C16082r f45555a;
    @NonNull
    /* renamed from: b */
    private final C16075g f45556b;
    @NonNull
    /* renamed from: c */
    private final C16076h f45557c;

    @Inject
    public C14358a(@NonNull C16082r c16082r, @NonNull C16075g c16075g, @NonNull C16076h c16076h) {
        this.f45555a = c16082r;
        this.f45556b = c16075g;
        this.f45557c = c16076h;
    }

    /* renamed from: a */
    public void m54711a(@NonNull Profile profile, Integer num) {
        this.f45555a.m60854a(C14391a.m54818e().mo11589a(profile.mo11660j()).mo11588a(num.intValue()).mo11590a(profile.mo11651a()).mo11592b(profile.mo11673w().username()).mo11591a());
    }

    /* renamed from: a */
    public void m54709a(@NonNull Profile profile, int i) {
        this.f45556b.m60848a(C14381a.m54784e().mo11565a(profile.mo11660j()).mo11564a(i).mo11566a(profile.mo11651a()).mo11568b(profile.mo11673w().username()).mo11567a());
    }

    /* renamed from: a */
    public void m54710a(@NonNull Profile profile, int i, int i2, boolean z) {
        this.f45557c.m60849a(C14384a.m54796g().mo11574a(profile.mo11660j()).mo11573a(i).mo11578b(i2).mo11576a(z).mo11575a(profile.mo11651a()).mo11579b(profile.mo11673w().username()).mo11577a());
    }
}
