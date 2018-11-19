package com.tinder.overflow.actionitem;

import android.app.Activity;
import android.content.Context;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.dialogs.aj;
import com.tinder.enums.ReportCause;
import com.tinder.listeners.OnUnMatchReasonSelectedListener;
import com.tinder.managers.ManagerApp;
import com.tinder.overflow.model.C10028a.C12247a;
import com.tinder.overflow.model.C10028a.C12248b;
import com.tinder.overflow.model.C10029b;
import com.tinder.overflow.model.ReasonOption;
import com.tinder.overflow.p299a.C10017e;
import com.tinder.overflow.target.UnMatchTarget;
import com.tinder.utils.at;
import com.tinder.utils.at.C15355a;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0007H\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020\u0007H\u0016R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/overflow/actionitem/UnMatchActionItem;", "Lcom/tinder/overflow/actionitem/ActionItem;", "Lcom/tinder/overflow/target/UnMatchTarget;", "context", "Landroid/content/Context;", "onItemSelected", "Lkotlin/Function0;", "", "onFeedbackFinished", "Lkotlin/Function1;", "Lcom/tinder/overflow/model/FeedbackFinishedInfo;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "matchId", "", "onUnMatchReasonSelectedListener", "Lcom/tinder/listeners/OnUnMatchReasonSelectedListener;", "presenter", "Lcom/tinder/overflow/presenter/UnMatchPresenter;", "getPresenter", "()Lcom/tinder/overflow/presenter/UnMatchPresenter;", "setPresenter", "(Lcom/tinder/overflow/presenter/UnMatchPresenter;)V", "reasonCustom", "reasonOption", "Lcom/tinder/overflow/model/ReasonOption;", "bind", "model", "Lcom/tinder/overflow/actionitem/UnMatchActionItem$Model;", "drop", "onSelectedStrategy", "showUnMatchFailure", "showUnMatchSuccessful", "take", "Model", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.actionitem.m */
public final class C12237m extends C10020a implements UnMatchTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C10017e f39614a;
    /* renamed from: b */
    private String f39615b;
    /* renamed from: c */
    private final OnUnMatchReasonSelectedListener f39616c = ((OnUnMatchReasonSelectedListener) new C12236b(this));
    /* renamed from: d */
    private ReasonOption f39617d;
    /* renamed from: e */
    private String f39618e;
    /* renamed from: f */
    private final Function1<C10029b, C15813i> f39619f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/overflow/actionitem/UnMatchActionItem$Model;", "", "matchId", "", "menuItemText", "(Ljava/lang/String;Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "getMenuItemText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.actionitem.m$a */
    public static final class C10023a {
        @NotNull
        /* renamed from: a */
        private final String f32893a;
        @NotNull
        /* renamed from: b */
        private final String f32894b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10023a) {
                    C10023a c10023a = (C10023a) obj;
                    if (C2668g.a(this.f32893a, c10023a.f32893a) && C2668g.a(this.f32894b, c10023a.f32894b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f32893a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f32894b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Model(matchId=");
            stringBuilder.append(this.f32893a);
            stringBuilder.append(", menuItemText=");
            stringBuilder.append(this.f32894b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10023a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "matchId");
            C2668g.b(str2, "menuItemText");
            this.f32893a = str;
            this.f32894b = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m41059a() {
            return this.f32893a;
        }

        @NotNull
        /* renamed from: b */
        public final String m41060b() {
            return this.f32894b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "reportCause", "Lcom/tinder/enums/ReportCause;", "additionalInfo", "", "kotlin.jvm.PlatformType", "onUnMatchReasonSelected"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.actionitem.m$b */
    static final class C12236b implements OnUnMatchReasonSelectedListener {
        /* renamed from: a */
        final /* synthetic */ C12237m f39613a;

        C12236b(C12237m c12237m) {
            this.f39613a = c12237m;
        }

        public final void onUnMatchReasonSelected(@Nullable ReportCause reportCause, String str) {
            this.f39613a.m48429f().m41045a(C12237m.m48422a(this.f39613a), reportCause, str);
            this.f39613a.f39617d = ReasonOption.Companion.m41078a(reportCause);
            this.f39613a.f39618e = str;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ String m48422a(C12237m c12237m) {
        c12237m = c12237m.f39615b;
        if (c12237m == null) {
            C2668g.b("matchId");
        }
        return c12237m;
    }

    public C12237m(@NotNull Context context, @NotNull Function0<C15813i> function0, @NotNull Function1<? super C10029b, C15813i> function1) {
        C2668g.b(context, "context");
        C2668g.b(function0, "onItemSelected");
        C2668g.b(function1, "onFeedbackFinished");
        super(context, null, function0, 2, null);
        this.f39619f = function1;
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
    }

    @NotNull
    /* renamed from: f */
    public final C10017e m48429f() {
        C10017e c10017e = this.f39614a;
        if (c10017e == null) {
            C2668g.b("presenter");
        }
        return c10017e;
    }

    /* renamed from: b */
    public void mo10690b() {
        new aj(m41056e(), this.f39616c).show();
    }

    public void showUnMatchSuccessful() {
        Function1 function1 = this.f39619f;
        ReasonOption reasonOption = this.f39617d;
        if (reasonOption == null) {
            C2668g.b("reasonOption");
        }
        function1.invoke(new C10029b(new C12248b(reasonOption), this.f39618e));
    }

    public void showUnMatchFailure() {
        C15355a c15355a = at.f47621a;
        Context e = m41056e();
        if (e == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        c15355a.a((Activity) e, R.string.error_unmatch_notification);
        ReasonOption reasonOption = this.f39617d;
        if (reasonOption == null) {
            C2668g.b("reasonOption");
        }
        C10029b c10029b = new C10029b(new C12247a(reasonOption), this.f39618e);
    }

    /* renamed from: c */
    public void mo10691c() {
        C10017e c10017e = this.f39614a;
        if (c10017e == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10017e);
    }

    /* renamed from: d */
    public void mo10692d() {
        Deadshot.drop(this);
    }

    /* renamed from: a */
    public final void m48425a(@NotNull C10023a c10023a) {
        C2668g.b(c10023a, "model");
        this.f39615b = c10023a.m41059a();
        m41052a(c10023a.m41060b());
    }
}
