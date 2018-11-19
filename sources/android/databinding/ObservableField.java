package android.databinding;

import android.support.annotation.Nullable;
import java.io.Serializable;

public class ObservableField<T> extends C3984b implements Serializable {
    static final long serialVersionUID = 1;
    private T mValue;

    public ObservableField(T t) {
        this.mValue = t;
    }

    public ObservableField(Observable... observableArr) {
        super(observableArr);
    }

    @Nullable
    public T get() {
        return this.mValue;
    }

    public void set(T t) {
        if (t != this.mValue) {
            this.mValue = t;
            notifyChange();
        }
    }
}
