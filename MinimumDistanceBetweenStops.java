public class MinimumDistanceBetweenStops {
    public static void main(String[] args) {
        int[] distance = {1,2,3,4};
        int start = 0;
        int destination = 2;
        findMinimumBusStopDistance(distance,start,destination);
    }
    public static void findMinimumBusStopDistance(int[] distance,int start,int destination){
        int totalDistance = 0,clockwise=0;
        for(int dist:distance){
            totalDistance=totalDistance+dist;
        }
        for(int i=start;i<destination;i++){
            clockwise=clockwise+distance[i];
        }
        int counterclockwiseDistance = totalDistance - clockwise;
        System.out.println(Math.min(counterclockwiseDistance,clockwise));
    }
}
