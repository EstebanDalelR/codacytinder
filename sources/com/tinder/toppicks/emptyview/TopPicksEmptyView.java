package com.tinder.toppicks.emptyview;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.tinder.C6149a;
import com.tinder.base.view.IdViewAnimator;
import com.tinder.gold.TinderGoldButtonView;
import com.tinder.toppicks.C15235b.C15229e;
import com.tinder.toppicks.C15235b.C15230f;
import com.tinder.toppicks.SettingsLauncher;
import com.tinder.toppicks.SettingsLauncher.Source;
import com.tinder.toppicks.di.TopPicksInjector$Factory;
import com.tinder.toppicks.error.TopPicksErrorView;
import com.tinder.utils.C15365p;
import javax.inject.Inject;
import jp.wasabeef.glide.transformations.C17541b;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0014J\b\u0010!\u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/tinder/toppicks/emptyview/TopPicksEmptyView;", "Lcom/tinder/base/view/IdViewAnimator;", "Lcom/tinder/toppicks/emptyview/TopPicksEmptyViewTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "countDownTimer", "Landroid/os/CountDownTimer;", "errorView", "Lcom/tinder/toppicks/error/TopPicksErrorView;", "newPicksCountdown", "Landroid/widget/TextView;", "presenter", "Lcom/tinder/toppicks/emptyview/TopPicksEmptyPresenter;", "getPresenter", "()Lcom/tinder/toppicks/emptyview/TopPicksEmptyPresenter;", "setPresenter", "(Lcom/tinder/toppicks/emptyview/TopPicksEmptyPresenter;)V", "profilePicThumbnailView", "Landroid/widget/ImageView;", "settingsButton", "Lcom/tinder/gold/TinderGoldButtonView;", "settingsLauncher", "Lcom/tinder/toppicks/SettingsLauncher;", "getSettingsLauncher", "()Lcom/tinder/toppicks/SettingsLauncher;", "setSettingsLauncher", "(Lcom/tinder/toppicks/SettingsLauncher;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "openSettingsView", "setCountdownTime", "countdownTime", "", "setProfileImage", "photoUrl", "", "showPage", "page", "Lcom/tinder/toppicks/emptyview/TopPicksEmptyView$Page;", "Page", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksEmptyView extends IdViewAnimator implements TopPicksEmptyViewTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C15257a f52439a;
    @Inject
    @NotNull
    /* renamed from: b */
    public SettingsLauncher f52440b;
    /* renamed from: c */
    private final ImageView f52441c;
    /* renamed from: d */
    private final TextView f52442d;
    /* renamed from: e */
    private final TinderGoldButtonView f52443e;
    /* renamed from: f */
    private final TopPicksErrorView f52444f;
    /* renamed from: g */
    private CountDownTimer f52445g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/toppicks/emptyview/TopPicksEmptyView$Page;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "LOADING", "EMPTY_VIEW", "ERROR", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    public enum Page {
        ;
        
        private final int id;

        protected Page(int i) {
            this.id = i;
        }

        public final int getId() {
            return this.id;
        }
    }

    public /* synthetic */ TopPicksEmptyView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksEmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ((TopPicksInjector$Factory) context).provideTopPicksInjector().inject(this);
        ViewAnimator.inflate(context, C15230f.top_picks_empty_view, this);
        setInAnimation(context, 17432576);
        setOutAnimation(context, 17432577);
        context = findViewById(C15229e.profile_pic_thumbnail);
        C2668g.a(context, "findViewById(R.id.profile_pic_thumbnail)");
        this.f52441c = (ImageView) context;
        context = findViewById(C15229e.new_picks_countdown);
        C2668g.a(context, "findViewById(R.id.new_picks_countdown)");
        this.f52442d = (TextView) context;
        context = findViewById(C15229e.discovery_settings_button);
        C2668g.a(context, "findViewById(R.id.discovery_settings_button)");
        this.f52443e = (TinderGoldButtonView) context;
        context = findViewById(C15229e.top_picks_empty_error_view);
        C2668g.a(context, "findViewById(R.id.top_picks_empty_error_view)");
        this.f52444f = (TopPicksErrorView) context;
        this.f52444f.setOnTryAgainClickListener((Function1) new Function1<View, C15813i>() {
            public /* synthetic */ Object invoke(Object obj) {
                m67476a((View) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67476a(@NotNull View view) {
                C2668g.b(view, "it");
                this.getPresenter().m57359b();
            }
        });
    }

    @NotNull
    public final C15257a getPresenter() {
        C15257a c15257a = this.f52439a;
        if (c15257a == null) {
            C2668g.b("presenter");
        }
        return c15257a;
    }

    public final void setPresenter(@NotNull C15257a c15257a) {
        C2668g.b(c15257a, "<set-?>");
        this.f52439a = c15257a;
    }

    @NotNull
    public final SettingsLauncher getSettingsLauncher() {
        SettingsLauncher settingsLauncher = this.f52440b;
        if (settingsLauncher == null) {
            C2668g.b("settingsLauncher");
        }
        return settingsLauncher;
    }

    public final void setSettingsLauncher(@NotNull SettingsLauncher settingsLauncher) {
        C2668g.b(settingsLauncher, "<set-?>");
        this.f52440b = settingsLauncher;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C15257a c15257a = this.f52439a;
        if (c15257a == null) {
            C2668g.b("presenter");
        }
        c15257a.m57358a((TopPicksEmptyViewTarget) this);
        this.f52443e.setButtonAction(new TopPicksEmptyView$onAttachedToWindow$1(this));
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C15257a c15257a = this.f52439a;
        if (c15257a == null) {
            C2668g.b("presenter");
        }
        c15257a.m57357a();
        this.f52443e.a();
        CountDownTimer countDownTimer = this.f52445g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public void setProfileImage(@NotNull String str) {
        C2668g.b(str, "photoUrl");
        C0994i.b(getContext()).a(str).a(new Transformation[]{new C17541b(getContext())}).a(this.f52441c);
    }

    public void showPage(@NotNull Page page) {
        C2668g.b(page, "page");
        setDisplayedChildId(page.getId());
    }

    public void setCountdownTime(long j) {
        CountDownTimer countDownTimer = this.f52445g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f52445g = new C6149a(j, new TopPicksEmptyView$setCountdownTime$1(this)).start();
    }

    /* renamed from: a */
    private final void m62795a() {
        SettingsLauncher settingsLauncher = this.f52440b;
        if (settingsLauncher == null) {
            C2668g.b("settingsLauncher");
        }
        Context context = getContext();
        C2668g.a(context, "context");
        context = C15365p.m57675b(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        settingsLauncher.launchSettings((Activity) context, Source.TOP_PICKS_GRID);
    }
}
