public class User implements Observer {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void update(Message message) {
        System.out.println("[" + message.getSender().getUsername() + "]: " + message.getContent());
    }

    public void sendMessage(ChatRoom chatRoom, String content) {
        Message message = new Message(content, this);
        chatRoom.broadcastMessage(message);
    }
}
