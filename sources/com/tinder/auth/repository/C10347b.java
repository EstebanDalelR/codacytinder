package com.tinder.auth.repository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.C2635n;
import com.tinder.analytics.performance.C8146b;
import com.tinder.analytics.performance.aa;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.model.AuthType;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.auth.UniqueIdFactory;
import com.tinder.managers.ManagerApp;
import com.tinder.model.analytics.AnalyticsConstants;
import com.tinder.model.auth.AuthErrorType;
import com.tinder.model.auth.AuthException;
import com.tinder.model.auth.network.AuthRequest;
import com.tinder.model.auth.network.AuthResponse2;
import com.tinder.model.auth.network.Data;
import com.tinder.model.network.ErrorResponse;
import com.tinder.model.network.ErrorResponseConverter;
import com.tinder.p071a.C2602d;
import com.tinder.utils.Tinteg;
import com.tinder.utils.ad;
import javax.inject.Inject;
import okhttp3.C15968t;
import retrofit2.Response;
import rx.Observable;
import rx.Observable$Transformer;

/* renamed from: com.tinder.auth.repository.b */
public class C10347b implements AuthRepository {
    /* renamed from: a */
    private final AuthService f33770a;
    /* renamed from: b */
    private final C13620b f33771b;
    /* renamed from: c */
    private final C2602d f33772c;
    /* renamed from: d */
    private final C10333h f33773d;
    /* renamed from: e */
    private final UniqueIdFactory f33774e;
    /* renamed from: f */
    private final C8146b f33775f;
    /* renamed from: g */
    private final aa f33776g;

    /* renamed from: com.tinder.auth.repository.b$1 */
    static /* synthetic */ class C82961 {
        /* renamed from: a */
        static final /* synthetic */ int[] f29570a = new int[AuthType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.auth.model.AuthType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f29570a = r0;
            r0 = f29570a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.auth.model.AuthType.ACCOUNTKIT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f29570a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.auth.model.AuthType.FACEBOOK;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f29570a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.auth.model.AuthType.TINDER_SMS;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.auth.repository.b.1.<clinit>():void");
        }
    }

    /* renamed from: com.tinder.auth.repository.b$a */
    private static class C13619a implements Observable$Transformer<AuthResponse2, AuthResponse2> {
        /* renamed from: a */
        private final AuthType f43395a;
        /* renamed from: b */
        private final C10333h f43396b;
        /* renamed from: c */
        private long f43397c;

        public /* synthetic */ Object call(Object obj) {
            return m53108a((Observable) obj);
        }

        C13619a(AuthType authType, C10333h c10333h) {
            this.f43395a = authType;
            this.f43396b = c10333h;
        }

        /* renamed from: a */
        public Observable<AuthResponse2> m53108a(Observable<AuthResponse2> observable) {
            return observable.b(new C13623e(this)).a(new C13624f(this)).b(new C13625g(this));
        }

        /* renamed from: a */
        final /* synthetic */ void m53109a() {
            m53105a(this.f43395a);
        }

        /* renamed from: a */
        final /* synthetic */ void m53111a(Throwable th) {
            m53106a(this.f43395a, th instanceof AuthException ? ((AuthException) th).getErrorCode() : -1, th.getClass());
        }

        /* renamed from: a */
        final /* synthetic */ void m53110a(AuthResponse2 authResponse2) {
            Data data = (Data) authResponse2.getData();
            if (data != null) {
                authResponse2 = data.isNewUser();
                if (authResponse2 != null) {
                    authResponse2 = authResponse2.booleanValue();
                    m53107a(this.f43395a, authResponse2);
                }
            }
            authResponse2 = null;
            m53107a(this.f43395a, authResponse2);
        }

        /* renamed from: a */
        private void m53105a(AuthType authType) {
            this.f43397c = System.currentTimeMillis();
            this.f43396b.m42144e(authType);
        }

        /* renamed from: a */
        private void m53106a(@NonNull AuthType authType, int i, @NonNull Class<? extends Throwable> cls) {
            this.f43396b.m42129a(authType, i, (Class) cls);
        }

        /* renamed from: a */
        private void m53107a(AuthType authType, boolean z) {
            this.f43396b.m42130a(authType, System.currentTimeMillis() - this.f43397c, z);
        }
    }

