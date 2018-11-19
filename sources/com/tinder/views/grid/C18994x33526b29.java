package com.tinder.views.grid;

import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.views.grid.presenter.RecsGridPresenter;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.views.grid.RefreshableGridRecsView$UserRecProfileViewListener$onGamepadButtonClick$3 */
final class C18994x33526b29 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ RefreshableGridRecsView$e f58768a;
    /* renamed from: b */
    final /* synthetic */ SwipeOrigin f58769b;

    C18994x33526b29(RefreshableGridRecsView$e refreshableGridRecsView$e, SwipeOrigin swipeOrigin) {
        this.f58768a = refreshableGridRecsView$e;
        this.f58769b = swipeOrigin;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m67534a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67534a() {
        RecsGridPresenter a = this.f58768a.f52921c;
        UserRec userRec = this.f58768a.f52920b.getUserRecCard().userRec();
        C2668g.a(userRec, "userRecCardView.userRecCard.userRec()");
        a.superlikeOnRec(userRec, this.f58769b);
    }
}
