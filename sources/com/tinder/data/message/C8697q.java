package com.tinder.data.message;

import com.tinder.api.TinderApi;
import com.tinder.api.model.common.ApiMessage;
import com.tinder.api.request.SendMessageRequestBody;
import com.tinder.data.p322e.C10764a;
import com.tinder.domain.message.Message;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/data/message/MessageApiClient;", "", "api", "Lcom/tinder/api/TinderApi;", "messageApiAdapter", "Lcom/tinder/data/message/MessageApiAdapter;", "messageRequestBodyMapper", "Lcom/tinder/data/mapper/MessageRequestBodyMapper;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/message/MessageApiAdapter;Lcom/tinder/data/mapper/MessageRequestBodyMapper;)V", "likeMessage", "Lio/reactivex/Completable;", "messageId", "", "sendMessage", "Lio/reactivex/Single;", "Lcom/tinder/domain/message/Message;", "message", "setMessageSeen", "matchId", "unlikeMessage", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.q */
public final class C8697q {
    /* renamed from: a */
    private final TinderApi f30649a;
    /* renamed from: b */
    private final C10839m f30650b;
    /* renamed from: c */
    private final C10764a f30651c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/tinder/api/request/SendMessageRequestBody;", "it", "Lcom/tinder/domain/message/Message;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.q$a */
    static final class C10840a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8697q f35457a;

        C10840a(C8697q c8697q) {
            this.f35457a = c8697q;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43303a((Message) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<String, SendMessageRequestBody> m43303a(@NotNull Message message) {
            C2668g.b(message, "it");
            return C15811g.a(message.getMatchId(), this.f35457a.f30651c.m43167a(message));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/api/model/common/ApiMessage;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lcom/tinder/api/request/SendMessageRequestBody;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.q$b */
    static final class C10841b<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C8697q f35458a;

        C10841b(C8697q c8697q) {
            this.f35458a = c8697q;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43304a((Pair) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<ApiMessage> m43304a(@NotNull Pair<String, SendMessageRequestBody> pair) {
            C2668g.b(pair, "<name for destructuring parameter 0>");
            pair = this.f35458a.f30649a.sendMessage((String) pair.c(), (SendMessageRequestBody) pair.d());
            C2668g.a(pair, "api.sendMessage(matchId, requestBody)");
            return RxJavaInteropExtKt.toV2Single(pair);
        }
    }

    @Inject
    public C8697q(@NotNull TinderApi tinderApi, @NotNull C10839m c10839m, @NotNull C10764a c10764a) {
        C2668g.b(tinderApi, "api");
        C2668g.b(c10839m, "messageApiAdapter");
        C2668g.b(c10764a, "messageRequestBodyMapper");
        this.f30649a = tinderApi;
        this.f30650b = c10839m;
        this.f30651c = c10764a;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<Message> m37152a(@NotNull Message message) {
        C2668g.b(message, "message");
        message = C3960g.a(message).e(new C10840a(this)).a(new C10841b(this)).e(new C10842r(new MessageApiClient$sendMessage$3(this.f30650b)));
        C2668g.a(message, "Single.just(message)\n   …ssageApiAdapter::fromApi)");
        return message;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37151a(@NotNull String str) {
        C2668g.b(str, "messageId");
        str = this.f30649a.likeMatchMessage(str);
        C2668g.a(str, "api.likeMatchMessage(messageId)");
        return RxJavaInteropExtKt.toV2Completable(str);
    }

    @NotNull
    /* renamed from: b */
    public final C3956a m37153b(@NotNull String str) {
        C2668g.b(str, "messageId");
        str = this.f30649a.deleteMatchMessageLike(str);
        C2668g.a(str, "api.deleteMatchMessageLike(messageId)");
        return RxJavaInteropExtKt.toV2Completable(str);
    }
}
