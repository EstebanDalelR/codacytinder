package com.foursquare.api;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.foursquare.api.types.PilgrimStackTraceElement;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class PilgrimException {
    private final String className;
    private final String message;
    private final String packageName;
    private final List<PilgrimStackTraceElement> stacktrace;

    public PilgrimException(Exception exception, List<PilgrimStackTraceElement> list) {
        this.message = exception.getMessage();
        String str = null;
        this.className = exception.getClass() != null ? exception.getClass().getSimpleName() : null;
        exception = exception.getClass() != null ? exception.getClass().getPackage() : null;
        if (exception != null) {
            str = exception.getName();
        }
        this.packageName = str;
        this.stacktrace = list;
    }

    public String getMessage() {
        return this.message;
    }

    public String getClassName() {
        return this.className;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public List<PilgrimStackTraceElement> getStacktrace() {
        return this.stacktrace;
    }
}
