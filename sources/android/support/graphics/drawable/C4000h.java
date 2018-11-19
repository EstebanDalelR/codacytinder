package android.support.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.res.C0441a;
import android.support.v4.content.res.C0442b;
import android.support.v4.graphics.C0447c;
import android.support.v4.graphics.C0447c.C0446b;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.util.C2880a;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.graphics.drawable.h */
public class C4000h extends C2782g {
    /* renamed from: a */
    static final Mode f12731a = Mode.SRC_IN;
    /* renamed from: c */
    private C0268f f12732c;
    /* renamed from: d */
    private PorterDuffColorFilter f12733d;
    /* renamed from: e */
    private ColorFilter f12734e;
    /* renamed from: f */
    private boolean f12735f;
    /* renamed from: g */
    private boolean f12736g;
    /* renamed from: h */
    private ConstantState f12737h;
    /* renamed from: i */
    private final float[] f12738i;
    /* renamed from: j */
    private final Matrix f12739j;
    /* renamed from: k */
    private final Rect f12740k;

    /* renamed from: android.support.graphics.drawable.h$c */
    private static class C0265c {
        /* renamed from: a */
        final ArrayList<Object> f930a = new ArrayList();
        /* renamed from: b */
        float f931b = 0.0f;
        /* renamed from: c */
        int f932c;
        /* renamed from: d */
        private final Matrix f933d = new Matrix();
        /* renamed from: e */
        private float f934e = 0.0f;
        /* renamed from: f */
        private float f935f = 0.0f;
        /* renamed from: g */
        private float f936g = 1.0f;
        /* renamed from: h */
        private float f937h = 1.0f;
        /* renamed from: i */
        private float f938i = 0.0f;
        /* renamed from: j */
        private float f939j = 0.0f;
        /* renamed from: k */
        private final Matrix f940k = new Matrix();
        /* renamed from: l */
        private int[] f941l;
        /* renamed from: m */
        private String f942m = null;

        public C0265c(C0265c c0265c, C2880a<String, Object> c2880a) {
            this.f931b = c0265c.f931b;
            this.f934e = c0265c.f934e;
            this.f935f = c0265c.f935f;
            this.f936g = c0265c.f936g;
            this.f937h = c0265c.f937h;
            this.f938i = c0265c.f938i;
            this.f939j = c0265c.f939j;
            this.f941l = c0265c.f941l;
            this.f942m = c0265c.f942m;
            this.f932c = c0265c.f932c;
            if (this.f942m != null) {
                c2880a.put(this.f942m, this);
            }
            this.f940k.set(c0265c.f940k);
            c0265c = c0265c.f930a;
            for (int i = 0; i < c0265c.size(); i++) {
                Object obj = c0265c.get(i);
                if (obj instanceof C0265c) {
                    this.f930a.add(new C0265c((C0265c) obj, c2880a));
                } else {
                    C0266d c2784b;
                    if (obj instanceof C2784b) {
                        c2784b = new C2784b((C2784b) obj);
                    } else if (obj instanceof C2783a) {
                        c2784b = new C2783a((C2783a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f930a.add(c2784b);
                    if (c2784b.f944n != null) {
                        c2880a.put(c2784b.f944n, c2784b);
                    }
                }
            }
        }

        public String getGroupName() {
            return this.f942m;
        }

        public Matrix getLocalMatrix() {
            return this.f940k;
        }

        /* renamed from: a */
        public void m965a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            resources = C0442b.m1673a(resources, theme, attributeSet, C0254a.f907b);
            m963a(resources, xmlPullParser);
            resources.recycle();
        }

        /* renamed from: a */
        private void m963a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f941l = null;
            this.f931b = C0442b.m1671a(typedArray, xmlPullParser, "rotation", 5, this.f931b);
            this.f934e = typedArray.getFloat(1, this.f934e);
            this.f935f = typedArray.getFloat(2, this.f935f);
            this.f936g = C0442b.m1671a(typedArray, xmlPullParser, "scaleX", 3, this.f936g);
            this.f937h = C0442b.m1671a(typedArray, xmlPullParser, "scaleY", 4, this.f937h);
            this.f938i = C0442b.m1671a(typedArray, xmlPullParser, "translateX", 6, this.f938i);
            this.f939j = C0442b.m1671a(typedArray, xmlPullParser, "translateY", 7, this.f939j);
            typedArray = typedArray.getString(null);
            if (typedArray != null) {
                this.f942m = typedArray;
            }
            m962a();
        }

        /* renamed from: a */
        private void m962a() {
            this.f940k.reset();
            this.f940k.postTranslate(-this.f934e, -this.f935f);
            this.f940k.postScale(this.f936g, this.f937h);
            this.f940k.postRotate(this.f931b, 0.0f, 0.0f);
            this.f940k.postTranslate(this.f938i + this.f934e, this.f939j + this.f935f);
        }

        public float getRotation() {
            return this.f931b;
        }

        public void setRotation(float f) {
            if (f != this.f931b) {
                this.f931b = f;
                m962a();
            }
        }

        public float getPivotX() {
            return this.f934e;
        }

        public void setPivotX(float f) {
            if (f != this.f934e) {
                this.f934e = f;
                m962a();
            }
        }

        public float getPivotY() {
            return this.f935f;
        }

        public void setPivotY(float f) {
            if (f != this.f935f) {
                this.f935f = f;
                m962a();
            }
        }

        public float getScaleX() {
            return this.f936g;
        }

        public void setScaleX(float f) {
            if (f != this.f936g) {
                this.f936g = f;
                m962a();
            }
        }

        public float getScaleY() {
            return this.f937h;
        }

        public void setScaleY(float f) {
            if (f != this.f937h) {
                this.f937h = f;
                m962a();
            }
        }

        public float getTranslateX() {
            return this.f938i;
        }

        public void setTranslateX(float f) {
            if (f != this.f938i) {
                this.f938i = f;
                m962a();
            }
        }

        public float getTranslateY() {
            return this.f939j;
        }

        public void setTranslateY(float f) {
            if (f != this.f939j) {
                this.f939j = f;
                m962a();
            }
        }
    }

