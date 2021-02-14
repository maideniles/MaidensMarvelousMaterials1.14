package io.github.stevebeeblebrox;

import java.io.IOException;
import java.util.LinkedHashMap;

public class WikiHelper {
    public static final String PAGE_LIST_URL = "https://maideniles.github.io/mods/maidensmarvelousmaterials/wiki/pages/pages.txt";
    public static final LinkedHashMap<String, LinkedHashMap<String, WikiEntry>> PAGES = new LinkedHashMap<String, LinkedHashMap<String, WikiEntry>>();
    public static String getPageURL(String category, String page) {
        return "https://maideniles.github.io/mods/maidensmarvelousmaterials/wiki/pages/"+category+"/"+page+".txt";
    }
    public static boolean loadPageStructure() {
        if(!PAGES.isEmpty()) return true;
        try {
            String src = HTTPHelper.GET(PAGE_LIST_URL);
            for(String line : src.split("\n")) {
                line = line.trim();
                if(line.equals("") || line.startsWith("//")) continue;
                String[] args = line.split(";");
                String[] path = args[0].split(":");
                String category = path[0];
                
                PAGES.putIfAbsent(category, new LinkedHashMap<String, WikiEntry>());
                PAGES.get(category).put(path[1], new WikiEntry(args[1]));
            }
            System.out.println(PAGES);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean loadPage(String category, String page) {
        if(PAGES.containsKey(category) && PAGES.get(category).containsKey(page)) {
            WikiEntry entry = PAGES.get(category).get(page);
            if(entry.hasSource()) return true;
            try {
                entry.source = HTTPHelper.GET(getPageURL(category, page));
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
    public static WikiEntry getPage(String category, String page) {
        loadPage(category, page);
        if(PAGES.containsKey(category) && PAGES.get(category).containsKey(page))
            return PAGES.get(category).get(page);
        return null;
    }
    public static class WikiEntry {
        public String name = null;
        public String source = null;
        public WikiEntry(String name) {
            this.name = name;
        }
        public boolean hasSource() {
            return this.source != null;
        }
    }
}
