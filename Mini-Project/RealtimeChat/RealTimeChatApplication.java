import java.util.Scanner;

public class RealTimeChatApplication {
    public static void main(String[] args) {
        ChatServer server = ChatServer.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        User user = new User(username);

        System.out.println("Enter the chat room ID to create or join:");
        String roomId = scanner.nextLine();
        ChatRoom chatRoom = server.createOrJoinRoom(roomId);
        chatRoom.joinRoom(user);

        System.out.println("Start chatting! (type 'exit' to leave, 'list' to see active users)");

        String input;
        while (!(input = scanner.nextLine()).equals("exit")) {
            if (input.equals("list")) {
                chatRoom.displayActiveUsers();
            } else {
                user.sendMessage(chatRoom, input);
            }
        }

        chatRoom.leaveRoom(user);
        scanner.close();
    }
}
