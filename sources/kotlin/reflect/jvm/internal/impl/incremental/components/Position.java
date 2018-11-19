package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

public final class Position implements Serializable {
    public static final Companion Companion = new Companion();
    @NotNull
    private static final Position NO_POSITION = new Position(-1, -1);
    private final int column;
    private final int line;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Position getNO_POSITION() {
            return Position.NO_POSITION;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Position) {
            Position position = (Position) obj;
            if ((this.line == position.line ? 1 : null) != null) {
                if ((this.column == position.column ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.line * 31) + this.column;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Position(line=");
        stringBuilder.append(this.line);
        stringBuilder.append(", column=");
        stringBuilder.append(this.column);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Position(int i, int i2) {
        this.line = i;
        this.column = i2;
    }
}
