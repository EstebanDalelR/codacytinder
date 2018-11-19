package com.tinder.domain.typingindicator;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/typingindicator/TypingIndicatorConfig;", "", "()V", "Config", "NoConfig", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig$Config;", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig$NoConfig;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class TypingIndicatorConfig {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/tinder/domain/typingindicator/TypingIndicatorConfig$Config;", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig;", "heartbeat", "", "timeToLive", "(JJ)V", "getHeartbeat", "()J", "getTimeToLive", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Config extends TypingIndicatorConfig {
        private final long heartbeat;
        private final long timeToLive;

        @NotNull
        public static /* synthetic */ Config copy$default(Config config, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = config.heartbeat;
            }
            if ((i & 2) != 0) {
                j2 = config.timeToLive;
            }
            return config.copy(j, j2);
        }

        public final long component1() {
            return this.heartbeat;
        }

        public final long component2() {
            return this.timeToLive;
        }

        @NotNull
        public final Config copy(long j, long j2) {
            return new Config(j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Config) {
                Config config = (Config) obj;
                if ((this.heartbeat == config.heartbeat ? 1 : null) != null) {
                    if ((this.timeToLive == config.timeToLive ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            long j = this.heartbeat;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.timeToLive;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Config(heartbeat=");
            stringBuilder.append(this.heartbeat);
            stringBuilder.append(", timeToLive=");
            stringBuilder.append(this.timeToLive);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Config(long j, long j2) {
            super();
            this.heartbeat = j;
            this.timeToLive = j2;
            j = null;
            if ((this.heartbeat > 0 ? 1 : null) == null) {
                throw new IllegalArgumentException("heartbeat must be greater than 0".toString());
            }
            if ((this.timeToLive > 0 ? 1 : null) == null) {
                throw new IllegalArgumentException("timeToLive must be greater than 0".toString());
            }
            if (this.timeToLive > this.heartbeat) {
                j = 1;
            }
            if (j == null) {
                throw new IllegalArgumentException("timeToLive must be greater than heartbeat".toString());
            }
        }

        public final long getHeartbeat() {
            return this.heartbeat;
        }

        public final long getTimeToLive() {
            return this.timeToLive;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/typingindicator/TypingIndicatorConfig$NoConfig;", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig;", "()V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class NoConfig extends TypingIndicatorConfig {
        public static final NoConfig INSTANCE = new NoConfig();

        private NoConfig() {
            super();
        }
    }

    private TypingIndicatorConfig() {
    }
}
