package com.tinder.domain.message.usecase;

import com.tinder.domain.message.Gif;
import com.tinder.domain.message.GifMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/GifMessage;", "it", "Lcom/tinder/domain/message/usecase/CommonMessageProperties;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class SendGifMessage$execute$1<T, R> implements Func1<T, R> {
    final /* synthetic */ Gif $gif;
    final /* synthetic */ SendGifMessage this$0;

    SendGifMessage$execute$1(SendGifMessage sendGifMessage, Gif gif) {
        this.this$0 = sendGifMessage;
        this.$gif = gif;
    }

    @NotNull
    public final GifMessage call(CommonMessageProperties commonMessageProperties) {
        SendGifMessage sendGifMessage = this.this$0;
        C2668g.a(commonMessageProperties, "it");
        return sendGifMessage.createGifMessage(commonMessageProperties, this.$gif);
    }
}
