package Solution;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/29
 * TIME:17:03
 */
public class Car {
    class data{
        int position;
        int speed;

        public data(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
    }


    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length==0){
            return 0;
        }
        data[] datas=new data[position.length];
        for(int i=0;i<datas.length;i++){
            datas[i]=new data(position[i],speed[i]);
        }
        Arrays.sort(datas, Comparator.comparingInt(o->o.position));//按照position从小到大排序
        int carfleet=1;
        data frontCar=datas[position.length-1];
        for(int i=position.length-2;i>=0;i--){
            if(!isMeet(datas[i],frontCar,target)){
                carfleet++;
                frontCar=datas[i];
            }
        }
        return carfleet;
    }

    private boolean isMeet(data data, data frontCar, int target) {
        if(data.speed<=frontCar.speed){
            return false;
        }
        double t=(frontCar.position-data.position)*(1.0)/(data.speed-frontCar.speed);
        if(data.speed*t+data.position<=target){
            return true;
        }
        return false;
    }
}
