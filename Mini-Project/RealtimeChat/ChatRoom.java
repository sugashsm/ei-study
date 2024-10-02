import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String roomId;
    private List<User> users;
    private List<Message> messageHistory;

    public ChatRoom(String roomId) {
        this.roomId = roomId;
        this.users = new ArrayList<>();
        this.messageHistory = new ArrayList<>();
    }

    public String getRoomId() {
        return roomId;
    }

    public void joinRoom(User user) {
        users.add(user);
        System.out.println(user.getUsername() + " joined the chat room: " + roomId);
        notifyUserOfHistory(user);
        displayActiveUsers();
    }

    public void leaveRoom(User user) {
        users.remove(user);
        System.out.println(user.getUsername() + " left the chat room: " + roomId);
        displayActiveUsers();
    }

    public void broadcastMessage(Message message) {
        messageHistory.add(message);
        for (User user : users) {
            user.update(message);
        }
    }

    private void notifyUserOfHistory(User user) {
        System.out.println("Loading message history for " + user.getUsername() + ":");
        for (Message message : messageHistory) {
            user.update(message);
        }
    }

    public void displayActiveUsers() {
        System.out.println("Active users in room " + roomId + ":");
        for (User user : users) {
            System.out.println("- " + user.getUsername());
        }
    }
}
