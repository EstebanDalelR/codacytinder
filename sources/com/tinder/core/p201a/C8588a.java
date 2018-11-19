package com.tinder.core.p201a;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.events.EventLocationSet;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.module.Default;
import de.greenrobot.event.C2664c;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
/* renamed from: com.tinder.core.a.a */
public class C8588a {
    @NonNull
    /* renamed from: a */
    private final C19785a<Location> f30351a;

    @Inject
    public C8588a(@NonNull ManagerFusedLocation managerFusedLocation, @Default @NonNull C2664c c2664c) {
        this.f30351a = C19785a.f(managerFusedLocation.c());
        c2664c.a(this);
    }

    @Nullable
    /* renamed from: a */
    public Location m36615a() {
        return (Location) this.f30351a.A();
    }

    /* renamed from: b */
    public Observable<Location> m36617b() {
        return this.f30351a.e();
    }

    /* renamed from: a */
    public void m36616a(@Nullable Location location) {
        if (location != null) {
            Location location2 = (Location) this.f30351a.A();
            if (location2 == null || location.getLatitude() != location2.getLatitude() || location.getLongitude() != location2.getLongitude()) {
                this.f30351a.onNext(location);
            }
        }
    }

    public void onEvent(@NonNull EventLocationSet eventLocationSet) {
        m36616a(eventLocationSet.location());
    }
}
