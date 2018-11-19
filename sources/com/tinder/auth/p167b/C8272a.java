package com.tinder.auth.p167b;

import com.tinder.auth.model.C8292g;
import com.tinder.managers.bk;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/auth/provider/ValidationStateProvider;", "", "sharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "(Lcom/tinder/managers/ManagerSharedPreferences;)V", "getSharedPreferences", "()Lcom/tinder/managers/ManagerSharedPreferences;", "clearValidationRequired", "", "getValidationState", "Lcom/tinder/auth/model/ValidationState;", "setAgeValidationRequired", "state", "", "setGenderValidationRequired", "setSMSValidationRequired", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.b.a */
public final class C8272a {
    @NotNull
    /* renamed from: a */
    private final bk f29515a;

    @Inject
    public C8272a(@NotNull bk bkVar) {
        C2668g.b(bkVar, "sharedPreferences");
        this.f29515a = bkVar;
    }

    @NotNull
    /* renamed from: a */
    public final C8292g m35318a() {
        return new C8292g(this.f29515a.al(), this.f29515a.ak(), this.f29515a.aj());
    }

    /* renamed from: a */
    public final void m35319a(boolean z) {
        this.f29515a.M(z);
    }

    /* renamed from: b */
    public final void m35321b(boolean z) {
        this.f29515a.L(z);
    }

    /* renamed from: c */
    public final void m35322c(boolean z) {
        this.f29515a.K(z);
    }

    /* renamed from: b */
    public final void m35320b() {
        this.f29515a.M(false);
        this.f29515a.L(false);
        this.f29515a.K(false);
    }
}
