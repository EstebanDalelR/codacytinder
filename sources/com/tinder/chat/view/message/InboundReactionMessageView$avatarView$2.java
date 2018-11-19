package com.tinder.chat.view.message;

import com.tinder.C6250b.C6248a;
import com.tinder.chat.view.ChatAvatarView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/chat/view/ChatAvatarView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class InboundReactionMessageView$avatarView$2 extends Lambda implements Function0<ChatAvatarView> {
    /* renamed from: a */
    final /* synthetic */ C10633w f43659a;

    InboundReactionMessageView$avatarView$2(C10633w c10633w) {
        this.f43659a = c10633w;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53269a();
    }

    /* renamed from: a */
    public final ChatAvatarView m53269a() {
        return (ChatAvatarView) this.f43659a.m42889a(C6248a.chatMessageAvatar);
    }
}
