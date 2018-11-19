package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;

public interface AnimatableValue<K, A> {

    public interface Factory<V> {
        V valueFromObject(Object obj, float f);
    }

    BaseKeyframeAnimation<K, A> createAnimation();

    boolean hasAnimation();
}
