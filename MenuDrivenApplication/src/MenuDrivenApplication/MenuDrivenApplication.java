package MenuDrivenApplication;
import java.util.Scanner;
public class MenuDrivenApplication {
	// 🌑 GALAXY SPACE COLOR THEME
				public static final String RESET = "\u001B[0m";
		    	public static final String GRAY = "\u001B[90m";
				public static final String BlackBG = "\033[40m";
				public static final String BLUE = "\u001B[34m";
				public static final String LIGHT_BLUE = "\u001B[94m";
			    public static final String RED = "\u001B[31m";
				public static final String LIGHT_RED = "\u001B[91m";
				public static final String YELLOW = "\u001B[33m";
				public static final String LIGHT_GREEN = "\u001B[92m";
		        public static final String LIGHT_PINK = "\u001B[38;2;255;182;193m";
		        public static final String PINK = "\u001B[38;2;255;105;180m";

			    // Entry point
			    public static void main(String[] args) throws InterruptedException {
			        // Step 1: Display banner title
			        printBanner();
			        // Step 2: Simulate loading bar
			        showLoadingBar();
			        // Step 2.0: Display loading screen complete
			        showLoadingScreen();
			        // Step 3: Show menu with border
			        showMenu();
			        // Step 4: Calculator
			        Calculator();
			        // Step 5: Conversions screen
			        Conversions();
			        // Step 6: linear metric converter
			        UnitConverter();
			        // Step 7: Odd and Even Screen 
			        OddEven();
			        // Step 8: Circle
			        AreaAndCircumference();
			        // Step 9: Show About Screen
			        AboutScreen();
			        // Step 10: Project Description
			        Description();
			        // Step 11: Show Developers
			        Developers();
			        // Step 12: Show Mr.Shrek as an error screen:P
			        Shrek();
			        // Step 13: For empty spaces 
			        Clearscreen();
			        // Step 14: Exit confirmation
			        ConfirmExit();
			        // Step 15: Final Exit   
			        Exit();

			    }
			    // Step 1: ASCII Art Banner
			    public static void printBanner() throws InterruptedException {
			        System.out.println();
			        for (int i = 0; i < 13; i++) {
			            System.out.println("                                                                                                                                    ");
			        }
			        System.out.println();
			        System.out.println();
			        System.out.println(GRAY + "                                                          ██╗       ██████╗  █████╗ ██████╗ ██╗ ███╗   ██╗  ██████╗                 " + RESET);
			        Thread.sleep(500);
			        System.out.println(GRAY + "                                                          ██║      ██╔═══██╗██╔══██╗██╔══██╗██║ ████╗  ██║ ██╔════╝                 " + RESET);
			        Thread.sleep(500);
			        System.out.println(GRAY + "                                                          ██║      ██║   ██║███████║██║  ██║██║ ██╔██╗ ██║ ██║ ████╗                " + RESET);
			        Thread.sleep(500);
			        System.out.println(GRAY + "                                                          ██║      ██║   ██║██╔══██║██║  ██║██║ ██║╚██╗██║ ██║   ██║                " + RESET);
			        Thread.sleep(500);
			        System.out.print(GRAY + "                                                          ████████╗╚██████╔╝██║  ██║██████╔╝██║ ██║ ╚████║ ╚██████╔╝    " + RESET);
			        Thread.sleep(500);
			        System.out.print(GRAY + "\n                                                          ╚═══════╝ ╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚═╝ ╚═╝  ╚═══╝  ╚═════╝   " + RESET);
			        Thread.sleep(500);
			    }

