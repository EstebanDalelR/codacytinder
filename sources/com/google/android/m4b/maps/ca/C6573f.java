package com.google.android.m4b.maps.ca;

import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.cb.C5063d;
import com.google.android.m4b.maps.cb.C5065h;
import com.google.android.m4b.maps.cb.C5067l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.ca.f */
public final class C6573f implements C5063d, C5065h, C5067l {
    /* renamed from: a */
    private float[] f24597a = 0;
    /* renamed from: b */
    private final List<Float> f24598b = new ArrayList();
    /* renamed from: c */
    private List<Float> f24599c;
    /* renamed from: d */
    private List<Float> f24600d;
    /* renamed from: e */
    private List<Short> f24601e;
    /* renamed from: f */
    private List<Byte> f24602f;
    /* renamed from: g */
    private final boolean f24603g = true;
    /* renamed from: h */
    private final boolean f24604h = false;
    /* renamed from: i */
    private final boolean f24605i = false;
    /* renamed from: j */
    private int f24606j = 12;
    /* renamed from: k */
    private int f24607k = 0;
    /* renamed from: l */
    private int f24608l = 0;
    /* renamed from: m */
    private int f24609m = 0;
    /* renamed from: n */
    private int f24610n = 0;
    /* renamed from: o */
    private final int f24611o = true;
    /* renamed from: p */
    private ByteBuffer f24612p;

    /* renamed from: b */
    public final void mo5262b(int i) {
    }

    /* renamed from: c */
    public final void mo5263c(int i) {
    }

    public C6573f(int i, int i2, boolean z) {
        if (this.f24604h != 0) {
            this.f24606j += 16;
            this.f24600d = au.m20529b(i);
        }
        if (this.f24603g != 0) {
            this.f24606j += 8;
            this.f24599c = au.m20529b(i);
        }
        if (this.f24605i != 0) {
            this.f24602f = au.m20529b(i);
            this.f24606j++;
        }
        this.f24612p = ByteBuffer.allocateDirect(this.f24606j * i).order(ByteOrder.nativeOrder());
    }

    /* renamed from: a */
    public final void mo5251a(float f, float f2) {
        this.f24610n++;
        if (this.f24603g) {
            this.f24599c.add(Float.valueOf(f));
            this.f24599c.add(Float.valueOf(f2));
            return;
        }
        throw new IllegalStateException("Texture coordinate 0 not enabled in this VBO");
    }

    /* renamed from: a */
    public final void mo5257a(af afVar, int i) {
        i = (float) i;
        this.f24598b.add(Float.valueOf(((float) afVar.m21490f()) / i));
        this.f24598b.add(Float.valueOf(((float) afVar.m21492g()) / i));
        this.f24598b.add(Float.valueOf(((float) afVar.m21494h()) / i));
        if (this.f24602f != null) {
            throw new RuntimeException("Expecting styleIndex");
        }
        this.f24608l++;
    }

    /* renamed from: a */
    public final void mo5258a(af afVar, int i, byte b) {
        i = (float) i;
        this.f24598b.add(Float.valueOf(((float) afVar.m21490f()) / i));
        this.f24598b.add(Float.valueOf(((float) afVar.m21492g()) / i));
        this.f24598b.add(Float.valueOf(((float) afVar.m21494h()) / i));
        if (this.f24602f != null) {
            this.f24602f.add(Byte.valueOf(b));
        }
        this.f24608l++;
    }

    /* renamed from: a */
    public final void mo5252a(float f, float f2, float f3) {
        this.f24598b.add(Float.valueOf(f));
        this.f24598b.add(Float.valueOf(f2));
        this.f24598b.add(Float.valueOf(f3));
        this.f24608l++;
    }

    /* renamed from: a */
    public final void mo5253a(int i) {
        if (this.f24612p == null) {
            this.f24612p = ByteBuffer.allocateDirect(this.f24606j * i).order(ByteOrder.nativeOrder());
            return;
        }
        if (this.f24606j * i > this.f24612p.capacity()) {
            i = ByteBuffer.allocateDirect(this.f24606j * i).order(ByteOrder.nativeOrder());
            if (this.f24612p.position() != 0) {
                this.f24612p.rewind();
                i.put(this.f24612p);
            }
            this.f24612p = i;
        }
    }

    /* renamed from: a */
    public final int mo5250a() {
        m29291c();
        return this.f24608l;
    }

    /* renamed from: b */
    public final int mo5261b() {
        return this.f24609m;
    }

