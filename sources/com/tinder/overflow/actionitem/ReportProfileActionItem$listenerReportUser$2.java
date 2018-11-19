package com.tinder.overflow.actionitem;

import com.tinder.enums.ReportCause;
import com.tinder.listeners.ListenerReportUser;
import com.tinder.overflow.model.ReasonOption;
import com.tinder.overflow.p299a.C10015c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/listeners/ListenerReportUser;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ReportProfileActionItem$listenerReportUser$2 extends Lambda implements Function0<ListenerReportUser> {
    /* renamed from: a */
    final /* synthetic */ C12234k f44809a;

    ReportProfileActionItem$listenerReportUser$2(C12234k c12234k) {
        this.f44809a = c12234k;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53839a();
    }

    @NotNull
    /* renamed from: a */
    public final ListenerReportUser m53839a() {
        return new ListenerReportUser() {
            public final void onReportUser(ReportCause reportCause, String str, boolean z) {
                z = this.f44809a.f39605c;
                if (z) {
                    C10015c f = this.f44809a.m48419f();
                    C2668g.a(reportCause, "reportCause");
                    f.m41037a(z, reportCause, str);
                }
                z = this.f44809a.f39606d;
                if (z) {
                    f = this.f44809a.m48419f();
                    C2668g.a(reportCause, "reportCause");
                    f.m41039b(z, reportCause, str);
                }
                this.f44809a.f39609g = ReasonOption.Companion.m41078a(reportCause);
                this.f44809a.f39610h = str;
            }
        };
    }
}
