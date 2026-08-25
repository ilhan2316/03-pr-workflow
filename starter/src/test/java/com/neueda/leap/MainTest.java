package com.neueda.leap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void greetingUsesProvidedName() {
        String result = Main.greetingForArgs(new String[] {"pair-team"});
        assertEquals("Hello pair-team from Sprint 1", result);
    }

    @Test
    void greetingFallsBackToTeamWhenNoArgsProvided() {
        String result = Main.greetingForArgs(new String[] {});
        assertEquals("Hello team from Sprint 1", result);
    }
}
