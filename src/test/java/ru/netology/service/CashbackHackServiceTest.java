package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @org.junit.jupiter.api.Test
    public void shouldTestRemain() {
        assertEquals(100,cashbackHackService.remain(900));
    }

    @Test
    public void shouldNoGiveCashBackIfAmountEqualBoundary() {
       assertEquals(0,cashbackHackService.remain(1000));
    }

}
