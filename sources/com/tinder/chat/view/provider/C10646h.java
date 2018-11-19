package com.tinder.chat.view.provider;

import com.tinder.chat.injection.scope.ChatActivityScope;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016R2\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/chat/view/provider/ChatInputGifSelectorStateUpdates;", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorStateUpdatesProvider;", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorStateUpdatesNotifier;", "()V", "stateUpdatesSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorState;", "kotlin.jvm.PlatformType", "notify", "", "inputState", "observe", "Lrx/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.chat.view.provider.h */
public final class C10646h implements ChatInputGifSelectorStateUpdatesNotifier, ChatInputGifSelectorStateUpdatesProvider {
    /* renamed from: a */
    private final PublishSubject<ChatInputGifSelectorState> f34936a = PublishSubject.w();

    @NotNull
    public Observable<ChatInputGifSelectorState> observe() {
        Observable<ChatInputGifSelectorState> e = this.f34936a.e();
        C2668g.a(e, "stateUpdatesSubject.asObservable()");
        return e;
    }

    public void notify(@NotNull ChatInputGifSelectorState chatInputGifSelectorState) {
        C2668g.b(chatInputGifSelectorState, "inputState");
        this.f34936a.onNext(chatInputGifSelectorState);
    }
}
