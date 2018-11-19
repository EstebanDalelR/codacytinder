package com.tinder.recs.animation;

import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public abstract class RecProfileAnimationDecorator {
    private List<Listener> listeners = new ArrayList();

    public interface EndListener {
        void onAnimationEnd();
    }

    public interface StartListener {
        void onAnimationStart();
    }

    public enum State {
        INITIALIZED,
        RUNNING,
        FINISHED
    }

    private abstract class Listener implements EndListener, StartListener {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }

        private Listener() {
        }
    }

    public abstract void animate();

    public abstract State getState();

    public void addStartListener(@NonNull final StartListener startListener) {
        this.listeners.add(new Listener() {
            public void onAnimationStart() {
                startListener.onAnimationStart();
            }
        });
    }

    public void addEndListener(@NonNull final EndListener endListener) {
        this.listeners.add(new Listener() {
            public void onAnimationEnd() {
                endListener.onAnimationEnd();
            }
        });
    }

    final void notifyAnimationStart() {
        for (Listener onAnimationStart : this.listeners) {
            onAnimationStart.onAnimationStart();
        }
    }

    final void notifyAnimationEnd() {
        for (Listener onAnimationEnd : this.listeners) {
            onAnimationEnd.onAnimationEnd();
        }
        this.listeners.clear();
    }
}
