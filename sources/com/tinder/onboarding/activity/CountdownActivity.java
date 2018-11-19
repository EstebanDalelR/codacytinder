package com.tinder.onboarding.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.tinder.onboarding.C9964g.C9961b;
import com.tinder.onboarding.C9964g.C9962c;
import com.tinder.onboarding.component.CountdownComponentProvider;
import com.tinder.onboarding.presenter.C13525x;
import com.tinder.onboarding.target.CountdownTarget;
import com.tinder.onboarding.view.CountdownView;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/tinder/onboarding/activity/CountdownActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/tinder/onboarding/target/CountdownTarget;", "()V", "countdownView", "Lcom/tinder/onboarding/view/CountdownView;", "getCountdownView", "()Lcom/tinder/onboarding/view/CountdownView;", "countdownView$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/tinder/onboarding/presenter/CountdownPresenter;", "getPresenter$onboarding_release", "()Lcom/tinder/onboarding/presenter/CountdownPresenter;", "setPresenter$onboarding_release", "(Lcom/tinder/onboarding/presenter/CountdownPresenter;)V", "hideDays", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setDays", "days", "", "Companion", "onboarding_release"}, k = 1, mv = {1, 1, 10})
public final class CountdownActivity extends AppCompatActivity implements CountdownTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f45396a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(CountdownActivity.class), "countdownView", "getCountdownView()Lcom/tinder/onboarding/view/CountdownView;"))};
    /* renamed from: c */
    public static final C9959a f45397c = new C9959a();
    @Inject
    @NotNull
    /* renamed from: b */
    public C13525x f45398b;
    /* renamed from: d */
    private final Lazy f45399d = C18451c.a(LazyThreadSafetyMode.NONE, new CountdownActivity$$special$$inlined$bindView$1(this, C9961b.view_countdown));

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/onboarding/activity/CountdownActivity$Companion;", "", "()V", "EXTRA_DAYS", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "days", "", "onboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.onboarding.activity.CountdownActivity$a */
    public static final class C9959a {
        private C9959a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Intent m40923a(@NotNull Context context, int i) {
            C2668g.b(context, "context");
            Intent intent = new Intent(context, CountdownActivity.class);
            intent.putExtra("days", i);
            return intent;
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final Intent m54524a(@NotNull Context context, int i) {
        return f45397c.m40923a(context, i);
    }

    /* renamed from: a */
    private final CountdownView m54525a() {
        Lazy lazy = this.f45399d;
        KProperty kProperty = f45396a[0];
        return (CountdownView) lazy.getValue();
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C9962c.activity_countdown);
        bundle = getApplicationContext();
        if (bundle == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.onboarding.component.CountdownComponentProvider");
        }
        ((CountdownComponentProvider) bundle).provideCountdownComponent().inject(this);
    }

    protected void onStart() {
        super.onStart();
        C13525x c13525x = this.f45398b;
        if (c13525x == null) {
            C2668g.b("presenter");
        }
        c13525x.a(this);
        c13525x = this.f45398b;
        if (c13525x == null) {
            C2668g.b("presenter");
        }
        c13525x.m52844a(getIntent().getIntExtra("days", 0));
    }

    protected void onStop() {
        super.onStop();
        C13525x c13525x = this.f45398b;
        if (c13525x == null) {
            C2668g.b("presenter");
        }
        c13525x.a();
    }

    public void setDays(int i) {
        m54525a().m48355a(i);
    }

    public void hideDays() {
        m54525a().m48354a();
    }
}
