package com.tinder.cardstack.cardgrid.view;

import com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector.ClickActionRecognizer;
import com.tinder.cardstack.cardgrid.swipe.p186a.C8378a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/ClickActionRecognizerImpl;", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$ClickActionRecognizer;", "configuration", "Lcom/tinder/cardstack/cardgrid/view/ClickActionRecognizerImpl$Configuration;", "(Lcom/tinder/cardstack/cardgrid/view/ClickActionRecognizerImpl$Configuration;)V", "isClick", "", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "Configuration", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.view.b */
public final class C10482b implements ClickActionRecognizer {
    /* renamed from: a */
    private final C8384a f34093a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/ClickActionRecognizerImpl$Configuration;", "", "minDisplacementForClick", "", "(F)V", "getMinDisplacementForClick", "()F", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.b$a */
    public static final class C8384a {
        /* renamed from: a */
        private final float f29759a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8384a) {
                    if (Float.compare(this.f29759a, ((C8384a) obj).f29759a) == 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f29759a);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Configuration(minDisplacementForClick=");
            stringBuilder.append(this.f29759a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8384a(float f) {
            this.f29759a = f;
        }

        /* renamed from: a */
        public final float m35746a() {
            return this.f29759a;
        }
    }

    public C10482b(@NotNull C8384a c8384a) {
        C2668g.b(c8384a, "configuration");
        this.f34093a = c8384a;
    }

    public boolean isClick(@NotNull C8378a c8378a) {
        C2668g.b(c8378a, "pointer");
        return c8378a.m35732f().m35604a() <= this.f34093a.m35746a() ? true : null;
    }
}
