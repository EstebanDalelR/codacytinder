package com.google.android.m4b.maps.ci;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.location.Location;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.cg.C5187r;
import com.google.android.m4b.maps.cg.bc.C5146a;
import com.google.android.m4b.maps.cg.bj.C5149a;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.ci.f */
public final class C6644f implements C5146a {
    /* renamed from: a */
    private final C6642d f24896a;
    /* renamed from: b */
    private final Resources f24897b;
    /* renamed from: c */
    private boolean f24898c = false;
    /* renamed from: d */
    private Paint f24899d = new Paint();
    /* renamed from: e */
    private Location f24900e;
    /* renamed from: f */
    private Bitmap f24901f;
    /* renamed from: g */
    private Bitmap f24902g;

    public C6644f(C6642d c6642d) {
        this.f24896a = (C6642d) C5571j.m24292a((Object) c6642d);
        this.f24897b = c6642d.getResources();
    }

    /* renamed from: a */
    public final void mo4980a() {
        if (!this.f24898c) {
            this.f24896a.invalidate();
        }
        this.f24898c = true;
    }

    /* renamed from: b */
    public final void mo4982b() {
        if (this.f24898c) {
            this.f24896a.invalidate();
        }
        this.f24898c = false;
    }

    /* renamed from: a */
    public final void mo4981a(Location location) {
        if (location != this.f24900e) {
            this.f24896a.invalidate();
        }
        this.f24900e = location;
    }

    /* renamed from: a */
    public final void m29638a(Canvas canvas, C5149a c5149a) {
        if (this.f24898c) {
            if (this.f24900e != null) {
                Object obj;
                LatLng latLng = new LatLng(this.f24900e.getLatitude(), this.f24900e.getLongitude());
                Point a = c5149a.mo4986a(latLng);
                if (this.f24900e.hasAccuracy()) {
                    c5149a = (float) (a.y - c5149a.mo4986a(new LatLng(latLng.latitude + C5187r.m23177a((double) this.f24900e.getAccuracy()), latLng.longitude)).y);
                    this.f24899d.setStyle(Style.STROKE);
                    this.f24899d.setStrokeWidth(2.0f);
                    this.f24899d.setColor(this.f24897b.getColor(C4513R.color.maps_accuracy_circle_line_color));
                    canvas.drawCircle((float) a.x, (float) a.y, c5149a, this.f24899d);
                    this.f24899d.setStyle(Style.FILL);
                    this.f24899d.setColor(this.f24897b.getColor(C4513R.color.maps_accuracy_circle_fill_color));
                    canvas.drawCircle((float) a.x, (float) a.y, c5149a, this.f24899d);
                    this.f24899d.reset();
                }
                c5149a = new Matrix();
                if (this.f24900e.hasBearing()) {
                    c5149a.setRotate(this.f24900e.getBearing());
                    if (this.f24902g == null) {
                        this.f24902g = BitmapFactory.decodeResource(this.f24897b, C4513R.drawable.maps_chevron);
                    }
                    obj = this.f24902g;
                } else {
                    if (this.f24901f == null) {
                        this.f24901f = BitmapFactory.decodeResource(this.f24897b, C4513R.drawable.maps_blue_dot);
                    }
                    obj = this.f24901f;
                }
                C5571j.m24292a(obj);
                c5149a.preTranslate((float) ((-obj.getWidth()) / 2), (float) ((-obj.getHeight()) / 2));
                float dimension = this.f24897b.getDimension(C4513R.dimen.maps_vm_mylocation_dot_size);
                c5149a.postScale(dimension / ((float) obj.getWidth()), dimension / ((float) obj.getHeight()));
                c5149a.postTranslate((float) a.x, (float) a.y);
                canvas.drawBitmap(obj, c5149a, this.f24899d);
            }
        }
    }
}
