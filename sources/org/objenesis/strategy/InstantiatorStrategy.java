package org.objenesis.strategy;

import org.objenesis.instantiator.ObjectInstantiator;

public interface InstantiatorStrategy {
    <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> cls);
}
