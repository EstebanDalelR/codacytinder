package com.tinder.tinderplus.activities;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.passport.activities.ActivityPassport;
import com.tinder.passport.model.PassportLocation;
import com.tinder.passport.p300a.C10032a;
import com.tinder.tinderplus.adapters.RecyclerAdapterTPlusControl;
import com.tinder.tinderplus.adapters.RecyclerAdapterTPlusControl.PassportViewHolder;
import com.tinder.tinderplus.p429b.C18211a;
import com.tinder.tinderplus.target.TinderPlusControlTarget;
import com.tinder.utils.ad;
import com.tinder.utils.ag;
import com.tinder.views.FeatureRow;
import com.tinder.views.FeatureRow.FeatureInteractionListener;
import com.tinder.views.ab;
import java.util.List;
import javax.inject.Inject;

public class ActivityTPlusControl extends ActivitySignedInBase implements TinderPlusControlTarget, FeatureInteractionListener {
    @Inject
    /* renamed from: a */
    C18211a f60032a;
    @Inject
    /* renamed from: b */
    LegacyBreadCrumbTracker f60033b;
    /* renamed from: c */
    private LinearLayoutManager f60034c;
    /* renamed from: d */
    private ab f60035d;
    @BindString(2131820909)
    String disable;
    @BindString(2131822133)
    String disableFastMatchMessage;
    @BindString(2131820924)
    String disableFastMatchTitle;
    @BindView(2131361892)
    AppBarLayout mAppBar;
    @BindView(2131361997)
    Button mGetTPlusBtn;
    @BindString(2131821398)
    String mMyTinderPlusText;
    @BindView(2131363734)
    RecyclerView mRecyclerView;
    @BindString(2131822019)
    String mTinderPlusText;
    @BindView(2131363826)
    TextView mToolbarTitle;
    @BindView(2131363919)
    ImageView mUpButton;
    @BindString(2131821397)
    String myTinderGoldText;
    @BindString(2131821438)
    String notNow;
    @BindColor(2131099677)
    int upButtonColor;
    @BindDimen(2131165737)
    int verticalPadding;

    /* renamed from: com.tinder.tinderplus.activities.ActivityTPlusControl$a */
    private static class C18207a extends LinearLayoutManager {
        C18207a(Context context) {
            super(context);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m68729a(DialogInterface dialogInterface, int i) {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.t_plus_control);
        ManagerApp.e().inject(this);
        ad.a();
        ButterKnife.a(this);
        this.f60035d = new ab(this.verticalPadding);
        overridePendingTransition(R.anim.slide_up_fifty_percent_to_default, R.anim.slide_down_five_percent_from_default);
        this.mUpButton.setColorFilter(this.upButtonColor);
        m68730e();
    }

    public void onResume() {
        super.onResume();
        this.f60033b.a(this);
    }

    protected void onStart() {
        super.onStart();
        this.f60032a.a(this);
        this.f60032a.m66030b();
    }

