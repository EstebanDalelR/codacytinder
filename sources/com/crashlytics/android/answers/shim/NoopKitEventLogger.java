package com.crashlytics.android.answers.shim;

class NoopKitEventLogger implements KitEventLogger {
    public void logKitEvent(KitEvent kitEvent) {
    }

    NoopKitEventLogger() {
    }

    public static KitEventLogger create() {
        return new NoopKitEventLogger();
    }
}
