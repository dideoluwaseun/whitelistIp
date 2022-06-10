package com.seun.whitelistip.exception;

public class InvalidIpAddressException extends RuntimeException {
    public InvalidIpAddressException() {
    }

    public InvalidIpAddressException(String message) {
        super(message);
    }
}
