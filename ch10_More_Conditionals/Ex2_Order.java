public class Ex2_Order {

        static final char CORP = 'C';
        static final char PRIVATE = 'P';
        static final char NONPROFIT = 'N';
        String name;
        double total;
        String stateCode;
        double discount;
        char custType;
    
        public Ex2_Order(String name, double total, String state, char custType) {
            this.name = name;
            this.total = total;
            this.stateCode = state;
            this.custType = custType;
            calcDiscount();
        }

        public Ex2_Order(String name, double total, String state) {
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
            if (custType == 'N') {
                if (total > 900) {
                    discount = 10;
                } else discount = 8;
            } else if (custType == 'P') {
                if (total > 900) {
                    discount = 7;
                }
            } else if (custType == 'C') {
                if (total > 500) {
                    discount = 8;
                } else discount = 5;
            }
        }
}