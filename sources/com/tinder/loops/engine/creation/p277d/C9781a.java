package com.tinder.loops.engine.creation.p277d;

import com.tinder.exception.LoopsEngineCreationException;
import com.tinder.loops.engine.creation.p275b.C9776a;
import com.tinder.loops.engine.extraction.p281c.C9797e;
import com.tinder.p260i.C9706a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.p459b.C18450a;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "", "leftPositionPercentageOfWidth", "", "topPositionPercentageOfHeight", "rightPositionPercentageOfWidth", "bottomPositionPercentageOfHeight", "(FFFF)V", "toTextureVertices", "", "getToTextureVertices", "()[F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toCroppedResolution", "Lcom/tinder/loops/engine/extraction/model/Resolution;", "resolution", "toString", "", "Companion", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.d.a */
public final class C9781a {
    /* renamed from: a */
    public static final C9780a f32416a = new C9780a();
    @NotNull
    /* renamed from: g */
    private static final C9781a f32417g = new C9781a(0.0f, 0.0f, 1.0f, 1.0f);
    @NotNull
    /* renamed from: b */
    private final float[] f32418b;
    /* renamed from: c */
    private final float f32419c;
    /* renamed from: d */
    private final float f32420d;
    /* renamed from: e */
    private final float f32421e;
    /* renamed from: f */
    private final float f32422f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/loops/engine/creation/model/CroppingRectangle$Companion;", "", "()V", "NONE", "Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "getNONE", "()Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.creation.d.a$a */
    public static final class C9780a {
        private C9780a() {
        }

        @NotNull
        /* renamed from: a */
        public final C9781a m40337a() {
            return C9781a.f32417g;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9781a) {
                C9781a c9781a = (C9781a) obj;
                if (Float.compare(this.f32419c, c9781a.f32419c) == 0 && Float.compare(this.f32420d, c9781a.f32420d) == 0 && Float.compare(this.f32421e, c9781a.f32421e) == 0 && Float.compare(this.f32422f, c9781a.f32422f) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f32419c) * 31) + Float.floatToIntBits(this.f32420d)) * 31) + Float.floatToIntBits(this.f32421e)) * 31) + Float.floatToIntBits(this.f32422f);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CroppingRectangle(leftPositionPercentageOfWidth=");
        stringBuilder.append(this.f32419c);
        stringBuilder.append(", topPositionPercentageOfHeight=");
        stringBuilder.append(this.f32420d);
        stringBuilder.append(", rightPositionPercentageOfWidth=");
        stringBuilder.append(this.f32421e);
        stringBuilder.append(", bottomPositionPercentageOfHeight=");
        stringBuilder.append(this.f32422f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9781a(float f, float f2, float f3, float f4) {
        this.f32419c = f;
        this.f32420d = f2;
        this.f32421e = f3;
        this.f32422f = f4;
        boolean a = C9776a.m40331a(this.f32419c);
        f3 = new StringBuilder();
        f3.append("Error crop rectangle left percentage ");
        f3.append(this.f32419c);
        f3.append(" is not a valid percentage");
        C9706a.m40168a(a, (Exception) new LoopsEngineCreationException(f3.toString()));
        a = C9776a.m40331a(this.f32421e);
        f3 = new StringBuilder();
        f3.append("Error crop rectangle right percentage ");
        f3.append(this.f32421e);
        f3.append(" is not a valid percentage");
        C9706a.m40168a(a, (Exception) new LoopsEngineCreationException(f3.toString()));
        a = C9776a.m40331a(this.f32422f);
        f3 = new StringBuilder();
        f3.append("Error crop rectangle bottom percentage ");
        f3.append(this.f32422f);
        f3.append(" is not a valid percentage");
        C9706a.m40168a(a, (Exception) new LoopsEngineCreationException(f3.toString()));
        a = C9776a.m40331a(this.f32420d);
        f3 = new StringBuilder();
        f3.append("Error crop rectangle top percentage ");
        f3.append(this.f32420d);
        f3.append(" is not a valid percentage");
        C9706a.m40168a(a, (Exception) new LoopsEngineCreationException(f3.toString()));
        C9706a.m40168a(this.f32419c < this.f32421e, (Exception) new LoopsEngineCreationException("Error crop rectangle left percentage is greater than right percentage"));
        C9706a.m40168a(this.f32420d < this.f32422f, (Exception) new LoopsEngineCreationException("Error crop rectangle top percentage is greater than bottom percentage"));
        this.f32418b = new float[]{this.f32419c, this.f32422f, this.f32421e, this.f32422f, this.f32419c, this.f32420d, this.f32421e, this.f32420d};
    }

    @NotNull
    /* renamed from: a */
    public final float[] m40340a() {
        return this.f32418b;
    }

    @NotNull
    /* renamed from: a */
    public final C9797e m40339a(@NotNull C9797e c9797e) {
        C2668g.b(c9797e, "resolution");
        return new C9797e(C18450a.a(((float) c9797e.m40389a()) * (this.f32421e - this.f32419c)), C18450a.a(((float) c9797e.m40390b()) * (this.f32422f - this.f32420d)));
    }
}
