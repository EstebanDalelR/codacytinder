package com.tinder.chat.view.provider;

import android.support.annotation.UiThread;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.model.MessageViewModel.SenderDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0017J\u0018\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00060\rH\u0016J\u0018\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00060\rH\u0016RZ\u0010\u0004\u001aN\u0012 \u0012\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007 \b*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0018\u00010\u00060\u0006 \b*&\u0012 \u0012\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007 \b*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/chat/view/provider/ChatNewMessagesProviderAndNotifier;", "Lcom/tinder/chat/view/provider/ChatNewMessagesProvider;", "Lcom/tinder/chat/view/provider/ChatNewMessagesNotifier;", "()V", "newMessagesSubject", "Lrx/subjects/PublishSubject;", "", "Lcom/tinder/chat/view/model/MessageViewModel;", "kotlin.jvm.PlatformType", "notifyNewMessages", "", "newMessages", "observeNewInboundMessages", "Lrx/Observable;", "observeNewMessages", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.chat.view.provider.u */
public final class C10649u implements ChatNewMessagesNotifier, ChatNewMessagesProvider {
    /* renamed from: a */
    private final PublishSubject<List<MessageViewModel<?>>> f34940a = PublishSubject.w();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/chat/view/model/MessageViewModel;", "newMessages", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.u$a */
    static final class C12768a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12768a f41152a = new C12768a();

        C12768a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50223a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<MessageViewModel<?>> m50223a(List<? extends MessageViewModel<?>> list) {
            C2668g.a(list, "newMessages");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if ((((MessageViewModel) next).m42902i() == SenderDirection.INBOUND ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/chat/view/model/MessageViewModel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.u$b */
    static final class C12769b<T, R> implements Func1<List<? extends MessageViewModel<?>>, Boolean> {
        /* renamed from: a */
        public static final C12769b f41153a = new C12769b();

        C12769b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50224a((List) obj));
        }

        /* renamed from: a */
        public final boolean m50224a(List<? extends MessageViewModel<?>> list) {
            C2668g.a(list, "it");
            return list.isEmpty() ^ 1;
        }
    }

    @NotNull
    public Observable<List<MessageViewModel<?>>> observeNewMessages() {
        Observable<List<MessageViewModel<?>>> m = this.f34940a.e().m();
        C2668g.a(m, "newMessagesSubject.asObs…().onBackpressureLatest()");
        return m;
    }

    @NotNull
    public Observable<List<MessageViewModel<?>>> observeNewInboundMessages() {
        Observable<List<MessageViewModel<?>>> f = observeNewMessages().k(C12768a.f41152a).f(C12769b.f41153a);
        C2668g.a(f, "observeNewMessages()\n   …ilter { it.isNotEmpty() }");
        return f;
    }

    @UiThread
    public void notifyNewMessages(@NotNull List<? extends MessageViewModel<?>> list) {
        C2668g.b(list, "newMessages");
        this.f34940a.onNext(list);
    }
}
