package com.tinder.smsauth.data;

import com.squareup.moshi.C5987p;
import com.tinder.model.analytics.AnalyticsConstants;
import com.tinder.smsauth.data.api.RequestOneTimePasswordBody;
import com.tinder.smsauth.data.api.RequestOneTimePasswordResponse;
import com.tinder.smsauth.data.api.RequestOneTimePasswordResponse.Data;
import com.tinder.smsauth.data.api.SmsAuthErrorResponse;
import com.tinder.smsauth.data.api.SmsAuthErrorResponse.Error;
import com.tinder.smsauth.data.api.SmsAuthService;
import com.tinder.smsauth.data.api.VerifyOneTimePasswordBody;
import com.tinder.smsauth.data.api.VerifyOneTimePasswordResponse;
import com.tinder.smsauth.entity.C14976d;
import com.tinder.smsauth.entity.C14977f;
import com.tinder.smsauth.entity.C14980h;
import com.tinder.smsauth.entity.C14982j;
import com.tinder.smsauth.entity.C16747a;
import com.tinder.smsauth.entity.C16748b;
import com.tinder.smsauth.entity.C16749e;
import com.tinder.smsauth.entity.Flow.Error.OneTimePasswordVerifiedAsInvalid;
import com.tinder.smsauth.entity.Flow.Error.TooManyRequests;
import com.tinder.smsauth.entity.Flow.Error.Unexpected;
import com.tinder.smsauth.entity.SmsAuthType;
import io.reactivex.C3960g;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15968t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0019\u001a\u00020\u001aJ$\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u0013\"\u0004\b\u0000\u0010\u001c*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0\u001d0\u0013H\u0002J\f\u0010\u001e\u001a\u00020\u001f*\u00020\u0003H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/smsauth/data/SmsAuthApiClient;", "", "smsAuthType", "Lcom/tinder/smsauth/entity/SmsAuthType;", "service", "Lcom/tinder/smsauth/data/api/SmsAuthService;", "phoneNumberAdapter", "Lcom/tinder/smsauth/data/PhoneNumberAdapter;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/tinder/smsauth/entity/SmsAuthType;Lcom/tinder/smsauth/data/api/SmsAuthService;Lcom/tinder/smsauth/data/PhoneNumberAdapter;Lcom/squareup/moshi/Moshi;)V", "mapError", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "httpCode", "", "error", "Lcom/tinder/smsauth/data/api/SmsAuthErrorResponse$Error;", "requestOneTimePassword", "Lio/reactivex/Single;", "Lcom/tinder/smsauth/entity/OneTimePasswordInfo;", "phoneNumber", "Lcom/tinder/smsauth/entity/PhoneNumber;", "verifyOneTimePassword", "Lcom/tinder/smsauth/entity/LoginCredentials;", "request", "Lcom/tinder/smsauth/entity/VerifyOneTimePasswordRequest;", "mapErrorIfAny", "T", "Lretrofit2/Response;", "queryParamName", "", "Companion", "data"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.data.b */
public final class C14969b {
    @Deprecated
    /* renamed from: a */
    public static final C14968a f46731a = new C14968a();
    /* renamed from: b */
    private final SmsAuthType f46732b;
    /* renamed from: c */
    private final SmsAuthService f46733c;
    /* renamed from: d */
    private final C14967a f46734d;
    /* renamed from: e */
    private final C5987p f46735e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/smsauth/data/SmsAuthApiClient$Companion;", "", "()V", "INVALID_ONE_TIME_PASSWORD_CODE", "", "TOO_MANY_REQUEST", "data"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.data.b$a */
    private static final class C14968a {
        private C14968a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "response", "Lretrofit2/Response;", "apply", "(Lretrofit2/Response;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.data.b$b */
    static final class C16718b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14969b f51706a;

        C16718b(C14969b c14969b) {
            this.f51706a = c14969b;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62229a((Response) obj);
        }

