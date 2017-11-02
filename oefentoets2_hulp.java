/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Print de studentgegevens uit.
        System.out.println("Dit programma is gemaakt door ");
        
        //maakt een scanner input aan.
        Scanner input = new Scanner(System.in);

        //declareert de string variable team
        String Team1;
        String Team2;
        
        //Vraagt naar de namen van de teams
        System.out.println("Naam van team 1:");
        Team1 = input.nextLine();
        
        System.out.println("Naam van team 2:");
        Team2 = input.nextLine();
        
        //Maakt een int variable aan voor de aantal wins per team.
        int Team1wins = 0;
        int Team2wins = 0;
        
        //maakt een int variable voor het maximale wins nodig.
        int maxWins = 4;
        //maakt een int variable voor het maximale wedstrijden dat gespeeld mogen worden.
        int maxWedstrijden = 7;
        
        //houdt buiten de for loop bij hoeveel wedstrijden gespeeld zijn.
        int wedstrijdengespeeld = 0;
        
        //Maakt een int array van 7 inputs voor de teams.
        int[] Team1score = new int[maxWedstrijden];
        int[] Team2score = new int[maxWedstrijden];
        
        //Maakt een String variable voor de wedstrijden output.
        String wedstrijden = "";
        
     
        //maakt een for loop totdat het maximale aantal wedstrijden zijn gespeeld.
        for(int i = 0; i < maxWedstrijden; i++){

        //Voor het printen van welke wedstrijd het is.
        int wedstrijdcount = i + 1;

        //noemt de huidige wedstrijd op.
        System.out.println("\nUitslag wedstrijd " + wedstrijdcount);

        //vraagt naar de aantal punten per team.
        System.out.println("Aantal punten " + Team1 + ":");
        Team1score[i] = input.nextInt();

        System.out.println("Aantal punten " + Team2 + ":");
        Team2score[i] = input.nextInt();

        //Plaats de wedstrijd gegevens in de string wedstrijden dat op het eind een overzicht uitprint
        wedstrijden += "\nwedstrijd " + wedstrijdcount + ": " + Team1 + " - " + Team2 + " " + Team1score[i] + " - " + Team2score[i];

            //voegt een win toe aan het team dat wint.
            if(Team1score[i] > Team2score[i]){
                    Team1wins++;
            }else if(Team2score[i] > Team1score[i]){
                    Team2wins++;
            }

         wedstrijdengespeeld++;

         if(Team1wins == maxWins || Team2wins == maxWins){
             break;
         }
        }
         
        //Print het aantal gespeelde wedstrijden uit.
        System.out.println("\nAantal gespeelde wedstrijden: " + wedstrijdengespeeld);
        //Print de winnaar uit
        printWinnaar(Team1, Team2, Team1wins, Team2wins, maxWins);
       
        //Print alle wedstrijden uit die gespeeld zijn met de scores per team
        for(int i = 0; i < wedstrijdengespeeld;i++){
            System.out.println("wedstrijd " + (i + 1) + ": " + Team1 + " - " + Team2 + " " + Team1score[i] + " - " + Team2score[i]);
        }
    }
    static void printWinnaar(String Team1, String Team2, int Team1wins, int Team2wins, int maxWins){
        if(Team1wins == maxWins){
            System.out.println(Team1 + " heeft gewonnen met " + Team1wins + " - " + Team2wins + "\n");
        }else if(Team2wins == maxWins){
            System.out.println(Team2 + " heeft gewonnen met " + Team2wins + " - " + Team1wins + "\n");
        }
    }