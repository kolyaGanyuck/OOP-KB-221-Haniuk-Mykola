package lab03v2;

import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private final int maxTickets;
    private final int sprintEstimate;
    private static int currentEstimate = 0;

    private List<Ticket> ticketList = new ArrayList<>();


    Sprint(int maxTickets, int sprintEstimate) {
        this.maxTickets = maxTickets;
        this.sprintEstimate = sprintEstimate;
    }

    public boolean addTicket(Ticket ticket) {
        if (checkEstimate(ticket)) {
            ticketList.add(ticket);
            return true;
        }
        return false;
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory != null && !userStory.isUserStoryComplete() && checkEstimate(userStory)) {
            ticketList.add(userStory);
            return true;
        }
        return false;
    }


    public boolean addBug(Bug bugReport) {
        if (bugReport != null && !bugReport.isBugIsComplete() && checkEstimate(bugReport)) {
            ticketList.add(bugReport);
            return true;
        }
        return false;
    }

    public boolean checkEstimate(Ticket ticket) {
        if (currentEstimate + ticket.getEstimate() <= sprintEstimate && ticketList.size() < maxTickets) {
            currentEstimate += ticket.getEstimate();
            return true;
        }
        return false;
    }

    public List<Ticket> getCopyOfTickets() {
        return ticketList;
    }

    public String getTotalEstimate() {
        int time = 0;
        for (Ticket ticket : ticketList) {
            time += ticket.getEstimate();
        }
        return "Час виконання всіх тікетів становить: " + time;
    }

}
