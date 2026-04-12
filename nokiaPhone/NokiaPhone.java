import java.util.Scanner;
public class NokiaPhone {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // menu options from one 1 - 13
        String menuOne = "select main menu\n\n1.Phone Book\n2.Messages\n3.Chat\n4.Call register\n5.Tones\n6.Settings\n7.Call divert\n8.Games\n9.Calculator\n10.Reminders\n11.Clock\n12.Profiles\n13.SIM services\n";
        System.out.println(menuOne+"\n");
        
        // phoneBook menu options
        String phoneBook = "Phone book\n1.Search\n2.Service Nos\n3.Add name\n4.Erase\n5.Edit\n6.Assign tone\n7.Send b'card\n8.Options\n9.Speed dials\n10.Voice tags\n";
        
        // phone options subMenumenu
        String options = "Options\n1.Type of view\n2.Memory status\n";
        
        // messages menu
        String messages = "Messages\n1.Write messages\n2.Inbox\n3.Outbox\n4.Picture messages\n5.Templates\n6.Smileys\n7.Message settings\n8.Info service\n9.Voice mailbox\n10.Service command editor\n";
        
        // chat menu
        String chat = "Chat\n1.Chat\n";
        
        // call register menu
        String callRegister = "Call register\n1.Missed calls\n2.Received calls\n3.Dailled numbers\n4.Erase recent call lists\n5.Show call duration\n6.Show call costs\n7.Call cost settings\n8.Prepaid credit\n";
        
        // tones menu
        String tones = "Tones\n1.Ringing tone\n2.Ringing volume\n3.Incoming call alert\n4.Composer\n5.Keypad tones\n6.Warning and game tones\n7.Vibrating alert\n8.Screen saver\n";
        
        // settings menu
        String settings = "Settings\n1.Call settings\n2.Phone settings\n3.Security settings\n4.Restore factory settings\n";
        
        // call divert menu
        String callDivert = "Call divert\n1.Call divert\n";
        
        // games menu
        String games = "Games\n1.Games\n";
        
        // calculator menu
        String calculator = "Calculator\n1.Calculator\n";
        
        // reminders menu
        String reminders = "Reminders\n1.Reminders\n";
        
        // clock menu
        String clock = "Clock\n1.Clock\n";
        
        // profiles menu
        String profiles = "Profiles\n1.Profiles\n";
        
        // sim services menu
        String simServices = "Sim services\n1.Clock\n";

        
        System.out.println("Please select a menu option");
        int userInput = scanner.nextInt();
        
        switch(userInput){
            case 1->System.out.println(phoneBook);
            case 2->System.out.println(messages);
            case 3->System.out.println(chat);
            case 4->System.out.println(callRegister);
            case 5->System.out.println(tones);
            case 6->System.out.println(settings);
            case 7->System.out.println(callDivert);
            case 8->System.out.println(games);
            case 9->System.out.println(calculator);
            case 10->System.out.println(reminders);
            case 11->System.out.println(clock);
            case 12->System.out.println(profiles);
            default -> System.out.println("Invalid option");
        }
    }
    
}



