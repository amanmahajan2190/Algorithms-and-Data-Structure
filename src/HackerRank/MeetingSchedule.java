package HackerRank;

import java.util.*;

/**
 * Created by AMAN on 8/9/2016.
 */
class Slot{
    int start_hh;
    int start_mm;
    int end_hh;
    int end_mm;
    Slot(int s_h, int s_m , int e_h,int e_m){
        start_hh =s_h;
        start_mm =s_m;
        end_hh = e_h;
        end_mm =e_m;
    }
}

class SlotComparator implements Comparator<Slot>{

    @Override
    public int compare(Slot o1, Slot o2) {
        if(o1.start_hh >o2.start_hh){
            return 1;
        }else if(o1.start_hh ==o2.start_hh){
            if(o1.start_mm>o2.start_mm){
                return 1;
            }else if(o1.start_mm == o2.start_mm){
                return 0;
            }else{
                return -1;
            }
        }else if(o1.start_hh<o2.start_hh){
            return -1;
        }
        return 0;

    }
}

public class MeetingSchedule {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inital = scanner.nextLine();
        String[] inital_Array = inital.split("\\s+");
        int M = Integer.parseInt(inital_Array[0]);
        int N  = Integer.parseInt(inital_Array[1]);

        List<Slot> slotList = new ArrayList<Slot>();
        while(scanner.hasNextLine()){
            String slot_time = scanner.nextLine();
            String[] slot_array = slot_time.split("\\s+");
            Slot s = new Slot(Integer.parseInt(slot_array[0]),
                    Integer.parseInt(slot_array[1]),
                    Integer.parseInt(slot_array[2]),Integer.parseInt(slot_array[3]));
            slotList.add(s);
        }

        Collections.sort(slotList,new SlotComparator());

    }
}
