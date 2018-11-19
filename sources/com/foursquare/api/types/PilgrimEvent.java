package com.foursquare.api.types;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.foursquare.api.PilgrimException;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class PilgrimEvent {
    private EventType eventType;
    private List<PilgrimException> exceptions;
    private EventLevel level;
    private String message;
    private long timestamp;

    public static class Builder {
        private final EventType eventType = EventType.ERROR;
        private EventLevel level;
        private String message;
        private List<PilgrimException> pilgrimExceptionList;
        private long timestamp;

        public Builder timestamp(long j) {
            this.timestamp = j;
            return this;
        }

        public Builder level(EventLevel eventLevel) {
            this.level = eventLevel;
            return this;
        }

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder pilgrimExceptions(List<PilgrimException> list) {
            this.pilgrimExceptionList = list;
            return this;
        }

        public PilgrimEvent build() {
            return new PilgrimEvent();
        }
    }

    public enum EventLevel {
        ERROR,
        WARNING;

        public static com.foursquare.api.types.PilgrimEvent.EventLevel fromString(java.lang.String r0) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = valueOf(r0);	 Catch:{ Exception -> 0x0005 }
            return r0;
        L_0x0005:
            r0 = WARNING;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.foursquare.api.types.PilgrimEvent.EventLevel.fromString(java.lang.String):com.foursquare.api.types.PilgrimEvent$EventLevel");
        }
    }

    public enum EventType {
        ERROR
    }

    private PilgrimEvent(Builder builder) {
        this.timestamp = builder.timestamp;
        this.eventType = builder.eventType;
        this.level = builder.level;
        this.message = builder.message;
        this.exceptions = builder.pilgrimExceptionList;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public EventType getEventType() {
        return this.eventType;
    }

    public EventLevel getLevel() {
        return this.level;
    }

    public String getMessage() {
        return this.message;
    }

    public List<PilgrimException> getPilgrimExceptions() {
        return this.exceptions;
    }
}
