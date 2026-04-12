import java.util.Scanner;
public class NokiaPhone {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // menu options from one 1 - 13
        String menuOne = "select main menu\n\n1.Phone Book\n2.Messages\n3.Chat\n4.Call register\n5.Tones\n6.Settings\n7.Call divert\n8.Games\n9.Calculator\n10.Reminders\n11.Clock\n12.Profiles\n13.SIM services\n";
        
        // phoneBook menu options
        String phoneBook = "Phone book\n1.Search\n2.Service Nos\n3.Add name\n4.Erase\n5.Edit\n6.Assign tone\n7.Send b'card\n8.Options\n9.Speed dials\n10.Voice tags\n";
        System.out.println(menuOne+"\n");
        
        // phone options subMenumenu
        String options = "Options\n1.Type of view\n2.Memory status\n";
        
        
        // messages menu
        String messages = "Messages\n1.Write messages\n2.Inbox\n3.Outbox\n4.Picture messages\n5.Templates\n6.Smileys\n7.Message settings\n8.Info service\n9.Voice mailbox\n10.Service command editor\n";
        
        
        // chat menu
        String chat = "Chat\n1.Chat\n";

        
        
        System.out.println("Please select a menu option");
        int userInput = scanner.nextInt();
        

        if(userInput==1) System.out.println(phoneBook);
        if(userInput==2) System.out.println(messages);
        if(userInput==3) System.out.println(chat);
        if(userInput==8) System.out.print(options);
    }
    
}



