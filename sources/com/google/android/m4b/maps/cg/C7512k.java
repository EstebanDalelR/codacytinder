package com.google.android.m4b.maps.cg;

import android.os.Bundle;
import com.google.android.m4b.maps.cg.C5180j.C5179a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.C5535c.C6802a;

/* renamed from: com.google.android.m4b.maps.cg.k */
public class C7512k extends C6802a {
    /* renamed from: a */
    private static final String f28024a = "k";
    /* renamed from: b */
    private static final Bundle f28025b = new Bundle(0);
    /* renamed from: c */
    private static final C5179a f28026c = new C66191();
    /* renamed from: d */
    private static final C5179a f28027d = new C66224();

    /* renamed from: com.google.android.m4b.maps.cg.k$1 */
    class C66191 implements C5179a {
        C66191() {
        }

        /* renamed from: a */
        public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
            cbVar.mo5310b(C5164a.CAMERA_UPDATE_ZOOM_IN);
            c5180j.mo4913a(1.0f, i);
        }

        public final String toString() {
            String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_ZOOM_IN);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
            stringBuilder.append(valueOf);
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.k$4 */
    class C66224 implements C5179a {
        C66224() {
        }

        /* renamed from: a */
        public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
            cbVar.mo5310b(C5164a.CAMERA_UPDATE_ZOOM_OUT);
            c5180j.mo4913a(-1.0f, i);
        }

        public final String toString() {
            String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_ZOOM_OUT);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
            stringBuilder.append(valueOf);
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public final C5484b mo7209a() {
        return C7701d.m33407a(f28026c);
    }

    /* renamed from: b */
    public final C5484b mo7218b() {
        return C7701d.m33407a(f28027d);
    }

    /* renamed from: a */
    public final C5484b mo7210a(final float f) {
        return C7701d.m33407a(new C5179a(this) {
            /* renamed from: b */
            private /* synthetic */ C7512k f24820b;

            /* renamed from: a */
            public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
                cbVar.mo5310b(C5164a.CAMERA_UPDATE_ZOOM_TO);
                c5180j.mo4929c(f, i);
            }

            public final String toString() {
                String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_ZOOM_TO);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
                stringBuilder.append(valueOf);
                return stringBuilder.toString();
            }
        });
    }

    /* renamed from: b */
    public final C5484b mo7219b(final float f) {
        return C7701d.m33407a(new C5179a(this) {
            /* renamed from: b */
            private /* synthetic */ C7512k f24822b;

            /* renamed from: a */
            public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
                cbVar.mo5310b(C5164a.CAMERA_UPDATE_ZOOM_BY);
                c5180j.mo4913a(f, i);
            }

            public final String toString() {
                String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_ZOOM_BY);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
                stringBuilder.append(valueOf);
                return stringBuilder.toString();
            }
        });
    }

    /* renamed from: a */
    public final C5484b mo7212a(final float f, final int i, final int i2) {
        return C7701d.m33407a(new C5179a(this) {
            /* renamed from: d */
            private /* synthetic */ C7512k f24826d;

            /* renamed from: a */
            public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
                cbVar.mo5310b(C5164a.CAMERA_UPDATE_ZOOM_BY_FIXING);
                c5180j.mo4914a(f, i, i2, i);
            }

            public final String toString() {
                String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_ZOOM_BY_FIXING);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
                stringBuilder.append(valueOf);
                return stringBuilder.toString();
            }
        });
    }

    /* renamed from: a */
    public final C5484b mo7211a(final float f, final float f2) {
        return C7701d.m33407a(new C5179a(this) {
            /* renamed from: c */
            private /* synthetic */ C7512k f24829c;

            /* renamed from: a */
            public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
                cbVar.mo5310b(C5164a.CAMERA_UPDATE_SCROLL_BY);
                c5180j.mo4912a(f, f2, i);
            }

            public final String toString() {
                String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_SCROLL_BY);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
                stringBuilder.append(valueOf);
                return stringBuilder.toString();
            }
        });
    }

    /* renamed from: a */
    public final C5484b mo7213a(final CameraPosition cameraPosition) {
        return C7701d.m33407a(new C5179a(this) {
            /* renamed from: b */
            private /* synthetic */ C7512k f24831b;

            /* renamed from: a */
            public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
                cbVar.mo5310b(C5164a.CAMERA_UPDATE_NEW_CAMERA_POSITION);
                c5180j.mo4918a(cameraPosition, i);
            }

            public final String toString() {
                String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_NEW_CAMERA_POSITION);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
                stringBuilder.append(valueOf);
                return stringBuilder.toString();
            }
        });
    }

    /* renamed from: a */
    public final C5484b mo7214a(final LatLng latLng) {
        return C7701d.m33407a(new C5179a(this) {
            /* renamed from: b */
            private /* synthetic */ C7512k f24807b;

            /* renamed from: a */
            public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
                cbVar.mo5310b(C5164a.CAMERA_UPDATE_NEW_LATLNG);
                c5180j.mo4920a(latLng, i);
            }

            public final String toString() {
                String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_NEW_LATLNG);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
                stringBuilder.append(valueOf);
                return stringBuilder.toString();
            }
        });
    }

    /* renamed from: a */
    public final C5484b mo7215a(final LatLng latLng, final float f) {
        return C7701d.m33407a(new C5179a(this) {
            /* renamed from: c */
            private /* synthetic */ C7512k f24810c;

            /* renamed from: a */
            public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
                cbVar.mo5310b(C5164a.CAMERA_UPDATE_NEW_LATLNG_ZOOM);
                c5180j.mo4919a(latLng, f, i);
            }

            public final String toString() {
                String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_NEW_LATLNG_ZOOM);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
                stringBuilder.append(valueOf);
                return stringBuilder.toString();
            }
        });
    }

    /* renamed from: a */
    public final C5484b mo7216a(final LatLngBounds latLngBounds, final int i) {
        return C7701d.m33407a(new C5179a(this) {
            /* renamed from: c */
            private /* synthetic */ C7512k f24813c;

            /* renamed from: a */
            public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
                cbVar.mo5310b(C5164a.CAMERA_UPDATE_NEW_LATLNG_BOUNDS);
                c5180j.mo4921a(latLngBounds, i, i);
            }

            public final String toString() {
                String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_NEW_LATLNG_BOUNDS);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
                stringBuilder.append(valueOf);
                return stringBuilder.toString();
            }
        });
    }

    /* renamed from: a */
    public final C5484b mo7217a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        final LatLngBounds latLngBounds2 = latLngBounds;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        return C7701d.m33407a((Object) new C5179a(this) {
            /* renamed from: e */
            private /* synthetic */ C7512k f24818e;

            /* renamed from: a */
            public final void mo5312a(C5180j c5180j, int i, cb cbVar) {
                cbVar.mo5310b(C5164a.CAMERA_UPDATE_NEW_LATLNG_BOUNDS_WITH_DIMENSIONS);
                c5180j.mo4922a(latLngBounds2, i4, i5, i6, i);
            }

            public final String toString() {
                String valueOf = String.valueOf(C5164a.CAMERA_UPDATE_NEW_LATLNG_BOUNDS_WITH_DIMENSIONS);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 0);
                stringBuilder.append(valueOf);
                return stringBuilder.toString();
            }
        });
    }
}
