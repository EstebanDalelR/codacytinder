package tinder.com.tooltip;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fJ\u0014\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Ltinder/com/tooltip/OverlayTooltipDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "tooltipViewWithOverlay", "Ltinder/com/tooltip/OverlayTooltipView;", "(Landroid/content/Context;Ltinder/com/tooltip/OverlayTooltipView;)V", "dismissDialogRunnable", "Ljava/lang/Runnable;", "dismissDialogWithAnimationRunnable", "dismissDialogWithoutAnimationRunnable", "dismissDuration", "", "dismiss", "", "dismissAfterDuration", "duration", "dismissWithAnimationAfterDuration", "hideTooltipWithAnimation", "onAnimationEnd", "Lkotlin/Function0;", "show", "tooltip_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: tinder.com.tooltip.b */
public final class C19472b extends Dialog {
    /* renamed from: a */
    private long f60801a = 0;
    /* renamed from: b */
    private Runnable f60802b;
    /* renamed from: c */
    private Runnable f60803c = ((Runnable) new C19471b(this));
    /* renamed from: d */
    private Runnable f60804d = ((Runnable) new C19470a(this));
    /* renamed from: e */
    private final OverlayTooltipView f60805e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.b$a */
    static final class C19470a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C19472b f60799a;

        C19470a(C19472b c19472b) {
            this.f60799a = c19472b;
        }

        public final void run() {
            this.f60799a.f60802b = (Runnable) null;
            this.f60799a.m70094a((Function0) new OverlayTooltipDialog$dismissDialogWithAnimationRunnable$1$1(this.f60799a));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.b$b */
    static final class C19471b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C19472b f60800a;

        C19471b(C19472b c19472b) {
            this.f60800a = c19472b;
        }

        public final void run() {
            this.f60800a.f60802b = (Runnable) null;
            this.f60800a.dismiss();
        }
    }

    public C19472b(@NotNull Context context, @NotNull OverlayTooltipView overlayTooltipView) {
        C2668g.b(context, "context");
        C2668g.b(overlayTooltipView, "tooltipViewWithOverlay");
        super(context);
        this.f60805e = overlayTooltipView;
        requestWindowFeature(1);
        getWindow().setLayout(-1, -1);
        context = getWindow();
        C2668g.a(context, "window");
        context.getAttributes().gravity = 8388659;
        getWindow().setBackgroundDrawable((Drawable) new ColorDrawable(0));
        getWindow().clearFlags(2);
        setContentView((View) this.f60805e);
    }

    public void show() {
        super.show();
        getWindow().setLayout(-1, -1);
        this.f60805e.m70039a();
        if (this.f60801a != Long.MIN_VALUE && this.f60802b != null) {
            Window window = getWindow();
            C2668g.a(window, "window");
            window.getDecorView().postDelayed(this.f60802b, this.f60801a);
        }
    }

    public void dismiss() {
        Runnable runnable = this.f60802b;
        if (runnable != null) {
            Window window = getWindow();
            C2668g.a(window, "window");
            window.getDecorView().removeCallbacks(runnable);
        }
        super.dismiss();
    }

    @NotNull
    /* renamed from: a */
    public final C19472b m70093a(long j) {
        C19472b c19472b = this;
        c19472b.f60801a = j;
        c19472b.f60802b = c19472b.f60803c;
        return c19472b;
    }

    @NotNull
    /* renamed from: b */
    public final C19472b m70095b(long j) {
        C19472b c19472b = this;
        c19472b.f60801a = j;
        c19472b.f60802b = c19472b.f60804d;
        return c19472b;
    }

    /* renamed from: a */
    public final void m70094a(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "onAnimationEnd");
        this.f60805e.m70040a((Function0) function0);
    }
}
