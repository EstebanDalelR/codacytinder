package com.tinder.auth.interactor;

import com.tinder.auth.model.AuthState;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.model.C8288b;
import com.tinder.auth.model.C8291f;
import com.tinder.auth.observer.AuthObserver;
import com.tinder.auth.repository.AuthRepository;
import com.tinder.auth.repository.C10353p;
import com.tinder.common.repository.C10698c;
import com.tinder.managers.bk;
import com.tinder.model.auth.AuthErrorType;
import com.tinder.model.auth.AuthException;
import com.tinder.model.auth.network.AuthRequest;
import com.tinder.model.auth.network.AuthResponse2;
import com.tinder.model.auth.network.Data;
import com.tinder.model.auth.network.SmsValidation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Observable$Transformer;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/auth/interactor/AuthInteractor2;", "", "authRepository", "Lcom/tinder/auth/repository/AuthRepository;", "tokenRepository", "Lcom/tinder/common/repository/TokenRepository;", "sharedPreferencesManager", "Lcom/tinder/managers/ManagerSharedPreferences;", "tinderLongLivedTokenRepository", "Lcom/tinder/auth/repository/TinderLongLivedTokenRepository;", "authObserver", "Lcom/tinder/auth/observer/AuthObserver;", "(Lcom/tinder/auth/repository/AuthRepository;Lcom/tinder/common/repository/TokenRepository;Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/auth/repository/TinderLongLivedTokenRepository;Lcom/tinder/auth/observer/AuthObserver;)V", "authType", "Lcom/tinder/auth/model/AuthType;", "getAuthType", "()Lcom/tinder/auth/model/AuthType;", "authenticate", "Lrx/Observable;", "Lcom/tinder/auth/model/AuthResult;", "request", "Lcom/tinder/model/auth/network/AuthRequest;", "validateAuthRequest", "AuthResultImplTransformer", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.interactor.j */
public final class C8279j {
    /* renamed from: a */
    private final AuthRepository f29528a;
    /* renamed from: b */
    private final C10698c f29529b;
    /* renamed from: c */
    private final bk f29530c;
    /* renamed from: d */
    private final C10353p f29531d;
    /* renamed from: e */
    private final AuthObserver f29532e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/model/auth/network/AuthResponse2;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/model/auth/network/AuthRequest;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.j$b */
    static final class C12583b<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C8279j f40651a;

        C12583b(C8279j c8279j) {
            this.f40651a = c8279j;
        }

        public /* synthetic */ Object call(Object obj) {
            return m49731a((AuthRequest) obj);
        }

