package com.tinder.data.superlikeable;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApi;
import com.tinder.api.model.superlikeable.SuperLikeableGameResponse.Data;
import com.tinder.api.model.superlikeable.SuperLikeableGameResponse.Empty;
import com.tinder.api.model.superlikeable.SuperLikeableGameResponseData;
import com.tinder.api.response.v2.ResponseError;
import com.tinder.api.response.v2.ResponseMeta;
import com.tinder.data.adapter.ap;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import com.tinder.util.ConnectivityProvider;
import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\t\u001c\u001d\u001e\u001f !\"#$B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fJ6\u0010\u0019\u001a&\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a \u001b*\u0012\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a\u0018\u00010\u00110\u0011*\b\u0012\u0004\u0012\u00020\u001a0\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient;", "", "tinderApi", "Lcom/tinder/api/TinderApi;", "apiAdapter", "Lcom/tinder/data/adapter/SuperLikeableGameDomainApiAdapter;", "emptyResponseHandler", "Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$EmptyResponseHandler;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/adapter/SuperLikeableGameDomainApiAdapter;Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$EmptyResponseHandler;Lcom/tinder/util/ConnectivityProvider;)V", "checkInternetConnection", "", "checkTokenValidity", "token", "", "load", "Lrx/Single;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "loadGameFromApi", "skipGame", "Lrx/Completable;", "superLikeOnRec", "recUserId", "recSNumber", "evaluateActionResponse", "Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse$Empty;", "kotlin.jvm.PlatformType", "EmptyResponseHandler", "GameParseFailedException", "InvalidRecIdException", "InvalidRecSNumberException", "InvalidTokenIdException", "MissingResponseErrorCodeException", "MissingResponseStatusCodeException", "NoGameDataException", "UnhandledApiException", "data_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableGameApiClient {
    /* renamed from: a */
    private final TinderApi f30859a;
    /* renamed from: b */
    private final ap f30860b;
    /* renamed from: c */
    private final C8790a f30861c;
    /* renamed from: d */
    private final ConnectivityProvider f30862d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$GameParseFailedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "data_release"}, k = 1, mv = {1, 1, 10})
    public static final class GameParseFailedException extends RuntimeException {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$InvalidRecIdException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "data_release"}, k = 1, mv = {1, 1, 10})
    public static final class InvalidRecIdException extends RuntimeException {
        public InvalidRecIdException() {
            super("Invalid Rec id");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$InvalidRecSNumberException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "data_release"}, k = 1, mv = {1, 1, 10})
    public static final class InvalidRecSNumberException extends RuntimeException {
        public InvalidRecSNumberException() {
            super("Invalid Rec sNumber");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$InvalidTokenIdException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "data_release"}, k = 1, mv = {1, 1, 10})
    public static final class InvalidTokenIdException extends RuntimeException {
        public InvalidTokenIdException() {
            super("TokenId is invalid");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$MissingResponseErrorCodeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "data_release"}, k = 1, mv = {1, 1, 10})
    public static final class MissingResponseErrorCodeException extends RuntimeException {
        public MissingResponseErrorCodeException() {
            super("Missing 'meta' field in response payload.");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$MissingResponseStatusCodeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "data_release"}, k = 1, mv = {1, 1, 10})
    public static final class MissingResponseStatusCodeException extends RuntimeException {
        public MissingResponseStatusCodeException() {
            super("Missing 'meta' field in response payload.");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$NoGameDataException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "data_release"}, k = 1, mv = {1, 1, 10})
    public static final class NoGameDataException extends RuntimeException {
        public NoGameDataException() {
            super("response.data is null.");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$UnhandledApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "data_release"}, k = 1, mv = {1, 1, 10})
    public static final class UnhandledApiException extends RuntimeException {
        public UnhandledApiException(@NotNull String str) {
            C2668g.b(str, "message");
            super(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\f"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$EmptyResponseHandler;", "", "()V", "handle", "", "emptyResponse", "Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse$Empty;", "handle$data_release", "handle403HttpError", "error", "Lcom/tinder/api/response/v2/ResponseError;", "Companion", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.SuperLikeableGameApiClient$a */
    public static final class C8790a {
        /* renamed from: a */
        public static final C8789a f30857a = new C8789a();
        /* renamed from: b */
        private static final C18461c f30858b = new C18461c(40301, 40304);

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameApiClient$EmptyResponseHandler$Companion;", "", "()V", "actionRequestAlreadyProcessedErrorCodes", "Lkotlin/ranges/IntRange;", "data_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.superlikeable.SuperLikeableGameApiClient$a$a */
        public static final class C8789a {
            private C8789a() {
            }
        }

        /* renamed from: a */
        public final void m37406a(@NotNull Empty empty) {
            C2668g.b(empty, "emptyResponse");
            ResponseMeta meta = empty.getMeta();
            if (meta == null) {
                throw ((Throwable) new MissingResponseStatusCodeException());
            } else if (meta.getStatus() != Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                if (meta.getStatus() == 403) {
                    m37405a(empty.getError());
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(empty);
                throw new UnhandledApiException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        private final void m37405a(ResponseError responseError) {
            if (responseError != null) {
                Integer code = responseError.getCode();
                if (code != null) {
                    if (f30858b.a(code.intValue())) {
                        C0001a.b("Request was already processed by the server", new Object[0]);
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected 403 error: ");
                    stringBuilder.append(responseError);
                    throw new UnhandledApiException(stringBuilder.toString());
                }
            }
            throw ((Throwable) new MissingResponseErrorCodeException());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "response", "Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse$Data;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.SuperLikeableGameApiClient$e */
    static final class C13106e<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableGameApiClient f41730a;

        C13106e(SuperLikeableGameApiClient superLikeableGameApiClient) {
            this.f41730a = superLikeableGameApiClient;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50965a((Data) obj);
        }

        @NotNull
        /* renamed from: a */
        public final SuperLikeableGame m50965a(Data data) {
            SuperLikeableGameResponseData data2 = data.getData();
            if (data2 != null) {
                data = this.f41730a.f30860b.m43110a(data2);
                if (data != null) {
                    return data;
                }
                throw ((Throwable) new GameParseFailedException());
            }
            throw ((Throwable) new NoGameDataException());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse$Empty;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.SuperLikeableGameApiClient$b */
    static final class C13883b<T> implements Action1<Empty> {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableGameApiClient f44006a;

        C13883b(SuperLikeableGameApiClient superLikeableGameApiClient) {
            this.f44006a = superLikeableGameApiClient;
        }

        public /* synthetic */ void call(Object obj) {
            m53434a((Empty) obj);
        }

        /* renamed from: a */
        public final void m53434a(Empty empty) {
            C8790a c = this.f44006a.f30861c;
            C2668g.a(empty, "it");
            c.m37406a(empty);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.SuperLikeableGameApiClient$c */
    static final class C13884c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableGameApiClient f44007a;

        C13884c(SuperLikeableGameApiClient superLikeableGameApiClient) {
            this.f44007a = superLikeableGameApiClient;
        }

        public final void call() {
            this.f44007a.m37414c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.SuperLikeableGameApiClient$d */
    static final class C13885d implements Action0 {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableGameApiClient f44008a;

        C13885d(SuperLikeableGameApiClient superLikeableGameApiClient) {
            this.f44008a = superLikeableGameApiClient;
        }

        public final void call() {
            this.f44008a.m37414c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.SuperLikeableGameApiClient$f */
    static final class C13886f implements Action0 {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableGameApiClient f44009a;
        /* renamed from: b */
        final /* synthetic */ String f44010b;

        C13886f(SuperLikeableGameApiClient superLikeableGameApiClient, String str) {
            this.f44009a = superLikeableGameApiClient;
            this.f44010b = str;
        }

        public final void call() {
            this.f44009a.m37412b(this.f44010b);
            this.f44009a.m37414c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.SuperLikeableGameApiClient$g */
    static final class C13887g implements Action0 {
        /* renamed from: a */
        final /* synthetic */ SuperLikeableGameApiClient f44011a;
        /* renamed from: b */
        final /* synthetic */ String f44012b;
        /* renamed from: c */
        final /* synthetic */ String f44013c;
        /* renamed from: d */
        final /* synthetic */ String f44014d;

        C13887g(SuperLikeableGameApiClient superLikeableGameApiClient, String str, String str2, String str3) {
            this.f44011a = superLikeableGameApiClient;
            this.f44012b = str;
            this.f44013c = str2;
            this.f44014d = str3;
        }

        public final void call() {
            if (C19303i.a(this.f44012b)) {
                throw new InvalidRecIdException();
            } else if (C19303i.a(this.f44013c)) {
                throw new InvalidRecSNumberException();
            } else {
                this.f44011a.m37412b(this.f44014d);
                this.f44011a.m37414c();
            }
        }
    }

    @Inject
    public SuperLikeableGameApiClient(@NotNull TinderApi tinderApi, @NotNull ap apVar, @NotNull C8790a c8790a, @NotNull ConnectivityProvider connectivityProvider) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(apVar, "apiAdapter");
        C2668g.b(c8790a, "emptyResponseHandler");
        C2668g.b(connectivityProvider, "connectivityProvider");
        this.f30859a = tinderApi;
        this.f30860b = apVar;
        this.f30861c = c8790a;
        this.f30862d = connectivityProvider;
    }

    @NotNull
    /* renamed from: a */
    public final Single<SuperLikeableGame> m37417a() {
        Single<SuperLikeableGame> a = m37411b().a(new C13884c(this));
        C2668g.a(a, "loadGameFromApi()\n      …eckInternetConnection() }");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m37415a(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        Single a = this.f30859a.skipSuperLikeableGame(str).a(new C13886f(this, str));
        C2668g.a(a, "tinderApi.skipSuperLikea…n()\n                    }");
        str = m37407a(a).b();
        C2668g.a(str, "tinderApi.skipSuperLikea…         .toCompletable()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m37416a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        C2668g.b(str2, "recUserId");
        C2668g.b(str3, "recSNumber");
        Single a = this.f30859a.superLikeOnSuperLikeableGameUserRec(str, str2, str3).a(new C13887g(this, str2, str3, str));
        C2668g.a(a, "tinderApi.superLikeOnSup…n()\n                    }");
        str = m37407a(a).b();
        C2668g.a(str, "tinderApi.superLikeOnSup…         .toCompletable()");
        return str;
    }

    /* renamed from: b */
    private final Single<SuperLikeableGame> m37411b() {
        Single<SuperLikeableGame> d = this.f30859a.fetchSuperLikeableGame().a(new C13885d(this)).d(new C13106e(this));
        C2668g.a(d, "tinderApi.fetchSuperLike…Exception()\n            }");
        return d;
    }

    /* renamed from: c */
    private final void m37414c() {
        if (!this.f30862d.a()) {
            throw new NoInternetConnectionException();
        }
    }

    /* renamed from: b */
    private final void m37412b(String str) {
        if (C19303i.a(str) != null) {
            throw ((Throwable) new InvalidTokenIdException());
        }
    }

    /* renamed from: a */
    private final Single<Empty> m37407a(@NotNull Single<Empty> single) {
        return single.d(new C13883b(this));
    }
}
