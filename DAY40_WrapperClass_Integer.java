public class wrapperclass_Integer {
    public static void main(String[] args) {
        int nilaiInt = 42;
        Integer nilaiobjek = Integer.valueOf(42);
        Integer nilaidariint = nilaiInt;
        int nilaiDariInteger = nilaiobjek;

        System.out.println("Nilai int: " + nilaiInt);
        System.out.println("Nilai Integer: " + nilaiobjek);
        System.out.println("Nilai dari int: " + nilaidariint);
        System.out.println("Nilai dari Integer: " + nilaiDariInteger);
    }
}


