package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.message.SystemMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/chat/view/model/SystemMessageViewModel;", "Lcom/tinder/chat/view/model/MessageViewModel;", "Lcom/tinder/domain/message/SystemMessage;", "message", "userId", "", "positionInfo", "Lcom/tinder/chat/view/model/PositionInfo;", "avatarUrl", "matchId", "(Lcom/tinder/domain/message/SystemMessage;Ljava/lang/String;Lcom/tinder/chat/view/model/PositionInfo;Ljava/lang/String;Ljava/lang/String;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class al extends MessageViewModel<SystemMessage> {
    public al(@NotNull SystemMessage systemMessage, @NotNull String str, @NotNull C8503z c8503z, @NotNull String str2, @NotNull String str3) {
        C2668g.b(systemMessage, "message");
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(c8503z, "positionInfo");
        C2668g.b(str2, "avatarUrl");
        C2668g.b(str3, "matchId");
        super(systemMessage, str, c8503z, str2, str3, null, 32, null);
    }
}
