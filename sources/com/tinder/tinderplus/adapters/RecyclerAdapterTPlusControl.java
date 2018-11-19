package com.tinder.tinderplus.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.boost.p178a.C10400d;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.bk;
import com.tinder.model.SparksEvent;
import com.tinder.passport.model.PassportLocation;
import com.tinder.passport.p093d.C3945a;
import com.tinder.passport.p300a.C10032a;
import com.tinder.passport.p300a.C10032a.C10031a;
import com.tinder.paywall.p305d.C10057a;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.activities.ActivityTPlusControl;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.ad;
import com.tinder.views.FeatureCheckedView;
import com.tinder.views.FeatureRow.FeatureInteractionListener;
import com.tinder.views.FeatureToggleView;
import com.tinder.views.LinearAdapterLayout;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.inject.Inject;

public class RecyclerAdapterTPlusControl extends Adapter<ViewHolder> {
    @Inject
    /* renamed from: a */
    C3945a f52180a;
    @Inject
    /* renamed from: b */
    bk f52181b;
    @Inject
    /* renamed from: c */
    ManagerAnalytics f52182c;
    @Inject
    /* renamed from: d */
    C10400d f52183d;
    @Inject
    /* renamed from: e */
    C15071e f52184e;
    @Inject
    /* renamed from: f */
    C15193i f52185f;
    @Inject
    /* renamed from: g */
    C10057a f52186g;
    /* renamed from: h */
    private final WeakReference<ActivityTPlusControl> f52187h;
    /* renamed from: i */
    private Context f52188i;
    /* renamed from: j */
    private Resources f52189j;
    /* renamed from: k */
    private LayoutInflater f52190k;
    /* renamed from: l */
    private List<String> f52191l;
    /* renamed from: m */
    private boolean f52192m;
    /* renamed from: n */
    private FeatureInteractionListener f52193n;
    /* renamed from: o */
    private long f52194o;

    public static class PassportViewHolder extends ViewHolder {
        @BindView(2131362272)
        TextView mCurrentLocation;
        @BindView(2131362488)
        TextView mDescription;
        @BindView(2131362491)
        ImageView mIcon;
        @BindView(2131363118)
        TextView mLocation;
        @BindView(2131362273)
        ViewGroup mLocationsContainer;
        @BindView(2131362980)
        TextView mMyCurrentLocation;
        @BindView(2131363119)
        ViewGroup mPassportContainer;
        @BindView(2131363121)
        public LinearAdapterLayout mRecentPassportList;
        @BindView(2131362495)
        TextView mTitle;

        public PassportViewHolder(View view) {
            super(view);
            ButterKnife.a(this, view);
        }
    }

    public class PassportViewHolder_ViewBinding implements Unbinder {
        /* renamed from: b */
        private PassportViewHolder f52177b;

        @UiThread
        public PassportViewHolder_ViewBinding(PassportViewHolder passportViewHolder, View view) {
            this.f52177b = passportViewHolder;
            passportViewHolder.mTitle = (TextView) C0761c.b(view, R.id.feature_title, "field 'mTitle'", TextView.class);
            passportViewHolder.mDescription = (TextView) C0761c.b(view, R.id.feature_description, "field 'mDescription'", TextView.class);
            passportViewHolder.mIcon = (ImageView) C0761c.b(view, R.id.feature_icon, "field 'mIcon'", ImageView.class);
            passportViewHolder.mLocationsContainer = (ViewGroup) C0761c.b(view, R.id.current_location_container, "field 'mLocationsContainer'", ViewGroup.class);
            passportViewHolder.mPassportContainer = (ViewGroup) C0761c.b(view, R.id.passport_container, "field 'mPassportContainer'", ViewGroup.class);
            passportViewHolder.mLocation = (TextView) C0761c.b(view, R.id.passportLocation, "field 'mLocation'", TextView.class);
            passportViewHolder.mMyCurrentLocation = (TextView) C0761c.b(view, R.id.my_current_location, "field 'mMyCurrentLocation'", TextView.class);
            passportViewHolder.mCurrentLocation = (TextView) C0761c.b(view, R.id.current_location, "field 'mCurrentLocation'", TextView.class);
            passportViewHolder.mRecentPassportList = (LinearAdapterLayout) C0761c.b(view, R.id.passport_recents_list, "field 'mRecentPassportList'", LinearAdapterLayout.class);
        }

