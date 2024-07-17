public class dna {
    private String dnaSeq;

    public dna(String seq) {
        this.dnaSeq = seq;
    }
    private boolean isProtein() {
        if (this.dnaSeq.contains("ATG") && (this.dnaSeq.contains("UAA")) || (this.dnaSeq.contains("UAG"))
                || (this.dnaSeq.contains("UGA"))) {
            if (this.dnaSeq.indexOf("ATG") == 0) {
                return true;
            }
        }
        return false;
    }

    public static String mutate(String dnaSeq, String codon, String mutation) {
        dnaSeq = dnaSeq.replace(codon, mutation);
        return dnaSeq;
    }

    public static void main(String[] args) {
        System.out.println("Hello worldss!");
        System.out.println("Hello again!3");
        String test = mutate("ATGUGG", "ATG", "AAA");
        System.out.println(test);
    }
}