    /* renamed from: android.support.graphics.drawable.h$d */
    private static class C0266d {
        /* renamed from: m */
        protected C0446b[] f943m = null;
        /* renamed from: n */
        String f944n;
        /* renamed from: o */
        int f945o;

        /* renamed from: a */
        public boolean mo287a() {
            return false;
        }

        public C0266d(C0266d c0266d) {
            this.f944n = c0266d.f944n;
            this.f945o = c0266d.f945o;
            this.f943m = C0447c.m1703a(c0266d.f943m);
        }

        /* renamed from: a */
        public void m966a(Path path) {
            path.reset();
            if (this.f943m != null) {
                C0446b.m1695a(this.f943m, path);
            }
        }

        public String getPathName() {
            return this.f944n;
        }

        public C0446b[] getPathData() {
            return this.f943m;
        }

        public void setPathData(C0446b[] c0446bArr) {
            if (C0447c.m1701a(this.f943m, c0446bArr)) {
                C0447c.m1704b(this.f943m, c0446bArr);
            } else {
                this.f943m = C0447c.m1703a(c0446bArr);
            }
        }
    }

    /* renamed from: android.support.graphics.drawable.h$e */
    private static class C0267e {
        /* renamed from: k */
        private static final Matrix f946k = new Matrix();
        /* renamed from: a */
        final C0265c f947a;
        /* renamed from: b */
        float f948b;
        /* renamed from: c */
        float f949c;
        /* renamed from: d */
        float f950d;
        /* renamed from: e */
        float f951e;
        /* renamed from: f */
        int f952f;
        /* renamed from: g */
        String f953g;
        /* renamed from: h */
        final C2880a<String, Object> f954h;
        /* renamed from: i */
        private final Path f955i;
        /* renamed from: j */
        private final Path f956j;
        /* renamed from: l */
        private final Matrix f957l;
        /* renamed from: m */
        private Paint f958m;
        /* renamed from: n */
        private Paint f959n;
        /* renamed from: o */
        private PathMeasure f960o;
        /* renamed from: p */
        private int f961p;

