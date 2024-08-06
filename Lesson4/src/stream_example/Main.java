package stream_example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public List<Integer> generateRandomArrayList() {

        List<Integer> numbersArrayList = new ArrayList<Integer>();
        Random generatorRandom = new Random();

        for (int i = 0; i < 20; i++) {
            numbersArrayList.add(generatorRandom.nextInt(255));
        }
        return numbersArrayList;
    }

    public void oldSort() {
        List<Integer> unsortedArrayList = generateRandomArrayList();
        System.out.println("Old Way");
        System.out.println(unsortedArrayList);
        Collections.sort(unsortedArrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer numbersOne, Integer numberstTwo) {
                return numbersOne.compareTo(numberstTwo);
            }
        });
        System.out.println(unsortedArrayList);
    }

    public void lambdaSort() {
        List<Integer> arrayListThe = generateRandomArrayList();
        System.out.println("Lambda Way");
        System.out.println(arrayListThe);
        arrayListThe.sort((stringX, stringY) -> stringX.compareTo(stringY));
        System.out.println(arrayListThe);
    }

    public void oldFilter() {
        List<Integer> unfilteredArrayList = generateRandomArrayList();
        System.out.println("Old Way");
        List<Integer> filteredArrayList = new ArrayList<Integer>();

        for (Integer unfilteredNumbers: unfilteredArrayList) {
            if (unfilteredNumbers > 50) {
                filteredArrayList.add(unfilteredNumbers);
            }
        }
        System.out.println(filteredArrayList);
    }

    public void lambdaFilter() {
        System.out.println("Lambda Way");
        List<Integer> unfilteredArrayList = generateRandomArrayList();
        List<Integer> filteredArrayList = unfilteredArrayList.stream().filter(stringX -> stringX > 50).collect(Collectors.toList());
        System.out.println(filteredArrayList);
    }

    public static void main(String[] args) {

        // Sorting Example
        Main instanceMain = new Main();
        instanceMain.oldSort();
        instanceMain.lambdaSort();

        // Filtering Example
        instanceMain.oldFilter();
        instanceMain.lambdaFilter();

    }
}
