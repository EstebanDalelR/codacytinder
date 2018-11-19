package com.tinder.recs.view;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recs.presenter.DiscoveryOffPresenter;
import com.tinder.recs.target.DiscoveryOffTarget;
import javax.inject.Inject;

public class DiscoveryOffView extends LinearLayout implements DiscoveryOffTarget {
    @BindView(2131362333)
    TextView discoverOff;
    @Inject
    DiscoveryOffPresenter presenter;
    @BindView(2131362334)
    ProgressBar progressBar;

    public DiscoveryOffView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
        inflate(context, R.layout.recs_discovery_off, this);
        ButterKnife.a(this);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Deadshot.take(this, this.presenter);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    @OnClick({2131362333})
    void onEnableButtonClick() {
        this.presenter.enableDiscovery();
    }

    public void showProgress() {
        this.discoverOff.setVisibility(8);
        this.progressBar.setVisibility(0);
    }

    public void hideProgress() {
        this.discoverOff.setVisibility(0);
        this.progressBar.setVisibility(8);
    }

    public void showFailedToEnableDiscovery() {
        Snackbar.a(this, R.string.error_loading, 0).a(R.string.retry, new DiscoveryOffView$$Lambda$0(this));
    }

    final /* synthetic */ void lambda$showFailedToEnableDiscovery$0$DiscoveryOffView(View view) {
        this.presenter.enableDiscovery();
    }

    public void hideDiscoveryOff() {
        setVisibility(8);
    }
}
