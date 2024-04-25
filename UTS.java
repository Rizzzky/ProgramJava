public class Data<T, U, V> {
    private T nama;
    private U umur;
    private V alamat;

    public Data(T nama, U umur, V alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public T getNama() {
        return nama;
    }

    public void setNama(T nama) {
        this.nama = nama;
    }

    public U getUmur() {
        return umur;
    }

    public void setUmur(U umur) {
        this.umur = umur;
    }

    public V getAlamat() {
        return alamat;
    }

    public void setAlamat(V alamat) {
        this.alamat = alamat;
    }

    public static void main(String[] args) {
        // Membuat objek Data dengan tipe String, Integer, dan String
        Data<String, Integer, String> data1 = new Data<>("John", 25, "123 Main Street");
        
        // Menampilkan data
        System.out.println("Nama: " + data1.getNama());
        System.out.println("Umur: " + data1.getUmur());
        System.out.println("Alamat: " + data1.getAlamat());
    }
}
