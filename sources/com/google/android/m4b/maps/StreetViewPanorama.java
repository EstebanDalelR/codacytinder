package com.google.android.m4b.maps;

import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;
import com.google.android.m4b.maps.model.StreetViewPanoramaOrientation;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p124x.aa.C6783a;
import com.google.android.m4b.maps.p124x.ab.C6785a;
import com.google.android.m4b.maps.p124x.ac.C6787a;
import com.google.android.m4b.maps.p124x.ad.C6789a;
import com.google.android.m4b.maps.p124x.ah;

public class StreetViewPanorama {
    /* renamed from: a */
    private final ah f16765a;

    public interface OnStreetViewPanoramaCameraChangeListener {
        void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    public interface OnStreetViewPanoramaChangeListener {
        void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    public interface OnStreetViewPanoramaClickListener {
        void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public interface OnStreetViewPanoramaLongClickListener {
        void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    /* renamed from: com.google.android.m4b.maps.StreetViewPanorama$1 */
    class C73821 extends C6785a {
        /* renamed from: a */
        private /* synthetic */ OnStreetViewPanoramaChangeListener f27114a;

        /* renamed from: a */
        public final void mo5688a(StreetViewPanoramaLocation streetViewPanoramaLocation) {
            this.f27114a.onStreetViewPanoramaChange(streetViewPanoramaLocation);
        }
    }

    /* renamed from: com.google.android.m4b.maps.StreetViewPanorama$2 */
    class C73832 extends C6783a {
        /* renamed from: a */
        private /* synthetic */ OnStreetViewPanoramaCameraChangeListener f27115a;

        /* renamed from: a */
        public final void mo5687a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
            this.f27115a.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
        }
    }

    /* renamed from: com.google.android.m4b.maps.StreetViewPanorama$3 */
    class C73843 extends C6787a {
        /* renamed from: a */
        private /* synthetic */ OnStreetViewPanoramaClickListener f27116a;

        /* renamed from: a */
        public final void mo5689a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            this.f27116a.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
        }
    }

    /* renamed from: com.google.android.m4b.maps.StreetViewPanorama$4 */
    class C73854 extends C6789a {
        /* renamed from: a */
        private /* synthetic */ OnStreetViewPanoramaLongClickListener f27117a;

        /* renamed from: a */
        public final void mo5690a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            this.f27117a.onStreetViewPanoramaLongClick(streetViewPanoramaOrientation);
        }
    }

    protected StreetViewPanorama(ah ahVar) {
        this.f16765a = (ah) C5462v.m23767a((Object) ahVar);
    }
}
