package com.tinder.account.data;

import android.support.annotation.NonNull;
import com.tinder.account.model.UpdateAccountErrorType;
import com.tinder.account.model.UpdateAccountException;
import com.tinder.api.ApiErrorTransformer;
import com.tinder.auth.model.p169a.C8284a;
import com.tinder.auth.model.p169a.C8285b;
import com.tinder.auth.repository.AccountService;
import com.tinder.model.network.DataResponse;
import com.tinder.model.network.ErrorResponse.Data;
import com.tinder.model.network.ErrorResponseConverter;
import javax.inject.Inject;
import retrofit2.Response;
import rx.Completable;
import rx.Observable;

/* renamed from: com.tinder.account.data.a */
public class C3878a implements UpdateAccountDataStore {
    @NonNull
    /* renamed from: a */
    private final AccountService f12141a;
    @NonNull
    /* renamed from: b */
    private final ErrorResponseConverter f12142b;
    @NonNull
    /* renamed from: c */
    private final ApiErrorTransformer<DataResponse<Void>> f12143c = m14621a();

    @Inject
    public C3878a(@NonNull AccountService accountService, @NonNull ErrorResponseConverter errorResponseConverter) {
        this.f12141a = accountService;
        this.f12142b = errorResponseConverter;
    }

    public Completable updateEmail(@NonNull String str) {
        return this.f12141a.updateEmail(C8284a.a(str)).a(this.f12143c).b();
    }

    public Completable updatePassword(@NonNull String str) {
        return this.f12141a.updatePassword(C8285b.a(str)).a(this.f12143c).b();
    }

    @NonNull
    /* renamed from: a */
    private ApiErrorTransformer<DataResponse<Void>> m14621a() {
        return new ApiErrorTransformer(new C3879b(this));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m14622a(Response response) {
        Throwable updateAccountException;
        response = this.f12142b.fromWire(response.errorBody());
        if (response == null) {
            updateAccountException = new UpdateAccountException(UpdateAccountErrorType.UNKNOWN, "ErrorResponse is null");
        } else {
            Data data = response.getData();
            if (data == null) {
                UpdateAccountErrorType updateAccountErrorType = UpdateAccountErrorType.UNKNOWN;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got an error response, but the data is null: ");
                stringBuilder.append(response);
                updateAccountException = new UpdateAccountException(updateAccountErrorType, stringBuilder.toString());
            } else {
                updateAccountException = new UpdateAccountException(UpdateAccountErrorType.valueOf(data.getInternalCode()));
            }
        }
        return Observable.a(updateAccountException);
    }
}
