package com.tinder.fragments;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.m4b.maps.CameraUpdateFactory;
import com.google.android.m4b.maps.GoogleMap;
import com.google.android.m4b.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.m4b.maps.GoogleMap.OnMapClickListener;
import com.google.android.m4b.maps.GoogleMap.OnMarkerDragListener;
import com.google.android.m4b.maps.SupportMapFragment;
import com.google.android.m4b.maps.UiSettings;
import com.google.android.m4b.maps.model.BitmapDescriptorFactory;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.Marker;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.tinder.R;
import com.tinder.adapters.C7291e;
import com.tinder.api.ManagerNetwork;
import com.tinder.listeners.ListenerMapMarkerSearch;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.model.SparksEvent;
import com.tinder.passport.activities.ActivityPassport;
import com.tinder.passport.model.PassportLocation;
import com.tinder.passport.p093d.C3945a;
import com.tinder.utils.LatLngInterpolator;
import com.tinder.utils.LatLngInterpolator.C17229a;
import com.tinder.utils.an;
import com.tinder.utils.at;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class FragmentMap extends SupportMapFragment implements OnInfoWindowClickListener, OnMapClickListener, OnMarkerDragListener, ListenerMapMarkerSearch {
    @Inject
    /* renamed from: a */
    C3945a f44443a;
    @Inject
    /* renamed from: b */
    ManagerFusedLocation f44444b;
    @Inject
    /* renamed from: c */
    ManagerNetwork f44445c;
    @Inject
    /* renamed from: d */
    ManagerAnalytics f44446d;
    @Inject
    /* renamed from: e */
    LegacyBreadCrumbTracker f44447e;
    /* renamed from: f */
    private GoogleMap f44448f;
    /* renamed from: g */
    private LatLngInterpolator f44449g;
    /* renamed from: h */
    private C7291e f44450h;
    /* renamed from: i */
    private List<Marker> f44451i;

    public void onMarkerDrag(Marker marker) {
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ManagerApp.e().inject(this);
    }

    public void onResume() {
        super.onResume();
        this.f44447e.m40475a((Fragment) this);
        m53693e();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m53692d();
    }

    /* renamed from: d */
    private void m53692d() {
        m53693e();
        this.f44449g = new C17229a();
        this.f44448f = a();
        this.f44448f.a(3);
        UiSettings c = this.f44448f.c();
        c.b(true);
        c.a(false);
        c.c(true);
        this.f44448f.a(this);
        this.f44448f.a(this);
        this.f44448f.a(this);
        this.f44451i = new ArrayList();
        this.f44450h = new C7291e(getContext());
        this.f44448f.a(this.f44450h);
    }

    /* renamed from: e */
    private void m53693e() {
        if (this.f44448f == null) {
            this.f44448f = ((SupportMapFragment) ((AppCompatActivity) getActivity()).getSupportFragmentManager().a(R.id.fragment_map)).a();
        }
    }

    /* renamed from: b */
    public void m53698b() {
        final double d = this.f44444b.d();
        final double e = this.f44444b.e();
        LatLng latLng = new LatLng(d, e);
        AsyncTask.execute(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ FragmentMap f32152c;

            public void run() {
                SparksEvent sparksEvent = new SparksEvent("Passport.MapPinDrop");
                sparksEvent.put("pinLat", d);
                sparksEvent.put("pinLon", e);
                sparksEvent.put("myLocation", true);
                this.f32152c.f44446d.m40477a(sparksEvent);
            }
        });
        m53695a(latLng, 400, true);
        this.f44443a.a(latLng.latitude, latLng.longitude, this, m53694a(latLng, true));
    }

    /* renamed from: a */
    public void m53695a(LatLng latLng, int i, boolean z) {
        if (!z || this.f44448f.b().zoom >= true) {
            latLng = CameraUpdateFactory.a(latLng);
        } else {
            latLng = CameraUpdateFactory.a(latLng, 10.0f);
        }
        this.f44448f.a(latLng, i, null);
    }

    /* renamed from: a */
    public void m53697a(@NonNull final PassportLocation passportLocation) {
        final LatLng latLng = new LatLng(passportLocation.getLatitude(), passportLocation.getLongitude());
        m53695a(latLng, 850, true);
        new Handler().postDelayed(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ FragmentMap f32155c;

            public void run() {
                this.f32155c.m53696a(this.f32155c.m53694a(latLng, false), passportLocation);
            }
        }, 850);
    }

    /* renamed from: a */
    public Marker m53694a(final LatLng latLng, boolean z) {
        m53699c();
        Point a = this.f44448f.d().a(latLng);
        a.y = 0;
        final LatLng a2 = this.f44448f.d().a(a);
        if (z) {
            z = this.f44448f.a(m53690a(a2));
            this.f44451i.add(z);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            valueAnimator.setDuration(240);
            valueAnimator.addUpdateListener(new AnimatorUpdateListener(this) {
                /* renamed from: d */
                final /* synthetic */ FragmentMap f32159d;

                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    z.a(this.f32159d.f44449g.interpolate(valueAnimator.getAnimatedFraction(), a2, latLng));
                }
            });
            valueAnimator.addListener(new an(this) {
                /* renamed from: b */
                final /* synthetic */ FragmentMap f38628b;

                public void onAnimationEnd(Animator animator) {
                    z.a(true);
                    z.d();
                }
            });
            valueAnimator.start();
            return z;
        }
        latLng = this.f44448f.a(m53690a(latLng));
        this.f44451i.add(latLng);
        latLng.a(true);
        return latLng;
    }

    /* renamed from: a */
    public void m53696a(@Nullable Marker marker, PassportLocation passportLocation) {
        if (marker != null && this.f44451i.contains(marker)) {
            this.f44450h.a(marker, passportLocation);
            if (marker.c() != null) {
                marker.d();
            }
        }
    }

    /* renamed from: a */
    private MarkerOptions m53690a(LatLng latLng) {
        return new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.a(R.drawable.passport_map_location_marker));
    }

    public void onInfoWindowClick(@NonNull Marker marker) {
        PassportLocation a = this.f44450h.a(marker);
        if (a.getCountryShort() == null || !a.getCountryShort().equals("\"Indeed...\"")) {
            final LatLng b = marker.b();
            AsyncTask.execute(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ FragmentMap f32161b;

                public void run() {
                    SparksEvent sparksEvent = new SparksEvent("Passport.PinSelect");
                    sparksEvent.put("newLat", b.latitude);
                    sparksEvent.put("newLon", b.longitude);
                    this.f32161b.f44446d.m40477a(sparksEvent);
                }
            });
            ((ActivityPassport) getActivity()).m54572a(this.f44450h.a(marker));
            return;
        }
        at.b(getActivity(), "\"Indeed...\"");
    }

    public void onMapClick(@NonNull final LatLng latLng) {
        AsyncTask.execute(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ FragmentMap f32163b;

            public void run() {
                SparksEvent sparksEvent = new SparksEvent("Passport.MapPinDrop");
                sparksEvent.put("pinLat", latLng.latitude);
                sparksEvent.put("pinLon", latLng.longitude);
                sparksEvent.put("myLocation", false);
                this.f32163b.f44446d.m40477a(sparksEvent);
            }
        });
        m53695a(latLng, 400, false);
        this.f44443a.a(latLng.latitude, latLng.longitude, this, m53694a(latLng, true));
    }

    public void onMarkerDragStart(@NonNull Marker marker) {
        marker.e();
    }

    public void onMarkerDragEnd(@NonNull Marker marker) {
        LatLng b = marker.b();
        m53695a(b, Callback.DEFAULT_DRAG_ANIMATION_DURATION, false);
        this.f44450h.b(marker);
        marker.d();
        this.f44443a.a(b.latitude, b.longitude, this, marker);
    }

    public void onLocationMarkerResult(PassportLocation passportLocation, Marker marker) {
        m53696a(marker, passportLocation);
    }

    public void onLocationMarkerError(Marker marker) {
        m53696a(marker, new PassportLocation());
    }

    /* renamed from: c */
    public void m53699c() {
        for (Marker marker : this.f44451i) {
            marker.a();
            this.f44445c.cancelRequestsWithTag(marker);
        }
        this.f44451i.clear();
        this.f44450h.a();
    }
}
