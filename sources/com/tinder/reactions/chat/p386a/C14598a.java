package com.tinder.reactions.chat.p386a;

import com.tinder.chat.injection.scope.ChatActivityScope;
import kotlin.C15813i;
import kotlin.Metadata;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0006\u0010\t\u001a\u00020\u0005R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonClickedProvider;", "", "()V", "subject", "Lrx/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "update", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.chat.a.a */
public final class C14598a {
    /* renamed from: a */
    private final PublishSubject<C15813i> f46075a = PublishSubject.w();

    /* renamed from: a */
    public final void m55694a() {
        this.f46075a.onNext(C15813i.f49016a);
    }
}
