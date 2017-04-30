package tugas.latianbab6;
public class se extends gaji{
    private int tunjangan, bonus;
    
    public se(){
        tunjangan = 5500000;
        bonus = 300000;
    }
    public int total(){
        return tunjangan + bonus + super.getGaji();
    }
    public int total2(){
        return tunjangan + bonus + super.getGaji() + super.getBonus();
    }
}
