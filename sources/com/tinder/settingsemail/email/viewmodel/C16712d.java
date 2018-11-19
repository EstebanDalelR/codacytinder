package com.tinder.settingsemail.email.viewmodel;

import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsUnsubscribeRowViewModel;", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "buttonText", "", "canClickButton", "", "(Ljava/lang/String;Z)V", "getButtonText", "()Ljava/lang/String;", "getCanClickButton", "()Z", "getType", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel$Type;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settingsemail.email.viewmodel.d */
public final class C16712d implements EmailSettingsRowViewModel {
    @NotNull
    /* renamed from: a */
    private final String f51699a;
    /* renamed from: b */
    private final boolean f51700b;

    public C16712d(@NotNull String str, boolean z) {
        C2668g.b(str, "buttonText");
        this.f51699a = str;
        this.f51700b = z;
    }

    @NotNull
    /* renamed from: a */
    public final String m62223a() {
        return this.f51699a;
    }

    /* renamed from: b */
    public final boolean m62224b() {
        return this.f51700b;
    }

    @NotNull
    public Type getType() {
        return Type.UNSUBSCRIBE;
    }
}
