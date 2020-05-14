public class Ex3_Order_Switch {
    static final char CORP = 'C';
        static final char PRIVATE = 'P';
        static final char NONPROFIT = 'N';
        String name;
        double total;
        String stateCode;
        double discount;
        char custType;
    
        public Ex3_Order_Switch(String name, double total, String state, char custType) {
            this.name = name;
            this.total = total;
            this.stateCode = state;
            this.custType = custType;
            calcDiscount();
        }

        public Ex3_Order_Switch(String name, double total, String state) {
            this.name = name;
            this.total = total;
            this.stateCode = state;
            calcDiscount();
        }
        
        public String getDiscount(){
            return Double.toString(discount) + "%";
        }
    
        // Code the calcDiscount method.
        public void calcDiscount() {
            switch (custType) {
                case 'N':
                    if (total > 900) {
                        discount = 10;
                    } else discount = 8;
                    break;
                case 'P':
                    if (total > 900) {
                        discount = 7;
                    }
                    break;
                case 'C':
                    if (total > 500) {
                        discount = 8;
                    } else discount = 5;
                    break;
            }
        }
}