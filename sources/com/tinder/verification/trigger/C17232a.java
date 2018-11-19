package com.tinder.verification.trigger;

import com.tinder.api.ManagerWebServices;
import com.tinder.main.tooltip.C9835c.C9834a;
import com.tinder.main.trigger.Trigger;
import com.tinder.verification.C15388c.C15387a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/verification/trigger/SmsVerificationDisplayRequest;", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue$DisplayRequest;", "viewModelFactory", "Lcom/tinder/verification/VerificationDialogViewModel$Factory;", "isDismissible", "", "trigger", "Lcom/tinder/main/trigger/Trigger;", "owner", "Lcom/tinder/verification/trigger/SmsVerificationDisplayOwner;", "(Lcom/tinder/verification/VerificationDialogViewModel$Factory;ZLcom/tinder/main/trigger/Trigger;Lcom/tinder/verification/trigger/SmsVerificationDisplayOwner;)V", "execute", "", "verification_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.verification.trigger.a */
public final class C17232a extends C9834a {
    /* renamed from: a */
    private final C15387a f52835a;
    /* renamed from: b */
    private final boolean f52836b;
    /* renamed from: c */
    private final SmsVerificationDisplayOwner f52837c;

    public C17232a(@NotNull C15387a c15387a, boolean z, @NotNull Trigger trigger, @NotNull SmsVerificationDisplayOwner smsVerificationDisplayOwner) {
        C2668g.b(c15387a, "viewModelFactory");
        C2668g.b(trigger, "trigger");
        C2668g.b(smsVerificationDisplayOwner, ManagerWebServices.PARAM_GROUP_OWNER);
        super(trigger);
        this.f52835a = c15387a;
        this.f52836b = z;
        this.f52837c = smsVerificationDisplayOwner;
    }

    /* renamed from: a */
    public void m63138a() {
        this.f52837c.showSmsVerificationDialog(this.f52835a, this.f52836b, b());
    }
}
