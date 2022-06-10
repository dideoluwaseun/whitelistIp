package com.seun.whitelistip.api;

import com.seun.whitelistip.service.IpDataStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/hello")
public class IpDataStoreController {
    private final IpDataStoreService ipDataStoreService;

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok().body("Hello Whitelisted");
    }

    @PostMapping
    public ResponseEntity<String> addIpToWhitelist(@RequestParam String index, @RequestParam String ipAddress) {
        ipDataStoreService.addToWhitelist(index, ipAddress);
        return ResponseEntity.ok().body("Ip address whitelisted successfully.");
    }

    @DeleteMapping
    public ResponseEntity<String> removeIpFromWhitelist(@RequestParam String ipAddress) {
        ipDataStoreService.deleteFromWhitelist(ipAddress);
        return ResponseEntity.ok().body("Ip address removed from whitelist successfully.");
    }
}
