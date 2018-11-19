package com.tinder.chat.view.provider;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.message.Message;
import com.tinder.typingindicator.usecase.C17175f;
import com.tinder.typingindicator.usecase.C17175f.C15329a;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel.TypingIndicator;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel.TypingIndicator.State;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\f\u0010\u0012\u001a\u00020\b*\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/chat/view/provider/TypingIndicatorVisibilityResolver;", "", "newInboundMessageDetector", "Lcom/tinder/chat/view/provider/NewInboundMessageDetector;", "interruptTypingIndicator", "Lcom/tinder/typingindicator/usecase/InterruptTypingIndicator;", "(Lcom/tinder/chat/view/provider/NewInboundMessageDetector;Lcom/tinder/typingindicator/usecase/InterruptTypingIndicator;)V", "resolveShouldShow", "", "previousMessagesSnapshot", "", "Lcom/tinder/domain/message/Message;", "messages", "typingIndicatorViewModel", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel;", "currentUserId", "", "matchId", "isActive", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ab {
    /* renamed from: a */
    private final C8518y f30240a;
    /* renamed from: b */
    private final C17175f f30241b;

    @Inject
    public ab(@NotNull C8518y c8518y, @NotNull C17175f c17175f) {
        C2668g.b(c8518y, "newInboundMessageDetector");
        C2668g.b(c17175f, "interruptTypingIndicator");
        this.f30240a = c8518y;
        this.f30241b = c17175f;
    }

    /* renamed from: a */
    public final boolean m36447a(@NotNull List<? extends Message> list, @NotNull List<? extends Message> list2, @NotNull TypingIndicatorViewModel typingIndicatorViewModel, @NotNull String str, @NotNull String str2) {
        C2668g.b(list, "previousMessagesSnapshot");
        C2668g.b(list2, ManagerWebServices.PARAM_MESSAGES);
        C2668g.b(typingIndicatorViewModel, "typingIndicatorViewModel");
        C2668g.b(str, "currentUserId");
        C2668g.b(str2, "matchId");
        if (m36446a(typingIndicatorViewModel) == null) {
            return false;
        }
        if (this.f30240a.m36477a(list, list2, str) == null) {
            return true;
        }
        this.f30241b.a(new C15329a(str2));
        return false;
    }

    /* renamed from: a */
    private final boolean m36446a(@NotNull TypingIndicatorViewModel typingIndicatorViewModel) {
        return ((typingIndicatorViewModel instanceof TypingIndicator) && ((TypingIndicator) typingIndicatorViewModel).b() == State.ACTIVE) ? true : null;
    }
}
