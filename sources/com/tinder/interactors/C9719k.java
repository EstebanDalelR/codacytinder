package com.tinder.interactors;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApiClient;
import com.tinder.boost.repository.BoostStatusRepository;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.managers.ManagerProfile;
import com.tinder.model.ProfileResponse;
import java.util.ArrayList;
import java.util.List;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;
import javax.inject.Inject;
import retrofit2.Response;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.interactors.k */
public class C9719k {
    /* renamed from: a */
    private final TinderApiClient f32316a;
    /* renamed from: b */
    private final AbTestUtility f32317b;
    /* renamed from: c */
    private final ManagerProfile f32318c;
    /* renamed from: d */
    private final BoostStatusRepository f32319d;

    @Inject
    public C9719k(TinderApiClient tinderApiClient, AbTestUtility abTestUtility, ManagerProfile managerProfile, BoostStatusRepository boostStatusRepository) {
        this.f32316a = tinderApiClient;
        this.f32318c = managerProfile;
        this.f32317b = abTestUtility;
        this.f32319d = boostStatusRepository;
    }

    /* renamed from: a */
    public void m40219a() {
        this.f32316a.loadUserProfileIncluding((String) StreamSupport.a(m40221b()).collect(Collectors.a(","))).b(Schedulers.io()).a(new C14043l(this), C14044m.f44474a);
    }

    /* renamed from: a */
    final /* synthetic */ void m40220a(Response response) {
        m40218b((ProfileResponse) response.body());
        m40216a((ProfileResponse) response.body());
    }

    /* renamed from: a */
    private void m40216a(ProfileResponse profileResponse) {
        profileResponse = profileResponse.getSpotify();
        if (profileResponse != null) {
            this.f32318c.a(profileResponse.f(), profileResponse.b(), profileResponse.a(), profileResponse.c(), profileResponse.e(), profileResponse.d());
        }
    }

    /* renamed from: b */
    private void m40218b(ProfileResponse profileResponse) {
        this.f32319d.setBoostStatus(profileResponse.getBoost());
    }

    /* renamed from: b */
    public List<String> m40221b() {
        List<String> arrayList = new ArrayList();
        if (this.f32317b.isSpotifyEnabled()) {
            arrayList.add(ManagerWebServices.PARAM_SPOTIFY);
        }
        arrayList.add(ManagerWebServices.PARAM_BOOST);
        return arrayList;
    }
}
