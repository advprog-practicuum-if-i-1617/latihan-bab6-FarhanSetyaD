package tugas.latianbab6;
public class pm extends gaji{
    private int tunjangan, bonus, bonus10, bonus2;
    
    public pm(){
    tunjangan = 6000000;
    bonus = 450000;
    bonus10 = 700000;
    bonus2 = 225000;
    }
    public int total(){
        return tunjangan + bonus + bonus2 + super.getGaji();
    }
    public int total10(){
        return tunjangan + bonus + bonus10 + super.getGaji() + super.getBonus();
    }
    public int total2(){
        return tunjangan + bonus + bonus2 + super.getGaji() + super.getBonus();
    }
}
