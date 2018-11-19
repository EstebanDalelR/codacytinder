package com.tinder.activities;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.C2833m;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.tinder.R;
import com.tinder.events.match.EventViewGiphy;
import com.tinder.fragments.ap;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.module.Default;
import de.greenrobot.event.C2664c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;

public class ActivityGiphy extends AppCompatActivity {
    @Default
    @Inject
    /* renamed from: a */
    C2664c f29421a;
    @Inject
    /* renamed from: b */
    LegacyBreadCrumbTracker f29422b;
    /* renamed from: c */
    private List<String> f29423c;

    /* renamed from: com.tinder.activities.ActivityGiphy$1 */
    class C61551 implements AnimatorListener {
        /* renamed from: a */
        final /* synthetic */ ActivityGiphy f22663a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        C61551(ActivityGiphy activityGiphy) {
            this.f22663a = activityGiphy;
        }

        public void onAnimationEnd(Animator animator) {
            this.f22663a.finish();
        }
    }

    /* renamed from: com.tinder.activities.ActivityGiphy$a */
    private class C7960a extends C2833m {
        /* renamed from: a */
        final /* synthetic */ ActivityGiphy f28572a;

        private C7960a(ActivityGiphy activityGiphy, FragmentManager fragmentManager) {
            this.f28572a = activityGiphy;
            super(fragmentManager);
        }

        /* renamed from: a */
        public Fragment m33820a(int i) {
            Fragment apVar = new ap();
            Bundle bundle = new Bundle();
            bundle.putString("url", (String) this.f28572a.f29423c.get(i));
            apVar.setArguments(bundle);
            return apVar;
        }

        public int getCount() {
            return this.f28572a.f29423c.size();
        }
    }

    /* renamed from: a */
    public static Intent m35089a(Context context, String str) {
        Intent intent = new Intent(context, ActivityGiphy.class);
        intent.putStringArrayListExtra("gifs", new ArrayList(Collections.singletonList(str)));
        intent.putExtra("index", null);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        ManagerApp.e().inject(this);
        overridePendingTransition(R.anim.anim_quick_fade_in, R.anim.anim_quick_fade_out);
        super.onCreate(bundle);
        setContentView(R.layout.activity_giphy);
        this.f29423c = getIntent().getStringArrayListExtra("gifs");
        bundle = getIntent().getIntExtra("index", 0);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_activity_gif);
        viewPager.setAdapter(new C7960a(getSupportFragmentManager()));
        viewPager.setCurrentItem(bundle);
        viewPager.setOffscreenPageLimit(1);
        findViewById(R.id.background).animate().alpha(1.0f);
        this.f29421a.d(new EventViewGiphy());
    }

    protected void onResume() {
        super.onResume();
        this.f29422b.a(this);
    }

    public void onBackPressed() {
        findViewById(R.id.background).animate().alpha(0.0f).setListener(new C61551(this));
    }
}
