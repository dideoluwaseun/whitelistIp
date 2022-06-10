package com.seun.whitelistip.serviceImpl;

import com.seun.whitelistip.service.IpDataStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StartUp implements CommandLineRunner {
    private final IpDataStoreService ipDataStoreService;
    @Override
    public void run(String... args) throws Exception {
            ipDataStoreService.addToWhitelist("1", "0:0:0:0:0:0:0:1");
    }
}
