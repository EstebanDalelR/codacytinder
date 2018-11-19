package com.google.android.m4b.maps.ci;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Point;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.cg.bg;
import com.google.android.m4b.maps.cg.bg.C5148a;
import com.google.android.m4b.maps.model.LatLng;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.ci.j */
public final class C6646j implements C5148a, C5212l {
    /* renamed from: a */
    private final bg f24914a;
    /* renamed from: b */
    private final boolean f24915b;
    /* renamed from: c */
    private C6645h f24916c;
    /* renamed from: d */
    private Paint f24917d = new Paint();

    public C6646j(bg bgVar, boolean z, C6645h c6645h) {
        this.f24914a = bgVar;
        this.f24916c = c6645h;
        this.f24915b = z;
        this.f24916c.m29650a((C5212l) this);
    }

    /* renamed from: a */
    public final void mo4985a(int i) {
        this.f24916c.m29646a();
    }

    /* renamed from: a */
    public final void mo4984a() {
        this.f24916c.m29656b((C5212l) this);
    }

    /* renamed from: a */
    private static void m29662a(Path path, List<LatLng> list, C6647k c6647k) {
        float b = (float) c6647k.m29672b();
        int ceil = (int) Math.ceil((double) ((((float) c6647k.f24923f) - b) / (b * 2.0f)));
        for (int i = -ceil; i <= ceil; i++) {
            Point a = c6647k.mo4986a((LatLng) list.get(0));
            path.moveTo(((float) a.x) + (((float) i) * b), (float) a.y);
            int i2 = 1;
            Point point = a;
            int i3 = 0;
            while (i2 < list.size()) {
                Point a2 = c6647k.mo4986a((LatLng) list.get(i2));
                if (((float) (a2.x - point.x)) > b / 2.0f) {
                    i3--;
                } else if (((float) (a2.x - point.x)) < (-b) / 2.0f) {
                    i3++;
                }
                path.lineTo(((float) a2.x) + (((float) (i + i3)) * b), (float) a2.y);
                i2++;
                point = a2;
            }
            if (((float) a.x) == ((float) point.x) + (((float) i3) * b) && a.y == point.y) {
                path.close();
            }
        }
    }

    /* renamed from: a */
    public final void mo5367a(Canvas canvas, C6647k c6647k) {
        if (this.f24914a.mo7187h()) {
            Path path = new Path();
            C6646j.m29662a(path, this.f24914a.mo7181b(), c6647k);
            Iterator a = this.f24914a.mo7182c().mo4785a();
            while (a.hasNext()) {
                C6646j.m29662a(path, (ae) a.next(), c6647k);
            }
            this.f24917d.setAntiAlias(true);
            path.setFillType(FillType.EVEN_ODD);
            if (!(this.f24915b == null || this.f24914a.mo7184e() == null)) {
                this.f24917d.setColor(this.f24914a.mo7184e());
                this.f24917d.setStyle(Style.FILL);
                canvas.drawPath(path, this.f24917d);
            }
            if (this.f24914a.mo7183d() != null) {
                this.f24917d.setColor(this.f24914a.mo7183d());
                this.f24917d.setStrokeWidth(this.f24914a.mo7185f());
                this.f24917d.setStyle(Style.STROKE);
                canvas.drawPath(path, this.f24917d);
            }
        }
    }

    /* renamed from: b */
    public final float mo5368b() {
        return this.f24914a.mo7186g();
    }
}
