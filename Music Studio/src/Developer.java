public class Developer extends Angajati{

    public static int bonus_nivel = 100;
    public Developer(String s,int i, int j, int l){
        super(s,i,j,l);
    }


    public int getSalary(int nrOrelucrate){
        return tarifPerOra * nrOrelucrate + bonus_nivel ;
    }

    /*public String Task(String nume,String task, int nrTaskuri, int copy_nr,Developer dev){
        for(int i = 0; i < copy_nr; i++){
            if(Echipa.echipa[i] == dev){
                return  nume + " task: " + task + " ,rezolva" + nrTaskuri;
            }
        }
    }
*/
    public String toString(){
        return "Nume: " + nume + "\nVarsta: " + varsta + "\nAni Experienta: " + nrAnideExperienta + "\nTarif pe ora: " + tarifPerOra;
    }


}
