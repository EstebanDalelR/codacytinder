package com.tinder.places.main.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Take;
import com.tinder.places.main.target.PlacesPinDropTarget;
import com.tinder.places.viewmodel.C14351c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0007J,\u0010\u0019\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004J\b\u0010\u001d\u001a\u00020\u0016H\u0007J\u0006\u0010\u001e\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/tinder/places/main/presenter/PlacesPinDropPresenter;", "", "()V", "arePinsActivated", "", "firstEntrance", "pins", "", "Lcom/tinder/places/viewmodel/PlacePinViewModel;", "shouldBounce", "getShouldBounce", "()Z", "setShouldBounce", "(Z)V", "shouldShowMap", "target", "Lcom/tinder/places/main/target/PlacesPinDropTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/main/target/PlacesPinDropTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/main/target/PlacesPinDropTarget;)V", "bindPinDropView", "", "cancelPendingAnimations", "setMapVisibility", "setup", "", "activated", "showMap", "startPinDrop", "stopPinBounce", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.main.presenter.d */
public final class C10220d {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesPinDropTarget f33287a;
    /* renamed from: b */
    private boolean f33288b = true;
    /* renamed from: c */
    private final List<C14351c> f33289c = new ArrayList();
    /* renamed from: d */
    private boolean f33290d;
    /* renamed from: e */
    private boolean f33291e;
    /* renamed from: f */
    private boolean f33292f;

    /* renamed from: a */
    public final void m41548a(boolean z) {
        this.f33292f = z;
    }

    /* renamed from: a */
    public final void m41547a(@NotNull List<C14351c> list, boolean z, boolean z2, boolean z3) {
        C2668g.b(list, "pins");
        this.f33289c.clear();
        this.f33289c.addAll(list);
        this.f33290d = z;
        this.f33292f = z2;
        this.f33291e = z3;
    }

    @Take
    /* renamed from: a */
    public final void m41546a() {
        if (this.f33290d) {
            PlacesPinDropTarget placesPinDropTarget;
            placesPinDropTarget = this.f33287a;
            if (placesPinDropTarget == null) {
                C2668g.b("target");
            }
            placesPinDropTarget.bindActivatedPins(this.f33289c);
            return;
        }
        placesPinDropTarget = this.f33287a;
        if (placesPinDropTarget == null) {
            C2668g.b("target");
        }
        placesPinDropTarget.bindDeactivatedPins(this.f33289c);
    }

    @Take
    /* renamed from: b */
    public final void m41549b() {
        PlacesPinDropTarget placesPinDropTarget;
        if (this.f33291e) {
            placesPinDropTarget = this.f33287a;
            if (placesPinDropTarget == null) {
                C2668g.b("target");
            }
            placesPinDropTarget.showMap();
            return;
        }
        placesPinDropTarget = this.f33287a;
        if (placesPinDropTarget == null) {
            C2668g.b("target");
        }
        placesPinDropTarget.hideMap();
    }

    @Take
    /* renamed from: c */
    public final void m41550c() {
        if (this.f33288b && this.f33292f) {
            PlacesPinDropTarget placesPinDropTarget = this.f33287a;
            if (placesPinDropTarget == null) {
                C2668g.b("target");
            }
            placesPinDropTarget.dropPins();
            this.f33288b = false;
        }
    }

    /* renamed from: d */
    public final void m41551d() {
        PlacesPinDropTarget placesPinDropTarget = this.f33287a;
        if (placesPinDropTarget == null) {
            C2668g.b("target");
        }
        placesPinDropTarget.cancelAllAnimations();
    }

    /* renamed from: e */
    public final void m41552e() {
        PlacesPinDropTarget placesPinDropTarget = this.f33287a;
        if (placesPinDropTarget == null) {
            C2668g.b("target");
        }
        placesPinDropTarget.stopPinsBouncing();
    }
}