        /* renamed from: a */
        public final Observable<AuthResponse2> m49731a(AuthRequest authRequest) {
            return this.f40651a.f29528a.authenticate(authRequest);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/auth/interactor/AuthInteractor2$AuthResultImplTransformer;", "Lrx/Observable$Transformer;", "Lcom/tinder/model/auth/network/AuthResponse2;", "Lcom/tinder/auth/model/AuthResult;", "authType", "Lcom/tinder/auth/model/AuthType;", "(Lcom/tinder/auth/interactor/AuthInteractor2;Lcom/tinder/auth/model/AuthType;)V", "call", "Lrx/Observable;", "source", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.j$a */
    private final class C13615a implements Observable$Transformer<AuthResponse2, C8288b> {
        /* renamed from: a */
        final /* synthetic */ C8279j f43390a;
        /* renamed from: b */
        private final AuthType f43391b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/auth/model/AuthResult;", "kotlin.jvm.PlatformType", "response", "Lcom/tinder/model/auth/network/AuthResponse2;", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.auth.interactor.j$a$a */
        static final class C12582a<T, R> implements Func1<T, Observable<? extends R>> {
            /* renamed from: a */
            final /* synthetic */ C13615a f40650a;

            C12582a(C13615a c13615a) {
                this.f40650a = c13615a;
            }

            public /* synthetic */ Object call(Object obj) {
                return m49730a((AuthResponse2) obj);
            }

            /* renamed from: a */
            public final Observable<C8288b> m49730a(AuthResponse2 authResponse2) {
                C13615a c13615a;
                String stringBuilder;
                C12582a c12582a = this;
                AuthResponse2 authResponse22 = authResponse2;
                if (authResponse22 != null) {
                    Data data = (Data) authResponse2.getData();
                    if (data != null) {
                        Object obj;
                        String authToken;
                        CharSequence charSequence;
                        Object obj2;
                        AuthState authState;
                        String refreshToken;
                        Throwable b;
                        SmsValidation smsValidation;
                        Boolean isRequired;
                        boolean booleanValue;
                        AuthType a;
                        Boolean isNewUser;
                        SmsValidation smsValidation2;
                        Boolean isDismissible;
                        Observable<C8288b> a2;
                        AuthErrorType authErrorType;
                        StringBuilder stringBuilder2;
                        AuthState authState2 = (AuthState) null;
                        Boolean requiresValidation = data.getRequiresValidation();
                        boolean z = false;
                        boolean booleanValue2 = requiresValidation != null ? requiresValidation.booleanValue() : false;
                        if (booleanValue2) {
                            authState2 = AuthState.VALIDATION_REQUIRED;
                        }
                        String onboardingToken = data.getOnboardingToken();
                        CharSequence charSequence2 = onboardingToken;
                        boolean z2 = true;
                        if (charSequence2 != null) {
                            if (charSequence2.length() != 0) {
                                obj = null;
                                if (obj == null) {
                                    c12582a.f40650a.f43390a.f29529b.m43019b(onboardingToken);
                                    authState2 = AuthState.ONBOARDING_REQUIRED;
                                }
                                authToken = data.getAuthToken();
                                charSequence = authToken;
                                if (charSequence != null) {
                                    if (charSequence.length() == 0) {
                                        obj2 = null;
                                        if (obj2 == null) {
                                            c12582a.f40650a.f43390a.f29529b.m43018a(authToken);
                                            if (authState2 == null) {
                                                authState2 = AuthState.AUTHENTICATED;
                                            }
                                        }
                                        authState = authState2;
                                        refreshToken = data.getRefreshToken();
                                        if (refreshToken != null) {
                                            b = c12582a.f40650a.f43390a.f29531d.save(refreshToken).b();
                                            if (b != null) {
                                                C0001a.c(b, "Error saving refresh token", new Object[0]);
                                            }
                                        }
                                        if (authState != null) {
                                            c12582a.f40650a.f43390a.f29530c.a(c12582a.f40650a.f43391b);
                                            c12582a.f40650a.f43390a.f29530c.M(booleanValue2);
                                            smsValidation = data.getSmsValidation();
                                            if (smsValidation != null) {
                                                isRequired = smsValidation.isRequired();
                                                if (isRequired != null) {
                                                    booleanValue = isRequired.booleanValue();
                                                    if (booleanValue2) {
                                                        booleanValue = false;
                                                    }
                                                    a = c12582a.f40650a.f43391b;
                                                    isNewUser = data.isNewUser();
                                                    if (isNewUser != null) {
                                                        z = isNewUser.booleanValue();
                                                    }
                                                    smsValidation2 = data.getSmsValidation();
                                                    if (smsValidation2 != null) {
                                                        isDismissible = smsValidation2.isDismissible();
                                                        if (isDismissible != null) {
                                                            z2 = isDismissible.booleanValue();
                                                        }
                                                    }
                                                    a2 = Observable.a(new C8288b(z, new C8291f(booleanValue, z2), booleanValue2, false, false, authState, authToken, a, 24, null));
                                                    if (a2 != null) {
                                                        if (a2 != null) {
                                                            return a2;
                                                        }
                                                    }
                                                }
                                            }
                                            booleanValue = false;
                                            if (booleanValue2) {
                                                booleanValue = false;
                                            }
                                            a = c12582a.f40650a.f43391b;
                                            isNewUser = data.isNewUser();
                                            if (isNewUser != null) {
                                                z = isNewUser.booleanValue();
                                            }
                                            smsValidation2 = data.getSmsValidation();
                                            if (smsValidation2 != null) {
                                                isDismissible = smsValidation2.isDismissible();
                                                if (isDismissible != null) {
                                                    z2 = isDismissible.booleanValue();
                                                }
                                            }
                                            a2 = Observable.a(new C8288b(z, new C8291f(booleanValue, z2), booleanValue2, false, false, authState, authToken, a, 24, null));
                                            if (a2 != null) {
                                                if (a2 != null) {
                                                    return a2;
                                                }
                                            }
                                        }
                                        c13615a = c12582a.f40650a;
                                        authErrorType = AuthErrorType.UNKNOWN_ERROR;
                                        stringBuilder2 = new StringBuilder();
                                        stringBuilder2.append("can't find a corresponding auth state for ");
                                        stringBuilder2.append(authResponse22);
                                        a2 = Observable.a(AuthException.newInstance(authErrorType, stringBuilder2.toString()));
                                        if (a2 != null) {
                                            return a2;
                                        }
                                    }
                                }
                                obj2 = 1;
                                if (obj2 == null) {
                                    c12582a.f40650a.f43390a.f29529b.m43018a(authToken);
                                    if (authState2 == null) {
                                        authState2 = AuthState.AUTHENTICATED;
                                    }
                                }
                                authState = authState2;
                                refreshToken = data.getRefreshToken();
                                if (refreshToken != null) {
                                    b = c12582a.f40650a.f43390a.f29531d.save(refreshToken).b();
                                    if (b != null) {
                                        C0001a.c(b, "Error saving refresh token", new Object[0]);
                                    }
                                }
                                if (authState != null) {
                                    c12582a.f40650a.f43390a.f29530c.a(c12582a.f40650a.f43391b);
                                    c12582a.f40650a.f43390a.f29530c.M(booleanValue2);
                                    smsValidation = data.getSmsValidation();
                                    if (smsValidation != null) {
                                        isRequired = smsValidation.isRequired();
                                        if (isRequired != null) {
                                            booleanValue = isRequired.booleanValue();
                                            if (booleanValue2) {
                                                booleanValue = false;
                                            }
                                            a = c12582a.f40650a.f43391b;
                                            isNewUser = data.isNewUser();
                                            if (isNewUser != null) {
                                                z = isNewUser.booleanValue();
                                            }
                                            smsValidation2 = data.getSmsValidation();
                                            if (smsValidation2 != null) {
                                                isDismissible = smsValidation2.isDismissible();
                                                if (isDismissible != null) {
                                                    z2 = isDismissible.booleanValue();
                                                }
                                            }
                                            a2 = Observable.a(new C8288b(z, new C8291f(booleanValue, z2), booleanValue2, false, false, authState, authToken, a, 24, null));
                                            if (a2 != null) {
                                                if (a2 != null) {
                                                    return a2;
                                                }
                                            }
                                        }
                                    }
                                    booleanValue = false;
                                    if (booleanValue2) {
                                        booleanValue = false;
                                    }
                                    a = c12582a.f40650a.f43391b;
                                    isNewUser = data.isNewUser();
                                    if (isNewUser != null) {
                                        z = isNewUser.booleanValue();
                                    }
                                    smsValidation2 = data.getSmsValidation();
                                    if (smsValidation2 != null) {
                                        isDismissible = smsValidation2.isDismissible();
                                        if (isDismissible != null) {
                                            z2 = isDismissible.booleanValue();
                                        }
                                    }
                                    a2 = Observable.a(new C8288b(z, new C8291f(booleanValue, z2), booleanValue2, false, false, authState, authToken, a, 24, null));
                                    if (a2 != null) {
                                        if (a2 != null) {
                                            return a2;
                                        }
                                    }
                                }
                                c13615a = c12582a.f40650a;
                                authErrorType = AuthErrorType.UNKNOWN_ERROR;
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("can't find a corresponding auth state for ");
                                stringBuilder2.append(authResponse22);
                                a2 = Observable.a(AuthException.newInstance(authErrorType, stringBuilder2.toString()));
                                if (a2 != null) {
                                    return a2;
                                }
                            }
                        }
                        obj = 1;
                        if (obj == null) {
                            c12582a.f40650a.f43390a.f29529b.m43019b(onboardingToken);
                            authState2 = AuthState.ONBOARDING_REQUIRED;
                        }
                        authToken = data.getAuthToken();
                        charSequence = authToken;
                        if (charSequence != null) {
                            if (charSequence.length() == 0) {
                                obj2 = null;
                                if (obj2 == null) {
                                    c12582a.f40650a.f43390a.f29529b.m43018a(authToken);
                                    if (authState2 == null) {
                                        authState2 = AuthState.AUTHENTICATED;
                                    }
                                }
                                authState = authState2;
                                refreshToken = data.getRefreshToken();
                                if (refreshToken != null) {
                                    b = c12582a.f40650a.f43390a.f29531d.save(refreshToken).b();
                                    if (b != null) {
                                        C0001a.c(b, "Error saving refresh token", new Object[0]);
                                    }
                                }
                                if (authState != null) {
                                    c12582a.f40650a.f43390a.f29530c.a(c12582a.f40650a.f43391b);
                                    c12582a.f40650a.f43390a.f29530c.M(booleanValue2);
                                    smsValidation = data.getSmsValidation();
                                    if (smsValidation != null) {
                                        isRequired = smsValidation.isRequired();
                                        if (isRequired != null) {
                                            booleanValue = isRequired.booleanValue();
                                            if (booleanValue2) {
                                                booleanValue = false;
                                            }
                                            a = c12582a.f40650a.f43391b;
                                            isNewUser = data.isNewUser();
                                            if (isNewUser != null) {
                                                z = isNewUser.booleanValue();
                                            }
                                            smsValidation2 = data.getSmsValidation();
                                            if (smsValidation2 != null) {
                                                isDismissible = smsValidation2.isDismissible();
                                                if (isDismissible != null) {
                                                    z2 = isDismissible.booleanValue();
                                                }
                                            }
                                            a2 = Observable.a(new C8288b(z, new C8291f(booleanValue, z2), booleanValue2, false, false, authState, authToken, a, 24, null));
                                            if (a2 != null) {
                                                if (a2 != null) {
                                                    return a2;
                                                }
                                            }
                                        }
                                    }
                                    booleanValue = false;
                                    if (booleanValue2) {
                                        booleanValue = false;
                                    }
                                    a = c12582a.f40650a.f43391b;
                                    isNewUser = data.isNewUser();
                                    if (isNewUser != null) {
                                        z = isNewUser.booleanValue();
                                    }
                                    smsValidation2 = data.getSmsValidation();
                                    if (smsValidation2 != null) {
                                        isDismissible = smsValidation2.isDismissible();
                                        if (isDismissible != null) {
                                            z2 = isDismissible.booleanValue();
                                        }
                                    }
                                    a2 = Observable.a(new C8288b(z, new C8291f(booleanValue, z2), booleanValue2, false, false, authState, authToken, a, 24, null));
                                    if (a2 != null) {
                                        if (a2 != null) {
                                            return a2;
                                        }
                                    }
                                }
                                c13615a = c12582a.f40650a;
                                authErrorType = AuthErrorType.UNKNOWN_ERROR;
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("can't find a corresponding auth state for ");
                                stringBuilder2.append(authResponse22);
                                a2 = Observable.a(AuthException.newInstance(authErrorType, stringBuilder2.toString()));
                                if (a2 != null) {
                                    return a2;
                                }
                            }
                        }
                        obj2 = 1;
                        if (obj2 == null) {
                            c12582a.f40650a.f43390a.f29529b.m43018a(authToken);
                            if (authState2 == null) {
                                authState2 = AuthState.AUTHENTICATED;
                            }
                        }
                        authState = authState2;
                        refreshToken = data.getRefreshToken();
                        if (refreshToken != null) {
                            b = c12582a.f40650a.f43390a.f29531d.save(refreshToken).b();
                            if (b != null) {
                                C0001a.c(b, "Error saving refresh token", new Object[0]);
                            }
                        }
                        if (authState != null) {
                            c12582a.f40650a.f43390a.f29530c.a(c12582a.f40650a.f43391b);
                            c12582a.f40650a.f43390a.f29530c.M(booleanValue2);
                            smsValidation = data.getSmsValidation();
                            if (smsValidation != null) {
                                isRequired = smsValidation.isRequired();
                                if (isRequired != null) {
                                    booleanValue = isRequired.booleanValue();
                                    if (booleanValue2) {
                                        booleanValue = false;
                                    }
                                    a = c12582a.f40650a.f43391b;
                                    isNewUser = data.isNewUser();
                                    if (isNewUser != null) {
                                        z = isNewUser.booleanValue();
                                    }
                                    smsValidation2 = data.getSmsValidation();
                                    if (smsValidation2 != null) {
                                        isDismissible = smsValidation2.isDismissible();
                                        if (isDismissible != null) {
                                            z2 = isDismissible.booleanValue();
                                        }
                                    }
                                    a2 = Observable.a(new C8288b(z, new C8291f(booleanValue, z2), booleanValue2, false, false, authState, authToken, a, 24, null));
                                    if (a2 != null) {
                                        if (a2 != null) {
                                            return a2;
                                        }
                                    }
                                }
                            }
                            booleanValue = false;
                            if (booleanValue2) {
                                booleanValue = false;
                            }
                            a = c12582a.f40650a.f43391b;
                            isNewUser = data.isNewUser();
                            if (isNewUser != null) {
                                z = isNewUser.booleanValue();
                            }
                            smsValidation2 = data.getSmsValidation();
                            if (smsValidation2 != null) {
                                isDismissible = smsValidation2.isDismissible();
                                if (isDismissible != null) {
                                    z2 = isDismissible.booleanValue();
                                }
                            }
                            a2 = Observable.a(new C8288b(z, new C8291f(booleanValue, z2), booleanValue2, false, false, authState, authToken, a, 24, null));
                            if (a2 != null) {
                                if (a2 != null) {
                                    return a2;
                                }
                            }
                        }
                        c13615a = c12582a.f40650a;
                        authErrorType = AuthErrorType.UNKNOWN_ERROR;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("can't find a corresponding auth state for ");
                        stringBuilder2.append(authResponse22);
                        a2 = Observable.a(AuthException.newInstance(authErrorType, stringBuilder2.toString()));
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                c13615a = c12582a.f40650a;
                if (authResponse22 != null) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("empty response: ");
                    stringBuilder3.append(authResponse22);
                    stringBuilder = stringBuilder3.toString();
                    if (stringBuilder != null) {
                        return Observable.a(AuthException.newInstance(AuthErrorType.UNKNOWN_ERROR, stringBuilder));
                    }
                }
                stringBuilder = "empty response: null";
                return Observable.a(AuthException.newInstance(AuthErrorType.UNKNOWN_ERROR, stringBuilder));
            }
        }

        public C13615a(C8279j c8279j, @NotNull AuthType authType) {
            C2668g.b(authType, "authType");
            this.f43390a = c8279j;
            this.f43391b = authType;
        }

        public /* synthetic */ Object call(Object obj) {
            return m53101a((Observable) obj);
        }

        @NotNull
        /* renamed from: a */
        public Observable<C8288b> m53101a(@NotNull Observable<AuthResponse2> observable) {
            C2668g.b(observable, "source");
            observable = observable.h(new C12582a(this));
            C2668g.a(observable, "source.flatMap { respons…          }\n            }");
            return observable;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "authResult", "Lcom/tinder/auth/model/AuthResult;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.j$c */
    static final class C13616c<T> implements Action1<C8288b> {
        /* renamed from: a */
        final /* synthetic */ C8279j f43392a;

        C13616c(C8279j c8279j) {
            this.f43392a = c8279j;
        }

        public /* synthetic */ void call(Object obj) {
            m53102a((C8288b) obj);
        }

        /* renamed from: a */
        public final void m53102a(C8288b c8288b) {
            AuthObserver e = this.f43392a.f29532e;
            C2668g.a(c8288b, "authResult");
            e.onAuthenticated(c8288b);
        }
    }

    @Inject
    public C8279j(@NotNull AuthRepository authRepository, @NotNull C10698c c10698c, @NotNull bk bkVar, @NotNull C10353p c10353p, @NotNull AuthObserver authObserver) {
        C2668g.b(authRepository, "authRepository");
        C2668g.b(c10698c, "tokenRepository");
        C2668g.b(bkVar, "sharedPreferencesManager");
        C2668g.b(c10353p, "tinderLongLivedTokenRepository");
        C2668g.b(authObserver, "authObserver");
        this.f29528a = authRepository;
        this.f29529b = c10698c;
        this.f29530c = bkVar;
        this.f29531d = c10353p;
        this.f29532e = authObserver;
    }

    @Nullable
    /* renamed from: a */
    public final AuthType m35341a() {
        return this.f29530c.aa();
    }

    @NotNull
    /* renamed from: a */
    public final Observable<C8288b> m35342a(@NotNull AuthRequest authRequest) {
        C2668g.b(authRequest, "request");
        AuthType authType = authRequest.getAuthType();
        authRequest = m35337b(authRequest).h(new C12583b(this));
        C2668g.a(authType, "authType");
        authRequest = authRequest.a(new C13615a(this, authType)).b(new C13616c(this));
        C2668g.a(authRequest, "validateAuthRequest(requ…thenticated(authResult) }");
        return authRequest;
    }

    /* renamed from: b */
    private final Observable<AuthRequest> m35337b(AuthRequest authRequest) {
        Object obj;
        AuthType authType = authRequest.getAuthType();
        CharSequence accessToken = authRequest.getAccessToken();
        Object obj2 = 1;
        if (accessToken != null) {
            if (accessToken.length() != 0) {
                obj = null;
                if (obj != null) {
                    accessToken = authRequest.getRefreshToken();
                    if (accessToken != null) {
                        if (accessToken.length() == 0) {
                            obj2 = null;
                        }
                    }
                    if (obj2 != null) {
                        authRequest = Observable.a(AuthException.createNoLongLivedTokenException(authType));
                        C2668g.a(authRequest, "Observable.error(AuthExc…TokenException(authType))");
                        return authRequest;
                    }
                }
                authRequest = Observable.a(authRequest);
                C2668g.a(authRequest, "Observable.just(request)");
                return authRequest;
            }
        }
        obj = 1;
        if (obj != null) {
            accessToken = authRequest.getRefreshToken();
            if (accessToken != null) {
                if (accessToken.length() == 0) {
                    obj2 = null;
                }
            }
            if (obj2 != null) {
                authRequest = Observable.a(AuthException.createNoLongLivedTokenException(authType));
                C2668g.a(authRequest, "Observable.error(AuthExc…TokenException(authType))");
                return authRequest;
            }
        }
        authRequest = Observable.a(authRequest);
        C2668g.a(authRequest, "Observable.just(request)");
        return authRequest;
    }
}
