package com.tinder.main.p287c;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Outline;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tinder.base.p173c.C8304b;
import com.tinder.base.view.LockableViewPager;
import com.tinder.base.view.TouchBlockingFrameLayout;
import com.tinder.design.tabbedpagelayout.TabLayout;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.TabbedPageLayoutAdapter;
import com.tinder.main.C9830c.C9816a;
import com.tinder.main.C9830c.C9817b;
import com.tinder.main.C9830c.C9818c;
import com.tinder.main.C9830c.C9819d;
import com.tinder.main.adapter.MainTabbedPageLayoutAdapter;
import com.tinder.main.di.C11996a;
import com.tinder.main.di.MainViewComponent;
import com.tinder.main.di.MainViewComponent$Parent;
import com.tinder.main.di.MainViewComponent.Provider;
import com.tinder.main.model.MainPage;
import com.tinder.main.tooltip.C12013b;
import com.tinder.main.tooltip.MainTabTooltipOwner;
import com.tinder.utils.au;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.Tooltip.C19463a;
import tinder.com.tooltip.Tooltip.OnClickListener;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u000eH\u0016J\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020'H\u0002J\u000e\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020%J \u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\u001eH\u0016J \u00102\u001a\u00020'2\u0006\u0010.\u001a\u00020/2\u0006\u00101\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/tinder/main/view/MainView;", "Lcom/tinder/base/view/TouchBlockingFrameLayout;", "Lcom/tinder/main/di/MainViewComponent$Provider;", "Lcom/tinder/main/tooltip/MainTabTooltipOwner;", "context", "Landroid/content/Context;", "parentComponent", "Lcom/tinder/main/di/MainViewComponent$Parent;", "(Landroid/content/Context;Lcom/tinder/main/di/MainViewComponent$Parent;)V", "lockableViewPager", "Lcom/tinder/base/view/LockableViewPager;", "mainTabbedPageLayoutAdapter", "Lcom/tinder/main/adapter/MainTabbedPageLayoutAdapter;", "mainViewComponent", "Lcom/tinder/main/di/MainViewComponent;", "onPageSelectedListeners", "", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "tabLayout", "Lcom/tinder/design/tabbedpagelayout/TabLayout;", "tabbedPageLayout", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout;", "toolbar", "Landroid/support/v7/widget/Toolbar;", "tooltipDialog", "Landroid/app/Dialog;", "createTooltipDialog", "anchorView", "Landroid/view/View;", "message", "", "onDialogDismiss", "Landroid/content/DialogInterface$OnDismissListener;", "getDisplayedPage", "Lcom/tinder/main/model/MainPage;", "getMainViewComponent", "isPagingEnabled", "", "navigateToFeed", "", "setDisplayedPage", "page", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "setPagingEnabled", "pagingEnabled", "showTooltip", "trigger", "Lcom/tinder/main/tooltip/MainTabTooltipTrigger;", "mainPage", "tooltipText", "showTooltipDialog", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.c.c */
public final class C13390c extends TouchBlockingFrameLayout implements Provider, MainTabTooltipOwner {
    /* renamed from: a */
    private final Set<OnPageSelectedListener> f42456a;
    /* renamed from: b */
    private final MainTabbedPageLayoutAdapter f42457b;
    /* renamed from: c */
    private final MainViewComponent f42458c;
    /* renamed from: d */
    private final TabbedPageLayout f42459d;
    /* renamed from: e */
    private final TabLayout f42460e;
    /* renamed from: f */
    private final Toolbar f42461f;
    /* renamed from: g */
    private final LockableViewPager f42462g;
    /* renamed from: h */
    private Dialog f42463h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017¨\u0006\t"}, d2 = {"com/tinder/main/view/MainView$1", "Landroid/view/ViewOutlineProvider;", "()V", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "main_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.c.c$1 */
    public static final class C98271 extends ViewOutlineProvider {
        C98271() {
        }

