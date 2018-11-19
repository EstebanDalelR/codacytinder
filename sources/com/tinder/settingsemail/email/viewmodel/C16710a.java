package com.tinder.settingsemail.email.viewmodel;

import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsEmailRowViewModel;", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "emailAddress", "", "shouldShowEmailValidationError", "", "canEditEmail", "(Ljava/lang/String;ZZ)V", "getCanEditEmail", "()Z", "getEmailAddress", "()Ljava/lang/String;", "getShouldShowEmailValidationError", "getType", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel$Type;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settingsemail.email.viewmodel.a */
public final class C16710a implements EmailSettingsRowViewModel {
    @NotNull
    /* renamed from: a */
    private final String f51694a;
    /* renamed from: b */
    private final boolean f51695b;
    /* renamed from: c */
    private final boolean f51696c;

    public C16710a(@NotNull String str, boolean z, boolean z2) {
        C2668g.b(str, "emailAddress");
        this.f51694a = str;
        this.f51695b = z;
        this.f51696c = z2;
    }

    @NotNull
    /* renamed from: a */
    public final String m62218a() {
        return this.f51694a;
    }

    /* renamed from: b */
    public final boolean m62219b() {
        return this.f51695b;
    }

    /* renamed from: c */
    public final boolean m62220c() {
        return this.f51696c;
    }

    @NotNull
    public Type getType() {
        return Type.EMAIL;
    }
}
