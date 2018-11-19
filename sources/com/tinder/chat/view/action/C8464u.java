package com.tinder.chat.view.action;

import com.tinder.domain.message.usecase.DeleteFailedMessage;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/chat/view/action/MessageDeleteAction;", "", "deleteFailedMessage", "Lcom/tinder/domain/message/usecase/DeleteFailedMessage;", "(Lcom/tinder/domain/message/usecase/DeleteFailedMessage;)V", "deleteSubscriptions", "", "", "Lrx/Subscription;", "delete", "", "messageId", "isSubscribed", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.u */
public final class C8464u {
    /* renamed from: a */
    private final Map<String, Subscription> f30127a = ((Map) new LinkedHashMap());
    /* renamed from: b */
    private final DeleteFailedMessage f30128b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.u$a */
    static final class C13736a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ String f43633a;

        C13736a(String str) {
            this.f43633a = str;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Deleted message: ");
            stringBuilder.append(this.f43633a);
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.action.u$b */
    static final class C13737b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ String f43634a;

        C13737b(String str) {
            this.f43634a = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53265a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53265a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error deleting message: ");
            stringBuilder.append(this.f43634a);
            C0001a.b(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C8464u(@NotNull DeleteFailedMessage deleteFailedMessage) {
        C2668g.b(deleteFailedMessage, "deleteFailedMessage");
        this.f30128b = deleteFailedMessage;
    }

    /* renamed from: a */
    public final void m36207a(@NotNull String str) {
        C2668g.b(str, "messageId");
        if (!m36206b(str)) {
            Map map = this.f30127a;
            Subscription a = this.f30128b.execute(str).b(Schedulers.io()).a(new C13736a(str), new C13737b(str));
            C2668g.a(a, "deleteFailedMessage.exec…geId\")\n                })");
            map.put(str, a);
        }
    }

    /* renamed from: b */
    private final boolean m36206b(String str) {
        Subscription subscription = (Subscription) this.f30127a.get(str);
        return (subscription == null || subscription.isUnsubscribed() != null) ? null : true;
    }
}
