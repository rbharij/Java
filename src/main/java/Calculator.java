public class Calculator {
    public static int add(String input){

        if( input.isEmpty()) {
            return 0;
        } else if (input.contains("//")){
            char del = input.charAt(2);
            String result = new StringBuilder(14).append(del).append("|").append("//|\n").toString();
            return sum(input,result);
        } else if (input.contains(",")){
            return sum(input,",|\n");
        } else {
            if (input.contains("-")){
                //Do I need to Throw an Exception?

                return -1;
            }
            return ConvertToInteger(input);
        }


        }
        public static int ConvertToInteger(String value){
            return Integer.parseInt(value);
        }

        public static int sum(String input, String delimiter){
            String[] values = input.split(delimiter);
            int sum = 0;
            for (int i=0;i < values.length;i++) {
                if (values[i].isEmpty()) {

                }else if (ConvertToInteger(values[i]) < 1000){
                    sum = sum + ConvertToInteger(values[i]);
                }
            }
            return sum;
        }
    }
