package com.tinder.profile.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.common.p076a.C2640a;
import com.tinder.deadshot.Deadshot;
import com.tinder.dialogs.aa;
import com.tinder.enums.ReportCause;
import com.tinder.listeners.ListenerReportUser;
import com.tinder.profile.model.Profile;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.profile.presenter.bb;
import com.tinder.profile.target.ProfileReportUserTarget;
import com.tinder.utils.at;
import com.tinder.utils.at.C15355a;
import javax.inject.Inject;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u001f\u001a\u00020\u001eH\u0014J\b\u0010 \u001a\u00020\u001eH\u0014J\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020\u001eH\u0016R\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R#\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lcom/tinder/profile/view/ProfileReportUserView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/profile/target/ProfileReportUserTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "IS_REC", "", "listenerReportUser", "Lcom/tinder/listeners/ListenerReportUser;", "profile", "Lcom/tinder/profile/model/Profile;", "profileReportUserPresenter", "Lcom/tinder/profile/presenter/ProfileReportUserPresenter;", "getProfileReportUserPresenter$Tinder_release", "()Lcom/tinder/profile/presenter/ProfileReportUserPresenter;", "setProfileReportUserPresenter$Tinder_release", "(Lcom/tinder/profile/presenter/ProfileReportUserPresenter;)V", "reportUserDialog", "Lcom/tinder/dialogs/ReportUserDialog;", "reportUserTitleView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getReportUserTitleView", "()Landroid/widget/TextView;", "reportUserTitleView$delegate", "Lkotlin/Lazy;", "bindProfile", "", "onAttachedToWindow", "onDetachedFromWindow", "setOnClickListener", "l", "Landroid/view/View$OnClickListener;", "showReportDialog", "showReportFailure", "showReportSuccessful", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileReportUserView extends FrameLayout implements ProfileReportUserTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f50286a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ProfileReportUserView.class), "reportUserTitleView", "getReportUserTitleView()Landroid/widget/TextView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public bb f50287b;
    /* renamed from: c */
    private final Lazy f50288c = C15810e.m59833a((Function0) new ProfileReportUserView$reportUserTitleView$2(this));
    /* renamed from: d */
    private final boolean f50289d = true;
    /* renamed from: e */
    private aa f50290e;
    /* renamed from: f */
    private Profile f50291f;
    /* renamed from: g */
    private final ListenerReportUser f50292g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.ProfileReportUserView$b */
    static final class C14448b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ProfileReportUserView f45789a;

        C14448b(ProfileReportUserView profileReportUserView) {
            this.f45789a = profileReportUserView;
        }

        public final void onClick(View view) {
            this.f45789a.m61039a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "reportCause", "Lcom/tinder/enums/ReportCause;", "kotlin.jvm.PlatformType", "otherReasonDetails", "", "isRec", "", "onReportUser"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.view.ProfileReportUserView$a */
    static final class C16153a implements ListenerReportUser {
        /* renamed from: a */
        final /* synthetic */ ProfileReportUserView f50285a;

        C16153a(ProfileReportUserView profileReportUserView) {
            this.f50285a = profileReportUserView;
        }

        public final void onReportUser(ReportCause reportCause, String str, boolean z) {
            C2640a.a(this.f50285a.f50291f, "Profile cannot be null!");
            z = this.f50285a.getProfileReportUserPresenter$Tinder_release();
            Profile b = this.f50285a.f50291f;
            if (b == null) {
                C2668g.a();
            }
            String a = b.mo11651a();
            C2668g.a(a, "profile!!.id()");
            C2668g.a(reportCause, "reportCause");
            Profile b2 = this.f50285a.f50291f;
            if (b2 == null) {
                C2668g.a();
            }
            z.m55019a(a, reportCause, str, b2.mo11675y());
        }
    }

    public final TextView getReportUserTitleView() {
        Lazy lazy = this.f50288c;
        KProperty kProperty = f50286a[0];
        return (TextView) lazy.getValue();
    }

    public ProfileReportUserView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (isInEditMode() == null) {
            attributeSet = C14398a.m54830a(context);
            if (attributeSet == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.profile.module.ProfileComponentProvider");
            }
            ((ProfileComponentProvider) attributeSet).provideComponent().inject(this);
        }
        View.inflate(context, R.layout.report_user_view, this);
        this.f50292g = (ListenerReportUser) new C16153a(this);
    }

    @NotNull
    public final bb getProfileReportUserPresenter$Tinder_release() {
        bb bbVar = this.f50287b;
        if (bbVar == null) {
            C2668g.b("profileReportUserPresenter");
        }
        return bbVar;
    }

    public final void setProfileReportUserPresenter$Tinder_release(@NotNull bb bbVar) {
        C2668g.b(bbVar, "<set-?>");
        this.f50287b = bbVar;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        bb bbVar = this.f50287b;
        if (bbVar == null) {
            C2668g.b("profileReportUserPresenter");
        }
        Deadshot.take(this, bbVar);
        super.setOnClickListener(new C14448b(this));
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void setOnClickListener(@Nullable OnClickListener onClickListener) {
        throw ((Throwable) new IllegalStateException("Setting click listener of ProfileReportUserView is not allowed."));
    }

    public void showReportFailure() {
        C15355a c15355a = at.f47621a;
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        c15355a.m57627a((Activity) context, (int) R.string.error_report_notification);
        aa aaVar = this.f50290e;
        if (aaVar != null) {
            aaVar.dismiss();
        }
    }

    public void showReportSuccessful() {
        aa aaVar = this.f50290e;
        if (aaVar != null) {
            aaVar.n();
        }
    }

    /* renamed from: a */
    public final void m61042a(@NotNull Profile profile) {
        C2668g.b(profile, "profile");
        this.f50291f = profile;
        Context context = getContext();
        Object[] objArr = new Object[1];
        profile = profile.mo11652b();
        C2668g.a(profile, "profile.name()");
        objArr[0] = new Regex(",").m59919a((CharSequence) profile, "");
        profile = context.getString(R.string.report_name, objArr);
        TextView reportUserTitleView = getReportUserTitleView();
        C2668g.a(reportUserTitleView, "reportUserTitleView");
        reportUserTitleView.setText((CharSequence) profile);
    }

    /* renamed from: a */
    private final void m61039a() {
        this.f50290e = new aa(getContext(), this.f50292g, this.f50289d);
        aa aaVar = this.f50290e;
        if (aaVar == null) {
            C2668g.a();
        }
        aaVar.show();
    }
}
