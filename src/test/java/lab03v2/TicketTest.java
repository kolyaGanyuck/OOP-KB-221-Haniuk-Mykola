package lab03v2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicketTest {
    private Ticket ticket;
    @BeforeEach
    void setUp() {
        ticket = new Ticket("ticket_1", 1);
    }

    @Test
    void complete() {
        ticket.complete();
        Assertions.assertTrue(ticket.isCompleted());
    }
}