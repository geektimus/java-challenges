package com.codingmaniacs.others;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectionChallenges {

    private static final Pattern pattern = Pattern.compile("^(\\d+)\\s(\\w+)\\s(.*)$");

    @SuppressWarnings("unused")
    private enum LogLevel {
        OFF,
        FATAL,
        ERROR,
        WARNING,
        INFO,
        DEBUG,
        TRACE,
        ALL
    }

    private static class LogEntry {
        private final Long timestamp;
        private final LogLevel level;
        private final String content;

        LogEntry(Long timestamp, LogLevel logLevel, String content) {
            this.timestamp = timestamp;
            this.level = logLevel;
            this.content = content;
        }

        public LogLevel getLevel() {
            return level;
        }

        public Long getTimestamp() {
            return timestamp;
        }

        @Override
        public String toString() {
            return timestamp + " " + level + " " + content;
        }
    }

    public static LogEntry getLogEntryFromLine(String logLine) {
        Matcher matcher = pattern.matcher(logLine);

        long ts = 0L;
        LogLevel ll = LogLevel.OFF;
        String content = "";

        while (matcher.find()) {
            ts = Long.parseLong(matcher.group(1));
            ll = LogLevel.valueOf(matcher.group(2));
            content = matcher.group(3);
        }

        return new LogEntry(ts, ll, content);
    }

    public static String[] sortLogs(String[] myLogInfo) {
        Comparator <LogEntry> comparator = Comparator.comparing(LogEntry::getLevel)
                .thenComparing(LogEntry::getTimestamp);

        return Arrays.stream(myLogInfo)
                .map(CollectionChallenges::getLogEntryFromLine)
                .sorted(comparator)
                .map(LogEntry::toString)
                .toArray(String[]::new);
    }
}
