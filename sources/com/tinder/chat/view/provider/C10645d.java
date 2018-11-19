package com.tinder.chat.view.provider;

import android.support.annotation.UiThread;
import com.tinder.chat.injection.scope.ChatActivityScope;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0006H\u0017J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016R2\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/chat/view/provider/ChatEmptyMessagesProviderAndNotifier;", "Lcom/tinder/chat/view/provider/ChatEmptyStateProvider;", "Lcom/tinder/chat/view/provider/ChatEmptyStateNotifier;", "()V", "emptyMessagesSubject", "Lrx/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "notifyEmptyChat", "observeEmptyChat", "Lrx/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.chat.view.provider.d */
public final class C10645d implements ChatEmptyStateNotifier, ChatEmptyStateProvider {
    /* renamed from: a */
    private final PublishSubject<C15813i> f34935a = PublishSubject.w();

    @NotNull
    public Observable<C15813i> observeEmptyChat() {
        Observable<C15813i> m = this.f34935a.e().m();
        C2668g.a(m, "emptyMessagesSubject.asO…().onBackpressureLatest()");
        return m;
    }

    @UiThread
    public void notifyEmptyChat() {
        this.f34935a.onNext(C15813i.f49016a);
    }
}
