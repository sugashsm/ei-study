import java.util.HashMap;
import java.util.Map;

public class ChatServer {
    private static ChatServer instance;
    private Map<String, ChatRoom> chatRooms;

    private ChatServer() {
        chatRooms = new HashMap<>();
    }

    public static ChatServer getInstance() {
        if (instance == null) {
            instance = new ChatServer();
        }
        return instance;
    }

    public ChatRoom createOrJoinRoom(String roomId) {
        ChatRoom chatRoom = chatRooms.get(roomId);
        if (chatRoom == null) {
            chatRoom = new ChatRoom(roomId);
            chatRooms.put(roomId, chatRoom);
            System.out.println("Chat room created: " + roomId);
        } else {
            System.out.println("Joined existing chat room: " + roomId);
        }
        return chatRoom;
    }
}
