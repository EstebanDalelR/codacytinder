package com.tinder.onboarding.repository;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.OnboardingTokenProvider;
import com.tinder.domain.auth.UniqueIdFactory;
import com.tinder.onboarding.exception.BitmapDecodeFailedException;
import com.tinder.onboarding.exception.OnboardingInternalErrorException;
import com.tinder.onboarding.exception.OnboardingInvalidDataException;
import com.tinder.onboarding.exception.OnboardingInvalidTokenException;
import com.tinder.onboarding.exception.OnboardingJsonParseException;
import com.tinder.onboarding.exception.OnboardingServerException;
import com.tinder.onboarding.exception.OnboardingUnderageException;
import com.tinder.onboarding.model.OnboardingExperiments;
import com.tinder.onboarding.model.OnboardingInvalidDataType;
import com.tinder.onboarding.model.OnboardingUser;
import com.tinder.onboarding.model.OnboardingUserPhoto;
import com.tinder.onboarding.model.network.DataResponse;
import com.tinder.onboarding.model.network.Field.Type;
import com.tinder.onboarding.model.network.FieldsResponse;
import com.tinder.onboarding.model.network.OnboardingErrorResponse;
import com.tinder.onboarding.model.network.OnboardingInvalidChars;
import com.tinder.onboarding.model.network.UpdateFieldsRequest;
import com.tinder.scope.ActivityScope;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.List;
import java8.util.Objects;
import javax.inject.Inject;
import okhttp3.C15958m;
import okhttp3.C15964r;
import okhttp3.C17690n.C15960b;
import org.joda.time.LocalDate;
import p000a.p001a.C0001a;
import retrofit2.Response;
import rx.Completable;
import rx.Observable;
import rx.Observable$Transformer;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;
import rx.subjects.C19785a;

@ActivityScope
/* renamed from: com.tinder.onboarding.repository.s */
public class C12187s implements OnboardingUserRepository {
    /* renamed from: a */
    private static List<String> f39477a = ((List) Observable.a(Type.values()).h(ah.f43210a).v().u().a());
    @NonNull
    /* renamed from: b */
    private final OnboardingService f39478b;
    @NonNull
    /* renamed from: c */
    private final C9986a f39479c;
    @NonNull
    /* renamed from: d */
    private final OnboardingTokenProvider f39480d;
    @NonNull
    /* renamed from: e */
    private final UniqueIdFactory f39481e;
    @NonNull
    /* renamed from: f */
    private final Gson f39482f;
    @NonNull
    /* renamed from: g */
    private final OnboardingErrorHandler f39483g;
    @NonNull
    /* renamed from: h */
    private final OnboardingExperiments f39484h;
    @NonNull
    /* renamed from: i */
    private C19785a<OnboardingUser> f39485i = C19785a.w();
    @NonNull
    /* renamed from: j */
    private final Observable$Transformer<OnboardingUser, OnboardingUser> f39486j;
    @NonNull
    /* renamed from: k */
    private final C14105a<FieldsResponse> f39487k;
    @NonNull
    /* renamed from: l */
    private final C14105a<DataResponse<Void>> f39488l;

    /* renamed from: com.tinder.onboarding.repository.s$a */
    private class C14105a<T> implements Observable$Transformer<Response<T>, T> {
        /* renamed from: a */
        final /* synthetic */ C12187s f44788a;

        private C14105a(C12187s c12187s) {
            this.f44788a = c12187s;
        }

        public /* synthetic */ Object call(Object obj) {
            return m53823a((Observable) obj);
        }

        /* renamed from: a */
        public Observable<T> m53823a(Observable<Response<T>> observable) {
            return observable.h(new ap(this.f44788a)).a(new aq(this));
        }

