package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {
    /* renamed from: a */
    private final GeneratedAdapter[] f12626a;

    CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.f12626a = generatedAdapterArr;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Event event) {
        C0022h c0022h = new C0022h();
        int i = 0;
        for (GeneratedAdapter callMethods : this.f12626a) {
            callMethods.callMethods(lifecycleOwner, event, false, c0022h);
        }
        GeneratedAdapter[] generatedAdapterArr = this.f12626a;
        int length = generatedAdapterArr.length;
        while (i < length) {
            generatedAdapterArr[i].callMethods(lifecycleOwner, event, true, c0022h);
            i++;
        }
    }
}
