package com.tinder.superlikeable.view;

import android.animation.PropertyValuesHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u001a\u001a\u00020\b*\u00060\fj\u0002`\rH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000\"\u0012\u0010\u000b\u001a\u00060\fj\u0002`\rXT¢\u0006\u0002\n\u0000\"\u0012\u0010\u000e\u001a\u00060\fj\u0002`\rXT¢\u0006\u0002\n\u0000\"\u0012\u0010\u000f\u001a\u00060\fj\u0002`\rXT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0010\u001a\u00060\fj\u0002`\rXT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0011\u001a\u00060\fj\u0002`\rXT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0012\u001a\u00060\fj\u0002`\rXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0015XT¢\u0006\u0002\n\u0000*\f\b\u0000\u0010\u001b\"\u00020\f2\u00020\f*<\b\u0000\u0010\u001c\"\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001f0\u001d2\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001f0\u001d¨\u0006 "}, d2 = {"CARD_SCALE_DEFAULT", "", "CARD_SCALE_ON_TOUCHED", "DURATION_DEFAULT_MS", "", "ON_SELECTED_SCALE_UP_DURATION_MS", "ON_UNSELECTED_RECOVER_DURATION_MS", "PROPERTY_SCALE", "", "PROPERTY_TRANSLATE_X", "PROPERTY_TRANSLATE_Y", "STATE_DRAG", "", "Lcom/tinder/superlikeable/view/DragState;", "STATE_FLING", "STATE_FLING_COMPLETE", "STATE_IDLE", "STATE_SELECTED", "STATE_SETTLING", "TRANSLATION_DEFAULT_PX", "VELOCITY_UNITS_PIXELS_PER_SECOND", "", "createProperty", "Landroid/animation/PropertyValuesHolder;", "property", "defaultValue", "toReadableString", "DragState", "OnViewMovedListener", "Lkotlin/Function3;", "Landroid/view/View;", "", "superlikeable_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.view.e */
public final class C15178e {
    @NotNull
    /* renamed from: a */
    public static final String m57069a(byte b) {
        switch (b) {
            case (byte) 0:
                return "STATE_IDLE";
            case (byte) 1:
                return "STATE_SELECTED";
            case (byte) 2:
                return "STATE_SETTLING";
            case (byte) 3:
                return "STATE_DRAG";
            case (byte) 4:
                return "STATE_FLING";
            case (byte) 5:
                return "STATE_FLING_COMPLETE";
            default:
                return "Unknown";
        }
    }

    @NotNull
    /* renamed from: a */
    public static final PropertyValuesHolder m57068a(@NotNull String str, float f) {
        C2668g.b(str, "property");
        str = PropertyValuesHolder.ofFloat(str, new float[]{f});
        C2668g.a(str, "PropertyValuesHolder.ofF…t(property, defaultValue)");
        return str;
    }
}