        @Nullable
        /* renamed from: a */
        public final T m62229a(@NotNull Response<T> response) {
            C2668g.b(response, "response");
            if (response.isSuccessful()) {
                return response.body();
            }
            C15968t errorBody = response.errorBody();
            if (errorBody != null) {
                SmsAuthErrorResponse smsAuthErrorResponse = (SmsAuthErrorResponse) this.f51706a.f46735e.a(SmsAuthErrorResponse.class).fromJson(errorBody.string());
                if (smsAuthErrorResponse != null) {
                    Error error = smsAuthErrorResponse.getError();
                    if (error != null) {
                        throw this.f51706a.m56555a(response.code(), error);
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Parsed error response is null: ");
                stringBuilder.append(errorBody);
                throw ((Throwable) new IllegalStateException(stringBuilder.toString()));
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Response has null error body: ");
            stringBuilder.append(response);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/smsauth/data/api/RequestOneTimePasswordResponse$Data;", "it", "Lcom/tinder/smsauth/data/api/RequestOneTimePasswordResponse;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.data.b$c */
    static final class C16719c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16719c f51707a = new C16719c();

        C16719c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62230a((RequestOneTimePasswordResponse) obj);
        }

        @Nullable
        /* renamed from: a */
        public final Data m62230a(@NotNull RequestOneTimePasswordResponse requestOneTimePasswordResponse) {
            C2668g.b(requestOneTimePasswordResponse, "it");
            return requestOneTimePasswordResponse.getData();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/smsauth/entity/OneTimePasswordInfo;", "it", "Lcom/tinder/smsauth/data/api/RequestOneTimePasswordResponse$Data;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.data.b$d */
    static final class C16720d<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16720d f51708a = new C16720d();

        C16720d() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62231a((Data) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C14977f m62231a(@NotNull Data data) {
            C2668g.b(data, "it");
            Integer length = data.getLength();
            if (length != null) {
                return new C14977f(length.intValue(), null);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No one time password length in the response: ");
            stringBuilder.append(data);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordResponse$Data;", "it", "Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordResponse;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.data.b$e */
    static final class C16721e<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16721e f51709a = new C16721e();

        C16721e() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62232a((VerifyOneTimePasswordResponse) obj);
        }

        @Nullable
        /* renamed from: a */
        public final VerifyOneTimePasswordResponse.Data m62232a(@NotNull VerifyOneTimePasswordResponse verifyOneTimePasswordResponse) {
            C2668g.b(verifyOneTimePasswordResponse, "it");
            return verifyOneTimePasswordResponse.getData();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/smsauth/entity/LoginCredentials;", "response", "Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordResponse$Data;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.data.b$f */
    static final class C16722f<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16722f f51710a = new C16722f();

        C16722f() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62233a((VerifyOneTimePasswordResponse.Data) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C14976d m62233a(@NotNull VerifyOneTimePasswordResponse.Data data) {
            C2668g.b(data, "response");
            String refreshToken = data.getRefreshToken();
            if (refreshToken == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No refresh token in the response: ");
                stringBuilder.append(data);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (data.getAccessToken() != null) {
                return new C16747a(refreshToken, data.getAccessToken());
            } else {
                if (data.getOnboardingToken() != null) {
                    return new C16749e(refreshToken, data.getOnboardingToken());
                }
                return (C14976d) new C16748b(refreshToken);
            }
        }
    }

    @Inject
    public C14969b(@NotNull SmsAuthType smsAuthType, @NotNull SmsAuthService smsAuthService, @NotNull C14967a c14967a, @NotNull C5987p c5987p) {
        C2668g.b(smsAuthType, "smsAuthType");
        C2668g.b(smsAuthService, "service");
        C2668g.b(c14967a, "phoneNumberAdapter");
        C2668g.b(c5987p, "moshi");
        this.f46732b = smsAuthType;
        this.f46733c = smsAuthService;
        this.f46734d = c14967a;
        this.f46735e = c5987p;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<C14977f> m56558a(@NotNull C14980h c14980h) {
        C2668g.b(c14980h, "phoneNumber");
        c14980h = m56554a(this.f46733c.requestOneTimePassword(m56557a(this.f46732b), new RequestOneTimePasswordBody(this.f46734d.m56552a(c14980h)))).e(C16719c.f51707a).e(C16720d.f51708a);
        C2668g.a(c14980h, "service.requestOneTimePa…onse: $it\")\n            }");
        return c14980h;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<C14976d> m56559a(@NotNull C14982j c14982j) {
        C2668g.b(c14982j, "request");
        c14982j = m56554a(this.f46733c.verifyOneTimePassword(m56557a(this.f46732b), new VerifyOneTimePasswordBody(this.f46734d.m56552a(c14982j.m56582a()), c14982j.m56583b()))).e(C16721e.f51709a).e(C16722f.f51710a);
        C2668g.a(c14982j, "service.verifyOneTimePas…$response\")\n            }");
        return c14982j;
    }

    /* renamed from: a */
    private final <T> C3960g<T> m56554a(@NotNull C3960g<Response<T>> c3960g) {
        c3960g = c3960g.e(new C16718b(this));
        C2668g.a(c3960g, "this.map { response ->\n …)\n            }\n        }");
        return c3960g;
    }

    /* renamed from: a */
    private final RuntimeException m56555a(int i, Error error) {
        Integer code = error.getCode();
        StringBuilder stringBuilder;
        if (code == null) {
            i = String.valueOf(i);
            stringBuilder = new StringBuilder();
            stringBuilder.append("No internal error code: ");
            stringBuilder.append(error);
            return new Unexpected(i, stringBuilder.toString());
        } else if (code.intValue() == 41201) {
            return (RuntimeException) OneTimePasswordVerifiedAsInvalid.f51713a;
        } else {
            if (code.intValue() == 41205) {
                return (RuntimeException) TooManyRequests.f51714a;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i);
            stringBuilder.append(58);
            stringBuilder.append(error.getCode());
            i = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append("Generic error: ");
            stringBuilder.append(error);
            return new Unexpected(i, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private final String m56557a(@NotNull SmsAuthType smsAuthType) {
        switch (C14970c.f46736a[smsAuthType.ordinal()]) {
            case 1:
                return AnalyticsConstants.VALUE_FACEBOOK;
            case 2:
                return "sms";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported sms auth type: ");
                stringBuilder.append(smsAuthType);
                throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }
}
