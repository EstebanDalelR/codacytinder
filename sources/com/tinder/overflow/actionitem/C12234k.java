package com.tinder.overflow.actionitem;

import android.app.Activity;
import android.content.Context;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.listeners.ListenerReportUser;
import com.tinder.managers.ManagerApp;
import com.tinder.overflow.model.C10028a.C12247a;
import com.tinder.overflow.model.C10028a.C12248b;
import com.tinder.overflow.model.C10029b;
import com.tinder.overflow.model.ReasonOption;
import com.tinder.overflow.p299a.C10015c;
import com.tinder.overflow.p358b.C13540a;
import com.tinder.overflow.target.ReportMatchTarget;
import com.tinder.utils.at;
import com.tinder.utils.at.C15355a;
import com.tinder.utils.av;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\u0010\rJ\u000e\u0010!\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0006J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\tH\u0016J\b\u0010'\u001a\u00020\tH\u0016R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/tinder/overflow/actionitem/ReportProfileActionItem;", "Lcom/tinder/overflow/actionitem/ActionItem;", "Lcom/tinder/overflow/target/ReportMatchTarget;", "context", "Landroid/content/Context;", "menuItemText", "", "onItemSelected", "Lkotlin/Function0;", "", "onFeedbackFinished", "Lkotlin/Function1;", "Lcom/tinder/overflow/model/FeedbackFinishedInfo;", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "listenerReportUser", "Lcom/tinder/listeners/ListenerReportUser;", "getListenerReportUser", "()Lcom/tinder/listeners/ListenerReportUser;", "listenerReportUser$delegate", "Lkotlin/Lazy;", "matchId", "personId", "presenter", "Lcom/tinder/overflow/presenter/ReportProfilePresenter;", "getPresenter", "()Lcom/tinder/overflow/presenter/ReportProfilePresenter;", "setPresenter", "(Lcom/tinder/overflow/presenter/ReportProfilePresenter;)V", "reasonCustom", "reasonOption", "Lcom/tinder/overflow/model/ReasonOption;", "reportDialog", "Lcom/tinder/overflow/reporting/ReportDialog;", "bindMatchId", "bindPersonId", "drop", "onSelectedStrategy", "showReportFailure", "showReportSuccessful", "take", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.actionitem.k */
public final class C12234k extends C10020a implements ReportMatchTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39603a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C12234k.class), "listenerReportUser", "getListenerReportUser()Lcom/tinder/listeners/ListenerReportUser;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C10015c f39604b;
    /* renamed from: c */
    private String f39605c;
    /* renamed from: d */
    private String f39606d;
    /* renamed from: e */
    private final Lazy f39607e = C18451c.a((Function0) new ReportProfileActionItem$listenerReportUser$2(this));
    /* renamed from: f */
    private C13540a f39608f;
    /* renamed from: g */
    private ReasonOption f39609g;
    /* renamed from: h */
    private String f39610h;
    /* renamed from: i */
    private final Function1<C10029b, C15813i> f39611i;

    /* renamed from: g */
    private final ListenerReportUser m48413g() {
        Lazy lazy = this.f39607e;
        KProperty kProperty = f39603a[0];
        return (ListenerReportUser) lazy.getValue();
    }

    public C12234k(@NotNull Context context, @NotNull String str, @NotNull Function0<C15813i> function0, @NotNull Function1<? super C10029b, C15813i> function1) {
        C2668g.b(context, "context");
        C2668g.b(str, "menuItemText");
        C2668g.b(function0, "onItemSelected");
        C2668g.b(function1, "onFeedbackFinished");
        super(context, str, function0);
        this.f39611i = function1;
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
    }

    @NotNull
    /* renamed from: f */
    public final C10015c m48419f() {
        C10015c c10015c = this.f39604b;
        if (c10015c == null) {
            C2668g.b("presenter");
        }
        return c10015c;
    }

    /* renamed from: b */
    public void mo10690b() {
        this.f39608f = new C13540a(m41056e(), m48413g());
        C13540a c13540a = this.f39608f;
        if (c13540a == null) {
            C2668g.b("reportDialog");
        }
        c13540a.show();
    }

    public void showReportSuccessful() {
        C13540a c13540a = this.f39608f;
        if (c13540a == null) {
            C2668g.b("reportDialog");
        }
        c13540a.mo9979n();
        Function1 function1 = this.f39611i;
        ReasonOption reasonOption = this.f39609g;
        if (reasonOption == null) {
            C2668g.b("reasonOption");
        }
        function1.invoke(new C10029b(new C12248b(reasonOption), this.f39610h));
    }

    public void showReportFailure() {
        C13540a c13540a = this.f39608f;
        if (c13540a == null) {
            C2668g.b("reportDialog");
        }
        av.a(c13540a);
        C15355a c15355a = at.f47621a;
        Context e = m41056e();
        if (e == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        c15355a.a((Activity) e, R.string.error_report_notification);
        Function1 function1 = this.f39611i;
        ReasonOption reasonOption = this.f39609g;
        if (reasonOption == null) {
            C2668g.b("reasonOption");
        }
        function1.invoke(new C10029b(new C12247a(reasonOption), this.f39610h));
    }

    /* renamed from: c */
    public void mo10691c() {
        C10015c c10015c = this.f39604b;
        if (c10015c == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10015c);
    }

    /* renamed from: d */
    public void mo10692d() {
        Deadshot.drop(this);
    }

    /* renamed from: b */
    public final void m48415b(@NotNull String str) {
        C2668g.b(str, "matchId");
        this.f39605c = str;
    }

    /* renamed from: c */
    public final void m48417c(@NotNull String str) {
        C2668g.b(str, "personId");
        this.f39606d = str;
    }
}
