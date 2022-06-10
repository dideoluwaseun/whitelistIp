package com.seun.whitelistip.serviceImpl;

import com.seun.whitelistip.exception.ResourceAlreadyExistsException;
import com.seun.whitelistip.exception.ResourceNotFoundException;
import com.seun.whitelistip.model.IpDataStore;
import com.seun.whitelistip.service.IpDataStoreService;
import org.springframework.stereotype.Service;

@Service
public class IpDataStoreServiceImpl implements IpDataStoreService {
    private final IpDataStore ipDataStore = IpDataStore.getInstance();

    @Override
    public void addToWhitelist(String index, String ipAddress) {
        if(ipDataStore.isWhitelisted(ipAddress)) {
            throw new ResourceAlreadyExistsException("Ip address already whitelisted");
        }
        ipDataStore.addToWhitelist(index, ipAddress);
    }

    @Override
    public void deleteFromWhitelist(String ipAddress) {
        if(!ipDataStore.isWhitelisted(ipAddress)) {
            throw new ResourceNotFoundException("Ip address not whitelisted.");
        }
        ipDataStore.deleteFromWhitelist(ipAddress);
    }

    public boolean isWhitelisted(String ipAddress) {
        return ipDataStore.isWhitelisted(ipAddress);
    }

}
