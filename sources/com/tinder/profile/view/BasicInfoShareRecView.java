package com.tinder.profile.view;

import android.app.Activity;
import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.BindView;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.profile.presenter.C14424c;
import com.tinder.profile.target.BasicInfoShareRecTarget;
import com.tinder.utils.at;
import javax.inject.Inject;

public class BasicInfoShareRecView extends FrameLayout implements BasicInfoShareRecTarget {
    @Inject
    /* renamed from: a */
    C14424c f50198a;
    @BindView(2131363559)
    ImageView share;
    @BindView(2131363643)
    ProgressBar spinner;

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Deadshot.take(this, this.f50198a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void startShareRecIntent(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        getContext().startActivity(Intent.createChooser(intent, String.format(getContext().getString(R.string.share_sheet_title), new Object[]{str2})));
    }

    public void showUserHasSharingDisabledError() {
        if (getContext() instanceof Activity) {
            at.m57644b((Activity) getContext(), (int) R.string.cannot_share_rec);
        }
    }

    public void showGenericError() {
        if (getContext() instanceof Activity) {
            at.m57638a((Activity) getContext(), (int) R.string.reported_warning_accept_agreement_error);
        }
    }

    public void setShareInProgress() {
        this.spinner.setVisibility(0);
        this.share.setVisibility(4);
    }

    public void setShareComplete() {
        this.spinner.setVisibility(8);
        this.share.setVisibility(0);
    }
}
