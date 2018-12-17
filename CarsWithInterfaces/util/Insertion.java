package hw01.util;

import hw01.controller.VehicleList;
import hw01.model.CVehicle;

public class Insertion {

    public static void SortByPrice(VehicleList arr) {

        int i, key, j;
        for (i = 1; i < arr.size(); i++) {
            key = arr.get(i).getPrice();                                    // current elements to swing back
            CVehicle temp = arr.get(i);
            j = i - 1;                                                      // counter
            while (j >= 0 && arr.get(j).getPrice() > key) {                 // will swing key el towards the beginning of an array
                arr.update(j + 1, arr.get(j));                           // until it reaches the one that is bigger than it
                j--;                                                        // we can do this because the left side of an array
            }                                                               // is already sorted
            arr.update(j + 1, temp);                                     // next iteration
        }
    }
    public static void SortByYear(VehicleList arr) {

        int i, key, j;
        for (i = 1; i < arr.size(); i++) {
            key = arr.get(i).getReleaseYear();
            CVehicle temp = arr.get(i);
            j = i - 1;
            while (j >= 0 && arr.get(j).getReleaseYear() > key) {
                arr.update(j + 1, arr.get(j));
                j--;
            }
            arr.update(j + 1, temp);
        }
    }
}
