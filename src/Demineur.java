import java.util.Random;

public class Demineur {
    public static int LINES = 6;
    public static int COLUMNS = 12;

    public static boolean[][] bombGrid;

    public static int[][] bombCount;

    public static boolean[][] revealedBox;

    public static boolean[][] flags;


    public static void createGrid() {

        bombGrid = new boolean[LINES][COLUMNS];
        bombCount = new int[LINES][COLUMNS];
        revealedBox = new boolean[LINES][COLUMNS];
        flags = new boolean[LINES][COLUMNS];
    }

    public static void displayGrid(){
        System.out.print("  ");
        for ( int j = 0; j < COLUMNS; j ++){
            System.out.print (j + " ");
        }
        System.out.println();

        for ( int i = 0; i < LINES; i++){
            System.out.print (i + " ");
            for ( int j = 0; j < COLUMNS; j++){
                if (flags[i][j]){
                    System.out.print ("F ");
                } else if (!revealedBox[i][j]) {
                    System.out.print ("¤ ");
                } else if (bombGrid[i][j]) {
                    System.out.print ("X ");
                }
                else{
                    System.out.print (bombCount[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void placeBombs(){
        int numberPlantedBomb = 0;
        Random rand = new Random();

        while (numberPlantedBomb < 9 ){
            int randomline = rand.nextInt(LINES);
            int randomColumns = rand.nextInt(COLUMNS);


            if (!bombGrid[randomline][randomColumns]){
                bombGrid[randomline][randomColumns] = true;
                numberPlantedBomb += 1;
                    }
                }
            }

    public static void displayBomb(){
        System.out.print("  ");
        for ( int j = 0; j < COLUMNS; j ++){
            System.out.print (j + " ");
        }
        System.out.println();

        for ( int i = 0; i < LINES; i++){
            System.out.print (i + " ");
            for ( int j = 0; j < COLUMNS; j++){
                if (bombGrid[i][j]) {
                    System.out.print ("X ");
                }
                else{
                    System.out.print ("¤ ");
                }
            }
            System.out.println();
        }

    }

    public static void main (String[]args){
        createGrid();
        placeBombs();
        displayBomb();
            }
        }