        /* renamed from: a */
        private static float m968a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public C0267e() {
            this.f957l = new Matrix();
            this.f948b = 0.0f;
            this.f949c = 0.0f;
            this.f950d = 0.0f;
            this.f951e = 0.0f;
            this.f952f = 255;
            this.f953g = null;
            this.f954h = new C2880a();
            this.f947a = new C0265c();
            this.f955i = new Path();
            this.f956j = new Path();
        }

        public void setRootAlpha(int i) {
            this.f952f = i;
        }

        public int getRootAlpha() {
            return this.f952f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public C0267e(C0267e c0267e) {
            this.f957l = new Matrix();
            this.f948b = 0.0f;
            this.f949c = 0.0f;
            this.f950d = 0.0f;
            this.f951e = 0.0f;
            this.f952f = 255;
            this.f953g = null;
            this.f954h = new C2880a();
            this.f947a = new C0265c(c0267e.f947a, this.f954h);
            this.f955i = new Path(c0267e.f955i);
            this.f956j = new Path(c0267e.f956j);
            this.f948b = c0267e.f948b;
            this.f949c = c0267e.f949c;
            this.f950d = c0267e.f950d;
            this.f951e = c0267e.f951e;
            this.f961p = c0267e.f961p;
            this.f952f = c0267e.f952f;
            this.f953g = c0267e.f953g;
            if (c0267e.f953g != null) {
                this.f954h.put(c0267e.f953g, this);
            }
        }

        /* renamed from: a */
        private void m972a(C0265c c0265c, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c0265c.f933d.set(matrix);
            c0265c.f933d.preConcat(c0265c.f940k);
            canvas.save();
            for (matrix = null; matrix < c0265c.f930a.size(); matrix++) {
                Object obj = c0265c.f930a.get(matrix);
                if (obj instanceof C0265c) {
                    m972a((C0265c) obj, c0265c.f933d, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0266d) {
                    m973a(c0265c, (C0266d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        public void m976a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m972a(this.f947a, f946k, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        private void m973a(C0265c c0265c, C0266d c0266d, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            i = ((float) i) / this.f950d;
            i2 = ((float) i2) / this.f951e;
            float min = Math.min(i, i2);
            Matrix a = c0265c.f933d;
            this.f957l.set(a);
            this.f957l.postScale(i, i2);
            c0265c = m969a(a);
            if (c0265c != null) {
                c0266d.m966a(this.f955i);
                i2 = this.f955i;
                this.f956j.reset();
                if (c0266d.mo287a()) {
                    this.f956j.addPath(i2, this.f957l);
                    canvas.clipPath(this.f956j);
                } else {
                    C2784b c2784b = (C2784b) c0266d;
                    if (!(c2784b.f8823g == 0.0f && c2784b.f8824h == 1.0f)) {
                        float f = (c2784b.f8823g + c2784b.f8825i) % 1.0f;
                        float f2 = (c2784b.f8824h + c2784b.f8825i) % 1.0f;
                        if (this.f960o == null) {
                            this.f960o = new PathMeasure();
                        }
                        this.f960o.setPath(this.f955i, false);
                        float length = this.f960o.getLength();
                        f *= length;
                        f2 *= length;
                        i2.reset();
                        if (f > f2) {
                            this.f960o.getSegment(f, length, i2, true);
                            this.f960o.getSegment(0.0f, f2, i2, true);
                        } else {
                            this.f960o.getSegment(f, f2, i2, true);
                        }
                        i2.rLineTo(0.0f, 0.0f);
                    }
                    this.f956j.addPath(i2, this.f957l);
                    if (c2784b.f8819c != 0) {
                        if (this.f959n == 0) {
                            this.f959n = new Paint();
                            this.f959n.setStyle(Style.FILL);
                            this.f959n.setAntiAlias(true);
                        }
                        i = this.f959n;
                        i.setColor(C4000h.m15686a(c2784b.f8819c, c2784b.f8822f));
                        i.setColorFilter(colorFilter);
                        this.f956j.setFillType(c2784b.f8821e == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.f956j, i);
                    }
                    if (c2784b.f8817a != 0) {
                        if (this.f958m == 0) {
                            this.f958m = new Paint();
                            this.f958m.setStyle(Style.STROKE);
                            this.f958m.setAntiAlias(true);
                        }
                        i = this.f958m;
                        if (c2784b.f8827k != 0) {
                            i.setStrokeJoin(c2784b.f8827k);
                        }
                        if (c2784b.f8826j != 0) {
                            i.setStrokeCap(c2784b.f8826j);
                        }
                        i.setStrokeMiter(c2784b.f8828l);
                        i.setColor(C4000h.m15686a(c2784b.f8817a, c2784b.f8820d));
                        i.setColorFilter(colorFilter);
                        i.setStrokeWidth(c2784b.f8818b * (min * c0265c));
                        canvas.drawPath(this.f956j, i);
                    }
                }
            }
        }

        /* renamed from: a */
        private float m969a(Matrix matrix) {
            float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            matrix = C0267e.m968a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(matrix) / max;
            }
            return 0.0f;
        }
    }

    /* renamed from: android.support.graphics.drawable.h$f */
    private static class C0268f extends ConstantState {
        /* renamed from: a */
        int f962a;
        /* renamed from: b */
        C0267e f963b;
        /* renamed from: c */
        ColorStateList f964c;
        /* renamed from: d */
        Mode f965d;
        /* renamed from: e */
        boolean f966e;
        /* renamed from: f */
        Bitmap f967f;
        /* renamed from: g */
        ColorStateList f968g;
        /* renamed from: h */
        Mode f969h;
        /* renamed from: i */
        int f970i;
        /* renamed from: j */
        boolean f971j;
        /* renamed from: k */
        boolean f972k;
        /* renamed from: l */
        Paint f973l;

        public C0268f(C0268f c0268f) {
            this.f964c = null;
            this.f965d = C4000h.f12731a;
            if (c0268f != null) {
                this.f962a = c0268f.f962a;
                this.f963b = new C0267e(c0268f.f963b);
                if (c0268f.f963b.f959n != null) {
                    this.f963b.f959n = new Paint(c0268f.f963b.f959n);
                }
                if (c0268f.f963b.f958m != null) {
                    this.f963b.f958m = new Paint(c0268f.f963b.f958m);
                }
                this.f964c = c0268f.f964c;
                this.f965d = c0268f.f965d;
                this.f966e = c0268f.f966e;
            }
        }

        /* renamed from: a */
        public void m979a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f967f, null, rect, m977a(colorFilter));
        }

        /* renamed from: a */
        public boolean m980a() {
            return this.f963b.getRootAlpha() < 255;
        }

        /* renamed from: a */
        public Paint m977a(ColorFilter colorFilter) {
            if (!m980a() && colorFilter == null) {
                return null;
            }
            if (this.f973l == null) {
                this.f973l = new Paint();
                this.f973l.setFilterBitmap(true);
            }
            this.f973l.setAlpha(this.f963b.getRootAlpha());
            this.f973l.setColorFilter(colorFilter);
            return this.f973l;
        }

        /* renamed from: a */
        public void m978a(int i, int i2) {
            this.f967f.eraseColor(0);
            this.f963b.m976a(new Canvas(this.f967f), i, i2, null);
        }

        /* renamed from: b */
        public void m981b(int i, int i2) {
            if (this.f967f == null || !m984c(i, i2)) {
                this.f967f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f972k = true;
            }
        }

        /* renamed from: c */
        public boolean m984c(int i, int i2) {
            return i == this.f967f.getWidth() && i2 == this.f967f.getHeight();
        }

        /* renamed from: b */
        public boolean m982b() {
            return !this.f972k && this.f968g == this.f964c && this.f969h == this.f965d && this.f971j == this.f966e && this.f970i == this.f963b.getRootAlpha();
        }

        /* renamed from: c */
        public void m983c() {
            this.f968g = this.f964c;
            this.f969h = this.f965d;
            this.f970i = this.f963b.getRootAlpha();
            this.f971j = this.f966e;
            this.f972k = false;
        }

        public C0268f() {
            this.f964c = null;
            this.f965d = C4000h.f12731a;
            this.f963b = new C0267e();
        }

        public Drawable newDrawable() {
            return new C4000h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C4000h(this);
        }

        public int getChangingConfigurations() {
            return this.f962a;
        }
    }

    @RequiresApi(24)
    /* renamed from: android.support.graphics.drawable.h$g */
    private static class C0269g extends ConstantState {
        /* renamed from: a */
        private final ConstantState f974a;

        public C0269g(ConstantState constantState) {
            this.f974a = constantState;
        }

        public Drawable newDrawable() {
            Drawable c4000h = new C4000h();
            c4000h.b = (VectorDrawable) this.f974a.newDrawable();
            return c4000h;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable c4000h = new C4000h();
            c4000h.b = (VectorDrawable) this.f974a.newDrawable(resources);
            return c4000h;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c4000h = new C4000h();
            c4000h.b = (VectorDrawable) this.f974a.newDrawable(resources, theme);
            return c4000h;
        }

        public boolean canApplyTheme() {
            return this.f974a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f974a.getChangingConfigurations();
        }
    }

    /* renamed from: android.support.graphics.drawable.h$a */
    private static class C2783a extends C0266d {
        /* renamed from: a */
        public boolean mo287a() {
            return true;
        }

        public C2783a(C2783a c2783a) {
            super(c2783a);
        }

        /* renamed from: a */
        public void m10840a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0442b.m1676a(xmlPullParser, "pathData") != null) {
                resources = C0442b.m1673a(resources, theme, attributeSet, C0254a.f909d);
                m10839a(resources);
                resources.recycle();
            }
        }

        /* renamed from: a */
        private void m10839a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            typedArray = typedArray.getString(1);
            if (typedArray != null) {
                this.m = C0447c.m1705b(typedArray);
            }
        }
    }

    /* renamed from: android.support.graphics.drawable.h$b */
    private static class C2784b extends C0266d {
        /* renamed from: a */
        int f8817a = 0;
        /* renamed from: b */
        float f8818b = 0.0f;
        /* renamed from: c */
        int f8819c = 0;
        /* renamed from: d */
        float f8820d = 1.0f;
        /* renamed from: e */
        int f8821e = 0;
        /* renamed from: f */
        float f8822f = 1.0f;
        /* renamed from: g */
        float f8823g = 0.0f;
        /* renamed from: h */
        float f8824h = 1.0f;
        /* renamed from: i */
        float f8825i = 0.0f;
        /* renamed from: j */
        Cap f8826j = Cap.BUTT;
        /* renamed from: k */
        Join f8827k = Join.MITER;
        /* renamed from: l */
        float f8828l = 4.0f;
        /* renamed from: p */
        private int[] f8829p;

        public C2784b(C2784b c2784b) {
            super(c2784b);
            this.f8829p = c2784b.f8829p;
            this.f8817a = c2784b.f8817a;
            this.f8818b = c2784b.f8818b;
            this.f8820d = c2784b.f8820d;
            this.f8819c = c2784b.f8819c;
            this.f8821e = c2784b.f8821e;
            this.f8822f = c2784b.f8822f;
            this.f8823g = c2784b.f8823g;
            this.f8824h = c2784b.f8824h;
            this.f8825i = c2784b.f8825i;
            this.f8826j = c2784b.f8826j;
            this.f8827k = c2784b.f8827k;
            this.f8828l = c2784b.f8828l;
        }

        /* renamed from: a */
        private Cap m10842a(int i, Cap cap) {
            switch (i) {
                case 0:
                    return Cap.BUTT;
                case 1:
                    return Cap.ROUND;
                case 2:
                    return Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Join m10843a(int i, Join join) {
            switch (i) {
                case 0:
                    return Join.MITER;
                case 1:
                    return Join.ROUND;
                case 2:
                    return Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        public void m10845a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0442b.m1673a(resources, theme, attributeSet, C0254a.f908c);
            m10844a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: a */
        private void m10844a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f8829p = null;
            if (C0442b.m1676a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                string = typedArray.getString(2);
                if (string != null) {
                    this.m = C0447c.m1705b(string);
                }
                this.f8819c = C0442b.m1677b(typedArray, xmlPullParser, "fillColor", 1, this.f8819c);
                this.f8822f = C0442b.m1671a(typedArray, xmlPullParser, "fillAlpha", 12, this.f8822f);
                this.f8826j = m10842a(C0442b.m1672a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f8826j);
                this.f8827k = m10843a(C0442b.m1672a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f8827k);
                this.f8828l = C0442b.m1671a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f8828l);
                this.f8817a = C0442b.m1677b(typedArray, xmlPullParser, "strokeColor", 3, this.f8817a);
                this.f8820d = C0442b.m1671a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f8820d);
                this.f8818b = C0442b.m1671a(typedArray, xmlPullParser, "strokeWidth", 4, this.f8818b);
                this.f8824h = C0442b.m1671a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f8824h);
                this.f8825i = C0442b.m1671a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f8825i);
                this.f8823g = C0442b.m1671a(typedArray, xmlPullParser, "trimPathStart", 5, this.f8823g);
                this.f8821e = C0442b.m1672a(typedArray, xmlPullParser, "fillType", 13, this.f8821e);
            }
        }

        int getStrokeColor() {
            return this.f8817a;
        }

        void setStrokeColor(int i) {
            this.f8817a = i;
        }

        float getStrokeWidth() {
            return this.f8818b;
        }

        void setStrokeWidth(float f) {
            this.f8818b = f;
        }

        float getStrokeAlpha() {
            return this.f8820d;
        }

        void setStrokeAlpha(float f) {
            this.f8820d = f;
        }

        int getFillColor() {
            return this.f8819c;
        }

        void setFillColor(int i) {
            this.f8819c = i;
        }

        float getFillAlpha() {
            return this.f8822f;
        }

        void setFillAlpha(float f) {
            this.f8822f = f;
        }

        float getTrimPathStart() {
            return this.f8823g;
        }

        void setTrimPathStart(float f) {
            this.f8823g = f;
        }

        float getTrimPathEnd() {
            return this.f8824h;
        }

        void setTrimPathEnd(float f) {
            this.f8824h = f;
        }

        float getTrimPathOffset() {
            return this.f8825i;
        }

        void setTrimPathOffset(float f) {
            this.f8825i = f;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    C4000h() {
        this.f12736g = true;
        this.f12738i = new float[9];
        this.f12739j = new Matrix();
        this.f12740k = new Rect();
        this.f12732c = new C0268f();
    }

    C4000h(@NonNull C0268f c0268f) {
        this.f12736g = true;
        this.f12738i = new float[9];
        this.f12739j = new Matrix();
        this.f12740k = new Rect();
        this.f12732c = c0268f;
        this.f12733d = m15693a(this.f12733d, c0268f.f964c, c0268f.f965d);
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
            return this;
        }
        if (!this.f12735f && super.mutate() == this) {
            this.f12732c = new C0268f(this.f12732c);
            this.f12735f = true;
        }
        return this;
    }

    /* renamed from: a */
    Object m15694a(String str) {
        return this.f12732c.f963b.f954h.get(str);
    }

    public ConstantState getConstantState() {
        if (this.b != null && VERSION.SDK_INT >= 24) {
            return new C0269g(this.b.getConstantState());
        }
        this.f12732c.f962a = getChangingConfigurations();
        return this.f12732c;
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        copyBounds(this.f12740k);
        if (this.f12740k.width() > 0) {
            if (this.f12740k.height() > 0) {
                ColorFilter colorFilter = this.f12734e == null ? this.f12733d : this.f12734e;
                canvas.getMatrix(this.f12739j);
                this.f12739j.getValues(this.f12738i);
                float abs = Math.abs(this.f12738i[0]);
                float abs2 = Math.abs(this.f12738i[4]);
                float abs3 = Math.abs(this.f12738i[1]);
                float abs4 = Math.abs(this.f12738i[3]);
                if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                }
                int height = (int) (((float) this.f12740k.height()) * abs2);
                int min = Math.min(ItemAnimator.FLAG_MOVED, (int) (((float) this.f12740k.width()) * abs));
                height = Math.min(ItemAnimator.FLAG_MOVED, height);
                if (min > 0) {
                    if (height > 0) {
                        int save = canvas.save();
                        canvas.translate((float) this.f12740k.left, (float) this.f12740k.top);
                        if (m15691a()) {
                            canvas.translate((float) this.f12740k.width(), 0.0f);
                            canvas.scale(-1.0f, 1.0f);
                        }
                        this.f12740k.offsetTo(0, 0);
                        this.f12732c.m981b(min, height);
                        if (!this.f12736g) {
                            this.f12732c.m978a(min, height);
                        } else if (!this.f12732c.m982b()) {
                            this.f12732c.m978a(min, height);
                            this.f12732c.m983c();
                        }
                        this.f12732c.m979a(canvas, colorFilter, this.f12740k);
                        canvas.restoreToCount(save);
                    }
                }
            }
        }
    }

