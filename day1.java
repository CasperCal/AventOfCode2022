class Scratch {
    public static void main(String[] args) {

        String[] splitInut = input.split("\n\n");
        int[] result = new int[splitInut.length];
        int max = 0;

        for (int i = 0; i < splitInut.length; i++) {
            String[] tempSplit = splitInut[i].split("\n");
            for (int j = 0; j < tempSplit.length; j++) {
                result[i] += Integer.parseInt(tempSplit[j]);
            }
        }
        result = Arrays.stream(result).sorted().toArray();
        //awnser to question 1
        System.out.println(result[result.length - 1]);
        //awnser to question 2
        System.out.println(result[result.length - 1] + result[result.length - 2] + result[result.length - 3]);
    }

}
