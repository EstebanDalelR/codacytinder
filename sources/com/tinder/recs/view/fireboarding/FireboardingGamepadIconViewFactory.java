package com.tinder.recs.view.fireboarding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.tinder.R;
import com.tinder.fireboarding.domain.Level;
import com.tinder.fireboarding.view.reccard.FireboardingLevelIconViewFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/recs/view/fireboarding/FireboardingGamepadIconViewFactory;", "Lcom/tinder/fireboarding/view/reccard/FireboardingLevelIconViewFactory;", "()V", "create", "Landroid/view/View;", "context", "Landroid/content/Context;", "level", "Lcom/tinder/fireboarding/domain/Level;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FireboardingGamepadIconViewFactory implements FireboardingLevelIconViewFactory {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Level.values().length];

        static {
            $EnumSwitchMapping$0[Level.REWIND.ordinal()] = 1;
            $EnumSwitchMapping$0[Level.SUPERLIKE.ordinal()] = 2;
            $EnumSwitchMapping$0[Level.BOOST.ordinal()] = 3;
        }
    }

    @NotNull
    public View create(@NotNull Context context, @NotNull Level level) {
        C2668g.b(context, "context");
        C2668g.b(level, "level");
        context = LayoutInflater.from(context);
        switch (WhenMappings.$EnumSwitchMapping$0[level.ordinal()]) {
            case 1:
                context = context.inflate(R.layout.include_view_gamepad_rewind_button, null);
                C2668g.a(context, "inflater.inflate(R.layou…epad_rewind_button, null)");
                return context;
            case 2:
                context = context.inflate(R.layout.include_view_gamepad_superlike_button, null);
                C2668g.a(context, "inflater.inflate(R.layou…d_superlike_button, null)");
                return context;
            case 3:
                context = context.inflate(R.layout.include_view_gamepad_boost_button, null);
                C2668g.a(context, "inflater.inflate(R.layou…mepad_boost_button, null)");
                return context;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Trying to create a view for ");
                stringBuilder.append(level);
                throw ((Throwable) new IllegalStateException(stringBuilder.toString()));
        }
    }
}
