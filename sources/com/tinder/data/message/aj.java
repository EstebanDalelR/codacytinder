package com.tinder.data.message;

import com.tinder.domain.message.Message;
import com.tinder.domain.message.MessageDeliveryStatusUpdatesNotifier;
import com.tinder.domain.message.MessageDeliveryStatusUpdatesProvider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19786b;
import rx.subjects.PublishSubject;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016RN\u0010\u0004\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/message/MessageDeliveryStatusUpdatesProviderAndNotifier;", "Lcom/tinder/domain/message/MessageDeliveryStatusUpdatesProvider;", "Lcom/tinder/domain/message/MessageDeliveryStatusUpdatesNotifier;", "()V", "serializedPublishSubject", "Lrx/subjects/SerializedSubject;", "Lcom/tinder/domain/message/Message;", "kotlin.jvm.PlatformType", "notifyDeliveryStatusUpdate", "", "message", "observeDeliveryStatusUpdates", "Lrx/Observable;", "data_release"}, k = 1, mv = {1, 1, 10})
public final class aj implements MessageDeliveryStatusUpdatesNotifier, MessageDeliveryStatusUpdatesProvider {
    /* renamed from: a */
    private final C19786b<Message, Message> f35423a = PublishSubject.w().B();

    @NotNull
    public Observable<Message> observeDeliveryStatusUpdates() {
        Observable<Message> e = this.f35423a.e();
        C2668g.a(e, "serializedPublishSubject.asObservable()");
        return e;
    }

    public void notifyDeliveryStatusUpdate(@NotNull Message message) {
        C2668g.b(message, "message");
        this.f35423a.onNext(message);
    }
}
