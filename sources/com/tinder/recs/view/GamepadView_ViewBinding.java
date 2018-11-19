package com.tinder.recs.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.boost.view.BoostButtonView;

public class GamepadView_ViewBinding implements Unbinder {
    private GamepadView target;
    private View view2131362603;
    private View view2131362604;
    private View view2131362605;
    private View view2131362606;

    @UiThread
    public GamepadView_ViewBinding(GamepadView gamepadView) {
        this(gamepadView, gamepadView);
    }

    @UiThread
    public GamepadView_ViewBinding(final GamepadView gamepadView, View view) {
        this.target = gamepadView;
        gamepadView.boostButtonView = (BoostButtonView) C0761c.b(view, R.id.gamepad_boost, "field 'boostButtonView'", BoostButtonView.class);
        View a = C0761c.a(view, R.id.gamepad_like, "field 'likeButton' and method 'onGamepadButtonClick'");
        gamepadView.likeButton = (LikeButton) C0761c.c(a, R.id.gamepad_like, "field 'likeButton'", LikeButton.class);
        this.view2131362603 = a;
        a.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                gamepadView.onGamepadButtonClick(view);
            }
        });
        a = C0761c.a(view, R.id.gamepad_pass, "field 'passButton' and method 'onGamepadButtonClick'");
        gamepadView.passButton = (IconGamepadButton) C0761c.c(a, R.id.gamepad_pass, "field 'passButton'", IconGamepadButton.class);
        this.view2131362604 = a;
        a.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                gamepadView.onGamepadButtonClick(view);
            }
        });
        a = C0761c.a(view, R.id.gamepad_rewind, "field 'rewindButton' and method 'onGamepadButtonClick'");
        gamepadView.rewindButton = (IconGamepadButton) C0761c.c(a, R.id.gamepad_rewind, "field 'rewindButton'", IconGamepadButton.class);
        this.view2131362605 = a;
        a.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                gamepadView.onGamepadButtonClick(view);
            }
        });
        a = C0761c.a(view, R.id.gamepad_superlike, "field 'superLikeButton' and method 'onGamepadButtonClick'");
        gamepadView.superLikeButton = (SuperLikeButton) C0761c.c(a, R.id.gamepad_superlike, "field 'superLikeButton'", SuperLikeButton.class);
        this.view2131362606 = a;
        a.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                gamepadView.onGamepadButtonClick(view);
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        gamepadView.boostEndGradientColor = C0432b.c(view, R.color.boost_intro_gradient_end);
        gamepadView.boostStartGradientColor = C0432b.c(view, R.color.boost_intro_gradient_start);
        gamepadView.boostReminderTooltipMessage = resources.getString(R.string.boost_tool_tip);
    }

    @CallSuper
    public void unbind() {
        GamepadView gamepadView = this.target;
        if (gamepadView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        gamepadView.boostButtonView = null;
        gamepadView.likeButton = null;
        gamepadView.passButton = null;
        gamepadView.rewindButton = null;
        gamepadView.superLikeButton = null;
        this.view2131362603.setOnClickListener(null);
        this.view2131362603 = null;
        this.view2131362604.setOnClickListener(null);
        this.view2131362604 = null;
        this.view2131362605.setOnClickListener(null);
        this.view2131362605 = null;
        this.view2131362606.setOnClickListener(null);
        this.view2131362606 = null;
    }
}
