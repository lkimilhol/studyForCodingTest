package com.company.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class TruckPassingThroughBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int thoughTruck = truck_weights.length;
        int truckIndex = 0;
        int currentWeight = 0;

        Queue<Truck> bridge = new LinkedList<>();

        while (thoughTruck > 0) {
            if (truck_weights[truckIndex] != 0 && currentWeight + truck_weights[truckIndex] <= weight) {
                Truck truck = new Truck(truck_weights[truckIndex]);
                bridge.add(truck);
                currentWeight += truck_weights[truckIndex];
                truckIndex = Math.min(++truckIndex, truck_weights.length - 1);
            }

            progress(bridge);
            answer++;

            int thoughTruckWeight = getThroughTruck(bridge, bridge_length);

            if (thoughTruckWeight > 0) {
                currentWeight -= thoughTruckWeight;
                thoughTruck--;
            }
        }
        return ++answer;
    }

    private int getThroughTruck(Queue<Truck> bridge, int bridge_length) {
        for (Truck truck : bridge) {
            if (truck.getSec() == bridge_length) {
                bridge.remove(truck);
                return truck.getWeight();
            }
        }
        return 0;
    }

    private void progress(Queue<Truck> bridge) {
        bridge.forEach(Truck::progress);
    }
}

class Truck {
    int weight;
    int sec;

    Truck(int weight) {
        this.weight = weight;
        this.sec = 0;
    }

    public int getWeight() {
        return weight;
    }

    public int getSec() {
        return sec;
    }

    public void progress() {
        this.sec++;
    }
}
