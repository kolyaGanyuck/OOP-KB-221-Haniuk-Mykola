package lab03v2;

import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private int maxTickets;
    private int sprintEstimate;

    private List<Ticket> ticketList = new ArrayList<>();
    private List<Ticket> userStories = new ArrayList<>();
    private List<Ticket> bugList = new ArrayList<>();

    Sprint(int maxTickets, int sprintEstimate){
        this.maxTickets = maxTickets;
        this.sprintEstimate = sprintEstimate;
    }

    public boolean addTicket(Ticket ticket) {
        if (ticketList.size() < maxTickets) {
            ticketList.add(ticket);
            return true;
        }
        return false;
    }

    public boolean addUserStory(UserStory userStory) {
        if (userStory != null && !userStory.isUserStoryComplete()) {
            userStories.add(userStory);
            return true;
        }
        return false;
    }

    public boolean addBug(Bug bugReport) {
        if (bugReport != null && !bugReport.isBugIsComplete()) {
            bugList.add(bugReport);
            return true;
        }
        return false;
    }

    public List<Ticket> getCopyOfTickets(){
        return ticketList;
    }

    public int getTotalEstimate(){
        int time = 0;
        for (Ticket ticket : ticketList){
            time += ticket.getEstimate();
        }
        return time;
    }

}
