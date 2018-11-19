package com.tinder.onboarding.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.views.CustomButton;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\n"}, d2 = {"Lcom/tinder/onboarding/view/SmsConfirmationActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "continueToOnboarding", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openFacebookLogin", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SmsConfirmationActivity extends AppCompatActivity {
    /* renamed from: a */
    public static final C9995a f45400a = new C9995a();
    /* renamed from: b */
    private HashMap f45401b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/onboarding/view/SmsConfirmationActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.onboarding.view.SmsConfirmationActivity$a */
    public static final class C9995a {
        private C9995a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Intent m41007a(@NotNull Context context) {
            C2668g.b(context, "context");
            return new Intent(context, SmsConfirmationActivity.class);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.onboarding.view.SmsConfirmationActivity$b */
    static final class C9996b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SmsConfirmationActivity f32855a;

        C9996b(SmsConfirmationActivity smsConfirmationActivity) {
            this.f32855a = smsConfirmationActivity;
        }

        public final void onClick(View view) {
            this.f32855a.m54527a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.onboarding.view.SmsConfirmationActivity$c */
    static final class C9997c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SmsConfirmationActivity f32856a;

        C9997c(SmsConfirmationActivity smsConfirmationActivity) {
            this.f32856a = smsConfirmationActivity;
        }

        public final void onClick(View view) {
            this.f32856a.m54529b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.onboarding.view.SmsConfirmationActivity$d */
    static final class C9998d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SmsConfirmationActivity f32857a;

        C9998d(SmsConfirmationActivity smsConfirmationActivity) {
            this.f32857a = smsConfirmationActivity;
        }

        public final void onClick(View view) {
            this.f32857a.finish();
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final Intent m54526a(@NotNull Context context) {
        return f45400a.m41007a(context);
    }

    /* renamed from: a */
    public View m54531a(int i) {
        if (this.f45401b == null) {
            this.f45401b = new HashMap();
        }
        View view = (View) this.f45401b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45401b.put(Integer.valueOf(i), view);
        return view;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sms_confirmation);
        ((CustomButton) m54531a(C6248a.continueButton)).setOnClickListener(new C9996b(this));
        ((CustomButton) m54531a(C6248a.facebookButton)).setOnClickListener(new C9997c(this));
        ((ImageView) m54531a(C6248a.closeButton)).setOnClickListener(new C9998d(this));
    }

    /* renamed from: a */
    private final void m54527a() {
        setResult(-1);
        finish();
    }

    /* renamed from: b */
    private final void m54529b() {
        setResult(2);
        finish();
    }
}
