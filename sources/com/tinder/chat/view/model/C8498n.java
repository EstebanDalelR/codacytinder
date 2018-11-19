package com.tinder.chat.view.model;

import com.tinder.domain.message.Gif;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/chat/view/model/GifSelectorGifInfo;", "", "gif", "Lcom/tinder/domain/message/Gif;", "position", "", "(Lcom/tinder/domain/message/Gif;I)V", "getGif", "()Lcom/tinder/domain/message/Gif;", "getPosition", "()I", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.model.n */
public final class C8498n {
    @NotNull
    /* renamed from: a */
    private final Gif f30208a;
    /* renamed from: b */
    private final int f30209b;

    public C8498n(@NotNull Gif gif, int i) {
        C2668g.b(gif, "gif");
        this.f30208a = gif;
        this.f30209b = i;
    }

    @NotNull
    /* renamed from: a */
    public final Gif m36417a() {
        return this.f30208a;
    }

    /* renamed from: b */
    public final int m36418b() {
        return this.f30209b;
    }
}