        /* renamed from: a */
        final /* synthetic */ void m53824a(Throwable th) {
            if (th instanceof OnboardingJsonParseException) {
                this.f44788a.f39483g.handleApiParseError(((OnboardingJsonParseException) th).m40927a());
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Observable m48328a(Observable observable) {
        return observable;
    }

    @Inject
    C12187s(@NonNull OnboardingService onboardingService, @NonNull C9986a c9986a, @NonNull OnboardingTokenProvider onboardingTokenProvider, @NonNull UniqueIdFactory uniqueIdFactory, @NonNull Gson gson, @NonNull OnboardingErrorHandler onboardingErrorHandler, @NonNull OnboardingExperiments onboardingExperiments) {
        this.f39478b = onboardingService;
        this.f39479c = c9986a;
        this.f39480d = onboardingTokenProvider;
        this.f39481e = uniqueIdFactory;
        this.f39482f = gson;
        this.f39483g = onboardingErrorHandler;
        this.f39484h = onboardingExperiments;
        this.f39486j = new C14106t(this);
        this.f39487k = new C14105a();
        this.f39488l = new C14105a();
    }

    /* renamed from: b */
    final /* synthetic */ Observable m48348b(Observable observable) {
        return observable.b(new ad(this)).a(new ae(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m48345a(OnboardingUser onboardingUser) {
        this.f39485i.onNext(onboardingUser);
    }

    /* renamed from: a */
    final /* synthetic */ void m48346a(Throwable th) {
        if (th instanceof OnboardingInvalidTokenException) {
            this.f39485i.onError(th);
        }
    }

    public Observable<OnboardingUser> getUser() {
        return m48335d().e();
    }

    public Observable<OnboardingUser> getUnderageUser() {
        return m48336e().a(this.f39486j);
    }

    public Completable updateUser(@NonNull OnboardingUser onboardingUser) {
        return m48331b((OnboardingUser) Objects.b(onboardingUser)).a(this.f39486j).b();
    }

    public Completable updateUserPhoto(@NonNull OnboardingUserPhoto onboardingUserPhoto) {
        onboardingUserPhoto = Observable.b(m48337f(), m48332b(onboardingUserPhoto.getPhoto()), new C13530u(this)).h(af.f43209a).a(this.f39487k);
        C9986a c9986a = this.f39479c;
        c9986a.getClass();
        return onboardingUserPhoto.k(ai.m52885a(c9986a)).a(this.f39486j).b();
    }

    /* renamed from: a */
    final /* synthetic */ Observable m48344a(String str, C15960b c15960b) {
        return this.f39478b.updateUserPhoto(str, f39477a, c15960b);
    }

    public Completable createCompleteUser() {
        return m48337f().h(new aj(this)).a(this.f39488l).b().b(new ak(this));
    }

    /* renamed from: b */
    final /* synthetic */ Observable m48347b(String str) {
        return this.f39478b.completeUser(str, this.f39481e.getInstanceId());
    }

    /* renamed from: c */
    final /* synthetic */ void m48350c() {
        this.f39485i = C19785a.w();
    }

    public Completable deleteUser() {
        Observable f = m48337f();
        OnboardingService onboardingService = this.f39478b;
        onboardingService.getClass();
        return f.h(al.m52886a(onboardingService)).a(this.f39488l).b().b(new am(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m48349b() {
        this.f39485i = C19785a.w();
    }

    /* renamed from: b */
    private Observable<C15960b> m48332b(@NonNull File file) {
        return Observable.a(new an(this, file)).k(new ao(this, file));
    }

    /* renamed from: a */
    final /* synthetic */ Bitmap m48338a(@NonNull File file) throws Exception {
        return m48333c(file);
    }

    /* renamed from: a */
    final /* synthetic */ C15960b m48341a(@NonNull File file, Bitmap bitmap) {
        return C15960b.a(ManagerWebServices.PARAM_PHOTO, file.getName(), C15964r.create(C15958m.a("image/jpeg"), m48329a(bitmap)));
    }

    /* renamed from: c */
    private Bitmap m48333c(@NonNull File file) throws BitmapDecodeFailedException {
        Bitmap c = C12187s.m48334c(file.getAbsolutePath());
        if (c != null) {
            return (c.getHeight() > 2000 || c.getWidth() > 2000) ? Bitmap.createScaledBitmap(c, 2000, 2000, true) : c;
        } else {
            C0001a.e("resizeIfNecessary failed, file=%s", new Object[]{file.getAbsolutePath()});
            throw new BitmapDecodeFailedException();
        }
    }

    /* renamed from: a */
    private byte[] m48329a(@NonNull Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.JPEG, 85, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: d */
    private C19785a<OnboardingUser> m48335d() {
        if (!(this.f39485i.x() || this.f39485i.y())) {
            this.f39485i = C19785a.w();
            Observable a = m48336e().b(Schedulers.io()).a(C19397a.a());
            C19785a c19785a = this.f39485i;
            c19785a.getClass();
            Action1 a2 = C14107v.m53825a(c19785a);
            C19785a c19785a2 = this.f39485i;
            c19785a2.getClass();
            a.a(a2, C14108w.m53826a(c19785a2));
        }
        return this.f39485i;
    }

    /* renamed from: e */
    private Observable<OnboardingUser> m48336e() {
        Observable a = m48337f().h(new C13531x(this)).a(this.f39487k);
        C9986a c9986a = this.f39479c;
        c9986a.getClass();
        return a.k(C13532y.m52894a(c9986a));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m48343a(String str) {
        return this.f39478b.getUserFields(str, f39477a);
    }

    /* renamed from: b */
    private Observable<OnboardingUser> m48331b(@NonNull OnboardingUser onboardingUser) {
        onboardingUser = m48337f().k(new C13533z(this, onboardingUser)).h(new aa(this)).a(this.f39487k);
        C9986a c9986a = this.f39479c;
        c9986a.getClass();
        return onboardingUser.k(ab.m52884a(c9986a));
    }

    /* renamed from: a */
    final /* synthetic */ UpdateFieldsRequest m48339a(@NonNull OnboardingUser onboardingUser, String str) {
        return this.f39479c.m40981a(str, (OnboardingUser) Objects.b(onboardingUser));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m48342a(UpdateFieldsRequest updateFieldsRequest) {
        return this.f39478b.updateUserFields(updateFieldsRequest.getToken(), f39477a, updateFieldsRequest);
    }

    /* renamed from: f */
    private Observable<String> m48337f() {
        return Observable.a(new ac(this));
    }

    /* renamed from: a */
    final /* synthetic */ String m48340a() throws Exception {
        return (String) Objects.a(this.f39480d.getOnboardingToken(), "Onboarding token must not be null");
    }

    /* renamed from: a */
    private <T> Observable<T> m48327a(@NonNull Response<T> response) {
        if (((Response) Objects.b(response)).isSuccessful()) {
            return Observable.a(response.body());
        }
        OnboardingErrorResponse a = this.f39479c.m40980a(response.errorBody());
        int code = response.code();
        if (!(a == null || a.getData() == null)) {
            code = a.getData().getInternalCode();
        }
        this.f39483g.handleApiError(code);
        return Observable.a(m48324a(response.code(), a));
    }

    /* renamed from: a */
    private Throwable m48324a(int i, @Nullable OnboardingErrorResponse onboardingErrorResponse) {
        if (i == 401) {
            return new OnboardingInvalidTokenException();
        }
        if (i == 403) {
            return new OnboardingUnderageException(LocalDate.a().c(this.f39484h.ageLimit()).b(1));
        }
        StringBuilder stringBuilder;
        if (i == 400) {
            if (onboardingErrorResponse != null) {
                if (onboardingErrorResponse.getData() != 0) {
                    i = onboardingErrorResponse.getData();
                    OnboardingInvalidDataType fromInternalCode = OnboardingInvalidDataType.fromInternalCode(i.getInternalCode());
                    Throwable onboardingInvalidDataException = new OnboardingInvalidDataException(fromInternalCode);
                    if (OnboardingInvalidDataType.INVALID_CHARACTERS == fromInternalCode) {
                        OnboardingInvalidChars onboardingInvalidChars = (OnboardingInvalidChars) this.f39482f.fromJson(i.getErrorData(), OnboardingInvalidChars.class);
                        if (!(onboardingInvalidChars == null || onboardingInvalidChars.getInvalidCharacters() == null)) {
                            onboardingInvalidDataException.m40925a(onboardingInvalidChars.getInvalidCharacters());
                        }
                    }
                    return onboardingInvalidDataException;
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("error response or its data is null ");
            stringBuilder.append(onboardingErrorResponse);
            return new OnboardingInternalErrorException(stringBuilder.toString());
        } else if (i < 500) {
            return new OnboardingInternalErrorException();
        } else {
            if (onboardingErrorResponse != null) {
                if (onboardingErrorResponse.getData() != 0) {
                    return new OnboardingServerException(onboardingErrorResponse.getData().getInternalCode());
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("error response or its data is null ");
            stringBuilder.append(onboardingErrorResponse);
            return new OnboardingInternalErrorException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    private static android.graphics.Bitmap m48334c(@android.support.annotation.NonNull java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0014, all -> 0x0012 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0014, all -> 0x0012 }
        r2 = android.graphics.BitmapFactory.decodeStream(r1, r0, r0);	 Catch:{ Exception -> 0x0010 }
        if (r1 == 0) goto L_0x001f;
    L_0x000c:
        r1.close();	 Catch:{ IOException -> 0x001f }
        goto L_0x001f;
    L_0x0010:
        r2 = move-exception;
        goto L_0x0016;
    L_0x0012:
        r2 = move-exception;
        goto L_0x0022;
    L_0x0014:
        r2 = move-exception;
        r1 = r0;
    L_0x0016:
        p000a.p001a.C0001a.c(r2);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x001e;
    L_0x001b:
        r1.close();	 Catch:{ IOException -> 0x001e }
    L_0x001e:
        r2 = r0;
    L_0x001f:
        return r2;
    L_0x0020:
        r2 = move-exception;
        r0 = r1;
    L_0x0022:
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0.close();	 Catch:{ IOException -> 0x0027 }
    L_0x0027:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.onboarding.repository.s.c(java.lang.String):android.graphics.Bitmap");
    }
}
