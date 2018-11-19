package com.tinder.settings.loops.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.activity.SettingsActivity;
import com.tinder.settings.loops.activity.AutoPlayLoopsOptionsActivity;
import com.tinder.settings.loops.activity.AutoPlayLoopsOptionsActivity.C14887a;
import com.tinder.settings.loops.p407a.C14885d;
import com.tinder.settings.loops.target.AutoPlayVideoSettingsTarget;
import com.tinder.utils.C15365p;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/tinder/settings/loops/view/AutoPlayVideoSettingsView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/settings/loops/target/AutoPlayVideoSettingsTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "presenter", "Lcom/tinder/settings/loops/presenter/AutoPlayVideoSettingsPresenter;", "getPresenter", "()Lcom/tinder/settings/loops/presenter/AutoPlayVideoSettingsPresenter;", "setPresenter", "(Lcom/tinder/settings/loops/presenter/AutoPlayVideoSettingsPresenter;)V", "hideAutoPlaySettings", "", "launchAutoPlaySettings", "onAttachedToWindow", "onDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AutoPlayVideoSettingsView extends LinearLayout implements AutoPlayVideoSettingsTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14885d f51548a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.loops.view.AutoPlayVideoSettingsView$a */
    static final class C14893a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ AutoPlayVideoSettingsView f46577a;

        C14893a(AutoPlayVideoSettingsView autoPlayVideoSettingsView) {
            this.f46577a = autoPlayVideoSettingsView;
        }

        public final void onClick(View view) {
            this.f46577a.getPresenter().m56335b();
        }
    }

    public AutoPlayVideoSettingsView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        attributeSet = C15365p.m57675b(context);
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.settings.activity.SettingsActivity");
        }
        attributeSet = ((SettingsActivity) attributeSet).getApplication();
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) attributeSet).h().inject(this);
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.view_auto_play_video_setting_item, this);
    }

    @NotNull
    public final C14885d getPresenter() {
        C14885d c14885d = this.f51548a;
        if (c14885d == null) {
            C2668g.b("presenter");
        }
        return c14885d;
    }

    public final void setPresenter(@NotNull C14885d c14885d) {
        C2668g.b(c14885d, "<set-?>");
        this.f51548a = c14885d;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14885d c14885d = this.f51548a;
        if (c14885d == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c14885d);
        setOnClickListener(new C14893a(this));
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void hideAutoPlaySettings() {
        setVisibility(8);
    }

    public void launchAutoPlaySettings() {
        C14887a c14887a = AutoPlayLoopsOptionsActivity.f60022c;
        Context context = getContext();
        C2668g.a(context, "context");
        getContext().startActivity(c14887a.m56338a(context));
    }
}
