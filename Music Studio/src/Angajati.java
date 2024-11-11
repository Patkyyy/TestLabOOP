public abstract class Angajati {
        public String nume;
        public int varsta;
        public int nrAnideExperienta;
        public int tarifPerOra;


        public Angajati(String nume,int varsta,int nrAnideExperienta,int tarifPerOra){
            this.nume = nume;
            this.varsta = varsta;
            this.nrAnideExperienta = nrAnideExperienta;
            this.tarifPerOra = tarifPerOra;
        }


    public abstract int getSalary(int nrOrelucrate);

}
