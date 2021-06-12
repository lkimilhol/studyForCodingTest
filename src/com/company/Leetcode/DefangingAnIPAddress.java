package com.company.Leetcode;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        String[] number = address.split("\\.");
        return String.join("[.]", number);
    }
}
