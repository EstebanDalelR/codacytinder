package com.tinder.places.settings.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.places.settings.view.PlacesDisabledSurveyView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0015"}, d2 = {"Lcom/tinder/places/settings/activity/PlacesDisabledSurveyActivity;", "Lcom/tinder/base/ActivitySignedInBase;", "()V", "onActivityResult", "", "requestCode", "", "responseCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesDisabledSurveyActivity extends ActivitySignedInBase {
    /* renamed from: a */
    public static final C10289a f45450a = new C10289a();
    /* renamed from: b */
    private HashMap f45451b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/settings/activity/PlacesDisabledSurveyActivity$Companion;", "", "()V", "startIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.activity.PlacesDisabledSurveyActivity$a */
    public static final class C10289a {
        private C10289a() {
        }

        @NotNull
        /* renamed from: a */
        public final Intent m41679a(@NotNull Context context) {
            C2668g.b(context, "context");
            return new Intent(context, PlacesDisabledSurveyActivity.class);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.activity.PlacesDisabledSurveyActivity$b */
    static final class C10290b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlacesDisabledSurveyActivity f33428a;

        C10290b(PlacesDisabledSurveyActivity placesDisabledSurveyActivity) {
            this.f33428a = placesDisabledSurveyActivity;
        }

        public final void onClick(View view) {
            this.f33428a.onBackPressed();
        }
    }

    /* renamed from: b */
    public View m54583b(int i) {
        if (this.f45451b == null) {
            this.f45451b = new HashMap();
        }
        View view = (View) this.f45451b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45451b.put(Integer.valueOf(i), view);
        return view;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_places_disabled_survey);
        bundle = ((PlacesDisabledSurveyView) m54583b(C6248a.placesDisabledSurveyView)).findViewById(R.id.placesDisabledSurveyToolbar);
        C2668g.a(bundle, "placesDisabledSurveyView…cesDisabledSurveyToolbar)");
        Toolbar toolbar = (Toolbar) bundle;
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new C10290b(this));
        bundle = getSupportActionBar();
        if (bundle != null) {
            bundle.setTitle(R.string.places_feedback);
        }
    }

    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
        getMenuInflater().inflate(R.menu.places_disabled_survey_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        C2668g.b(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_places_disabled_survey_cancel) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (i == 0) {
            setResult(-1);
            finish();
        }
    }
}
