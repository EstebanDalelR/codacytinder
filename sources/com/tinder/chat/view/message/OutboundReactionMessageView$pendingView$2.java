package com.tinder.chat.view.message;

import android.widget.ProgressBar;
import com.tinder.C6250b.C6248a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ProgressBar;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class OutboundReactionMessageView$pendingView$2 extends Lambda implements Function0<ProgressBar> {
    /* renamed from: a */
    final /* synthetic */ be f43721a;

    OutboundReactionMessageView$pendingView$2(be beVar) {
        this.f43721a = beVar;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53329a();
    }

    /* renamed from: a */
    public final ProgressBar m53329a() {
        return (ProgressBar) this.f43721a.m42809a(C6248a.chatMessagePending);
    }
}
