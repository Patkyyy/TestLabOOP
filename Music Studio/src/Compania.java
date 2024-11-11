import java.util.Scanner;
public class Compania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti nr de angajati:");
        int nr = sc.nextInt();
        for (int i = 0; i < nr; i++) {
            Echipa.echipa[i] = null;
        }
        for (int i = 0; i < nr; i++) {

        }

        Echipa.echipa[0] = new Manager("Andrei", 35, 13, 200);
        Echipa.echipa[1] = new Developer("Rares", 22, 2, 50);
        Echipa.echipa[2] = new Developer("Alex", 25, 1, 50);
        Echipa.echipa[3] = new Developer("Andreea", 27, 4, 50);
        Echipa.echipa[4] = new Developer("Ana", 20, 0, 25);
        Echipa.echipa[5] = new TeamLeader("Bursuc", 32, 8, 150);
        Echipa.echipa[6] = new Developer("Banica", 34, 9, 150);

        System.out.println("Am afisat Angajatii firmei: ");
        for (int i = 0; i < nr; i++) {
            System.out.println(Echipa.echipa[i].toString());
            System.out.print("Salary: ");
            System.out.println(Echipa.echipa[i].getSalary(2));
            System.out.println();
        }
     /*
        for(int i = 0; i < nr; i++){
            System.out.println(Echipa.echipa[i].);
        }*/

        int[] salar = new int[nr];

        for(int i = 0; i < nr; i++){
            salar[i] = Echipa.echipa[i].getSalary(2);
        }

        for(int i = 0; i < nr; i++){
            for(int j = i+1; j < nr ; j++){
                if(salar[i] > salar[j]){
                    int aux = salar[i];
                    salar[i] = salar[j];
                    salar[j] = aux;
                }
            }
        }

    }


}