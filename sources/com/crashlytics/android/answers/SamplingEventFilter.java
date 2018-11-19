package com.crashlytics.android.answers;

import java.util.HashSet;
import java.util.Set;

class SamplingEventFilter implements EventFilter {
    static final Set<Type> EVENTS_TYPE_TO_SAMPLE = new C10831();
    final int samplingRate;

    /* renamed from: com.crashlytics.android.answers.SamplingEventFilter$1 */
    static class C10831 extends HashSet<Type> {
        C10831() {
            add(Type.START);
            add(Type.RESUME);
            add(Type.PAUSE);
            add(Type.STOP);
        }
    }

    public SamplingEventFilter(int i) {
        this.samplingRate = i;
    }

    public boolean skipEvent(SessionEvent sessionEvent) {
        Object obj = (EVENTS_TYPE_TO_SAMPLE.contains(sessionEvent.type) && sessionEvent.sessionEventMetadata.betaDeviceToken == null) ? 1 : null;
        sessionEvent = Math.abs(sessionEvent.sessionEventMetadata.installationId.hashCode() % this.samplingRate) != null ? true : null;
        if (obj == null || sessionEvent == null) {
            return false;
        }
        return true;
    }
}
