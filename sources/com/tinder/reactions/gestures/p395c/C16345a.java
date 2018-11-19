package com.tinder.reactions.gestures.p395c;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.data.ObservingProvider;
import com.tinder.domain.reactions.model.GrandGestureType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R2\u0010\u0004\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/reactions/gestures/provider/CurrentChatBubbleProvider;", "Lcom/tinder/data/ObservingProvider;", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "()V", "currentChatBubbleBehaviorSubject", "Lrx/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "get", "observe", "Lrx/Observable;", "update", "", "grandGestureType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.gestures.c.a */
public final class C16345a implements ObservingProvider<GrandGestureType> {
    /* renamed from: a */
    private C19785a<GrandGestureType> f50844a = C19785a.f(GrandGestureType.REALLY);

    public /* synthetic */ Object get() {
        return m61653a();
    }

    public /* synthetic */ void update(Object obj) {
        m61654a((GrandGestureType) obj);
    }

    @NotNull
    /* renamed from: a */
    public GrandGestureType m61653a() {
        C19785a c19785a = this.f50844a;
        C2668g.a(c19785a, "currentChatBubbleBehaviorSubject");
        Object A = c19785a.A();
        C2668g.a(A, "currentChatBubbleBehaviorSubject.value");
        return (GrandGestureType) A;
    }

    @NotNull
    public Observable<GrandGestureType> observe() {
        Observable<GrandGestureType> e = this.f50844a.e();
        C2668g.a(e, "currentChatBubbleBehaviorSubject.asObservable()");
        return e;
    }

    /* renamed from: a */
    public void m61654a(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        this.f50844a.onNext(grandGestureType);
    }
}
