package com.tinder.activities;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import com.tinder.R;
import com.tinder.utils.an;

class LoginActivity$1 extends an {
    /* renamed from: a */
    final /* synthetic */ LoginActivity f26195a;

    LoginActivity$1(LoginActivity loginActivity) {
        this.f26195a = loginActivity;
    }

    public void onAnimationEnd(Animator animator) {
        animator = new Intent(this.f26195a, MainActivity.class);
        Bundle extras = this.f26195a.getIntent().getExtras();
        if (extras != null) {
            animator.putExtras(extras);
        }
        this.f26195a.startActivity(animator);
        this.f26195a.overridePendingTransition(0, R.anim.anim_quick_fade_out);
        this.f26195a.finish();
    }
}
