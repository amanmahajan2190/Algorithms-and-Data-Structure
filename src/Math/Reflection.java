package Math;

import java.util.HashSet;

/**
 * Created by AMAN on 7/3/2016.
 */
public class Reflection {
    HashSet<String> pointsSet = new HashSet<String>();
    public boolean isReflected(int[][] points) {
        if(points.length<=1){
            return false;
        }
        for(int[] p : points){
            String point = p[0]+""+p[1];
            if(pointsSet.contains(point)){
                return true;
            }else{
                pointsSet.add(returnReflection(p[0],p[1]));
            }

        }
        return false;



    }

    public String returnReflection(int a , int b){
        a = -a;
        return a+""+b;

    }

    }

