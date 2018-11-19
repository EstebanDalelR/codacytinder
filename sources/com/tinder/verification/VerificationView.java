package com.tinder.verification;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tinder.verification.C15386a.C15382b;
import com.tinder.verification.C15386a.C15383c;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001/B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020&J\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020&R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u001b\u0010\u0012\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0013\u0010\fR\u001b\u0010\u0015\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0016\u0010\fR\u001b\u0010\u0018\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0019\u0010\fR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b\"\u0010#¨\u00060"}, d2 = {"Lcom/tinder/verification/VerificationView;", "Landroid/support/v7/widget/CardView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "FAQ_URL", "", "bodyText", "Landroid/widget/TextView;", "getBodyText", "()Landroid/widget/TextView;", "bodyText$delegate", "Lkotlin/Lazy;", "cancelText", "getCancelText", "cancelText$delegate", "confirmText", "getConfirmText", "confirmText$delegate", "faqText", "getFaqText", "faqText$delegate", "headingText", "getHeadingText", "headingText$delegate", "iconImage", "Landroid/widget/ImageView;", "getIconImage", "()Landroid/widget/ImageView;", "iconImage$delegate", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar$delegate", "bind", "", "viewModel", "Lcom/tinder/verification/VerificationDialogViewModel;", "listener", "Lcom/tinder/verification/VerificationView$Listener;", "hideProgressBar", "isProgressBarShowing", "", "showProgressBar", "Listener", "verification_release"}, k = 1, mv = {1, 1, 10})
public final class VerificationView extends CardView {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f52826a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(VerificationView.class), "iconImage", "getIconImage()Landroid/widget/ImageView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(VerificationView.class), "headingText", "getHeadingText()Landroid/widget/TextView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(VerificationView.class), "bodyText", "getBodyText()Landroid/widget/TextView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(VerificationView.class), "confirmText", "getConfirmText()Landroid/widget/TextView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(VerificationView.class), "faqText", "getFaqText()Landroid/widget/TextView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(VerificationView.class), "cancelText", "getCancelText()Landroid/widget/TextView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(VerificationView.class), "progressBar", "getProgressBar()Landroid/widget/ProgressBar;"))};
    /* renamed from: b */
    private final Lazy f52827b;
    /* renamed from: c */
    private final Lazy f52828c;
    /* renamed from: d */
    private final Lazy f52829d;
    /* renamed from: e */
    private final Lazy f52830e;
    /* renamed from: f */
    private final Lazy f52831f;
    /* renamed from: g */
    private final Lazy f52832g;
    /* renamed from: h */
    private final Lazy f52833h;
    /* renamed from: i */
    private final String f52834i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/verification/VerificationView$Listener;", "", "onCancelClicked", "", "onConfirmClicked", "onFaqClicked", "url", "", "verification_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onCancelClicked();

        void onConfirmClicked();

        void onFaqClicked(@NotNull String str);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.VerificationView$a */
    static final class C15378a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Listener f47647a;

        C15378a(Listener listener) {
            this.f47647a = listener;
        }

        public final void onClick(View view) {
            this.f47647a.onConfirmClicked();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.VerificationView$b */
    static final class C15379b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VerificationView f47648a;
        /* renamed from: b */
        final /* synthetic */ Listener f47649b;

        C15379b(VerificationView verificationView, Listener listener) {
            this.f47648a = verificationView;
            this.f47649b = listener;
        }

        public final void onClick(View view) {
            this.f47649b.onFaqClicked(this.f47648a.f52834i);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.VerificationView$c */
    static final class C15380c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Listener f47650a;

        C15380c(Listener listener) {
            this.f47650a = listener;
        }

        public final void onClick(View view) {
            this.f47650a.onCancelClicked();
        }
    }

    private final TextView getBodyText() {
        Lazy lazy = this.f52829d;
        KProperty kProperty = f52826a[2];
        return (TextView) lazy.getValue();
    }

    private final TextView getCancelText() {
        Lazy lazy = this.f52832g;
        KProperty kProperty = f52826a[5];
        return (TextView) lazy.getValue();
    }

    private final TextView getConfirmText() {
        Lazy lazy = this.f52830e;
        KProperty kProperty = f52826a[3];
        return (TextView) lazy.getValue();
    }

    private final TextView getFaqText() {
        Lazy lazy = this.f52831f;
        KProperty kProperty = f52826a[4];
        return (TextView) lazy.getValue();
    }

    private final TextView getHeadingText() {
        Lazy lazy = this.f52828c;
        KProperty kProperty = f52826a[1];
        return (TextView) lazy.getValue();
    }

    private final ImageView getIconImage() {
        Lazy lazy = this.f52827b;
        KProperty kProperty = f52826a[0];
        return (ImageView) lazy.getValue();
    }

    private final ProgressBar getProgressBar() {
        Lazy lazy = this.f52833h;
        KProperty kProperty = f52826a[6];
        return (ProgressBar) lazy.getValue();
    }

    public /* synthetic */ VerificationView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public VerificationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f52827b = C15810e.m59832a(LazyThreadSafetyMode.NONE, new VerificationView$$special$$inlined$bindView$1(this, C15382b.verification_icon));
        this.f52828c = C15810e.m59832a(LazyThreadSafetyMode.NONE, new VerificationView$$special$$inlined$bindView$2(this, C15382b.verification_heading_text));
        this.f52829d = C15810e.m59832a(LazyThreadSafetyMode.NONE, new VerificationView$$special$$inlined$bindView$3(this, C15382b.verification_body_text));
        this.f52830e = C15810e.m59832a(LazyThreadSafetyMode.NONE, new VerificationView$$special$$inlined$bindView$4(this, C15382b.verification_confirm_text));
        this.f52831f = C15810e.m59832a(LazyThreadSafetyMode.NONE, new VerificationView$$special$$inlined$bindView$5(this, C15382b.verification_faq_text));
        this.f52832g = C15810e.m59832a(LazyThreadSafetyMode.NONE, new VerificationView$$special$$inlined$bindView$6(this, C15382b.verification_cancel_text));
        this.f52833h = C15810e.m59832a(LazyThreadSafetyMode.NONE, new VerificationView$$special$$inlined$bindView$7(this, C15382b.verification_progress_bar));
        this.f52834i = "https://www.help.tinder.com/hc/articles/360005147211";
        CardView.inflate(context, C15383c.view_verification, this);
        setLayoutParams((LayoutParams) new MarginLayoutParams(-1, -1));
    }

    /* renamed from: a */
    public final void m63135a(@NotNull C15388c c15388c, @NotNull Listener listener) {
        C2668g.b(c15388c, "viewModel");
        C2668g.b(listener, "listener");
        getIconImage().setImageDrawable(c15388c.m57713a());
        getHeadingText().setText(c15388c.m57714b());
        getBodyText().setText(c15388c.m57715c());
        getConfirmText().setText(c15388c.m57717e());
        getFaqText().setText(c15388c.m57716d());
        getCancelText().setText(c15388c.m57718f());
        c15388c = getCancelText().getText();
        if (c15388c != null) {
            if (c15388c.length() != null) {
                c15388c = null;
                if (c15388c != null) {
                    getCancelText().setVisibility(8);
                }
                getConfirmText().setOnClickListener(new C15378a(listener));
                getFaqText().setOnClickListener(new C15379b(this, listener));
                getCancelText().setOnClickListener(new C15380c(listener));
            }
        }
        c15388c = true;
        if (c15388c != null) {
            getCancelText().setVisibility(8);
        }
        getConfirmText().setOnClickListener(new C15378a(listener));
        getFaqText().setOnClickListener(new C15379b(this, listener));
        getCancelText().setOnClickListener(new C15380c(listener));
    }

    /* renamed from: a */
    public final void m63134a() {
        getProgressBar().setVisibility(0);
    }

    /* renamed from: b */
    public final void m63136b() {
        getProgressBar().setVisibility(8);
    }

    /* renamed from: c */
    public final boolean m63137c() {
        return getProgressBar().getVisibility() == 0;
    }
}
