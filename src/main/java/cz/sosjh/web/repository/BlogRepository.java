package cz.sosjh.web.repository;

import cz.sosjh.web.model.BlogEntry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BlogRepository {

    private BlogRepository() {
        // static repository, do not initialize
    }

    private static List<BlogEntry> entries = new ArrayList<>();

    public static void add(BlogEntry entry) {
        entries.add(entry);
    }

    public static List<BlogEntry> getAll() {
        return Collections.unmodifiableList(entries);
    }
}
