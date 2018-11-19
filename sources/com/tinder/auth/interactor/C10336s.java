package com.tinder.auth.interactor;

import com.tinder.api.ApiErrorTransformer;
import com.tinder.api.ApiErrorTransformer.ErrorHandler;
import com.tinder.auth.repository.AuthService;
import com.tinder.domain.common.usecase.SingleUseCase;
import com.tinder.model.auth.AuthException;
import com.tinder.model.auth.ValidationStatus;
import com.tinder.model.auth.network.AccountKitValidateRequest;
import com.tinder.model.auth.network.ValidateData;
import com.tinder.model.auth.network.ValidateResponse;
import com.tinder.model.network.ErrorResponseConverter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import rx.Observable;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/auth/interactor/ValidateAccountKitToken;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "", "Lcom/tinder/model/auth/ValidationStatus;", "authService", "Lcom/tinder/auth/repository/AuthService;", "converter", "Lcom/tinder/model/network/ErrorResponseConverter;", "(Lcom/tinder/auth/repository/AuthService;Lcom/tinder/model/network/ErrorResponseConverter;)V", "execute", "Lrx/Single;", "accountKitToken", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.interactor.s */
public final class C10336s implements SingleUseCase<String, ValidationStatus> {
    /* renamed from: a */
    private final AuthService f33755a;
    /* renamed from: b */
    private final ErrorResponseConverter f33756b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012 \u0010\u0004\u001a\u001c\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/model/auth/network/ValidateResponse;", "kotlin.jvm.PlatformType", "errorResponse", "Lretrofit2/Response;", "", "handleError"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.s$a */
    static final class C10335a<T> implements ErrorHandler<T> {
        /* renamed from: a */
        final /* synthetic */ C10336s f33754a;

        C10335a(C10336s c10336s) {
            this.f33754a = c10336s;
        }

        public final Observable<ValidateResponse> handleError(Response<Object> response) {
            return Observable.a(AuthException.fromErrorResponse(this.f33754a.f33756b.fromWire(response.errorBody())));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/model/auth/ValidationStatus;", "response", "Lcom/tinder/model/auth/network/ValidateResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.s$b */
    static final class C12592b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12592b f40673a = new C12592b();

        C12592b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m49749a((ValidateResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ValidationStatus m49749a(ValidateResponse validateResponse) {
            C2668g.a(validateResponse, "response");
            validateResponse = ((ValidateData) validateResponse.getData()).getShouldReLogin();
            return new ValidationStatus(validateResponse != null ? validateResponse.booleanValue() : null);
        }
    }

    public /* synthetic */ Single execute(Object obj) {
        return m42151a((String) obj);
    }

    @Inject
    public C10336s(@NotNull AuthService authService, @NotNull ErrorResponseConverter errorResponseConverter) {
        C2668g.b(authService, "authService");
        C2668g.b(errorResponseConverter, "converter");
        this.f33755a = authService;
        this.f33756b = errorResponseConverter;
    }

    @NotNull
    /* renamed from: a */
    public Single<ValidationStatus> m42151a(@NotNull String str) {
        C2668g.b(str, "accountKitToken");
        str = this.f33755a.validateSMSWithAccountKit(new AccountKitValidateRequest(str)).a(new ApiErrorTransformer(new C10335a(this))).k(C12592b.f40673a).a();
        C2668g.a(str, "authService\n            …}\n            .toSingle()");
        return str;
    }
}
