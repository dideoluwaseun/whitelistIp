package com.seun.whitelistip.model;

import lombok.*;

import java.util.HashMap;
import java.util.Map;
@RequiredArgsConstructor
@Getter
@Setter
public class IpDataStore {
    private static IpDataStore instance;
    private final Map<String, String> ipMap = new HashMap<>();

    public static IpDataStore getInstance() {
        if (instance == null)
            instance = new IpDataStore();
        return instance;
    }

    public boolean isWhitelisted(String ipAddress) {
        return ipMap.containsValue(ipAddress);
    }

    public void addToWhitelist(String index, String ipAddress) {
        ipMap.put(index, ipAddress);
    }

    public void deleteFromWhitelist(String ipAddress) {
        ipMap.values().remove(ipAddress);
    }
}
