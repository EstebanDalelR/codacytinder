package com.tinder.chat.view.message;

import com.tinder.C6250b.C6248a;
import com.tinder.views.CustomTextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/views/CustomTextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class OutboundReactionMessageView$messageStatusView$2 extends Lambda implements Function0<CustomTextView> {
    /* renamed from: a */
    final /* synthetic */ be f43720a;

    OutboundReactionMessageView$messageStatusView$2(be beVar) {
        this.f43720a = beVar;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53328a();
    }

    /* renamed from: a */
    public final CustomTextView m53328a() {
        return (CustomTextView) this.f43720a.m42809a(C6248a.chatMessageStatus);
    }
}