    /* renamed from: c */
    public final void m29291c() {
        if (this.f24598b.size() != 0) {
            int size = this.f24598b.size() / 3;
            if (this.f24603g && size != this.f24599c.size() / 2) {
                int size2 = this.f24599c.size();
                StringBuilder stringBuilder = new StringBuilder(61);
                stringBuilder.append("Buffer mismatch verts = ");
                stringBuilder.append(size);
                stringBuilder.append("  tex coords = ");
                stringBuilder.append(size2);
                throw new RuntimeException(stringBuilder.toString());
            } else if (this.f24604h && size != this.f24600d.size() / 4) {
                throw new RuntimeException("Buffer mismatch");
            } else if (!this.f24605i || size == this.f24602f.size()) {
                int i = 0;
                while (i < size) {
                    try {
                        int i2 = i * 3;
                        this.f24612p.putFloat(((Float) this.f24598b.get(i2)).floatValue());
                        this.f24612p.putFloat(((Float) this.f24598b.get(i2 + 1)).floatValue());
                        this.f24612p.putFloat(((Float) this.f24598b.get(i2 + 2)).floatValue());
                        if (this.f24604h) {
                            i2 = i * 4;
                            this.f24612p.putFloat(((Float) this.f24600d.get(i2)).floatValue());
                            this.f24612p.putFloat(((Float) this.f24600d.get(i2 + 1)).floatValue());
                            this.f24612p.putFloat(((Float) this.f24600d.get(i2 + 2)).floatValue());
                            this.f24612p.putFloat(((Float) this.f24600d.get(i2 + 3)).floatValue());
                        }
                        if (this.f24603g) {
                            i2 = i * 2;
                            this.f24612p.putFloat(((Float) this.f24599c.get(i2)).floatValue());
                            this.f24612p.putFloat(((Float) this.f24599c.get(i2 + 1)).floatValue());
                        }
                        if (this.f24605i) {
                            this.f24612p.put(((Byte) this.f24602f.get(i)).byteValue());
                        }
                        i++;
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.exit(1);
                    }
                }
                this.f24598b.clear();
                if (this.f24599c != null) {
                    this.f24599c.clear();
                }
                if (this.f24600d != null) {
                    this.f24600d.clear();
                }
                if (this.f24602f != null) {
                    this.f24602f.clear();
                }
            } else {
                throw new RuntimeException("Buffer mismatch");
            }
        }
    }

    /* renamed from: d */
    public final int m29293d() {
        return this.f24611o;
    }

    /* renamed from: e */
    public final ByteBuffer m29295e() {
        m29291c();
        ByteBuffer byteBuffer = this.f24612p;
        byteBuffer.rewind();
        this.f24612p = null;
        return byteBuffer;
    }

    /* renamed from: f */
    public final void m29296f() {
        this.f24597a = null;
        if (this.f24601e != null) {
            this.f24601e.clear();
        }
        this.f24609m = 0;
        this.f24608l = 0;
        this.f24610n = 0;
        this.f24598b.clear();
        if (this.f24600d != null) {
            this.f24600d.clear();
        }
        if (this.f24599c != null) {
            this.f24599c.clear();
        }
        this.f24607k = 0;
        if (this.f24612p != null) {
            this.f24612p.clear();
        }
    }

    /* renamed from: a */
    public final void mo5259a(int[] iArr) {
        this.f24610n += iArr.length / 2;
        mo5260a(iArr, 0, iArr.length);
    }

    /* renamed from: a */
    public final void mo5260a(int[] iArr, int i, int i2) {
        this.f24610n += i2 / 2;
        for (int i3 = i; i3 < i + i2; i3++) {
            this.f24599c.add(Float.valueOf(((float) iArr[i3]) / 65536.0f));
        }
    }

    /* renamed from: a */
    public final void mo5254a(int i, int i2) {
        this.f24610n++;
        this.f24599c.add(Float.valueOf(((float) i) / 1199570944));
        this.f24599c.add(Float.valueOf(((float) i2) / 1199570944));
    }

    /* renamed from: g */
    public final int mo5265g() {
        return this.f24610n;
    }

    /* renamed from: d */
    public final void mo5264d(int i) {
        this.f24601e.add(Short.valueOf((short) i));
        this.f24609m++;
    }

    /* renamed from: a */
    public final void mo5256a(int i, int i2, int i3, int i4) {
        this.f24601e.add(Short.valueOf((short) i));
        i2 = (short) i2;
        this.f24601e.add(Short.valueOf(i2));
        i3 = (short) i3;
        this.f24601e.add(Short.valueOf(i3));
        this.f24601e.add(Short.valueOf(i3));
        this.f24601e.add(Short.valueOf(i2));
        this.f24601e.add(Short.valueOf((short) i4));
        this.f24609m += 6;
    }

    /* renamed from: a */
    public final void mo5255a(int i, int i2, int i3) {
        this.f24601e.add(Short.valueOf((short) i));
        this.f24601e.add(Short.valueOf((short) i2));
        this.f24601e.add(Short.valueOf((short) i3));
        this.f24609m += 3;
    }
}
