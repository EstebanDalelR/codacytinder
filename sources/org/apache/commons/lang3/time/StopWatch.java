package org.apache.commons.lang3.time;

public class StopWatch {
    /* renamed from: a */
    private State f49754a;
    /* renamed from: b */
    private long f49755b;
    /* renamed from: c */
    private long f49756c;

    private enum SplitState {
        SPLIT,
        UNSPLIT
    }

    private enum State {
        UNSTARTED {
            boolean isStarted() {
                return false;
            }

            boolean isStopped() {
                return true;
            }

            boolean isSuspended() {
                return false;
            }
        },
        RUNNING {
            boolean isStarted() {
                return true;
            }

            boolean isStopped() {
                return false;
            }

            boolean isSuspended() {
                return false;
            }
        },
        STOPPED {
            boolean isStarted() {
                return false;
            }

            boolean isStopped() {
                return true;
            }

            boolean isSuspended() {
                return false;
            }
        },
        SUSPENDED {
            boolean isStarted() {
                return true;
            }

            boolean isStopped() {
                return false;
            }

            boolean isSuspended() {
                return true;
            }
        };

        abstract boolean isStarted();

        abstract boolean isStopped();

        abstract boolean isSuspended();
    }

    /* renamed from: a */
    public long m60752a() {
        return m60753b() / 1000000;
    }

    /* renamed from: b */
    public long m60753b() {
        if (this.f49754a != State.STOPPED) {
            if (this.f49754a != State.SUSPENDED) {
                if (this.f49754a == State.UNSTARTED) {
                    return 0;
                }
                if (this.f49754a == State.RUNNING) {
                    return System.nanoTime() - this.f49755b;
                }
                throw new RuntimeException("Illegal running state has occurred.");
            }
        }
        return this.f49756c - this.f49755b;
    }

    public String toString() {
        return C16004b.m60761a(m60752a());
    }
}
