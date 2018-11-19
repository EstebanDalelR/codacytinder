package com.tinder.tindergold.view;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.gold.TinderGoldButtonView;
import com.tinder.managers.ManagerApp;
import com.tinder.tindergold.p427b.C15184a;
import com.tinder.tindergold.target.TinderGoldIntroTarget;
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
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u00011B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020-H\u0016J\b\u00100\u001a\u00020-H\u0016R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\u00100\u00108FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0014\u001a\n \n*\u0004\u0018\u00010\u00150\u00158FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0019\u001a\n \n*\u0004\u0018\u00010\t0\t8FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001a\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R#\u0010$\u001a\n \n*\u0004\u0018\u00010%0%8FX\u0002¢\u0006\f\n\u0004\b(\u0010\u000e\u001a\u0004\b&\u0010'R#\u0010)\u001a\n \n*\u0004\u0018\u00010\u00150\u00158FX\u0002¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b*\u0010\u0017¨\u00062"}, d2 = {"Lcom/tinder/tindergold/view/TinderGoldIntroDialog;", "Landroid/app/Dialog;", "Lcom/tinder/tindergold/target/TinderGoldIntroTarget;", "context", "Landroid/content/Context;", "goldIntroListener", "Lcom/tinder/tindergold/view/TinderGoldIntroDialog$TinderGoldIntroListener;", "(Landroid/content/Context;Lcom/tinder/tindergold/view/TinderGoldIntroDialog$TinderGoldIntroListener;)V", "cardBackground", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getCardBackground", "()Landroid/view/View;", "cardBackground$delegate", "Lkotlin/Lazy;", "continueButton", "Lcom/tinder/gold/TinderGoldButtonView;", "getContinueButton", "()Lcom/tinder/gold/TinderGoldButtonView;", "continueButton$delegate", "defaultTitle", "", "getDefaultTitle", "()Ljava/lang/String;", "defaultTitle$delegate", "dialogBackground", "getDialogBackground", "dialogBackground$delegate", "getGoldIntroListener", "()Lcom/tinder/tindergold/view/TinderGoldIntroDialog$TinderGoldIntroListener;", "presenter", "Lcom/tinder/tindergold/presenter/TinderGoldIntroPresenter;", "getPresenter", "()Lcom/tinder/tindergold/presenter/TinderGoldIntroPresenter;", "setPresenter", "(Lcom/tinder/tindergold/presenter/TinderGoldIntroPresenter;)V", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView$delegate", "upgradeTitle", "getUpgradeTitle", "upgradeTitle$delegate", "dismiss", "", "show", "showDefaultTinderGoldTitle", "showUpgradeGoldTitle", "TinderGoldIntroListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TinderGoldIntroDialog extends Dialog implements TinderGoldIntroTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f52135a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TinderGoldIntroDialog.class), "dialogBackground", "getDialogBackground()Landroid/view/View;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TinderGoldIntroDialog.class), "cardBackground", "getCardBackground()Landroid/view/View;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TinderGoldIntroDialog.class), "continueButton", "getContinueButton()Lcom/tinder/gold/TinderGoldButtonView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TinderGoldIntroDialog.class), "titleView", "getTitleView()Landroid/widget/TextView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TinderGoldIntroDialog.class), "defaultTitle", "getDefaultTitle()Ljava/lang/String;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TinderGoldIntroDialog.class), "upgradeTitle", "getUpgradeTitle()Ljava/lang/String;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C15184a f52136b;
    /* renamed from: c */
    private final Lazy f52137c = C15810e.m59833a((Function0) new TinderGoldIntroDialog$dialogBackground$2(this));
    /* renamed from: d */
    private final Lazy f52138d = C15810e.m59833a((Function0) new TinderGoldIntroDialog$cardBackground$2(this));
    /* renamed from: e */
    private final Lazy f52139e = C15810e.m59833a((Function0) new TinderGoldIntroDialog$continueButton$2(this));
    /* renamed from: f */
    private final Lazy f52140f = C15810e.m59833a((Function0) new TinderGoldIntroDialog$titleView$2(this));
    /* renamed from: g */
    private final Lazy f52141g;
    /* renamed from: h */
    private final Lazy f52142h;
    @NotNull
    /* renamed from: i */
    private final TinderGoldIntroDialog$TinderGoldIntroListener f52143i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.view.TinderGoldIntroDialog$2 */
    static final class C151872 implements OnClickListener {
        /* renamed from: a */
        public static final C151872 f47233a = new C151872();

        C151872() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: a */
    public final View m62588a() {
        Lazy lazy = this.f52137c;
        KProperty kProperty = f52135a[0];
        return (View) lazy.getValue();
    }

    /* renamed from: b */
    public final View m62589b() {
        Lazy lazy = this.f52138d;
        KProperty kProperty = f52135a[1];
        return (View) lazy.getValue();
    }

    /* renamed from: c */
    public final TinderGoldButtonView m62590c() {
        Lazy lazy = this.f52139e;
        KProperty kProperty = f52135a[2];
        return (TinderGoldButtonView) lazy.getValue();
    }

    /* renamed from: d */
    public final TextView m62591d() {
        Lazy lazy = this.f52140f;
        KProperty kProperty = f52135a[3];
        return (TextView) lazy.getValue();
    }

    /* renamed from: e */
    public final String m62592e() {
        Lazy lazy = this.f52141g;
        KProperty kProperty = f52135a[4];
        return (String) lazy.getValue();
    }

    /* renamed from: f */
    public final String m62593f() {
        Lazy lazy = this.f52142h;
        KProperty kProperty = f52135a[5];
        return (String) lazy.getValue();
    }

    @NotNull
    /* renamed from: h */
    public final TinderGoldIntroDialog$TinderGoldIntroListener m62595h() {
        return this.f52143i;
    }

    public TinderGoldIntroDialog(@NotNull Context context, @NotNull TinderGoldIntroDialog$TinderGoldIntroListener tinderGoldIntroDialog$TinderGoldIntroListener) {
        C2668g.b(context, "context");
        C2668g.b(tinderGoldIntroDialog$TinderGoldIntroListener, "goldIntroListener");
        super(context, R.style.PlusPaywallDialog);
        this.f52143i = tinderGoldIntroDialog$TinderGoldIntroListener;
        this.f52141g = C15810e.m59833a((Function0) new TinderGoldIntroDialog$defaultTitle$2(context));
        this.f52142h = C15810e.m59833a((Function0) new TinderGoldIntroDialog$upgradeTitle$2(context));
        setContentView(R.layout.dialog_tinder_gold_intro);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        getWindow().setWindowAnimations(R.style.dialog_up_down_animation);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        context = this.f52136b;
        if (context == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, context);
        m62588a().setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.dismiss();
            }
        });
        m62589b().setOnClickListener((OnClickListener) C151872.f47233a);
    }

    @NotNull
    /* renamed from: g */
    public final C15184a m62594g() {
        C15184a c15184a = this.f52136b;
        if (c15184a == null) {
            C2668g.b("presenter");
        }
        return c15184a;
    }

    public void show() {
        getWindow().setLayout(-1, -1);
        m62590c().setButtonAction(new TinderGoldIntroDialog$show$1(this));
        super.show();
    }

    public void dismiss() {
        super.dismiss();
        C15184a c15184a = this.f52136b;
        if (c15184a == null) {
            C2668g.b("presenter");
        }
        c15184a.m57099c();
        m62590c().a();
        Deadshot.drop(this);
    }

    public void showDefaultTinderGoldTitle() {
        TextView d = m62591d();
        C2668g.a(d, "titleView");
        d.setText(m62592e());
    }

    public void showUpgradeGoldTitle() {
        TextView d = m62591d();
        C2668g.a(d, "titleView");
        d.setText(m62593f());
    }
}
