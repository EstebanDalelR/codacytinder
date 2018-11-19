package com.tinder.passport.activities;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0432b;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tinder.R;
import com.tinder.adapters.C6176d;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerNetwork;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.fragments.FragmentMap;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.bt;
import com.tinder.model.SparksEvent;
import com.tinder.passport.model.C10043a;
import com.tinder.passport.model.LocationName;
import com.tinder.passport.model.PassportLocation;
import com.tinder.passport.p093d.C3945a;
import com.tinder.utils.RxUtils;
import com.tinder.utils.an;
import com.tinder.utils.at;
import com.tinder.utils.av;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import retrofit2.Response;

public class ActivityPassport extends ActivitySignedInBase implements OnClickListener, OnItemClickListener, OnEditorActionListener {
    @Inject
    /* renamed from: a */
    C3945a f45429a;
    @Inject
    /* renamed from: b */
    ManagerNetwork f45430b;
    @Inject
    /* renamed from: c */
    ManagerAnalytics f45431c;
    @Inject
    /* renamed from: d */
    bt f45432d;
    @Inject
    /* renamed from: e */
    LegacyBreadCrumbTracker f45433e;
    @Inject
    /* renamed from: f */
    C2630h f45434f;
    @Inject
    /* renamed from: g */
    AbTestUtility f45435g;
    /* renamed from: h */
    private FragmentMap f45436h;
    /* renamed from: i */
    private ListView f45437i;
    /* renamed from: j */
    private ProgressBar f45438j;
    /* renamed from: k */
    private View f45439k;
    /* renamed from: l */
    private View f45440l;
    /* renamed from: m */
    private View f45441m;
    /* renamed from: n */
    private ImageView f45442n;
    /* renamed from: o */
    private ImageView f45443o;
    /* renamed from: p */
    private EditText f45444p;
    /* renamed from: q */
    private C6176d f45445q;
    /* renamed from: r */
    private TransitionDrawable f45446r;
    /* renamed from: s */
    private boolean f45447s;
    /* renamed from: t */
    private List<PassportLocation> f45448t;
    /* renamed from: u */
    private boolean f45449u;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ManagerApp.e().inject(this);
        overridePendingTransition(R.anim.slide_up_fifty_percent_to_default, R.anim.slide_down_five_percent_from_default);
        setContentView(R.layout.view_activity_passport);
        i();
        this.f45439k = findViewById(R.id.view_back_icon);
        this.f45441m = findViewById(R.id.imageView_icon);
        this.f45442n = (ImageView) findViewById(R.id.actionbar_mylocation);
        this.f45440l = findViewById(R.id.passport_search_layout);
        this.f45438j = (ProgressBar) findViewById(R.id.passport_search_progress);
        this.f45440l = findViewById(R.id.passport_search_layout);
        this.f45444p = (EditText) findViewById(R.id.passport_edittext_search);
        this.f45443o = (ImageView) findViewById(R.id.maps_search_icon);
        bundle = findViewById(R.id.maps_search_underline);
        this.f45436h = (FragmentMap) getSupportFragmentManager().a(R.id.fragment_map);
        this.f45437i = (ListView) findViewById(R.id.passport_search_list);
        this.f45437i.setOnItemClickListener(this);
        this.f45445q = new C6176d();
        this.f45437i.setAdapter(this.f45445q);
        this.f45443o.setOnClickListener(this);
        this.f45439k.setOnClickListener(this);
        this.f45441m.setOnClickListener(this);
        this.f45442n.setOnClickListener(this);
        this.f45440l.setOnClickListener(this);
        this.f45438j.setOnClickListener(this);
        this.f45444p.setOnEditorActionListener(this);
        this.f45444p.setOnClickListener(this);
        bundle.setOnClickListener(this);
        r0 = new Drawable[2];
        int i = 0;
        r0[0] = C0432b.a(this, R.drawable.passport_search_underline_inactive);
        r0[1] = C0432b.a(this, R.drawable.passport_search_underline_active);
        this.f45446r = new TransitionDrawable(r0);
        this.f45446r.setCrossFadeEnabled(true);
        bundle.setBackground(this.f45446r);
        this.f45429a.a().a(RxUtils.a()).a(new C14118a(this), C14119b.f44815a);
        bundle = this.f45432d.m40515a("android.permission.ACCESS_COARSE_LOCATION");
        ImageView imageView = this.f45442n;
        if (bundle == null) {
            i = 8;
        }
        imageView.setVisibility(i);
        getWindow().setSoftInputMode(3);
    }

    /* renamed from: a */
    final /* synthetic */ void m54573a(Response response) {
        this.f45448t = ((C10043a) response.body()).m41094a();
    }

    public void onResume() {
        super.onResume();
        this.f45433e.m40474a((Activity) this);
    }

    public void onPause() {
        av.a(this.f45444p.getWindowToken(), this);
        super.onPause();
    }

    public void onItemClick(@NonNull AdapterView<?> adapterView, View view, int i, long j) {
        AsyncTask.execute(new C10033c(this, i));
        m54571q();
        adapterView.postDelayed(new C10034d(this, i), 350);
    }

    /* renamed from: c */
    final /* synthetic */ void m54577c(int i) {
        PassportLocation passportLocation = (PassportLocation) this.f45445q.getItem(i);
        SparksEvent sparksEvent = new SparksEvent("Passport.MapSearchSelect");
        sparksEvent.put("searched", (String) passportLocation.getLabels().first);
        sparksEvent.put("method", "TAP");
        sparksEvent.put("popular", this.f45449u);
        this.f45431c.m40477a(sparksEvent);
    }

    /* renamed from: b */
    final /* synthetic */ void m54574b(int i) {
        this.f45436h.m53697a((PassportLocation) this.f45445q.getItem(i));
    }

    /* renamed from: p */
    private void m54570p() {
        this.f45447s = true;
        this.f45443o.animate().alpha(1.0f).setDuration(150).start();
        this.f45441m.animate().alpha(0.7f).setDuration(150).start();
        this.f45442n.animate().alpha(0.7f).setDuration(150).start();
        this.f45439k.animate().alpha(0.7f).setDuration(150).start();
        this.f45445q.a(this.f45448t);
        this.f45449u = true;
        this.f45440l.setAlpha(0.0f);
        this.f45440l.animate().setDuration(135).alpha(1.0f).setListener(new an(this) {
            /* renamed from: b */
            final /* synthetic */ ActivityPassport f39636b;

            public void onAnimationStart(Animator animator) {
                this.f39636b.f45440l.setVisibility(0);
                this.f39636b.f45446r.startTransition(150);
            }

            public void onAnimationEnd(Animator animator) {
                this.f39636b.f45444p.setFocusableInTouchMode(true);
                this.f39636b.f45444p.requestFocus();
                this.f39636b.f45444p.setCursorVisible(true);
                this.f39636b.f45444p.postDelayed(new C10037i(this, this), 200);
            }

            /* renamed from: a */
            final /* synthetic */ void m48449a(Context context) {
                av.a(context, this.f39636b.f45444p);
            }
        }).start();
        this.f45445q.notifyDataSetChanged();
    }

    /* renamed from: q */
    private void m54571q() {
        this.f45447s = false;
        m54579d();
        this.f45443o.animate().alpha(0.7f).setDuration(150).start();
        this.f45441m.animate().alpha(1.0f).setDuration(150).start();
        this.f45442n.animate().alpha(1.0f).setDuration(150).start();
        this.f45439k.animate().alpha(1.0f).setDuration(150).start();
        this.f45440l.animate().alpha(0.0f).setDuration(150).setListener(new an(this) {
            /* renamed from: b */
            final /* synthetic */ ActivityPassport f39638b;

            public void onAnimationStart(Animator animator) {
                this.f39638b.f45446r.reverseTransition(150);
                this.f39638b.f45444p.setText("");
                this.f39638b.f45444p.clearFocus();
                this.f39638b.f45444p.setCursorVisible(false);
                this.f39638b.f45436h.getView().requestFocus();
            }

            public void onAnimationEnd(Animator animator) {
                this.f39638b.f45440l.setVisibility(4);
                av.a(this.f39638b.f45444p.getWindowToken(), this);
            }
        }).start();
        this.f45438j.setVisibility(4);
    }

    /* renamed from: d */
    public void m54579d() {
        this.f45430b.cancelRequestsWithTag("passport_search");
    }

    /* renamed from: a */
    private void m54565a(@NonNull String str) {
        if (str.toLowerCase().contains("where is uncle jon")) {
            str = new PassportLocation();
            LocationName locationName = new LocationName();
            locationName.mLongName = "Disneyland";
            str.setState(locationName);
            locationName = new LocationName();
            locationName.mLongName = "California";
            locationName.mShortName = "\"Indeed...\"";
            str.setCountry(locationName);
            str.setLatitude(33.811113d);
            str.setLongitude(-117.921584d);
            List arrayList = new ArrayList(1);
            arrayList.add(str);
            m54576b(arrayList);
            return;
        }
        str = str.trim();
        if (!TextUtils.isEmpty(str)) {
            this.f45449u = false;
            this.f45445q.a();
            this.f45438j.setVisibility(0);
            m54579d();
            this.f45429a.a(str, "passport_search").a(RxUtils.a()).a(new C14120e(this), new C14121f(this));
        }
    }

    /* renamed from: c */
    final /* synthetic */ void m54578c(List list) {
        m54576b(list);
    }

    /* renamed from: b */
    final /* synthetic */ void m54575b(Throwable th) {
        m54580e();
    }

    /* renamed from: a */
    public void m54572a(@Nullable PassportLocation passportLocation) {
        if (passportLocation != null && passportLocation.hasGeoData()) {
            Intent intent = new Intent();
            intent.putExtra("tinderlocation", passportLocation);
            setResult(-1, intent);
            finish();
        }
    }

    /* renamed from: b */
    public void m54576b(@NonNull List<PassportLocation> list) {
        if (this.f45447s) {
            this.f45445q.a(list);
            this.f45445q.notifyDataSetChanged();
        }
        this.f45438j.setVisibility(4);
        if (list.isEmpty() != null) {
            at.a(this, R.string.no_location_found);
        }
    }

    /* renamed from: e */
    public void m54580e() {
        this.f45438j.setVisibility(4);
        at.a(this, R.string.no_location_found);
    }

    public void onBackPressed() {
        if (this.f45447s) {
            m54571q();
        } else {
            super.onBackPressed();
        }
    }

    public boolean onEditorAction(@NonNull TextView textView, int i, @NonNull KeyEvent keyEvent) {
        if (i == 3) {
            m54565a(textView.getText().toString());
            av.a(this.f45444p.getWindowToken(), this);
            return true;
        }
        if (keyEvent.getKeyCode() == 4) {
            onBackPressed();
        }
        return null;
    }

    public void onClick(@NonNull View view) {
        switch (view.getId()) {
            case R.id.actionbar_mylocation:
                if (this.f45447s != null) {
                    this.f45442n.post(new C10035g(this));
                }
                this.f45442n.post(new C10036h(this));
                return;
            case R.id.imageView_icon:
                onBackPressed();
                return;
            case R.id.maps_search_icon:
            case R.id.maps_search_underline:
            case R.id.passport_edittext_search:
                if (this.f45447s != null) {
                    av.a(this, this.f45444p);
                    return;
                } else {
                    m54570p();
                    return;
                }
            case R.id.passport_search_layout:
            case R.id.passport_search_progress:
                m54571q();
                return;
            case R.id.view_back_icon:
            case R.id.view_back_title:
                onBackPressed();
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    final /* synthetic */ void m54582g() {
        m54571q();
    }

    /* renamed from: f */
    final /* synthetic */ void m54581f() {
        this.f45436h.m53698b();
    }
}