    public int getAlpha() {
        if (this.b != null) {
            return C0450a.m1726c(this.b);
        }
        return this.f12732c.f963b.getRootAlpha();
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
            return;
        }
        if (this.f12732c.f963b.getRootAlpha() != i) {
            this.f12732c.f963b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f12734e = colorFilter;
        invalidateSelf();
    }

    /* renamed from: a */
    PorterDuffColorFilter m15693a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList != null) {
            if (mode != null) {
                return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
        }
        return null;
    }

    public void setTint(int i) {
        if (this.b != null) {
            C0450a.m1717a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0450a.m1719a(this.b, colorStateList);
            return;
        }
        C0268f c0268f = this.f12732c;
        if (c0268f.f964c != colorStateList) {
            c0268f.f964c = colorStateList;
            this.f12733d = m15693a(this.f12733d, colorStateList, c0268f.f965d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            C0450a.m1722a(this.b, mode);
            return;
        }
        C0268f c0268f = this.f12732c;
        if (c0268f.f965d != mode) {
            c0268f.f965d = mode;
            this.f12733d = m15693a(this.f12733d, c0268f.f964c, mode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        boolean z;
        if (!super.isStateful()) {
            if (this.f12732c == null || this.f12732c.f964c == null || !this.f12732c.f964c.isStateful()) {
                z = false;
                return z;
            }
        }
        z = true;
        return z;
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        iArr = this.f12732c;
        if (iArr.f964c == null || iArr.f965d == null) {
            return null;
        }
        this.f12733d = m15693a(this.f12733d, iArr.f964c, iArr.f965d);
        invalidateSelf();
        return 1;
    }

    public int getOpacity() {
        return this.b != null ? this.b.getOpacity() : -3;
    }

    public int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return (int) this.f12732c.f963b.f948b;
    }

    public int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return (int) this.f12732c.f963b.f949c;
    }

    public boolean canApplyTheme() {
        if (this.b != null) {
            C0450a.m1727d(this.b);
        }
        return false;
    }

    public boolean isAutoMirrored() {
        if (this.b != null) {
            return C0450a.m1724b(this.b);
        }
        return this.f12732c.f966e;
    }

    public void setAutoMirrored(boolean z) {
        if (this.b != null) {
            C0450a.m1723a(this.b, z);
        } else {
            this.f12732c.f966e = z;
        }
    }

    @Nullable
    /* renamed from: a */
    public static C4000h m15688a(@NonNull Resources resources, @DrawableRes int i, @Nullable Theme theme) {
        if (VERSION.SDK_INT >= 24) {
            C4000h c4000h = new C4000h();
            c4000h.b = C0441a.m1669a(resources, i, theme);
            c4000h.f12737h = new C0269g(c4000h.b.getConstantState());
            return c4000h;
        }
        try {
            int next;
            i = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(i);
            while (true) {
                next = i.next();
                if (next == 2 || next == 1) {
                    if (next != 2) {
                        return C4000h.m15689a(resources, i, asAttributeSet, theme);
                    }
                    throw new XmlPullParserException("No start tag found");
                }
            }
            if (next != 2) {
                return C4000h.m15689a(resources, i, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Resources resources2) {
            Log.e("VectorDrawableCompat", "parser error", resources2);
            return null;
        } catch (Resources resources22) {
            Log.e("VectorDrawableCompat", "parser error", resources22);
            return null;
        }
    }

    /* renamed from: a */
    public static C4000h m15689a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C4000h c4000h = new C4000h();
        c4000h.inflate(resources, xmlPullParser, attributeSet, theme);
        return c4000h;
    }

    /* renamed from: a */
    static int m15686a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (this.b != null) {
            C0450a.m1721a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0268f c0268f = this.f12732c;
        c0268f.f963b = new C0267e();
        TypedArray a = C0442b.m1673a(resources, theme, attributeSet, C0254a.f906a);
        m15690a(a, xmlPullParser);
        a.recycle();
        c0268f.f962a = getChangingConfigurations();
        c0268f.f972k = true;
        m15692b(resources, xmlPullParser, attributeSet, theme);
        this.f12733d = m15693a(this.f12733d, c0268f.f964c, c0268f.f965d);
    }

    /* renamed from: a */
    private static Mode m15687a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m15690a(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        C0268f c0268f = this.f12732c;
        C0267e c0267e = c0268f.f963b;
        c0268f.f965d = C4000h.m15687a(C0442b.m1672a(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            c0268f.f964c = colorStateList;
        }
        c0268f.f966e = C0442b.m1675a(typedArray, xmlPullParser, "autoMirrored", 5, c0268f.f966e);
        c0267e.f950d = C0442b.m1671a(typedArray, xmlPullParser, "viewportWidth", 7, c0267e.f950d);
        c0267e.f951e = C0442b.m1671a(typedArray, xmlPullParser, "viewportHeight", 8, c0267e.f951e);
        StringBuilder stringBuilder;
        if (c0267e.f950d <= 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(typedArray.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        } else if (c0267e.f951e <= 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(typedArray.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        } else {
            c0267e.f948b = typedArray.getDimension(3, c0267e.f948b);
            c0267e.f949c = typedArray.getDimension(2, c0267e.f949c);
            if (c0267e.f948b <= 0.0f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            } else if (c0267e.f949c <= 0.0f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            } else {
                c0267e.setAlpha(C0442b.m1671a(typedArray, xmlPullParser, "alpha", 4, c0267e.getAlpha()));
                typedArray = typedArray.getString(null);
                if (typedArray != null) {
                    c0267e.f953g = typedArray;
                    c0267e.f954h.put(typedArray, c0267e);
                }
            }
        }
    }

    /* renamed from: b */
    private void m15692b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C0268f c0268f = this.f12732c;
        C0267e c0267e = c0268f.f963b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0267e.f947a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0265c c0265c = (C0265c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C2784b c2784b = new C2784b();
                    c2784b.m10845a(resources, attributeSet, theme, xmlPullParser);
                    c0265c.f930a.add(c2784b);
                    if (c2784b.getPathName() != null) {
                        c0267e.f954h.put(c2784b.getPathName(), c2784b);
                    }
                    obj = null;
                    c0268f.f962a = c2784b.o | c0268f.f962a;
                } else if ("clip-path".equals(name)) {
                    C2783a c2783a = new C2783a();
                    c2783a.m10840a(resources, attributeSet, theme, xmlPullParser);
                    c0265c.f930a.add(c2783a);
                    if (c2783a.getPathName() != null) {
                        c0267e.f954h.put(c2783a.getPathName(), c2783a);
                    }
                    c0268f.f962a = c2783a.o | c0268f.f962a;
                } else if (ManagerWebServices.PARAM_GROUP.equals(name)) {
                    C0265c c0265c2 = new C0265c();
                    c0265c2.m965a(resources, attributeSet, theme, xmlPullParser);
                    c0265c.f930a.add(c0265c2);
                    arrayDeque.push(c0265c2);
                    if (c0265c2.getGroupName() != null) {
                        c0267e.f954h.put(c0265c2.getGroupName(), c0265c2);
                    }
                    c0268f.f962a = c0265c2.f932c | c0268f.f962a;
                }
            } else if (eventType == 3) {
                if (ManagerWebServices.PARAM_GROUP.equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (obj != null) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: a */
    void m15695a(boolean z) {
        this.f12736g = z;
    }

    /* renamed from: a */
    private boolean m15691a() {
        boolean z = false;
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (isAutoMirrored() && C0450a.m1732i(this) == 1) {
            z = true;
        }
        return z;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    public int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f12732c.getChangingConfigurations();
    }

    public void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
