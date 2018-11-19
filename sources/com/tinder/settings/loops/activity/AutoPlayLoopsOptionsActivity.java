package com.tinder.settings.loops.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.settings.loops.model.AutoPlayVideoSettingsOption;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.loops.injection.AutoPlayLoopsOptionsActivityComponent;
import com.tinder.settings.loops.injection.AutoPlayLoopsSettingsActivityComponentProvider;
import com.tinder.settings.loops.p407a.C14883a;
import com.tinder.settings.loops.target.AutoPlayLoopsOptionsTarget;
import javax.inject.Inject;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0016J\u0012\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\b\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016J\b\u0010*\u001a\u00020\u000eH\u0016J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020#H\u0002J\b\u0010/\u001a\u00020#H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0010\u0010\bR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\bR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lcom/tinder/settings/loops/activity/AutoPlayLoopsOptionsActivity;", "Lcom/tinder/base/ActivitySignedInBase;", "Lcom/tinder/settings/loops/injection/AutoPlayLoopsSettingsActivityComponentProvider;", "Lcom/tinder/settings/loops/target/AutoPlayLoopsOptionsTarget;", "()V", "alwaysAutoPlay", "Landroid/view/View;", "getAlwaysAutoPlay", "()Landroid/view/View;", "alwaysAutoPlay$delegate", "Lkotlin/Lazy;", "alwaysAutoPlayCheck", "Landroid/widget/ImageView;", "autoPlayLoopsOptionsActivityComponent", "Lcom/tinder/settings/loops/injection/AutoPlayLoopsOptionsActivityComponent;", "neverAutoPlay", "getNeverAutoPlay", "neverAutoPlay$delegate", "neverAutoPlayCheck", "onlyOnWifiAutoPlay", "getOnlyOnWifiAutoPlay", "onlyOnWifiAutoPlay$delegate", "onlyOnWifiAutoPlayCheck", "presenter", "Lcom/tinder/settings/loops/presenter/AutoPlayLoopsOptionsPresenter;", "getPresenter", "()Lcom/tinder/settings/loops/presenter/AutoPlayLoopsOptionsPresenter;", "setPresenter", "(Lcom/tinder/settings/loops/presenter/AutoPlayLoopsOptionsPresenter;)V", "toolbar", "Landroid/support/v7/widget/Toolbar;", "getToolbar", "()Landroid/support/v7/widget/Toolbar;", "toolbar$delegate", "bindItemViews", "", "finish", "onCreate", "bundle", "Landroid/os/Bundle;", "onPause", "onResume", "provideComponent", "setOptionSelected", "autoPlayVideoSettingsOption", "Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "setUpClickListener", "setUpToolbar", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AutoPlayLoopsOptionsActivity extends ActivitySignedInBase implements AutoPlayLoopsSettingsActivityComponentProvider, AutoPlayLoopsOptionsTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f60021a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(AutoPlayLoopsOptionsActivity.class), "toolbar", "getToolbar()Landroid/support/v7/widget/Toolbar;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(AutoPlayLoopsOptionsActivity.class), "alwaysAutoPlay", "getAlwaysAutoPlay()Landroid/view/View;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(AutoPlayLoopsOptionsActivity.class), "onlyOnWifiAutoPlay", "getOnlyOnWifiAutoPlay()Landroid/view/View;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(AutoPlayLoopsOptionsActivity.class), "neverAutoPlay", "getNeverAutoPlay()Landroid/view/View;"))};
    /* renamed from: c */
    public static final C14887a f60022c = new C14887a();
    @Inject
    @NotNull
    /* renamed from: b */
    public C14883a f60023b;
    /* renamed from: d */
    private AutoPlayLoopsOptionsActivityComponent f60024d;
    /* renamed from: e */
    private final Lazy f60025e = C15810e.m59832a(LazyThreadSafetyMode.NONE, new AutoPlayLoopsOptionsActivity$$special$$inlined$bindView$1(this, R.id.autoPlaySettingsToolbar));
    /* renamed from: f */
    private final Lazy f60026f = C15810e.m59832a(LazyThreadSafetyMode.NONE, new AutoPlayLoopsOptionsActivity$$special$$inlined$bindView$2(this, R.id.alwaysAutoPlayOption));
    /* renamed from: g */
    private final Lazy f60027g = C15810e.m59832a(LazyThreadSafetyMode.NONE, new AutoPlayLoopsOptionsActivity$$special$$inlined$bindView$3(this, R.id.onlyOnWifiAutoPlayOption));
    /* renamed from: h */
    private final Lazy f60028h = C15810e.m59832a(LazyThreadSafetyMode.NONE, new AutoPlayLoopsOptionsActivity$$special$$inlined$bindView$4(this, R.id.neverAutoPlayOption));
    /* renamed from: i */
    private ImageView f60029i;
    /* renamed from: j */
    private ImageView f60030j;
    /* renamed from: k */
    private ImageView f60031k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/settings/loops/activity/AutoPlayLoopsOptionsActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.loops.activity.AutoPlayLoopsOptionsActivity$a */
    public static final class C14887a {
        private C14887a() {
        }

        @NotNull
        /* renamed from: a */
        public final Intent m56338a(@NotNull Context context) {
            C2668g.b(context, "context");
            return new Intent(context, AutoPlayLoopsOptionsActivity.class);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.loops.activity.AutoPlayLoopsOptionsActivity$b */
    static final class C14888b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ AutoPlayLoopsOptionsActivity f46572a;

        C14888b(AutoPlayLoopsOptionsActivity autoPlayLoopsOptionsActivity) {
            this.f46572a = autoPlayLoopsOptionsActivity;
        }

        public final void onClick(View view) {
            this.f46572a.m68727d().m56329a(AutoPlayVideoSettingsOption.ON_WIFI_AND_MOBILE_DATA);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.loops.activity.AutoPlayLoopsOptionsActivity$c */
    static final class C14889c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ AutoPlayLoopsOptionsActivity f46573a;

        C14889c(AutoPlayLoopsOptionsActivity autoPlayLoopsOptionsActivity) {
            this.f46573a = autoPlayLoopsOptionsActivity;
        }

        public final void onClick(View view) {
            this.f46573a.m68727d().m56329a(AutoPlayVideoSettingsOption.ON_WIFI_ONLY);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.loops.activity.AutoPlayLoopsOptionsActivity$d */
    static final class C14890d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ AutoPlayLoopsOptionsActivity f46574a;

        C14890d(AutoPlayLoopsOptionsActivity autoPlayLoopsOptionsActivity) {
            this.f46574a = autoPlayLoopsOptionsActivity;
        }

        public final void onClick(View view) {
            this.f46574a.m68727d().m56329a(AutoPlayVideoSettingsOption.ON_NEVER_AUTOPLAY);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.loops.activity.AutoPlayLoopsOptionsActivity$e */
    static final class C14891e implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ AutoPlayLoopsOptionsActivity f46575a;

        C14891e(AutoPlayLoopsOptionsActivity autoPlayLoopsOptionsActivity) {
            this.f46575a = autoPlayLoopsOptionsActivity;
        }

        public final void onClick(View view) {
            this.f46575a.onBackPressed();
        }
    }

    /* renamed from: e */
    private final Toolbar m68720e() {
        Lazy lazy = this.f60025e;
        KProperty kProperty = f60021a[0];
        return (Toolbar) lazy.getValue();
    }

    /* renamed from: f */
    private final View m68721f() {
        Lazy lazy = this.f60026f;
        KProperty kProperty = f60021a[1];
        return (View) lazy.getValue();
    }

    /* renamed from: g */
    private final View m68722g() {
        Lazy lazy = this.f60027g;
        KProperty kProperty = f60021a[2];
        return (View) lazy.getValue();
    }

    /* renamed from: p */
    private final View m68723p() {
        Lazy lazy = this.f60028h;
        KProperty kProperty = f60021a[3];
        return (View) lazy.getValue();
    }

    @NotNull
    /* renamed from: d */
    public final C14883a m68727d() {
        C14883a c14883a = this.f60023b;
        if (c14883a == null) {
            C2668g.b("presenter");
        }
        return c14883a;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        Application application = getApplication();
        if (application == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        this.f60024d = ((ManagerApp) application).h().autoPlayLoopsSettingsActivityComponentBuilder().autoPlayLoopsOptionsActivity(this).build();
        super.onCreate(bundle);
        bundle = this.f60024d;
        if (bundle == null) {
            C2668g.b("autoPlayLoopsOptionsActivityComponent");
        }
        bundle.inject(this);
        setContentView(R.layout.activity_auto_play_video_setting);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.enter_left_to_right);
        m68724q();
        m68725r();
    }

    public void onResume() {
        super.onResume();
        C14883a c14883a = this.f60023b;
        if (c14883a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c14883a);
        m68726s();
    }

    public void onPause() {
        super.onPause();
        Deadshot.drop(this);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.exit_left_to_right, R.anim.exit_right_to_left);
    }

    @NotNull
    public AutoPlayLoopsOptionsActivityComponent provideComponent() {
        AutoPlayLoopsOptionsActivityComponent autoPlayLoopsOptionsActivityComponent = this.f60024d;
        if (autoPlayLoopsOptionsActivityComponent == null) {
            C2668g.b("autoPlayLoopsOptionsActivityComponent");
        }
        return autoPlayLoopsOptionsActivityComponent;
    }

    public void setOptionSelected(@NotNull AutoPlayVideoSettingsOption autoPlayVideoSettingsOption) {
        C2668g.b(autoPlayVideoSettingsOption, "autoPlayVideoSettingsOption");
        switch (C14892a.f46576a[autoPlayVideoSettingsOption.ordinal()]) {
            case 1:
                autoPlayVideoSettingsOption = this.f60029i;
                if (autoPlayVideoSettingsOption != null) {
                    autoPlayVideoSettingsOption.setVisibility(0);
                }
                autoPlayVideoSettingsOption = this.f60030j;
                if (autoPlayVideoSettingsOption != null) {
                    autoPlayVideoSettingsOption.setVisibility(8);
                }
                autoPlayVideoSettingsOption = this.f60031k;
                if (autoPlayVideoSettingsOption != null) {
                    autoPlayVideoSettingsOption.setVisibility(8);
                    return;
                }
                return;
            case 2:
                autoPlayVideoSettingsOption = this.f60029i;
                if (autoPlayVideoSettingsOption != null) {
                    autoPlayVideoSettingsOption.setVisibility(8);
                }
                autoPlayVideoSettingsOption = this.f60030j;
                if (autoPlayVideoSettingsOption != null) {
                    autoPlayVideoSettingsOption.setVisibility(0);
                }
                autoPlayVideoSettingsOption = this.f60031k;
                if (autoPlayVideoSettingsOption != null) {
                    autoPlayVideoSettingsOption.setVisibility(8);
                    return;
                }
                return;
            case 3:
                autoPlayVideoSettingsOption = this.f60029i;
                if (autoPlayVideoSettingsOption != null) {
                    autoPlayVideoSettingsOption.setVisibility(8);
                }
                autoPlayVideoSettingsOption = this.f60030j;
                if (autoPlayVideoSettingsOption != null) {
                    autoPlayVideoSettingsOption.setVisibility(8);
                }
                autoPlayVideoSettingsOption = this.f60031k;
                if (autoPlayVideoSettingsOption != null) {
                    autoPlayVideoSettingsOption.setVisibility(0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: q */
    private final void m68724q() {
        setSupportActionBar(m68720e());
        m68720e().setNavigationOnClickListener(new C14891e(this));
    }

    /* renamed from: r */
    private final void m68725r() {
        TextView textView = (TextView) m68721f().findViewById(R.id.autoplay_option_item_text);
        C2668g.a(textView, "alwaysAutoPlayText");
        textView.setText(getString(R.string.autoplay_video_wifi_mobile_data));
        textView = (TextView) m68722g().findViewById(R.id.autoplay_option_item_text);
        C2668g.a(textView, "onlyOnWifiAutoPlayText");
        textView.setText(getString(R.string.autoplay_video_wifi_only));
        textView = (TextView) m68723p().findViewById(R.id.autoplay_option_item_text);
        C2668g.a(textView, "neverAutoPlayText");
        textView.setText(getString(R.string.autoplay_video_never));
        this.f60029i = (ImageView) m68721f().findViewById(R.id.autoplay_option_item_check);
        this.f60030j = (ImageView) m68722g().findViewById(R.id.autoplay_option_item_check);
        this.f60031k = (ImageView) m68723p().findViewById(R.id.autoplay_option_item_check);
    }

    /* renamed from: s */
    private final void m68726s() {
        m68721f().setOnClickListener(new C14888b(this));
        m68722g().setOnClickListener(new C14889c(this));
        m68723p().setOnClickListener(new C14890d(this));
    }
}
