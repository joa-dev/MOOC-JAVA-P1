
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joa-dev
 */
public class Statistics {

    private ArrayList<Integer> points;
    private Scanner scan;

    public Statistics() {
        this.points = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }

    public void reader() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            if (input == -1) {
                break;
            } else if (input >= 0 && input <= 100) {
                this.points.add(input);
            } else {
                continue;
            }
        }
    }

    public double averageAll() {
        double sum = 0;
        for (Integer point : points) {
            sum += point;
        }
        return sum / points.size();
    }

    public double averagePassing() {
        double sum = 0;
        int passingPoints = 0;
        for (Integer point : points) {
            if (point >= 50) {
                sum += point;
                passingPoints++;
            }
        }
        return sum / passingPoints;
    }

    public double passPercentage() {
        double passing = 0;
        for (Integer point : points) {
            if (point >= 50) {
                passing++;
            }
        }
        return 100 * passing / points.size();
    }

    public String gradeDist() {
        ArrayList<String> grades = new ArrayList<String>();
        grades.add("0: ");//grade0
        grades.add("1: ");//grade1
        grades.add("2: ");//grade2
        grades.add("3: ");//grade3
        grades.add("4: ");//grade4
        grades.add("5: ");//grade5
        for (Integer point : points) {
            if (point < 50) {
                grades.set(0, grades.get(0) + "*");
            } else if (point < 60) {
                grades.set(1, grades.get(1) + "*");
            } else if (point < 70) {
                grades.set(2, grades.get(2) + "*");
            } else if (point < 80) {
                grades.set(3, grades.get(3) + "*");
            } else if (point < 90) {
                grades.set(4, grades.get(4) + "*");
            } else if (point >= 90) {
                grades.set(5, grades.get(5) + "*");
            }
        }
        
        String gradesToString = "";
        
        for (int i = 5; i >= 0; i--) {
            gradesToString += grades.get(i) + "\n";
        }
        
        return gradesToString;
    }
}
