package com.tinder.feed.view.model.p252a;

import com.tinder.chat.view.model.C10639h;
import com.tinder.chat.view.model.C8499q;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C13281i;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"isPlayableAtMediaPosition", "", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "mediaPosition", "", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.model.a.b */
public final class C9536b {
    /* renamed from: a */
    public static final boolean m39797a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel, int i) {
        C2668g.b(activityFeedViewModel, "$receiver");
        if (activityFeedViewModel instanceof C13281i) {
            return C19301m.f(((C8499q) ((C13281i) activityFeedViewModel).m51379g().m42956f().get(i)).m36420b()) instanceof C10639h;
        }
        return activityFeedViewModel.mo11142d().mo9413a();
    }
}
