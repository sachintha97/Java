import java.util.List;

public class TestSearch {
    public static void main(String[] args) {

        int[] numbers = {34, 46,67,87,54,54,54};
        int searchv = 55;

        List <Integer> indices = Search.linearSearch(numbers,searchv);

        if(indices.size()>0) {
            System.out.printf("The search value %d is found in the following index \n", searchv);

            for (int index : indices) {
                System.out.println(index);
            }
        }
            else{
                System.out.printf("The search value %d is not found in the following index \n", searchv);
        }


            //student search
        Student[] array =

    }
}
