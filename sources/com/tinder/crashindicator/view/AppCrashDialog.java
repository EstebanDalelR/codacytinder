package com.tinder.crashindicator.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatDialog;
import butterknife.BindColor;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jakewharton.rxbinding.p130a.C5698c;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.crashindicator.analytics.FeedbackAction;
import com.tinder.crashindicator.p203b.C8605a;
import com.tinder.crashindicator.target.AppCrashTarget;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.RxUtils;
import com.tinder.utils.av;
import com.tinder.views.CustomEditText;
import com.tinder.views.CustomTextView;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Subscription;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0007J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0007J\b\u0010\u001c\u001a\u00020\u0012H\u0007J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0017H\u0002R\u0012\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/crashindicator/view/AppCrashDialog;", "Landroid/support/v7/app/AppCompatDialog;", "Lcom/tinder/crashindicator/target/AppCrashTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activeButtonText", "", "inActiveButtonText", "presenter", "Lcom/tinder/crashindicator/presenter/AppCrashPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/crashindicator/presenter/AppCrashPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/crashindicator/presenter/AppCrashPresenter;)V", "textMessageChangesSubscription", "Lrx/Subscription;", "cancelFeedbackButtonOnClick", "", "closeDialog", "continueSwipingButtonOnClick", "observeFeedbackTextChanges", "Lrx/Observable;", "", "onAttachedToWindow", "onBackPressed", "onDetachedFromWindow", "sendButtonOnClick", "sendFeedbackButtonOnClick", "setupTextMessageEditText", "showFeedbackView", "showThankYouView", "updateSendButtonState", "messageText", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AppCrashDialog extends AppCompatDialog implements AppCrashTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C8605a f41234a;
    @BindColor(2131100167)
    @JvmField
    public int activeButtonText;
    /* renamed from: b */
    private Subscription f41235b;
    @BindColor(2131100248)
    @JvmField
    public int inActiveButtonText;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.crashindicator.view.AppCrashDialog$a */
    static final class C8608a implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ AppCrashDialog f30463a;

        C8608a(AppCrashDialog appCrashDialog) {
            this.f30463a = appCrashDialog;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f30463a.m50354a().m36724e();
        }
    }

    public AppCrashDialog(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, R.style.Theme.FloatingDialog);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        getWindow().setWindowAnimations(R.style.dialog_up_down_animation);
        setContentView(R.layout.dialog_app_crash);
        ButterKnife.a(this);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
    }

    @NotNull
    /* renamed from: a */
    public final C8605a m50354a() {
        C8605a c8605a = this.f41234a;
        if (c8605a == null) {
            C2668g.b("presenter");
        }
        return c8605a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8605a c8605a = this.f41234a;
        if (c8605a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c8605a);
        setOnDismissListener(new C8608a(this));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RxUtils.b(this.f41235b);
        C8605a c8605a = this.f41234a;
        if (c8605a == null) {
            C2668g.b("presenter");
        }
        c8605a.m36725f();
        Deadshot.drop(this);
    }

    public void showFeedbackView() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C6248a.apologyView);
        C2668g.a(constraintLayout, "apologyView");
        constraintLayout.setVisibility(8);
        constraintLayout = (ConstraintLayout) findViewById(C6248a.feedbackView);
        C2668g.a(constraintLayout, "feedbackView");
        constraintLayout.setVisibility(0);
        m50352b();
        setCanceledOnTouchOutside(false);
    }

    public void showThankYouView() {
        RxUtils.b(this.f41235b);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C6248a.thankYouView);
        C2668g.a(constraintLayout, "thankYouView");
        constraintLayout.setVisibility(0);
        constraintLayout = (ConstraintLayout) findViewById(C6248a.feedbackView);
        C2668g.a(constraintLayout, "feedbackView");
        constraintLayout.setVisibility(8);
        setCanceledOnTouchOutside(true);
    }

    public void closeDialog() {
        dismiss();
    }

    public void onBackPressed() {
        C8605a c8605a = this.f41234a;
        if (c8605a == null) {
            C2668g.b("presenter");
        }
        c8605a.m36718a(FeedbackAction.BACK_BUTTON);
        super.onBackPressed();
    }

    @OnClick({2131363537})
    public final void sendFeedbackButtonOnClick() {
        C8605a c8605a = this.f41234a;
        if (c8605a == null) {
            C2668g.b("presenter");
        }
        c8605a.m36723d();
    }

    @OnClick({2131362217, 2131362216})
    public final void continueSwipingButtonOnClick() {
        C8605a c8605a = this.f41234a;
        if (c8605a == null) {
            C2668g.b("presenter");
        }
        c8605a.m36718a(FeedbackAction.CONTINUE_SWIPING);
    }

    @OnClick({2131362029})
    public final void cancelFeedbackButtonOnClick() {
        C8605a c8605a = this.f41234a;
        if (c8605a == null) {
            C2668g.b("presenter");
        }
        c8605a.m36718a(FeedbackAction.CANCEL);
    }

    @OnClick({2131363536})
    public final void sendButtonOnClick() {
        CustomEditText customEditText = (CustomEditText) findViewById(C6248a.feedbackEditText);
        C2668g.a(customEditText, "feedbackEditText");
        String obj = customEditText.getText().toString();
        C8605a c8605a = this.f41234a;
        if (c8605a == null) {
            C2668g.b("presenter");
        }
        c8605a.m36719a(obj);
        customEditText = (CustomEditText) findViewById(C6248a.feedbackEditText);
        C2668g.a(customEditText, "feedbackEditText");
        customEditText.getText().clear();
        av.c((CustomEditText) findViewById(C6248a.feedbackEditText));
    }

    /* renamed from: b */
    private final void m50352b() {
        this.f41235b = m50353c().d(new C13793a(new AppCrashDialog$setupTextMessageEditText$1(this)));
    }

    /* renamed from: c */
    private final Observable<String> m50353c() {
        Observable a = C5698c.a((CustomEditText) findViewById(C6248a.feedbackEditText));
        Function1 function1 = AppCrashDialog$observeFeedbackTextChanges$1.f45131a;
        if (function1 != null) {
            function1 = new C12823b(function1);
        }
        Observable<String> k = a.k((Func1) function1);
        C2668g.a(k, "RxTextView\n            .…p(CharSequence::toString)");
        return k;
    }

    /* renamed from: a */
    private final void m50351a(String str) {
        CustomTextView customTextView = (CustomTextView) findViewById(C6248a.sendButton);
        C2668g.a(customTextView, "sendButton");
        customTextView.setEnabled(C19303i.a(str) ^ 1);
        customTextView = (CustomTextView) findViewById(C6248a.sendButton);
        C2668g.a(customTextView, "sendButton");
        if (customTextView.isEnabled()) {
            ((CustomTextView) findViewById(C6248a.sendButton)).setTextColor(this.activeButtonText);
        } else {
            ((CustomTextView) findViewById(C6248a.sendButton)).setTextColor(this.inActiveButtonText);
        }
        C8605a c8605a = this.f41234a;
        if (c8605a == null) {
            C2668g.b("presenter");
        }
        c8605a.m36721b(str);
    }
}
