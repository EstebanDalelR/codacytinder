package com.tinder.settings.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.base.ActivityBase;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.views.MoreGenderView;

public class MoreGenderActivity extends ActivityBase {
    @BindView(2131362972)
    MoreGenderView moreGenderView;
    @BindView(2131363821)
    Toolbar toolbar;
    @BindString(2131821185)
    String toolbarTitle;

    /* renamed from: a */
    public static Intent m68652a(Context context) {
        return new Intent(context, MoreGenderActivity.class);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_more_gender);
        ManagerApp.a(this).h().inject(this);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.enter_right_to_left, R.anim.enter_left_to_right);
        m68653b();
    }

    public void onResume() {
        super.onResume();
        this.moreGenderView.m62164a();
    }

    public void onPause() {
        super.onPause();
        this.moreGenderView.m62166b();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.exit_left_to_right, R.anim.exit_right_to_left);
    }

    /* renamed from: b */
    private void m68653b() {
        setSupportActionBar(this.toolbar);
        getSupportActionBar().setTitle(this.toolbarTitle);
        this.toolbar.setNavigationOnClickListener(new C14849i(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m68654a(View view) {
        onBackPressed();
    }
}
