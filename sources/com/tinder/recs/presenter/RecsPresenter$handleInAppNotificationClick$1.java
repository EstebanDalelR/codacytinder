package com.tinder.recs.presenter;

import android.net.Uri;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.recs.target.RecsTarget;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.screenshotty.p401a.C14826a.C16570a;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "referralUrl", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$handleInAppNotificationClick$1<T> implements Consumer<String> {
    final /* synthetic */ C14826a $screenshot;
    final /* synthetic */ UserRec $userRec;
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$handleInAppNotificationClick$1(RecsPresenter recsPresenter, C14826a c14826a, UserRec userRec) {
        this.this$0 = recsPresenter;
        this.$screenshot = c14826a;
        this.$userRec = userRec;
    }

    public final void accept(String str) {
        Uri a = this.$screenshot instanceof C16570a ? ((C16570a) this.$screenshot).m61998a() : null;
        RecsTarget target = this.this$0.getTarget();
        String id = this.$userRec.getUser().id();
        C2668g.a(id, "userRec.user.id()");
        String name = this.$userRec.getUser().name();
        C2668g.a(name, "userRec.user.name()");
        C2668g.a(str, "referralUrl");
        boolean isSuperLike = this.$userRec.isSuperLike();
        boolean isTraveling = this.$userRec.isTraveling();
        List commonConnections = this.$userRec.getUser().commonConnections();
        C2668g.a(commonConnections, "userRec.user.commonConnections()");
        target.createChooserToShareScreenshottedProfile(id, name, a, str, isSuperLike, isTraveling, commonConnections);
    }
}
