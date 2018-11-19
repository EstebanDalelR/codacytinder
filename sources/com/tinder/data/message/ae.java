package com.tinder.data.message;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.MessageDeliveryStatusUpdatesNotifier;
import com.tinder.domain.message.MessageLike;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.SystemMessage;
import com.tinder.domain.message.TextMessage;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import java.util.List;
import java.util.Map;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u001c\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000fH\u0016J\u001a\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0 0\u0011H\u0016J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\nH\u0016J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u00112\u0006\u0010#\u001a\u00020\u0018H\u0016J$\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u00112\u0006\u0010#\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0014H\u0016J$\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)0\u00112\u0006\u0010#\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010-\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/tinder/data/message/MessageDataRepository;", "Lcom/tinder/domain/message/MessageRepository;", "messageDataStore", "Lcom/tinder/data/message/MessageDataStore;", "messageApiClient", "Lcom/tinder/data/message/MessageApiClient;", "messageDeliveryStatusUpdatesNotifier", "Lcom/tinder/domain/message/MessageDeliveryStatusUpdatesNotifier;", "(Lcom/tinder/data/message/MessageDataStore;Lcom/tinder/data/message/MessageApiClient;Lcom/tinder/domain/message/MessageDeliveryStatusUpdatesNotifier;)V", "addMessageToDataStoreAndNotify", "Lrx/Completable;", "message", "Lcom/tinder/domain/message/Message;", "addMessages", "messages", "", "countDistinctMatchesFromMessagesSinceDate", "Lrx/Observable;", "", "dateTime", "Lorg/joda/time/DateTime;", "createMessage", "deleteFailedMessage", "messageId", "", "deliveryFailureMessage", "getMessage", "Lrx/Single;", "insertLikes", "messageLikes", "Lcom/tinder/domain/message/MessageLike;", "latestMessageByMatch", "", "likeMessage", "markAllMessagesAsSeenForMatchId", "matchId", "markAllPendingAsFailed", "messagesForMatch", "messagesForMatchSinceSentDate", "sinceSentDate", "minSentDateForPageSize", "Ljava8/util/Optional;", "pageSize", "", "sendMessageToApiUpdateDataStoreAndNotify", "unlikeMessage", "updateMessageAndNotify", "messageToBeUpdatedId", "updatedMessage", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ae implements MessageRepository {
    /* renamed from: a */
    private final ag f35420a;
    /* renamed from: b */
    private final C8697q f35421b;
    /* renamed from: c */
    private final MessageDeliveryStatusUpdatesNotifier f35422c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "error", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ae$b */
    static final class C12939b<T, R> implements Func1<Throwable, Completable> {
        /* renamed from: a */
        final /* synthetic */ ae f41464a;
        /* renamed from: b */
        final /* synthetic */ String f41465b;

        C12939b(ae aeVar, String str) {
            this.f41464a = aeVar;
            this.f41465b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50642a((Throwable) obj);
        }

        /* renamed from: a */
        public final Completable m50642a(Throwable th) {
            return this.f41464a.f35420a.m37104a(this.f41465b, false).a(Completable.a(th));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/Message;", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ae$c */
    static final class C12940c<T, R> implements Func1<Throwable, Message> {
        /* renamed from: a */
        final /* synthetic */ ae f41466a;
        /* renamed from: b */
        final /* synthetic */ Message f41467b;

        C12940c(ae aeVar, Message message) {
            this.f41466a = aeVar;
            this.f41467b = message;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50643a((Throwable) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Message m50643a(Throwable th) {
            return this.f41466a.m43280c(this.f41467b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "responseMessage", "Lcom/tinder/domain/message/Message;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ae$d */
    static final class C12941d<T, R> implements Func1<Message, Completable> {
        /* renamed from: a */
        final /* synthetic */ ae f41468a;
        /* renamed from: b */
        final /* synthetic */ Message f41469b;

        C12941d(ae aeVar, Message message) {
            this.f41468a = aeVar;
            this.f41469b = message;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50644a((Message) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m50644a(Message message) {
            ae aeVar = this.f41468a;
            String id = this.f41469b.getId();
            C2668g.a(message, "responseMessage");
            return aeVar.m43277a(id, message);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "error", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ae$e */
    static final class C12942e<T, R> implements Func1<Throwable, Completable> {
        /* renamed from: a */
        final /* synthetic */ ae f41470a;
        /* renamed from: b */
        final /* synthetic */ String f41471b;

        C12942e(ae aeVar, String str) {
            this.f41470a = aeVar;
            this.f41471b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50645a((Throwable) obj);
        }

        /* renamed from: a */
        public final Completable m50645a(Throwable th) {
            return this.f41470a.f35420a.m37104a(this.f41471b, true).a(Completable.a(th));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ae$a */
    static final class C13835a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ae f43884a;
        /* renamed from: b */
        final /* synthetic */ Message f43885b;

        C13835a(ae aeVar, Message message) {
            this.f43884a = aeVar;
            this.f43885b = message;
        }

        public final void call() {
            this.f43884a.f35422c.notifyDeliveryStatusUpdate(this.f43885b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ae$f */
    static final class C13836f implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ae f43886a;
        /* renamed from: b */
        final /* synthetic */ Message f43887b;

        C13836f(ae aeVar, Message message) {
            this.f43886a = aeVar;
            this.f43887b = message;
        }

        public final void call() {
            this.f43886a.f35422c.notifyDeliveryStatusUpdate(this.f43887b);
        }
    }

    public ae(@NotNull ag agVar, @NotNull C8697q c8697q, @NotNull MessageDeliveryStatusUpdatesNotifier messageDeliveryStatusUpdatesNotifier) {
        C2668g.b(agVar, "messageDataStore");
        C2668g.b(c8697q, "messageApiClient");
        C2668g.b(messageDeliveryStatusUpdatesNotifier, "messageDeliveryStatusUpdatesNotifier");
        this.f35420a = agVar;
        this.f35421b = c8697q;
        this.f35422c = messageDeliveryStatusUpdatesNotifier;
    }

    @NotNull
    public Observable<List<Message>> messagesForMatch(@NotNull String str) {
        C2668g.b(str, "matchId");
        return this.f35420a.m37107a(str);
    }

    @NotNull
    public Observable<List<Message>> messagesForMatchSinceSentDate(@NotNull String str, @NotNull DateTime dateTime) {
        C2668g.b(str, "matchId");
        C2668g.b(dateTime, "sinceSentDate");
        return this.f35420a.m37109a(str, dateTime);
    }

    @NotNull
    public Observable<Optional<DateTime>> minSentDateForPageSize(@NotNull String str, int i) {
        C2668g.b(str, "matchId");
        return this.f35420a.m37108a(str, i);
    }

    @NotNull
    public Observable<Map<String, Message>> latestMessageByMatch() {
        return this.f35420a.m37106a();
    }

    @NotNull
    public Completable addMessages(@NotNull List<? extends Message> list) {
        C2668g.b(list, ManagerWebServices.PARAM_MESSAGES);
        return this.f35420a.m37105a((List) list);
    }

    @NotNull
    public Completable insertLikes(@NotNull List<MessageLike> list) {
        C2668g.b(list, "messageLikes");
        return this.f35420a.m37113b((List) list);
    }

    @NotNull
    public Completable createMessage(@NotNull Message message) {
        C2668g.b(message, "message");
        message = Completable.b(new Completable[]{m43276a(message), m43279b(message)});
        C2668g.a(message, "Completable.concat(\n    …Notify(message)\n        )");
        return message;
    }

    @NotNull
    public Completable likeMessage(@NotNull String str) {
        C2668g.b(str, "messageId");
        str = this.f35420a.m37104a(str, true).a(RxJavaInteropExtKt.toV1Completable(this.f35421b.m37151a(str)).b(new C12939b(this, str)));
        C2668g.a(str, "messageDataStore.setIsLi…rror))\n                })");
        return str;
    }

    @NotNull
    public Completable markAllMessagesAsSeenForMatchId(@NotNull String str) {
        C2668g.b(str, "matchId");
        return this.f35420a.m37115c(str);
    }

    @NotNull
    public Completable unlikeMessage(@NotNull String str) {
        C2668g.b(str, "messageId");
        str = this.f35420a.m37104a(str, false).a(RxJavaInteropExtKt.toV1Completable(this.f35421b.m37153b(str)).b(new C12942e(this, str)));
        C2668g.a(str, "messageDataStore.setIsLi…rror))\n                })");
        return str;
    }

    @NotNull
    public Completable deleteFailedMessage(@NotNull String str) {
        C2668g.b(str, "messageId");
        return this.f35420a.m37116d(str);
    }

    @NotNull
    public Single<Message> getMessage(@NotNull String str) {
        C2668g.b(str, "messageId");
        return this.f35420a.m37114b(str);
    }

    @NotNull
    public Completable markAllPendingAsFailed() {
        return this.f35420a.m37111b();
    }

    @NotNull
    public Observable<Long> countDistinctMatchesFromMessagesSinceDate(@NotNull DateTime dateTime) {
        C2668g.b(dateTime, "dateTime");
        return this.f35420a.m37110a(dateTime);
    }

    /* renamed from: a */
    private final Completable m43276a(Message message) {
        message = this.f35420a.m37105a(C19301m.a(message)).b(new C13835a(this, message));
        C2668g.a(message, "messageDataStore\n       …te(message)\n            }");
        return message;
    }

    /* renamed from: b */
    private final Completable m43279b(Message message) {
        message = RxJavaInteropExtKt.toV1Single(this.f35421b.m37152a(message)).e(new C12940c(this, message)).c(new C12941d(this, message));
        C2668g.a(message, "messageApiClient.sendMes…          )\n            }");
        return message;
    }

    /* renamed from: a */
    private final Completable m43277a(String str, Message message) {
        MessageDataRepository$updateMessageAndNotify$updateMessage$2 messageDataRepository$updateMessageAndNotify$updateMessage$2;
        if (af.f30617a[message.getDeliveryStatus().ordinal()] != 1) {
            messageDataRepository$updateMessageAndNotify$updateMessage$2 = new MessageDataRepository$updateMessageAndNotify$updateMessage$2(this.f35420a);
        } else {
            messageDataRepository$updateMessageAndNotify$updateMessage$2 = new MessageDataRepository$updateMessageAndNotify$updateMessage$1(this.f35420a);
        }
        str = ((Completable) messageDataRepository$updateMessageAndNotify$updateMessage$2.invoke(str, message)).b(new C13836f(this, message));
        C2668g.a(str, "updateMessage(messageToB…tedMessage)\n            }");
        return str;
    }

    /* renamed from: c */
    private final Message m43280c(Message message) {
        Message message2 = message;
        if (message2 instanceof TextMessage) {
            return TextMessage.copy$default((TextMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.FAILED, 511, null);
        }
        if (message2 instanceof GifMessage) {
            return GifMessage.copy$default((GifMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.FAILED, null, null, 3583, null);
        }
        if (message2 instanceof SystemMessage) {
            return SystemMessage.copy$default((SystemMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.FAILED, 511, null);
        }
        if (message2 instanceof ReactionMessage) {
            return ReactionMessage.copy$default((ReactionMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.FAILED, null, 1535, null);
        }
        if (message2 instanceof ActivityMessage) {
            return ActivityMessage.copy$default((ActivityMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.FAILED, null, 1535, null);
        }
        if (message2 instanceof ImageMessage) {
            return ImageMessage.copy$default((ImageMessage) message2, null, null, null, null, null, null, null, false, false, DeliveryStatus.FAILED, null, 1535, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
