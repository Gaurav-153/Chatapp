package com.substring.chat.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "rooms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @Id
    private String id; // MongoDB unique identifier
    private String roomId; // Unique room identifier
    private List<Message> messages = new ArrayList<>(); // List of messages in the room

    // Set roomId using setter method
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    // Add a message to the room's messages list
    public void addMessage(Message message) {
        this.messages.add(message);
    }

    // Get the messages from the room
    public List<Message> getMessages() {
        return messages;
    }
}
