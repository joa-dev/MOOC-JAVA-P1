
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joa-dev
 */
public class MessagingService {

    private ArrayList<Message> messagingservice;

    public MessagingService() {
        this.messagingservice = new ArrayList<Message>();
    }
    
    public void add(Message message){
        if(message.getContent().length() <= 280) {
            this.messagingservice.add(message);
        }
    }
    public ArrayList<Message> getMessages(){
        return this.messagingservice;
    }
}
