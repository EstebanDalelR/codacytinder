package com.tinder.cardstack.view;

import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.cardstack.model.SwipeDirection;

public interface CardDecorationListener {
    void onDecorationDraw(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2);

    void onDecorationDrawOver(@NonNull Canvas canvas, @NonNull View view, @NonNull ViewGroup viewGroup, float f, float f2, float f3, @NonNull SwipeDirection swipeDirection, boolean z, boolean z2);
}
