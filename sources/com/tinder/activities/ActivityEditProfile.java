package com.tinder.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import com.facebook.AccessToken;
import com.tinder.R;
import com.tinder.account.photos.component.AccountComponent;
import com.tinder.account.photos.component.AccountComponentProvider;
import com.tinder.account.photos.component.C3891a;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.dialogs.PhotoAccessDialog;
import com.tinder.dialogs.PhotoAccessDialog.C8849a;
import com.tinder.fragments.FragmentEditProfile;
import com.tinder.fragments.FragmentEditProfile.OnPermissionDeniedListener;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.bt;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import java.util.Collections;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

public class ActivityEditProfile extends ActivitySignedInBase implements AccountComponentProvider, OnPermissionDeniedListener {
    /* renamed from: d */
    public static String f29450d = "destination";
    @Inject
    /* renamed from: a */
    bt f29451a;
    @Inject
    /* renamed from: b */
    LegacyBreadCrumbTracker f29452b;
    /* renamed from: c */
    protected FragmentEditProfile f29453c;
    /* renamed from: e */
    private boolean f29454e = false;
    /* renamed from: f */
    private PhotoAccessDialog f29455f;
    /* renamed from: g */
    private PhotoAccessDialog f29456g;

    public enum EditProfileDestination {
        DEFAULT,
        WORK,
        SCHOOL,
        PHOTO,
        INSTAGRAM,
        SPOTIFY,
        ANTHEM
    }

    /* renamed from: a */
    public boolean m35117a() {
        return false;
    }

    /* renamed from: c */
    final /* synthetic */ void m35119c() {
        m35116d();
    }

    @NotNull
    public AccountComponent provideAccountComponent() {
        return C3891a.a().a(((ManagerApp) getApplicationContext()).h()).a();
    }

    /* renamed from: a */
    public static Intent m35114a(@NonNull Context context) {
        return new Intent(context, ActivityEditProfile.class);
    }

    /* renamed from: a */
    public static Intent m35115a(@NonNull Context context, @NonNull EditProfileDestination editProfileDestination) {
        return m35114a(context).putExtra(f29450d, editProfileDestination);
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        AccessToken.refreshCurrentAccessTokenAsync();
        ManagerApp.e().inject(this);
        overridePendingTransition(R.anim.slide_up_fifty_percent_to_default, R.anim.slide_down_five_percent_from_default);
        if (bundle == null) {
            this.f29453c = new FragmentEditProfile();
            bundle = new Bundle();
            if (getIntent().hasExtra("instagramConnectValue")) {
                bundle.putInt("instagramConnectValue", getIntent().getIntExtra("instagramConnectValue", 1));
            }
            EditProfileDestination editProfileDestination = (EditProfileDestination) getIntent().getSerializableExtra(f29450d);
            if (editProfileDestination != null) {
                bundle.putSerializable(f29450d, editProfileDestination);
            }
            this.f29453c.setArguments(bundle);
            a(this.f29453c, "fragment edit profile");
            return;
        }
        this.f29453c = (FragmentEditProfile) getSupportFragmentManager().a("fragment edit profile");
        this.f29454e = bundle.getBoolean("hasaskedphotopermission");
    }

    public void onResume() {
        super.onResume();
        this.f29452b.a(this);
    }

    public void onBackPressed() {
        ad.a();
        this.f29453c.a(true);
    }

    /* renamed from: b */
    public void m35118b() {
        C10076o.a(PlusPaywallSource.EDIT_PROFILE_ACTIVITY).a(Collections.singletonList(Integer.valueOf(3))).a(this);
    }

    public void onExtStorageReadPermissionDenied() {
        if (!this.f29454e) {
            if (this.f29455f == null) {
                this.f29455f = new C8849a(this).a(new C7282g(this)).a();
            }
            this.f29455f.show();
        } else if (!this.f29451a.a()) {
        } else {
            if (ActivityCompat.a(this, "android.permission.READ_EXTERNAL_STORAGE")) {
                if (this.f29456g == null) {
                    this.f29456g = new C8849a(this).a(R.string.photo_runtime_permission_explanation).b(R.drawable.app_permissions).a();
                }
                this.f29456g.show();
                return;
            }
            at.a(this, R.string.photo_runtime_permission_explanation);
        }
    }

    /* renamed from: d */
    private void m35116d() {
        if (this.f29451a.a()) {
            ActivityCompat.a(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
            this.f29454e = true;
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i == 0) {
            if (this.f29451a.a(iArr) != 0) {
                this.f29453c.a();
            } else {
                onExtStorageReadPermissionDenied();
            }
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    protected void onStop() {
        super.onStop();
        if (this.f29455f != null) {
            this.f29455f.dismiss();
        }
        if (this.f29456g != null) {
            this.f29456g.dismiss();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_up_five_percent_to_default, R.anim.slide_down_entirely_from_default);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hasaskedphotopermission", this.f29454e);
    }
}
