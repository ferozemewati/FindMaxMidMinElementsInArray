
// Find Maximum element in array

public class FindMaxMidMinElementsInArray {
        public static void main(String[] args) {
            int arr[]={2,3,5,6,8,9,0};
            int max=arr[0];
            for (int i=0; i<arr.length; i++){
                if (arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println(max);
        }
    }


// Find Minimum element in array

public class FindMaxMidMinElementsInArray {
        public static void main(String[] args) {
            int arr[]={10,3,5,6,8,9};
            int min=arr[0];
            for (int i=0; i<arr.length; i++){
                if (arr[i]<min){
                    min=arr[i];
                }
            }
            System.out.println(min);
        }
    }


// Find Middle elements in an array

public class FindMaxMidMinElementsInArray {
        public static void main(String[] args) {

            int arr[] = {2, 3, 5, 6, 8, 9, 0};
            int length = arr.length;
            int aa = arr.length / 2;
            System.out.println(arr[aa]);
        }
    }

}
