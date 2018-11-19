package com.tinder.webprofile.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.C2768a;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.webprofile.C15478a.C15471a;
import com.tinder.webprofile.C15478a.C15472b;
import com.tinder.webprofile.C15478a.C15473c;
import com.tinder.webprofile.C15478a.C15474d;
import com.tinder.webprofile.C15478a.C15475e;
import com.tinder.webprofile.C15478a.C15476f;
import com.tinder.webprofile.di.WebProfileComponentProvider;
import com.tinder.webprofile.p451b.C18309a;
import com.tinder.webprofile.presenter.C15486a;
import com.tinder.webprofile.target.WebProfileUsernameTarget;
import javax.inject.Inject;
import kotlin.C15810e;
import kotlin.C15813i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020,H\u0016J\b\u00100\u001a\u00020,H\u0016J\b\u00101\u001a\u00020,H\u0016J\b\u00102\u001a\u00020,H\u0016J\b\u00103\u001a\u00020,H\u0016J\b\u00104\u001a\u00020,H\u0016J\b\u00105\u001a\u00020,H\u0016J\b\u00106\u001a\u00020,H\u0002J\b\u00107\u001a\u00020,H\u0016J\b\u00108\u001a\u00020,H\u0016J\u0012\u00109\u001a\u00020,2\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\b\u0010<\u001a\u00020,H\u0014J\b\u0010=\u001a\u00020,H\u0016J\b\u0010>\u001a\u00020,H\u0002J\b\u0010?\u001a\u00020,H\u0002J\b\u0010@\u001a\u00020,H\u0016J\u0010\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020.H\u0002J\u0010\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020.H\u0016J \u0010E\u001a\u00020,*\u00020*2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020,0FH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b!\u0010\u0015R\u000e\u0010#\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b'\u0010\u0015R\u000e\u0010)\u001a\u00020*X.¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/tinder/webprofile/activity/WebProfileUsernameActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/tinder/webprofile/target/WebProfileUsernameTarget;", "()V", "characterCountText", "Landroid/widget/TextView;", "confirmButton", "crossIndicator", "", "deleteButton", "heartIndicator", "indicator", "Landroid/widget/ImageView;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager$webprofile_release", "()Landroid/view/inputmethod/InputMethodManager;", "setInputMethodManager$webprofile_release", "(Landroid/view/inputmethod/InputMethodManager;)V", "paleRed", "getPaleRed", "()I", "paleRed$delegate", "Lkotlin/Lazy;", "parentView", "Landroid/view/View;", "presenter", "Lcom/tinder/webprofile/presenter/WebProfileUsernamePresenter;", "getPresenter$webprofile_release", "()Lcom/tinder/webprofile/presenter/WebProfileUsernamePresenter;", "setPresenter$webprofile_release", "(Lcom/tinder/webprofile/presenter/WebProfileUsernamePresenter;)V", "red", "getRed", "red$delegate", "statusText", "toolbar", "Landroid/support/v7/widget/Toolbar;", "translucentRed", "getTranslucentRed", "translucentRed$delegate", "usernameEditText", "Landroid/widget/EditText;", "bindUsername", "", "username", "", "disableConfirmButton", "displayGenericSaveErrorState", "displaySuccessfulDeleteMessage", "displaySuccessfulSaveState", "displayUnsuccessfulDeleteState", "displayUnsuccessfulSaveState", "enableConfirmButton", "findViews", "finish", "hideDeleteButton", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "resetStatusTextAlpha", "setClickListeners", "setupToolbar", "showDeleteButton", "showMessage", "responseMessage", "updateUsernameTextCount", "characterCount", "afterTextChanged", "Lkotlin/Function1;", "Companion", "webprofile_release"}, k = 1, mv = {1, 1, 10})
public final class WebProfileUsernameActivity extends AppCompatActivity implements WebProfileUsernameTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f59949a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(WebProfileUsernameActivity.class), "red", "getRed()I")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(WebProfileUsernameActivity.class), "paleRed", "getPaleRed()I")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(WebProfileUsernameActivity.class), "translucentRed", "getTranslucentRed()I"))};
    /* renamed from: d */
    public static final C15479a f59950d = new C15479a();
    @Inject
    @NotNull
    /* renamed from: b */
    public C15486a f59951b;
    @Inject
    @NotNull
    /* renamed from: c */
    public InputMethodManager f59952c;
    /* renamed from: e */
    private Toolbar f59953e;
    /* renamed from: f */
    private EditText f59954f;
    /* renamed from: g */
    private TextView f59955g;
    /* renamed from: h */
    private TextView f59956h;
    /* renamed from: i */
    private TextView f59957i;
    /* renamed from: j */
    private ImageView f59958j;
    /* renamed from: k */
    private TextView f59959k;
    /* renamed from: l */
    private View f59960l;
    /* renamed from: m */
    private final Lazy f59961m = C15810e.m59832a(LazyThreadSafetyMode.NONE, new WebProfileUsernameActivity$red$2(this));
    /* renamed from: n */
    private final Lazy f59962n = C15810e.m59832a(LazyThreadSafetyMode.NONE, new WebProfileUsernameActivity$paleRed$2(this));
    /* renamed from: o */
    private final Lazy f59963o = C15810e.m59832a(LazyThreadSafetyMode.NONE, new WebProfileUsernameActivity$translucentRed$2(this));
    /* renamed from: p */
    private final int f59964p = C15473c.web_id_available;
    /* renamed from: q */
    private final int f59965q = C15473c.web_id_unavailable;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/webprofile/activity/WebProfileUsernameActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "webprofile_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.activity.WebProfileUsernameActivity$a */
    public static final class C15479a {
        private C15479a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Intent m57958a(@NotNull Context context) {
            C2668g.b(context, "context");
            return new Intent(context, WebProfileUsernameActivity.class);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J*\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"com/tinder/webprofile/activity/WebProfileUsernameActivity$afterTextChanged$1", "Landroid/text/TextWatcher;", "(Lkotlin/jvm/functions/Function1;)V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "p0", "", "p1", "", "p2", "p3", "onTextChanged", "webprofile_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.activity.WebProfileUsernameActivity$b */
    public static final class C15480b implements TextWatcher {
        /* renamed from: a */
        final /* synthetic */ Function1 f47911a;

        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        C15480b(Function1 function1) {
            this.f47911a = function1;
        }

        public void afterTextChanged(@Nullable Editable editable) {
            this.f47911a.invoke(String.valueOf(editable));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.activity.WebProfileUsernameActivity$d */
    static final class C15481d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ WebProfileUsernameActivity f47912a;

        C15481d(WebProfileUsernameActivity webProfileUsernameActivity) {
            this.f47912a = webProfileUsernameActivity;
        }

        public final void onClick(View view) {
            view = this.f47912a.m68631b();
            View currentFocus = this.f47912a.getCurrentFocus();
            C2668g.a(currentFocus, "currentFocus");
            view.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            this.f47912a.m68630a().m57966a(WebProfileUsernameActivity.m68620a(this.f47912a).getText().toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.activity.WebProfileUsernameActivity$e */
    static final class C15482e implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ WebProfileUsernameActivity f47913a;

        C15482e(WebProfileUsernameActivity webProfileUsernameActivity) {
            this.f47913a = webProfileUsernameActivity;
        }

        public final void onClick(View view) {
            new C18309a(this.f47913a, new WebProfileUsernameActivity$setClickListeners$3$1(this)).show();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.activity.WebProfileUsernameActivity$f */
    static final class C15483f implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ WebProfileUsernameActivity f47914a;

        C15483f(WebProfileUsernameActivity webProfileUsernameActivity) {
            this.f47914a = webProfileUsernameActivity;
        }

        public final void onClick(View view) {
            this.f47914a.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/webprofile/activity/WebProfileUsernameActivity$displaySuccessfulSaveState$1", "Landroid/support/design/widget/Snackbar$Callback;", "(Lcom/tinder/webprofile/activity/WebProfileUsernameActivity;)V", "onDismissed", "", "transientBottomBar", "Landroid/support/design/widget/Snackbar;", "event", "", "webprofile_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.webprofile.activity.WebProfileUsernameActivity$c */
    public static final class C18308c extends C2768a {
        /* renamed from: a */
        final /* synthetic */ WebProfileUsernameActivity f56690a;

        C18308c(WebProfileUsernameActivity webProfileUsernameActivity) {
            this.f56690a = webProfileUsernameActivity;
        }

        public void onDismissed(@Nullable Snackbar snackbar, int i) {
            super.onDismissed(snackbar, i);
            this.f56690a.finish();
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final Intent m68619a(@NotNull Context context) {
        return f59950d.m57958a(context);
    }

    /* renamed from: c */
    private final int m68624c() {
        Lazy lazy = this.f59961m;
        KProperty kProperty = f59949a[0];
        return ((Number) lazy.getValue()).intValue();
    }

    /* renamed from: d */
    private final int m68625d() {
        Lazy lazy = this.f59962n;
        KProperty kProperty = f59949a[1];
        return ((Number) lazy.getValue()).intValue();
    }

    /* renamed from: e */
    private final int m68626e() {
        Lazy lazy = this.f59963o;
        KProperty kProperty = f59949a[2];
        return ((Number) lazy.getValue()).intValue();
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ EditText m68620a(WebProfileUsernameActivity webProfileUsernameActivity) {
        webProfileUsernameActivity = webProfileUsernameActivity.f59954f;
        if (webProfileUsernameActivity == null) {
            C2668g.b("usernameEditText");
        }
        return webProfileUsernameActivity;
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ ImageView m68623b(WebProfileUsernameActivity webProfileUsernameActivity) {
        webProfileUsernameActivity = webProfileUsernameActivity.f59958j;
        if (webProfileUsernameActivity == null) {
            C2668g.b("indicator");
        }
        return webProfileUsernameActivity;
    }

    @NotNull
    /* renamed from: a */
    public final C15486a m68630a() {
        C15486a c15486a = this.f59951b;
        if (c15486a == null) {
            C2668g.b("presenter");
        }
        return c15486a;
    }

    @NotNull
    /* renamed from: b */
    public final InputMethodManager m68631b() {
        InputMethodManager inputMethodManager = this.f59952c;
        if (inputMethodManager == null) {
            C2668g.b("inputMethodManager");
        }
        return inputMethodManager;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C15475e.web_profile_username_activity);
        overridePendingTransition(C15471a.enter_right_to_left, C15471a.enter_left_to_right);
        bundle = getApplicationContext();
        if (bundle == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.webprofile.di.WebProfileComponentProvider");
        }
        ((WebProfileComponentProvider) bundle).provideWebProfileComponent().inject(this);
        m68627f();
        m68628g();
        m68629h();
        bundle = this.f59951b;
        if (bundle == null) {
            C2668g.b("presenter");
        }
        bundle.m57965a((WebProfileUsernameTarget) this);
        bundle = this.f59954f;
        if (bundle == null) {
            C2668g.b("usernameEditText");
        }
        bundle.requestFocus();
        bundle = this.f59958j;
        if (bundle == null) {
            C2668g.b("indicator");
        }
        bundle.setImageResource(C15472b.transparent);
    }

    protected void onStop() {
        super.onStop();
        C15486a c15486a = this.f59951b;
        if (c15486a == null) {
            C2668g.b("presenter");
        }
        c15486a.m57964a();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C15471a.exit_left_to_right, C15471a.exit_right_to_left);
    }

    public void displaySuccessfulSaveState() {
        ImageView imageView = this.f59958j;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setImageResource(this.f59964p);
        TextView textView = this.f59955g;
        if (textView == null) {
            C2668g.b("confirmButton");
        }
        textView.setEnabled(false);
        textView = this.f59959k;
        if (textView == null) {
            C2668g.b("deleteButton");
        }
        textView.setEnabled(false);
        View view = this.f59960l;
        if (view == null) {
            C2668g.b("parentView");
        }
        ((Snackbar) Snackbar.a(view, C15476f.username_saved, -1).a(new C18308c(this))).b();
    }

    public void displayUnsuccessfulSaveState() {
        ImageView imageView = this.f59958j;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setImageResource(this.f59965q);
        TextView textView = this.f59956h;
        if (textView == null) {
            C2668g.b("statusText");
        }
        textView.setTextColor(m68625d());
        textView = this.f59956h;
        if (textView == null) {
            C2668g.b("statusText");
        }
        textView.setText(C15476f.username_unavailable);
        textView = this.f59956h;
        if (textView == null) {
            C2668g.b("statusText");
        }
        textView.animate().alpha(1.0f);
    }

    public void displayGenericSaveErrorState() {
        ImageView imageView = this.f59958j;
        if (imageView == null) {
            C2668g.b("indicator");
        }
        imageView.setImageResource(this.f59965q);
        TextView textView = this.f59956h;
        if (textView == null) {
            C2668g.b("statusText");
        }
        textView.setTextColor(m68625d());
        textView = this.f59956h;
        if (textView == null) {
            C2668g.b("statusText");
        }
        textView.animate().alpha(1.0f);
        String string = getString(C15476f.oops);
        C2668g.a(string, "getString(R.string.oops)");
        m68622a(string);
    }

    public void displaySuccessfulDeleteMessage() {
        String string = getString(C15476f.username_deleted);
        C2668g.a(string, "getString(R.string.username_deleted)");
        m68622a(string);
    }

    public void displayUnsuccessfulDeleteState() {
        String string = getString(C15476f.no_username);
        C2668g.a(string, "getString(R.string.no_username)");
        m68622a(string);
    }

    public void enableConfirmButton() {
        TextView textView = this.f59955g;
        if (textView == null) {
            C2668g.b("confirmButton");
        }
        textView.setEnabled(true);
        textView = this.f59955g;
        if (textView == null) {
            C2668g.b("confirmButton");
        }
        textView.setTextColor(m68624c());
    }

    public void disableConfirmButton() {
        TextView textView = this.f59955g;
        if (textView == null) {
            C2668g.b("confirmButton");
        }
        textView.setEnabled(false);
        textView = this.f59955g;
        if (textView == null) {
            C2668g.b("confirmButton");
        }
        textView.setTextColor(m68626e());
    }

    public void resetStatusTextAlpha() {
        TextView textView = this.f59956h;
        if (textView == null) {
            C2668g.b("statusText");
        }
        textView.animate().alpha(0.0f);
    }

    public void updateUsernameTextCount(@NotNull String str) {
        C2668g.b(str, "characterCount");
        TextView textView = this.f59957i;
        if (textView == null) {
            C2668g.b("characterCountText");
        }
        textView.setText(str);
    }

    public void showDeleteButton() {
        TextView textView = this.f59959k;
        if (textView == null) {
            C2668g.b("deleteButton");
        }
        textView.setVisibility(0);
    }

    public void hideDeleteButton() {
        TextView textView = this.f59959k;
        if (textView == null) {
            C2668g.b("deleteButton");
        }
        textView.setVisibility(8);
    }

    public void bindUsername(@NotNull String str) {
        C2668g.b(str, "username");
        EditText editText = this.f59954f;
        if (editText == null) {
            C2668g.b("usernameEditText");
        }
        editText.setText(str);
        editText = this.f59954f;
        if (editText == null) {
            C2668g.b("usernameEditText");
        }
        editText.setSelection(str.length());
    }

    /* renamed from: f */
    private final void m68627f() {
        View findViewById = findViewById(C15474d.toolbar);
        C2668g.a(findViewById, "findViewById(R.id.toolbar)");
        this.f59953e = (Toolbar) findViewById;
        findViewById = findViewById(C15474d.username);
        C2668g.a(findViewById, "findViewById(R.id.username)");
        this.f59954f = (EditText) findViewById;
        findViewById = findViewById(C15474d.confirm_button);
        C2668g.a(findViewById, "findViewById(R.id.confirm_button)");
        this.f59955g = (TextView) findViewById;
        findViewById = findViewById(C15474d.status);
        C2668g.a(findViewById, "findViewById(R.id.status)");
        this.f59956h = (TextView) findViewById;
        findViewById = findViewById(C15474d.text_count);
        C2668g.a(findViewById, "findViewById(R.id.text_count)");
        this.f59957i = (TextView) findViewById;
        findViewById = findViewById(C15474d.indicator);
        C2668g.a(findViewById, "findViewById(R.id.indicator)");
        this.f59958j = (ImageView) findViewById;
        findViewById = findViewById(C15474d.delete_button);
        C2668g.a(findViewById, "findViewById(R.id.delete_button)");
        this.f59959k = (TextView) findViewById;
        findViewById = findViewById(C15474d.parent_view);
        C2668g.a(findViewById, "findViewById(R.id.parent_view)");
        this.f59960l = findViewById;
    }

    /* renamed from: g */
    private final void m68628g() {
        Toolbar toolbar = this.f59953e;
        if (toolbar == null) {
            C2668g.b("toolbar");
        }
        toolbar.setTitle(C15476f.username);
        toolbar = this.f59953e;
        if (toolbar == null) {
            C2668g.b("toolbar");
        }
        setSupportActionBar(toolbar);
        toolbar = this.f59953e;
        if (toolbar == null) {
            C2668g.b("toolbar");
        }
        toolbar.setNavigationOnClickListener(new C15483f(this));
    }

    /* renamed from: a */
    private final void m68622a(String str) {
        View view = this.f59960l;
        if (view == null) {
            C2668g.b("parentView");
        }
        Snackbar.a(view, str, 0).b();
    }

    /* renamed from: h */
    private final void m68629h() {
        TextView textView = this.f59955g;
        if (textView == null) {
            C2668g.b("confirmButton");
        }
        textView.setOnClickListener(new C15481d(this));
        EditText editText = this.f59954f;
        if (editText == null) {
            C2668g.b("usernameEditText");
        }
        m68621a(editText, new WebProfileUsernameActivity$setClickListeners$2(this));
        textView = this.f59959k;
        if (textView == null) {
            C2668g.b("deleteButton");
        }
        textView.setOnClickListener(new C15482e(this));
    }

    /* renamed from: a */
    private final void m68621a(@NotNull EditText editText, Function1<? super String, C15813i> function1) {
        editText.addTextChangedListener(new C15480b(function1));
    }
}
