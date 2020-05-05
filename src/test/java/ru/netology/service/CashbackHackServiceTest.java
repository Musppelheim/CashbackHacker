package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldTestRemain() {
        assertEquals(100,cashbackHackService.remain(900));
    }

    @Test
    public void shouldNoGiveCashBackIfAmountEqualBoundary() {
       assertEquals(0,cashbackHackService.remain(1000));
    }
}