package com.tinder.api.keepalive;

import android.app.Application;
import com.tinder.api.retrofit.TinderAuthenticator;
import com.tinder.proto.keepalive.KeepAliveNudge.Nudge;
import com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator;
import com.tinder.scarlet.C14788b;
import com.tinder.scarlet.C14793d;
import com.tinder.scarlet.C14793d.C14791a;
import com.tinder.scarlet.C14797g;
import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.WebSocket.C14786a;
import com.tinder.scarlet.lifecycle.android.C14815a;
import com.tinder.scarlet.p468a.p470b.C16503a.C16502a;
import com.tinder.scarlet.p471b.p473b.C16512c;
import com.tinder.scarlet.retry.C16547b;
import com.tinder.scarlet.websocket.okhttp.C14823a;
import com.tinder.scarlet.websocket.okhttp.request.RequestFactory;
import com.tinder.scarlet.ws.Receive;
import com.tinder.scarlet.ws.Send;
import io.reactivex.C3957b;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C17692o;
import okhttp3.C17692o.C15961a;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0001J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0001J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0001J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveScarletApi;", "Lcom/tinder/api/keepalive/KeepAliveService;", "keepAliveService", "(Lcom/tinder/api/keepalive/KeepAliveService;)V", "observeEvent", "Lio/reactivex/Flowable;", "Lcom/tinder/scarlet/Event;", "observeNudge", "Lcom/tinder/proto/keepalive/KeepAliveNudge$Nudge;", "observeState", "Lcom/tinder/scarlet/State;", "observeTypingIndicator", "Lcom/tinder/proto/keepalive/KeepAliveTypingIndicator$TypingIndicator;", "observeWebSocketEvent", "Lcom/tinder/scarlet/WebSocket$Event;", "sendTypingIndicator", "", "typingIndicator", "Companion", "Factory", "StubFactory", "api_release"}, k = 1, mv = {1, 1, 10})
public final class KeepAliveScarletApi implements KeepAliveService {
    public static final Companion Companion = new Companion();
    private static final long PING_INTERVAL_SECONDS = 60;
    private static final long RETRY_BASE_DURATION = 1000;
    private static final long RETRY_MAX_DURATION = 10000;
    private final KeepAliveService keepAliveService;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveScarletApi$Companion;", "", "()V", "PING_INTERVAL_SECONDS", "", "RETRY_BASE_DURATION", "RETRY_MAX_DURATION", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveScarletApi$Factory;", "", "baseUrl", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "authenticator", "Lcom/tinder/api/retrofit/TinderAuthenticator;", "headerInterceptors", "", "Lokhttp3/Interceptor;", "application", "Landroid/app/Application;", "loggedInLifecycle", "Lcom/tinder/scarlet/Lifecycle;", "(Ljava/lang/String;Lokhttp3/OkHttpClient;Lcom/tinder/api/retrofit/TinderAuthenticator;Ljava/util/Set;Landroid/app/Application;Lcom/tinder/scarlet/Lifecycle;)V", "create", "Lcom/tinder/api/keepalive/KeepAliveScarletApi;", "createLifecycle", "createOkHttpClient", "createRequestFactory", "Lcom/tinder/scarlet/websocket/okhttp/request/RequestFactory;", "createScarlet", "Lcom/tinder/scarlet/Scarlet;", "startLoggingEvents", "", "keepAliveService", "Lcom/tinder/api/keepalive/KeepAliveService;", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Factory {
        private final Application application;
        private final TinderAuthenticator authenticator;
        private final String baseUrl;
        private final Set<Interceptor> headerInterceptors;
        private final Lifecycle loggedInLifecycle;
        private final C17692o okHttpClient;

        public Factory(@NotNull String str, @NotNull C17692o c17692o, @NotNull TinderAuthenticator tinderAuthenticator, @NotNull Set<? extends Interceptor> set, @NotNull Application application, @NotNull Lifecycle lifecycle) {
            C2668g.b(str, "baseUrl");
            C2668g.b(c17692o, "okHttpClient");
            C2668g.b(tinderAuthenticator, "authenticator");
            C2668g.b(set, "headerInterceptors");
            C2668g.b(application, "application");
            C2668g.b(lifecycle, "loggedInLifecycle");
            this.baseUrl = str;
            this.okHttpClient = c17692o;
            this.authenticator = tinderAuthenticator;
            this.headerInterceptors = set;
            this.application = application;
            this.loggedInLifecycle = lifecycle;
        }

        @NotNull
        public final KeepAliveScarletApi create() {
            KeepAliveService keepAliveService = (KeepAliveService) createScarlet().a(KeepAliveService.class);
            startLoggingEvents(keepAliveService);
            return new KeepAliveScarletApi(keepAliveService);
        }

        private final C14793d createScarlet() {
            return new C14791a().a(C14823a.a(createOkHttpClient(), createRequestFactory(this.baseUrl))).a(new C16547b(1000, KeepAliveScarletApi.RETRY_MAX_DURATION, null, 4, null)).a(createLifecycle()).a(new com.tinder.api.keepalive.KeepAliveClientDataMessageAdapter.Factory(new C16502a(null, 1, null))).a(new C16512c()).a();
        }

        private final C17692o createOkHttpClient() {
            C15961a d = this.okHttpClient.z().a(this.authenticator).d(KeepAliveScarletApi.PING_INTERVAL_SECONDS, TimeUnit.SECONDS);
            d.a().addAll(this.headerInterceptors);
            C17692o b = d.b();
            C2668g.a(b, "okHttpClient.newBuilder(…\n                .build()");
            return b;
        }

        private final RequestFactory createRequestFactory(String str) {
            return new KeepAliveRequestFactory(str);
        }

        private final Lifecycle createLifecycle() {
            return C14815a.a(this.application, 0, 2, null).combineWith(new Lifecycle[]{this.loggedInLifecycle});
        }

        private final void startLoggingEvents(KeepAliveService keepAliveService) {
            keepAliveService.observeEvent().a(KeepAliveScarletApi$Factory$startLoggingEvents$1.INSTANCE, KeepAliveScarletApi$Factory$startLoggingEvents$2.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveScarletApi$StubFactory;", "", "()V", "createStub", "Lcom/tinder/api/keepalive/KeepAliveScarletApi;", "StubKeepAliveService", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class StubFactory {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveScarletApi$StubFactory$StubKeepAliveService;", "Lcom/tinder/api/keepalive/KeepAliveService;", "()V", "observeEvent", "Lio/reactivex/Flowable;", "Lcom/tinder/scarlet/Event;", "observeNudge", "Lcom/tinder/proto/keepalive/KeepAliveNudge$Nudge;", "observeState", "Lcom/tinder/scarlet/State;", "observeTypingIndicator", "Lcom/tinder/proto/keepalive/KeepAliveTypingIndicator$TypingIndicator;", "observeWebSocketEvent", "Lcom/tinder/scarlet/WebSocket$Event;", "sendTypingIndicator", "", "typingIndicator", "api_release"}, k = 1, mv = {1, 1, 10})
        private static final class StubKeepAliveService implements KeepAliveService {
            public void sendTypingIndicator(@NotNull TypingIndicator typingIndicator) {
                C2668g.b(typingIndicator, "typingIndicator");
            }

            @NotNull
            public C3957b<C14788b> observeEvent() {
                C3957b<C14788b> b = C3957b.b();
                C2668g.a(b, "Flowable.empty()");
                return b;
            }

            @NotNull
            public C3957b<C14797g> observeState() {
                C3957b<C14797g> b = C3957b.b();
                C2668g.a(b, "Flowable.empty()");
                return b;
            }

            @NotNull
            public C3957b<C14786a> observeWebSocketEvent() {
                C3957b<C14786a> b = C3957b.b();
                C2668g.a(b, "Flowable.empty()");
                return b;
            }

            @NotNull
            public C3957b<Nudge> observeNudge() {
                C3957b<Nudge> b = C3957b.b();
                C2668g.a(b, "Flowable.empty()");
                return b;
            }

            @NotNull
            public C3957b<TypingIndicator> observeTypingIndicator() {
                C3957b<TypingIndicator> b = C3957b.b();
                C2668g.a(b, "Flowable.empty()");
                return b;
            }
        }

        @NotNull
        public final KeepAliveScarletApi createStub() {
            return new KeepAliveScarletApi(new StubKeepAliveService());
        }
    }

    @NotNull
    @Receive
    public C3957b<C14788b> observeEvent() {
        return this.keepAliveService.observeEvent();
    }

    @NotNull
    @Receive
    public C3957b<Nudge> observeNudge() {
        return this.keepAliveService.observeNudge();
    }

    @NotNull
    @Receive
    public C3957b<C14797g> observeState() {
        return this.keepAliveService.observeState();
    }

    @NotNull
    @Receive
    public C3957b<TypingIndicator> observeTypingIndicator() {
        return this.keepAliveService.observeTypingIndicator();
    }

    @NotNull
    @Receive
    public C3957b<C14786a> observeWebSocketEvent() {
        return this.keepAliveService.observeWebSocketEvent();
    }

    @Send
    public void sendTypingIndicator(@NotNull TypingIndicator typingIndicator) {
        C2668g.b(typingIndicator, "typingIndicator");
        this.keepAliveService.sendTypingIndicator(typingIndicator);
    }

    public KeepAliveScarletApi(@NotNull KeepAliveService keepAliveService) {
        C2668g.b(keepAliveService, "keepAliveService");
        this.keepAliveService = keepAliveService;
    }
}