			    // Step 2: Loading bar animation
			    public static void showLoadingBar() throws InterruptedException {		        final String RESET = "\u001B[0m";
			  
			        for (int i = 0; i < 3; i++) {
			            System.out.print(GRAY + "██" + RESET);
			            System.out.print(GRAY + "╗ " + RESET);
			            Thread.sleep(500); // Adjust animation speed
			        
			        }
			        System.out.print(GRAY + "\n                                                                                                                      ╚═╝ ╚═╝ ╚═╝" + RESET);
			        System.out.println(YELLOW + """
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⠶⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡾⠋⠀⠀⠈⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠟⠀⠀⠀⠀⠀⣌⠹⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                    ⠀⣀⣠⠤⠤⠤⠤⣄⣀
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠋⠀⠀⠀⠀⠀⠀⠘⢧⡘⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                ⠀⢀⡴⠊⠁⠀⠀ ⠀⠀  ⠀⠈⠙⠦⡀⠀
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠟⠈⡻⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                   ⠀⠀    ⠀⠀⠀⣰⠋⠀⠀⠀⠀⠀⠀⠀   ⠀⠀ ⠀⠀⠀⠘⢶⣶⣒⣶⠦⣤⣀⠀⠀
			        		⠀⠀⠀⠀⢀⣀⣠⣤⣶⠶⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⠀⠉⠓⢦⣄⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                     ⢀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀ ⠀⠀  ⠀⠀⠈⣟⠲⡌⠙⢦⠈⢧⠀
			        		⢀⣴⣿⠟⠋⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠛⢷⡄⠀⠀⠀                                                                                                     ⠀⣠⢴⡾⢟⣿⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⣸⡴⢃⡠⠋⣠⠋⠀
			        		⠀⢻⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠃                                                                                                   ⠀   ⠐⠀⠞⣱⠋⢰⠁⢿⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⣀⣠⠤⢖⣋⡥⢖⣫⠔⠋⠀⠀⠀
			        		⠀⠀⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠤⠤⠤⠤⢄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠁⠀                                                                                                   ⠀⠈⠠⡀⠹⢤⣈⣙⠚⠶⠤⠤⠤⠴⠶⣒⣒⣚⣩⠭⢵⣒⣻⠭⢖⠏⠁⢀⣀⠀⠀⠀⠀
			        		⠀⠀⠀⠈⠻⣦⡀⠀⠀⠀⠀⠀⠀⣠⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠙⠢⣀⠀⠀⠀⠀⠀⠀⠀⣴⡿⠋⠀⠀⠀⠀                                                                                                        ⠠⠀⠈⠓⠒⠦⠭⠭⠭⣭⠭⠭⠭⠭⠿⠓⠒⠛⠉⠉ ⠀⠀⣠⠏⠀⠀⠘⠞⠀
			        		⠀⠀⠀⠀⠀⠈⠻⣦⠀⠀⠀⠀⣼⠇⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠹⠀⠀⠀⠀⠀⢠⡾⠃⠀⠀⠀⠀⠀⠀                                                                                                              ⠈⠓⢤⣀⠀⠀⠀⠀    ⠀⠀⣀⡤⠞⠁⠀⣰⣆⠀⠀⠀
			        		⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⢱⡌⠙⣿⠿⠋⠀⠀⠀⠙⠿⡟⠋⠀⣸⠁⠀⠀⠀⢀⣿⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                         ⠘⠿⠀⠀⠀   ⠀⠀⠈⠉⠙⠒⠒⠛⠉⠁⠀⠀⠀ ⠉⢳⡞⠉
			        		⠀⠀⠀⠀⠀⠀⢠⡿⠀⠀⠀⠀⠀⠙⢦⣀⡀⠀⠀⠀⠀⠀⠀⣀⣠⠞⠁⠀⠀⠀⠀⠈⣿⠀⠀⠀⠀⠀⠀⠀⠀
			        		⠀⠀⠀⠀⠀⢠⣿⠃⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠓⠒⠒⠛⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠸⣆⠀⠀⠀⠀⠀⠀⠀                                                                     ⢀⣀⣀⠀
			        		⠀⠀⠀⠀⢀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣰⣦⣶⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡆⠀⠀⠀⠀⠀                                                                      ⠀⠇⡠⠊⠉⠙⠒⠤
			        		⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⢀⣠⣤⣶⢾⣿⡟⠉⠀⠀⣭⣿⡿⢶⣤⣄⡀⠀⠀⠀⠀⠀⠈⡇⠀⠀                                                                     ⠀⠀⠀⠀⠘⠀⠌⢠⣤⣤⠀⠈⠳
			        		⠀⠀⠀⠀⠀⠻⠦⠶⠶⠿⠟⠛⠉⠀⢀⣿⣿⡇⠀⠀⠀⢻⡟⣿⡀⠀⠉⠛⠷⢤⣦⣀⣀⣼⠗⠀⠀⠀⠀⠀         ⠀／＞　 フ                                                     ⠸⣅⠀⢯⣿⡿⢀⢀⠀⠈⢵⣖⠒⠒⠠⢄⡀
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡿⢱⡟⠀⠀⠀⠀⠘⣧⡈⣧⠀⠀⠀⠀⠀⠀⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀          | 　_　_|                                                       ⠱⡀⠀⠀⠀⣿⣿⡷⠀⡡⠛⡄⠀⠀⠈⢱⠀
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠿⠞⠛⠃⠀⠀⠀⠀⠀⣿⢳⣼⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⠀／` ミ__^ノ                                                         ⠹⣎⠀⠀⠉⠉⢁⣼⣠⠊⢹⡄⠤⡀⠀⡇
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡶⢤⣄⣀⣀⣀⣀⣩⡇⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      /　　　　 |                                                             ⠈⢳⣄⠀⡠⢂⠸⡌⠙⣎⠀⠀⠈⢢⡅
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠀⡼⢻⡀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     /　 ヽ　　 ﾉ            ╱|、                                                ⡝⡙⠒⠿⣤⠟⢲⢾⠿⡢⣄⠀⠁⠀
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢸⡇⢸⡇⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    /　　  |　|　|         (˚ˎ 。7                                               ⢇⠇⠀⠀⢨⡀⠀⠳⣕⠰⣌⢢⠀ 
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡀⣿⠁⠸⡇⠀⣸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀／￣|　　 |　|　|          |、˜〵                                                ⠈⠺⠤⢀⣀⣙⣦⡀⠀⠙⠢⢄⣣
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣷⣧⠀⠀⠷⢠⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀(￣ヽ＿_  ヽ_)__)         じしˍ,)ノ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                 ⠈⠁
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠘⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀＼二)
			        		⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀""" + RESET);

			        Thread.sleep(2500);
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			    	System.out.println();
			    	System.out.println();
			    	System.out.println();
			    	System.out.println();
			    	System.out.println();
			    	System.out.println();
			    	System.out.println();

			    }		    
			    //Step 2.0: Loading Screen
			    public static void showLoadingScreen() throws InterruptedException {
			        Scanner input = new Scanner(System.in);
			        char choice;

			        do {
			            // ✨ Starfield surrounding effect (scattered look)
			            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                           ");
			            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦     ");
			            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                           ");
			            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦     ");
			            System.out.println(BlackBG+YELLOW + "                                                                         ˚                      *                                                    .         ✦                                           *              ");
			            System.out.println(BlackBG+YELLOW + "            ✦                     .                                *                                    ✦                         ˚                                          *                           ✦       ");

			            System.out.println(BlackBG+LIGHT_BLUE + "                              ✦      ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗     ✦                                       " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + " .   *                               ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║                                          ˚  ." + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                    ˚          ✦     ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║  ✦                            *              " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "              *                 .    ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║                  .                     ˚     " + RESET);

			            // Logo block
			            System.out.println(BlackBG+LIGHT_BLUE + "                         ✦           ║" + BlackBG+LIGHT_RED +  "                             ██╗       ██████╗  █████╗ ██████╗ ██╗███╗   ██╗ ██████╗                             " + BlackBG+LIGHT_BLUE + "║                                       * " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "        *            ˚               ║" + BlackBG+LIGHT_RED +  "                             ██║      ██╔═══██╗██╔══██╗██╔══██╗██║████╗  ██║██╔════╝                             " + BlackBG+LIGHT_BLUE + "║      ✦                     .            " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   ˚                    ✦            ║" + BlackBG+LIGHT_RED +  "                             ██║      ██║   ██║███████║██║  ██║██║██╔██╗ ██║██║ ████╗                            " + BlackBG+LIGHT_BLUE + "║                    .          *         " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                            *    .   ║" + BlackBG+LIGHT_RED +  "                             ██║      ██║   ██║██╔══██║██║  ██║██║██║╚██╗██║██║   ██║                            " + BlackBG+LIGHT_BLUE + "║              ˚            ✦             " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "             ✦                   *   ║" + BlackBG+RED +        "                             ████████╗╚██████╔╝██║  ██║██████╔╝██║██║ ╚████║╚██████╔╝                            " + BlackBG+LIGHT_BLUE + "║    *                   .                " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                  ˚          ✦       ║" + BlackBG+RED +        "                             ╚═══════╝ ╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚═╝╚═╝  ╚═══╝ ╚═════╝                             " + BlackBG+LIGHT_BLUE + "║                 ˚                 ✦     " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   *     .                           ║" + BlackBG+LIGHT_RED  + "                       ██████╗ ██████╗ ███╗ ╔███╗███████╗ ██╗      ███████╗████████╗███████╗                     " + BlackBG+LIGHT_BLUE + "║                           *         .   " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                ✦      ˚             ║" + BlackBG+LIGHT_RED  + "                      ██╔════╝██╔═══██╗████╗████║██╔═══██╗██║      ██╔════╝╚══██╔══╝██╔════╝                     " + BlackBG+LIGHT_BLUE + "║  ˚                 ✦                    " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                            *    .   ║" + BlackBG+LIGHT_BLUE + "                      ██║     ██║   ██║██╔███╔██║███████╔╝██║      █████╗     ██║   █████╗                       " + BlackBG+LIGHT_BLUE + "║         .                       *       " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "     ˚   ✦                           ║" + BlackBG+LIGHT_BLUE + "                      ██║     ██║   ██║██║╚══╝██║██╔════╝ ██║      ██╔══╝     ██║   ██╔══╝                       " + BlackBG+LIGHT_BLUE + "║         ✦                   ˚           " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "  ✦                                * ║" + BlackBG+BLUE +       "                      ╚██████╗╚██████╔╝██║    ██║██║      ████████╗███████╗   ██║   ███████╗                     " + BlackBG+LIGHT_BLUE + "║               *   ✦                     " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                 .           ˚       ║" + BlackBG+BLUE +       "                       ╚═════╝ ╚═════╝ ╚═╝    ╚═╝╚═╝      ╚═══════╝╚══════╝   ╚═╝   ╚══════╝                     " + BlackBG+LIGHT_BLUE + "║  ˚                      .               " + RESET);

			            System.out.println(BlackBG+LIGHT_BLUE + "             ✦                   .   ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║      *                       ˚           " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "       *             ˚               ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║    ✦                                .    " + RESET);

			            // Text / message
			            System.out.println(BlackBG+LIGHT_BLUE + "                        ˚       ✦    ║" + BlackBG+RED +        "                                              Enter [S]tart to begin                                             " + BlackBG+LIGHT_BLUE + "║        *                .               " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   *             .                   ║" + BlackBG+RED +        "                                                     (☞ﾟヮﾟ)☞  ⚡                                                  " + BlackBG+LIGHT_BLUE + "║  ˚                         ✦            " + RESET);

			            System.out.println(BlackBG+LIGHT_BLUE + "  ✦                             ˚    ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║              .               *          " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "            .                    *   ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║      ✦                         ˚        " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "         ˚             ✦             ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║        *               .                " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "     *            .                  ╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝  ✦                      *                                  " + RESET);

			            // bottom sparkle scattering
			            System.out.println(BlackBG+YELLOW + "           ✦                           .                          ˚                                 *                             ✦             .                            *                            ˚           ");
			            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                                 ");
			            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦            ");
			            System.out.println(BlackBG+YELLOW + "                        *                                     ✦                        ˚                            .               ✦                              *                                 .                ");
			            System.out.println(BlackBG+YELLOW + "   ˚                                            *                            ✦                                .                            *             ✦                                         ˚                " + RESET);
			    	 // (No visible prompt)
			        choice = input.next().charAt(0);

			        // Validate
			        if (choice == 's' || choice == 'S') {
			            showMenu();
			            break;
			        } else {
			        	Shrek();
			        }
			    } while(true);
			        input.close();
			    }
			    // Step 3: Menu with border
			    public static void showMenu() throws InterruptedException {
			    	Scanner input = new Scanner(System.in);
			    	int num;
			    	
			    	do {
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        // ✨ Starfield surrounding effect (scattered look)
		            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                           ");
		            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦     ");
		            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                           ");
		            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦     ");
		            System.out.println(BlackBG+YELLOW + "                                                                         ˚                      *                                                    .         ✦                                           *              ");
		            System.out.println(BlackBG+YELLOW + "            ✦                     .                                *                                    ✦                         ˚                                          *                           ✦       ");

			        // Top border
			        System.out.println(BlackBG+LIGHT_BLUE + "                              ✦       ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗     ✦                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║                                                                                                                 ║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║                                                                                                                 ║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "˚                      *              ║                                                                                                                 ║         .                       *           " + RESET);

			        

			        // Logo (CalX in blocky ASCII style)
			        System.out.println(BlackBG+LIGHT_BLUE + "                            *    .    ║" + BlackBG+LIGHT_RED  + "                                         ██████╗  █████╗  ██╗     ██╗  ██╗                                       " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║" + BlackBG+LIGHT_RED  + "                                        ██╔════╝ ██╔══██╗ ██║      ██╗██╔╝                                       " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" +    BlackBG+RED     + "                                        ██║      ███████║ ██║       ███╔╝                                        " + BlackBG+LIGHT_BLUE + "║         .                       *           " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "˚                      *              ║" + BlackBG+LIGHT_BLUE + "                                        ██║      ██╔══██║ ██║      ██╔██╗                                        " + BlackBG+LIGHT_BLUE + "║ *                           ✦               " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+LIGHT_BLUE + "                                        ╚██████╗ ██║  ██║ ███████╗██╔╝ ██╗                                       " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║" +    BlackBG+BLUE    + "                                         ╚═════╝ ╚═╝  ╚═╝ ╚══════╝╚═╝  ╚═╝  " + BlackBG+RED + "██╗                                  " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" +    BlackBG+BLUE    + "                                                                            " + BlackBG+RED + "╚═╝                                  " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);

			        // Empty space
			        System.out.println(BlackBG+LIGHT_BLUE + "                            *    .    ║                                                                                                                 ║           ✦                     .   " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║                                     " + RESET);


			        // Menu welcome text
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+LIGHT_BLUE + "                                                 Welcome to CalX!                                                " + BlackBG+LIGHT_BLUE + "║ *                           ✦               " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║" + BlackBG+LIGHT_BLUE + "                                          Enter a number to get started.                                         " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);

			        // Empty space
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║                                                                                                                 ║                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║         .                       *     " + RESET);

			        // Menu options
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║" + BlackBG+RED + "                                                 [1] " + BlackBG+LIGHT_RED + "Calculator                                                  " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║" + BlackBG+RED + "                                                 [2] " + BlackBG+LIGHT_RED + "Conversions                                                 " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+RED + "                                                 [3] " + BlackBG+LIGHT_RED + "About Us                                                    " + BlackBG+LIGHT_BLUE + "║     ✦                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+RED + "                                                 [0] " + BlackBG+LIGHT_RED + "Exit                                                        " + BlackBG+LIGHT_BLUE + "║         .                       *           " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "  ˚                      *            ║                                                                                                                 ║                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║    *                   .              " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "*                      ✦            . ║                                                                                                                 ║         .                       *     " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                            *    .    ║                                                                                                                 ║     ✦                                       " + RESET);

			        // Bottom border
			        System.out.println(BlackBG+LIGHT_BLUE + "*                      ✦            . ╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝  *                      ✦            .      " + RESET);
			     // bottom sparkle scattering
		            System.out.println(BlackBG+YELLOW + "           ✦                           .                          ˚                                 *                             ✦             .                            *                            ˚           ");
		            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                                 ");
		            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦            ");
		            System.out.println(BlackBG+YELLOW + "                        *                                     ✦                        ˚                            .               ✦                              *                                 .                ");
		            System.out.println(BlackBG+YELLOW + "   ˚                                            *                            ✦                                .                            *             ✦                                         ˚                " + RESET);

			        
			        // (No visible prompt)
			        num = input.nextInt();

			        // Validate
			        if (num == 1) {
			        	Clearscreen();
			            Calculator();
			            break;
			        } else if (num == 2) {
			        	Clearscreen();
			        	Conversions();
			        	break;
			        } else if (num == 3) {
			        	Clearscreen();
			        	AboutScreen();
			        	break;
			        } else if (num == 0) {
			        	Clearscreen();
			        	ConfirmExit();
			        	break;
			        } else {
			            Shrek();
			        }
			    } while (true);
				    input.close();
			    }
			    public static void Calculator() throws InterruptedException{
			    	Scanner scanner = new Scanner(System.in);
			    	int numbers;
			    	
			    	// Sky Design for the header
			    	System.out.println(GRAY +"⣿⣿⣿⣏⣉⣷⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                      ");
			        System.out.println("⠘⢿⣿⣿⣿⣧⣀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                    ");
			        System.out.println("⠀⠀⠉⠙⠿⠿⠏⠁⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                       ⠀⠀ ⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                                   ⠀");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                     ⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀⠀                                                ");
			        System.out.println("⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀                               ⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀⠀                                                ");
			        System.out.println("⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀                              ⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆⠀                                               ");
			        System.out.println("⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆         ⣠⣤⣤⣤                     ⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒             ⣠⣤⣤⣤                             ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒         ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                                                                               ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                       ⠀");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⠤⠤⠄⠠⠄⠒⠒⠒⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                                                                             ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                        ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                                                      ⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                      ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒ ⠀                                     ⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒                   " + RESET);
			        // Calculator 
			        System.out.println(LIGHT_RED +  "                                                  ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ████████╗ ██████╗ ██████╗                                                                            ");
			        System.out.println(             "                                                 ██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗╚══██╔══╝██╔═══██╗██╔══██╗                                                                           ");
			        System.out.println(RED +        "                                                 ██║     ███████║██║     ██║     ██║   ██║██║     ███████║   ██║   ██║   ██║██████╔╝                                                                           ");
			        System.out.println(LIGHT_BLUE + "                                                 ██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║   ██║   ██║   ██║██╔══██╗                                                                           ");
			        System.out.println(             "                                                 ╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║   ██║   ╚██████╔╝██║  ██║                                                                           ");
			        System.out.println(BLUE +       "                                                  ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝                                                                           " + RESET);
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.print(RED + "                                                                         Enter first number: " + RESET);
			        double num1 = scanner.nextDouble();
			        System.out.print(RED + "                                                                         Enter an operator" + LIGHT_RED + "(+, -, *, /): " + RESET);
			        char op = scanner.next().charAt(0);
			        System.out.print(RED + "                                                                         Enter second number: " + RESET);
			        double num2 = scanner.nextDouble();
			        
			        double result;
			        
			        System.out.println(LIGHT_BLUE);
			        if (op == '+') {
			        	result = num1 + num2;
			        	System.out.println("                                                                         Result ► " + result + " ◄");
			        } else if (op == '-') {
			        	result = num1 - num2;
			        	System.out.println("                                                                         Result ► " + result + " ◄");
			        } else if (op == '*') {
			        	result = num1 * num2;
			        	System.out.println("                                                                         Result ► " + result + " ◄");
			        } else if (op == '/') {
			        	if (num2 == 0) {
			        		System.out.println("                                                                         Error ► Division by zero is not allowed.");
			        	} else {
			        		result = num1 / num2;
				        	System.out.println("                                                                         Result ► " + result + " ◄");
				        	System.out.println(RESET);
			        	}
			        } else {
			        	Shrek();
			        }
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println(LIGHT_BLUE + "                                                ╔══════════════════════════════════════════════════════════════════════════════════╗");
			        System.out.println(             "                                                ║                                                                                  ║");
			        System.out.println(             "                                                ║                 " + RED + "[1] Return                             [2] Exit                  " + LIGHT_BLUE + "║");
			        System.out.println(             "                                                ║                                                                                  ║");
			        System.out.println(             "                                                ╚══════════════════════════════════════════════════════════════════════════════════╝" + RESET);
			    	numbers = scanner.nextInt();
			    	
			    	if (numbers == 1) {
			    		showMenu();
			    	} else if (numbers == 2) {
			    		ConfirmExit();
			    	} else {
			    		Shrek();
			    	}
			    	

			        scanner.close();
			        }
			      // Step 5: The CONVERSIONS:000
			    public static void Conversions() throws InterruptedException{
			    	Scanner input = new Scanner(System.in);
			    	int num;
			    	
			    	do {
			    	// ✨ Starfield surrounding effect (scattered look)
		            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                           ");
		            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦     ");
		            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                           ");
		            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦     ");
		            System.out.println(BlackBG+YELLOW + "                                                                         ˚                      *                                                    .         ✦                                           *              ");
		            System.out.println(BlackBG+YELLOW + "            ✦                     .                                *                                    ✦                         ˚                                          *                           ✦       ");

			        // Top border
			        System.out.println(BlackBG+LIGHT_BLUE + "                              ✦       ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗     ✦                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║                                                                                                                 ║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║                                                                                                                 ║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "˚                      *              ║                                                                                                                 ║         .                       *           " + RESET);

			        

			        // Logo (CalX in blocky ASCII style)
			        System.out.println(BlackBG+LIGHT_BLUE + "                            *    .    ║" + BlackBG+LIGHT_RED  + "               ██████╗ ██████╗ ███╗  ██╗██╗  ██╗███████╗██████╗  ██████╗██╗ ██████╗ ███╗  ██╗ ██████╗            " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║" + BlackBG+LIGHT_RED  + "              ██╔════╝██╔═══██╗████╗ ██║██║  ██║██╔════╝██╔══██╗██╔════╝██║██╔═══██╗████╗ ██║██╔════╝            " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" +    BlackBG+RED     + "              ██║     ██║   ██║██╔██╗██║██║  ██║█████╗  ██████╔╝██████╗ ██║██║   ██║██╔██╗██║██████╗             " + BlackBG+LIGHT_BLUE + "║         .                       *           " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "˚                      *              ║" + BlackBG+LIGHT_BLUE + "              ██║     ██║   ██║██║╚████║╚██╗██╔╝██╔══╝  ██╔══██╗╚════██╗██║██║   ██║██║╚████║╚════██╗            " + BlackBG+LIGHT_BLUE + "║ *                           ✦               " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+LIGHT_BLUE + "              ╚██████╗╚██████╔╝██║ ╚███║ ╚███╔╝ ███████╗██║  ██║██████╔╝██║╚██████╔╝██║ ╚███║██████╔╝            " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║" +    BlackBG+BLUE    + "               ╚═════╝ ╚═════╝ ╚═╝  ╚══╝  ╚══╝  ╚══════╝╚═╝  ╚═╝╚═════╝ ╚═╝ ╚═════╝ ╚═╝  ╚══╝╚═════╝             " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║                                     " + RESET);

			        // Empty space
			        System.out.println(BlackBG+LIGHT_BLUE + "                            *    .    ║                                                                                                                 ║           ✦                     .   " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║                                     " + RESET);


			        // Menu welcome text
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+LIGHT_BLUE + "                                         Choose what you want to convert                                         " + BlackBG+LIGHT_BLUE + "║ *                           ✦               " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║" + BlackBG+LIGHT_BLUE + "                                          Enter a number to get started.                                         " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);

			        // Empty space
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║                                                                                                                 ║                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║         .                       *     " + RESET);

			        // Menu options
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║" + BlackBG+RED + "                                     [1] " + BlackBG+LIGHT_RED + "mm, cm, and m                                                           " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║" + BlackBG+RED + "                                     [2] " + BlackBG+LIGHT_RED + "Odd and Even                                                            " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+RED + "                                     [3] " + BlackBG+LIGHT_RED + "Area and Circumference of a Circle                                      " + BlackBG+LIGHT_BLUE + "║     ✦                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+RED + "                                     [4] " + BlackBG+LIGHT_RED + "Return                                                                  " + BlackBG+LIGHT_BLUE + "║         .                       *           " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "  ˚                      *            ║" + BlackBG+RED + "                                     [0] " + BlackBG+LIGHT_RED + "Exit                                                                    " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║    *                   .              " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "*                      ✦            . ║                                                                                                                 ║         .                       *     " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                            *    .    ║                                                                                                                 ║     ✦                                 " + RESET);

			        // Bottom border
			        System.out.println(BlackBG+LIGHT_BLUE + "*                      ✦            . ╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝  *                      ✦            .      " + RESET);
			     // bottom sparkle scattering
		            System.out.println(BlackBG+YELLOW + "           ✦                           .                          ˚                                 *                             ✦             .                            *                            ˚           ");
		            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                                 ");
		            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦            ");
		            System.out.println(BlackBG+YELLOW + "                        *                                     ✦                        ˚                            .               ✦                              *                                 .                ");
		            System.out.println(BlackBG+YELLOW + "   ˚                                            *                            ✦                                .                            *             ✦                                         ˚                " + RESET);
		         // (No visible prompt)
			        num = input.nextInt();

			        // Validate
			        if (num == 1) {
			        	Clearscreen();
			        	UnitConverter();
			        	break;
			        } else if (num == 2) {
			        	Clearscreen();
			        	OddEven();
			            break;
			        } else if (num == 3) {
			        	Clearscreen();
			        	AreaAndCircumference();
			        	break;
			        } else if (num == 4) {
			        	showMenu();
			        	break;
			        } else if (num == 0) {
			        	ConfirmExit();
			        } else {
			            Shrek();
			        }
			    } while (true);
				    input.close();
			    }
			    // Step 6: Unit Converter
			    public static void UnitConverter() throws InterruptedException {
			        Scanner scanner = new Scanner(System.in);
			        int numbers;

			        // Sky Design for the header
			        System.out.println(GRAY + "⣿⣿⣿⣏⣉⣷⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                      ");
			        System.out.println("⠘⢿⣿⣿⣿⣧⣀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                    ");
			        System.out.println("⠀⠀⠉⠙⠿⠿⠏⠁⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                       ⠀⠀ ⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                                   ⠀");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                     ⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀⠀                                                ");
			        System.out.println("⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀                               ⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀⠀                                                ");
			        System.out.println("⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀                              ⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆⠀                                               ");
			        System.out.println("⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆         ⣠⣤⣤⣤                     ⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒             ⣠⣤⣤⣤                             ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒         ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                                                                               ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                       ⠀");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⠤⠤⠄⠠⠄⠒⠒⠒⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                                                                             ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                        ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                                                      ⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                      ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒ ⠀                                     ⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒                   " + RESET);

			        // mm, cm, m header
			        System.out.println(LIGHT_RED +  "                                                                                 ██╗  ██╗███╗  ██╗██╗████████╗                                ");
			        System.out.println(             "                                                                                 ██║  ██║████╗ ██║██║╚══██╔══╝                                ");
			        System.out.println(RED +        "                                                                                 ██║  ██║██╔██╗██║██║   ██║                                   ");
			        System.out.println(LIGHT_BLUE + "                                                                                 ██║  ██║██║╚████║██║   ██║                                   ");
			        System.out.println(             "                                                                                 ╚█████╔╝██║ ╚███║██║   ██║                                   ");
			        System.out.println(BLUE +       "                                                                                  ╚════╝ ╚═╝  ╚══╝╚═╝   ╚═╝                                   ");
			        System.out.println(LIGHT_RED +  "                                                         ██████╗ ██████╗ ███╗  ██╗██╗  ██╗███████╗██████╗ ████████╗███████╗██████╗            ");
			        System.out.println(             "                                                        ██╔════╝██╔═══██╗████╗ ██║██║  ██║██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗           ");
			        System.out.println(RED +        "                                                        ██║     ██║   ██║██╔██╗██║██║  ██║██████╗ ██████╔╝   ██║   ██████╗ ██████╔╝           ");
			        System.out.println(LIGHT_BLUE + "                                                        ██║     ██║   ██║██║╚████║╚██╗██╔╝██╔═══╝ ██╔══██╗   ██║   ██╔═══╝ ██╔══██╗           ");
			        System.out.println(             "                                                        ╚██████╗╚██████╔╝██║ ╚███║ ╚███╔╝ ███████╗██║  ██║   ██║   ███████╗██║  ██║           ");
			        System.out.println(BLUE +       "                                                         ╚═════╝ ╚═════╝ ╚═╝  ╚══╝  ╚══╝  ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝           " + RESET);

			        System.out.println();
			        System.out.println();
			        System.out.print(RED +          "                                                                   Enter value: " + RESET);
			        double value = scanner.nextDouble();

			        System.out.print(RED +          "                                                                   Choose a unit(mm, cm, m): " + RESET);
			        String unit = scanner.next().trim().toLowerCase();

			        double mm = 0, cm = 0, m = 0;

			        if (unit.equals("mm")) {
			            mm = value;
			            cm = value / 10.0;
			            m = value / 1000.0;
			        } else if (unit.equals("cm")) {
			            cm = value;
			            mm = value * 10.0;
			            m = value / 100.0;
			        } else if (unit.equals("m")) {
			            m = value;
			            mm = value * 1000.0;
			            cm = value * 100.0;
			        } else {
			            Shrek();
			        }

			        // Results
			        System.out.println(LIGHT_BLUE);
			        System.out.println("                                                                   Conversions:");
			        System.out.println("                                                                   Millimeters ► " + mm + "mm ◄");
			        System.out.println("                                                                   Centimeters ► " + cm + "cm ◄");
			        System.out.println("                                                                   Meters ► " + m + "m ◄");
			        System.out.println(RESET);

			        System.out.println();
			        System.out.println(LIGHT_BLUE + "                                                   ╔══════════════════════════════════════════════════════════════════════════════════╗");
			        System.out.println("                                                   ║                                                                                  ║");
			        System.out.println("                                                   ║                 " + RED + "[1] Return                             [2] Exit                  " + LIGHT_BLUE + "║");
			        System.out.println("                                                   ║                                                                                  ║");
			        System.out.println("                                                   ╚══════════════════════════════════════════════════════════════════════════════════╝" + RESET);
			        numbers = scanner.nextInt();

			        if (numbers == 1) {
			            Conversions();
			        } else if (numbers == 2) {
			            ConfirmExit();
			        } else {
			            Shrek();
			        }
			        scanner.close();
			    }
			    // Step 7: odd and Even
			    public static void OddEven() throws InterruptedException{
			    	Scanner input = new Scanner(System.in);
			    	int numbers;
			    	// Sky Design for the header
			        System.out.println(GRAY + "⣿⣿⣿⣏⣉⣷⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                      ");
			        System.out.println("⠘⢿⣿⣿⣿⣧⣀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                    ");
			        System.out.println("⠀⠀⠉⠙⠿⠿⠏⠁⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                       ⠀⠀ ⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                                   ⠀");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                     ⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀⠀                                                ");
			        System.out.println("⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀                               ⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀⠀                                                ");
			        System.out.println("⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀                              ⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆⠀                                               ");
			        System.out.println("⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆         ⣠⣤⣤⣤                     ⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒             ⣠⣤⣤⣤                             ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒         ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                                                                               ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                       ⠀");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⠤⠤⠄⠠⠄⠒⠒⠒⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                                                                             ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                        ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                                                      ⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                      ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒ ⠀                                     ⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒                   " + RESET);
			        // Odd and Even Header
			        System.out.println(LIGHT_RED +  "                                               ██████╗ ██████╗ ██████╗      █████╗ ███╗  ██╗██████╗     ███████╗██╗  ██╗███████╗███╗  ██╗      ");
			        System.out.println(             "                                              ██╔═══██╗██╔══██╗██╔══██╗    ██╔══██╗████╗ ██║██╔══██╗    ██╔════╝██║  ██║██╔════╝████╗ ██║      ");
			        System.out.println(RED +        "                                              ██║   ██║██║  ██║██║  ██║    ███████║██╔██╗██║██║  ██║    ██████╗ ██║  ██║██████╗ ██╔██╗██║      ");
			        System.out.println(LIGHT_BLUE + "                                              ██║   ██║██║  ██║██║  ██║    ██╔══██║██║╚████║██║  ██║    ██╔═══╝ ╚██╗██╔╝██╔═══╝ ██║╚████║      ");
			        System.out.println(             "                                              ╚██████╔╝██████╔╝██████╔╝    ██║  ██║██║ ╚███║██████╔╝    ███████╗ ╚███╔╝ ███████╗██║ ╚███║      ");
			        System.out.println(BLUE +       "                                               ╚═════╝ ╚═════╝ ╚═════╝     ╚═╝  ╚═╝╚═╝  ╚══╝╚═════╝     ╚══════╝  ╚══╝  ╚══════╝╚═╝  ╚══╝      " + RESET);
			        // Odd and Even program
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.print(RED +          "                                                                   Enter an integer: " + RESET);
			        int number = input.nextInt();
			        
			        // Result
			        System.out.println();
			        System.out.println();
			        System.out.println(LIGHT_BLUE);
			        if (number / 2 * 2 == number) {
			            System.out.println(         "                                                                   Result ► " + number + " is even ◄");
			        } else {
			            System.out.println(         "                                                                   Result ► " + number + " is odd ◄");
			        }
			        System.out.println(RESET);
			        // return
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println(LIGHT_BLUE + "                                                  ╔══════════════════════════════════════════════════════════════════════════════════╗");
			        System.out.println(             "                                                  ║                                                                                  ║");
			        System.out.println(             "                                                  ║                 " + RED + "[1] Return                             [2] Exit                  " + LIGHT_BLUE + "║");
			        System.out.println(             "                                                  ║                                                                                  ║");
			        System.out.println(             "                                                  ╚══════════════════════════════════════════════════════════════════════════════════╝" + RESET);
			        numbers = input.nextInt();

			        if (numbers == 1) {
			            Conversions();
			        } else if (numbers == 2) {
			            ConfirmExit();
			        } else {
			            Shrek();
			        }
			        input.close();
			    }
			    // Step 8: Area and Circumference of a Circle
			    public static void AreaAndCircumference() throws InterruptedException{
			    	Scanner input = new Scanner(System.in);
			    	double radius, area, circumference;
			    	double PI = 3.14159;
			    	int numbers;
			    	
			    	// Sky Design for the header
			        System.out.println(GRAY + "⣿⣿⣿⣏⣉⣷⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                      ");
			        System.out.println("⠘⢿⣿⣿⣿⣧⣀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                    ");
			        System.out.println("⠀⠀⠉⠙⠿⠿⠏⠁⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                       ⠀⠀ ⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                                   ⠀");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                     ⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀⠀                                                ");
			        System.out.println("⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀                               ⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀⠀                                                ");
			        System.out.println("⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀                              ⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆⠀                                               ");
			        System.out.println("⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆         ⣠⣤⣤⣤                     ⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒             ⣠⣤⣤⣤                             ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒         ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                                                                               ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                       ⠀");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⠤⠤⠄⠠⠄⠒⠒⠒⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                                                                             ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                        ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                                                      ⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                      ");
			        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒ ⠀                                     ⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒                   " + RESET);
			        // Area and Circumference of a Circle Header
			        System.out.println(LIGHT_RED +  "            █████╗ ██████╗ ███████╗ █████╗      █████╗ ███╗  ██╗██████╗      ██████╗██╗██████╗  ██████╗██╗  ██╗███╗ ╔███╗███████╗███████╗██████╗ ███████╗███╗  ██╗ ██████╗███████╗   ");
			        System.out.println(             "           ██╔══██╗██╔══██╗██╔════╝██╔══██╗    ██╔══██╗████╗ ██║██╔══██╗    ██╔════╝██║██╔══██╗██╔════╝██║  ██║████╗████║██╔════╝██╔════╝██╔══██╗██╔════╝████╗ ██║██╔════╝██╔════╝   ");
			        System.out.println(   RED +     "           ███████║██████╔╝██████╗ ███████║    ███████║██╔██╗██║██║  ██║    ██║     ██║██████╔╝██║     ██║  ██║██╔███╔██║██████╗ ██████╗ ██████╔╝██████╗ ██╔██╗██║██║     ██████╗    ");
			        System.out.println(LIGHT_BLUE + "           ██╔══██║██╔══██╗██╔═══╝ ██╔══██║    ██╔══██║██║╚████║██║  ██║    ██║     ██║██╔══██╗██║     ██║  ██║██║╚══╝██║██╔═══╝ ██╔═══╝ ██╔══██╗██╔═══╝ ██║╚████║██║     ██╔═══╝    ");
			        System.out.println(             "           ██║  ██║██║  ██║███████╗██║  ██║    ██║  ██║██║ ╚███║██████╔╝    ╚██████╗██║██║  ██║╚██████╗╚█████╔╝██║    ██║██║     ███████╗██║  ██║███████╗██║ ╚███║╚██████╗███████╗   ");
			        System.out.println(  BLUE +     "           ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝    ╚═╝  ╚═╝╚═╝  ╚══╝╚═════╝      ╚═════╝╚═╝╚═╝  ╚═╝ ╚═════╝ ╚════╝ ╚═╝    ╚═╝╚═╝     ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚══╝ ╚═════╝╚══════╝   ");
			        System.out.println(LIGHT_RED +  "                                                          ██████╗ ███████╗     █████╗      ██████╗██╗██████╗  ██████╗██╗     ███████╗           ");
			        System.out.println(             "                                                         ██╔═══██╗██╔════╝    ██╔══██╗    ██╔════╝██║██╔══██╗██╔════╝██║     ██╔════╝           ");
			        System.out.println(    RED  +   "                                                         ██║   ██║██████╗     ███████║    ██║     ██║██████╔╝██║     ██║     ██████╗            ");
			        System.out.println(LIGHT_BLUE + "                                                         ██║   ██║██╔═══╝     ██╔══██║    ██║     ██║██╔══██╗██║     ██║     ██╔═══╝            ");
			        System.out.println(             "                                                         ╚██████╔╝██║         ██║  ██║    ╚██████╗██║██║  ██║╚██████╗███████╗███████╗           ");
			        System.out.println(    BLUE +   "                                                          ╚═════╝ ╚═╝         ╚═╝  ╚═╝     ╚═════╝╚═╝╚═╝  ╚═╝ ╚═════╝╚══════╝╚══════╝           " + RESET);
			        
			        // Radius
			        System.out.println();
			        System.out.println(RED);
			        System.out.print(               "                                                           Enter radius: " + RESET);
			        radius = input.nextDouble();
			        
			        area = PI * radius * radius;
			        circumference = 2 * PI * radius;
			        
			        System.out.println(LIGHT_BLUE);
			        System.out.println();
			        System.out.println();
			        System.out.println(             "                                                           Area of the circle ► " + area + " ◄");
			        System.out.println(             "                                                           Circumference of the circle ►" + circumference + " ◄");
			        System.out.println(RESET);
			        // Return
			        System.out.println();
			        System.out.println(LIGHT_BLUE + "                                                   ╔══════════════════════════════════════════════════════════════════════════════════╗");
			        System.out.println("                                                   ║                                                                                  ║");
			        System.out.println("                                                   ║                 " + RED + "[1] Return                             [2] Exit                  " + LIGHT_BLUE + "║");
			        System.out.println("                                                   ║                                                                                  ║");
			        System.out.println("                                                   ╚══════════════════════════════════════════════════════════════════════════════════╝" + RESET);
			        numbers = input.nextInt();

			        if (numbers == 1) {
			            Conversions();
			        } else if (numbers == 2) {
			            ConfirmExit();
			        } else {
			            Shrek();
			        }
			        input.close();
			    }
			    // Step 9: About Screen
			    public static void AboutScreen() throws InterruptedException {
			    	Scanner input = new Scanner(System.in);
			    	int num;
			    	
			    	do {
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        System.out.println();
			        // ✨ Starfield surrounding effect (scattered look)
		            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                           ");
		            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦     ");
		            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                           ");
		            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦     ");
		            System.out.println(BlackBG+YELLOW + "                                                                         ˚                      *                                                    .         ✦                                           *              ");
		            System.out.println(BlackBG+YELLOW + "            ✦                     .                                *                                    ✦                         ˚                                          *                           ✦       ");

			        // Top border
			        System.out.println(BlackBG+LIGHT_BLUE + "                              ✦       ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗     ✦                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║                                                                                                                 ║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║                                                                                                                 ║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "˚                      *              ║                                                                                                                 ║         .                       *           " + RESET);

			        

			        // Logo (CalX in blocky ASCII style)
			        System.out.println(BlackBG+LIGHT_BLUE + "                            *    .    ║" + BlackBG+LIGHT_RED  + "                                      █████╗ ██████╗  ██████╗ ██╗   ██╗████████╗                                 " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║" + BlackBG+LIGHT_RED  + "                                     ██╔══██╗██╔══██╗██╔═══██╗██║   ██║╚══██╔══╝                                 " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" +    BlackBG+RED     + "                                     ███████║██████╔╝██║   ██║██║   ██║   ██║                                    " + BlackBG+LIGHT_BLUE + "║         .                       *           " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "˚                      *              ║" + BlackBG+LIGHT_BLUE + "                                     ██╔══██║██╔══██╗██║   ██║██║   ██║   ██║                                    " + BlackBG+LIGHT_BLUE + "║ *                           ✦               " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+LIGHT_BLUE + "                                     ██║  ██║██████╔╝╚██████╔╝╚██████╔╝   ██║                                    " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║" +    BlackBG+BLUE    + "                                     ╚═╝  ╚═╝╚═════╝  ╚═════╝  ╚═════╝    ╚═╝                                    " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║                                     " + RESET);

			        // Empty space
			        System.out.println(BlackBG+LIGHT_BLUE + "                            *    .    ║                                                                                                                 ║           ✦                     .   " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║" + BlackBG+LIGHT_BLUE + "                                           Enter a number to get started.                                        " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);


			        // Menu welcome text
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║ *                           ✦               " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║                                                                                                                 ║  *                      ✦            .      " + RESET);

			        // Empty space
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║                                                                                                                 ║                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║         .                       *     " + RESET);

			        // Menu options
			        System.out.println(BlackBG+LIGHT_BLUE + "            ✦                     .   ║" + BlackBG+RED + "                                              [1] " + BlackBG+LIGHT_RED + "Project Description                                            " + BlackBG+LIGHT_BLUE + "║                                             " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + " .   *                                ║" + BlackBG+RED + "                                              [2] " + BlackBG+LIGHT_RED + "Developers                                                     " + BlackBG+LIGHT_BLUE + "║  *                      ✦            .      " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+RED + "                                              [3] " + BlackBG+LIGHT_RED + "Return                                                         " + BlackBG+LIGHT_BLUE + "║     ✦                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║" + BlackBG+RED + "                                              [0] " + BlackBG+LIGHT_RED + "Exit                                                           " + BlackBG+LIGHT_BLUE + "║         .                       *           " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "  ˚                      *            ║                                                                                                                 ║                                       " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                                      ║                                                                                                                 ║    *                   .              " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "*                      ✦            . ║                                                                                                                 ║         .                       *     " + RESET);
			        System.out.println(BlackBG+LIGHT_BLUE + "                            *    .    ║                                                                                                                 ║     ✦                                       " + RESET);

			        // Bottom border
			        System.out.println(BlackBG+LIGHT_BLUE + "*                      ✦            . ╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝  *                      ✦            .      " + RESET);
			     // bottom sparkle scattering
		            System.out.println(BlackBG+YELLOW + "           ✦                           .                          ˚                                 *                             ✦             .                            *                            ˚           ");
		            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                                 ");
		            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦            ");
		            System.out.println(BlackBG+YELLOW + "                        *                                     ✦                        ˚                            .               ✦                              *                                 .                ");
		            System.out.println(BlackBG+YELLOW + "   ˚                                            *                            ✦                                .                            *             ✦                                         ˚                " + RESET);

			        
			        // (No visible prompt)
			        num = input.nextInt();

			        // Validate
			        if (num == 1) {
			        	Clearscreen();
			            Description();
			            break;
			        } else if (num == 2) {
			        	Clearscreen();
			        	Developers();
			        	break;
			        } else if (num == 3) {
			        	showMenu();
			        	break;
			        } else if (num == 0) {
			        	ConfirmExit();
			        	break;
			        } else {
			            Shrek();
			        }
			    } while (true);
				    input.close();
			    }
			    // Step 10: Project Description
			    public static void Description() throws InterruptedException {
			        Scanner input = new Scanner(System.in);
			        int numbers;

			        do {
			        	// Sky Design for the header
				        System.out.println(BlackBG+GRAY + "⣿⣿⣿⣏⣉⣷⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                      ");
				        System.out.println("⠘⢿⣿⣿⣿⣧⣀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                    ");
				        System.out.println("⠀⠀⠉⠙⠿⠿⠏⠁⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                       ⠀⠀ ⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                                   ⠀");
				        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                     ⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀⠀                                                ");
				        System.out.println("⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀                               ⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀⠀                                                ");
				        System.out.println("⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀                              ⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆⠀                                               ");
				        System.out.println("⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆         ⣠⣤⣤⣤                     ⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒             ⣠⣤⣤⣤                             ");
				        System.out.println("⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒         ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                                                                               ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                       ⠀");
				        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⠤⠤⠄⠠⠄⠒⠒⠒⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                                                                             ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                        ");
				        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                                                      ⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                      ");
				        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒ ⠀                                     ⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒                   " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                              ✦      ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗     ✦                                       " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + " .   *                               ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║                                          ˚  ." + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                    ˚          ✦     ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║  ✦                            *              " + RESET);
			            // Logo block
			            System.out.println(BlackBG+LIGHT_BLUE + "                         ✦           ║" + BlackBG+LIGHT_RED +  "                           ███████╗ ██████╗  ██████╗      ██╗███████╗ ██████╗████████╗                           " + BlackBG+LIGHT_BLUE + "║                                      *  " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "        *            ˚               ║" + BlackBG+LIGHT_RED +  "                           ██╔═══██╗██╔══██╗██╔═══██╗     ██║██╔════╝██╔════╝╚══██╔══╝                           " + BlackBG+LIGHT_BLUE + "║      ✦                     .            " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   ˚                    ✦            ║" + BlackBG+LIGHT_RED +  "                           ███████╔╝██████╔╝██║   ██║     ██║█████╗  ██║        ██║                              " + BlackBG+LIGHT_BLUE + "║                    .          *         " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                            *    .   ║" + BlackBG+LIGHT_RED +  "                           ██╔════╝ ██╔══██╗██║   ██║██╗  ██║██╔══╝  ██║        ██║                              " + BlackBG+LIGHT_BLUE + "║              ˚            ✦             " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "             ✦                   *   ║" + BlackBG+RED +        "                           ██║      ██║  ██║╚██████╔╝╚█████╔╝███████╗╚██████╗   ██║                              " + BlackBG+LIGHT_BLUE + "║    *                   .                " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                  ˚          ✦       ║" + BlackBG+RED +        "                           ╚═╝      ╚═╝  ╚═╝ ╚═════╝  ╚════╝ ╚══════╝ ╚═════╝   ╚═╝                              " + BlackBG+LIGHT_BLUE + "║                 ˚                 ✦     " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   *     .                           ║" + BlackBG+LIGHT_RED  + "              ██████╗ ███████╗ ██████╗ ██████╗██████╗ ██╗███████╗ ████████╗██╗ ██████╗ ███╗  ██╗                 " + BlackBG+LIGHT_BLUE + "║                           *          .  " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                ✦      ˚             ║" + BlackBG+LIGHT_RED  + "              ██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗██║██╔═══██╗╚══██╔══╝██║██╔═══██╗████╗ ██║                 " + BlackBG+LIGHT_BLUE + "║  ˚                 ✦                    " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                            *    .   ║" + BlackBG+LIGHT_BLUE + "              ██║  ██║█████╗  ██████╗ ██║     ██████╔╝██║███████╔╝   ██║   ██║██║   ██║██╔██╗██║                 " + BlackBG+LIGHT_BLUE + "║         .                        *      " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "     ˚   ✦                           ║" + BlackBG+LIGHT_BLUE + "              ██║  ██║██╔══╝  ╚════██╗██║     ██╔══██╗██║██╔════╝    ██║   ██║██║   ██║██║╚████║                 " + BlackBG+LIGHT_BLUE + "║         ✦                   ˚           " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "  ✦                                * ║" + BlackBG+BLUE +       "              ██████╔╝███████╗██████╔╝╚██████╗██║  ██║██║██║         ██║   ██║╚██████╔╝██║ ╚███║                 " + BlackBG+LIGHT_BLUE + "║               *   ✦                     " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                 .           ˚       ║" + BlackBG+BLUE +       "              ╚═════╝ ╚══════╝╚═════╝  ╚═════╝╚═╝  ╚═╝╚═╝╚═╝         ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚══╝                 " + BlackBG+LIGHT_BLUE + "║  ˚                      .               " + RESET);

			            System.out.println(BlackBG+LIGHT_BLUE + "             ✦                   .   ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║      *                        ˚         " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "       *             ˚               ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║    ✦                             .      " + RESET);

			            // Text / message
			            System.out.println(BlackBG+LIGHT_BLUE + "                        ˚       ✦    ║" + BlackBG+RED +        "                   CalX is a Java-based, menu-driven program that features a basic calculator                    " + BlackBG+LIGHT_BLUE + "║        *                .               " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   *             .                   ║" + BlackBG+RED +        "             and several conversion tools. These include a linear metric converter, an odd-and-even              " + BlackBG+LIGHT_BLUE + "║  ˚                   ✦                  " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "            .                    *   ║" + BlackBG+RED +        "             number checker, and functions for calculating the area and circumference of a circle.               " + BlackBG+LIGHT_BLUE + "║            .                    *       " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "         ˚             ✦             ║" + BlackBG+RED +        "             The system is designed primarily for educational use and to support Java programming                " + BlackBG+LIGHT_BLUE + "║       *             ˚                   " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   *             .                   ║" + BlackBG+RED +        "                                                    practice.                                                    " + BlackBG+LIGHT_BLUE + "║  ˚                   ✦                  " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "              *                 .    ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║                  .                     ˚     " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   *             .                   ╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════" + BlackBG+LIGHT_BLUE + "╣  ˚                   ✦                  " + RESET);

			            System.out.println(BlackBG+LIGHT_BLUE + "  ✦                             ˚    ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║             .            *              " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "            .                    *   ║" + BlackBG+BLUE +       "                            [1] Return                                      [2] Exit                             " + BlackBG+LIGHT_BLUE + "║      ✦                         ˚        " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "         ˚             ✦             ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║        *                   .            " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "     *            .                  ╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝  ✦                      *                                  " + RESET);

			            // bottom sparkle scattering
			            System.out.println(BlackBG+YELLOW + "           ✦                           .                          ˚                                 *                             ✦             .                            *                            ˚           ");
			            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                                 ");
			            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦            " + RESET);
			            
			            numbers = input.nextInt();

				        if (numbers == 1) {
				        	Clearscreen();
				            AboutScreen();
				            break;
				        } else if (numbers == 2) {
				            ConfirmExit();
				        } else {
				            Shrek();
				        }
			        } while(true);
			        input.close();		    }
			    public static void Developers() throws InterruptedException{
			    	Scanner input = new Scanner(System.in);
			    	int numbers;
			    	do {
			        	// Sky Design for the header
				        System.out.println(BlackBG+GRAY + "⣿⣿⣿⣏⣉⣷⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                      ");
				        System.out.println("⠘⢿⣿⣿⣿⣧⣀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                    ");
				        System.out.println("⠀⠀⠉⠙⠿⠿⠏⠁⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                       ⠀⠀ ⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                                   ⠀");
				        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣿⣿⣿⣿⣷⣤⣾⣿⣷⣦⣀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀                                     ⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀⠀                                                ");
				        System.out.println("⠀⠀⠀⠀⠀⣀⣀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀⠀⠀⠀                               ⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀⠀                                                ");
				        System.out.println("⣤⣤⣠⣶⣾⠿⢿⣿⣿⣟⣭⣿⣿⣿⣯⣻⣿⣿⣿⣯⣹⣻⣯⣾⠋⢻⠒⠓⠒⠂⠀⠀⠐⠲⠖⠒⠒⠛⠓⠒⠀⠀⠀⠀⠀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⡄⠀                              ⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆⠀                                               ");
				        System.out.println("⠤⠤⠥⠤⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆         ⣠⣤⣤⣤                     ⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒             ⣠⣤⣤⣤                             ");
				        System.out.println("⠀⠀⠀⠀⠀⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒         ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                                                                               ⠀⣀⣴⣶⣶⣶⣤⣿⣿⣿⣿⣷⠀⢀⣀⡀                       ⠀");
				        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⠤⠤⠄⠠⠄⠒⠒⠒⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                                                                             ⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿                        ");
				        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                                                      ⣀⣀⣀⠀⠀⠀⠀⣀⠀⢀⣀⡀⠀⢀⣀⣀⣀⣀⣀⣠⣾⣿⡿⣿⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣩⣷⣆                      ");
				        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒ ⠀                                     ⠀⣀⣀⣀⣤⣤⣤⣤⡤⠤⠤⠤⠤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠉⠉⠉⠁⠐⠒⠊⠉⠀⠘⠛⠛⠛⠛⠛⠚⠛⠉⠉⠀⠉⠉⠉⠉⠀⠒                   " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                              ✦      ╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗     ✦                                       " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + " .   *                               ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║                                          ˚  ." + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                    ˚          ✦     ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║  ✦                            *              " + RESET);
			            // Logo block
			            System.out.println(BlackBG+LIGHT_BLUE + "                         ✦           ║" + BlackBG+LIGHT_RED +  "                           ███████╗ ██████╗  ██████╗      ██╗███████╗ ██████╗████████╗                           " + BlackBG+LIGHT_BLUE + "║                                      *  " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "        *            ˚               ║" + BlackBG+LIGHT_RED +  "                           ██╔═══██╗██╔══██╗██╔═══██╗     ██║██╔════╝██╔════╝╚══██╔══╝                           " + BlackBG+LIGHT_BLUE + "║      ✦                     .            " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   ˚                    ✦            ║" + BlackBG+LIGHT_RED +  "                           ███████╔╝██████╔╝██║   ██║     ██║█████╗  ██║        ██║                              " + BlackBG+LIGHT_BLUE + "║                    .          *         " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                            *    .   ║" + BlackBG+LIGHT_RED +  "                           ██╔════╝ ██╔══██╗██║   ██║██╗  ██║██╔══╝  ██║        ██║                              " + BlackBG+LIGHT_BLUE + "║              ˚            ✦             " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "             ✦                   *   ║" + BlackBG+RED +        "                           ██║      ██║  ██║╚██████╔╝╚█████╔╝███████╗╚██████╗   ██║                              " + BlackBG+LIGHT_BLUE + "║    *                   .                " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                  ˚          ✦       ║" + BlackBG+RED +        "                           ╚═╝      ╚═╝  ╚═╝ ╚═════╝  ╚════╝ ╚══════╝ ╚═════╝   ╚═╝                              " + BlackBG+LIGHT_BLUE + "║                 ˚                 ✦     " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   *     .                           ║" + BlackBG+LIGHT_RED  + "              ██████╗ ███████╗██╗  ██╗███████╗██╗      ██████╗ ███████╗ ███████╗██████╗  ██████╗                 " + BlackBG+LIGHT_BLUE + "║                           *          .  " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                ✦      ˚             ║" + BlackBG+LIGHT_RED  + "              ██╔══██╗██╔════╝██║  ██║██╔════╝██║     ██╔═══██╗██╔═══██╗██╔════╝██╔══██╗██╔════╝                 " + BlackBG+LIGHT_BLUE + "║  ˚                 ✦                    " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                            *    .   ║" + BlackBG+LIGHT_BLUE + "              ██║  ██║█████╗  ██║  ██║██████╗ ██║     ██║   ██║███████╔╝█████╗  ██████╔╝██████╗                  " + BlackBG+LIGHT_BLUE + "║         .                        *      " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "     ˚   ✦                           ║" + BlackBG+LIGHT_BLUE + "              ██║  ██║██╔══╝  ╚██╗██╔╝██╔═══╝ ██║     ██║   ██║██╔════╝ ██╔══╝  ██╔══██╗╚════██╗                 " + BlackBG+LIGHT_BLUE + "║         ✦                   ˚           " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "  ✦                                * ║" + BlackBG+BLUE +       "              ██████╔╝███████╗ ╚███╔╝ ███████╗███████╗╚██████╔╝██║      ███████╗██║  ██║██████╔╝                 " + BlackBG+LIGHT_BLUE + "║               *   ✦                     " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "                 .           ˚       ║" + BlackBG+BLUE +       "              ╚═════╝ ╚══════╝  ╚══╝  ╚══════╝╚══════╝ ╚═════╝ ╚═╝      ╚══════╝╚═╝  ╚═╝╚═════╝                  " + BlackBG+LIGHT_BLUE + "║  ˚                      .               " + RESET);

			            System.out.println(BlackBG+LIGHT_BLUE + "             ✦                   .   ╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════" + BlackBG+LIGHT_BLUE + "╣      *                        ˚         " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "       *             ˚               ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║    ✦                             .      " + RESET);

			            // Text / message
			            System.out.println(BlackBG+LIGHT_BLUE + "                        ˚       ✦    ║" + BlackBG+LIGHT_RED +  "                                     Group-1 Members and their contributions                                     " + BlackBG+LIGHT_BLUE + "║        *                .               " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   *             .                   ║" + BlackBG+RED +        "                                                                                                                 " + BlackBG+LIGHT_BLUE + "║  ˚                   ✦                  " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "            .                    *   ║" + BlackBG+RED +        "                 ► Acid, Yuna C. ► Design, Compile, Odd/Even, Exit, fixed all of the syntax errors ◄             " + BlackBG+LIGHT_BLUE + "║            .                    *       " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "         ˚             ✦             ║" + BlackBG+RED +        "                 ► Reduccion, Charlene ► Programmed the About us, Developers, Project Descriptions ◄             " + BlackBG+LIGHT_BLUE + "║       *             ˚                   " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   *             .                   ║" + BlackBG+RED +        "                 ► Tuatis, Danilo Jr. ► Calculator, Unit Converter, Area and Circumference ◄                     " + BlackBG+LIGHT_BLUE + "║  ˚                   ✦                  " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "              *                 .    ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║                  .                     ˚     " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "   *             .                   ╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════" + BlackBG+LIGHT_BLUE + "╣  ˚                   ✦                  " + RESET);

			            System.out.println(BlackBG+LIGHT_BLUE + "  ✦                             ˚    ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║             .            *              " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "            .                    *   ║" + BlackBG+BLUE +       "                            [1] Return                                      [2] Exit                             " + BlackBG+LIGHT_BLUE + "║      ✦                         ˚        " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "         ˚             ✦             ║                                                                                                                 " + BlackBG+LIGHT_BLUE + "║        *                   .            " + RESET);
			            System.out.println(BlackBG+LIGHT_BLUE + "     *            .                  ╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝  ✦                      *                                  " + RESET);

			            // bottom sparkle scattering
			            System.out.println(BlackBG+YELLOW + "           ✦                           .                          ˚                                 *                             ✦             .                            *                            ˚           ");
			            System.out.println(BlackBG+YELLOW + "               ✦                                    .            ˚                                              *                      ✦            .                                                                 ");
			            System.out.println(BlackBG+YELLOW + "    .                                 ✦                      *                                    ˚                          ✦                                                         .                 ✦            " + RESET);
			            
			            numbers = input.nextInt();

				        if (numbers == 1) {
				        	Clearscreen();
				            AboutScreen();
				            break;
				        } else if (numbers == 2) {
				            ConfirmExit();
				        } else {
				            Shrek();
				        }
			        } while(true);
			    	input.close();
			    }
			        // Step 13: 
			    	public static void Shrek() throws InterruptedException{
			    		Scanner input = new Scanner(System.in);
			    		int number;
			    	System.out.println(BlackBG+LIGHT_GREEN + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠛⠛⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⣿⣿⣿⡿⠋⣠⣶⣿⣿⣿⣷⣄⠙⢿⣿⣿⣿⠛⢿⣿⣿⣿⣿⣿⣿   ERROR, BROWSKI  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠈⠿⡿⠁⣀⣄⡉⠻⣿⣿⠟⠉⢀⣉⠻⠟⠁⠀⣨⣿⣿⣿⣿⣿       GO BACK        ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⡄⠀⠀⢀⠀⣀⠀⢀⡃⠀⠀⢀⠀⠱⢠⣶⣿⣿⣿⣿⣿⣿⣿⣿    OR DADDY SHREK   ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⢠⣶⣤⡤⠤⢶⣿⣿⣦⣤⣄⣤⣮⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿   WILL SPANK YA  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠘⠛⠋⣀⣀⠈⠛⢛⣋⣩⣌⠻⠿⠆⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿              ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠿⠠⣄⡙⠿⢿⣿⣿⣿⣿⠿⢷⣄⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿     ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⢀⣶⢸⣿⣿⣤⣤⣤⣴⣶⣶⣿⣿⣿⣆⡘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⢠⣿⡙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣼⣿⣷⣮⣕⣈⣛⠿⣿⣿⣿⣿⣿ ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠙⠃⣤⡙⠛⠻⢿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣮⣟⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⣋⣍⣩⣤⣄⠀⢀⣤⣶⣶⣄⣈⠙⠂⣀⣀⣭⣥⣴⣶⣾⢡⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⣤⣾⣿⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣛⣭⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠮⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠘⢻⣿⣿⣿⣿⣿⣿⡌⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢁⡀⠿⡿⠿⠙⠁⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢏⠔⠀⢀⣣⣄⣉⣿⣿⣿⣿⣿⡌⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠘⢁⠀⠀⠀⠀⠀⢈⠉⠛⢿⣿⣿⣿⣿⣿⣿⣿⡿⢋⡀⠀⠘⣿⢿⣿⡿⠿⠿⡭⠛⠉⠀ ⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢁⣾⣦⠀⢷⣶⣦⠀⠀⠈⠓⢤⡀⠉⠉⠋⠉⠉⠉⠛⠛⣛⣁⠀⠀⠀⢀⣀⠀⣀⡀⠀⠀⠀  ⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⣼⣿⣿⡇⣼⣿⣿⡇⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⣠⢶⣿⣿⣿⣷⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀  ⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⣿⡿⢰⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣶⣾⣿⣿⣿⣿⣿⣶⣟⣀⣠⣄⣠⣴⣶⡀ ⠀⠙⢿⡏⢿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                                                                                  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿               [1] Return                            [2] Exit                     ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                                                                                  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿" + RESET);
			    	number = input.nextInt();
			    	
			    	if (number == 1) {
			    		showLoadingScreen();
			    	} else if(number == 2) {
			    		ConfirmExit();
			    	}
			    	input.close();
			    	}
			    	// Step : show clear screen instead of empty spaces
			    	public static void Clearscreen() {
				        for (int i = 0; i < 35; i++) {
				            System.out.println("\n");
				        }
				        }
			    	// Step 14:
			    	public static void ConfirmExit() throws InterruptedException{
			    		Scanner input = new Scanner(System.in);
			    		char choice;
			    		do {
				    	System.out.println(BlackBG+PINK + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
				    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
				    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
				    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
				    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
				    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
				    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
				    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
				    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⣛⣛⣩⣭⣭⣭⣤⣭⣭⣭⣭⣛⡻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⣛⣛⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢟⣩⣴⣾⡿⢟⣛⣿⣭⣭⣭⣭⣭⣭⣭⣝⡛⠿⣷⣶⣭⣽⣛⡻⠿⠿⡿⣫⣶⣿⠿⣛⠻⣿⣎⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿    Are You Sure   ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢋⣴⡿⢟⣫⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣭⠭⠛⠻⠿⠿⣿⣾⡿⢋⣶⣿⣎⢆⠹⣿⡌⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿  you want to leave  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⡿⢟⣥⣾⡿⢋⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢰⢿⣿⣷⣶⣍⢒⡈⠑⡟⣻⣿⣎⢸⠠⢻⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿  [Y]es;</[N]o>-<  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣩⣴⣶⡿⣶⣾⡿⢟⣩⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⡇⢸⡸⢿⣷⡬⡙⡸⡮⠌⠀⠍⠞⠫⣅⣣⣾⡟⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿     ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣸⣿⢫⣶⣾⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠇⢷⣈⣛⠒⢂⣤⢰⣂⢫⣿⣓⣓⠮⣛⢿⣷⣆⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢣⣾⡿⣣⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⠆⣴⢞⣿⡿⣸⣿⣷⣙⢿⣿⣿⣾⣷⢹⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿   ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢻⡿⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣼⣿⣿⣿⢃⣿⣿⣿⣿⣷⣝⢿⡿⡇⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⣿⡇⣿⣿⣿⣿⡿⠛⠉⠁⠀⠀⠈⠙⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠁⠀⠈⠙⢿⣿⣇⢻⣿⣿⡏⣼⣿⣿⣿⣿⣿⣿⣧⠻⡏⢿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢘⣿⢃⣿⣿⡿⠉⠀⠀⢀⣀⡀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠈⠻⣧⡙⣟⡆⣿⣿⣿⠋⠈⢹⣿⣿⣧⡴⣾⡿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⢸⣿⣿⠁⠀⠀⠀⠈⠉⠁⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠶⠆⠀⠀⠀⠀⠀⠀⠀⠘⣿⣬⢁⣿⣿⣿⣷⡄⢨⣿⣿⣿⢇⣿⠏⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣾⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⣼⡿⣹⣿⣿⣿⣷⣄⣀⣀⠀⣀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣀⠀⠀⠀⠀⠀⣠⣿⣿⡋⢉⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡯⣸⣿⢡⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡘⣿⣇⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⡇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣽⡿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⡇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣡⣾⡿⣡⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢿⣷⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢏⣾⡿⢃⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡜⢿⣷⡹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢸⣿⢁⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣎⠻⣿⣎⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢃⣿⡏⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣜⠿⣿⣮⣛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢋⣾⡿⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣬⡛⢿⣷⣍⡻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣱⣿⠟⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣍⡻⣿⣆⢿⣿⣿⣿⣿⠿⠿⠿⠿⠿⣿⣿⣿⣿⠟⣫⣭⣭⣝⡻⢿⣿⣿⣿⣿⣿⣿⣿⡿⣫⣴⣿⠟⣡⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡸⣿⣌⢿⣿⡿⢃⣾⡟⠿⢿⣷⣬⣭⣭⣴⣿⠟⢩⢝⡻⣿⣆⠻⣿⣿⣿⣿⣿⡟⣰⣿⢏⣡⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡙⢿⣷⣭⣴⡿⢟⣥⣾⣷⣬⣭⣯⣭⣭⣴⣾⣿⣷⣷⣌⠿⣷⣬⣝⣛⣛⣋⣴⣿⢏⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			    		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣮⣭⣴⣦⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣮⣝⣛⣛⣛⣛⣋⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
				    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
				    	System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿" + RESET);
				    	// (No visible prompt)
				        choice = input.next().charAt(0);

				        // Validate
				        if (choice == 'y' || choice == 'Y') {
				            Exit();
				            break;
				        } else if(choice == 'n' || choice == 'N') {
				        	Clearscreen();
				        	printBanner();
				        	showLoadingBar();
				        	showLoadingScreen();
				        	break;
				        } else {
				        	Shrek();
				        }
				    } while(true);
				        input.close();
				    }
				        //Last part, Step 15:
				        public static void Exit() {
				        	
				        	System.out.println(BlackBG+LIGHT_PINK + "⠀                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                     ⠀⠀⠀                                       ⠀⠀⠀                                       ⠀⠀⠀         ⠀                ⠀⠀⠀");
				        	System.out.println("⠀⠀⠀⠀                ⠀⠀⠀⠀⠀⡠⠚⠉⠉⠉⠉⠁⠀⠀⠀⠈⠉⠙⠒⠢⣄⡀⠀⠀⠀⠀                                                                       ⠀⠀⠀                                       ⠀⠀⠀                                       ⠀⠀⠀               ⠀                ⠀⠀⠀");
				        	System.out.println("⠀                ⠀⠀⠀⠀⠀⢀⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⣄⠀⠀⠀                                                                                ⠀⠀⠀             ⠀⠀⠀                                       ⠀⠀⠀                                                 ⠀⠀");
				        	System.out.println("⠀                ⠀⠀⠀⠀⡰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣆⠀⠀                                                       ⠀⠀⠀                                       ⠀⠀⠀                                        ⠀⠀⠀                                                ⠀");
				        	System.out.println("                 ⠀⠀⠀⡸⠁⠀⠀⠀⠀⠀⠀⠀⡖⢲⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡆⠀                                                      ⠀⠀⠀                                                                            ⠀⠀⠀  ⠀⠀⠀                                                  ⠀");
				        	System.out.println("⠀                ⠀⠀⢸⠁⠀⡴⢲⠀⠀⠀⠀⢸⠀⣿⠅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄                                                                                       ⠀⠀⠀                                       ⠀⠀⠀                                                       ⠀⠀ ⠀");
				        	System.out.println("⠀⠀                ⢰⠃⠀⠀⣇⣼⡇⠀⠀⠀⢸⡿⠏⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀             ██████████╗██╗   ██╗ █████╗ ███╗  ██╗██╗ ██╗   ██╗  ██╗ ██████╗ ██╗   ██╗                                         ⠀⠀⠀                                                           ");
				        	System.out.println("⠀                 ⡼⠀⠀⠀⣿⣟⣿⠀⠀⠀⠀⠇⠀⠀⡅⣞⣩⣭⣭⣇⠖⠂⠀⠀⠀⠀⠀⠀⠀⢸⠀⡇            ╚═══██╔═══╝██╚═══██║██╔══██╗████╗ ██║██║██╔╝   ╚██╗██╔╝██╔═══██║██║   ██║                                        ⠀⠀⠀                                       ⠀                ⠀⠀   ");
				        	System.out.println("⠀⠀                ⡇⠀⠀⠀⣏⠀⢨⠀⠀⠀⠀⠘⠦⠶⠋⠙⠛⠋⡙⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⢸                ██║    ████████║███████║██╔██╗██║████╔╝     ╚███╔╝ ██║   ██║██║   ██║                                         ⠀⠀⠀                                      ⠀⠀                    ");
				        	System.out.println("                ⢠⠀⢷⣞⡇⠀⢇⣠⠏⢠⠖⢲⠀⠀⠀⠀⠀⠀⢀⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⢸                ██║    ██╔═══██║██╔══██║██║ ████║██╔██╗      ╚█╔╝  ██║   ██║██╚═══██║                                          ⠀⠀⠀                                     ⠀                ⠀⠀  ");
				        	System.out.println("                ⢘⠀⢹⠉⠁⠀⠀⠀⠀⠀⣇⠀⣸⠀⠀⠀⠀⡀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣏⡏                ██║    ██║   ██║██║  ██║██║  ███║██║ ██╗      █║    ██████╔╝ ██████╔╝                                           ⠀⠀⠀                                 ⠀⠀⠀                      ");
				        	System.out.println("                 ⠇⠈⢇⠀⠀⠀⠀⠀⠀⠈⠉⠁⠀⠀⢀⠌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣏⠏⠀                ╚═╝    ╚═╝   ╚═╝╚═╝  ╚═╝╚═╝  ╚══╝╚═╝ ╚═╝      ╚╝    ╚═════╝  ╚═════╝                                            ⠀⠀⠀                               ⠀⠀⠀                        ");
				        	System.out.println("⠀                ⠸⡀⠈⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀                 ████████╗ ███████╗██████╗    ██╗   ██╗ ██████╗██╗████╗  ██╗ ███████╗                                           ⠀⠀⠀                            ⠀⠀⠀                           ");
				        	System.out.println("⠀                 ⠀⠑⠂⠈⢣⣀⠀⠀⠀⠀⠀⢀⡒⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠃⠀⠀⠀                ██╔═════╝██╔═══██║██╔══██╗   ██║   ██║██╔═══╝ ██║████╗ ██║ ██╔════╝                                     ⢀⣠⠶⠚⠋⠉⠉⠉⠁⠀⠀⠀   ⠀⠀⠀                   ⠀                              ");
				        	System.out.println("⠀⠀                    ⡟⢦⡀⠀⠀⣀⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣰⡟⠀⠀⠀⠀⠀                 ██████╗  ██║    ██║█████╔╝   ██║   ██║ █████╗ ██║██╔██╗██║ ██║ ████╗                                  ⣠⠶⠋⠀⣀⣀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                    ⠀⠀⠀                       ");
				        	System.out.println("                   ⠀⠀⠀⡅⠀⠈⠉⡳⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠴⠚⠉⡞⠁⠀⠀⠀⠀⠀                ██╔════╝  ██║   ██║ ██╔═██╗   ██║   ██║ ╚═══██╗██║██║╚████║ ██╚═══██║                            ⠀⢀⣀⠤⠞⠁⠀⠀⣴⠃⣼⠀⠀⣰⡇⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠐⠒⠒⠒⠤⣀⠀⠀⠀         ⠀⠀⠀        ⠀⠀⠀                     ");
				        	System.out.println("⠀⠀⠀                ⠀⠀⠀⡇⠀⠀⢀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠖⠀⠀⠀⢀⠎⠀⠀⠀⠀⠀⠀                 ██║       ███████╔╝██║  ██║   ██████╔╝ █████╔╝██║██║ ╚███║ ╚██████╔╝                           ⢀⡤⠚⠉⠀⡄⠀⠀⠀⢸⣿⣿⡿⠀⠀⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠲⡄                  ⠀                        ");
				        	System.out.println("⠀⠀                ⠀⠀⠀⠀⡇⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠊⠁⠀⠀⢀⡰⠋⠀⠀⠀⠀⠀⠀                 ╚═╝        ╚═════╝ ╚═╝  ╚═╝   ╚═════╝  ╚════╝  ╚═╝╚═╝  ╚══╝  ╚════╝                            ⢠⠏⠁⠀⠀⡰⠁⠀⣀⡀⢸⣿⣿⠇⠀⠀⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣄⠀⠀⠱⡀⠀⠀⠀⠀             ⠀⠀⠀                    ⠀⠀⠀⠀");
				        	System.out.println("⠀⠀                  ⠀⠀⠇⡰⠋⠁⠀⠀⠀⠀⠀⠀⡀⠄⠁⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀                                  ██████╗ █████╗ ██╗     ██╗  ██╗  ██╗                                         ⢀⡟⠀⠀⣀⡀⡀⠀⢾⣯⣭⠟⠉⢋⣀⣀⣀⡨⠍⠁⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠲⠯⢭⣅⣈⡀⠀⠀⠱⡄⠀⠀⠀              ⠀⠀⠀     ⠀⠀⠀             ⠀");
				        	System.out.println("⠀⠀                  ⠀⢀⠞⠁⠀⠀⠀⠀⠀⠀⡠⠈⠀⠀⠀⠀⠀⡠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                 ██╔════╝██╔══██╗██║     ╚██╗██╔╝  ██║                                        ⢀⡾⠀⠀⠒⢺⢀⡇⠀⠀⠀⠀⠀⠀⠈⠻⠿⠿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⡄⠀⠀⠀⠀⠀⠀⠀⠱⡄⠀⠀                ⠀⠀⠀                     ⠀");
				        	System.out.println("⠀⠀                ⠀⠀⡰⠊⠀⠀⠀⠀⠀⠀⠀⡐⠀⠀⠀⠀⣀⠔⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                 ██║     ███████║██║      ╚███╔╝   ██║                                       ⣠⠞⠁⠀⠀⠀⠈⡎⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣶⡄⠀⠀⠀⠀⠀⠀⠙⣆⠀                  ⠀⠀⠀                    ⠀");
				        	System.out.println("⠀⠀                ⢠⠋⠁⠀⠀⠀⠀⠀⠀⠔⠁⠀⠀⢀⣠⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                ██║     ██╔══██║██║      ██╔██╗   ╚═╝                                      ⢠⡞⠁⠀⢷⣄⠀⣴⣾⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠃⠙⢶⣤⡀⠀⠀⠀⠀                     ⠀⠀⠀                  ⠀");
				        	System.out.println("                ⠀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠔⢁⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                ╚██████╗██║  ██║███████╗██╔╝ ██╗  ██╗                                      ⣾⠃⠀⠀⣈⣻⣿⣿⠟⠁⠹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠏⠀⠀⠀⢹⡏⢦⠀                                            ⠀");
				        	System.out.println("                ⣼⡁⠀⠀⠀⠀⠀⠀⢀⢉⣿⠀⠍⠁⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                 ╚═════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝   ╚═╝                                     ⢠⡏⠀⠀⣰⣿⢠⣾⠟⠀⠀⠀⠘⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⡴⠋⠀⠀⠀⠀⠈⠻⣿⡄                             ⠀⠀⠀           ⠀⠀");
				        	System.out.println("                ⢹⠉⠀⠀⡀⠀⠀⠀⢨⢿⡂⠀⠀⠀⢠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                  ⠀⠀⠀                       ⡼⠀⠀⢰⣿⠿⠛⠁⠀⠀⠀⠀⠀⠈⣿⠷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠖⠋⠉⠁⢸⡁⠀⠀⠀⠀⠀⠀⠀⣠⠃⠀⠀⠀⠀                ⠀                ⠀⠀⠀   ⠀⠀");
				        	System.out.println("                ⠘⣄⠐⣿⠀⠀⠀⠀⠁⠀⠙⣆⠀⠀⡞⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                           ⢠⡇⠀⠀⠈⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠉⠛⠶⣦⣤⣀⣀⣶⣤⠞⠋⠁⠀⠀⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⣸⣿⢦⣤⡀⠀⠀                 ⠀⠀⠀⠀⠀⠀             ⠀⠀⠀⠀⠀");
				        	System.out.println("                ⠀⠈⢻⡇⠀⠀⠀⠀⠀⠀⠀⠀⠹⡄⠃⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                     ⠀⠀                    ⢸⣴⠀⣤⢶⣿⠀⠀⠀⠀⠀⠀⠀⠀⢰⠿⡆⠀⠀⠀⠀⠀⠈⣽⡟⠛⣧⡀⠀⠸⡄⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⠹⣧⣴⠟⢇⢀⣀                  ⠀⠀⠀⠀              ⠀⠀⠀⠀⠀");
				        	System.out.println("⠀                ⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                              ⠀                                       ⠀⠀⠀                   ⠘⣯⣜⠁⠘⠿⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄⣿⣄⠀⠀⠀⠀⣠⡿⠀⠀⠘⣷⡄⠀⠹⡆⠀⢀⣿⠀                        ⠀⠀⠀                      ⠀⠀⠀⠀");
				        	System.out.println("⠀                ⠀⠀⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                              ⠀                                       ⠀⠀⠀                     ⠹⣿⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣟⣿⣧⡄⠀⢰⡿⠁⠀⠀⠀⠘⣷⣀⣠⢷⣽⣿⠏        ⠀⠀⠀                                   ⠀   ⠀⠀⠀");
				        	System.out.println("⠀⠀                ⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀⡇⠸⡄⠨⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                     ⠀⠀⠀                                   ⢹⡛⠻⣿⣶⣿⠃⠀⠀⠀⠀⠀⠘⣿⣏⢀⣤⣼⡇        ⠀⠀⠀                                   ⠀  ⠀⠀⠀⠀");
				        	System.out.println("⠀⠀                 ⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⡇⠀⡇⠀⡃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                              ⠀                                       ⠀⠀⠀                                   ⢸⣟⡶⣮⣽⡏⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⡶⠟⢱⡀    ⠀⠀⠀                                       ⠀⠀ ⠀⠀");
				        	System.out.println("⠀⠀                ⠀⠀⠀⠀⠸⡀⠀⠀⠀⠀⠀⡇⠀⢧⠀⢐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                              ⠀                                       ⠀⠀⠀                                   ⢸⣿⠿⠛⠛⠙⡄⠀⠀⠀⠀⠀⠀⣰⠿⣟⠉⠀⠈⣧⠀    ⠀⠀⠀                                       ⠀⠀ ⠀⠀");
				        	System.out.println("⠀⠀⠀                ⠀⠀⠀⠀⠹⡀⠀⠀⠀⠀⡇⠀⢸⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                  ⠀⠀⠀                                      ⢸⣧⠀⠀⠀⢀⣵⠀⠀⠀⠀⠀⠀⢿⠀⢸⡀⠀⢸⡏ ⠀⠀⠀                                       ⠀⠀⠀     ⠀");
				        	System.out.println("⠀⠀⠀                 ⠀⠀⠀⠀⢹⡀⠀⠀⠀⠃⠀⢸⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                   ⠀⠀⠀                                      ⠈⣏⠀⠀⢠⣼⠏⠀⠀⠀⠀⠀⠀⠈⢿⣄⠃⠀⢸⠀  ⠀⠀⠀                                       ⠀⠀⠀  ⠀ ⠀");
				        	System.out.println("⠀⠀⠀⠀                ⠀⠀⠀⠀⠀⢹⠀⠀⠀⠀⠀⠀⡇⠀⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                   ⠀⠀⠀                                       ⣿⠀⠀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣀⣀⣀⠀   ⠀⠀⠀                                       ⠀⠀⠀    ");
				        	System.out.println("⠀⠀⠀⠀⠀                ⠀⠀⠀⠀⠀⢳⠀⠀⠀⠀⠀⡇⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                 ⠀⠀⠀                          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣷⣶⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⡛⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀         ⠀⠀⠀                      ⠀⠀⠀   ⠀");
				        	System.out.println("⠀⠀⠀⠀                ⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⡈⡆⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                  ⠀⠀⠀                          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣼⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣷⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀                            ⠀⠀⠀   ⠀⠀" + RESET);			        	
				      System.exit(0);  
			    }
}
