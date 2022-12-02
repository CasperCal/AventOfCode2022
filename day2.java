class Scratch {
    public static void main(String[] args) {

    String[] splitInut = input.split("\n");
        int result = 0;

        for (int i = 0; i < splitInut.length; i++) {
            result += calculatePointsForRound(splitInut[i]);
        }
        System.out.println(result);
    }

        //calculate points round 1
        private static int calculatePointsForRound (String splitInput){
            int tempResult =  0;
            if (splitInput.contains("X"))
                tempResult = 1;
            if (splitInput.contains("Y"))
                tempResult = 2;
            if (splitInput.contains("Z"))
                tempResult = 3;
            String[] charInput = splitInput.split(" ");
            if (charInput[0].equals("A")) {
                if (charInput[1].equals("X")) {tempResult += 3;}
                if (charInput[1].equals("Y")) {tempResult += 6;}
                if (charInput[1].equals("Z")) {tempResult += 0;}
            }
            if (charInput[0].equals("B")) {
                if (charInput[1].equals("X")) {tempResult += 0;}
                if (charInput[1].equals("Y")) {tempResult += 3;}
                if (charInput[1].equals("Z")) {tempResult += 6;}
            }
            if (charInput[0].equals("C")) {
                if (charInput[1].equals("X")) {tempResult += 6;}
                if (charInput[1].equals("Y")) {tempResult += 0;}
                if (charInput[1].equals("Z")) {tempResult += 3;}
            }
            return tempResult;
        }
    
    //calculate points round 2 
    private static int calculatePointsForRound (String splitInput){
            int tempResult =  0;
            if (splitInput.contains("X"))
                tempResult = 0;
            if (splitInput.contains("Y"))
                tempResult = 3;
            if (splitInput.contains("Z"))
                tempResult = 6;
            String[] charInput = splitInput.split(" ");
            if (charInput[0].equals("A")) {
                if (charInput[1].equals("X")) {tempResult += 3;}
                if (charInput[1].equals("Y")) {tempResult += 1;}
                if (charInput[1].equals("Z")) {tempResult += 2;}
            }
            if (charInput[0].equals("B")) {
                if (charInput[1].equals("X")) {tempResult += 1;}
                if (charInput[1].equals("Y")) {tempResult += 2;}
                if (charInput[1].equals("Z")) {tempResult += 3;}
            }
            if (charInput[0].equals("C")) {
                if (charInput[1].equals("X")) {tempResult += 2;}
                if (charInput[1].equals("Y")) {tempResult += 3;}
                if (charInput[1].equals("Z")) {tempResult += 1;}
            }
            return tempResult;
        }
    }
}