        @SuppressLint({"NewApi"})
        public void getOutline(@NotNull View view, @NotNull Outline outline) {
            C2668g.b(view, "view");
            C2668g.b(outline, "outline");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.16f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/base/extension/ViewExtKt$doWhenViewHasSize$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "onPreDraw", "", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.c.c$b */
    public static final class C9828b implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ View f32535a;
        /* renamed from: b */
        final /* synthetic */ C13390c f32536b;
        /* renamed from: c */
        final /* synthetic */ C12013b f32537c;
        /* renamed from: d */
        final /* synthetic */ CharSequence f32538d;
        /* renamed from: e */
        final /* synthetic */ View f32539e;

        public C9828b(View view, C13390c c13390c, C12013b c12013b, CharSequence charSequence, View view2) {
            this.f32535a = view;
            this.f32536b = c13390c;
            this.f32537c = c12013b;
            this.f32538d = charSequence;
            this.f32539e = view2;
        }

        public boolean onPreDraw() {
            if (!C8304b.m35397b(this.f32535a)) {
                return true;
            }
            this.f32535a.getViewTreeObserver().removeOnPreDrawListener(this);
            View view = this.f32535a;
            this.f32536b.m51794a(this.f32537c, this.f32538d, this.f32539e);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.c.c$c */
    static final class C9829c implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ C13390c f32540a;
        /* renamed from: b */
        final /* synthetic */ C12013b f32541b;

        C9829c(C13390c c13390c, C12013b c12013b) {
            this.f32540a = c13390c;
            this.f32541b = c12013b;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f32540a.f42463h = (Dialog) null;
            this.f32541b.m40461g();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/main/view/MainView$createTooltipDialog$1", "Ltinder/com/tooltip/Tooltip$OnClickListener;", "(Lcom/tinder/main/view/MainView;)V", "onClick", "", "main_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.c.c$a */
    public static final class C11994a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C13390c f38950a;

        C11994a(C13390c c13390c) {
            this.f38950a = c13390c;
        }

        public void onClick() {
            Dialog a = this.f38950a.f42463h;
            if (a != null) {
                a.dismiss();
            }
            this.f38950a.m51795b();
        }
    }

    public C13390c(@NotNull Context context, @NotNull MainViewComponent$Parent mainViewComponent$Parent) {
        C2668g.b(context, "context");
        C2668g.b(mainViewComponent$Parent, "parentComponent");
        super(context, null, 2, null);
        this.f42456a = mainViewComponent$Parent.pageSelectedListeners();
        this.f42457b = mainViewComponent$Parent.mainTabbedPageLayoutAdapter();
        this.f42458c = C11996a.m48039a().parent(mainViewComponent$Parent).build();
        View.inflate(context, C9819d.main_view_merge, this);
        context = findViewById(C9818c.main_tabbedpagelayout);
        C2668g.a(context, "findViewById(R.id.main_tabbedpagelayout)");
        this.f42459d = (TabbedPageLayout) context;
        context = findViewById(C9818c.main_tablayout);
        C2668g.a(context, "findViewById(R.id.main_tablayout)");
        this.f42460e = (TabLayout) context;
        context = findViewById(C9818c.main_toolbar);
        C2668g.a(context, "findViewById(R.id.main_toolbar)");
        this.f42461f = (Toolbar) context;
        context = findViewById(C9818c.main_viewpager);
        C2668g.a(context, "findViewById(R.id.main_viewpager)");
        this.f42462g = (LockableViewPager) context;
        this.f42462g.setOffscreenPageLimit(mainViewComponent$Parent.mainPages().size() - 1);
        ViewCompat.i((View) this.f42461f, getResources().getDimension(C9817b.main_toolbar_elevation));
        if (VERSION.SDK_INT >= 21) {
            this.f42461f.setOutlineProvider((ViewOutlineProvider) new C98271());
        }
        for (OnPageSelectedListener a : (Iterable) this.f42456a) {
            this.f42459d.m37545a(a);
        }
        this.f42459d.setAdapter((TabbedPageLayoutAdapter) this.f42457b);
    }

    @NotNull
    public MainViewComponent getMainViewComponent() {
        return this.f42458c;
    }

    public final void setDisplayedPage(@NotNull TabbedPageLayout$Page tabbedPageLayout$Page) {
        C2668g.b(tabbedPageLayout$Page, "page");
        this.f42459d.setDisplayedPage(tabbedPageLayout$Page);
    }

    @NotNull
    public final MainPage getDisplayedPage() {
        TabbedPageLayout$Page displayedPage = this.f42459d.getDisplayedPage();
        if (displayedPage != null) {
            return (MainPage) displayedPage;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.main.model.MainPage");
    }

    /* renamed from: a */
    public final boolean m51797a() {
        return this.f42462g.m49835a();
    }

    public final void setPagingEnabled(boolean z) {
        this.f42462g.setPagingEnabled(z);
    }

    public void showTooltip(@NotNull C12013b c12013b, @NotNull MainPage mainPage, @NotNull CharSequence charSequence) {
        C2668g.b(c12013b, "trigger");
        C2668g.b(mainPage, "mainPage");
        C2668g.b(charSequence, "tooltipText");
        Dialog dialog = this.f42463h;
        if (dialog != null) {
            dialog.dismiss();
        }
        View childAt = this.f42460e.getChildAt(this.f42457b.indexOfMainPage(mainPage));
        if (childAt == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        } else if (C8304b.m35397b(this) != null) {
            View view = this;
            m51794a(c12013b, charSequence, childAt);
        } else {
            getViewTreeObserver().addOnPreDrawListener(new C9828b(this, this, c12013b, charSequence, childAt));
        }
    }

    /* renamed from: a */
    private final void m51794a(C12013b c12013b, CharSequence charSequence, View view) {
        this.f42463h = m51790a(view, charSequence, (OnDismissListener) new C9829c(this, c12013b));
        c12013b = this.f42463h;
        if (c12013b != null) {
            c12013b.show();
        }
    }

    /* renamed from: a */
    private final Dialog m51790a(View view, CharSequence charSequence, OnDismissListener onDismissListener) {
        Context context = getContext();
        C2668g.a(context, "context");
        view = new C19463a(context, view).a(AnchorGravity.BOTTOM).a(charSequence.toString()).a(au.a(this, new int[]{C9816a.gradient_red, C9816a.gradient_orange})).a(-1).a(10000).a(true).a((OnClickListener) new C11994a(this)).a();
        view.setOnDismissListener(onDismissListener);
        view.setCancelable(false);
        return (Dialog) view;
    }

    /* renamed from: b */
    private final void m51795b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("tinder://activityfeed"));
        getContext().startActivity(intent);
    }
}
