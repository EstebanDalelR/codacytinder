package com.tinder.places.settings.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.places.settings.view.PlacesSurveyOtherView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/tinder/places/settings/activity/PlacesSurveyOtherActivity;", "Lcom/tinder/base/ActivitySignedInBase;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesSurveyOtherActivity extends ActivitySignedInBase {
    /* renamed from: a */
    public static final C10293a f45457a = new C10293a();
    /* renamed from: b */
    private HashMap f45458b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/places/settings/activity/PlacesSurveyOtherActivity$Companion;", "", "()V", "startIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.activity.PlacesSurveyOtherActivity$a */
    public static final class C10293a {
        private C10293a() {
        }

        @NotNull
        /* renamed from: a */
        public final Intent m41683a(@NotNull Context context) {
            C2668g.b(context, "context");
            return new Intent(context, PlacesSurveyOtherActivity.class);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.activity.PlacesSurveyOtherActivity$b */
    static final class C10294b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlacesSurveyOtherActivity f33430a;

        C10294b(PlacesSurveyOtherActivity placesSurveyOtherActivity) {
            this.f33430a = placesSurveyOtherActivity;
        }

        public final void onClick(View view) {
            this.f33430a.onBackPressed();
        }
    }

    /* renamed from: b */
    public View m54587b(int i) {
        if (this.f45458b == null) {
            this.f45458b = new HashMap();
        }
        View view = (View) this.f45458b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45458b.put(Integer.valueOf(i), view);
        return view;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_places_survey_other);
        bundle = ((PlacesSurveyOtherView) m54587b(C6248a.placesSurveyOtherView)).findViewById(R.id.placesSurveyOtherToolbar);
        C2668g.a(bundle, "placesSurveyOtherView.fi…placesSurveyOtherToolbar)");
        Toolbar toolbar = (Toolbar) bundle;
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new C10294b(this));
        bundle = getSupportActionBar();
        if (bundle != null) {
            bundle.setTitle(R.string.places_feedback);
        }
    }
}
