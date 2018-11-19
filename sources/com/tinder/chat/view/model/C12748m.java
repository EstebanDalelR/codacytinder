package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.message.GifMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tinder/chat/view/model/GifMessageViewModel;", "Lcom/tinder/chat/view/model/MessageViewModel;", "Lcom/tinder/domain/message/GifMessage;", "message", "userId", "", "positionInfo", "Lcom/tinder/chat/view/model/PositionInfo;", "avatarUrl", "matchId", "(Lcom/tinder/domain/message/GifMessage;Ljava/lang/String;Lcom/tinder/chat/view/model/PositionInfo;Ljava/lang/String;Ljava/lang/String;)V", "aspectRatio", "", "getAspectRatio", "()F", "fixedHeightGifUrl", "getFixedHeightGifUrl", "()Ljava/lang/String;", "gifId", "getGifId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.m */
public final class C12748m extends MessageViewModel<GifMessage> {
    @NotNull
    /* renamed from: a */
    private final String f41120a;
    /* renamed from: b */
    private final float f41121b;
    @NotNull
    /* renamed from: c */
    private final String f41122c;

    public C12748m(@NotNull GifMessage gifMessage, @NotNull String str, @NotNull C8503z c8503z, @NotNull String str2, @NotNull String str3) {
        C2668g.b(gifMessage, "message");
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(c8503z, "positionInfo");
        C2668g.b(str2, "avatarUrl");
        C2668g.b(str3, "matchId");
        super(gifMessage, str, c8503z, str2, str3, null, 32, null);
        this.f41120a = gifMessage.getFixedHeightGif().getUrl();
        this.f41121b = gifMessage.getFixedHeightGif().aspectRatio();
        this.f41122c = gifMessage.getFixedHeightGif().getId();
    }

    @NotNull
    /* renamed from: a */
    public final String m50171a() {
        return this.f41120a;
    }

    /* renamed from: b */
    public final float m50172b() {
        return this.f41121b;
    }

    @NotNull
    /* renamed from: c */
    public final String m50173c() {
        return this.f41122c;
    }
}
