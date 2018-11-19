package com.google.android.exoplayer2.scheduler;

public final class RequirementsWatcher {

    public interface Listener {
        void requirementsMet(RequirementsWatcher requirementsWatcher);

        void requirementsNotMet(RequirementsWatcher requirementsWatcher);
    }

    public String toString() {
        return super.toString();
    }
}
