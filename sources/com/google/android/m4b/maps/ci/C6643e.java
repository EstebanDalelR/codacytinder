package com.google.android.m4b.maps.ci;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.m4b.maps.cg.az;
import com.google.android.m4b.maps.cg.az.C5143a;
import com.google.android.m4b.maps.cg.bj.C5149a;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.m4b.maps.ci.e */
public final class C6643e implements C5143a {
    /* renamed from: a */
    private final az f24891a;
    /* renamed from: b */
    private final C6645h f24892b;
    /* renamed from: c */
    private Paint f24893c = new Paint();
    /* renamed from: d */
    private Point f24894d = new Point(-2, -2);
    /* renamed from: e */
    private Point f24895e = new Point(-1, -1);

    /* renamed from: e */
    public final void mo4945e() {
    }

    public C6643e(az azVar, C6645h c6645h) {
        this.f24891a = azVar;
        this.f24892b = c6645h;
    }

    /* renamed from: a */
    public final void mo4940a() {
        this.f24892b.m29649a(this);
    }

    /* renamed from: a */
    public final void mo4941a(int i) {
        if ((i & 1) != 0) {
            this.f24892b.m29646a();
        }
        if ((i & 2) != 0) {
            this.f24892b.m29646a();
        }
        if ((i & 4) != 0) {
            this.f24892b.m29646a();
        }
        if ((i & 64) != 0) {
            if (!this.f24891a.m32882o()) {
                this.f24892b.m29660d(this);
            }
            this.f24892b.m29646a();
        }
        if ((i & 1024) != 0) {
            this.f24892b.m29646a();
        }
        if ((i & 512) != 0) {
            this.f24892b.m29646a();
        }
        if ((i & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            this.f24892b.m29646a();
        }
        if ((i & 256) != 0) {
            this.f24892b.m29646a();
        }
    }

    /* renamed from: b */
    public final void mo4942b() {
        this.f24892b.m29655b(this);
    }

    /* renamed from: f */
    public final boolean mo4946f() {
        return this.f24892b.m29661e(this);
    }

    /* renamed from: a */
    public final void m29629a(Canvas canvas, C5149a c5149a) {
        Bitmap c = this.f24891a.m32870c();
        int e = (int) (this.f24891a.m32872e() * ((float) c.getWidth()));
        int g = (int) (this.f24891a.m32874g() * ((float) c.getHeight()));
        c5149a = c5149a.mo4986a(this.f24891a.m32869b());
        this.f24894d = new Point(c5149a.x - e, c5149a.y - g);
        this.f24895e = new Point(c5149a.x + (c.getWidth() - e), c5149a.y + (c.getHeight() - g));
        if (c != null && this.f24891a.isVisible() != null) {
            this.f24893c.setAlpha((int) (this.f24891a.m32885r() * 255.0f));
            canvas.drawBitmap(c, (float) this.f24894d.x, (float) this.f24894d.y, this.f24893c);
        }
    }

    /* renamed from: g */
    public final az m29635g() {
        return this.f24891a;
    }

    /* renamed from: i */
    public final Rect mo4947i() {
        return new Rect(this.f24894d.x, this.f24894d.y, this.f24895e.x, this.f24895e.y);
    }

    /* renamed from: c */
    public final void mo4943c() {
        this.f24892b.m29657c(this);
    }

    /* renamed from: d */
    public final void mo4944d() {
        this.f24892b.m29660d(this);
    }
}
