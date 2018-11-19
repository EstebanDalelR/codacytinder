package com.tinder.chat.view.action;

import com.tinder.chat.analytics.MediaType;
import com.tinder.chat.analytics.MessageAction;
import com.tinder.chat.view.model.C10638f;
import com.tinder.chat.view.model.C10643r;
import com.tinder.chat.view.model.C12747i;
import com.tinder.chat.view.model.C8492a;
import com.tinder.chat.view.model.C8496j;
import com.tinder.chat.view.model.ab;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a \u0010\r\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¨\u0006\u0010"}, d2 = {"getMediaId", "", "viewModel", "Lcom/tinder/chat/view/model/ActivityEventViewModel;", "getMediaType", "Lcom/tinder/chat/analytics/MediaType;", "onMediaClicked", "", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "messageActionHandler", "Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;", "messageAction", "Lcom/tinder/chat/analytics/MessageAction;", "onMediaUrlUnavailable", "Lcom/tinder/chat/view/action/ActivityMessageMediaUnavailableHandler;", "url", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.e */
public final class C8459e {
    /* renamed from: b */
    private static final void m36204b(C12747i c12747i, C10588n c10588n, MessageAction messageAction) {
        c10588n.onMediaClicked(c12747i.m42909p(), c12747i.m42899f(), c12747i.m50170b(), c12747i.m42907n().m36429a(), messageAction);
    }

    /* renamed from: b */
    private static final void m36203b(C12747i c12747i, ActivityMessageMediaUnavailableHandler activityMessageMediaUnavailableHandler, String str) {
        activityMessageMediaUnavailableHandler.onMediaUnavailable(c12747i.m42909p(), c12747i.m42899f(), c12747i.m42907n().m36429a(), c12747i.m50170b(), C8459e.m36202b(c12747i.m50169a()), C8459e.m36199a(c12747i.m50169a()), str);
    }

    @NotNull
    /* renamed from: a */
    public static final MediaType m36199a(@NotNull C8492a c8492a) {
        C2668g.b(c8492a, "viewModel");
        if (c8492a instanceof C10643r) {
            if (C8496j.m36394a((C10643r) c8492a) != null) {
                return MediaType.INSTAGRAM_VIDEO;
            }
            return MediaType.INSTAGRAM_PHOTO;
        } else if ((c8492a instanceof ab) != null) {
            return MediaType.PROFILE_PHOTO;
        } else {
            return MediaType.NONE;
        }
    }

    @NotNull
    /* renamed from: b */
    public static final String m36202b(@NotNull C8492a c8492a) {
        C2668g.b(c8492a, "viewModel");
        if (c8492a instanceof C10643r) {
            return ((C10643r) c8492a).m42953c();
        }
        return c8492a instanceof ab ? ((C10638f) C19301m.f(((ab) c8492a).m42915c())).getId() : "";
    }
}
