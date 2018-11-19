package org.joda.time.format;

public interface DateTimeParser {
    int estimateParsedLength();

    int parseInto(C19319c c19319c, String str, int i);
}
