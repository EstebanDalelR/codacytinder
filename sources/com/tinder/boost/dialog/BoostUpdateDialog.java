package com.tinder.boost.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.widget.Space;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.boost.presenter.C12633s;
import com.tinder.boost.provider.BoostUpdateProvider$a;
import com.tinder.boost.provider.C10443i;
import com.tinder.boost.target.BoostUpdateTarget;
import com.tinder.boost.view.BoostEmitterView.C8351b;
import com.tinder.boost.view.BoostGaugeView;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.av;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;

public class BoostUpdateDialog extends C12627a implements BoostUpdateTarget {
    @Inject
    /* renamed from: a */
    C12633s f43483a;
    /* renamed from: b */
    private Unbinder f43484b = ButterKnife.a(this);
    @BindDimen(2131165295)
    int mBoostEmitterYDelta;
    @BindString(2131820680)
    String mBoostEnded;
    @BindView(2131361953)
    Space mBoostGaugeSpace;
    @BindView(2131361967)
    ViewGroup mBoostViewContainer;
    @BindView(2131362014)
    Button mBtnGetTinderPlus;
    @BindView(2131361999)
    View mBtnOkay;
    @BindView(2131361962)
    TextView mDescription;
    @BindString(2131820683)
    String mDescriptionString;
    @BindView(2131361954)
    BoostGaugeView mGaugeView;
    @BindView(2131361964)
    TextView mInfoDescription;
    @BindView(2131361965)
    TextView mInfoTitle;
    @BindView(2131362306)
    FrameLayout mMainContainer;
    @BindView(2131361966)
    TextView mTimer;

    /* renamed from: com.tinder.boost.dialog.BoostUpdateDialog$1 */
    class C83411 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ BoostUpdateDialog f29638a;

        C83411(BoostUpdateDialog boostUpdateDialog) {
            this.f29638a = boostUpdateDialog;
        }

        public void onGlobalLayout() {
            this.f29638a.mBoostGaugeSpace.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Rect rect = new Rect();
            this.f29638a.mBoostGaugeSpace.getGlobalVisibleRect(rect);
            this.f29638a.mGaugeView.setTranslationY((float) rect.top);
            LayoutParams layoutParams = this.f29638a.mGaugeView.getLayoutParams();
            layoutParams.width = this.f29638a.mBoostGaugeSpace.getWidth();
            layoutParams.height = this.f29638a.mBoostGaugeSpace.getHeight();
            this.f29638a.mGaugeView.setLayoutParams(layoutParams);
            this.f29638a.mGaugeView.setGaugeListener(new C10418f(this));
            this.f29638a.mGaugeView.setVisibility(0);
            this.f29638a.mGaugeView.setRepeats(false);
            this.f29638a.mGaugeView.m35597b();
        }

        /* renamed from: a */
        final /* synthetic */ void m35513a() {
            new C8351b().m35556a(this.f29638a.mMainContainer).m35557a(new C10443i()).m35554a(((int) this.f29638a.mGaugeView.getY()) - this.f29638a.mBoostEmitterYDelta).m35555a(this.f29638a.f43483a.m49883c()).m35558a(this.f29638a.mGaugeView).m35579a();
        }
    }

    @OnClick({2131362051})
    public void onCardClick() {
    }

    public BoostUpdateDialog(Context context) {
        super(context);
        setContentView(R.layout.dialog_boost_update);
        ManagerApp.e().inject(this);
    }

    protected void onStart() {
        super.onStart();
        this.f43483a.a(this);
        this.mBoostGaugeSpace.getViewTreeObserver().addOnGlobalLayoutListener(new C83411(this));
    }

    protected void onStop() {
        super.onStop();
        this.f43484b.unbind();
        this.f43483a.m49881a();
    }

    public void show() {
        super.show();
        this.f43483a.m49882b();
    }

    public void showDescription(String str) {
        this.mDescription.setVisibility(0);
        this.mDescription.setText(String.format(this.mDescriptionString, new Object[]{str}));
    }

    public void updateMultiplierText(@NonNull String str) {
        this.mGaugeView.setMultiplier(str);
    }

    public void showTimerText(long j) {
        j = String.format("%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1))});
        this.mTimer.setText(getContext().getString(2131822012, new Object[]{j}));
    }

    public void showFinished() {
        this.mTimer.setText(this.mBoostEnded);
        this.mGaugeView.m35594a(0.0f);
        new Handler().postDelayed(new C8342e(this), 1000);
    }

    public void showBoostPercent(Float f) {
        this.mGaugeView.m35594a(f.floatValue());
    }

    public void showEmitterWithDuration(long j) {
        new C8351b().m35556a(this.mMainContainer).m35557a(new C10443i()).m35554a(((int) this.mGaugeView.getY()) - this.mBoostEmitterYDelta).m35555a(j).m35558a(this.mGaugeView).m35579a();
    }

    public void showNonSubscriberSection(String str, String str2) {
        av.a(new View[]{this.mInfoTitle, this.mInfoDescription, this.mBtnGetTinderPlus});
        av.c(new View[]{this.mBtnOkay});
        this.mInfoTitle.setText(str);
        this.mInfoDescription.setText(str2);
    }

    public void showSubscriberSection() {
        av.a(new View[]{this.mBtnOkay});
        av.c(new View[]{this.mInfoTitle, this.mInfoDescription, this.mBtnGetTinderPlus});
    }

    @OnClick({2131362306})
    public void onWindowBackgroundClick() {
        dismiss();
    }

    @OnClick({2131361999})
    void onDoneClick() {
        dismiss();
    }

    @OnClick({2131362014})
    void onGetTinderPlusClick() {
        C10076o.m41167a(PlusPaywallSource.BOOST_DIALOG_SUMMARY).m41175a(C14398a.a(getContext()));
    }

    /* renamed from: a */
    public void m53174a(BoostUpdateProvider$a boostUpdateProvider$a) {
        showBoostPercent(Float.valueOf(boostUpdateProvider$a.m35550c()));
        showTimerText(boostUpdateProvider$a.m35548a());
        updateMultiplierText(boostUpdateProvider$a.m35549b());
        super.show();
    }
}
