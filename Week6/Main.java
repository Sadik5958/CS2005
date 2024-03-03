// GRPA-1

import java.util.*;
class CricketPlayer{
  private String name;
  private int wickets;
  private int runs;
  private int matches;
  public CricketPlayer(String s, int w, int r, int m){
    this.name = s;
    this.wickets = w;
    this.runs = r;
    this.matches = m;
  }
  public String getName(){
    return name;
  }
  public int getWickets(){
    return wickets;
  }
  public int getRuns(){
    return runs;
  }
  public double avgRuns(){
    return runs/matches;
  }
  public double avgWickets(){
    return wickets/matches;
  }
} 
public class Main {
    // Define displayPlayers() method here
		public static void displayPlayers(ArrayList<CricketPlayer> bw, ArrayList<CricketPlayer> bt) {
			for (CricketPlayer player: bw) {
				System.out.print(player.getName() + " ");
			}
			System.out.println();

			for (CricketPlayer player: bt) {
				System.out.print(player.getName() + " ");
			}
		}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CricketPlayer p1 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                    sc.nextInt(), sc.nextInt());
        CricketPlayer p2 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                    sc.nextInt(), sc.nextInt());
        CricketPlayer p3 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                    sc.nextInt(), sc.nextInt());
        CricketPlayer p4 = new CricketPlayer(sc.next(), sc.nextInt(), 
                                    sc.nextInt(), sc.nextInt());

				sc.close();
    
        // Define ArrayList objects here
				ArrayList<CricketPlayer> players = new ArrayList<>();
				players.add(p1);
				players.add(p2);
				players.add(p3);
				players.add(p4);

				ArrayList<CricketPlayer> bt = new ArrayList<>();
				ArrayList<CricketPlayer> bw = new ArrayList<>();
				
				for (CricketPlayer player: players) {
					if (player.avgRuns() > 25) {
						bw.add(player);
					}
				}

				for (CricketPlayer player: players) {
					if (player.avgWickets() > 1) {
						bt.add(player);
					}
				}

 displayPlayers(bw, bt);
  }
}  
