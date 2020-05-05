package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldTestRemain() {
        assertEquals(cashbackHackService.remain(900),100);
    }

    @Test
    public void shouldNoGiveCashBackIfAmountEqualBoundary() {
        assertEquals(cashbackHackService.remain(1000),1000);
    }
}