package com.tinder.chat.view.provider;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.target.ChatInputBoxGifSelector;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/chat/view/provider/ChatInputGifSelectorProvider;", "", "()V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/chat/target/ChatInputBoxGifSelector;", "kotlin.jvm.PlatformType", "observe", "Lio/reactivex/Observable;", "update", "", "view", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.chat.view.provider.f */
public final class C8507f {
    /* renamed from: a */
    private final C19040a<ChatInputBoxGifSelector> f30242a = C19040a.a();

    @NotNull
    /* renamed from: a */
    public final C3959e<ChatInputBoxGifSelector> m36448a() {
        C3959e<ChatInputBoxGifSelector> hide = this.f30242a.hide();
        C2668g.a(hide, "subject.hide()");
        return hide;
    }

    /* renamed from: a */
    public final void m36449a(@NotNull ChatInputBoxGifSelector chatInputBoxGifSelector) {
        C2668g.b(chatInputBoxGifSelector, "view");
        C19040a c19040a = this.f30242a;
        C2668g.a(c19040a, "subject");
        if (!C2668g.a((ChatInputBoxGifSelector) c19040a.b(), chatInputBoxGifSelector)) {
            this.f30242a.onNext(chatInputBoxGifSelector);
        }
    }
}
