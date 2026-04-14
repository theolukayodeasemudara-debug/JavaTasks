import java.util.Scanner;
public class NokiaPhone {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // menu options from one 1 - 13
        String mainMenu = 
        """
        Main menu
        1.Phone book
        2.Messages
        3.Chat
        4.Call register
        5.Tones
        6.Settings
        7.Call divert
        8.Games
        9.Calculator
        10.Reminders
        11.Clock
        12.Profiles
        13.SIM services
        
        select your option
        """;
        System.out.print(mainMenu);
        
        // phoneBook menu options
        String phoneMenu =
        """
        Phone Book
        1.Search
        2.Service Nos
        3.Add name
        4.Erase
        5.Edit
        6.Assign tone
        7.Send b'card
        8.Options
        9.Speed dials
        10.Voice tags
        0.Go back
        
        select option
        """;
        
        String phoneSubMenu =
        """
        Options
        1.Type of view
        2.Memory status
        0.Go back
        
        select option
        """;
        
        // phone options subMenumenu
        String options =
        """
        Options
        1.Type of view
        2.Memory status
        0.Go back
        
        select option
        """;
        
        // messages menu
        String messages =
        """
        Messages
        1.Write message
        2.Inbox
        3.Outbox
        4.Picture messages
        5.Templates
        6.Smileys
        7.Message settings
        8.Info service
        9.Voice mailbox
        10.Service command editor
        
        select an option
        """;
        
        String mSubMenu = 
        """
        1. Write messages 
        2. Inbox 
        3. Outbox 
        4. Picture messages 
        5. Templates 
        6. Smileys 
        7. Message settings 
        
        select option
        """;
        
        // chat menu
        String chat = 
        """
        Chat
        1.Chat
        
        select option
        """;
        
        // call register menu
        String callRegister = 
        """
        Call register
        1.Missed calls
        2.Received calls
        3.Dailed calls
        4.Erase recent call lists
        5.Show call duration
        6.Show call costs
        7.Call cost settings
        8.Prepaid credit
        
        select option
        """;
        
        // tones menu
        String tones = 
        """
        Tones
        1.Ringing tone
        2.Ringing volume
        3.Incoming call alert
        4.Composer
        5.Keypad tones
        6.Warning and game tones
        7.Vibrating alert
        8.Screen saver
        
        select option
        """;
        
        // settings menu
        String settings =
        """
        Settings
        1.Call settings
        2.Phone settings
        3.Security settings
        4.Restore factory settings
        
        select option
        """;
        
        // call divert menu
        String callDivert =
        """
        Call divert
        1.Call divert
        
        select option
        """;
        
        // games menu
        String games = 
        """
        Games
        1.Games
        
        select option
        """;
        
        // calculator menu
        String calculator =
        """
        Calculator
        1.Calculator
        
        select option
        """;
        
        // reminders menu
        String reminders =
        """
        Reminders
        1.Reminders
        
        select option
        """;
        
        // clock menu
        String clock =
        """
        Clock
        1.Alarm clock
        2.Clock settings
        3.Date setting
        4.Stopwatch
        5.Countdown timer
        6.Auto update of time and date
        """;
        
        // profiles menu
        String profiles =
        """
        Profiles
        1.Profiles
        
        select option
        """;
        
        // sim services menu
        String simServices =
        """
        SIM
        1.SIM services
        """;

        
        int userInput = scanner.nextInt();
        
        switch(userInput){
            case 1->{
                System.out.println(phoneMenu);
                userInput = scanner.nextInt();
                if(userInput==8){
                    System.out.println(phoneSubMenu);
                }
                userInput = scanner.nextInt();
                if(userInput==0){
                    System.out.println(phoneMenu);
                }
                userInput = scanner.nextInt();
                if(userInput==0){
                    System.out.println(mainMenu);
                }
                
                
            }
            // messages menu options deep-linking logic
            case 2->{
                System.out.println(messages);
                userInput = scanner.nextInt();
                if(userInput==7){
                    System.out.println(mSubMenu);
                }
            }
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
            case 0->System.out.println(mainMenu);
            default -> System.out.println("invalid entry");
        }
    }
    
}



