package tugas.latianbab6;
public class main {
    public static void main(String[] args) {
        
        se a = new se();
        pm b = new pm();
        
        System.out.println("Gaji Software Engineer pokok : " + a.total());
        System.out.println("Gaji Software Engineer yang berkerja 5 tahun atau lebih : " + a.total2());
        System.out.println("Gaji Project Manager pokok : " + b.total());
        System.out.println("Gaji Project Manager yang bekerja 5 tahaun sampai kurang dari 10 tahun : " + b.total2());
        System.out.println("Gaji Project Manager yang bekerja lebih dari 10 tahun : " + b.total10());
    }
}
