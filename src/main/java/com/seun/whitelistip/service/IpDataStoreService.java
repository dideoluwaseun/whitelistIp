package com.seun.whitelistip.service;

public interface IpDataStoreService {
    boolean isWhitelisted(String ipAddress);
    void addToWhitelist(String index, String ipAddress);
    void deleteFromWhitelist(String ipAddress);
}
