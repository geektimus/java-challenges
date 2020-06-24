package com.codingmaniacs.others;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectionChallenges {

    private static final Pattern pattern = Pattern.compile("^(\\d+)\\s(\\w+)\\s(.*)$");

    public static String[] sortLogsByLevel(String[] myLogInfo) {
        List<LogEntry> result = sortLogEntriesByLevel(parseLinesToLogEntries(myLogInfo));
        return result.stream().map(LogEntry::toString).toArray(String[]::new);
    }
    public static String[] sortLogsByTs(String[] myLogInfo) {
        List<LogEntry> result = sortLogEntriesByTs(parseLinesToLogEntries(myLogInfo));
        return result.stream().map(LogEntry::toString).toArray(String[]::new);
    }

    private enum LogLevel {
        OFF,
        FATAL,
        ERROR,
        WARNING,
        INFO,
        DEBUG,
        TRACE,
        ALL;
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

    public static List<LogEntry> parseLinesToLogEntries(String[] logLines) {
        List<LogEntry> result = new ArrayList<>(logLines.length);

        for (String line : logLines) {
            result.add(getLogEntryFromLine(line));
        }
        return result;
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

    public static List<LogEntry> sortLogEntriesByLevel(List<LogEntry> entries) {
        entries.sort(Comparator.comparing(LogEntry::getLevel));
        return entries;
    }

    public static List<LogEntry> sortLogEntriesByTs(List<LogEntry> entries) {
        entries.sort(Comparator.comparing(LogEntry::getTimestamp));
        return entries;
    }
}
