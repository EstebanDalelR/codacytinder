package com.tinder.chat.view.provider;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.view.model.ChatScreenState;
import java8.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\fR2\u0010\u0005\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/chat/view/provider/ChatScreenStateProvider;", "Ljava8/util/function/Supplier;", "Lrx/Observable;", "Lcom/tinder/chat/view/model/ChatScreenState;", "()V", "stateSubject", "Lrx/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "get", "updateState", "", "state", "updateState$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.chat.view.provider.w */
public final class C10650w implements Supplier<Observable<ChatScreenState>> {
    /* renamed from: a */
    private final C19785a<ChatScreenState> f34941a = C19785a.f(ChatScreenState.LOADING);

    public /* synthetic */ Object get() {
        return m42962a();
    }

    @NotNull
    /* renamed from: a */
    public Observable<ChatScreenState> m42962a() {
        Observable<ChatScreenState> e = this.f34941a.e();
        C2668g.a(e, "stateSubject.asObservable()");
        return e;
    }

    /* renamed from: a */
    public final void m42963a(@NotNull ChatScreenState chatScreenState) {
        C2668g.b(chatScreenState, "state");
        this.f34941a.onNext(chatScreenState);
    }
}
