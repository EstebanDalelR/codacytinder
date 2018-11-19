package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.message.TextMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tinder/chat/view/model/TextMessageViewModel;", "Lcom/tinder/chat/view/model/MessageViewModel;", "Lcom/tinder/domain/message/TextMessage;", "message", "userId", "", "positionInfo", "Lcom/tinder/chat/view/model/PositionInfo;", "avatarUrl", "isEmojiOnly", "", "matchId", "(Lcom/tinder/domain/message/TextMessage;Ljava/lang/String;Lcom/tinder/chat/view/model/PositionInfo;Ljava/lang/String;ZLjava/lang/String;)V", "()Z", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class am extends MessageViewModel<TextMessage> {
    /* renamed from: a */
    private final boolean f41117a;

    /* renamed from: a */
    public final boolean m50168a() {
        return this.f41117a;
    }

    public am(@NotNull TextMessage textMessage, @NotNull String str, @NotNull C8503z c8503z, @NotNull String str2, boolean z, @NotNull String str3) {
        TextMessage textMessage2 = textMessage;
        C2668g.b(textMessage2, "message");
        String str4 = str;
        C2668g.b(str4, ManagerWebServices.PARAM_USER_ID);
        C8503z c8503z2 = c8503z;
        C2668g.b(c8503z2, "positionInfo");
        String str5 = str2;
        C2668g.b(str5, "avatarUrl");
        String str6 = str3;
        C2668g.b(str6, "matchId");
        super(textMessage2, str4, c8503z2, str5, str6, null, 32, null);
        this.f41117a = z;
    }
}
