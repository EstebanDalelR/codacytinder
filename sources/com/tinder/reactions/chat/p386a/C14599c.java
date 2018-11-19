package com.tinder.reactions.chat.p386a;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.reactions.chat.view.ChatInputExpandButtonView;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/chat/provider/ChatInputExpandButtonViewProvider;", "", "()V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;", "kotlin.jvm.PlatformType", "observe", "Lio/reactivex/Observable;", "update", "", "view", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.chat.a.c */
public final class C14599c {
    /* renamed from: a */
    private final C19040a<ChatInputExpandButtonView> f46076a = C19040a.m67694a();

    @NotNull
    /* renamed from: a */
    public final C3959e<ChatInputExpandButtonView> m55695a() {
        C19040a c19040a = this.f46076a;
        C2668g.a(c19040a, "subject");
        return c19040a;
    }

    /* renamed from: a */
    public final void m55696a(@NotNull ChatInputExpandButtonView chatInputExpandButtonView) {
        C2668g.b(chatInputExpandButtonView, "view");
        C19040a c19040a = this.f46076a;
        C2668g.a(c19040a, "subject");
        if (!C2668g.a((ChatInputExpandButtonView) c19040a.m67697b(), chatInputExpandButtonView)) {
            this.f46076a.onNext(chatInputExpandButtonView);
        }
    }
}
