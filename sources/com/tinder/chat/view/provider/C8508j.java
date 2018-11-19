package com.tinder.chat.view.provider;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.view.ChatInputSendButtonView;
import io.reactivex.subjects.C19040a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/view/provider/ChatInputSendButtonViewProvider;", "", "()V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/chat/view/ChatInputSendButtonView;", "kotlin.jvm.PlatformType", "observe", "Lio/reactivex/Observable;", "update", "", "view", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.chat.view.provider.j */
public final class C8508j {
    /* renamed from: a */
    private final C19040a<ChatInputSendButtonView> f30243a = C19040a.a();

    /* renamed from: a */
    public final void m36450a(@NotNull ChatInputSendButtonView chatInputSendButtonView) {
        C2668g.b(chatInputSendButtonView, "view");
        C19040a c19040a = this.f30243a;
        C2668g.a(c19040a, "subject");
        if (!C2668g.a((ChatInputSendButtonView) c19040a.b(), chatInputSendButtonView)) {
            this.f30243a.onNext(chatInputSendButtonView);
        }
    }
}
