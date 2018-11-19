package com.tinder.places.recs.view;

import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.places.recs.presenter.C12433a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "index", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesRecsView$onFinishInflate$3 extends Lambda implements Function1<Integer, C15813i> {
    /* renamed from: a */
    final /* synthetic */ PlacesRecsView f45086a;

    PlacesRecsView$onFinishInflate$3(PlacesRecsView placesRecsView) {
        this.f45086a = placesRecsView;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53992a(((Number) obj).intValue());
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53992a(int i) {
        try {
            String id;
            C12433a presenter$Tinder_release = this.f45086a.getPresenter$Tinder_release();
            UserRec a = this.f45086a.m53070b(i);
            if (a != null) {
                PerspectableUser user = a.getUser();
                if (user != null) {
                    id = user.id();
                    presenter$Tinder_release.m48910a(i, id);
                }
            }
            id = null;
            presenter$Tinder_release.m48910a(i, id);
        } catch (int i2) {
            C0001a.c((Throwable) i2, "tried to get out of bound rec", new Object[0]);
        }
    }
}