        @CallSuper
        public void unbind() {
            PassportViewHolder passportViewHolder = this.f52177b;
            if (passportViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f52177b = null;
            passportViewHolder.mTitle = null;
            passportViewHolder.mDescription = null;
            passportViewHolder.mIcon = null;
            passportViewHolder.mLocationsContainer = null;
            passportViewHolder.mPassportContainer = null;
            passportViewHolder.mLocation = null;
            passportViewHolder.mMyCurrentLocation = null;
            passportViewHolder.mCurrentLocation = null;
            passportViewHolder.mRecentPassportList = null;
        }
    }

    /* renamed from: com.tinder.tinderplus.adapters.RecyclerAdapterTPlusControl$a */
    public static class C16931a extends ViewHolder {
        /* renamed from: a */
        FeatureCheckedView f52178a;

        public C16931a(FeatureCheckedView featureCheckedView) {
            super(featureCheckedView);
            this.f52178a = featureCheckedView;
        }
    }

    /* renamed from: com.tinder.tinderplus.adapters.RecyclerAdapterTPlusControl$b */
    public static class C16932b extends ViewHolder {
        /* renamed from: a */
        FeatureToggleView f52179a;

        public C16932b(FeatureToggleView featureToggleView) {
            super(featureToggleView);
            this.f52179a = featureToggleView;
        }
    }

    /* renamed from: com.tinder.tinderplus.adapters.RecyclerAdapterTPlusControl$c */
    public static class C16933c extends ViewHolder {
        public C16933c(View view) {
            super(view);
        }
    }

