package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.message.ImageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/tinder/chat/view/model/ImageMessageViewModel;", "Lcom/tinder/chat/view/model/MessageViewModel;", "Lcom/tinder/domain/message/ImageMessage;", "message", "userId", "", "positionInfo", "Lcom/tinder/chat/view/model/PositionInfo;", "avatarUrl", "matchId", "(Lcom/tinder/domain/message/ImageMessage;Ljava/lang/String;Lcom/tinder/chat/view/model/PositionInfo;Ljava/lang/String;Ljava/lang/String;)V", "imageSource", "getImageSource", "()Ljava/lang/String;", "imageUrl", "getImageUrl", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.o */
public final class C12749o extends MessageViewModel<ImageMessage> {
    @NotNull
    /* renamed from: a */
    private final String f41123a;
    @NotNull
    /* renamed from: b */
    private final String f41124b;

    public C12749o(@NotNull ImageMessage imageMessage, @NotNull String str, @NotNull C8503z c8503z, @NotNull String str2, @NotNull String str3) {
        C2668g.b(imageMessage, "message");
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(c8503z, "positionInfo");
        C2668g.b(str2, "avatarUrl");
        C2668g.b(str3, "matchId");
        super(imageMessage, str, c8503z, str2, str3, null, 32, null);
        this.f41123a = imageMessage.getImage().getUrl();
        this.f41124b = imageMessage.getImage().getSource();
    }

    @NotNull
    /* renamed from: a */
    public final String m50174a() {
        return this.f41123a;
    }

    @NotNull
    /* renamed from: b */
    public final String m50175b() {
        return this.f41124b;
    }
}
