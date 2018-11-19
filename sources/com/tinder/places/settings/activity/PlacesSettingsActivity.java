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
import com.tinder.managers.ManagerApp;
import com.tinder.places.injection.PlacesSettingsComponent;
import com.tinder.places.injection.PlacesSettingsComponentProvider;
import com.tinder.places.main.util.PlacesSharedViewInjector;
import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.settings.target.PlacesSettingsActivityTarget;
import com.tinder.places.settings.view.C14342b;
import com.tinder.places.settings.view.PlacesSettingsView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001*B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020!2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0013H\u0016J\b\u0010&\u001a\u00020\u0013H\u0016J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006+"}, d2 = {"Lcom/tinder/places/settings/activity/PlacesSettingsActivity;", "Lcom/tinder/base/ActivitySignedInBase;", "Lcom/tinder/places/injection/PlacesSettingsComponentProvider;", "Lcom/tinder/places/main/util/PlacesSharedViewInjector;", "Lcom/tinder/places/settings/target/PlacesSettingsActivityTarget;", "()V", "component", "Lcom/tinder/places/injection/PlacesSettingsComponent;", "menu", "Landroid/view/Menu;", "<set-?>", "", "source", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "getPlacesSettingsComponent", "hideMenuActions", "", "injectPlacesPinDropView", "placesPinDropView", "Lcom/tinder/places/main/view/PlacesPinDropView;", "onActivityResult", "requestCode", "", "responseCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setMenuActionCancel", "setMenuActionEdit", "setMenuButtonText", "stringResource", "showMenuActions", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesSettingsActivity extends ActivitySignedInBase implements PlacesSettingsComponentProvider, PlacesSharedViewInjector, PlacesSettingsActivityTarget {
    /* renamed from: a */
    public static final C10291a f45452a = new C10291a();
    /* renamed from: b */
    private PlacesSettingsComponent f45453b;
    /* renamed from: c */
    private Menu f45454c;
    @NotNull
    /* renamed from: d */
    private String f45455d;
    /* renamed from: e */
    private HashMap f45456e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/places/settings/activity/PlacesSettingsActivity$Companion;", "", "()V", "EXTRA_SOURCE_KEY", "", "PLACES", "SETTINGS", "startIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "source", "startIntentFromPlaces", "startIntentFromSettings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.activity.PlacesSettingsActivity$a */
    public static final class C10291a {
        private C10291a() {
        }

        /* renamed from: a */
        private final Intent m41680a(Context context, String str) {
            Intent intent = new Intent(context, PlacesSettingsActivity.class);
            intent.putExtra("source", str);
            return intent;
        }

        @NotNull
        /* renamed from: a */
        public final Intent m41681a(@NotNull Context context) {
            C2668g.b(context, "context");
            return m41680a(context, "places");
        }

        @NotNull
        /* renamed from: b */
        public final Intent m41682b(@NotNull Context context) {
            C2668g.b(context, "context");
            return m41680a(context, "settings");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.activity.PlacesSettingsActivity$b */
    static final class C10292b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PlacesSettingsActivity f33429a;

        C10292b(PlacesSettingsActivity placesSettingsActivity) {
            this.f33429a = placesSettingsActivity;
        }

        public final void onClick(View view) {
            this.f33429a.onBackPressed();
        }
    }

    /* renamed from: b */
    public View m54585b(int i) {
        if (this.f45456e == null) {
            this.f45456e = new HashMap();
        }
        View view = (View) this.f45456e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45456e.put(Integer.valueOf(i), view);
        return view;
    }

    public PlacesSettingsActivity() {
        super(true);
    }

    @NotNull
    /* renamed from: d */
    public final String m54586d() {
        String str = this.f45455d;
        if (str == null) {
            C2668g.b("source");
        }
        return str;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getApplicationContext();
        if (bundle == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        bundle = ((ManagerApp) bundle).h().placesSettingsComponentBuilder().placesSettingsActivity(this).build();
        C2668g.a(bundle, "(applicationContext as M…his)\n            .build()");
        this.f45453b = bundle;
        bundle = this.f45453b;
        if (bundle == null) {
            C2668g.b("component");
        }
        bundle.inject(this);
        setContentView(R.layout.activity_places_settings);
        bundle = ((PlacesSettingsView) m54585b(C6248a.placesSettingsView)).findViewById(R.id.placesSettingsToolbar);
        C2668g.a(bundle, "placesSettingsView.findV…id.placesSettingsToolbar)");
        Toolbar toolbar = (Toolbar) bundle;
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new C10292b(this));
        bundle = getSupportActionBar();
        if (bundle != null) {
            bundle.setTitle(R.string.places_settings);
        }
        bundle = getIntent().getStringExtra("source");
        C2668g.a(bundle, "intent.getStringExtra(EXTRA_SOURCE_KEY)");
        this.f45455d = bundle;
    }

    public void setMenuActionCancel() {
        m54584c(R.string.cancel);
    }

    public void setMenuActionEdit() {
        m54584c(R.string.edit);
    }

    public void hideMenuActions() {
        Menu menu = this.f45454c;
        if (menu != null) {
            MenuItem findItem = menu.findItem(R.id.menu_places_edit);
            if (findItem != null) {
                findItem.setVisible(false);
            }
        }
    }

    public void showMenuActions() {
        Menu menu = this.f45454c;
        if (menu != null) {
            MenuItem findItem = menu.findItem(R.id.menu_places_edit);
            if (findItem != null) {
                findItem.setVisible(true);
            }
        }
    }

    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
        getMenuInflater().inflate(R.menu.places_settings_menu, menu);
        this.f45454c = menu;
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        C2668g.b(menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_places_edit) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((PlacesSettingsView) m54585b(C6248a.placesSettingsView)).a();
        return true;
    }

    @NotNull
    public PlacesSettingsComponent getPlacesSettingsComponent() {
        PlacesSettingsComponent placesSettingsComponent = this.f45453b;
        if (placesSettingsComponent == null) {
            C2668g.b("component");
        }
        return placesSettingsComponent;
    }

    /* renamed from: c */
    private final void m54584c(int i) {
        Menu menu = this.f45454c;
        if (menu != null) {
            MenuItem findItem = menu.findItem(R.id.menu_places_edit);
            if (findItem != null) {
                findItem.setTitle(i);
            }
        }
    }

    protected void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (i == 0) {
            new C14342b(this).show();
        }
    }

    public void injectPlacesPinDropView(@NotNull PlacesPinDropView placesPinDropView) {
        C2668g.b(placesPinDropView, "placesPinDropView");
        PlacesSettingsComponent placesSettingsComponent = this.f45453b;
        if (placesSettingsComponent == null) {
            C2668g.b("component");
        }
        placesSettingsComponent.inject(placesPinDropView);
    }
}