    public RecyclerAdapterTPlusControl(@NonNull ActivityTPlusControl activityTPlusControl, @NonNull Context context, @NonNull List<String> list, boolean z, FeatureInteractionListener featureInteractionListener) {
        this.f52187h = new WeakReference(activityTPlusControl);
        this.f52188i = context;
        this.f52191l = list;
        this.f52192m = z;
        this.f52190k = LayoutInflater.from(context);
        this.f52193n = featureInteractionListener;
        this.f52189j = context.getResources();
        ManagerApp.e().inject(this);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new PassportViewHolder(this.f52190k.inflate(R.layout.passport_feature, viewGroup, false));
        }
        if (i == 2) {
            return new C16931a(new FeatureCheckedView(this.f52188i));
        }
        if (i == 1) {
            return new C16932b(new FeatureToggleView(this.f52188i));
        }
        return i == 3 ? new C16933c(this.f52190k.inflate(R.layout.get_consumable_view, viewGroup, false)) : 0;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        int i2 = i;
        switch (getItemViewType(i2)) {
            case 0:
                String str = (String) r0.f52191l.get(i2);
                PassportViewHolder passportViewHolder = (PassportViewHolder) viewHolder;
                passportViewHolder.mTitle.setText(r0.f52189j.getString(R.string.passport_feature_title));
                passportViewHolder.mDescription.setText(r0.f52189j.getString(R.string.passport_feature_description));
                passportViewHolder.mIcon.setImageDrawable(r0.f52189j.getDrawable(R.drawable.passport_to_any_location));
                passportViewHolder.mLocationsContainer.setOnClickListener(new C15198a(r0, passportViewHolder));
                passportViewHolder.mPassportContainer.getLayoutTransition().setInterpolator(0, new OvershootInterpolator());
                PassportLocation b = r0.f52180a.b();
                BaseAdapter c10032a = new C10032a(r0.f52188i, r0.f52180a.a(4));
                c10032a.a(b);
                C10031a c10031a = new C10031a();
                View inflate = LayoutInflater.from(r0.f52188i).inflate(R.layout.cell_recent_passport, passportViewHolder.mRecentPassportList, false);
                c10031a.f32917c = (ImageView) inflate.findViewById(R.id.purchased_location_img);
                c10031a.f32917c.setImageResource(R.drawable.settings_passport_current_location);
                c10031a.f32917c.setColorFilter(C10032a.f32919a);
                passportViewHolder.mRecentPassportList.setHeader(inflate);
                c10031a.f32915a = (TextView) inflate.findViewById(R.id.purchased_location_name);
                c10031a.f32915a.setText(R.string.my_current_location);
                c10031a.f32918d = (ImageView) inflate.findViewById(R.id.purchased_location_check);
                inflate = LayoutInflater.from(r0.f52188i).inflate(R.layout.cell_recent_passport, passportViewHolder.mRecentPassportList, false);
                inflate.setTag("footer");
                inflate.setBackgroundResource(R.drawable.rounded_rectangle_white);
                ((ImageView) inflate.findViewById(R.id.purchased_location_img)).setVisibility(4);
                TextView textView = (TextView) inflate.findViewById(R.id.purchased_location_name);
                textView.setText(R.string.add_a_new_location);
                textView.setTextColor(C0432b.b(r0.f52188i, R.color.selector_premium_blue_text));
                passportViewHolder.mRecentPassportList.setFooter(inflate);
                passportViewHolder.mRecentPassportList.setOnClickListenerForItems(new C15199b(r0, passportViewHolder, c10032a, c10031a));
                passportViewHolder.mRecentPassportList.setAdapter(c10032a);
                if (b == null) {
                    passportViewHolder.mMyCurrentLocation.setText(R.string.my_current_location);
                    passportViewHolder.mCurrentLocation.setVisibility(8);
                    c10031a.f32918d.setVisibility(0);
                    c10031a.f32917c.setColorFilter(C10032a.f32919a);
                    return;
                }
                passportViewHolder.mMyCurrentLocation.setText(R.string.my_current_location);
                passportViewHolder.mCurrentLocation.setText(b.getDisplayLabel());
                c10031a.f32917c.setColorFilter(C10032a.f32920b);
                return;
            case 1:
                String str2 = (String) r0.f52191l.get(i2);
                C16932b c16932b = (C16932b) viewHolder;
                if (str2.equals("your_profile")) {
                    c16932b.f52179a.m57859a(r0.f52189j.getString(R.string.control_your_profile_title), r0.f52189j.getString(R.string.control_your_profile_description), R.drawable.control_your_profile, r0.f52192m, r0.f52193n, str2);
                    c16932b.f52179a.m57860a(r0.f52189j.getString(R.string.control_your_profile_feature_one_title), "", r0.f52181b.Q(), ManagerWebServices.PARAM_HIDE_AGE, r0.f52192m);
                    c16932b.f52179a.m57864b(r0.f52189j.getString(R.string.control_your_profile_feature_two_title), "", r0.f52181b.R(), ManagerWebServices.PARAM_HIDE_DISTANCE, r0.f52192m);
                    return;
                } else if (str2.equals("unlimited_swipes")) {
                    c16932b.f52179a.m57859a(r0.f52189j.getString(R.string.unlimited_swipes_title), r0.f52189j.getString(R.string.unlimited_swipes_description), R.drawable.unlimited_right_swipes, r0.f52192m, r0.f52193n, str2);
                    c16932b.f52179a.m57860a(r0.f52189j.getString(R.string.unlimited_swipes_feature_title), r0.f52189j.getString(R.string.unlimited_swipes_feature_description), r0.f52192m, "", false);
                    return;
                } else if (str2.equals("super_like")) {
                    c16932b.f52179a.m57859a(r0.f52189j.getString(R.string.extra_super_likes_title), r0.f52186g.a(R.plurals.superlike_upsell_merch_header_description, r0.f52184e.m56818b()), R.drawable.extra_super_likes, r0.f52192m, r0.f52193n, str2);
                    c16932b.f52179a.m57860a(r0.f52189j.getString(R.string.extra_super_like_feature_title), r0.f52186g.a(R.plurals.superlike_upsell_merch_feature_description, r0.f52184e.m56818b()), r0.f52192m, "", false);
                    return;
                } else if (str2.equals("undo")) {
                    c16932b.f52179a.m57859a(r0.f52189j.getString(R.string.rewind_title), r0.f52189j.getString(R.string.rewind_description), R.drawable.rewind_last_swipe, r0.f52192m, r0.f52193n, str2);
                    c16932b.f52179a.m57860a(r0.f52189j.getString(R.string.rewind_feature_title), r0.f52189j.getString(R.string.rewind_feature_description), r0.f52192m, "", false);
                    return;
                } else if (str2.equals(ManagerWebServices.PARAM_HIDE_ADS)) {
                    c16932b.f52179a.m57859a(r0.f52189j.getString(R.string.hide_ads_title), r0.f52189j.getString(R.string.hide_ads_description), R.drawable.hide_ads, r0.f52192m, r0.f52193n, str2);
                    c16932b.f52179a.m57861a(r0.f52189j.getString(R.string.hide_ads_feature_title), r0.f52192m, ManagerWebServices.PARAM_HIDE_ADS, false);
                    return;
                } else if (str2.equals(ManagerWebServices.PARAM_BOOST)) {
                    c16932b.f52179a.m57859a(r0.f52189j.getString(R.string.boost_title), String.format(r0.f52189j.getString(R.string.boost_description), new Object[]{Integer.valueOf(r0.f52183d.g())}), R.drawable.boost_feature_icon, r0.f52192m, r0.f52193n, str2);
                    c16932b.f52179a.m57860a(r0.f52189j.getString(R.string.boost_feature_title), r0.f52186g.a(R.string.boost_feature_description_upsell, r0.f52183d.e()), r0.f52192m, "", false);
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) r0.f52191l.get(i2);
                C16931a c16931a = (C16931a) viewHolder;
                if (str3.equals("who_you_see")) {
                    c16931a.f52178a.m57847a(r0.f52189j.getString(R.string.who_you_see_title), r0.f52189j.getString(R.string.who_you_see_description), R.drawable.control_who_you_see, r0.f52192m, r0.f52193n, str3);
                    c16931a.f52178a.m57848a(r0.f52189j.getString(R.string.who_you_see_feature_one_title), r0.f52189j.getString(R.string.who_you_see_feature_one_description), "optimal");
                    c16931a.f52178a.m57850b(r0.f52189j.getString(R.string.who_you_see_feature_three_title), r0.f52189j.getString(R.string.who_you_see_feature_three_description), "recency");
                    c16931a.f52178a.setFeatureChecked(r0.f52181b.N());
                    return;
                } else if (str3.equals("who_sees_you")) {
                    c16931a.f52178a.m57847a(r0.f52189j.getString(R.string.who_sees_you_title), r0.f52189j.getString(R.string.who_sees_you_description), R.drawable.control_who_sees_you, r0.f52192m, r0.f52193n, str3);
                    c16931a.f52178a.m57848a(r0.f52189j.getString(R.string.who_sees_you_feature_one_title), r0.f52189j.getString(R.string.who_sees_you_feature_one_description), "everyone");
                    c16931a.f52178a.m57850b(r0.f52189j.getString(R.string.who_sees_you_feature_two_title), r0.f52189j.getString(R.string.who_sees_you_feature_two_description), "liked");
                    c16931a.f52178a.setFeatureChecked(r0.f52181b.O());
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m62601a(PassportViewHolder passportViewHolder, View view) {
        if (this.f52192m) {
            passportViewHolder.mMyCurrentLocation.setVisibility(4);
            passportViewHolder.mRecentPassportList.setVisibility(0);
            if (passportViewHolder.mCurrentLocation.getVisibility() == null) {
                passportViewHolder.mCurrentLocation.setVisibility(4);
            } else {
                passportViewHolder.mCurrentLocation.setVisibility(8);
            }
            passportViewHolder.mLocationsContainer.setClickable(false);
            return;
        }
        this.f52193n.onFeatureRowClick(view);
    }

    /* renamed from: a */
    final /* synthetic */ void m62602a(PassportViewHolder passportViewHolder, C10032a c10032a, C10031a c10031a, View view) {
        int indexOfChild = passportViewHolder.mRecentPassportList.indexOfChild(view);
        view = (view.getTag() == null || view.getTag().equals("footer") == null) ? null : true;
        ad.a();
        if (view != null) {
            if (SystemClock.elapsedRealtime() - this.f52194o >= 1000) {
                this.f52194o = SystemClock.elapsedRealtime();
                ((ActivityTPlusControl) this.f52187h.get()).m68735d();
            }
        } else if (indexOfChild == 0) {
            c10032a.a(null);
            c10031a.f32918d.setVisibility(0);
            c10031a.f32917c.setColorFilter(C10032a.f32919a);
            c10032a = this.f52188i.getResources().getString(R.string.my_current_location);
            c10031a = new SparksEvent("Passport.MenuMyLocation");
            c10031a.put(ManagerWebServices.PARAM_FROM, 2);
            this.f52182c.a(c10031a);
            this.f52180a.c();
            passportViewHolder.mCurrentLocation.setText(c10032a);
        } else {
            PassportLocation passportLocation = (PassportLocation) c10032a.getItem(indexOfChild - 1);
            CharSequence displayLabel = passportLocation.getDisplayLabel();
            if (this.f52185f.m57121a()) {
                c10031a.f32918d.setVisibility(4);
                c10031a.f32917c.setColorFilter(C10032a.f32920b);
                passportViewHolder.mCurrentLocation.setText(displayLabel);
                c10032a.a(passportLocation);
                passportViewHolder.mCurrentLocation.setText(displayLabel);
                this.f52180a.d(passportLocation);
            }
            this.f52182c.a(new SparksEvent("Passport.MenuChooseLocation").put("newLat", passportLocation.getLatitude()).put("newLon", passportLocation.getLongitude()));
        }
    }

    public int getItemCount() {
        return this.f52191l.size();
    }

    public int getItemViewType(int i) {
        String str = (String) this.f52191l.get(i);
        if (str.equals("passport")) {
            return 0;
        }
        if (!str.equals("who_sees_you")) {
            if (!str.equals("who_you_see")) {
                return str.equals("consumable_upsell") != 0 ? 3 : 1;
            }
        }
        return 2;
    }
}
