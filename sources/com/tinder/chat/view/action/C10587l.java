package com.tinder.chat.view.action;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.view.model.C12747i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/chat/view/action/InboundActivityMessageMediaUnavailableHandler;", "Lcom/tinder/chat/view/action/ActivityMessageMediaUnavailableHandlerWithViewModel;", "messageActionHandler", "Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;", "(Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;)V", "onMediaUnavailable", "", "viewModel", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "url", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.chat.view.action.l */
public final class C10587l implements ActivityMessageMediaUnavailableHandlerWithViewModel {
    /* renamed from: a */
    private final C10588n f34394a;

    @Inject
    public C10587l(@NotNull C10588n c10588n) {
        C2668g.b(c10588n, "messageActionHandler");
        this.f34394a = c10588n;
    }

    public void onMediaUnavailable(@NotNull C12747i c12747i, @NotNull String str) {
        C2668g.b(c12747i, "viewModel");
        C2668g.b(str, "url");
        C8459e.m36203b(c12747i, (ActivityMessageMediaUnavailableHandler) this.f34394a, str);
    }
}
