package com.tinder.account.p072a;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.tinder.account.model.UpdateAccountErrorType;
import com.tinder.account.model.UpdateAccountException;
import com.tinder.account.view.UpdatePasswordTarget;
import com.tinder.domain.auth.usecase.PasswordValidator;
import com.tinder.domain.auth.usecase.PasswordValidator.State;
import com.tinder.presenters.PresenterBase;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java8.util.Optional;
import javax.inject.Inject;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;

/* renamed from: com.tinder.account.a.ad */
public class ad extends PresenterBase<UpdatePasswordTarget> {
    @NonNull
    /* renamed from: a */
    private static final List<UpdateAccountErrorType> f14007a = Arrays.asList(new UpdateAccountErrorType[]{UpdateAccountErrorType.PASSWORD_NO_DIGITS, UpdateAccountErrorType.PASSWORD_NO_LETTERS, UpdateAccountErrorType.PASSWORD_TOO_SHORT, UpdateAccountErrorType.PASSWORD_TOO_LONG, UpdateAccountErrorType.PASSWORD_TOO_SIMPLE, UpdateAccountErrorType.PASSWORD_REPEATING_CHARS});
    @NonNull
    /* renamed from: b */
    private final PasswordValidator f14008b;
    @NonNull
    /* renamed from: c */
    private final C19573b f14009c = new C19573b();

    /* renamed from: com.tinder.account.a.ad$1 */
    static /* synthetic */ class C26111 {
        /* renamed from: a */
        static final /* synthetic */ int[] f8146a = new int[State.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = com.tinder.domain.auth.usecase.PasswordValidator.State.values();
            r0 = r0.length;
            r0 = new int[r0];
            f8146a = r0;
            r0 = f8146a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.domain.auth.usecase.PasswordValidator.State.STRONG;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f8146a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.domain.auth.usecase.PasswordValidator.State.EMPTY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f8146a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.domain.auth.usecase.PasswordValidator.State.TOO_SIMPLE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f8146a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.tinder.domain.auth.usecase.PasswordValidator.State.REPEATING_CHARS;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.account.a.ad.1.<clinit>():void");
        }
    }

    @Inject
    public ad(@NonNull PasswordValidator passwordValidator) {
        this.f14008b = passwordValidator;
    }

    /* renamed from: b */
    public void m17284b() {
        m17285c();
    }

    /* renamed from: a */
    public void mo3589a() {
        super.mo3589a();
        this.f14009c.a();
    }

    @NonNull
    /* renamed from: a */
    public Optional<String> m17279a(@NonNull String str) {
        if (this.f14008b.validate(str) != State.STRONG) {
            return Optional.a();
        }
        return Optional.a(str);
    }

    /* renamed from: a */
    public boolean m17283a(@NonNull UpdateAccountException updateAccountException) {
        UpdateAccountErrorType a = updateAccountException.m9783a();
        if (f14007a.contains(a)) {
            m15094a((Action1) ae.f14588a);
            return true;
        } else if (UpdateAccountErrorType.PASSWORD_INVALID_TYPE != a) {
            return null;
        } else {
            m15094a((Action1) af.f14589a);
            return true;
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    void m17285c() {
        m15094a(new ao(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m17281a(UpdatePasswordTarget updatePasswordTarget) {
        updatePasswordTarget = updatePasswordTarget.editTextAfterTextChanges();
        PasswordValidator passwordValidator = this.f14008b;
        passwordValidator.getClass();
        updatePasswordTarget = updatePasswordTarget.h(ap.m17288a(passwordValidator)).r();
        this.f14009c.a(updatePasswordTarget.c(2, TimeUnit.SECONDS).f(aq.f14011a).a(C19397a.a()).d(new ar(this)));
        this.f14009c.a(updatePasswordTarget.a(new as(this), at.f14601a));
        this.f14009c.a(updatePasswordTarget.f(au.f14012a).h().e(updatePasswordTarget).a(new av(this), ag.f14590a));
    }

    /* renamed from: e */
    static final /* synthetic */ Boolean m17278e(State state) {
        state = (state == State.STRONG || state == State.EMPTY) ? null : true;
        return Boolean.valueOf(state);
    }

    /* renamed from: d */
    final /* synthetic */ void m17287d(State state) {
        m15094a((Action1) an.f14597a);
    }

    /* renamed from: c */
    final /* synthetic */ void m17286c(State state) {
        m15094a((Action1) state == State.STRONG ? al.f14595a : am.f14596a);
    }

    /* renamed from: b */
    static final /* synthetic */ Boolean m17277b(State state) {
        return Boolean.valueOf(state == State.STRONG ? true : null);
    }

    /* renamed from: a */
    final /* synthetic */ void m17282a(State state) {
        switch (C26111.f8146a[state.ordinal()]) {
            case 1:
                m15094a((Action1) ah.f14591a);
                return;
            case 2:
                m15094a((Action1) ai.f14592a);
                return;
            case 3:
            case 4:
                m15094a((Action1) aj.f14593a);
                return;
            default:
                m15094a((Action1) ak.f14594a);
                return;
        }
    }
}