    protected void onStop() {
        super.onStop();
        this.f60032a.a();
        this.mRecyclerView.removeItemDecoration(this.f60035d);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8800) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            PassportLocation passportLocation = (PassportLocation) intent.getParcelableExtra("tinderlocation");
            if (passportLocation == null) {
                ad.c("No location in data passed back by ActivityPassport");
                return;
            }
            if (this.f60032a.H() != 0) {
                if (this.mRecyclerView.getAdapter() != 0) {
                    this.f60032a.m66031b(passportLocation, m68731f());
                }
            }
            this.f60032a.a(this);
            this.f60032a.m66023a(passportLocation, m68731f());
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_up_five_percent_to_default, R.anim.slide_down_entirely_from_default);
    }

    public void onBackPressed() {
        this.f60032a.m66034c();
        super.onBackPressed();
    }

    @OnClick({2131363919})
    public void onUpClick() {
        onBackPressed();
    }

    @OnClick({2131363826})
    public void onToolbarTitleClick() {
        onBackPressed();
    }

    @OnClick({2131361997})
    public void onGetPlusButtonClick() {
        this.f60032a.m66032b(m68731f());
    }

    public void showTinderPlusControl(@NonNull List<String> list, boolean z) {
        if (z) {
            this.mGetTPlusBtn.setVisibility(8);
            this.mRecyclerView.setNestedScrollingEnabled(false);
            this.mAppBar.setExpanded(false);
        } else {
            this.mGetTPlusBtn.setVisibility(0);
            this.mRecyclerView.setNestedScrollingEnabled(true);
        }
        this.f60034c = new C18207a(this);
        this.mRecyclerView.setLayoutManager(this.f60034c);
        this.mRecyclerView.setAdapter(new RecyclerAdapterTPlusControl(this, getSupportActionBar().getThemedContext(), list, z, this));
        this.mRecyclerView.removeItemDecoration(this.f60035d);
        this.mRecyclerView.addItemDecoration(this.f60035d);
    }

    public void setGoldToolbarTitle() {
        this.mToolbarTitle.setText(this.myTinderGoldText);
    }

    public void setPlusToolbarTitle() {
        this.mToolbarTitle.setText(this.mMyTinderPlusText);
    }

    public void navigateToActivityPassport() {
        startActivityForResult(new Intent(getApplicationContext(), ActivityPassport.class), 8800);
    }

    public void selectPassportLocation(@NonNull PassportLocation passportLocation, @NonNull List<PassportLocation> list) {
        Adapter adapter = this.mRecyclerView.getAdapter();
        for (int i = 0; i < adapter.getItemCount(); i++) {
            if (adapter.getItemViewType(i) == 0) {
                ViewHolder findViewHolderForAdapterPosition = this.mRecyclerView.findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition != null) {
                    PassportViewHolder passportViewHolder = (PassportViewHolder) findViewHolderForAdapterPosition;
                    C10032a c10032a = (C10032a) passportViewHolder.mRecentPassportList.getAdapter();
                    c10032a.a(list);
                    c10032a.a(passportLocation);
                    passportLocation = passportViewHolder.mRecentPassportList.getHeader();
                    ((ImageView) passportLocation.findViewById(R.id.purchased_location_img)).setColorFilter(C10032a.f32920b);
                    passportLocation.findViewById(R.id.purchased_location_check).setVisibility(8);
                    return;
                }
            }
        }
    }

    public void showDisableFastMatchAlertDialog(FeatureRow featureRow, FeatureRow featureRow2) {
        setCheckedFeature(featureRow2, featureRow);
        Builder builder = new Builder(this);
        builder.setTitle(this.disableFastMatchTitle).setMessage(this.disableFastMatchMessage).setPositiveButton(this.disable, new C15194a(this, featureRow, featureRow2)).setNegativeButton(this.notNow, C15195b.f47260a);
        builder.create().show();
    }

    /* renamed from: a */
    final /* synthetic */ void m68733a(FeatureRow featureRow, FeatureRow featureRow2, DialogInterface dialogInterface, int i) {
        this.f60032a.m66033b(featureRow, featureRow2);
    }

    public void setCheckedFeature(@NonNull FeatureRow featureRow, @NonNull FeatureRow featureRow2) {
        featureRow.m57852a();
        featureRow2.m57855b();
    }

    public void onFeatureRowClick(View view) {
        this.f60032a.m66022a(view, m68731f());
    }

    public void onFeatureRowChecked(FeatureRow featureRow, FeatureRow featureRow2) {
        this.f60032a.m66027a(featureRow, featureRow2);
    }

    public void onFeatureSwitchChange(FeatureRow featureRow, boolean z) {
        this.f60032a.m66028a(featureRow, z);
    }

    /* renamed from: d */
    public void m68735d() {
        this.f60032a.m66026a(m68731f());
    }

    /* renamed from: e */
    private void m68730e() {
        View view = (View) this.mUpButton.getParent();
        View view2 = (View) this.mToolbarTitle.getParent();
        view.post(new C15196c(this, view));
        view2.post(new C15197d(this, view2));
    }

    /* renamed from: b */
    final /* synthetic */ void m68734b(View view) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= 30;
        rect.left -= 30;
        rect.right += 30;
        rect.bottom += 30;
        view.setTouchDelegate(new TouchDelegate(rect, this.mUpButton));
    }

    /* renamed from: a */
    final /* synthetic */ void m68732a(View view) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= 30;
        rect.left -= 30;
        rect.right += 30;
        rect.bottom += 30;
        view.setTouchDelegate(new TouchDelegate(rect, this.mToolbarTitle));
    }

    /* renamed from: f */
    private ag<Integer> m68731f() {
        if (this.f60034c == null) {
            return ag.m57618a(Integer.valueOf(0), Integer.valueOf(0));
        }
        int findFirstVisibleItemPosition = this.f60034c.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.f60034c.findLastVisibleItemPosition();
        if (findLastVisibleItemPosition >= findFirstVisibleItemPosition) {
            return ag.m57618a(Integer.valueOf(findFirstVisibleItemPosition), Integer.valueOf(findLastVisibleItemPosition));
        }
        ad.c("Invalid range");
        return ag.m57618a(Integer.valueOf(0), Integer.valueOf(0));
    }
}
