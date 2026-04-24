public class ZeroToThousand {
    public static void main(String[] args) {
        for(int huns = 0; huns <= 9; huns++){
            // System.out.print();
            for(int tens = 0; tens <= 9; tens++){
                // System.out.print();
                for(int units = 0; units <= 9; units++){
                    System.out.printf("%d%d%d\n", huns,tens,units);
                }
            }
        }
    }
}
