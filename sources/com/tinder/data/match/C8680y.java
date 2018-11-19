package com.tinder.data.match;

import android.support.annotation.NonNull;
import com.squareup.sqldelight.C7263a;
import com.tinder.data.adapter.C10736h;
import com.tinder.data.adapter.C10739n;
import com.tinder.data.adapter.C10740p;
import com.tinder.data.adapter.C10744v;
import com.tinder.data.adapter.af;
import com.tinder.data.adapter.ak;
import com.tinder.data.model.MatchGroupMemberModel;
import com.tinder.data.model.MatchGroupMemberModel.C8704a;
import com.tinder.data.model.MatchGroupModel;
import com.tinder.data.model.MatchGroupModel.C10853b;
import com.tinder.data.model.MatchGroupModel.C8705a;
import com.tinder.data.model.MatchGroupModel.Group_viewModel;
import com.tinder.data.model.MatchModel;
import com.tinder.data.model.MatchModel.C10856h;
import com.tinder.data.model.MatchModel.C8706f;
import com.tinder.data.model.MatchModel.Match_viewModel;
import com.tinder.data.model.MatchPersonModel;
import com.tinder.data.model.MatchPersonModel.C8707a;
import com.tinder.data.model.MatchPlaceModel;
import com.tinder.data.model.MatchPlaceModel.C8708b;
import com.tinder.data.model.PlaceModel;
import com.tinder.data.model.PlaceModel.C10863c;
import com.tinder.data.model.PlaceModel.C8711a;
import com.tinder.data.model.SponsoredMatchCreativeValuesModel;
import com.tinder.domain.match.model.Match.Attribution;

/* renamed from: com.tinder.data.match.y */
public final class C8680y {
    @NonNull
    /* renamed from: a */
    static final C8707a<MatchPersonModel> f30552a = new C8707a(C10808z.f35253a, f30560i, new C10740p(), new af(), new C10736h(), new C10744v(), new ak());
    @NonNull
    /* renamed from: b */
    static final C8706f<MatchModel> f30553b = new C8706f(aa.f35230a, f30560i, f30560i, C7263a.a(Attribution.class), C7263a.a(MatchType.class));
    @NonNull
    /* renamed from: c */
    static final C8711a<PlaceModel> f30554c = new C8711a(ab.f35231a);
    @NonNull
    /* renamed from: d */
    static final C10856h<MatchModel, MatchPersonModel, SponsoredMatchCreativeValuesModel, C10806g> f30555d = new C10856h(ac.f35232a, f30553b, f30552a, C8673k.f30536a);
    @NonNull
    /* renamed from: e */
    static final C8708b<MatchPlaceModel> f30556e = new C8708b(ad.f35233a);
    @NonNull
    /* renamed from: f */
    static final C10863c<PlaceModel> f30557f = new C10863c(f30554c);
    @NonNull
    /* renamed from: g */
    static final C8705a<MatchGroupModel> f30558g = new C8705a(ae.f35234a);
    @NonNull
    /* renamed from: h */
    static final C10853b<MatchGroupModel, MatchGroupMemberModel, MatchPersonModel, C10800a> f30559h = new C10853b(ag.f35236a, f30558g, f30561j, f30552a);
    @NonNull
    /* renamed from: i */
    private static final C10739n f30560i = new C10739n();
    @NonNull
    /* renamed from: j */
    private static final C8704a<MatchGroupMemberModel> f30561j = new C8704a(af.f35235a);

    /* renamed from: com.tinder.data.match.y$a */
    static abstract class C10800a implements Group_viewModel<MatchGroupModel, MatchGroupMemberModel, MatchPersonModel> {
        C10800a() {
        }
    }

    /* renamed from: com.tinder.data.match.y$b */
    static abstract class C10801b implements MatchGroupModel {
        C10801b() {
        }
    }

    /* renamed from: com.tinder.data.match.y$c */
    static abstract class C10802c implements MatchGroupMemberModel {
        C10802c() {
        }
    }

    /* renamed from: com.tinder.data.match.y$d */
    static abstract class C10803d implements MatchModel {
        C10803d() {
        }
    }

    /* renamed from: com.tinder.data.match.y$e */
    static abstract class C10804e implements MatchPersonModel {
        C10804e() {
        }
    }

    /* renamed from: com.tinder.data.match.y$f */
    static abstract class C10805f implements MatchPlaceModel {
        C10805f() {
        }
    }

    /* renamed from: com.tinder.data.match.y$g */
    static abstract class C10806g implements Match_viewModel<MatchModel, MatchPersonModel, SponsoredMatchCreativeValuesModel> {
        C10806g() {
        }
    }

    /* renamed from: com.tinder.data.match.y$h */
    static abstract class C10807h implements PlaceModel {
        C10807h() {
        }
    }
}