    /* renamed from: com.tinder.auth.repository.b$b */
    private static class C13620b implements Observable$Transformer<Response<AuthResponse2>, AuthResponse2> {
        /* renamed from: a */
        private final ErrorResponseConverter f43398a;

        public /* synthetic */ Object call(Object obj) {
            return m53113a((Observable) obj);
        }

        C13620b(ErrorResponseConverter errorResponseConverter) {
            this.f43398a = errorResponseConverter;
        }

        /* renamed from: a */
        public Observable<AuthResponse2> m53113a(Observable<Response<AuthResponse2>> observable) {
            return observable.h(new C12603h(this));
        }

        /* renamed from: a */
        final /* synthetic */ Observable m53112a(Response response) {
            if (response.isSuccessful()) {
                return Observable.a(response.body());
            }
            C15968t errorBody = response.errorBody();
            ErrorResponse fromWire = this.f43398a.fromWire(errorBody);
            if (fromWire != null) {
                Throwable fromErrorResponse = AuthException.fromErrorResponse(fromWire);
                if (response.code() == 500) {
                    return Observable.a(new AuthException(AuthErrorType.INTERNAL_ERROR, fromErrorResponse.getMessage(), fromErrorResponse.getErrorCode()));
                }
                return Observable.a(fromErrorResponse);
            } else if (response.code() == 500) {
                return Observable.a(AuthException.newInstance(AuthErrorType.INTERNAL_ERROR, response.raw().toString()));
            } else {
                try {
                    return Observable.a(AuthException.newInstance(AuthErrorType.UNKNOWN_ERROR, errorBody.string()));
                } catch (Response response2) {
                    return Observable.a(new RuntimeException("Something went wrong decoding error response body", response2));
                }
            }
        }
    }

    @Inject
    public C10347b(AuthService authService, ErrorResponseConverter errorResponseConverter, C2602d c2602d, C10333h c10333h, UniqueIdFactory uniqueIdFactory, C2630h c2630h, AbTestUtility abTestUtility, aa aaVar) {
        this.f33770a = authService;
        this.f33771b = new C13620b(errorResponseConverter);
        this.f33772c = c2602d;
        this.f33773d = c10333h;
        this.f33774e = uniqueIdFactory;
        this.f33775f = new C8146b(c2630h, abTestUtility);
        this.f33776g = aaVar;
    }

    public Observable<AuthResponse2> authenticate(@NonNull AuthRequest authRequest) {
        AuthType authType = authRequest.getAuthType();
        return this.f33770a.authenticate(m42156a(authRequest), this.f33774e.getInstanceId(), C10347b.m42155a(authType), authRequest).b(new C13621c(this)).b(new C13622d(this)).a(this.f33771b).a(new C13619a(authType, this.f33773d));
    }

    /* renamed from: a */
    final /* synthetic */ void m42158a() {
        this.f33775f.a("AUTH_TIMER_KEY");
        this.f33776g.a("START_TINDER_TIMER_KEY");
    }

    /* renamed from: a */
    final /* synthetic */ void m42159a(Response response) {
        m42157a("AUTH_TIMER_KEY", response);
    }

    /* renamed from: a */
    private void m42157a(String str, Response<AuthResponse2> response) {
        this.f33775f.b(str);
        this.f33775f.a(str, C2635n.a(response.raw().a().a().toString()), response.raw().a().b(), response.code());
    }

    /* renamed from: a */
    private static String m42155a(AuthType authType) {
        switch (C82961.f29570a[authType.ordinal()]) {
            case 1:
                return AnalyticsConstants.VALUE_ACCOUNTKIT;
            case 2:
                return AnalyticsConstants.VALUE_FACEBOOK;
            case 3:
                return "sms";
            default:
                throw new UnsupportedOperationException("Only support AccountKit and Facebook");
        }
    }

    @Nullable
    /* renamed from: a */
    private String m42156a(@NonNull AuthRequest authRequest) {
        if (authRequest.getAuthType() != AuthType.FACEBOOK || this.f33772c.b().a()) {
            return null;
        }
        Tinteg.alt = authRequest.getAccessToken();
        Tinteg.ali = authRequest.getId();
        authRequest = Tinteg.tintegS(ManagerApp.class, authRequest);
        if (authRequest != null && authRequest.length() <= 2) {
            ad.a("App session's length is less than 2", new IllegalStateException(authRequest));
        }
        return authRequest;
    }
}
