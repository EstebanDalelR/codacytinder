package com.tinder.boost.dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.tinder.R;
import com.tinder.boost.presenter.C12629r;
import com.tinder.boost.target.BoostSummaryTarget;
import com.tinder.boost.view.BoostGaugeView;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.av;
import javax.inject.Inject;

public class BoostSummaryDialog extends C12627a implements BoostSummaryTarget {
    @Inject
    /* renamed from: a */
    C12629r f43480a;
    /* renamed from: b */
    private BoostClickListener f43481b;
    @BindString(2131820665)
    String boostMultipleTemplate;
    /* renamed from: c */
    private Unbinder f43482c = ButterKnife.a(this);
    @BindString(2131820659)
    String mBoostAgain;
    @BindString(2131820676)
    String mBoostSummaryDescription;
    @BindString(2131820679)
    String mBoostSummaryTitleNonPlus;
    @BindString(2131820680)
    String mBoostSummaryTitlePlus;
    @BindView(2131361957)
    TextView mDescription;
    @BindView(2131361954)
    BoostGaugeView mGaugeView;
    @BindString(2131821126)
    String mGetTinderPlus;
    @BindView(2131361958)
    TextView mInfoDescription;
    @BindView(2131361959)
    TextView mInfoTitle;
    @BindView(2131361955)
    Button mSummaryButton;
    @BindView(2131361960)
    TextView mTitleView;

    public interface BoostClickListener {
        void onBoostAgainClick();
    }

    @OnClick({2131362051})
    void onCardClick() {
    }

    public BoostSummaryDialog(Context context) {
        super(context);
        setContentView(R.layout.dialog_boost_summary);
        ManagerApp.e().inject(this);
    }

    protected void onStart() {
        super.onStart();
        this.f43480a.a(this);
        this.f43480a.m49873b();
    }

    protected void onStop() {
        super.onStop();
        this.f43480a.a();
        this.f43482c.unbind();
    }

    public void dismiss() {
        super.dismiss();
        this.f43480a.m49874c();
    }

    public void displaySubscriberSummary(String str) {
        av.c(new View[]{this.mInfoTitle, this.mInfoDescription});
        av.a(new View[]{this.mGaugeView});
        this.mDescription.setText(String.format(this.mBoostSummaryDescription, new Object[]{str}));
        this.mSummaryButton.setText(this.mBoostAgain);
        this.mTitleView.setText(this.mBoostSummaryTitlePlus);
        this.mGaugeView.m35596a(String.format(this.boostMultipleTemplate, new Object[]{str}));
    }

    public void displayNonSubscriberSummary(String str, String str2, String str3) {
        av.a(new View[]{this.mInfoTitle, this.mInfoDescription, this.mGaugeView});
        this.mDescription.setText(String.format(this.mBoostSummaryDescription, new Object[]{str}));
        this.mInfoTitle.setText(str2);
        this.mInfoDescription.setText(str3);
        this.mSummaryButton.setText(this.mGetTinderPlus);
        this.mTitleView.setText(this.mBoostSummaryTitleNonPlus);
        this.mGaugeView.m35596a(String.format(this.boostMultipleTemplate, new Object[]{str}));
    }

    public void onBoostAgainClick() {
        if (this.f43481b != null) {
            this.f43481b.onBoostAgainClick();
        }
        dismiss();
    }

    public void onGetTinderPlusClick() {
        C10076o.m41167a(PlusPaywallSource.BOOST_DIALOG_SUMMARY).m41175a(C14398a.a(getContext()));
        dismiss();
    }

    /* renamed from: a */
    public void m53173a(BoostClickListener boostClickListener) {
        this.f43481b = boostClickListener;
    }

    @OnClick({2131361955})
    void boostSummaryButtonClick() {
        this.f43480a.m49875d();
    }

    @OnClick({2131361956})
    void onClickOutsideCard() {
        dismiss();
    }
}
