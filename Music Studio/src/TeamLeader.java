public class TeamLeader extends Angajati {

    public static int bonus_nivel = 200;

    public TeamLeader(String s,int i, int j, int l){
        super(s,i,j,l);
    }

    public int getSalary(int nrOrelucrate){
        return tarifPerOra * nrOrelucrate + bonus_nivel ;
    }

    public String toString(){
        return "Nume: " + nume + "\nVarsta: " + varsta + "\nAni Experienta: " + nrAnideExperienta + "\nTarif pe ora: " + tarifPerOra;
    }


}
